package com.tencent.mm.modelsimple;

/* loaded from: classes4.dex */
public class f1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71320d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71321e;

    public f1(java.lang.String str, java.lang.String str2, int i17, r45.cu5 cu5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p26();
        lVar.f70665b = new r45.q26();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newsetpasswd";
        lVar.f70667d = 383;
        lVar.f70668e = 180;
        lVar.f70669f = 1000000180;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71321e = a17;
        r45.p26 p26Var = (r45.p26) a17.f70710a.f70684a;
        p26Var.f382684d = com.tencent.mm.sdk.platformtools.t8.A(str);
        p26Var.f382685e = str2;
        p26Var.f382687g = i17;
        p26Var.f382686f = cu5Var;
        com.tencent.mm.sdk.platformtools.t8.j(x51.j1.d(cu5Var));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71320d = u0Var;
        return dispatch(sVar, this.f71321e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 383;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f71320d.onSceneEnd(i18, i19, str, this);
    }
}
