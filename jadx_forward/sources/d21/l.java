package d21;

/* loaded from: classes5.dex */
public class l implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).equals("NewXmlUpgradeAssociateChatRoom")) {
            if (map == null) {
                return null;
            }
            if (!map.containsKey(".sysmsg.NewXmlUpgradeAssociateChatRoom.text")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "no contains text");
                return null;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.text");
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.roomname");
            java.lang.String str4 = str3 != null ? str3 : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s ", str4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str2));
                return null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.j1(0);
            f9Var.u1(str4);
            f9Var.r1(3);
            f9Var.d1(str2);
            f9Var.e1(c01.w9.m(str4, java.lang.System.currentTimeMillis() / 1000));
            f9Var.m124850x7650bebc(10000);
            f9Var.f1(f9Var.w0() | 8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s msgId:%s", str4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str2), java.lang.Long.valueOf(c01.w9.x(f9Var)));
            return null;
        }
        if (!"mmchatroombarannouncememt".equals(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459091e);
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g18 = x51.j1.g(j4Var.f459092f);
        if (c01.z1.r().equals(g17)) {
            a3Var = a17.z0(g18);
            if (a3Var == null) {
                a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
                a3Var.f69088x37548063 = g18;
            }
            a3Var.f69091xdb3bd03d = g17;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(g17);
            if (z07 == null) {
                z07 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
                z07.f69088x37548063 = g17;
            }
            a3Var = z07;
            a3Var.f69091xdb3bd03d = c01.w9.s(j4Var.f459094h.f454289d);
        }
        a3Var.f69092x65ba57ac = j4Var.f459098o;
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.mmchatroombarannouncememt.content");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !str5.equals(a3Var.f69090xb4fe86b0)) {
            a3Var.f69083xf6ef0cb0 = 1;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            a3Var.f69083xf6ef0cb0 = 0;
        }
        a3Var.f69090xb4fe86b0 = str5;
        a17.mo11260x413cb2b4(a3Var);
        return null;
    }
}
