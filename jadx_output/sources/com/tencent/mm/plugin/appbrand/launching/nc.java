package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84821b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f84822c;

    /* renamed from: d, reason: collision with root package name */
    public final long f84823d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84824e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84825f;

    public nc(java.lang.String str, java.lang.String fullUrl, java.lang.String str2, long j17, int i17, java.lang.String str3) {
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        this.f84820a = str;
        this.f84821b = fullUrl;
        this.f84822c = str2;
        this.f84823d = j17;
        this.f84824e = i17;
        this.f84825f = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.nc)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.nc ncVar = (com.tencent.mm.plugin.appbrand.launching.nc) obj;
        return kotlin.jvm.internal.o.b(this.f84820a, ncVar.f84820a) && kotlin.jvm.internal.o.b(this.f84821b, ncVar.f84821b) && kotlin.jvm.internal.o.b(this.f84822c, ncVar.f84822c) && this.f84823d == ncVar.f84823d && this.f84824e == ncVar.f84824e && kotlin.jvm.internal.o.b(this.f84825f, ncVar.f84825f);
    }

    public int hashCode() {
        java.lang.String str = this.f84820a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f84821b.hashCode()) * 31;
        java.lang.String str2 = this.f84822c;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f84823d)) * 31) + java.lang.Integer.hashCode(this.f84824e)) * 31;
        java.lang.String str3 = this.f84825f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WVADownloadInfo(patchUrl=" + this.f84820a + ", fullUrl=" + this.f84821b + ", md5=" + this.f84822c + ", patchSize=" + this.f84823d + ", oldVersion=" + this.f84824e + ", oldPkgPath=" + this.f84825f + ')';
    }
}
