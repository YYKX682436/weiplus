package com.p159x477cd522.p160x333422.p161x5b09653;

/* renamed from: com.eclipsesource.mmv8.debug.V8DebugServer */
/* loaded from: classes7.dex */
public class C1498xd4be6b74 {

    /* renamed from: DEBUG_BREAK_HANDLER */
    private static final java.lang.String f4907x78a1b6be = "__j2v8_debug_handler";

    /* renamed from: DEBUG_OBJECT_NAME */
    public static java.lang.String f4908x99db8b7f = "__j2v8_Debug";

    /* renamed from: HEADER_EMBEDDING_HOST */
    private static final java.lang.String f4909xfcc645a2 = "Embedding-Host: ";

    /* renamed from: HEADER_PROTOCOL_VERSION */
    private static final java.lang.String f4910xf5c68d83 = "Protocol-Version: ";

    /* renamed from: HEADER_TYPE */
    private static final java.lang.String f4911xc8ab79ac = "Type: ";

    /* renamed from: HEADER_V8_VERSION */
    private static final java.lang.String f4912x98c16d0d = "V8-Version: ";

    /* renamed from: J2V8_VERSION */
    private static final java.lang.String f4913x99f94f43 = "4.0.0";

    /* renamed from: MAKE_BREAK_EVENT */
    private static final java.lang.String f4914x186bc249 = "__j2v8_MakeBreakEvent";

    /* renamed from: MAKE_COMPILE_EVENT */
    private static final java.lang.String f4915xac8580bd = "__j2v8_MakeCompileEvent";

    /* renamed from: PROTOCOL_BUFFER_SIZE */
    private static final int f4916x2699e979 = 4096;

    /* renamed from: PROTOCOL_CHARSET */
    private static final java.nio.charset.Charset f4917xde5cfa85;

    /* renamed from: PROTOCOL_CONTENT_LENGTH_BYTES */
    private static final byte[] f4918x6c4c031f;

    /* renamed from: PROTOCOL_CONTENT_LENGTH_HEADER */
    private static final java.lang.String f4919x264ef639 = "Content-Length:";

    /* renamed from: PROTOCOL_EOL */
    private static final java.lang.String f4920x93cbaebb = "\r\n";

    /* renamed from: PROTOCOL_EOL_BYTES */
    private static final byte[] f4921x15e6a1c7;

    /* renamed from: PROTOCOL_VERSION */
    private static final java.lang.String f4922xc744b611 = "1";

    /* renamed from: SET_LISTENER */
    private static final java.lang.String f4923x4c9dd011 = "setListener";

    /* renamed from: V8_DEBUG_OBJECT */
    private static final java.lang.String f4924x78cc5d48 = "Debug";

    /* renamed from: V8_VERSION */
    private static final java.lang.String f4925x4bf4981b = "4.10.253";

    /* renamed from: client */
    private java.net.Socket f4926xaf12f3cb;

    /* renamed from: debugObject */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4928x9b72db72;

    /* renamed from: runningStateDcp */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4930xc04fc5f;

    /* renamed from: runtime */
    private com.p159x477cd522.p160x333422.V8 f4931x5c71cfd8;

    /* renamed from: server */
    private java.net.ServerSocket f4932xca022f43;

    /* renamed from: stoppedStateDcp */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4933x40c78a6d;

    /* renamed from: waitForConnection */
    private boolean f4935x4f01a512;

    /* renamed from: clientLock */
    private java.lang.Object f4927x41b24f96 = new java.lang.Object();

    /* renamed from: traceCommunication */
    private boolean f4934x44490691 = false;

    /* renamed from: requests */
    private java.util.List<java.lang.String> f4929xe88f5fc4 = new java.util.LinkedList();

    /* renamed from: com.eclipsesource.mmv8.debug.V8DebugServer$ClientLoop */
    /* loaded from: classes7.dex */
    public class ClientLoop implements java.lang.Runnable {

        /* renamed from: from */
        private int f4936x3017aa;

        private ClientLoop() {
        }

        /* renamed from: indexOf */
        private int m16546x73d44649(byte[] bArr, byte[] bArr2, int i17, int i18) {
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

        /* renamed from: join */
        private byte[] m16547x31dd2a(byte[] bArr, byte[] bArr2, int i17, int i18) {
            byte[] bArr3 = new byte[bArr.length + i18];
            java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            java.lang.System.arraycopy(bArr2, i17, bArr3, bArr.length, i18);
            return bArr3;
        }

        /* renamed from: processClientRequests */
        private void m16548x14c838fe() {
            java.io.InputStream inputStream;
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[4096];
            synchronized (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4927x41b24f96) {
                inputStream = com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4926xaf12f3cb.getInputStream();
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
                this.f4936x3017aa = 0;
                do {
                    if (i18 < 0) {
                        i18 = m16549x405bf6c9(bArr2, i19);
                        if (i18 < 0) {
                            break;
                        }
                    }
                    if (!z17 && !(z17 = m16550x89a91105(bArr2, i19))) {
                        break;
                    }
                    int min = java.lang.Math.min(i18 - bArr3.length, i19 - this.f4936x3017aa);
                    bArr3 = m16547x31dd2a(bArr3, bArr2, this.f4936x3017aa, min);
                    this.f4936x3017aa += min;
                    if (bArr3.length == i18) {
                        java.lang.String str = new java.lang.String(bArr3, com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4917xde5cfa85);
                        synchronized (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4929xe88f5fc4) {
                            com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4929xe88f5fc4.add(str);
                        }
                        z17 = false;
                        bArr3 = bArr;
                        i18 = -1;
                    }
                } while (this.f4936x3017aa < i19);
                int i27 = this.f4936x3017aa;
                if (i27 < i19) {
                    java.lang.System.arraycopy(bArr2, i27, bArr2, 0, i19 - i27);
                    i17 = i19 - this.f4936x3017aa;
                } else {
                    i17 = 0;
                }
            }
        }

        /* renamed from: readContentLength */
        private int m16549x405bf6c9(byte[] bArr, int i17) {
            int length;
            int m16546x73d44649;
            int m16546x73d446492 = m16546x73d44649(com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4918x6c4c031f, bArr, this.f4936x3017aa, i17);
            if (m16546x73d446492 < 0 || (m16546x73d44649 = m16546x73d44649(com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4921x15e6a1c7, bArr, (length = m16546x73d446492 + com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4918x6c4c031f.length), i17)) < 0) {
                return -1;
            }
            java.lang.String str = new java.lang.String(bArr, length, m16546x73d44649 - length, com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4917xde5cfa85);
            try {
                int parseInt = java.lang.Integer.parseInt(str.trim());
                this.f4936x3017aa = m16546x73d44649 + com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4921x15e6a1c7.length;
                return parseInt;
            } catch (java.lang.Exception unused) {
                throw new java.io.IOException("Invalid content length header: '" + str + "' in message" + new java.lang.String(bArr, com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4917xde5cfa85));
            }
        }

        /* renamed from: skipToolInfo */
        private boolean m16550x89a91105(byte[] bArr, int i17) {
            int m16546x73d44649 = m16546x73d44649(com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4921x15e6a1c7, bArr, this.f4936x3017aa, i17);
            if (m16546x73d44649 < 0) {
                return false;
            }
            this.f4936x3017aa = m16546x73d44649 + com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.f4921x15e6a1c7.length;
            return true;
        }

        /* renamed from: startHandshake */
        private void m16551xef17a5b5() {
            com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16538x2936bf5f("V8-Version: 4.10.253\r\nProtocol-Version: 1\r\nEmbedding-Host: j2v8 4.0.0\r\nType: connect\r\n", "");
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    java.net.Socket accept = com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4932xca022f43.accept();
                    accept.setTcpNoDelay(true);
                    synchronized (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4927x41b24f96) {
                        com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4926xaf12f3cb = accept;
                        com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4935x4f01a512 = false;
                        com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4927x41b24f96.notifyAll();
                    }
                    m16551xef17a5b5();
                    m16548x14c838fe();
                } catch (java.lang.Exception e17) {
                    synchronized (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4927x41b24f96) {
                        if (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4926xaf12f3cb != null) {
                            try {
                                com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4926xaf12f3cb.close();
                            } catch (java.io.IOException unused) {
                            }
                            com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4926xaf12f3cb = null;
                        }
                        com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16541x7697a924(e17);
                    }
                }
            }
        }
    }

    /* renamed from: com.eclipsesource.mmv8.debug.V8DebugServer$EventHandler */
    /* loaded from: classes7.dex */
    public class EventHandler implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {
        private EventHandler() {
        }

        /* renamed from: safeRelease */
        private void m16552x25e4d7ba(com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98) {
            if (interfaceC1464x1c628e98 != null) {
                interfaceC1464x1c628e98.mo15825x41012807();
            }
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
        /* renamed from: invoke */
        public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
            com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98;
            int mo16294xb282bd08;
            com.p159x477cd522.p160x333422.C1477x4679881 mo16297x2817c635;
            if (c1469x28b0ccd7 == null || c1469x28b0ccd7.mo16336x85ca346()) {
                return;
            }
            com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798812 = null;
            try {
                mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
                mo16297x2817c635 = c1469x28b0ccd7.mo16297x2817c635(1);
            } catch (java.lang.Exception e17) {
                e = e17;
                interfaceC1464x1c628e98 = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                interfaceC1464x1c628e98 = null;
            }
            try {
                com.p159x477cd522.p160x333422.C1477x4679881 mo16297x2817c6352 = c1469x28b0ccd7.mo16297x2817c635(2);
                if (com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.f4934x44490691) {
                    java.lang.String str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                    switch (mo16294xb282bd08) {
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
                if (!com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16534x23b734ff()) {
                    m16552x25e4d7ba(mo16297x2817c635);
                    m16552x25e4d7ba(mo16297x2817c6352);
                    return;
                }
                if (mo16294xb282bd08 == 1) {
                    com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16533xa289484b(mo16297x2817c635, mo16297x2817c6352);
                } else if (mo16294xb282bd08 == 5 || mo16294xb282bd08 == 6) {
                    com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16536x1149a7cf(mo16297x2817c6352);
                }
                m16552x25e4d7ba(mo16297x2817c635);
                m16552x25e4d7ba(mo16297x2817c6352);
            } catch (java.lang.Exception e18) {
                e = e18;
                interfaceC1464x1c628e98 = null;
                c1477x46798812 = mo16297x2817c635;
                try {
                    com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.this.m16541x7697a924(e);
                    m16552x25e4d7ba(c1477x46798812);
                    m16552x25e4d7ba(interfaceC1464x1c628e98);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    m16552x25e4d7ba(c1477x46798812);
                    m16552x25e4d7ba(interfaceC1464x1c628e98);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                interfaceC1464x1c628e98 = null;
                c1477x46798812 = mo16297x2817c635;
                m16552x25e4d7ba(c1477x46798812);
                m16552x25e4d7ba(interfaceC1464x1c628e98);
                throw th;
            }
        }
    }

    static {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        f4917xde5cfa85 = forName;
        f4921x15e6a1c7 = "\r\n".getBytes(forName);
        f4918x6c4c031f = f4919x264ef639.getBytes(forName);
    }

    public C1498xd4be6b74(com.p159x477cd522.p160x333422.V8 v86, int i17, boolean z17) {
        this.f4931x5c71cfd8 = v86;
        this.f4935x4f01a512 = z17;
        com.p159x477cd522.p160x333422.C1477x4679881 mo16330x2817c635 = v86.mo16330x2817c635(f4908x99db8b7f);
        if (mo16330x2817c635 == null) {
            java.lang.System.err.println("Cannot initialize debugger server - global debug object not found.");
            return;
        }
        try {
            this.f4928x9b72db72 = mo16330x2817c635.mo16330x2817c635(f4924x78cc5d48);
            mo16330x2817c635.mo15825x41012807();
            v86.m16194xcb4354d4("(function() {\n " + f4908x99db8b7f + ".Debug. __j2v8_MakeBreakEvent = function (break_id,breakpoints_hit) {\n  return new " + f4908x99db8b7f + ".BreakEvent(break_id,breakpoints_hit);\n }\n " + f4908x99db8b7f + ".Debug. __j2v8_MakeCompileEvent = function(script,type) {\n  var scripts = " + f4908x99db8b7f + ".Debug.scripts()\n  for (var i in scripts) {\n   if (scripts[i].id == script.id()) {\n     return new " + f4908x99db8b7f + ".CompileEvent(scripts[i], type);\n   }\n  }\n  return {toJSONProtocol: function() {return ''}}\n }\n})()");
            try {
                this.f4932xca022f43 = new java.net.ServerSocket(i17);
            } catch (java.lang.Exception e17) {
                m16541x7697a924(e17);
            }
        } catch (java.lang.Throwable th6) {
            mo16330x2817c635.mo15825x41012807();
            throw th6;
        }
    }

    /* renamed from: configureV8ForDebugging */
    public static void m16532xda61584d() {
        try {
            com.p159x477cd522.p160x333422.V8.m16097x52fbaf45("-expose-debug-as=" + f4908x99db8b7f);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enterBreakLoop */
    public void m16533xa289484b(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798812) {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798813;
        try {
            com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4931x5c71cfd8);
            try {
                c1469x28b0ccd7.mo16310x34af1a(false);
                this.f4933x40c78a6d = c1477x4679881.mo16322x2919df0c("debugCommandProcessor", c1469x28b0ccd7);
                c1469x28b0ccd7.mo15825x41012807();
                int mo16328xb282bd08 = c1477x4679881.mo16328xb282bd08("break_id");
                com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16325x742a18a3 = c1477x46798812.mo16325x742a18a3("break_points_hit_");
                com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4931x5c71cfd8);
                try {
                    c1469x28b0ccd72.mo16306x34af1a(mo16328xb282bd08);
                    c1469x28b0ccd72.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) mo16325x742a18a3);
                    c1477x46798813 = this.f4928x9b72db72.mo16322x2919df0c(f4914x186bc249, c1469x28b0ccd72);
                    try {
                        java.lang.String mo16323xfe95a9de = c1477x46798813.mo16323xfe95a9de("toJSONProtocol", null);
                        if (this.f4934x44490691) {
                            java.lang.System.out.println("Sending event (Break):\n" + mo16323xfe95a9de);
                        }
                        m16537x4a562c90(mo16323xfe95a9de);
                        c1469x28b0ccd72.mo15825x41012807();
                        mo16325x742a18a3.mo15825x41012807();
                        c1477x46798813.mo15825x41012807();
                        while (m16534x23b734ff() && !this.f4933x40c78a6d.mo16319x6581e3eb("isRunning", null)) {
                            try {
                                m16542x4ba50353(10L);
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        c1469x28b0ccd72.mo15825x41012807();
                        mo16325x742a18a3.mo15825x41012807();
                        if (c1477x46798813 != null) {
                            c1477x46798813.mo15825x41012807();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    c1477x46798813 = null;
                }
            } catch (java.lang.Throwable th8) {
                c1469x28b0ccd7.mo15825x41012807();
                throw th8;
            }
        } finally {
            this.f4933x40c78a6d.mo15825x41012807();
            this.f4933x40c78a6d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isConnected */
    public boolean m16534x23b734ff() {
        boolean z17;
        java.net.Socket socket;
        synchronized (this.f4927x41b24f96) {
            z17 = (this.f4932xca022f43 == null || (socket = this.f4926xaf12f3cb) == null || !socket.isConnected()) ? false : true;
        }
        return z17;
    }

    /* renamed from: processRequest */
    private void m16535x3c3f2120(java.lang.String str) {
        if (this.f4934x44490691) {
            java.lang.System.out.println("Got message: \n" + str.substring(0, java.lang.Math.min(str.length(), 1000)));
        }
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4931x5c71cfd8);
        c1469x28b0ccd7.mo16309x34af1a(str);
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = this.f4933x40c78a6d;
        if (c1477x4679881 == null) {
            c1477x4679881 = this.f4930xc04fc5f;
        }
        java.lang.String obj = c1477x4679881.mo16438xf9e28a6d("processDebugJSONRequest", c1469x28b0ccd7).toString();
        if (this.f4933x40c78a6d == null && obj.contains("\"running\":false")) {
            obj = obj.replace("\"running\":false", "\"running\":true").replace("\"success\":true", "\"success\":false").replace("{\"", "{\"message\":\"Client requested suspension is not supported on J2V8.\",\"");
            c1477x4679881.add("running_", true);
        }
        if (this.f4934x44490691) {
            java.lang.System.out.println("Returning response: \n" + obj.substring(0, java.lang.Math.min(obj.length(), 1000)));
        }
        m16537x4a562c90(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendCompileEvent */
    public void m16536x1149a7cf(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        if (!m16534x23b734ff()) {
            return;
        }
        int mo16328xb282bd08 = c1477x4679881.mo16328xb282bd08("type_");
        com.p159x477cd522.p160x333422.C1477x4679881 mo16330x2817c635 = c1477x4679881.mo16330x2817c635("script_");
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4931x5c71cfd8);
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798812 = null;
        try {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) mo16330x2817c635);
            c1469x28b0ccd7.mo16306x34af1a(mo16328xb282bd08);
            com.p159x477cd522.p160x333422.C1477x4679881 mo16322x2919df0c = this.f4928x9b72db72.mo16322x2919df0c(f4915xac8580bd, c1469x28b0ccd7);
            try {
                java.lang.String mo16323xfe95a9de = mo16322x2919df0c.mo16323xfe95a9de("toJSONProtocol", null);
                if (this.f4934x44490691) {
                    java.lang.System.out.println("Sending event (CompileEvent):\n" + mo16323xfe95a9de.substring(0, java.lang.Math.min(mo16323xfe95a9de.length(), 1000)));
                }
                if (mo16323xfe95a9de.length() > 0) {
                    m16537x4a562c90(mo16323xfe95a9de);
                }
                c1469x28b0ccd7.mo15825x41012807();
                mo16330x2817c635.mo15825x41012807();
                mo16322x2919df0c.mo15825x41012807();
            } catch (java.lang.Throwable th6) {
                th = th6;
                c1477x46798812 = mo16322x2919df0c;
                c1469x28b0ccd7.mo15825x41012807();
                mo16330x2817c635.mo15825x41012807();
                if (c1477x46798812 != null) {
                    c1477x46798812.mo15825x41012807();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: sendJson */
    private void m16537x4a562c90(java.lang.String str) {
        m16538x2936bf5f("", str.replace("\\/", "/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendMessage */
    public void m16538x2936bf5f(java.lang.String str, java.lang.String str2) {
        synchronized (this.f4927x41b24f96) {
            if (!m16534x23b734ff()) {
                throw new java.io.IOException("There is no connected client.");
            }
            java.nio.charset.Charset charset = f4917xde5cfa85;
            byte[] bytes = str2.getBytes(charset);
            this.f4926xaf12f3cb.getOutputStream().write((str + f4919x264ef639 + java.lang.Integer.toString(bytes.length) + "\r\n\r\n").getBytes(charset));
            if (bytes.length > 0) {
                this.f4926xaf12f3cb.getOutputStream().write(bytes);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.eclipsesource.mmv8.debug.V8DebugServer$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.eclipsesource.mmv8.V8Value] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* renamed from: setupEventHandler */
    private void m16539xef30f66d() {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7;
        com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a;
        ?? r17 = 0;
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = null;
        this.f4928x9b72db72.mo16338x1af320a6(new com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.EventHandler(), f4907x78a1b6be);
        try {
            c1474xd5ce209a = (com.p159x477cd522.p160x333422.C1474xd5ce209a) this.f4928x9b72db72.mo16330x2817c635(f4907x78a1b6be);
        } catch (java.lang.Throwable th6) {
            th = th6;
            c1469x28b0ccd7 = null;
        }
        try {
            c1469x28b0ccd72 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4931x5c71cfd8).mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1474xd5ce209a);
            this.f4928x9b72db72.mo16438xf9e28a6d(f4923x4c9dd011, c1469x28b0ccd72);
            if (c1474xd5ce209a != null && !c1474xd5ce209a.mo16335xafdb8087()) {
                c1474xd5ce209a.mo15825x41012807();
            }
            if (c1469x28b0ccd72 == null || c1469x28b0ccd72.mo16335xafdb8087()) {
                return;
            }
            c1469x28b0ccd72.mo15825x41012807();
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd73 = c1469x28b0ccd72;
            r17 = c1474xd5ce209a;
            c1469x28b0ccd7 = c1469x28b0ccd73;
            if (r17 != 0 && !r17.mo16335xafdb8087()) {
                r17.mo15825x41012807();
            }
            if (c1469x28b0ccd7 != null && !c1469x28b0ccd7.mo16335xafdb8087()) {
                c1469x28b0ccd7.mo15825x41012807();
            }
            throw th;
        }
    }

    /* renamed from: getPort */
    public int m16540xfb8400f7() {
        java.net.ServerSocket serverSocket = this.f4932xca022f43;
        if (serverSocket == null || !serverSocket.isBound()) {
            return -1;
        }
        return this.f4932xca022f43.getLocalPort();
    }

    /* renamed from: logError */
    public void m16541x7697a924(java.lang.Throwable th6) {
        th6.getClass();
    }

    /* renamed from: processRequests */
    public void m16542x4ba50353(long j17) {
        java.lang.String[] strArr;
        if (this.f4932xca022f43 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            synchronized (this.f4929xe88f5fc4) {
                java.util.List<java.lang.String> list = this.f4929xe88f5fc4;
                strArr = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
                this.f4929xe88f5fc4.clear();
            }
            for (java.lang.String str : strArr) {
                try {
                    m16535x3c3f2120(str);
                } catch (java.lang.Exception e17) {
                    m16541x7697a924(e17);
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

    /* renamed from: setTraceCommunication */
    public void m16543xeed0ea93(boolean z17) {
        this.f4934x44490691 = z17;
    }

    /* renamed from: start */
    public void m16544x68ac462() {
        if (this.f4932xca022f43 == null) {
            return;
        }
        boolean z17 = this.f4935x4f01a512;
        java.lang.Thread thread = new java.lang.Thread(new com.p159x477cd522.p160x333422.p161x5b09653.C1498xd4be6b74.ClientLoop(), "J2V8 Debugger Server");
        thread.setDaemon(true);
        thread.start();
        m16539xef30f66d();
        this.f4930xc04fc5f = this.f4931x5c71cfd8.m16180x96f978ff("(function() {return new " + f4908x99db8b7f + ".DebugCommandProcessor(null, true)})()");
        if (z17) {
            synchronized (this.f4927x41b24f96) {
                while (this.f4935x4f01a512) {
                    try {
                        this.f4927x41b24f96.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            try {
                m16542x4ba50353(100L);
            } catch (java.lang.InterruptedException unused2) {
            }
        }
    }

    /* renamed from: stop */
    public void m16545x360802() {
        try {
            this.f4932xca022f43.close();
            synchronized (this.f4927x41b24f96) {
                java.net.Socket socket = this.f4926xaf12f3cb;
                if (socket != null) {
                    socket.close();
                    this.f4926xaf12f3cb = null;
                }
            }
        } catch (java.io.IOException e17) {
            m16541x7697a924(e17);
        }
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = this.f4930xc04fc5f;
        if (c1477x4679881 != null) {
            c1477x4679881.mo15825x41012807();
            this.f4930xc04fc5f = null;
        }
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798812 = this.f4928x9b72db72;
        if (c1477x46798812 != null) {
            c1477x46798812.mo15825x41012807();
            this.f4928x9b72db72 = null;
        }
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798813 = this.f4933x40c78a6d;
        if (c1477x46798813 != null) {
            c1477x46798813.mo15825x41012807();
            this.f4933x40c78a6d = null;
        }
    }
}
