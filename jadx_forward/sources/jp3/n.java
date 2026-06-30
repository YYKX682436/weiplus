package jp3;

/* loaded from: classes.dex */
public final class n extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static final jp3.l f382551d = new jp3.l(null);

    public n() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a() || event.f135586g.f89292a != 182) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintResUpdateListener", "[callback] file update, type: " + event.f135586g.f89292a + ", subType:" + event.f135586g.f89293b + ", version：" + event.f135586g.f89295d + ", fileUpdated: " + event.f135586g.f89296e + ", filePath: " + event.f135586g.f89294c + ", fileMd5: " + event.f135586g.f89297f);
        if (event.f135586g.f89293b != 11) {
            return false;
        }
        if (!gm0.j1.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintResUpdateListener", "[callback] kernel extension was not invoked, skip this time");
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new jp3.m(event), "wallet_palm_print_thread_id");
        return false;
    }
}
