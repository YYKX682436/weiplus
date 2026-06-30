package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes4.dex */
public class x0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264708d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264709e;

    public x0(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u3();
        lVar.f152198b = new r45.v3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        lVar.f152200d = 2500;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264708d = a17;
        r45.u3 u3Var = (r45.u3) a17.f152243a.f152217a;
        u3Var.f468510h = str;
        u3Var.f468506d = str2;
        u3Var.f468507e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        u3Var.f468509g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264709e = u0Var;
        return mo9409x10f9447a(sVar, this.f264708d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2500;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f264709e.mo815x76e0bfae(i18, i19, str, this);
    }

    public x0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u3();
        lVar.f152198b = new r45.v3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        lVar.f152200d = 2500;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264708d = a17;
        r45.u3 u3Var = (r45.u3) a17.f152243a.f152217a;
        u3Var.f468510h = str;
        u3Var.f468506d = str2;
        u3Var.f468508f = str3;
        u3Var.f468509g = i17;
    }
}
