package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class s0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.t0 f71409d;

    public s0(com.tencent.mm.modelsimple.t0 t0Var) {
        this.f71409d = t0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.modelsimple.t0 t0Var = this.f71409d;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.v0 v0Var = t0Var.f71415e;
            v0Var.doScene(v0Var.dispatcher(), t0Var.f71415e.f71426d);
        } else {
            com.tencent.mm.modelsimple.v0 v0Var2 = t0Var.f71415e;
            v0Var2.f71426d.onSceneEnd(i17, i18, "", v0Var2);
        }
    }
}
