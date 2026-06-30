package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f80765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(int i17, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(0);
        this.f80764d = i17;
        this.f80765e = weakReference;
        this.f80766f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80764d + ").onNoUpdate");
        com.tencent.mm.plugin.appbrand.jsapi.w3.f83702i.a((com.tencent.mm.plugin.appbrand.y) this.f80765e.get(), null, this.f80766f);
        return jz5.f0.f302826a;
    }
}
