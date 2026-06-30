package oy3;

/* loaded from: classes13.dex */
public final class t implements fy3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431577a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431577a = activityC17256xc70b42d4;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onCheckResResult " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431577a;
        if (!z17) {
            activityC17256xc70b42d4.D.mo50305x3d8a09a2(1002);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onSoResCheck success");
        activityC17256xc70b42d4.D.mo50303x856b99f0(1001);
        activityC17256xc70b42d4.D.mo50305x3d8a09a2(1003);
    }

    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onHandleScanError " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431577a;
        activityC17256xc70b42d4.f240140y = i17;
        android.os.Message message = new android.os.Message();
        message.what = 1004;
        message.arg1 = activityC17256xc70b42d4.f240140y;
        activityC17256xc70b42d4.D.mo50308x2936bf5f(message);
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onLoginSuccess");
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431577a;
        activityC17256xc70b42d4.f240140y = 1;
        ky3.b bVar = activityC17256xc70b42d4.f240139x;
        bVar.f395150d = 1;
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).hj(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1904, 1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC17256xc70b42d4.D;
        n3Var.mo77785xc570fb34(new oy3.j(activityC17256xc70b42d4));
        n3Var.mo77785xc570fb34(new oy3.w(activityC17256xc70b42d4));
        n3Var.mo77786xdceccb8e(new oy3.r(activityC17256xc70b42d4), 2000L);
    }
}
