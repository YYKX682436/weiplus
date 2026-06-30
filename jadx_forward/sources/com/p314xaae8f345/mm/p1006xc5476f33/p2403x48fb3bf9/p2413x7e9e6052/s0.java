package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class s0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f264878d;

    public s0(long j17) {
        this.f264878d = j17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload actually delay ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis() - this.f264878d);
        sb6.append(" ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264885a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264886b == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264886b = a17;
            a17.mo32265x141096a9("about:blank");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", "preload cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        return false;
    }
}
