package l41;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397432d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397433e;

    public q(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ba0();
        lVar.f152198b = new r45.ca0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/createopenimchatroom";
        lVar.f152200d = 371;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397433e = a17;
        ((r45.ba0) a17.f152243a.f152217a).f452179d = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "create size:%d", java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397432d = u0Var;
        return mo9409x10f9447a(sVar, this.f397433e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 371;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        r45.ca0 ca0Var;
        if (bVar == null || !(bVar instanceof o65.d) || (ca0Var = (r45.ca0) this.f397433e.f152244b.f152233a) == null) {
            return bVar;
        }
        t41.e eVar = new t41.e();
        eVar.a(ca0Var.f452925e);
        o65.d dVar = (o65.d) bVar;
        dVar.f424751i = ca0Var.f452924d;
        java.util.List list = eVar.f497021a;
        dVar.f424750h = ((java.util.ArrayList) list).size();
        dVar.f424743a = list;
        dVar.f424744b = eVar.f497022b;
        dVar.f424745c = eVar.f497023c;
        dVar.f424746d = eVar.f497024d;
        dVar.f424748f = eVar.f497026f;
        dVar.f424749g = eVar.f497027g;
        dVar.f424747e = eVar.f497025e;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() == 0) {
            r45.ca0 ca0Var = (r45.ca0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ca0Var.f452924d)) {
                if (ca0Var.f452924d.toLowerCase().endsWith("@im.chatroom")) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var.X1(ca0Var.f452924d);
                    com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    if (!Bi.j0(z3Var.d1())) {
                        Bi.h0(z3Var);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ca0Var.f452927g)) {
                        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                        r0Var.f152062a = z3Var.d1();
                        r0Var.f152066e = ca0Var.f452926f;
                        r0Var.f152065d = ca0Var.f452927g;
                        r0Var.f152063b = 3;
                        r0Var.f152067f = 0;
                        r0Var.f152070i = -1;
                        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ca0Var.f452925e.iterator();
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
                    if (!arrayList.contains(c01.z1.r())) {
                        arrayList.add(c01.z1.r());
                        arrayList.contains(c01.z1.r());
                    }
                    rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                    java.lang.String d17 = z3Var.d1();
                    java.lang.String r17 = c01.z1.r();
                    ((c01.w1) eVar).getClass();
                    c01.v1.t(d17, arrayList, r17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "createChatroom: bad room:[" + ca0Var.f452924d + "]");
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397432d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
