package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandStatObject */
/* loaded from: classes7.dex */
public final class C12559xbdae8559 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559> f35154x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.a1();

    /* renamed from: d, reason: collision with root package name */
    public int f169321d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f169322e;

    /* renamed from: f, reason: collision with root package name */
    public int f169323f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f169324g;

    /* renamed from: h, reason: collision with root package name */
    public int f169325h;

    /* renamed from: i, reason: collision with root package name */
    public int f169326i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f169327m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f169328n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd f169329o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f169330p;

    /* renamed from: q, reason: collision with root package name */
    public int f169331q;

    /* renamed from: r, reason: collision with root package name */
    public int f169332r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f169333s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f169334t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f169335u;

    /* renamed from: v, reason: collision with root package name */
    public int f169336v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f169337w;

    public C12559xbdae8559() {
        this.f169331q = -1;
        this.f169332r = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52360x9616526c() {
        return "AppBrandStatObject{preScene=" + this.f169321d + ", preSceneNote='" + this.f169322e + "', scene=" + this.f169323f + ", sceneNote='" + this.f169324g + "', usedState=" + this.f169325h + "', codeScene=" + this.f169332r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f169321d);
        parcel.writeString(this.f169322e);
        parcel.writeInt(this.f169323f);
        parcel.writeString(this.f169324g);
        parcel.writeInt(this.f169337w ? 1 : 0);
        parcel.writeInt(this.f169325h);
        parcel.writeInt(this.f169326i);
        parcel.writeString(this.f169327m);
        parcel.writeParcelable(this.f169329o, i17);
        parcel.writeString(this.f169328n);
        parcel.writeBundle(this.f169330p);
        parcel.writeInt(this.f169331q);
        parcel.writeInt(this.f169332r);
        parcel.writeString(this.f169333s);
        parcel.writeString(this.f169334t);
        parcel.writeString(this.f169335u);
        parcel.writeInt(this.f169336v);
    }

    public C12559xbdae8559(android.os.Parcel parcel) {
        this.f169331q = -1;
        this.f169332r = 0;
        this.f169321d = parcel.readInt();
        this.f169322e = parcel.readString();
        this.f169323f = parcel.readInt();
        this.f169324g = parcel.readString();
        this.f169337w = parcel.readInt() != 0;
        this.f169325h = parcel.readInt();
        this.f169326i = parcel.readInt();
        this.f169327m = parcel.readString();
        this.f169329o = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd.class.getClassLoader());
        this.f169328n = parcel.readString();
        this.f169330p = parcel.readBundle(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559.class.getClassLoader());
        this.f169331q = parcel.readInt();
        this.f169332r = parcel.readInt();
        this.f169333s = parcel.readString();
        this.f169334t = parcel.readString();
        this.f169335u = parcel.readString();
        this.f169336v = parcel.readInt();
    }
}
