package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public class r0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, de0.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71402e;

    public r0(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jd4();
        lVar.f70665b = new r45.kd4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/logout";
        lVar.f70667d = 282;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71402e = a17;
        ((r45.jd4) a17.f70710a.f70684a).f377725d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71401d = u0Var;
        return dispatch(sVar, this.f71402e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 282;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f71401d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
