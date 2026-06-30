package cc1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f40455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        super(0);
        this.f40455d = lVar;
        this.f40456e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.y lifecycleOwner = this.f40455d.getLifecycleOwner();
        if (lifecycleOwner != null && (mo133getLifecycle = lifecycleOwner.mo133getLifecycle()) != null) {
            final java.lang.String str = this.f40456e;
            mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.crypto.JsApiCryptoOpen$invoke$manager$1$1$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroyed() {
                    cc1.h hVar = cc1.i.f40428b;
                    java.lang.String appId = str;
                    kotlin.jvm.internal.o.f(appId, "$appId");
                    java.util.concurrent.locks.ReentrantLock reentrantLock = cc1.i.f40429c;
                    reentrantLock.lock();
                    try {
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            });
        }
        return jz5.f0.f302826a;
    }
}
