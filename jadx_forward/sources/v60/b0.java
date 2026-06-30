package v60;

/* loaded from: classes.dex */
public final class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.r2 r2Var = event.f135586g;
        int i17 = r2Var.f89292a;
        if (i17 == 216) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK get notify res download finish, type:%d subType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r2Var.f89293b));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 114);
            try {
                java.lang.String str = r2Var.f89294c;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(M)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK config content is null");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayWPHKUrlResUpdateListener", "WPHK save config file to mmkv");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
                        if (M2 != null) {
                            M2.putString("MMKV_KEY_WPHK_CONFIG_DATA", M);
                        }
                        if (M2 != null) {
                            M2.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", 0L);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxPayWPHKUrlResUpdateListener", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
