package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s f148975d;

    public l(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s sVar) {
        this.f148975d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qh.f0 f0Var;
        android.os.Handler handler;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s sVar = this.f148975d;
        android.os.Handler handler2 = sVar.f149012f;
        if (handler2 == null) {
            ph.u e17 = gi.d.e();
            android.os.Handler handler3 = null;
            android.os.Looper looper = (e17 == null || (f0Var = e17.f435829h) == null || (handler = f0Var.f444870f) == null) ? null : handler.getLooper();
            if (looper != null) {
                handler3 = new android.os.Handler(looper);
                sVar.f149012f = handler3;
            }
            handler2 = handler3;
        }
        if (handler2 != null) {
            handler2.post((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.p) ((jz5.n) sVar.f149014h).mo141623x754a37bb());
        }
    }
}
