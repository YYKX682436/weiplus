package yt3;

/* loaded from: classes10.dex */
public final class w2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f547240a;

    public w2(yt3.z2 z2Var) {
        this.f547240a = z2Var;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onLongPressFinish");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        yt3.z2 z2Var = this.f547240a;
        z2Var.f547278o = elapsedRealtime;
        z2Var.m(false);
        dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
    }
}
