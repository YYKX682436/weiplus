package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class u0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.j0 f47987a;

    public u0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.j0 j0Var) {
        super(mJCamSession);
        this.f47987a = j0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.StopRecordingArg stopRecordingArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.StopRecordingArg) obj;
        com.tencent.maas.camstudio.j0 j0Var = this.f47987a;
        if (j0Var == null || stopRecordingArg == null) {
            return;
        }
        j0Var.a(stopRecordingArg.finishInfo, stopRecordingArg.error);
    }

    public u0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.j0 j0Var) {
        super(mJCamoSession);
        this.f47987a = j0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.StopRecordingArg stopRecordingArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.StopRecordingArg) obj;
        com.tencent.maas.camstudio.j0 j0Var = this.f47987a;
        if (j0Var == null || stopRecordingArg == null) {
            return;
        }
        j0Var.a(stopRecordingArg.finishInfo, stopRecordingArg.error);
    }
}
