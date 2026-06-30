package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class x extends com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.t f47991a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.r f47992b;

    public x(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.camstudio.t tVar) {
        super(mJCamResourceManager, true);
        this.f47991a = tVar;
        this.f47992b = null;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MusicCompleteArg musicCompleteArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MusicCompleteArg) obj;
        if (musicCompleteArg == null) {
            return;
        }
        com.tencent.maas.camstudio.t tVar = this.f47991a;
        if (tVar != null) {
            tVar.a(musicCompleteArg.musicInfo, musicCompleteArg.error);
            return;
        }
        com.tencent.maas.camstudio.r rVar = this.f47992b;
        if (rVar != null) {
            rVar.onComplete(musicCompleteArg.error);
        }
    }

    public x(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.t tVar) {
        super(mJCamoSession, true);
        this.f47991a = tVar;
        this.f47992b = null;
    }

    @Override // com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MusicCompleteArg musicCompleteArg = (com.tencent.maas.camstudio.MJCamResourceManagerCallback$MJCamResourceManagerCallbackArg.MusicCompleteArg) obj;
        if (musicCompleteArg == null) {
            return;
        }
        com.tencent.maas.camstudio.t tVar = this.f47991a;
        if (tVar != null) {
            tVar.a(musicCompleteArg.musicInfo, musicCompleteArg.error);
            return;
        }
        com.tencent.maas.camstudio.r rVar = this.f47992b;
        if (rVar != null) {
            rVar.onComplete(musicCompleteArg.error);
        }
    }

    public x(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.camstudio.r rVar) {
        super(mJCamResourceManager);
        this.f47991a = null;
        this.f47992b = rVar;
    }

    public x(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.r rVar) {
        super(mJCamoSession);
        this.f47991a = null;
        this.f47992b = rVar;
    }
}
