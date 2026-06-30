package l41;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397403d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397404e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397405f;

    public n(java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.o4();
        lVar.f152198b = new r45.p4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addopenimchatroommember";
        lVar.f152200d = gd1.u.f69813x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397404e = a17;
        this.f397405f = str;
        r45.o4 o4Var = (r45.o4) a17.f152243a.f152217a;
        o4Var.f463428d = str;
        o4Var.f463429e = linkedList;
        o4Var.f463430f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "roomname: %s, size:%s, desc:%s", str, java.lang.Integer.valueOf(linkedList.size()), str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397403d = u0Var;
        return mo9409x10f9447a(sVar, this.f397404e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gd1.u.f69813x366c91de;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        r45.p4 p4Var;
        if (bVar == null || !(bVar instanceof o65.d) || (p4Var = (r45.p4) this.f397404e.f152244b.f152233a) == null) {
            return bVar;
        }
        t41.e eVar = new t41.e();
        eVar.a(p4Var.f464257d);
        o65.d dVar = (o65.d) bVar;
        dVar.f424751i = this.f397405f;
        java.util.List list = eVar.f497021a;
        dVar.f424750h = ((java.util.ArrayList) list).size();
        dVar.f424743a = list;
        dVar.f424744b = eVar.f497022b;
        dVar.f424745c = eVar.f497023c;
        dVar.f424746d = eVar.f497024d;
        dVar.f424748f = eVar.f497026f;
        dVar.f424747e = eVar.f497025e;
        dVar.f424749g = eVar.f497027g;
        dVar.f424752j = p4Var.f464258e;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.String str2 = this.f397405f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", valueOf, valueOf2, str, str2);
        if (v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() == 0) {
            r45.p4 p4Var = (r45.p4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || p4Var.f464257d.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "AddChatroomMember: bad room:[" + str2 + "] listCnt:" + p4Var.f464257d.size());
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.util.Iterator it = p4Var.f464257d.iterator();
                while (it.hasNext()) {
                    r45.yz4 yz4Var = (r45.yz4) it.next();
                    if (yz4Var.f473069e == 0) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(yz4Var.f473068d, true);
                        if (((int) n17.E2) != 0) {
                            n17.G2();
                            Bi.p0(n17.d1(), n17);
                        } else {
                            n17.X1(yz4Var.f473068d);
                            n17.M1(yz4Var.f473070f);
                            Bi.h0(n17);
                        }
                        arrayList.add(n17.d1());
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                    c01.v1.t(str2, arrayList, null);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397403d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
