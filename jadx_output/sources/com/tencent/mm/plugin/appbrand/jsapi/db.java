package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.q6 f80755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.service.q6 q6Var) {
        super(0);
        this.f80754d = lVar;
        this.f80755e = q6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.y lifecycleOwner = this.f80754d.getLifecycleOwner();
        if (lifecycleOwner != null && (mo133getLifecycle = lifecycleOwner.mo133getLifecycle()) != null) {
            final com.tencent.mm.plugin.appbrand.service.q6 q6Var = this.f80755e;
            mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiPredownloadMiniProgramPackage$invoke$preDownloadRequest$1$2$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroyed() {
                    com.tencent.mm.plugin.appbrand.service.q6.this.f88756f = null;
                }
            });
        }
        return jz5.f0.f302826a;
    }
}
