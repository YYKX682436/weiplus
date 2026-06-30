package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class s0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.h0 f47985a;

    public s0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.h0 h0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47985a = h0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.RecordingTimeChangeArg recordingTimeChangeArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.RecordingTimeChangeArg) obj;
        com.tencent.maas.camstudio.h0 h0Var = this.f47985a;
        if (h0Var == null || recordingTimeChangeArg == null) {
            return;
        }
        ((yx0.q) h0Var).a(recordingTimeChangeArg.lastFrameTime, recordingTimeChangeArg.maxRecordingDuration);
    }

    public s0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.h0 h0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47985a = h0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.RecordingTimeChangeArg recordingTimeChangeArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.RecordingTimeChangeArg) obj;
        com.tencent.maas.camstudio.h0 h0Var = this.f47985a;
        if (h0Var == null || recordingTimeChangeArg == null) {
            return;
        }
        ((yx0.q) h0Var).a(recordingTimeChangeArg.lastFrameTime, recordingTimeChangeArg.maxRecordingDuration);
    }
}
