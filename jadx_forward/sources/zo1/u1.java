package zo1;

/* loaded from: classes5.dex */
public final class u1 implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556314a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        this.f556314a = activityC12868xd8a7d79e;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "save new device successfully, deviceId=".concat(deviceId));
        po1.d e17 = ro1.v.f479547a.e(deviceId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
        this.f556314a.Y6(e17);
    }

    @Override // ro1.h
    /* renamed from: onFailed */
    public void mo162785x428b6afc(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Fail to save new device");
    }
}
