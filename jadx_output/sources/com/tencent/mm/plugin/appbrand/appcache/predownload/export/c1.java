package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75780d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75781e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75782f;

    public c1(java.lang.String appId, int i17, int i18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f75780d = appId;
        this.f75781e = i17;
        this.f75782f = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 other = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return hashCode() - other.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl.OccupiedPkgKey");
        com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 c1Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) obj;
        return kotlin.jvm.internal.o.b(this.f75780d, c1Var.f75780d) && this.f75781e == c1Var.f75781e && this.f75782f == c1Var.f75782f;
    }

    public int hashCode() {
        return (((this.f75780d.hashCode() * 31) + this.f75781e) * 31) + this.f75782f;
    }

    public java.lang.String toString() {
        return "OccupiedPkgKey(appId=" + this.f75780d + ", versionType=" + this.f75781e + ", version=" + this.f75782f + ')';
    }
}
