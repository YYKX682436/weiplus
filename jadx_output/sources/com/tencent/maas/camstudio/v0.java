package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class v0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.k0 f47989a;

    public v0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.k0 k0Var) {
        super(mJCamSession);
        this.f47989a = k0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.k0 k0Var;
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.UseTemplateCompleteArg useTemplateCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.UseTemplateCompleteArg) obj;
        if (useTemplateCompleteArg == null || (k0Var = this.f47989a) == null) {
            return;
        }
        k0Var.a(useTemplateCompleteArg.finishInfo, useTemplateCompleteArg.error);
    }

    public v0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.k0 k0Var) {
        super(mJCamoSession);
        this.f47989a = k0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.k0 k0Var;
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.UseTemplateCompleteArg useTemplateCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.UseTemplateCompleteArg) obj;
        if (useTemplateCompleteArg == null || (k0Var = this.f47989a) == null) {
            return;
        }
        k0Var.a(useTemplateCompleteArg.finishInfo, useTemplateCompleteArg.error);
    }
}
