package zy3;

/* loaded from: classes.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a() || event.f135586g.f89292a != 193) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportResUpdateListener", "[callback] file update, type: " + event.f135586g.f89292a + ", subType:" + event.f135586g.f89293b + ", version：" + event.f135586g.f89295d + ", filePath: " + event.f135586g.f89294c);
        if (!gm0.j1.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanPassportResUpdateListener", "[callback] kernel extension was not invoked, skip this time");
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new zy3.n(event), "MicroMsg.ScanPassportResUpdateListener");
        return false;
    }
}
