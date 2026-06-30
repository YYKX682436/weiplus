package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157798a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f157799b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f157800c;

    /* renamed from: d, reason: collision with root package name */
    public final long f157801d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f157802e;

    public m0(java.lang.String appId, java.lang.String iconUrl, java.lang.String displayName, long j17, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        this.f157798a = appId;
        this.f157799b = iconUrl;
        this.f157800c = displayName;
        this.f157801d = j17;
        this.f157802e = bool;
    }

    /* renamed from: equals */
    public boolean m49684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157798a, m0Var.f157798a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157799b, m0Var.f157799b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157800c, m0Var.f157800c) && this.f157801d == m0Var.f157801d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157802e, m0Var.f157802e);
    }

    /* renamed from: hashCode */
    public int m49685x8cdac1b() {
        int hashCode = ((((((this.f157798a.hashCode() * 31) + this.f157799b.hashCode()) * 31) + this.f157800c.hashCode()) * 31) + java.lang.Long.hashCode(this.f157801d)) * 31;
        java.lang.Boolean bool = this.f157802e;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m49686x9616526c() {
        return "AppBrandStorageUsageInfo(appId=" + this.f157798a + ", iconUrl=" + this.f157799b + ", displayName=" + this.f157800c + ", cacheSize=" + this.f157801d + ", isAlive=" + this.f157802e + ')';
    }
}
