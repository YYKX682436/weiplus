package nt4;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f421379d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f421380e;

    public n(com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.r55();
        lVar.f152198b = new r45.s55();
        lVar.f152199c = mo149970xb5887636();
        lVar.f152200d = mo808xfb85f7b0();
        lVar.f152201e = 188;
        lVar.f152202f = 1000000188;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(c11302x8e12daf6.f33257xb3bbab20);
        lVar.f152204h = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f421380e = a17;
        r45.r55 r55Var = (r45.r55) a17.f152243a.f152217a;
        r55Var.f466085d = c11302x8e12daf6.f33251x58b7f1c;
        r55Var.f466086e = c11302x8e12daf6.f33256x94f8d403;
        r55Var.f466087f = c11302x8e12daf6.f33257xb3bbab20;
        r55Var.f466088g = c11302x8e12daf6.f33253x53ec53c2;
        r55Var.f466089h = c11302x8e12daf6.f33260x18638f6;
        r55Var.f466090i = c11302x8e12daf6.f33255x8f9828cb;
        r55Var.f466091m = c11302x8e12daf6.f33258x35ddbd;
        r55Var.f466092n = c11302x8e12daf6.f33259x128eba97;
        r55Var.f466093o = str;
        r55Var.f466096r = str2;
        r55Var.f466097s = str3;
        r55Var.f466094p = at4.g0.c();
        r55Var.f466098t = str4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f421379d = u0Var;
        return mo9409x10f9447a(sVar, this.f421380e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 397;
    }

    /* renamed from: getUri */
    public java.lang.String mo149970xb5887636() {
        return "/cgi-bin/mmpay-bin/payauthapp";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f421379d.mo815x76e0bfae(i18, i19, str, this);
    }
}
