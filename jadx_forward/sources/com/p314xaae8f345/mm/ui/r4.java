package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class r4 implements vg3.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f291129a;

    public r4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb) {
        this.f291129a = c21357x5e7365bb;
    }

    @Override // vg3.d4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("lifeappreddot") || map == null) {
            return;
        }
        boolean equals = "1".equals(map.get(".sysmsg.lifeappreddot"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "life around xml msg content, showRedDot: %s.", java.lang.Boolean.valueOf(equals));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.valueOf(equals));
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f291129a;
        if (!equals) {
            c21357x5e7365bb.f278192x1 = com.p314xaae8f345.mm.ui.e6.TYPE_NONE;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, "0");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, "");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, "");
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$type");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$text");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$imageurl");
        java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
        if (c21357x5e7365bb.x1(str3, str4)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, str2);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, str3);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, str4);
        }
    }
}
