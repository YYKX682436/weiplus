package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes4.dex */
public class d0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240371d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f240372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f240373f;

    /* renamed from: g, reason: collision with root package name */
    public final int f240374g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f240375h;

    public d0(java.lang.String str, int i17, java.lang.String str2) {
        this.f240373f = str;
        this.f240374g = i17;
        this.f240375h = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f240371d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tk();
        lVar.f152198b = new r45.uk();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
        lVar.f152200d = 1063;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240372e = a17;
        r45.tk tkVar = (r45.tk) a17.f152243a.f152217a;
        tkVar.f468044d = this.f240373f;
        tkVar.f468045e = this.f240374g;
        tkVar.f468046f = this.f240375h;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1063;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f240371d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.lang.String str;
        r45.tk tkVar = (r45.tk) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (tkVar.f468045e >= 0 && (str = tkVar.f468044d) != null && str.length() > 0) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", java.lang.Integer.valueOf(tkVar.f468045e));
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }
}
