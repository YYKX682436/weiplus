package kn;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390967d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390968e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f390969f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f390970g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f390971h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f390972i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f390973m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f390974n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390975o;

    /* renamed from: p, reason: collision with root package name */
    public int f390976p = 0;

    public o(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3) {
        if (list != null && list.size() > 0) {
        }
        list.size();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w90();
        lVar.f152198b = new r45.x90();
        lVar.f152199c = "/cgi-bin/micromsg-bin/createchatroom";
        lVar.f152200d = 119;
        lVar.f152201e = 37;
        lVar.f152202f = 1000000037;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390968e = a17;
        r45.w90 w90Var = (r45.w90) a17.f152243a.f152217a;
        w90Var.f470511d = x51.j1.i(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f460313d = x51.j1.i(str4);
            linkedList.add(kk4Var);
        }
        w90Var.f470513f = linkedList;
        w90Var.f470512e = linkedList.size();
        w90Var.f470517m = str2;
        w90Var.f470516i = str3;
        this.f390969f = new java.util.LinkedList();
        this.f390970g = new java.util.LinkedList();
        this.f390971h = new java.util.LinkedList();
        this.f390972i = new java.util.LinkedList();
        this.f390973m = new java.util.LinkedList();
        this.f390974n = new java.util.LinkedList();
        this.f390975o = "";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390967d = u0Var;
        return mo9409x10f9447a(sVar, this.f390968e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 119;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (!(bVar instanceof o65.d)) {
            return bVar;
        }
        o65.d dVar = (o65.d) bVar;
        dVar.f424751i = this.f390975o;
        dVar.f424744b = this.f390969f;
        dVar.f424750h = this.f390976p;
        dVar.f424743a = this.f390973m;
        dVar.f424745c = this.f390970g;
        dVar.f424746d = this.f390971h;
        dVar.f424748f = new java.util.LinkedList();
        dVar.f424747e = this.f390972i;
        dVar.f424749g = this.f390974n;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f390968e;
        r45.x90 x90Var = (r45.x90) oVar.f152244b.f152233a;
        this.f390975o = x51.j1.g(x90Var.f471422i);
        int mo150578x7f2fddf8 = oVar.f152244b.mo150578x7f2fddf8();
        this.f390976p = x90Var.f471420g;
        java.util.LinkedList linkedList = x90Var.f471421h;
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            int i28 = ((r45.lk4) linkedList.get(i27)).f461077e;
            if (i28 == 0) {
                ((java.util.LinkedList) this.f390973m).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 3) {
                r45.du5 du5Var = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390970g).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 1) {
                r45.du5 du5Var2 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390971h).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 2) {
                r45.du5 du5Var3 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390969f).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 == 4) {
                r45.du5 du5Var4 = ((r45.lk4) linkedList.get(i27)).f461076d;
                ((java.util.LinkedList) this.f390972i).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
            } else if (i28 != 5 && i28 != 6) {
                if (i28 == 10) {
                    r45.du5 du5Var5 = ((r45.lk4) linkedList.get(i27)).f461076d;
                    ((java.util.LinkedList) this.f390974n).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f461076d));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = " + i28);
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f390975o) && mo150578x7f2fddf8 == 0) {
            if (!x51.j1.g(x90Var.f471422i).toLowerCase().endsWith("@chatroom") || x90Var.f471420g == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + x90Var.f471422i + "] listCnt:" + x90Var.f471420g);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.M1(x51.j1.g(x90Var.f471417d));
                z3Var.R1(x51.j1.g(x90Var.f471418e));
                z3Var.S1(x51.j1.g(x90Var.f471419f));
                z3Var.X1(x51.j1.g(x90Var.f471422i));
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(z3Var.d1())) {
                    Bi.h0(z3Var);
                }
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var.f152062a = z3Var.d1();
                r0Var.f152066e = x90Var.f471424n;
                r0Var.f152065d = x90Var.f471425o;
                r0Var.f152063b = 3;
                r0Var.f152067f = 0;
                r0Var.f152070i = -1;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i29 = 0; i29 < linkedList.size(); i29++) {
                    if (((r45.lk4) linkedList.get(i29)).f461077e == 0) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(x51.j1.g(((r45.lk4) linkedList.get(i29)).f461076d), true);
                        if (((int) n17.E2) != 0) {
                            n17.G2();
                            Bi.p0(n17.d1(), n17);
                        } else {
                            c01.v1.H(n17, (r45.lk4) linkedList.get(i29));
                            Bi.h0(n17);
                        }
                        arrayList.add(n17.d1());
                    }
                }
                if (!arrayList.contains(c01.z1.r())) {
                    arrayList.add(c01.z1.r());
                    arrayList.contains(c01.z1.r());
                }
                c01.v1.t(z3Var.d1(), arrayList, c01.z1.r());
            }
        }
        this.f390967d.mo815x76e0bfae(i18, i19, str, this);
    }
}
