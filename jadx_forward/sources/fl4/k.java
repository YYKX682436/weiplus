package fl4;

/* loaded from: classes11.dex */
public final class k extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 f345470d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83) {
        this.f345470d = serviceC18717xf3b2cd83;
    }

    @Override // b66.t
    public void o(byte[] context, int i17, byte[] msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83 = this.f345470d;
        if (java.lang.Math.abs(j17 - serviceC18717xf3b2cd83.f256236z) < 1000) {
            return;
        }
        serviceC18717xf3b2cd83.f256236z = j17;
        try {
            b66.n h17 = serviceC18717xf3b2cd83.h();
            if (h17 != null) {
                int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83.I.a(((b66.q) h17).n());
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd832 = this.f345470d;
                serviceC18717xf3b2cd832.l(a17, serviceC18717xf3b2cd832.f256234x, j19, j17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMediaBrowserService", "onProgressChanged Error:" + e17.getLocalizedMessage());
        }
    }
}
