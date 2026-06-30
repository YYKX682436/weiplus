package ks3;

/* loaded from: classes2.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f393198d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f393199e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f393200f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f393201g;

    public f0(boolean z17, java.lang.String str) {
        this.f393201g = "";
        this.f393200f = z17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f393201g = str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new ks3.r0();
        lVar.f152198b = new ks3.s0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/switchpushmail";
        lVar.f152200d = 129;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f393199e = a17;
        ks3.r0 r0Var = (ks3.r0) a17.f152243a.f152217a;
        r0Var.f393277d = this.f393200f ? 1 : 2;
        r0Var.f393278e = this.f393201g;
        this.f393198d = u0Var;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 129;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(17, java.lang.Integer.valueOf(((ks3.s0) this.f393199e.f152244b.f152233a).f393281d));
        }
        m48024x6b3684de(i17);
        this.f393198d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}
