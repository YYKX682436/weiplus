package n41;

/* loaded from: classes5.dex */
public class i implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "onNewXmlReceived() ");
        if (map != null) {
            r45.j4 j4Var = p0Var.f152259a;
            int i17 = j4Var.f459093g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (!(i17 == 10002)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
                return;
            }
            java.lang.String g17 = x51.j1.g(j4Var.f459094h);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "msg content is null");
                return;
            }
            java.lang.String g18 = x51.j1.g(j4Var.f459091e);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f459101r);
            boolean z18 = o27.m124847x74d37ac6() > 0;
            o27.o1(j4Var.f459101r);
            o27.e1(c01.w9.m(g18, j4Var.f459098o));
            o27.m124850x7650bebc(10002);
            o27.d1(g17);
            o27.j1(0);
            o27.u1(g18);
            o27.u3(j4Var.f459099p);
            o27.l1(o27.F & (-129));
            c01.w9.n(o27, p0Var);
            if (z18) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f459101r, o27);
            } else {
                c01.w9.x(o27);
            }
        }
    }
}
