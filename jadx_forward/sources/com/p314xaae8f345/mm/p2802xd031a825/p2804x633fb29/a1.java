package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes8.dex */
public class a1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295386d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f295387e;

    public a1(java.lang.String str) {
        this(str, null, null, -1, -1, -1);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295386d = u0Var;
        return mo9409x10f9447a(sVar, this.f295387e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60880xaa1da1d9;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f295386d.mo815x76e0bfae(i18, i19, str, this);
    }

    public a1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z65();
        lVar.f152198b = new r45.a75();
        lVar.f152199c = "/cgi-bin/mmpay-bin/paysubscribe";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60880xaa1da1d9;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str2);
        lVar.f152204h = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295387e = a17;
        r45.z65 z65Var = (r45.z65) a17.f152243a.f152217a;
        z65Var.f473279d = str;
        z65Var.f473285m = at4.g0.c();
        z65Var.f473280e = str3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            z65Var.f473281f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str2.getBytes());
        }
        if (i17 >= 0) {
            z65Var.f473282g = i17;
        }
        if (i18 >= 0) {
            z65Var.f473283h = i18;
        }
        if (i19 >= 0) {
            z65Var.f473284i = i19;
        }
    }
}
