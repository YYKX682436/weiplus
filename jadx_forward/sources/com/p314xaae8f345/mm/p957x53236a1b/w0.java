package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes2.dex */
public class w0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152975d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152976e;

    /* renamed from: f, reason: collision with root package name */
    public int f152977f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f152978g;

    public w0(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ih5();
        lVar.f152198b = new r45.jh5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/queryhaspasswd";
        lVar.f152200d = 255;
        lVar.f152201e = 132;
        lVar.f152202f = 1000000132;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152976e = a17;
        ((r45.ih5) a17.f152243a.f152217a).f458586d = i17;
        this.f152978g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152975d = u0Var;
        return mo9409x10f9447a(sVar, this.f152976e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 255;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f152975d.mo815x76e0bfae(i18, i19, str, this);
    }
}
