package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157313d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157314e;

    /* renamed from: f, reason: collision with root package name */
    public final int f157315f;

    public c1(java.lang.String appId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f157313d = appId;
        this.f157314e = i17;
        this.f157315f = i18;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1 other = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return m49446x8cdac1b() - other.m49446x8cdac1b();
    }

    /* renamed from: equals */
    public boolean m49445xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl.OccupiedPkgKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f157313d, c1Var.f157313d) && this.f157314e == c1Var.f157314e && this.f157315f == c1Var.f157315f;
    }

    /* renamed from: hashCode */
    public int m49446x8cdac1b() {
        return (((this.f157313d.hashCode() * 31) + this.f157314e) * 31) + this.f157315f;
    }

    /* renamed from: toString */
    public java.lang.String m49447x9616526c() {
        return "OccupiedPkgKey(appId=" + this.f157313d + ", versionType=" + this.f157314e + ", version=" + this.f157315f + ')';
    }
}
