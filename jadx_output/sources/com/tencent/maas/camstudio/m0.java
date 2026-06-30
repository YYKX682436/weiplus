package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class m0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.b0 f47967a;

    public m0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.b0 b0Var) {
        super(mJCamSession);
        this.f47967a = b0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginAdjustSpatialDescCompleteArg beginAdjustSpatialDescCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginAdjustSpatialDescCompleteArg) obj;
        com.tencent.maas.camstudio.b0 b0Var = this.f47967a;
        if (b0Var == null || beginAdjustSpatialDescCompleteArg == null) {
            return;
        }
        b0Var.a(beginAdjustSpatialDescCompleteArg.desc, beginAdjustSpatialDescCompleteArg.originImage, beginAdjustSpatialDescCompleteArg.mjError);
    }

    public m0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.b0 b0Var) {
        super(mJCamoSession);
        this.f47967a = b0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginAdjustSpatialDescCompleteArg beginAdjustSpatialDescCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.BeginAdjustSpatialDescCompleteArg) obj;
        com.tencent.maas.camstudio.b0 b0Var = this.f47967a;
        if (b0Var == null || beginAdjustSpatialDescCompleteArg == null) {
            return;
        }
        b0Var.a(beginAdjustSpatialDescCompleteArg.desc, beginAdjustSpatialDescCompleteArg.originImage, beginAdjustSpatialDescCompleteArg.mjError);
    }
}
