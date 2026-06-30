package kn;

/* loaded from: classes4.dex */
public class p extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390977d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390978e;

    public p(java.lang.String str, java.util.List list, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vb0();
        lVar.f152198b = new r45.wb0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/delchatroommember";
        lVar.f152200d = 179;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390978e = a17;
        r45.vb0 vb0Var = (r45.vb0) a17.f152243a.f152217a;
        vb0Var.f469603f = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.gc0 gc0Var = new r45.gc0();
            gc0Var.f456613d = x51.j1.i(str2);
            linkedList.add(gc0Var);
        }
        vb0Var.f469602e = linkedList;
        vb0Var.f469601d = linkedList.size();
        vb0Var.f469604g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390977d = u0Var;
        return mo9409x10f9447a(sVar, this.f390978e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 179;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f390978e;
        r45.vb0 vb0Var = (r45.vb0) oVar.f152243a.f152217a;
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        r45.wb0 wb0Var = (r45.wb0) nVar.f152233a;
        if (nVar.mo150578x7f2fddf8() != 0) {
            this.f390977d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = vb0Var.f469603f;
        if (!c01.v1.B(str2) || wb0Var.f470559d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + str2 + "] listCnt:" + wb0Var.f470559d);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str2);
            java.util.List a18 = com.p314xaae8f345.mm.p2621x8fb0427b.a3.a1(z07.f69099x6941929d);
            java.util.LinkedList linkedList = (java.util.LinkedList) a18;
            linkedList.size();
            java.util.Iterator it = wb0Var.f470560e.iterator();
            while (it.hasNext()) {
                linkedList.remove(x51.j1.g(((r45.hc0) it.next()).f457567d));
            }
            linkedList.size();
            z07.U0(a18);
            z07.f69094xd1f9ba88 = c01.v1.j(a18, str2);
            z07.f69098xbcb1bed0 = linkedList.size();
            a17.mo11260x413cb2b4(z07);
        }
        this.f390977d.mo815x76e0bfae(i18, i19, str, this);
    }
}
