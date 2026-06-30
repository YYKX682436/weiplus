package dp3;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f323752d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f323753e;

    public l(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ml0();
        lVar.f152198b = new r45.nl0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/evaluateorder";
        lVar.f152200d = 583;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f323753e = a17;
        r45.ml0 ml0Var = (r45.ml0) a17.f152243a.f152217a;
        ml0Var.f462155d = str;
        ml0Var.f462156e = str2;
        ml0Var.f462157f = i17;
        ml0Var.f462158g = at4.g0.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f323752d = u0Var;
        return mo9409x10f9447a(sVar, this.f323753e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 583;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        if (i18 == 0 && i19 == 0) {
        }
        this.f323752d.mo815x76e0bfae(i18, i19, str, this);
    }
}
