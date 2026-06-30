package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class h0 implements com.tencent.mm.plugin.appbrand.screenshot.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.r0 f88489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f88490b;

    public h0(com.tencent.mm.plugin.appbrand.screenshot.r0 resolver, java.lang.String defaultEnterPath) {
        kotlin.jvm.internal.o.g(resolver, "resolver");
        kotlin.jvm.internal.o.g(defaultEnterPath, "defaultEnterPath");
        this.f88489a = resolver;
        this.f88490b = defaultEnterPath;
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.r0
    public void a(java.lang.String enterPath) {
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        this.f88489a.a(enterPath);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.screenshot.h0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.screenshot.EnterPathResolverWrapper");
        return kotlin.jvm.internal.o.b(this.f88489a, ((com.tencent.mm.plugin.appbrand.screenshot.h0) obj).f88489a);
    }

    public int hashCode() {
        return this.f88489a.hashCode();
    }
}
