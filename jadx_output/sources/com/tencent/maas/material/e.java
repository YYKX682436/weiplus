package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class e extends com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.b f48235a;

    public e(com.tencent.maas.material.MJMaterialManager mJMaterialManager, com.tencent.maas.material.b bVar) {
        super(mJMaterialManager);
        this.f48235a = bVar;
    }

    @Override // com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.material.MJMaterialManager mJMaterialManager, java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.MaterialPackCompleteArg materialPackCompleteArg = (com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.MaterialPackCompleteArg) obj;
        com.tencent.maas.material.b bVar = this.f48235a;
        if (bVar == null || materialPackCompleteArg == null) {
            return;
        }
        com.tencent.maas.material.MJMaterialPack mJMaterialPack = materialPackCompleteArg.materialPack;
        com.tencent.maas.instamovie.base.MJError mJError = materialPackCompleteArg.error;
        du0.l0 l0Var = (du0.l0) bVar;
        com.tencent.maas.material.g gVar = l0Var.f243379a;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MaterialResourceLoadUIC", "onComplete: MaterialScene = " + gVar + ", mjError " + mJError.f48175ec.getErrorCode() + ", " + mJError.message);
        } else {
            com.tencent.mars.xlog.Log.i("MaterialResourceLoadUIC", "onComplete: MaterialScene = " + gVar + ", load success");
        }
        l0Var.f243380b.invoke(mJMaterialPack, mJError);
    }
}
