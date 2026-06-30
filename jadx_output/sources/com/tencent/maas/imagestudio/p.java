package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class p extends com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.h f48103a;

    public p(com.tencent.maas.imagestudio.MJImageSession mJImageSession, com.tencent.maas.imagestudio.h hVar) {
        super(mJImageSession);
        this.f48103a = hVar;
    }

    @Override // com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.imagestudio.MJImageSession mJImageSession, java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.CompleteArg completeArg = (com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.CompleteArg) obj;
        com.tencent.maas.imagestudio.h hVar = this.f48103a;
        if (hVar == null || completeArg == null) {
            return;
        }
        com.tencent.maas.instamovie.base.MJError mJError = completeArg.error;
        hVar.a(mJError != null ? mJError.getMessage() : null);
    }
}
