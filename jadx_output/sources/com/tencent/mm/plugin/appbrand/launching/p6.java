package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.IPkgInfo f84892a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.s6 f84893b;

    public p6(com.tencent.mm.plugin.appbrand.appcache.IPkgInfo pkgInfo, com.tencent.mm.plugin.appbrand.launching.s6 source) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(source, "source");
        this.f84892a = pkgInfo;
        this.f84893b = source;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.p6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.p6 p6Var = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        return kotlin.jvm.internal.o.b(this.f84892a, p6Var.f84892a) && kotlin.jvm.internal.o.b(this.f84893b, p6Var.f84893b);
    }

    public int hashCode() {
        return (this.f84892a.hashCode() * 31) + this.f84893b.hashCode();
    }

    public java.lang.String toString() {
        return "Response(pkgInfo=" + this.f84892a + ", source=" + this.f84893b + ')';
    }
}
