package my3;

/* loaded from: classes13.dex */
public final class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f414345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my3.q f414346e;

    public l(boolean z17, my3.q qVar) {
        this.f414345d = z17;
        this.f414346e = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        fy3.f fVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = false;
        if (bundle != null && bundle.getBoolean("result", false)) {
            z17 = true;
        }
        java.lang.String deviceName = bundle != null ? bundle.getString("device_name") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "connect watch " + z17);
        if (!this.f414345d || (fVar = this.f414346e.f414366s) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onChannelConnectResult connected:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = ((oy3.t) fVar).f431577a;
        if (z17) {
            activityC17256xc70b42d4.D.mo50305x3d8a09a2(1005);
            activityC17256xc70b42d4.D.mo77785xc570fb34(new oy3.q(activityC17256xc70b42d4, deviceName));
            return;
        }
        activityC17256xc70b42d4.f240140y = 2;
        android.os.Message message = new android.os.Message();
        message.what = 1004;
        message.arg1 = activityC17256xc70b42d4.f240140y;
        activityC17256xc70b42d4.D.mo50308x2936bf5f(message);
    }
}
