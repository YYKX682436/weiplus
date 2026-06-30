package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes8.dex */
public class AppBrandRecommendStatObj implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj> CREATOR = new com.tencent.mm.plugin.appbrand.report.u0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87776d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f87777e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f87778f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f87779g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f87780h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f87781i;

    /* renamed from: m, reason: collision with root package name */
    public final int f87782m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f87783n;

    /* renamed from: o, reason: collision with root package name */
    public final int f87784o;

    /* renamed from: p, reason: collision with root package name */
    public final float f87785p;

    /* renamed from: q, reason: collision with root package name */
    public final float f87786q;

    /* renamed from: r, reason: collision with root package name */
    public final long f87787r;

    public AppBrandRecommendStatObj(android.os.Parcel parcel) {
        this.f87776d = parcel.readString();
        this.f87777e = parcel.readString();
        this.f87778f = parcel.readString();
        this.f87779g = parcel.readString();
        this.f87780h = parcel.readString();
        this.f87781i = parcel.readString();
        this.f87782m = parcel.readInt();
        this.f87783n = parcel.readString();
        this.f87784o = parcel.readInt();
        this.f87785p = parcel.readFloat();
        this.f87786q = parcel.readFloat();
        this.f87787r = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandRecommendStatObj{username=" + this.f87776d + ", recommend_id='" + this.f87777e + "', strategy_info=" + this.f87778f + ", appid='" + this.f87779g + "', page_path=" + this.f87780h + ", page_param=" + this.f87781i + ", card_type=" + this.f87782m + ", pass_str=" + this.f87783n + ", position=" + this.f87784o + ", longitude=" + this.f87785p + ", latitude=" + this.f87786q + ", sessionId=" + this.f87787r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f87776d);
        parcel.writeString(this.f87777e);
        parcel.writeString(this.f87778f);
        parcel.writeString(this.f87779g);
        parcel.writeString(this.f87780h);
        parcel.writeString(this.f87781i);
        parcel.writeInt(this.f87782m);
        parcel.writeString(this.f87783n);
        parcel.writeInt(this.f87784o);
        parcel.writeFloat(this.f87785p);
        parcel.writeFloat(this.f87786q);
        parcel.writeLong(this.f87787r);
    }
}
