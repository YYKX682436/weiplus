package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class m extends com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.i f48100a;

    public m(com.tencent.maas.imagestudio.MJImageSession mJImageSession, com.tencent.maas.imagestudio.i iVar) {
        super(mJImageSession);
        this.f48100a = iVar;
    }

    @Override // com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.imagestudio.MJImageSession mJImageSession, java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.ExportCompleteArg exportCompleteArg = (com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.ExportCompleteArg) obj;
        com.tencent.maas.imagestudio.i iVar = this.f48100a;
        if (iVar == null || exportCompleteArg == null) {
            return;
        }
        com.tencent.maas.imagestudio.MJImageExportResult mJImageExportResult = exportCompleteArg.exportResult;
        com.tencent.maas.instamovie.base.MJError mJError = exportCompleteArg.error;
        java.lang.String message = mJError != null ? mJError.getMessage() : null;
        nu0.i0 i0Var = (nu0.i0) iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.lang.String> outputImageFilePathsBySceneID = mJImageExportResult != null ? mJImageExportResult.getOutputImageFilePathsBySceneID() : null;
        boolean z17 = true;
        if (message == null || message.length() == 0) {
            if (outputImageFilePathsBySceneID != null && !outputImageFilePathsBySceneID.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.maas.imagestudio.MJImageScene[] imageScenes = i0Var.f339959a.getImageScenes();
                kotlin.jvm.internal.o.f(imageScenes, "getImageScenes(...)");
                for (com.tencent.maas.imagestudio.MJImageScene mJImageScene : imageScenes) {
                    java.lang.String str = outputImageFilePathsBySceneID.get(mJImageScene.getSceneID());
                    if (str != null) {
                        arrayList.add(new nu0.u(str, mJImageScene.isModified()));
                    }
                }
            }
        }
        arrayList.size();
        nu0.q3 q3Var = (nu0.q3) i0Var.f339960b;
        q3Var.getClass();
        ((kotlinx.coroutines.r) q3Var.f340084b).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(arrayList, message)));
    }
}
