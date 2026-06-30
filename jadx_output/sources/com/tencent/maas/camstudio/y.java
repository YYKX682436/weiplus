package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class y extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.u f47998a;

    public y(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.camstudio.u uVar, boolean z17) {
        super(mJCamResourceManager, z17);
        this.f47998a = uVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.ProgressArg progressArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.ProgressArg) obj;
        com.tencent.maas.camstudio.u uVar = this.f47998a;
        if (uVar == null || progressArg == null) {
            return;
        }
        uVar.onProgress(progressArg.progress);
    }

    public y(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.u uVar, boolean z17) {
        super(mJCamoSession, z17);
        this.f47998a = uVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.ProgressArg progressArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.ProgressArg) obj;
        com.tencent.maas.camstudio.u uVar = this.f47998a;
        if (uVar == null || progressArg == null) {
            return;
        }
        uVar.onProgress(progressArg.progress);
    }
}
