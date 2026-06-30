package c72;

/* loaded from: classes8.dex */
public class z extends c72.v implements c72.c {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f39604g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f39605h = "";

    public z(long j17, java.lang.String str, java.lang.String str2) {
        c72.e eVar = new c72.e();
        this.f39604g = eVar;
        r45.hx6 hx6Var = ((c72.m) eVar.getReqObj()).f39558a;
        hx6Var.f376543d = c72.v.f39593f;
        hx6Var.f376544e = j17;
        hx6Var.f376547h = str2;
        hx6Var.f376546g = str;
    }

    @Override // c72.v
    public int H(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.network.v0 v0Var = this.f39604g;
        return dispatch(sVar, v0Var, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.tencent.mm.network.v0 v0Var) {
        return ((c72.n) v0Var.getRespObj()).f39559a.f377398e;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ix6 ix6Var;
        c72.n nVar = (c72.n) v0Var.getRespObj();
        if (i18 == 0 && i19 == 0) {
            r45.ix6 ix6Var2 = nVar.f39559a;
            boolean z17 = ix6Var2.f377399f == 0;
            this.f39605h = ix6Var2.f377397d;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(nVar.f39559a.f377399f), java.lang.Boolean.valueOf(true ^ com.tencent.mm.sdk.platformtools.t8.K0(this.f39605h)));
            i19 = nVar.f39559a.f377399f;
        } else if (nVar != null && (ix6Var = nVar.f39559a) != null && ix6Var.f377399f != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i19 = nVar.f39559a.f377399f;
        }
        this.f39594e.onSceneEnd(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.m) this.f39604g.getReqObj()).f39558a.f376543d = str;
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 930;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f39605h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }
}
