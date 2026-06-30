package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public final class k1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71361d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71362e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71363f;

    /* renamed from: g, reason: collision with root package name */
    public int f71364g;

    public k1(java.lang.String str, int i17) {
        jz5.g b17 = jz5.h.b(com.tencent.mm.modelsimple.j1.f71352d);
        this.f71363f = "";
        if (str == null) {
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        r45.wz5 wz5Var = new r45.wz5();
        wz5Var.f389603d = currentTimeMillis;
        wz5Var.f389605f = com.tencent.mm.protobuf.g.c(str);
        wz5Var.f389604e = i17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) b17).getValue();
        wz5Var.f389606g = com.tencent.mm.protobuf.g.b(o4Var != null ? o4Var.j(str) : null);
        com.tencent.mm.modelsimple.i1 i1Var = new com.tencent.mm.modelsimple.i1();
        this.f71362e = i1Var;
        o45.zg reqObj = i1Var.getReqObj();
        kotlin.jvm.internal.o.e(reqObj, "null cannot be cast to non-null type com.tencent.mm.protocal.MMTypingSend.Req");
        o45.ni niVar = (o45.ni) reqObj;
        byte[] byteArray = wz5Var.toByteArray();
        iz5.a.g(null, byteArray != null);
        niVar.f342986a = byteArray;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s autoAuth, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(autoAuth, "autoAuth");
        kotlin.jvm.internal.o.g(callback, "callback");
        autoAuth.toString();
        this.f71361d = callback;
        return dispatch(autoAuth, this.f71362e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 100017;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f71361d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public k1(o45.ah resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jz5.h.b(com.tencent.mm.modelsimple.j1.f71352d);
        this.f71363f = "";
        o45.oi oiVar = (o45.oi) resp;
        java.lang.String str = oiVar.f342992a;
        kotlin.jvm.internal.o.f(str, "getSender(...)");
        this.f71363f = str;
        this.f71364g = oiVar.f342993b;
    }
}
