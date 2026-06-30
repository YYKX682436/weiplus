package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class AppBrandStatObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.AppBrandStatObject> CREATOR = new com.tencent.mm.plugin.appbrand.report.a1();

    /* renamed from: d, reason: collision with root package name */
    public int f87788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87789e;

    /* renamed from: f, reason: collision with root package name */
    public int f87790f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f87791g;

    /* renamed from: h, reason: collision with root package name */
    public int f87792h;

    /* renamed from: i, reason: collision with root package name */
    public int f87793i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f87794m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f87795n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj f87796o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f87797p;

    /* renamed from: q, reason: collision with root package name */
    public int f87798q;

    /* renamed from: r, reason: collision with root package name */
    public int f87799r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f87800s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f87801t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f87802u;

    /* renamed from: v, reason: collision with root package name */
    public int f87803v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f87804w;

    public AppBrandStatObject() {
        this.f87798q = -1;
        this.f87799r = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandStatObject{preScene=" + this.f87788d + ", preSceneNote='" + this.f87789e + "', scene=" + this.f87790f + ", sceneNote='" + this.f87791g + "', usedState=" + this.f87792h + "', codeScene=" + this.f87799r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f87788d);
        parcel.writeString(this.f87789e);
        parcel.writeInt(this.f87790f);
        parcel.writeString(this.f87791g);
        parcel.writeInt(this.f87804w ? 1 : 0);
        parcel.writeInt(this.f87792h);
        parcel.writeInt(this.f87793i);
        parcel.writeString(this.f87794m);
        parcel.writeParcelable(this.f87796o, i17);
        parcel.writeString(this.f87795n);
        parcel.writeBundle(this.f87797p);
        parcel.writeInt(this.f87798q);
        parcel.writeInt(this.f87799r);
        parcel.writeString(this.f87800s);
        parcel.writeString(this.f87801t);
        parcel.writeString(this.f87802u);
        parcel.writeInt(this.f87803v);
    }

    public AppBrandStatObject(android.os.Parcel parcel) {
        this.f87798q = -1;
        this.f87799r = 0;
        this.f87788d = parcel.readInt();
        this.f87789e = parcel.readString();
        this.f87790f = parcel.readInt();
        this.f87791g = parcel.readString();
        this.f87804w = parcel.readInt() != 0;
        this.f87792h = parcel.readInt();
        this.f87793i = parcel.readInt();
        this.f87794m = parcel.readString();
        this.f87796o = (com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj.class.getClassLoader());
        this.f87795n = parcel.readString();
        this.f87797p = parcel.readBundle(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        this.f87798q = parcel.readInt();
        this.f87799r = parcel.readInt();
        this.f87800s = parcel.readString();
        this.f87801t = parcel.readString();
        this.f87802u = parcel.readString();
        this.f87803v = parcel.readInt();
    }
}
