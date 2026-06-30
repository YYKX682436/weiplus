package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class v extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.r f47988a;

    public v(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.camstudio.r rVar) {
        super(mJCamResourceManager);
        this.f47988a = rVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.CompleteArg completeArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.CompleteArg) obj;
        com.tencent.maas.camstudio.r rVar = this.f47988a;
        if (rVar == null || completeArg == null) {
            return;
        }
        rVar.onComplete(completeArg.error);
    }

    public v(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.r rVar) {
        super(mJCamoSession);
        this.f47988a = rVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.CompleteArg completeArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.CompleteArg) obj;
        com.tencent.maas.camstudio.r rVar = this.f47988a;
        if (rVar == null || completeArg == null) {
            return;
        }
        rVar.onComplete(completeArg.error);
    }
}
