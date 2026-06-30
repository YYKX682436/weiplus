package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class r0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.g0 f47984a;

    public r0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.g0 g0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47984a = g0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.ProgressArg progressArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.ProgressArg) obj;
        com.tencent.maas.camstudio.g0 g0Var = this.f47984a;
        if (g0Var == null || progressArg == null) {
            return;
        }
        ym5.a1.f(new wx0.n0(((wx0.o0) g0Var).f450520a, progressArg.progress));
    }

    public r0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.g0 g0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47984a = g0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.ProgressArg progressArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.ProgressArg) obj;
        com.tencent.maas.camstudio.g0 g0Var = this.f47984a;
        if (g0Var == null || progressArg == null) {
            return;
        }
        ym5.a1.f(new wx0.n0(((wx0.o0) g0Var).f450520a, progressArg.progress));
    }
}
