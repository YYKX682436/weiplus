package nv;

/* loaded from: classes9.dex */
public class b2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5178xda9c272a c5178xda9c272a = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5178xda9c272a) abstractC20979x809547d1;
        if (c5178xda9c272a == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore", "receive BackupGetA8keyRedirectEvent.");
        java.lang.String url = c5178xda9c272a.f135525g.f88421a;
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        nv.C29226x57c45d1 c29226x57c45d1 = new nv.C29226x57c45d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sn1.v(url, c29226x57c45d1, null), 3, null);
            return false;
        }
        c29226x57c45d1.accept(new sn1.j(null, 3, -1, "No account scope"));
        return false;
    }
}
