package on;

/* loaded from: classes5.dex */
public class d implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        new java.util.LinkedList();
        new java.util.LinkedList();
        new java.util.LinkedList();
        try {
            if (map == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] values == null ");
                return null;
            }
            java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459091e);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] type:%s, values size:%s", "", java.lang.Integer.valueOf(map.size()));
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.confirm_username");
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.newmsgid"), 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] mConfirmUsername:%s, mDisableMsgId:%s username:%s", str2, java.lang.Long.valueOf(V), g17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[handle] username is null!");
                return null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, V);
            if (o27 != null && o27.m124847x74d37ac6() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o27.Q0())) {
                o27.l1(o27.F | 128);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(o27.I0(), o27);
            }
            p75.n0 n0Var = dm.w9.f322399o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.d dVar = dm.w9.f322401q;
            p75.y yVar = new p75.y(dVar.j(g17));
            yVar.f(dm.w9.f322402r.i(java.lang.Long.valueOf(V)));
            p75.n0 n0Var2 = dm.w9.f322399o;
            p75.i0 g18 = n0Var2.g(linkedList);
            g18.f434190d = yVar;
            g18.f434192f = linkedList2;
            g18.f434193g = linkedList3;
            dm.w9 w9Var = (dm.w9) g18.a().o(gm0.j1.u().f354686f, dm.w9.class);
            if (w9Var == null) {
                return null;
            }
            w9Var.f69031x29d3a50c = 1;
            w9Var.m125665xee5c84a2(gm0.j1.u().f354686f, true);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            p75.y yVar2 = new p75.y(dVar.j(g17));
            yVar2.f(dm.w9.f322404t.i(0).c(dm.w9.f322403s.i(0)));
            linkedList5.add(dm.w9.f322405u.u());
            p75.i0 g19 = n0Var2.g(linkedList4);
            g19.f434190d = yVar2;
            g19.f434192f = linkedList5;
            g19.f434193g = linkedList6;
            java.util.List k17 = g19.a().k(gm0.j1.u().f354686f, dm.w9.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(g17);
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            p17.Z1(arrayList.size());
            if (arrayList.isEmpty()) {
                g95.u.l(g17, 7);
            } else {
                g95.u.j(g17, 7);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "DisableChatroomAccessVerifyNewXmlMsg cvs.setUnReadInvite:%s", java.lang.Integer.valueOf(arrayList.size()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, g17);
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
