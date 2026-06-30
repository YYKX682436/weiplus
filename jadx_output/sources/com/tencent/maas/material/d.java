package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class d extends com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.a f48234a;

    public d(com.tencent.maas.material.MJMaterialManager mJMaterialManager, com.tencent.maas.material.a aVar) {
        super(mJMaterialManager);
        this.f48234a = aVar;
    }

    @Override // com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.material.MJMaterialManager mJMaterialManager, java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.CompleteArg completeArg = (com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.CompleteArg) obj;
        com.tencent.maas.material.a aVar = this.f48234a;
        if (aVar == null || completeArg == null) {
            return;
        }
        com.tencent.maas.instamovie.base.MJError mJError = completeArg.error;
        du0.k0 k0Var = (du0.k0) aVar;
        java.lang.String str = k0Var.f243373a;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MaterialResourceLoadUIC", "onComplete: materialID = " + str + ", mjError " + mJError.f48175ec.getErrorCode() + ", " + mJError.message);
        } else {
            com.tencent.mars.xlog.Log.i("MaterialResourceLoadUIC", "onComplete: materialID = " + str + ", load success");
        }
        k0Var.f243374b.invoke(mJError);
    }
}
