package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes5.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f75946a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f75947b;

    public r6(java.lang.Object obj, int[] versionArray) {
        kotlin.jvm.internal.o.g(versionArray, "versionArray");
        this.f75946a = obj;
        this.f75947b = versionArray;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.r6.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion.SortUnit<T of com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion>");
        return kotlin.jvm.internal.o.b(this.f75946a, ((com.tencent.mm.plugin.appbrand.appcache.r6) obj).f75946a);
    }

    public int hashCode() {
        java.lang.Object obj = this.f75946a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return "SortUnit(item=" + this.f75946a + ", versionArray=" + java.util.Arrays.toString(this.f75947b) + ')';
    }
}
