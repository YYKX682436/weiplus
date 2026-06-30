package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class f extends com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.c f48236a;

    public f(com.tencent.maas.material.MJMaterialManager mJMaterialManager, com.tencent.maas.material.c cVar, boolean z17) {
        super(mJMaterialManager, z17);
        this.f48236a = cVar;
    }

    @Override // com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.material.MJMaterialManager mJMaterialManager, java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.ProgressArg progressArg = (com.tencent.maas.material.MJMaterialManagerCallback$MJMaterialManagerCallbackArg.ProgressArg) obj;
        com.tencent.maas.material.c cVar = this.f48236a;
        if (cVar == null || progressArg == null) {
            return;
        }
        ((du0.j0) cVar).f243369a.invoke(java.lang.Float.valueOf(progressArg.progress));
    }
}
