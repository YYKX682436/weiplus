package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class w extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.s f47990a;

    public w(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.camstudio.s sVar) {
        super(mJCamResourceManager);
        this.f47990a = sVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MaterialPackCompleteArg materialPackCompleteArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MaterialPackCompleteArg) obj;
        com.tencent.maas.camstudio.s sVar = this.f47990a;
        if (sVar == null || materialPackCompleteArg == null) {
            return;
        }
        sVar.a(materialPackCompleteArg.materialPack, materialPackCompleteArg.error);
    }

    public w(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.s sVar) {
        super(mJCamoSession);
        this.f47990a = sVar;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MaterialPackCompleteArg materialPackCompleteArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MaterialPackCompleteArg) obj;
        com.tencent.maas.camstudio.s sVar = this.f47990a;
        if (sVar == null || materialPackCompleteArg == null) {
            return;
        }
        sVar.a(materialPackCompleteArg.materialPack, materialPackCompleteArg.error);
    }
}
