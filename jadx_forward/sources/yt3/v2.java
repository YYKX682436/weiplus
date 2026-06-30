package yt3;

/* loaded from: classes10.dex */
public final class v2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f547233a;

    public v2(yt3.z2 z2Var) {
        this.f547233a = z2Var;
    }

    public void a() {
        yt3.z2 z2Var = this.f547233a;
        long j17 = z2Var.f547278o;
        if (j17 != -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 <= z2Var.f547277n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap too often! %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        z2Var.f547273g.m66958xbc91ffe0(false);
        ju3.d0.k(z2Var.f547271e, ju3.c0.f383434s, null, 2, null);
        z2Var.f547278o = android.os.SystemClock.elapsedRealtime();
        dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
    }
}
