package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class n3 implements qu5.a {

    /* renamed from: SLOW_DURATION */
    private static final long f39185x52103e12 = 5000;

    /* renamed from: SLOW_UI_DURATION */
    private static final long f39186x428351a1 = 300;

    /* renamed from: UIHandler */
    private static final android.os.Handler f39187x66729616 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: lock */
    private final java.lang.Object f39188x32c52b;

    /* renamed from: mTaskWatch */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 f39189x8506945d;

    /* renamed from: realHandler */
    private final qu5.a f39190x3c4227cc;

    /* renamed from: runningMsg */
    private volatile android.os.Message f39191xa314cd42;

    public n3() {
        this.f39188x32c52b = new java.lang.Object();
        this.f39190x3c4227cc = a(android.os.Looper.myLooper(), xu5.b.d(), null);
    }

    /* renamed from: createFreeHandler */
    public static android.os.Handler m77777x504cd8a2(android.os.Looper looper) {
        return new android.os.Handler(looper);
    }

    public final qu5.a a(android.os.Looper looper, xu5.b bVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        if (looper == android.os.Looper.getMainLooper() || bVar == xu5.b.b()) {
            return new qu5.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.i3(this, android.os.Looper.getMainLooper(), k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var));
        }
        if (bVar != null) {
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.j3(this, bVar, k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var);
        }
        if (looper != null) {
            return new qu5.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.i3(this, looper, k3Var, android.os.Looper.getMainLooper().getThread().getId(), k3Var));
        }
        throw new java.lang.RuntimeException("looper and serial is null!");
    }

    /* renamed from: afterDispatchMessage */
    public void mo77778x5520f4b1(android.os.Message message) {
    }

    /* renamed from: beforeDispatchMessage */
    public void mo77779x9394e0ae(android.os.Message message) {
    }

    /* renamed from: beforeSendMessage */
    public void mo77780x6839d260(android.os.Message message, long j17) {
    }

    @Override // qu5.a
    /* renamed from: dispatchMessage */
    public final void mo50277x8245362d(android.os.Message message) {
        this.f39190x3c4227cc.mo50277x8245362d(message);
    }

    @Override // qu5.a
    /* renamed from: dump */
    public void mo50278x2f39f4(android.util.Printer printer, java.lang.String str) {
        this.f39190x3c4227cc.mo50278x2f39f4(printer, str);
    }

    @Override // qu5.a
    /* renamed from: executeOrSendMessage */
    public boolean mo50279x9b89c07(android.os.Message message) {
        return this.f39190x3c4227cc.mo50279x9b89c07(message);
    }

    @Override // qu5.a
    /* renamed from: getLooper */
    public android.os.Looper mo50280x23b2dd47() {
        return this.f39190x3c4227cc.mo50280x23b2dd47();
    }

    @Override // qu5.a
    /* renamed from: getMessageName */
    public java.lang.String mo50281xa5c8d9fc(android.os.Message message) {
        return this.f39190x3c4227cc.mo50281xa5c8d9fc(message);
    }

    /* renamed from: getRunningMessage */
    public android.os.Message m77781x1d1b2a3e() {
        return this.f39191xa314cd42;
    }

    @Override // qu5.a
    /* renamed from: getSelf */
    public final android.os.Handler mo50282xfb8537c2() {
        return this.f39190x3c4227cc.mo50282xfb8537c2();
    }

    @Override // qu5.a
    /* renamed from: getSerial */
    public xu5.b mo50283x2f1920ea() {
        return this.f39190x3c4227cc.mo50283x2f1920ea();
    }

    @Override // qu5.a
    /* renamed from: getSerialTag */
    public java.lang.String mo50284xdd3e8650() {
        return this.f39190x3c4227cc.mo50284xdd3e8650();
    }

    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50285x8fc9be06(int i17) {
        return this.f39190x3c4227cc.mo50285x8fc9be06(i17);
    }

    @Override // qu5.a
    /* renamed from: isQuit */
    public boolean mo50287xb9a7fe99() {
        return this.f39190x3c4227cc.mo50287xb9a7fe99();
    }

    /* renamed from: join */
    public void m77782x31dd2a() {
        m77783x31dd2a(0L);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50288x733c63a2() {
        return this.f39190x3c4227cc.mo50288x733c63a2();
    }

    @Override // qu5.a
    /* renamed from: post */
    public boolean mo50293x3498a0(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        return l3Var != null ? this.f39190x3c4227cc.mo50293x3498a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var)) : this.f39190x3c4227cc.mo50293x3498a0(runnable);
    }

    @Override // qu5.a
    /* renamed from: postAtFrontOfQueue */
    public boolean mo50294x9395cba4(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        return l3Var != null ? this.f39190x3c4227cc.mo50294x9395cba4(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var)) : this.f39190x3c4227cc.mo50294x9395cba4(runnable);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50295x41bd0e60(java.lang.Runnable runnable, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        if (l3Var != null) {
            return this.f39190x3c4227cc.mo50295x41bd0e60(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var), j17);
        }
        return this.f39190x3c4227cc.mo50295x41bd0e60(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50297x7c4d7ca2(java.lang.Runnable runnable, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        if (l3Var != null) {
            return this.f39190x3c4227cc.mo50297x7c4d7ca2(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var), j17);
        }
        return this.f39190x3c4227cc.mo50297x7c4d7ca2(runnable, j17);
    }

    @java.lang.Deprecated
    /* renamed from: postToWorker */
    public final boolean m77784x795fa299(java.lang.Runnable runnable) {
        return this.f39190x3c4227cc.mo50293x3498a0(runnable);
    }

    /* renamed from: postUI */
    public void mo77785xc570fb34(java.lang.Runnable runnable) {
        f39187x66729616.post(runnable);
    }

    /* renamed from: postUIDelayed */
    public void mo77786xdceccb8e(java.lang.Runnable runnable, long j17) {
        f39187x66729616.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: quit */
    public boolean mo50299x35224f() {
        boolean mo50299x35224f;
        synchronized (this.f39188x32c52b) {
            mo50299x35224f = this.f39190x3c4227cc.mo50299x35224f();
            this.f39188x32c52b.notifyAll();
        }
        return mo50299x35224f;
    }

    /* renamed from: quitSafely */
    public boolean m77787xbe88f509() {
        this.f39190x3c4227cc.mo50293x3498a0(new com.p314xaae8f345.mm.sdk.p2603x2137b148.h3(this));
        return true;
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50300x3fa464aa(java.lang.Runnable runnable) {
        if (this.f39189x8506945d != null) {
            this.f39190x3c4227cc.mo50300x3fa464aa((com.p314xaae8f345.mm.sdk.p2603x2137b148.m3) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.f274382f).remove(runnable));
        } else {
            this.f39190x3c4227cc.mo50300x3fa464aa(runnable);
        }
    }

    @Override // qu5.a
    /* renamed from: removeCallbacksAndMessages */
    public void mo50302x6b17ad39(java.lang.Object obj) {
        this.f39190x3c4227cc.mo50302x6b17ad39(obj);
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50303x856b99f0(int i17) {
        this.f39190x3c4227cc.mo50303x856b99f0(i17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessage */
    public boolean mo50305x3d8a09a2(int i17) {
        return this.f39190x3c4227cc.mo50305x3d8a09a2(i17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageAtTime */
    public boolean mo50306x754635e2(int i17, long j17) {
        return this.f39190x3c4227cc.mo50306x754635e2(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageDelayed */
    public boolean mo50307xb9e94560(int i17, long j17) {
        return this.f39190x3c4227cc.mo50307xb9e94560(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendMessage */
    public boolean mo50308x2936bf5f(android.os.Message message) {
        return this.f39190x3c4227cc.mo50308x2936bf5f(message);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtFrontOfQueue */
    public boolean mo50309x6d91b823(android.os.Message message) {
        return this.f39190x3c4227cc.mo50309x6d91b823(message);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtTime */
    public final boolean mo50310xc5d0e9df(android.os.Message message, long j17) {
        return this.f39190x3c4227cc.mo50310xc5d0e9df(message, j17);
    }

    @Override // qu5.a
    /* renamed from: sendMessageDelayed */
    public boolean mo50311x7ab51103(android.os.Message message, long j17) {
        return this.f39190x3c4227cc.mo50311x7ab51103(message, j17);
    }

    /* renamed from: setHasDefaultLooper */
    public void m77788xcf4c2bfa(boolean z17) {
        qu5.a aVar = this.f39190x3c4227cc;
        if (aVar instanceof xu5.o) {
            ((xu5.o) aVar).getClass();
        }
    }

    /* renamed from: setLogging */
    public void m77789xc5a5549d(boolean z17) {
        qu5.a aVar = this.f39190x3c4227cc;
        if (aVar instanceof xu5.o) {
            ((xu5.o) aVar).f538861b = z17;
        }
    }

    /* renamed from: setTaskWatch */
    public void m77790x66107c08(com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var) {
        this.f39189x8506945d = l3Var;
    }

    /* renamed from: toString */
    public java.lang.String mo77726x9616526c() {
        return this.f39190x3c4227cc.toString();
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50286x8fc9be06(int i17, java.lang.Object obj) {
        return this.f39190x3c4227cc.mo50286x8fc9be06(i17, obj);
    }

    /* renamed from: join */
    public void m77783x31dd2a(long j17) {
        synchronized (this.f39188x32c52b) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (j17 < 0) {
                throw new java.lang.IllegalArgumentException("timeout value is negative");
            }
            if (j17 == 0) {
                while (!mo50287xb9a7fe99()) {
                    this.f39188x32c52b.wait(j17);
                }
            } else {
                long j18 = 0;
                while (!mo50287xb9a7fe99()) {
                    long j19 = j17 - j18;
                    if (j19 <= 0) {
                        break;
                    }
                    this.f39188x32c52b.wait(j19);
                    j18 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                }
            }
        }
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50289x733c63a2(int i17) {
        return this.f39190x3c4227cc.mo50289x733c63a2(i17);
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50304x856b99f0(int i17, java.lang.Object obj) {
        this.f39190x3c4227cc.mo50304x856b99f0(i17, obj);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50292x733c63a2(int i17, java.lang.Object obj) {
        return this.f39190x3c4227cc.mo50292x733c63a2(i17, obj);
    }

    public n3(com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        this.f39188x32c52b = new java.lang.Object();
        this.f39190x3c4227cc = a(android.os.Looper.myLooper(), xu5.b.d(), k3Var);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50290x733c63a2(int i17, int i18, int i19) {
        return this.f39190x3c4227cc.mo50290x733c63a2(i17, i18, i19);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50296x41bd0e60(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        if (l3Var != null) {
            return this.f39190x3c4227cc.mo50296x41bd0e60(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var), obj, j17);
        }
        return this.f39190x3c4227cc.mo50296x41bd0e60(runnable, obj, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50298x7c4d7ca2(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l3 l3Var = this.f39189x8506945d;
        if (l3Var != null) {
            return this.f39190x3c4227cc.mo50298x7c4d7ca2(com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.a(runnable, l3Var), obj, j17);
        }
        return this.f39190x3c4227cc.mo50298x7c4d7ca2(runnable, obj, j17);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50291x733c63a2(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f39190x3c4227cc.mo50291x733c63a2(i17, i18, i19, obj);
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50301x3fa464aa(java.lang.Runnable runnable, java.lang.Object obj) {
        if (this.f39189x8506945d != null) {
            this.f39190x3c4227cc.mo50301x3fa464aa((com.p314xaae8f345.mm.sdk.p2603x2137b148.m3) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.m3.f274382f).remove(runnable), obj);
        } else {
            this.f39190x3c4227cc.mo50301x3fa464aa(runnable, obj);
        }
    }

    public n3(android.os.Looper looper) {
        this.f39188x32c52b = new java.lang.Object();
        java.util.Objects.requireNonNull(looper);
        this.f39190x3c4227cc = a(looper, null, null);
    }

    public n3(android.os.Looper looper, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        this.f39188x32c52b = new java.lang.Object();
        java.util.Objects.requireNonNull(looper);
        this.f39190x3c4227cc = a(looper, null, k3Var);
    }

    public n3(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        this.f39188x32c52b = new java.lang.Object();
        java.util.Objects.requireNonNull(str);
        this.f39190x3c4227cc = a(null, xu5.b.a(str), k3Var);
    }

    public n3(java.lang.String str) {
        this.f39188x32c52b = new java.lang.Object();
        this.f39190x3c4227cc = a(null, xu5.b.a(str), null);
    }

    public n3(xu5.b bVar) {
        this.f39188x32c52b = new java.lang.Object();
        java.util.Objects.requireNonNull(bVar);
        this.f39190x3c4227cc = a(null, bVar, null);
    }

    public n3(xu5.b bVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        this.f39188x32c52b = new java.lang.Object();
        java.util.Objects.requireNonNull(bVar);
        this.f39190x3c4227cc = a(null, bVar, k3Var);
    }
}
