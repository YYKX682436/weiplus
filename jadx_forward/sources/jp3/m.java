package jp3;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f382550d;

    public m(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        this.f382550d = c5255x5f3208fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = this.f382550d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5255x5f3208fd.f135586g.f89294c)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintResUpdateListener", "[callback] resource file update result success？： " + jp3.n.f382551d.a(c5255x5f3208fd.f135586g.f89294c));
    }
}
