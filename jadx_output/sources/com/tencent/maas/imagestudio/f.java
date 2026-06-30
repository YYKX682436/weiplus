package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class f extends com.tencent.maas.imagestudio.MJImageSceneCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.e f48097a;

    public f(com.tencent.maas.imagestudio.MJImageScene mJImageScene, com.tencent.maas.imagestudio.e eVar) {
        super(mJImageScene);
        this.f48097a = eVar;
    }

    @Override // com.tencent.maas.imagestudio.MJImageSceneCallback$BaseCallback
    public void onInvoke(com.tencent.maas.imagestudio.MJImageScene mJImageScene, java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSceneCallback$MJImageSceneCallbackArg.SaveSnapshotCompleteArg saveSnapshotCompleteArg = (com.tencent.maas.imagestudio.MJImageSceneCallback$MJImageSceneCallbackArg.SaveSnapshotCompleteArg) obj;
        com.tencent.maas.imagestudio.e eVar = this.f48097a;
        if (eVar == null || saveSnapshotCompleteArg == null) {
            return;
        }
        com.tencent.maas.instamovie.base.MJError mJError = saveSnapshotCompleteArg.error;
        if (mJError != null) {
            java.lang.String error = mJError.getMessage();
            kotlin.jvm.internal.o.g(error, "error");
            return;
        }
        java.lang.String path = saveSnapshotCompleteArg.path;
        nu0.f0 f0Var = (nu0.f0) eVar;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[saveSnapshot] end index:" + f0Var.f339932a);
        f0Var.f339933b.invoke(path);
    }
}
