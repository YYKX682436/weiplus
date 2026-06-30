package ff3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343181d;

    public m(ff3.n nVar, java.lang.String str) {
        this.f343181d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt4.f b17 = bt4.f.b();
        b17.getClass();
        java.lang.String str = this.f343181d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 e17 = bt4.f.e(str);
        if (e17 != null) {
            boolean equals = "2".equals(e17.f261378u);
            java.util.Map map = b17.f106003a;
            java.lang.String str2 = e17.f261366f;
            if (equals) {
                java.util.Objects.toString(e17);
                java.util.HashMap hashMap = (java.util.HashMap) map;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) hashMap.get(str2);
                if (c19101x8593f27 == null || !c19101x8593f27.f261367g.equals(e17.f261367g) || !c19101x8593f27.f261368h.equals(e17.f261368h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg cancel not found!");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg remove : " + str2);
                hashMap.remove(str2);
                return;
            }
            ((java.util.HashMap) map).put(str2, e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg : " + str);
            b17.g();
            gm0.j1.i();
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, "");
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str3.split(","));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f261367g) && P1.contains(e17.f261367g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "set OutOfDateRedDot");
                return;
            }
            int i17 = e17.f261379v;
            if (i17 == 0) {
                int i18 = e17.f261380w;
                if (i18 == 0 || i18 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "showType New");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().r(262156, true);
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "showType New with wallet region:%d", java.lang.Integer.valueOf(i18));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, java.lang.Integer.valueOf(e17.f261380w));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 1);
                }
            } else if (i17 == 1) {
                int i19 = e17.f261380w;
                if (i19 == 0 || i19 == 1) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262156, true);
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "showType dot with wallet region:%d", java.lang.Integer.valueOf(i19));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, java.lang.Integer.valueOf(e17.f261380w));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 2);
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, "");
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_INT, -1);
        }
    }
}
