package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76265a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f76266b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f76267c;

    /* renamed from: d, reason: collision with root package name */
    public final long f76268d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f76269e;

    public m0(java.lang.String appId, java.lang.String iconUrl, java.lang.String displayName, long j17, java.lang.Boolean bool) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(displayName, "displayName");
        this.f76265a = appId;
        this.f76266b = iconUrl;
        this.f76267c = displayName;
        this.f76268d = j17;
        this.f76269e = bool;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appstorage.m0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var = (com.tencent.mm.plugin.appbrand.appstorage.m0) obj;
        return kotlin.jvm.internal.o.b(this.f76265a, m0Var.f76265a) && kotlin.jvm.internal.o.b(this.f76266b, m0Var.f76266b) && kotlin.jvm.internal.o.b(this.f76267c, m0Var.f76267c) && this.f76268d == m0Var.f76268d && kotlin.jvm.internal.o.b(this.f76269e, m0Var.f76269e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f76265a.hashCode() * 31) + this.f76266b.hashCode()) * 31) + this.f76267c.hashCode()) * 31) + java.lang.Long.hashCode(this.f76268d)) * 31;
        java.lang.Boolean bool = this.f76269e;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public java.lang.String toString() {
        return "AppBrandStorageUsageInfo(appId=" + this.f76265a + ", iconUrl=" + this.f76266b + ", displayName=" + this.f76267c + ", cacheSize=" + this.f76268d + ", isAlive=" + this.f76269e + ')';
    }
}
