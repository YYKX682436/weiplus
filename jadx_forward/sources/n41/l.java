package n41;

/* loaded from: classes4.dex */
public class l implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!str.equals("SendMsgFailed") || map == null) {
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.SendMsgFailed.newmsgid");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String trim = str3.trim();
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.SendMsgFailed.tousername");
            if (str4 != null) {
                str2 = str4;
            }
            java.lang.String trim2 = str2.trim();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "msgId:%s toUsername:%s", trim, trim2);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(trim2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(trim));
            if (o27 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "info is null");
            } else {
                o27.r1(5);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "consumeNewXml Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}
