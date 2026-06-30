package oh1;

/* loaded from: classes9.dex */
public enum t1 implements vg3.q4 {
    INSTANCE;

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var;
        java.lang.String Q0;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17;
        if (str == null || !str.equals("subscribesysmsg")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSubscribeSysmsgHandler", "subType is err, return");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey is null, return");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeSysmsgHandler", "consumeNewXml subType:%s", str);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.subscribesysmsg.content_template.link_list.link.updatable_msg_type"), 0);
        if (P != 1) {
            tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(str2);
            if (Ai == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s wxaUpdateableMsg is null, ingore", str2);
                return null;
            }
            int i17 = Ai.f66299x9ac5f93a;
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s btnState:%d msgState:%d ingore", str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(Ai.f66302xd09abf35));
                return null;
            }
        }
        if (p0Var == null || (j4Var = p0Var.f152259a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSubscribeSysmsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        java.lang.String g18 = x51.j1.g(j4Var.f459091e);
        java.lang.String g19 = x51.j1.g(j4Var.f459092f);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f459101r);
        boolean z17 = o27.m124847x74d37ac6() > 0;
        o27.o1(j4Var.f459101r);
        if (!p0Var.f152260b || !p0Var.f152262d) {
            o27.e1(c01.w9.m(g18, j4Var.f459098o));
        }
        o27.m124850x7650bebc(603979825);
        o27.d1(g17);
        o27.j1(0);
        o27.r1(3);
        if (g18.equals(c01.z1.r())) {
            o27.u1(g19);
        } else {
            o27.u1(g18);
        }
        o27.u3(j4Var.f459099p);
        c01.w9.n(o27, p0Var);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f459101r, o27);
        } else {
            c01.w9.x(o27);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeSysmsgHandler", "consumeNewXml msgContent:%s", g17);
        if (P == 0 && (p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p((Q0 = o27.Q0()))) != null) {
            g95.u.i(o27, 13);
            p17.c2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeSysmsgHandler", "username:%s ok:%b", Q0, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, Q0, true, true)));
        }
        return null;
    }
}
