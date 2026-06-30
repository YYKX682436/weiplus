package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public final class r0 implements com.tencent.mm.plugin.appbrand.widget.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.s0 f87550a;

    public r0(com.tencent.mm.plugin.appbrand.pip.s0 s0Var) {
        this.f87550a = s0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.m
    public final void a(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.pip.s0 s0Var = this.f87550a;
        android.graphics.Point point = new android.graphics.Point(i17, i18);
        com.tencent.mm.plugin.appbrand.pip.x0 x0Var = (com.tencent.mm.plugin.appbrand.pip.x0) s0Var;
        x0Var.getClass();
        if (kotlin.jvm.internal.o.b(point, x0Var.f87566b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "saveStablePos, same pos");
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.pip.PipStablePos(x0Var.f87552a, point), com.tencent.mm.plugin.appbrand.pip.c1.class, new com.tencent.mm.plugin.appbrand.pip.w0(x0Var, point));
        }
    }
}
