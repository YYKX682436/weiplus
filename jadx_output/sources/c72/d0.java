package c72;

/* loaded from: classes12.dex */
public class d0 extends c72.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f39546g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f39547h;

    public d0(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        c72.o oVar = new c72.o();
        this.f39546g = oVar;
        this.f39547h = str;
        r45.wh4 wh4Var = ((c72.k) oVar.getReqObj()).f39556a;
        wh4Var.f389164i = str2;
        wh4Var.f389161f = java.lang.String.valueOf(j17);
        wh4Var.f389163h = str4;
        wh4Var.f389162g = str3;
        wh4Var.f389159d = str5;
        wh4Var.f389160e = str6;
    }

    @Override // c72.v
    public int H(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return dispatch(sVar, this.f39546g, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.tencent.mm.network.v0 v0Var) {
        return null;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f39594e.onSceneEnd(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 12106;
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
