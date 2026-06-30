package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f76865a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f76866b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f76867c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f76868d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f76869e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f76870f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f76871g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f76872h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f76873i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f76874j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f76875k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f76876l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f76877m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f76878n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f76879o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f76880p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f76881q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f76882r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f76883s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f76884t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f76885u = 0;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.backgroundfetch.o0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var = (com.tencent.mm.plugin.appbrand.backgroundfetch.o0) obj;
        return kotlin.jvm.internal.o.b(this.f76865a, o0Var.f76865a) && kotlin.jvm.internal.o.b(this.f76866b, o0Var.f76866b) && kotlin.jvm.internal.o.b(this.f76867c, o0Var.f76867c) && this.f76868d == o0Var.f76868d && this.f76869e == o0Var.f76869e && this.f76870f == o0Var.f76870f && this.f76871g == o0Var.f76871g && kotlin.jvm.internal.o.b(this.f76872h, o0Var.f76872h) && this.f76873i == o0Var.f76873i && this.f76874j == o0Var.f76874j && this.f76875k == o0Var.f76875k && this.f76876l == o0Var.f76876l && this.f76877m == o0Var.f76877m && this.f76878n == o0Var.f76878n && this.f76879o == o0Var.f76879o && this.f76880p == o0Var.f76880p && this.f76881q == o0Var.f76881q && this.f76882r == o0Var.f76882r && this.f76883s == o0Var.f76883s && this.f76884t == o0Var.f76884t && this.f76885u == o0Var.f76885u;
    }

    public int hashCode() {
        java.lang.String str = this.f76865a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f76866b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f76867c;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Integer.hashCode(this.f76868d)) * 31) + java.lang.Integer.hashCode(this.f76869e)) * 31) + java.lang.Integer.hashCode(this.f76870f)) * 31) + java.lang.Integer.hashCode(this.f76871g)) * 31;
        java.lang.String str4 = this.f76872h;
        return ((((((((((((((((((((((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f76873i)) * 31) + java.lang.Integer.hashCode(this.f76874j)) * 31) + java.lang.Integer.hashCode(this.f76875k)) * 31) + java.lang.Long.hashCode(this.f76876l)) * 31) + java.lang.Long.hashCode(this.f76877m)) * 31) + java.lang.Long.hashCode(this.f76878n)) * 31) + java.lang.Long.hashCode(this.f76879o)) * 31) + java.lang.Long.hashCode(this.f76880p)) * 31) + java.lang.Long.hashCode(this.f76881q)) * 31) + java.lang.Long.hashCode(this.f76882r)) * 31) + java.lang.Long.hashCode(this.f76883s)) * 31) + java.lang.Integer.hashCode(this.f76884t)) * 31) + java.lang.Integer.hashCode(this.f76885u);
    }

    public java.lang.String toString() {
        return "AppBrandBackgroundPrefetchReport(appId=" + this.f76865a + ", userName=" + this.f76866b + ", instanceId=" + this.f76867c + ", appVersion=" + this.f76868d + ", appState=" + this.f76869e + ", appType=" + this.f76870f + ", scene=" + this.f76871g + ", path=" + this.f76872h + ", prefetchWithLocationValue=" + this.f76873i + ", commitPrefetchWithLocation=" + this.f76874j + ", prefetchWithLocationFailedReason=" + this.f76875k + ", requestWeChatLocationAuthCostTimeInMs=" + this.f76876l + ", requestWeAppLocationAuthCostTimeInMs=" + this.f76877m + ", requestLocationCostTimeInMs=" + this.f76878n + ", totalCostTimeBeforePrefetchCgiInMs=" + this.f76879o + ", cgiCostTimeInMs=" + this.f76880p + ", getResultTotalCostTimeInMs=" + this.f76881q + ", veryStartTimeStampInMs=" + this.f76882r + ", getResultTimeStampInMs=" + this.f76883s + ", isResponseSuccess=" + this.f76884t + ", responseDataItemCount=" + this.f76885u + ')';
    }
}
