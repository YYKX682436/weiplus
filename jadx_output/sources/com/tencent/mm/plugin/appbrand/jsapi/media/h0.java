package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f81830b;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f81829a = t0Var;
        this.f81830b = c0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81829a;
        int i17 = t0Var.f82063d;
        com.tencent.mm.plugin.appbrand.jsapi.media.m7[] m7VarArr = com.tencent.mm.plugin.appbrand.jsapi.media.m7.f81942e;
        int i18 = 2;
        if (i17 == 2) {
            i18 = 1;
        } else if (i17 != 1) {
            i18 = 0;
        }
        java.lang.Object b17 = com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams(i18, t0Var.f82065f, t0Var.f82062c == com.tencent.mm.plugin.appbrand.jsapi.media.k7.f81905f.h()), com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.class);
        kotlin.jvm.internal.o.f(b17, "invokeSync(...)");
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) b17;
        sightParams.f148828r = false;
        sightParams.f148829s = true;
        if (!this.f81830b.f310112d) {
            java.lang.String K = lp0.b.K();
            if (!com.tencent.mm.vfs.w6.j(K)) {
                com.tencent.mm.vfs.w6.u(K);
            }
            sightParams.f148820g = lp0.b.K() + sightParams.f148822i + ".mp4";
            sightParams.f148823m = lp0.b.K() + sightParams.f148822i + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        }
        return sightParams;
    }
}
