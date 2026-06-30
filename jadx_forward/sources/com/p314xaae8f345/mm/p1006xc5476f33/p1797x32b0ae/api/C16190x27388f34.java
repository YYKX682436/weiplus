package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* renamed from: com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig */
/* loaded from: classes9.dex */
public class C16190x27388f34 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34> f37325x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.k();

    /* renamed from: d, reason: collision with root package name */
    public double f224943d;

    /* renamed from: e, reason: collision with root package name */
    public double f224944e;

    /* renamed from: f, reason: collision with root package name */
    public double f224945f;

    /* renamed from: g, reason: collision with root package name */
    public double f224946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224947h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224948i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 f224949m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224950n;

    public C16190x27388f34() {
        this.f224943d = 1.0d;
        this.f224944e = 0.75d;
        this.f224945f = 0.0d;
        this.f224946g = 0.75d;
        this.f224947h = false;
        this.f224948i = false;
        this.f224949m = null;
        this.f224950n = false;
        new android.util.DisplayMetrics();
        double d17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels * 1.0d) / com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().heightPixels;
        this.f224945f = d17;
        if (d17 > 1.0d) {
            this.f224945f = 1.0d / d17;
        }
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
        try {
            if (jSONObject.has("portraitWidthPercent")) {
                c16190x27388f34.f224943d = jSONObject.getDouble("portraitWidthPercent");
            }
            if (jSONObject.has("portraitHeightPercent")) {
                c16190x27388f34.f224944e = jSONObject.getDouble("portraitHeightPercent");
            }
            if (jSONObject.has("landscapeWidthPercent")) {
                c16190x27388f34.f224945f = jSONObject.getDouble("landscapeWidthPercent");
            }
            if (jSONObject.has("landscapeHeightPercent")) {
                c16190x27388f34.f224946g = jSONObject.getDouble("landscapeHeightPercent");
            }
            if (jSONObject.has("enableDragToClose")) {
                c16190x27388f34.f224947h = jSONObject.getBoolean("enableDragToClose");
            }
            if (jSONObject.has("enableDragToFullScreen")) {
                c16190x27388f34.f224948i = jSONObject.getBoolean("enableDragToFullScreen");
            }
            if (jSONObject.has("hideBgMask")) {
                c16190x27388f34.f224950n = jSONObject.getBoolean("hideBgMask");
            }
        } catch (org.json.JSONException unused) {
        }
        return c16190x27388f34;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f224943d);
        parcel.writeDouble(this.f224944e);
        parcel.writeDouble(this.f224945f);
        parcel.writeDouble(this.f224946g);
        parcel.writeInt(this.f224947h ? 1 : 0);
        parcel.writeInt(this.f224948i ? 1 : 0);
        parcel.writeParcelable(this.f224949m, i17);
        parcel.writeInt(this.f224950n ? 1 : 0);
    }

    public C16190x27388f34(android.os.Parcel parcel) {
        this.f224943d = 1.0d;
        this.f224944e = 0.75d;
        this.f224945f = 0.0d;
        this.f224946g = 0.75d;
        this.f224947h = false;
        this.f224948i = false;
        this.f224949m = null;
        this.f224950n = false;
        this.f224943d = parcel.readDouble();
        this.f224944e = parcel.readDouble();
        this.f224945f = parcel.readDouble();
        this.f224946g = parcel.readDouble();
        this.f224947h = parcel.readInt() == 1;
        this.f224948i = parcel.readInt() == 1;
        this.f224949m = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588.class.getClassLoader());
        this.f224950n = parcel.readInt() == 1;
    }
}
