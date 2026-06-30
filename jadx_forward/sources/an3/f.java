package an3;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, an3.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f90401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f90402e;

    public f(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneLbsP", "OpCode Error :" + i17);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f64();
        lVar.f152198b = new r45.g64();
        lVar.f152199c = "/cgi-bin/micromsg-bin/lbsfind";
        lVar.f152200d = 148;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f90402e = a17;
        r45.f64 f64Var = (r45.f64) a17.f152243a.f152217a;
        f64Var.f455570d = i17;
        f64Var.f455571e = f17;
        f64Var.f455572f = f18;
        f64Var.f455573g = i18;
        f64Var.f455574h = str;
        f64Var.f455575i = str2;
        f64Var.f455576m = i19;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.mo14344x5f01b1f6());
            f64Var.f455578o = cu5Var2;
        } catch (java.lang.Throwable unused) {
        }
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2001, f17, f18, i18);
    }

    public java.util.List H() {
        java.util.LinkedList<r45.b64> linkedList = ((r45.g64) this.f90402e.f152244b.f152233a).f456451e;
        if (linkedList != null) {
            gm0.j1.b().c();
            for (r45.b64 b64Var : linkedList) {
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(b64Var.f452083d, 18, b64Var.C);
            }
        }
        return linkedList;
    }

    public int I() {
        return ((r45.f64) this.f90402e.f152243a.f152217a).f455570d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f90401d = u0Var;
        return mo9409x10f9447a(sVar, this.f90402e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 148;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.g64 g64Var = (r45.g64) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i27 = 0; i27 < g64Var.f456451e.size(); i27++) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            java.util.LinkedList linkedList = g64Var.f456451e;
            r0Var.f152062a = ((r45.b64) linkedList.get(i27)).f452083d;
            r0Var.f152063b = ((r45.b64) linkedList.get(i27)).f452090n;
            r0Var.f152066e = ((r45.b64) linkedList.get(i27)).f452101y;
            r0Var.f152065d = ((r45.b64) linkedList.get(i27)).f452102z;
            r0Var.f152067f = 1;
            arrayList.add(r0Var);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().m0(arrayList);
        if (I() == 1 || I() == 3 || I() == 4) {
            if (i18 != 0 && i19 == -2001) {
                gm0.j1.u().c().w(8210, 0L);
                this.f90401d.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            gm0.j1.u().c().w(8210, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (g64Var.f456453g * 1000)));
        } else if (I() == 2) {
            gm0.j1.u().c().w(8210, 0L);
        }
        this.f90401d.mo815x76e0bfae(i18, i19, str, this);
    }
}
