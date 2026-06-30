package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class p0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.e0 f47978a;

    public p0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.e0 e0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47978a = e0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.FirstFrameDidPresentAfterSwitchTemplateArg firstFrameDidPresentAfterSwitchTemplateArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.FirstFrameDidPresentAfterSwitchTemplateArg) obj;
        com.tencent.maas.camstudio.e0 e0Var = this.f47978a;
        if (e0Var == null || firstFrameDidPresentAfterSwitchTemplateArg == null) {
            return;
        }
        e0Var.a(firstFrameDidPresentAfterSwitchTemplateArg.templateID);
    }

    public p0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.e0 e0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47978a = e0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.FirstFrameDidPresentAfterSwitchTemplateArg firstFrameDidPresentAfterSwitchTemplateArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.FirstFrameDidPresentAfterSwitchTemplateArg) obj;
        com.tencent.maas.camstudio.e0 e0Var = this.f47978a;
        if (e0Var == null || firstFrameDidPresentAfterSwitchTemplateArg == null) {
            return;
        }
        e0Var.a(firstFrameDidPresentAfterSwitchTemplateArg.templateID);
    }
}
