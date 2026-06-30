package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f280201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f f280202e;

    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar, java.lang.Runnable runnable) {
        this.f280202e = fVar;
        this.f280201d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String c17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar = this.f280202e;
        java.lang.String b17 = ab5.c0.b(fVar.f280218d.x());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            b17 = fVar.f280218d.x();
            c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f280218d.w()) ? ab5.c0.c(fVar.f280218d.x()) : fVar.f280218d.w();
        } else {
            c17 = ab5.c0.c(b17);
        }
        if (fVar.f280203e == 3 && android.text.TextUtils.isEmpty(fVar.f280205g.f159015h)) {
            fVar.f280205g.f159015h = c17;
        }
        int i17 = fVar.f280203e;
        if (i17 != 2 && i17 != 3) {
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = ab5.c0.a(b17);
            z5Var.f387405j = 4;
            z5Var.f387399d = b17;
            z5Var.f387400e = c17;
            fVar.f280205g = z5Var.a();
        }
        java.lang.Runnable runnable = this.f280201d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
