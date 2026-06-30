package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public class V8Executor extends java.lang.Thread {
    private java.lang.Exception exception;
    private volatile boolean forceTerminating;
    private boolean longRunning;
    private java.lang.String messageHandler;
    private java.util.LinkedList<java.lang.String[]> messageQueue;
    private java.lang.String result;
    private com.eclipsesource.mmv8.V8 runtime;
    private final java.lang.String script;
    private volatile boolean shuttingDown;
    private volatile boolean terminated;

    /* loaded from: classes7.dex */
    public class ExecutorTermination implements com.eclipsesource.mmv8.JavaVoidCallback {
        public ExecutorTermination() {
        }

        @Override // com.eclipsesource.mmv8.JavaVoidCallback
        public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
            if (com.eclipsesource.mmv8.utils.V8Executor.this.forceTerminating) {
                throw new java.lang.RuntimeException("V8Thread Termination");
            }
        }
    }

    public V8Executor(java.lang.String str, boolean z17, java.lang.String str2) {
        this.terminated = false;
        this.shuttingDown = false;
        this.forceTerminating = false;
        this.exception = null;
        this.messageQueue = new java.util.LinkedList<>();
        this.script = str;
        this.longRunning = z17;
        this.messageHandler = str2;
    }

    public void forceTermination() {
        synchronized (this) {
            this.forceTerminating = true;
            this.shuttingDown = true;
            com.eclipsesource.mmv8.V8 v86 = this.runtime;
            if (v86 != null) {
                v86.terminateExecution();
            }
            notify();
        }
    }

    public java.lang.Exception getException() {
        return this.exception;
    }

    public java.lang.String getResult() {
        return this.result;
    }

    public boolean hasException() {
        return this.exception != null;
    }

    public boolean hasTerminated() {
        return this.terminated;
    }

    public boolean isShuttingDown() {
        return this.shuttingDown;
    }

    public boolean isTerminating() {
        return this.forceTerminating;
    }

    public void postMessage(java.lang.String... strArr) {
        synchronized (this) {
            this.messageQueue.add(strArr);
            notify();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r8.messageQueue.isEmpty() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r3 = 0;
        r0 = r8.messageQueue.remove(0);
        r4 = new com.eclipsesource.mmv8.V8Array(r8.runtime);
        r5 = new com.eclipsesource.mmv8.V8Array(r8.runtime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
    
        r6 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
    
        if (r3 >= r6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        r5.push(r0[r3]);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c2, code lost:
    
        r4.push((com.eclipsesource.mmv8.V8Value) r5);
        r8.runtime.executeVoidFunction(r8.messageHandler, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        r5.release();
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
    
        r5.release();
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        throw r0;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8Executor.run():void");
    }

    public void setup(com.eclipsesource.mmv8.V8 v86) {
    }

    public void shutdown() {
        synchronized (this) {
            this.shuttingDown = true;
            notify();
        }
    }

    public V8Executor(java.lang.String str) {
        this(str, false, null);
    }
}
