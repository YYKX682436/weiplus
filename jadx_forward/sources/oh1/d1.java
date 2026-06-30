package oh1;

/* loaded from: classes9.dex */
public enum d1 implements vg3.q4 {
    INSTANCE;

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var;
        if (str == null || !str.equals("weapp_pushmsg")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "subType is err, return");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppBrandNotifyMsgHandler", "consumeNewXml subType:%s", str);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "title is null, return");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".sysmsg.weapp_pushmsg.wxa_nickname"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "nickname is null, return");
            return null;
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.busi_msgid");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "msgId is null, return");
            return null;
        }
        if (p0Var == null || (j4Var = p0Var.f152259a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return null;
        }
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAppBrandNotifyMsgHandler", "appId is null");
        }
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAppBrandNotifyMsgHandler", "pagePath is null");
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        java.lang.String g18 = x51.j1.g(j4Var.f459091e);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f459101r);
        boolean z17 = o27.m124847x74d37ac6() > 0;
        o27.o1(j4Var.f459101r);
        o27.e1(c01.w9.m(g18, j4Var.f459098o));
        o27.m124850x7650bebc(872415281);
        o27.d1(g17);
        o27.j1(0);
        o27.r1(3);
        o27.u1("appbrand_notify_message");
        o27.u3(j4Var.f459099p);
        if (c01.w9.v("appbrand_notify_message") == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAppBrandNotifyMsgHandler", "empty appbrand notify message, insert tips message");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.m124850x7650bebc(872415281);
            f9Var.u1("appbrand_notify_message");
            f9Var.d1("");
            f9Var.e1(o27.mo78012x3fdd41df() - 1);
            f9Var.j1(2);
            f9Var.r1(4);
            c01.w9.x(f9Var);
        }
        c01.w9.n(o27, p0Var);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f459101r, o27);
        } else {
            c01.w9.x(o27);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrand_notify_message");
        if (p17 != null) {
            p17.c2(134217728);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, "appbrand_notify_message", true, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
        java.lang.String str6 = i5Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var).f156580d : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        g0Var.d(19724, 3, 0, 0, 0, 0, null, 0, 0, 0, str4, str5, null, str3, 0, null, str2.replaceAll("[_a-zA-Z0-9]", "*"), 0, null, null, str6);
        return null;
    }
}
