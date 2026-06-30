package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class l0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a0 f47965a;

    public l0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.a0 a0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47965a = a0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.AIGCRequestConditionNotMetArg aIGCRequestConditionNotMetArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.AIGCRequestConditionNotMetArg) obj;
        com.tencent.maas.camstudio.a0 a0Var = this.f47965a;
        if (a0Var == null || aIGCRequestConditionNotMetArg == null) {
            return;
        }
        ((yx0.d0) a0Var).a(aIGCRequestConditionNotMetArg.reason);
    }

    public l0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.a0 a0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47965a = a0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.AIGCRequestConditionNotMetArg aIGCRequestConditionNotMetArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.AIGCRequestConditionNotMetArg) obj;
        com.tencent.maas.camstudio.a0 a0Var = this.f47965a;
        if (a0Var == null || aIGCRequestConditionNotMetArg == null) {
            return;
        }
        ((yx0.d0) a0Var).a(aIGCRequestConditionNotMetArg.reason);
    }
}
