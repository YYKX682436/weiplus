package an3;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f90403d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f90404e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f90405f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f90406g;

    public g(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i17);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h64();
        lVar.f152198b = new r45.i64();
        lVar.f152199c = "/cgi-bin/micromsg-bin/joinlbsroom";
        lVar.f152200d = 376;
        lVar.f152201e = 183;
        lVar.f152202f = 1000000183;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f90404e = a17;
        r45.h64 h64Var = (r45.h64) a17.f152243a.f152217a;
        h64Var.f457404d = i17;
        h64Var.f457405e = f17;
        h64Var.f457406f = f18;
        h64Var.f457407g = i18;
        h64Var.f457408h = str;
        h64Var.f457409i = str2;
        h64Var.f457410m = i19;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f90403d = u0Var;
        return mo9409x10f9447a(sVar, this.f90404e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 376;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f90404e.f152243a.f152217a;
        int i27 = ((r45.h64) fVar).f457404d;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.i64 i64Var = (r45.i64) oVar.f152244b.f152233a;
        if (i18 != 0) {
            this.f90403d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        if (((r45.h64) fVar).f457404d == 1) {
            this.f90405f = i64Var.f458294d;
            this.f90406g = i64Var.f458295e;
            this.f90403d.mo815x76e0bfae(i18, i19, str, this);
        } else if (((r45.h64) fVar).f457404d == 2) {
            an3.e.b(((r45.h64) oVar.f152243a.f152217a).f457411n);
            this.f90403d.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public g(int i17, java.lang.String str, int i18, int i19) {
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i17);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h64();
        lVar.f152198b = new r45.i64();
        lVar.f152199c = "/cgi-bin/micromsg-bin/joinlbsroom";
        lVar.f152200d = 376;
        lVar.f152201e = 183;
        lVar.f152202f = 1000000183;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f90404e = a17;
        r45.h64 h64Var = (r45.h64) a17.f152243a.f152217a;
        h64Var.f457405e = 0.0f;
        h64Var.f457406f = 0.0f;
        h64Var.f457407g = 0;
        h64Var.f457410m = 0;
        h64Var.f457408h = "";
        h64Var.f457409i = "";
        h64Var.f457404d = i17;
        h64Var.f457411n = str;
        h64Var.f457413p = i18;
        h64Var.f457412o = i19;
    }
}
