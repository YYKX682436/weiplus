package vs3;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f521453d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f521454e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f521455f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f521456g;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rh6();
        lVar.f152198b = new r45.sh6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de;
        lVar.f152201e = 230;
        lVar.f152202f = 1000000230;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f521454e = a17;
        r45.rh6 rh6Var = (r45.rh6) a17.f152243a.f152217a;
        this.f521456g = str;
        rh6Var.f466411f = str;
        rh6Var.f466409d = str2;
        rh6Var.f466410e = str3;
        rh6Var.f466412g = str4;
        rh6Var.f466413h = bt4.f.b().c(str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f521453d = u0Var;
        return mo9409x10f9447a(sVar, this.f521454e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        this.f521455f = c19760x34448d56;
        r45.sh6 sh6Var = (r45.sh6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = sh6Var.f467272d;
            c19760x34448d56.f273649o = this.f521456g;
            c19760x34448d56.f273650p = sh6Var.f467273e;
            c19760x34448d56.f273647m = str2;
        }
        if (i19 == 0) {
            i19 = sh6Var.f467274f;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = sh6Var.f467275g;
        }
        this.f521455f.getClass();
        this.f521455f.f273654t = str != null ? str : "";
        this.f521453d.mo815x76e0bfae(i18, i19, str, this);
    }
}
