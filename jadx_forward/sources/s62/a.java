package s62;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484938d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f484939e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f484940f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f484941g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f484942h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eq3 f484943i;

    public a(java.lang.String appid, java.lang.String packageName, java.lang.String signature, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        this.f484938d = appid;
        this.f484939e = packageName;
        this.f484940f = signature;
        this.f484941g = u0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f484942h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.dq3 dq3Var = new r45.dq3();
        dq3Var.f454197d = this.f484938d;
        dq3Var.f454198e = this.f484939e;
        dq3Var.f454199f = this.f484940f;
        lVar.f152197a = dq3Var;
        r45.eq3 eq3Var = new r45.eq3();
        this.f484943i = eq3Var;
        lVar.f152198b = eq3Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/getuserauth";
        lVar.f152200d = 2711;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2711;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f484941g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f484942h;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
