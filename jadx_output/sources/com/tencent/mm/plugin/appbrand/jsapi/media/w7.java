package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f82122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.x7 f82123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(yz5.a aVar, com.tencent.mm.plugin.appbrand.jsapi.media.x7 x7Var) {
        super(0);
        this.f82122d = aVar;
        this.f82123e = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) this.f82122d.invoke();
        if (appBrandRuntime != null) {
            return com.tencent.mm.plugin.appbrand.jsapi.media.g.f81809e.Q0(appBrandRuntime);
        }
        com.tencent.mars.xlog.Log.e(this.f82123e.f82142b, "service#get, runtime is null ");
        return null;
    }
}
