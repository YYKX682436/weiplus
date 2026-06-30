package l41;

/* loaded from: classes4.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397442d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397443e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397444f;

    public r(java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lc0();
        lVar.f152198b = new r45.mc0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/delopenimchatroommember";
        lVar.f152200d = 943;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397443e = a17;
        this.f397444f = str;
        r45.lc0 lc0Var = (r45.lc0) a17.f152243a.f152217a;
        lc0Var.f460831d = str;
        lc0Var.f460832e = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "roomname: %s, size:%d", str, java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397442d = u0Var;
        return mo9409x10f9447a(sVar, this.f397443e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 943;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.String str2 = this.f397444f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname: %s", valueOf, valueOf2, str, str2);
        if (v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() == 0) {
            r45.mc0 mc0Var = (r45.mc0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || mc0Var.f461893d.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember: room:[" + str2 + "] listCnt:" + mc0Var.f461893d.size());
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str2);
                java.util.List a18 = com.p314xaae8f345.mm.p2621x8fb0427b.a3.a1(z07.f69099x6941929d);
                java.util.LinkedList linkedList = (java.util.LinkedList) a18;
                linkedList.size();
                java.util.Iterator it = mc0Var.f461893d.iterator();
                while (it.hasNext()) {
                    linkedList.remove(((r45.yz4) it.next()).f473068d);
                }
                linkedList.size();
                ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                java.lang.String i27 = c01.v1.i(a18, -1, str2);
                z07.U0(a18);
                z07.f69094xd1f9ba88 = i27;
                a17.mo11260x413cb2b4(z07);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397442d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
