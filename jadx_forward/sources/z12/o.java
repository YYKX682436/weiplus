package z12;

/* loaded from: classes12.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550874d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550875e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550876f;

    public o(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.de3();
        lVar.f152198b = new r45.ee3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
        lVar.f152200d = 239;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550874d = lVar.a();
        this.f550876f = str;
    }

    public r45.ee3 H() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550874d;
        if (oVar == null) {
            return null;
        }
        return (r45.ee3) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550875e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550874d;
        r45.de3 de3Var = (r45.de3) oVar.f152243a.f152217a;
        de3Var.f453879d = this.f550876f;
        de3Var.f453880e = 0;
        de3Var.f453881f = null;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 239;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        z85.r rVar;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 Ai = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai();
            synchronized (Ai.f276696a) {
                rVar = Ai.f276705j;
            }
            r45.ee3 H = H();
            java.lang.String str2 = this.f550876f;
            rVar.z0(str2, H);
            y12.p.f540410a.e(H().f454890d, str2);
        }
        this.f550875e.mo815x76e0bfae(i18, i19, str, this);
    }
}
