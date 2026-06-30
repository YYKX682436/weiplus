package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.V8Executor */
/* loaded from: classes7.dex */
public class C1524xfd44a595 extends java.lang.Thread {

    /* renamed from: exception */
    private java.lang.Exception f5046x584fd04f;

    /* renamed from: forceTerminating */
    private volatile boolean f5047xa1d572f3;

    /* renamed from: longRunning */
    private boolean f5048xfcfbe3a3;

    /* renamed from: messageHandler */
    private java.lang.String f5049x5c612943;

    /* renamed from: messageQueue */
    private java.util.LinkedList<java.lang.String[]> f5050xb293154a;

    /* renamed from: result */
    private java.lang.String f5051xc84dc81d;

    /* renamed from: runtime */
    private com.p159x477cd522.p160x333422.V8 f5052x5c71cfd8;

    /* renamed from: script */
    private final java.lang.String f5053xc9e5d0cb;

    /* renamed from: shuttingDown */
    private volatile boolean f5054x4c40ac64;

    /* renamed from: terminated */
    private volatile boolean f5055xb1fd0e23;

    /* renamed from: com.eclipsesource.mmv8.utils.V8Executor$ExecutorTermination */
    /* loaded from: classes7.dex */
    public class ExecutorTermination implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {
        public ExecutorTermination() {
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
        /* renamed from: invoke */
        public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
            if (com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595.this.f5047xa1d572f3) {
                throw new java.lang.RuntimeException("V8Thread Termination");
            }
        }
    }

    public C1524xfd44a595(java.lang.String str, boolean z17, java.lang.String str2) {
        this.f5055xb1fd0e23 = false;
        this.f5054x4c40ac64 = false;
        this.f5047xa1d572f3 = false;
        this.f5046x584fd04f = null;
        this.f5050xb293154a = new java.util.LinkedList<>();
        this.f5053xc9e5d0cb = str;
        this.f5048xfcfbe3a3 = z17;
        this.f5049x5c612943 = str2;
    }

    /* renamed from: forceTermination */
    public void m16650xa1d57319() {
        synchronized (this) {
            this.f5047xa1d572f3 = true;
            this.f5054x4c40ac64 = true;
            com.p159x477cd522.p160x333422.V8 v86 = this.f5052x5c71cfd8;
            if (v86 != null) {
                v86.m16276xb41a09b7();
            }
            notify();
        }
    }

    /* renamed from: getException */
    public java.lang.Exception m16651x57bd4199() {
        return this.f5046x584fd04f;
    }

    /* renamed from: getResult */
    public java.lang.String m16652x2d64eb13() {
        return this.f5051xc84dc81d;
    }

    /* renamed from: hasException */
    public boolean m16653x1792aad5() {
        return this.f5046x584fd04f != null;
    }

    /* renamed from: hasTerminated */
    public boolean m16654xdb15845d() {
        return this.f5055xb1fd0e23;
    }

    /* renamed from: isShuttingDown */
    public boolean m16655x1edf9eae() {
        return this.f5054x4c40ac64;
    }

    /* renamed from: isTerminating */
    public boolean m16656x39996354() {
        return this.f5047xa1d572f3;
    }

    /* renamed from: postMessage */
    public void m16657x58d00b47(java.lang.String... strArr) {
        synchronized (this) {
            this.f5050xb293154a.add(strArr);
            notify();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r8.f5050xb293154a.isEmpty() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r3 = 0;
        r0 = r8.f5050xb293154a.remove(0);
        r4 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(r8.f5052x5c71cfd8);
        r5 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(r8.f5052x5c71cfd8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
    
        r6 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
    
        if (r3 >= r6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        r5.mo16309x34af1a(r0[r3]);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c2, code lost:
    
        r4.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) r5);
        r8.f5052x5c71cfd8.mo16324x725c19a1(r8.f5049x5c612943, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        r5.mo15825x41012807();
        r4.mo15825x41012807();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
    
        r5.mo15825x41012807();
        r4.mo15825x41012807();
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
        throw new UnsupportedOperationException("Method not decompiled: com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595.run():void");
    }

    /* renamed from: setup */
    public void m16658x6843a7d(com.p159x477cd522.p160x333422.V8 v86) {
    }

    /* renamed from: shutdown */
    public void m16659xf5e80656() {
        synchronized (this) {
            this.f5054x4c40ac64 = true;
            notify();
        }
    }

    public C1524xfd44a595(java.lang.String str) {
        this(str, false, null);
    }
}
