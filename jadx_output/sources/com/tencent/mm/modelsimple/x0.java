package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class x0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.y0 f71448d;

    public x0(com.tencent.mm.modelsimple.y0 y0Var) {
        this.f71448d = y0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.modelsimple.y0 y0Var = this.f71448d;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.z0 z0Var = y0Var.f71452e;
            z0Var.doScene(z0Var.dispatcher(), y0Var.f71452e.f71455d);
        } else {
            com.tencent.mm.modelsimple.z0 z0Var2 = y0Var.f71452e;
            z0Var2.f71455d.onSceneEnd(i17, i18, "", z0Var2);
        }
    }
}
