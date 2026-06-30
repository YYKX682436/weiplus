package com.tencent.mm.modelsimple;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71365d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71366e = new com.tencent.mm.modelbase.l1();

    public l0(int i17) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71365d = u0Var;
        return dispatch(sVar, this.f71366e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 381;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean needCheckCallback() {
        return false;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f71365d.onSceneEnd(i18, i19, str, this);
    }
}
