package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.q0 f75227a = new com.tencent.mm.plugin.appbrand.app.q0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f75228b = jz5.h.b(com.tencent.mm.plugin.appbrand.app.p0.f75219d);

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        return com.tencent.mm.sdk.platformtools.o4.M("AppBrandProcessSharedMMKV_" + c());
    }

    public final com.tencent.mm.sdk.platformtools.o4 b(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return com.tencent.mm.sdk.platformtools.o4.M(name + '_' + c());
    }

    public final int c() {
        return gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f75228b).getValue()).intValue();
    }
}
