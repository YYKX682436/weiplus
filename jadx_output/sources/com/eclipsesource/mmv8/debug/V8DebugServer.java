package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class V8DebugServer {
    private static final java.lang.String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static java.lang.String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final java.lang.String HEADER_EMBEDDING_HOST = "Embedding-Host: ";
    private static final java.lang.String HEADER_PROTOCOL_VERSION = "Protocol-Version: ";
    private static final java.lang.String HEADER_TYPE = "Type: ";
    private static final java.lang.String HEADER_V8_VERSION = "V8-Version: ";
    private static final java.lang.String J2V8_VERSION = "4.0.0";
    private static final java.lang.String MAKE_BREAK_EVENT = "__j2v8_MakeBreakEvent";
    private static final java.lang.String MAKE_COMPILE_EVENT = "__j2v8_MakeCompileEvent";
    private static final int PROTOCOL_BUFFER_SIZE = 4096;
    private static final java.nio.charset.Charset PROTOCOL_CHARSET;
    private static final byte[] PROTOCOL_CONTENT_LENGTH_BYTES;
    private static final java.lang.String PROTOCOL_CONTENT_LENGTH_HEADER = "Content-Length:";
    private static final java.lang.String PROTOCOL_EOL = "\r\n";
    private static final byte[] PROTOCOL_EOL_BYTES;
    private static final java.lang.String PROTOCOL_VERSION = "1";
    private static final java.lang.String SET_LISTENER = "setListener";
    private static final java.lang.String V8_DEBUG_OBJECT = "Debug";
    private static final java.lang.String V8_VERSION = "4.10.253";
    private java.net.Socket client;
    private com.eclipsesource.mmv8.V8Object debugObject;
    private com.eclipsesource.mmv8.V8Object runningStateDcp;
    private com.eclipsesource.mmv8.V8 runtime;
    private java.net.ServerSocket server;
    private com.eclipsesource.mmv8.V8Object stoppedStateDcp;
    private boolean waitForConnection;
    private java.lang.Object clientLock = new java.lang.Object();
    private boolean traceCommunication = false;
    private java.util.List<java.lang.String> requests = new java.util.LinkedList();

    /* loaded from: classes7.dex */
    public class ClientLoop implements java.lang.Runnable {
        private int from;

        private ClientLoop() {
        }

        private int indexOf(byte[] bArr, byte[] bArr2, int i17, int i18) {
            int i19;
            int length = bArr.length;
            while (i17 < i18) {
                while (i19 <= length) {
                    if (i19 == length) {
                        return i17;
                    }
                    int i27 = i17 + i19;
                    i19 = (i27 < i18 && bArr2[i27] == bArr[i19]) ? i19 + 1 : 0;
                    i17++;
                }
                i17++;
            }
            return -1;
        }

        private byte[] join(byte[] bArr, byte[] bArr2, int i17, int i18) {
            byte[] bArr3 = new byte[bArr.length + i18];
            java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            java.lang.System.arraycopy(bArr2, i17, bArr3, bArr.length, i18);
            return bArr3;
        }

        private void processClientRequests() {
            java.io.InputStream inputStream;
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[4096];
            synchronized (com.eclipsesource.mmv8.debug.V8DebugServer.this.clientLock) {
                inputStream = com.eclipsesource.mmv8.debug.V8DebugServer.this.client.getInputStream();
            }
            int i17 = 0;
            boolean z17 = false;
            byte[] bArr3 = bArr;
            int i18 = -1;
            while (true) {
                int read = inputStream.read(bArr2, i17, 4096 - i17);
                if (read <= 0) {
                    return;
                }
                int i19 = read + i17;
                this.from = 0;
                do {
                    if (i18 < 0) {
                        i18 = readContentLength(bArr2, i19);
                        if (i18 < 0) {
                            break;
                        }
                    }
                    if (!z17 && !(z17 = skipToolInfo(bArr2, i19))) {
                        break;
                    }
                    int min = java.lang.Math.min(i18 - bArr3.length, i19 - this.from);
                    bArr3 = join(bArr3, bArr2, this.from, min);
                    this.from += min;
                    if (bArr3.length == i18) {
                        java.lang.String str = new java.lang.String(bArr3, com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_CHARSET);
                        synchronized (com.eclipsesource.mmv8.debug.V8DebugServer.this.requests) {
                            com.eclipsesource.mmv8.debug.V8DebugServer.this.requests.add(str);
                        }
                        z17 = false;
                        bArr3 = bArr;
                        i18 = -1;
                    }
                } while (this.from < i19);
                int i27 = this.from;
                if (i27 < i19) {
                    java.lang.System.arraycopy(bArr2, i27, bArr2, 0, i19 - i27);
                    i17 = i19 - this.from;
                } else {
                    i17 = 0;
                }
            }
        }

        private int readContentLength(byte[] bArr, int i17) {
            int length;
            int indexOf;
            int indexOf2 = indexOf(com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES, bArr, this.from, i17);
            if (indexOf2 < 0 || (indexOf = indexOf(com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_EOL_BYTES, bArr, (length = indexOf2 + com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES.length), i17)) < 0) {
                return -1;
            }
            java.lang.String str = new java.lang.String(bArr, length, indexOf - length, com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_CHARSET);
            try {
                int parseInt = java.lang.Integer.parseInt(str.trim());
                this.from = indexOf + com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_EOL_BYTES.length;
                return parseInt;
            } catch (java.lang.Exception unused) {
                throw new java.io.IOException("Invalid content length header: '" + str + "' in message" + new java.lang.String(bArr, com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_CHARSET));
            }
        }

        private boolean skipToolInfo(byte[] bArr, int i17) {
            int indexOf = indexOf(com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_EOL_BYTES, bArr, this.from, i17);
            if (indexOf < 0) {
                return false;
            }
            this.from = indexOf + com.eclipsesource.mmv8.debug.V8DebugServer.PROTOCOL_EOL_BYTES.length;
            return true;
        }

        private void startHandshake() {
            com.eclipsesource.mmv8.debug.V8DebugServer.this.sendMessage("V8-Version: 4.10.253\r\nProtocol-Version: 1\r\nEmbedding-Host: j2v8 4.0.0\r\nType: connect\r\n", "");
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    java.net.Socket accept = com.eclipsesource.mmv8.debug.V8DebugServer.this.server.accept();
                    accept.setTcpNoDelay(true);
                    synchronized (com.eclipsesource.mmv8.debug.V8DebugServer.this.clientLock) {
                        com.eclipsesource.mmv8.debug.V8DebugServer.this.client = accept;
                        com.eclipsesource.mmv8.debug.V8DebugServer.this.waitForConnection = false;
                        com.eclipsesource.mmv8.debug.V8DebugServer.this.clientLock.notifyAll();
                    }
                    startHandshake();
                    processClientRequests();
                } catch (java.lang.Exception e17) {
                    synchronized (com.eclipsesource.mmv8.debug.V8DebugServer.this.clientLock) {
                        if (com.eclipsesource.mmv8.debug.V8DebugServer.this.client != null) {
                            try {
                                com.eclipsesource.mmv8.debug.V8DebugServer.this.client.close();
                            } catch (java.io.IOException unused) {
                            }
                            com.eclipsesource.mmv8.debug.V8DebugServer.this.client = null;
                        }
                        com.eclipsesource.mmv8.debug.V8DebugServer.this.logError(e17);
                    }
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class EventHandler implements com.eclipsesource.mmv8.JavaVoidCallback {
        private EventHandler() {
        }

        private void safeRelease(com.eclipsesource.mmv8.Releasable releasable) {
            if (releasable != null) {
                releasable.release();
            }
        }

        @Override // com.eclipsesource.mmv8.JavaVoidCallback
        public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
            com.eclipsesource.mmv8.Releasable releasable;
            int integer;
            com.eclipsesource.mmv8.V8Object object;
            if (v8Array == null || v8Array.isUndefined()) {
                return;
            }
            com.eclipsesource.mmv8.V8Object v8Object2 = null;
            try {
                integer = v8Array.getInteger(0);
                object = v8Array.getObject(1);
            } catch (java.lang.Exception e17) {
                e = e17;
                releasable = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                releasable = null;
            }
            try {
                com.eclipsesource.mmv8.V8Object object2 = v8Array.getObject(2);
                if (com.eclipsesource.mmv8.debug.V8DebugServer.this.traceCommunication) {
                    java.lang.String str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                    switch (integer) {
                        case 1:
                            str = "Break";
                            break;
                        case 2:
                            str = "Exception";
                            break;
                        case 3:
                            str = "NewFunction";
                            break;
                        case 4:
                            str = "BeforeCompile";
                            break;
                        case 5:
                            str = "AfterCompile";
                            break;
                        case 6:
                            str = "CompileError";
                            break;
                        case 7:
                            str = "PromiseEvent";
                            break;
                        case 8:
                            str = "AsyncTaskEvent";
                            break;
                    }
                    java.lang.System.out.println("V8 has emmitted an event of type ".concat(str));
                }
                if (!com.eclipsesource.mmv8.debug.V8DebugServer.this.isConnected()) {
                    safeRelease(object);
                    safeRelease(object2);
                    return;
                }
                if (integer == 1) {
                    com.eclipsesource.mmv8.debug.V8DebugServer.this.enterBreakLoop(object, object2);
                } else if (integer == 5 || integer == 6) {
                    com.eclipsesource.mmv8.debug.V8DebugServer.this.sendCompileEvent(object2);
                }
                safeRelease(object);
                safeRelease(object2);
            } catch (java.lang.Exception e18) {
                e = e18;
                releasable = null;
                v8Object2 = object;
                try {
                    com.eclipsesource.mmv8.debug.V8DebugServer.this.logError(e);
                    safeRelease(v8Object2);
                    safeRelease(releasable);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    safeRelease(v8Object2);
                    safeRelease(releasable);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                releasable = null;
                v8Object2 = object;
                safeRelease(v8Object2);
                safeRelease(releasable);
                throw th;
            }
        }
    }

    static {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
        PROTOCOL_CHARSET = forName;
        PROTOCOL_EOL_BYTES = "\r\n".getBytes(forName);
        PROTOCOL_CONTENT_LENGTH_BYTES = PROTOCOL_CONTENT_LENGTH_HEADER.getBytes(forName);
    }

    public V8DebugServer(com.eclipsesource.mmv8.V8 v86, int i17, boolean z17) {
        this.runtime = v86;
        this.waitForConnection = z17;
        com.eclipsesource.mmv8.V8Object object = v86.getObject(DEBUG_OBJECT_NAME);
        if (object == null) {
            java.lang.System.err.println("Cannot initialize debugger server - global debug object not found.");
            return;
        }
        try {
            this.debugObject = object.getObject(V8_DEBUG_OBJECT);
            object.release();
            v86.executeVoidScript("(function() {\n " + DEBUG_OBJECT_NAME + ".Debug. __j2v8_MakeBreakEvent = function (break_id,breakpoints_hit) {\n  return new " + DEBUG_OBJECT_NAME + ".BreakEvent(break_id,breakpoints_hit);\n }\n " + DEBUG_OBJECT_NAME + ".Debug. __j2v8_MakeCompileEvent = function(script,type) {\n  var scripts = " + DEBUG_OBJECT_NAME + ".Debug.scripts()\n  for (var i in scripts) {\n   if (scripts[i].id == script.id()) {\n     return new " + DEBUG_OBJECT_NAME + ".CompileEvent(scripts[i], type);\n   }\n  }\n  return {toJSONProtocol: function() {return ''}}\n }\n})()");
            try {
                this.server = new java.net.ServerSocket(i17);
            } catch (java.lang.Exception e17) {
                logError(e17);
            }
        } catch (java.lang.Throwable th6) {
            object.release();
            throw th6;
        }
    }

    public static void configureV8ForDebugging() {
        try {
            com.eclipsesource.mmv8.V8.setFlags("-expose-debug-as=" + DEBUG_OBJECT_NAME);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterBreakLoop(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Object v8Object2) {
        com.eclipsesource.mmv8.V8Object v8Object3;
        try {
            com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
            try {
                v8Array.push(false);
                this.stoppedStateDcp = v8Object.executeObjectFunction("debugCommandProcessor", v8Array);
                v8Array.release();
                int integer = v8Object.getInteger("break_id");
                com.eclipsesource.mmv8.V8Array array = v8Object2.getArray("break_points_hit_");
                com.eclipsesource.mmv8.V8Array v8Array2 = new com.eclipsesource.mmv8.V8Array(this.runtime);
                try {
                    v8Array2.push(integer);
                    v8Array2.push((com.eclipsesource.mmv8.V8Value) array);
                    v8Object3 = this.debugObject.executeObjectFunction(MAKE_BREAK_EVENT, v8Array2);
                    try {
                        java.lang.String executeStringFunction = v8Object3.executeStringFunction("toJSONProtocol", null);
                        if (this.traceCommunication) {
                            java.lang.System.out.println("Sending event (Break):\n" + executeStringFunction);
                        }
                        sendJson(executeStringFunction);
                        v8Array2.release();
                        array.release();
                        v8Object3.release();
                        while (isConnected() && !this.stoppedStateDcp.executeBooleanFunction("isRunning", null)) {
                            try {
                                processRequests(10L);
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        v8Array2.release();
                        array.release();
                        if (v8Object3 != null) {
                            v8Object3.release();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    v8Object3 = null;
                }
            } catch (java.lang.Throwable th8) {
                v8Array.release();
                throw th8;
            }
        } finally {
            this.stoppedStateDcp.release();
            this.stoppedStateDcp = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        boolean z17;
        java.net.Socket socket;
        synchronized (this.clientLock) {
            z17 = (this.server == null || (socket = this.client) == null || !socket.isConnected()) ? false : true;
        }
        return z17;
    }

    private void processRequest(java.lang.String str) {
        if (this.traceCommunication) {
            java.lang.System.out.println("Got message: \n" + str.substring(0, java.lang.Math.min(str.length(), 1000)));
        }
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(str);
        com.eclipsesource.mmv8.V8Object v8Object = this.stoppedStateDcp;
        if (v8Object == null) {
            v8Object = this.runningStateDcp;
        }
        java.lang.String obj = v8Object.executeFunction("processDebugJSONRequest", v8Array).toString();
        if (this.stoppedStateDcp == null && obj.contains("\"running\":false")) {
            obj = obj.replace("\"running\":false", "\"running\":true").replace("\"success\":true", "\"success\":false").replace("{\"", "{\"message\":\"Client requested suspension is not supported on J2V8.\",\"");
            v8Object.add("running_", true);
        }
        if (this.traceCommunication) {
            java.lang.System.out.println("Returning response: \n" + obj.substring(0, java.lang.Math.min(obj.length(), 1000)));
        }
        sendJson(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCompileEvent(com.eclipsesource.mmv8.V8Object v8Object) {
        if (!isConnected()) {
            return;
        }
        int integer = v8Object.getInteger("type_");
        com.eclipsesource.mmv8.V8Object object = v8Object.getObject("script_");
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        com.eclipsesource.mmv8.V8Object v8Object2 = null;
        try {
            v8Array.push((com.eclipsesource.mmv8.V8Value) object);
            v8Array.push(integer);
            com.eclipsesource.mmv8.V8Object executeObjectFunction = this.debugObject.executeObjectFunction(MAKE_COMPILE_EVENT, v8Array);
            try {
                java.lang.String executeStringFunction = executeObjectFunction.executeStringFunction("toJSONProtocol", null);
                if (this.traceCommunication) {
                    java.lang.System.out.println("Sending event (CompileEvent):\n" + executeStringFunction.substring(0, java.lang.Math.min(executeStringFunction.length(), 1000)));
                }
                if (executeStringFunction.length() > 0) {
                    sendJson(executeStringFunction);
                }
                v8Array.release();
                object.release();
                executeObjectFunction.release();
            } catch (java.lang.Throwable th6) {
                th = th6;
                v8Object2 = executeObjectFunction;
                v8Array.release();
                object.release();
                if (v8Object2 != null) {
                    v8Object2.release();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private void sendJson(java.lang.String str) {
        sendMessage("", str.replace("\\/", "/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessage(java.lang.String str, java.lang.String str2) {
        synchronized (this.clientLock) {
            if (!isConnected()) {
                throw new java.io.IOException("There is no connected client.");
            }
            java.nio.charset.Charset charset = PROTOCOL_CHARSET;
            byte[] bytes = str2.getBytes(charset);
            this.client.getOutputStream().write((str + PROTOCOL_CONTENT_LENGTH_HEADER + java.lang.Integer.toString(bytes.length) + "\r\n\r\n").getBytes(charset));
            if (bytes.length > 0) {
                this.client.getOutputStream().write(bytes);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.eclipsesource.mmv8.debug.V8DebugServer$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.eclipsesource.mmv8.V8Value] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private void setupEventHandler() {
        com.eclipsesource.mmv8.V8Array v8Array;
        com.eclipsesource.mmv8.V8Function v8Function;
        ?? r17 = 0;
        com.eclipsesource.mmv8.V8Array v8Array2 = null;
        this.debugObject.registerJavaMethod(new com.eclipsesource.mmv8.debug.V8DebugServer.EventHandler(), DEBUG_BREAK_HANDLER);
        try {
            v8Function = (com.eclipsesource.mmv8.V8Function) this.debugObject.getObject(DEBUG_BREAK_HANDLER);
        } catch (java.lang.Throwable th6) {
            th = th6;
            v8Array = null;
        }
        try {
            v8Array2 = new com.eclipsesource.mmv8.V8Array(this.runtime).push((com.eclipsesource.mmv8.V8Value) v8Function);
            this.debugObject.executeFunction(SET_LISTENER, v8Array2);
            if (v8Function != null && !v8Function.isReleased()) {
                v8Function.release();
            }
            if (v8Array2 == null || v8Array2.isReleased()) {
                return;
            }
            v8Array2.release();
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.eclipsesource.mmv8.V8Array v8Array3 = v8Array2;
            r17 = v8Function;
            v8Array = v8Array3;
            if (r17 != 0 && !r17.isReleased()) {
                r17.release();
            }
            if (v8Array != null && !v8Array.isReleased()) {
                v8Array.release();
            }
            throw th;
        }
    }

    public int getPort() {
        java.net.ServerSocket serverSocket = this.server;
        if (serverSocket == null || !serverSocket.isBound()) {
            return -1;
        }
        return this.server.getLocalPort();
    }

    public void logError(java.lang.Throwable th6) {
        th6.getClass();
    }

    public void processRequests(long j17) {
        java.lang.String[] strArr;
        if (this.server == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            synchronized (this.requests) {
                java.util.List<java.lang.String> list = this.requests;
                strArr = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
                this.requests.clear();
            }
            for (java.lang.String str : strArr) {
                try {
                    processRequest(str);
                } catch (java.lang.Exception e17) {
                    logError(e17);
                }
            }
            if (strArr.length <= 0) {
                if (j17 > 0) {
                    java.lang.Thread.sleep(10L);
                }
                if (j17 <= 0 || currentTimeMillis + j17 <= java.lang.System.currentTimeMillis()) {
                    return;
                }
            }
        }
    }

    public void setTraceCommunication(boolean z17) {
        this.traceCommunication = z17;
    }

    public void start() {
        if (this.server == null) {
            return;
        }
        boolean z17 = this.waitForConnection;
        java.lang.Thread thread = new java.lang.Thread(new com.eclipsesource.mmv8.debug.V8DebugServer.ClientLoop(), "J2V8 Debugger Server");
        thread.setDaemon(true);
        thread.start();
        setupEventHandler();
        this.runningStateDcp = this.runtime.executeObjectScript("(function() {return new " + DEBUG_OBJECT_NAME + ".DebugCommandProcessor(null, true)})()");
        if (z17) {
            synchronized (this.clientLock) {
                while (this.waitForConnection) {
                    try {
                        this.clientLock.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            try {
                processRequests(100L);
            } catch (java.lang.InterruptedException unused2) {
            }
        }
    }

    public void stop() {
        try {
            this.server.close();
            synchronized (this.clientLock) {
                java.net.Socket socket = this.client;
                if (socket != null) {
                    socket.close();
                    this.client = null;
                }
            }
        } catch (java.io.IOException e17) {
            logError(e17);
        }
        com.eclipsesource.mmv8.V8Object v8Object = this.runningStateDcp;
        if (v8Object != null) {
            v8Object.release();
            this.runningStateDcp = null;
        }
        com.eclipsesource.mmv8.V8Object v8Object2 = this.debugObject;
        if (v8Object2 != null) {
            v8Object2.release();
            this.debugObject = null;
        }
        com.eclipsesource.mmv8.V8Object v8Object3 = this.stoppedStateDcp;
        if (v8Object3 != null) {
            v8Object3.release();
            this.stoppedStateDcp = null;
        }
    }
}
