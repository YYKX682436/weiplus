package ks3;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5190x2987815d c5190x2987815d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5190x2987815d) abstractC20979x809547d1;
        if (c5190x2987815d instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5190x2987815d) {
            c5190x2987815d.f135533g.getClass();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQMail.EventListener", "unbind qq, bindXMail is [%s]", str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    gm0.j1.u().c().w(17, 2);
                    int n17 = c01.z1.n() | 1;
                    gm0.j1.u().c().w(34, java.lang.Integer.valueOf(n17));
                    ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", n17, "", 0, "", 0));
                    ls3.e.b();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QQMail.EventListener", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.QQMail.EventListener", "not bind qq event");
        }
        return false;
    }
}
