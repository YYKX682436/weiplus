package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f157787a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f157788b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f157789c;

    /* renamed from: d, reason: collision with root package name */
    public long f157790d;

    /* renamed from: e, reason: collision with root package name */
    public long f157791e;

    /* renamed from: f, reason: collision with root package name */
    public int f157792f;

    /* renamed from: g, reason: collision with root package name */
    public long f157793g;

    /* renamed from: h, reason: collision with root package name */
    public long f157794h;

    public l0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, int i17, long j19, long j27, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String appId = (i18 & 1) != 0 ? "" : str;
        java.lang.String iconUrl = (i18 & 2) != 0 ? "" : str2;
        java.lang.String displayName = (i18 & 4) == 0 ? str3 : "";
        long j28 = (i18 & 8) != 0 ? 0L : j17;
        long j29 = (i18 & 16) != 0 ? 0L : j18;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        long j37 = (i18 & 64) != 0 ? 0L : j19;
        long j38 = (i18 & 128) == 0 ? j27 : 0L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        this.f157787a = appId;
        this.f157788b = iconUrl;
        this.f157789c = displayName;
        this.f157790d = j28;
        this.f157791e = j29;
        this.f157792f = i19;
        this.f157793g = j37;
        this.f157794h = j38;
    }

    /* renamed from: equals */
    public boolean m49680xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157787a, l0Var.f157787a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157788b, l0Var.f157788b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157789c, l0Var.f157789c) && this.f157790d == l0Var.f157790d && this.f157791e == l0Var.f157791e && this.f157792f == l0Var.f157792f && this.f157793g == l0Var.f157793g && this.f157794h == l0Var.f157794h;
    }

    /* renamed from: hashCode */
    public int m49681x8cdac1b() {
        return (((((((((((((this.f157787a.hashCode() * 31) + this.f157788b.hashCode()) * 31) + this.f157789c.hashCode()) * 31) + java.lang.Long.hashCode(this.f157790d)) * 31) + java.lang.Long.hashCode(this.f157791e)) * 31) + java.lang.Integer.hashCode(this.f157792f)) * 31) + java.lang.Long.hashCode(this.f157793g)) * 31) + java.lang.Long.hashCode(this.f157794h);
    }

    /* renamed from: toString */
    public java.lang.String m49682x9616526c() {
        return "AppBrandStorageUsageDetailInfoForDebug(appId=" + this.f157787a + ", iconUrl=" + this.f157788b + ", displayName=" + this.f157789c + ", totalSize=" + this.f157790d + ", pkgSize=" + this.f157791e + ", pkgNum=" + this.f157792f + ", storageSize=" + this.f157793g + ", lastLaunchTimeStamp=" + this.f157794h + ')';
    }
}
