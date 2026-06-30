package yt3;

/* loaded from: classes10.dex */
public final class k3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f547046a;

    public k3(yt3.r3 r3Var) {
        this.f547046a = r3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j0
    public final void a() {
        yt3.r3 r3Var = this.f547046a;
        long j17 = r3Var.f547170r;
        if (j17 != -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 <= r3Var.f547169q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onSimpleTap too often! %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onSimpleTap %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        ju3.d0.k(r3Var.f547160e, ju3.c0.f383434s, null, 2, null);
        r3Var.f547170r = android.os.SystemClock.elapsedRealtime();
        dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
    }
}
