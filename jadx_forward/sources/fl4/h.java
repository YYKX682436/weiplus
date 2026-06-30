package fl4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 f345467d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83) {
        this.f345467d = serviceC18717xf3b2cd83;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "api 26 disable notify");
            return;
        }
        fl4.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83 = this.f345467d;
        b66.n h17 = serviceC18717xf3b2cd83.h();
        if ((h17 != null ? ((b66.q) h17).n() : null) == bw5.pq0.Paused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "real cancel pause notification");
            serviceC18717xf3b2cd83.e();
            serviceC18717xf3b2cd83.g();
        }
    }
}
