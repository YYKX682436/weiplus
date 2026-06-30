package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class k extends com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.g f48098a;

    public k(com.tencent.maas.imagestudio.MJImageSession mJImageSession, com.tencent.maas.imagestudio.g gVar) {
        super(mJImageSession);
        this.f48098a = gVar;
    }

    @Override // com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.imagestudio.MJImageSession mJImageSession, java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.AddScenesCompleteArg addScenesCompleteArg = (com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.AddScenesCompleteArg) obj;
        com.tencent.maas.imagestudio.g gVar = this.f48098a;
        if (gVar == null || addScenesCompleteArg == null) {
            return;
        }
        java.lang.String[] strArr = addScenesCompleteArg.addedSceneIDs;
        com.tencent.maas.instamovie.base.MJError mJError = addScenesCompleteArg.error;
        gVar.a(strArr, mJError != null ? mJError.getMessage() : null);
    }
}
