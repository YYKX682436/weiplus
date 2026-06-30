package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem */
/* loaded from: classes10.dex */
public abstract class AbstractC15633xee433078 implements android.os.Parcelable, java.lang.Comparable<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078>, ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219963e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219964f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219965g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219966h;

    /* renamed from: i, reason: collision with root package name */
    public long f219967i;

    /* renamed from: m, reason: collision with root package name */
    public long f219968m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219969n;

    /* renamed from: o, reason: collision with root package name */
    public long f219970o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219971p;

    /* renamed from: q, reason: collision with root package name */
    public double f219972q;

    /* renamed from: r, reason: collision with root package name */
    public double f219973r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219974s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f219975t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.HashMap f219976u;

    public AbstractC15633xee433078() {
        this(0L, "", "", "");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a(int i17, long j17) {
        return i17 == 1 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b(j17) : i17 == 6 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0(j17) : new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b(j17);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return i17 == 1 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b(j17, str, str2, str3) : i17 == 6 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0(j17, str, str2, str3) : new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b(j17, str, str2, str3);
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        return (int) ((this.f219968m - abstractC15633xee433078.f219968m) / 1000);
    }

    /* renamed from: equals */
    public boolean m63662xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
        java.lang.String str3 = this.f219963e;
        return (str3 != null && str3.equals(abstractC15633xee433078.f219963e)) || ((str = this.f219971p) != null && str.equals("edit") && (str2 = this.f219964f) != null && str2.equals(abstractC15633xee433078.f219963e));
    }

    /* renamed from: getType */
    public abstract int mo63659xfb85f7b0();

    @Override // ip0.c
    public java.lang.String n() {
        return this.f219967i + "_" + this.f219963e.hashCode();
    }

    public abstract java.lang.String o();

    public abstract boolean r();

    /* renamed from: toString */
    public java.lang.String mo63661x9616526c() {
        return "MediaItem{mOriginalPath='" + this.f219963e + "', mRawEditPath='" + this.f219964f + "', mThumbPath='" + this.f219966h + "', origId=" + this.f219967i + ", generateDate=" + this.f219968m + ", dateTag=" + this.f219969n + ", isChecked=" + this.f219975t + ", mMimeType='" + this.f219971p + "', mLongitude='" + this.f219972q + "', mLatitude='" + this.f219973r + "', mBusinessTag='" + this.f219974s + "'}";
    }

    public AbstractC15633xee433078(long j17) {
        this(j17, "", "", "");
    }

    public AbstractC15633xee433078(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f219972q = 181.0d;
        this.f219973r = 91.0d;
        this.f219975t = false;
        this.f219976u = new java.util.HashMap();
        this.f219967i = j17;
        this.f219963e = str;
        this.f219966h = str2;
        this.f219971p = str3;
    }
}
