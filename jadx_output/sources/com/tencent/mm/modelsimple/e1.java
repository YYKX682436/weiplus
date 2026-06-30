package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public class e1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, de0.g {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71316d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71317e;

    public e1(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelsimple.z zVar = new com.tencent.mm.modelsimple.z();
        this.f71317e = zVar;
        o45.di diVar = (o45.di) zVar.getReqObj();
        diVar.f342921a.f386860d = c01.z1.r();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17 == 0 ? 64 : i17);
        sb6.append(";");
        sb6.append(str == null ? "" : str);
        java.lang.String sb7 = sb6.toString();
        r45.ty5 ty5Var = diVar.f342921a;
        ty5Var.f386861e = sb7;
        java.lang.String str3 = ty5Var.f386861e;
        ty5Var.f386862f = 64;
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        ty5Var.f386864h = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71316d = u0Var;
        return dispatch(sVar, this.f71317e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 26;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f71316d.onSceneEnd(i18, i19, v0Var.getRespObj().getErrMsg(), this);
    }

    public e1(java.lang.String str) {
        com.tencent.mm.modelsimple.z zVar = new com.tencent.mm.modelsimple.z();
        this.f71317e = zVar;
        o45.di diVar = (o45.di) zVar.getReqObj();
        diVar.f342921a.f386860d = c01.z1.r();
        r45.ty5 ty5Var = diVar.f342921a;
        ty5Var.f386861e = str;
        ty5Var.f386863g = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
        ty5Var.f386862f = 128;
    }

    public e1(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.tencent.mm.modelsimple.z zVar = new com.tencent.mm.modelsimple.z();
        this.f71317e = zVar;
        o45.di diVar = (o45.di) zVar.getReqObj();
        diVar.f342921a.f386860d = c01.z1.r();
        r45.ty5 ty5Var = diVar.f342921a;
        ty5Var.f386861e = str;
        ty5Var.f386863g = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
        int i17 = (z17 ? 1 : 0) | 0 | (z18 ? 2 : 0) | (z19 ? 4 : 0) | (z27 ? 8 : 0);
        iz5.a.g("empty sendcard", i17 != 0);
        ty5Var.f386862f = i17;
    }
}
