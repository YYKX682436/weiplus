package er3;

/* loaded from: classes4.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f337558d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f337559e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f337560f;

    public d(java.lang.String str, java.lang.String str2) {
        this.f337560f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ks3();
        lVar.f152198b = new r45.ls3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getwburl";
        lVar.f152200d = 205;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f337559e = a17;
        r45.ks3 ks3Var = (r45.ks3) a17.f152243a.f152217a;
        ks3Var.f460453e = str2;
        java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(46, null);
        str3 = str3 == null ? "" : str3;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str3));
        ks3Var.f460452d = cu5Var;
        java.lang.String str4 = (java.lang.String) c01.d9.b().p().l(72, null);
        java.lang.String str5 = str4 != null ? str4 : "";
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str5));
        ks3Var.f460456h = cu5Var2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f337558d = u0Var;
        return mo9409x10f9447a(sVar, this.f337559e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 205;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = ((r45.ls3) this.f337559e.f152244b.f152233a).f461332d;
        this.f337558d.mo815x76e0bfae(i18, i19, str, this);
    }
}
