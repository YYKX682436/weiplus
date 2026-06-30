package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g4 f80156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(int i17, com.tencent.mm.plugin.appbrand.jsapi.g4 g4Var) {
        super(1);
        this.f80155d = i17;
        this.f80156e = g4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        kotlin.jvm.internal.o.g(list, "list");
        com.tencent.mars.xlog.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80155d + ").onLoaded, list.size:" + list.size());
        this.f80156e.apply(list);
        return jz5.f0.f302826a;
    }
}
