package c72;

/* loaded from: classes8.dex */
public class s extends c72.v implements c72.c {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f39588g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f39589h = "";

    public s(long j17, java.lang.String str, java.lang.String str2) {
        c72.d dVar = new c72.d();
        this.f39588g = dVar;
        r45.ln5 ln5Var = ((c72.i) dVar.getReqObj()).f39554a;
        ln5Var.f379664g = c72.v.f39593f;
        ln5Var.f379661d = j17;
        ln5Var.f379662e = str;
        ln5Var.f379663f = str2;
    }

    @Override // c72.v
    public int H(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.network.v0 v0Var = this.f39588g;
        return dispatch(sVar, v0Var, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.tencent.mm.network.v0 v0Var) {
        return ((c72.j) v0Var.getRespObj()).f39555a.f380695e;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.mn5 mn5Var;
        c72.j jVar = (c72.j) v0Var.getRespObj();
        if (i18 == 0 && i19 == 0) {
            r45.mn5 mn5Var2 = jVar.f39555a;
            int i27 = mn5Var2.f380696f;
            boolean z17 = i27 == 0;
            this.f39589h = mn5Var2.f380694d;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(jVar.f39555a.f380696f), java.lang.Boolean.valueOf(true ^ com.tencent.mm.sdk.platformtools.t8.K0(this.f39589h)));
            i19 = i27;
        } else if (jVar != null && (mn5Var = jVar.f39555a) != null && mn5Var.f380696f != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i19 = jVar.f39555a.f380696f;
        }
        this.f39594e.onSceneEnd(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.i) this.f39588g.getReqObj()).f39554a.f379664g = str;
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
        return this.f39589h;
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
