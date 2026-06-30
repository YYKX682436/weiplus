package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g4 f80736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f80737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80738g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(int i17, com.tencent.mm.plugin.appbrand.jsapi.g4 g4Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(1);
        this.f80735d = i17;
        this.f80736e = g4Var;
        this.f80737f = weakReference;
        this.f80738g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        kotlin.jvm.internal.o.g(list, "list");
        com.tencent.mars.xlog.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80735d + ").onUpdated, list.size:" + list.size());
        if (!this.f80736e.apply(list).booleanValue()) {
            com.tencent.mm.plugin.appbrand.jsapi.w3.f83702i.a((com.tencent.mm.plugin.appbrand.y) this.f80737f.get(), list, this.f80738g);
        }
        return jz5.f0.f302826a;
    }
}
