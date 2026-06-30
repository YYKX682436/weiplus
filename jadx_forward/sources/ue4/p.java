package ue4;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue4.q f508448d;

    public p(ue4.q qVar) {
        this.f508448d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f.INSTANCE.mo68477x336bdfd8(625L, 3L, 1L, false);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d wi6 = this.f508448d.f508449a.wi();
            long a17 = wi6.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", java.lang.Long.valueOf(a17));
            wi6.d(a17);
        }
    }
}
