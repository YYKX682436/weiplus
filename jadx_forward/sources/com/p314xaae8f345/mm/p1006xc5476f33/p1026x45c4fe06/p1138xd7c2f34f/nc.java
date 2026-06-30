package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166353a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166354b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166355c;

    /* renamed from: d, reason: collision with root package name */
    public final long f166356d;

    /* renamed from: e, reason: collision with root package name */
    public final int f166357e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166358f;

    public nc(java.lang.String str, java.lang.String fullUrl, java.lang.String str2, long j17, int i17, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        this.f166353a = str;
        this.f166354b = fullUrl;
        this.f166355c = str2;
        this.f166356d = j17;
        this.f166357e = i17;
        this.f166358f = str3;
    }

    /* renamed from: equals */
    public boolean m51758xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc ncVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166353a, ncVar.f166353a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166354b, ncVar.f166354b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166355c, ncVar.f166355c) && this.f166356d == ncVar.f166356d && this.f166357e == ncVar.f166357e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166358f, ncVar.f166358f);
    }

    /* renamed from: hashCode */
    public int m51759x8cdac1b() {
        java.lang.String str = this.f166353a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f166354b.hashCode()) * 31;
        java.lang.String str2 = this.f166355c;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f166356d)) * 31) + java.lang.Integer.hashCode(this.f166357e)) * 31;
        java.lang.String str3 = this.f166358f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51760x9616526c() {
        return "WVADownloadInfo(patchUrl=" + this.f166353a + ", fullUrl=" + this.f166354b + ", md5=" + this.f166355c + ", patchSize=" + this.f166356d + ", oldVersion=" + this.f166357e + ", oldPkgPath=" + this.f166358f + ')';
    }
}
