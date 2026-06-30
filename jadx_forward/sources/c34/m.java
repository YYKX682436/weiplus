package c34;

/* loaded from: classes11.dex */
public class m extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f119746d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f119747e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f119748f;

    /* renamed from: g, reason: collision with root package name */
    public int f119749g;

    /* renamed from: h, reason: collision with root package name */
    public int f119750h;

    public m(byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q36();
        lVar.f152198b = new r45.r36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/shakeget";
        lVar.f152200d = 162;
        lVar.f152201e = 57;
        lVar.f152202f = 1000000057;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f119747e = a17;
        r45.q36 q36Var = (r45.q36) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        q36Var.f465166d = cu5Var;
        q36Var.f465167e = 1;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.mo14344x5f01b1f6());
            q36Var.f465169g = cu5Var3;
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f119746d = u0Var;
        return mo9409x10f9447a(sVar, this.f119747e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 162;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.r36 r36Var = (r45.r36) this.f119747e.f152244b.f152233a;
        this.f119748f = new java.util.LinkedList();
        this.f119749g = r36Var.f466043g;
        this.f119750h = r36Var.f466044h;
        int i27 = r36Var.f466040d;
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        if (i27 >= 1) {
            c34.s Ni = c34.h0.Ni();
            Ni.L0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewShakeItemStorage", "delOldRecord count:" + i27);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
            sb6.append(100 > i27 ? 100 - i27 : 0);
            sb6.append(" )");
            if (Ni.f119773d.A("shakeitem1", sb6.toString())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:" + i27);
                Ni.m145262xf35bbb4();
            }
            for (int i28 = i27 - 1; i28 >= 0; i28--) {
                java.lang.String r17 = c01.z1.r();
                java.util.LinkedList linkedList = r36Var.f466041e;
                if (!r17.equals(((r45.p36) linkedList.get(i28)).f464237d)) {
                    qk.o b17 = r01.q3.cj().b1(((r45.p36) linkedList.get(i28)).f464237d);
                    b17.f66748xdec927b = ((r45.p36) linkedList.get(i28)).f464237d;
                    b17.f66736x6bad7fc0 = ((r45.p36) linkedList.get(i28)).C;
                    r45.va0 va0Var = ((r45.p36) linkedList.get(i28)).D;
                    if (va0Var != null) {
                        b17.f66733x6baace8e = va0Var.f469554d;
                        b17.f66735x6bac33d0 = va0Var.f469556f;
                        b17.f66734xea1bd3d4 = va0Var.f469557g;
                        b17.f66740x26b3182a = va0Var.f469555e;
                    }
                    if (!r01.q3.cj().mo11260x413cb2b4(b17)) {
                        r01.q3.cj().mo880xb970c2b9(b17);
                    }
                }
                c34.r rVar = new c34.r((r45.p36) linkedList.get(i28));
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var.f152062a = rVar.f66444xdec927b;
                r0Var.f152067f = rVar.f66427x24cdac72 > 0 ? 1 : 0;
                r0Var.f152063b = rVar.f66428xb8ff7470;
                r0Var.f152066e = ((r45.p36) linkedList.get(i28)).A;
                r0Var.f152065d = ((r45.p36) linkedList.get(i28)).B;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                r0Var.f152070i = -1;
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17;
                rVar.f66435x13320505 = k4Var.h(rVar.f66444xdec927b) ? 1 : 0;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = k4Var.n(rVar.f66444xdec927b, true);
                if (n17 != null && ((int) n17.E2) > 0) {
                    Ni.D0(n17.d1());
                    Ni.D0(n17.J0());
                }
                Ni.J0(rVar, false);
                c01.d9.b().getClass();
                gm0.j1.i();
                gm0.j1.b().c();
                g81.e.Ai().wi().y0(rVar.f66444xdec927b, this.f119749g, ((r45.p36) linkedList.get(i28)).E);
                rVar.f119771x0 = this.f119749g;
                ((java.util.LinkedList) this.f119748f).add(rVar);
            }
        }
        this.f119746d.mo815x76e0bfae(i18, i19, str, this);
    }
}
