package z12;

/* loaded from: classes4.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550888d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550889e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f550890f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f550891g;

    public r(java.lang.String str, byte[] bArr) {
        this.f550890f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.te3();
        lVar.f152198b = new r45.ue3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
        lVar.f152200d = 299;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550888d = lVar.a();
        this.f550890f = bArr;
        this.f550891g = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550889e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550888d;
        r45.te3 te3Var = (r45.te3) oVar.f152243a.f152217a;
        byte[] bArr = this.f550890f;
        if (bArr != null) {
            te3Var.f467884e = x51.j1.a(bArr);
        } else {
            te3Var.f467884e = new r45.cu5();
        }
        te3Var.f467883d = this.f550891g;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 299;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.cu5 cu5Var = ((r45.ue3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f468831f;
        if (cu5Var != null) {
            this.f550890f = x51.j1.d(cu5Var);
        }
        this.f550889e.mo815x76e0bfae(i18, i19, str, this);
    }
}
