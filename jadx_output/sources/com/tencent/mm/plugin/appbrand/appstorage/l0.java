package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f76254a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f76255b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f76256c;

    /* renamed from: d, reason: collision with root package name */
    public long f76257d;

    /* renamed from: e, reason: collision with root package name */
    public long f76258e;

    /* renamed from: f, reason: collision with root package name */
    public int f76259f;

    /* renamed from: g, reason: collision with root package name */
    public long f76260g;

    /* renamed from: h, reason: collision with root package name */
    public long f76261h;

    public l0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, int i17, long j19, long j27, int i18, kotlin.jvm.internal.i iVar) {
        java.lang.String appId = (i18 & 1) != 0 ? "" : str;
        java.lang.String iconUrl = (i18 & 2) != 0 ? "" : str2;
        java.lang.String displayName = (i18 & 4) == 0 ? str3 : "";
        long j28 = (i18 & 8) != 0 ? 0L : j17;
        long j29 = (i18 & 16) != 0 ? 0L : j18;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        long j37 = (i18 & 64) != 0 ? 0L : j19;
        long j38 = (i18 & 128) == 0 ? j27 : 0L;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(displayName, "displayName");
        this.f76254a = appId;
        this.f76255b = iconUrl;
        this.f76256c = displayName;
        this.f76257d = j28;
        this.f76258e = j29;
        this.f76259f = i19;
        this.f76260g = j37;
        this.f76261h = j38;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appstorage.l0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var = (com.tencent.mm.plugin.appbrand.appstorage.l0) obj;
        return kotlin.jvm.internal.o.b(this.f76254a, l0Var.f76254a) && kotlin.jvm.internal.o.b(this.f76255b, l0Var.f76255b) && kotlin.jvm.internal.o.b(this.f76256c, l0Var.f76256c) && this.f76257d == l0Var.f76257d && this.f76258e == l0Var.f76258e && this.f76259f == l0Var.f76259f && this.f76260g == l0Var.f76260g && this.f76261h == l0Var.f76261h;
    }

    public int hashCode() {
        return (((((((((((((this.f76254a.hashCode() * 31) + this.f76255b.hashCode()) * 31) + this.f76256c.hashCode()) * 31) + java.lang.Long.hashCode(this.f76257d)) * 31) + java.lang.Long.hashCode(this.f76258e)) * 31) + java.lang.Integer.hashCode(this.f76259f)) * 31) + java.lang.Long.hashCode(this.f76260g)) * 31) + java.lang.Long.hashCode(this.f76261h);
    }

    public java.lang.String toString() {
        return "AppBrandStorageUsageDetailInfoForDebug(appId=" + this.f76254a + ", iconUrl=" + this.f76255b + ", displayName=" + this.f76256c + ", totalSize=" + this.f76257d + ", pkgSize=" + this.f76258e + ", pkgNum=" + this.f76259f + ", storageSize=" + this.f76260g + ", lastLaunchTimeStamp=" + this.f76261h + ')';
    }
}
