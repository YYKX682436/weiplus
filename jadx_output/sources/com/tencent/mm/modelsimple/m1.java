package com.tencent.mm.modelsimple;

/* loaded from: classes4.dex */
public class m1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, de0.i {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71372d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71373e;

    public m1(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ld4();
        lVar.f70665b = new r45.md4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/logoutwebwx";
        lVar.f70667d = 281;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71373e = a17;
        r45.ld4 ld4Var = (r45.ld4) a17.f70710a.f70684a;
        ld4Var.f379325d = i17;
        ld4Var.f379326e = i18;
        ld4Var.f379327f = i19;
        ld4Var.f379328g = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneWebWXLogout", "OpCode:%s, targetDeviceType:%s, targetClientVersion:%s uuid:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71372d = u0Var;
        return dispatch(sVar, this.f71373e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 281;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f71372d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
