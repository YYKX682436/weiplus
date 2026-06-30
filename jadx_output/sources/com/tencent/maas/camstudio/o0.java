package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class o0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.d0 f47972a;

    public o0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.d0 d0Var) {
        super(mJCamSession);
        this.f47972a = d0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.CompleteArg completeArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.CompleteArg) obj;
        com.tencent.maas.camstudio.d0 d0Var = this.f47972a;
        if (d0Var == null || completeArg == null) {
            return;
        }
        d0Var.onComplete(completeArg.error);
    }

    public o0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.d0 d0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47972a = d0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.CompleteArg completeArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.CompleteArg) obj;
        com.tencent.maas.camstudio.d0 d0Var = this.f47972a;
        if (d0Var == null || completeArg == null) {
            return;
        }
        d0Var.onComplete(completeArg.error);
    }

    public o0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.d0 d0Var) {
        super(mJCamoSession);
        this.f47972a = d0Var;
    }

    public o0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.d0 d0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47972a = d0Var;
    }
}
