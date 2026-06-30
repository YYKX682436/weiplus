package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75415c;

    /* renamed from: d, reason: collision with root package name */
    public long f75416d;

    public a3(java.lang.String appId, int i17, int i18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f75413a = appId;
        this.f75414b = i17;
        this.f75415c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.a3)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.a3 a3Var = (com.tencent.mm.plugin.appbrand.appcache.a3) obj;
        return kotlin.jvm.internal.o.b(this.f75413a, a3Var.f75413a) && this.f75414b == a3Var.f75414b && this.f75415c == a3Var.f75415c;
    }

    public int hashCode() {
        return (((this.f75413a.hashCode() * 31) + java.lang.Integer.hashCode(this.f75414b)) * 31) + java.lang.Integer.hashCode(this.f75415c);
    }

    public java.lang.String toString() {
        return "AppInfo(appId=" + this.f75413a + ", versionType=" + this.f75414b + ", serviceType=" + this.f75415c + ')';
    }
}
