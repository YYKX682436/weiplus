package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes15.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f270840e;

    public g0(java.lang.String str, long j17) {
        this.f270839d = str;
        this.f270840e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270874b.get(this.f270839d);
        if (e0Var != null) {
            e0Var.f270816d++;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0) e0Var.f270818f.get(3);
            if (d0Var != null && d0Var.f270803a == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImageBlankReporter", "retryDownload force restart id: %s", e0Var.f270817e);
                d0Var.f270803a = 1;
                d0Var.a(this.f270840e);
            }
        }
    }
}
