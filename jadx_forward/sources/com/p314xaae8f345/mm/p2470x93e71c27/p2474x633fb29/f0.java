package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes15.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f270828f;

    public f0(java.lang.String str, int i17, long j17) {
        this.f270826d = str;
        this.f270827e = i17;
        this.f270828f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0 d0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270874b.get(this.f270826d);
        if (e0Var == null || (d0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0) e0Var.f270818f.get(java.lang.Integer.valueOf(this.f270827e))) == null) {
            return;
        }
        int i17 = d0Var.f270803a;
        if (i17 == 2 || i17 == 3) {
            if (i17 == 2 && this.f270828f < 0) {
                java.lang.System.currentTimeMillis();
            }
            d0Var.f270803a = 4;
        }
    }
}
