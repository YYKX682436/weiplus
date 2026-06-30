package com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5;

/* renamed from: com.tencent.mm.pluginsdk.location.LocationIntent */
/* loaded from: classes12.dex */
public class C19584xa6c132d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1> f38826x681a0c0c = new w25.k();

    /* renamed from: d, reason: collision with root package name */
    public double f270270d;

    /* renamed from: e, reason: collision with root package name */
    public double f270271e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f270276m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f270279p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f270280q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f270281r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f270282s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f270283t;

    /* renamed from: u, reason: collision with root package name */
    public float f270284u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f270285v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f270286w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f270287x;

    /* renamed from: f, reason: collision with root package name */
    public int f270272f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f270273g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270274h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f270275i = "";

    /* renamed from: n, reason: collision with root package name */
    public int f270277n = 0;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 f270278o = null;

    public java.lang.String a() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("lat " + this.f270270d + ";");
        stringBuffer.append("lng " + this.f270271e + ";");
        stringBuffer.append("scale " + this.f270272f + ";");
        stringBuffer.append("label " + this.f270273g + ";");
        stringBuffer.append("poiname " + this.f270274h + ";");
        stringBuffer.append("infourl " + this.f270275i + ";");
        stringBuffer.append("locTypeId " + this.f270276m + ";");
        stringBuffer.append("poiType " + this.f270277n + ";");
        if (this.f270278o != null) {
            stringBuffer.append("addr " + this.f270278o.m48126x9616526c() + ";");
        }
        stringBuffer.append("poiid " + this.f270279p + ";");
        stringBuffer.append("fromPoiList " + this.f270280q + ";");
        stringBuffer.append("categoryTips " + this.f270281r + ";");
        stringBuffer.append("businessHour " + this.f270282s + ";");
        stringBuffer.append("phone " + this.f270283t + ";");
        stringBuffer.append("priceTips " + this.f270284u + ";");
        stringBuffer.append("nearByPoiid " + this.f270285v + ";");
        stringBuffer.append("buildingID:" + this.f270286w + ";");
        stringBuffer.append("floorName:" + this.f270287x + ";");
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f270270d);
        parcel.writeDouble(this.f270271e);
        parcel.writeInt(this.f270272f);
        parcel.writeString(this.f270273g);
        parcel.writeString(this.f270274h);
        parcel.writeString(this.f270275i);
        parcel.writeString(this.f270276m);
        parcel.writeInt(this.f270277n);
        parcel.writeParcelable(this.f270278o, i17);
        parcel.writeString(this.f270279p);
        parcel.writeInt(this.f270280q ? 1 : 0);
        parcel.writeString(this.f270281r);
        parcel.writeString(this.f270282s);
        parcel.writeString(this.f270283t);
        parcel.writeFloat(this.f270284u);
        parcel.writeString(this.f270285v);
        parcel.writeString(this.f270286w);
        parcel.writeString(this.f270287x);
    }
}
