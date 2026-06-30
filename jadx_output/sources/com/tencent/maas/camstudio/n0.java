package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class n0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.c0 f47969a;

    public n0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.c0 c0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47969a = c0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginRequestAIGCArg beginRequestAIGCArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginRequestAIGCArg) obj;
        com.tencent.maas.camstudio.c0 c0Var = this.f47969a;
        if (c0Var == null || beginRequestAIGCArg == null) {
            return;
        }
        ((yx0.m) c0Var).a(beginRequestAIGCArg.params);
    }

    public n0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.c0 c0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47969a = c0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginRequestAIGCArg beginRequestAIGCArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginRequestAIGCArg) obj;
        com.tencent.maas.camstudio.c0 c0Var = this.f47969a;
        if (c0Var == null || beginRequestAIGCArg == null) {
            return;
        }
        ((yx0.m) c0Var).a(beginRequestAIGCArg.params);
    }
}
