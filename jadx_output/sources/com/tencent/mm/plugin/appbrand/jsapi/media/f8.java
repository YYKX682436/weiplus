package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class f8 implements com.tencent.mm.plugin.appbrand.jsapi.media.u1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.f8 f81808d = new com.tencent.mm.plugin.appbrand.jsapi.media.f8();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.u1
    public com.tencent.mm.plugin.appbrand.jsapi.media.t1 Q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.jsapi.media.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.media.t1) runtime.k(com.tencent.mm.plugin.appbrand.jsapi.media.t1.class);
        if (t1Var != null) {
            return t1Var;
        }
        android.content.Context context = runtime.f74795d;
        kotlin.jvm.internal.o.f(context, "getAppContext(...)");
        com.tencent.mm.plugin.appbrand.jsapi.media.c8 c8Var = new com.tencent.mm.plugin.appbrand.jsapi.media.c8(context);
        runtime.l(c8Var);
        return c8Var;
    }
}
