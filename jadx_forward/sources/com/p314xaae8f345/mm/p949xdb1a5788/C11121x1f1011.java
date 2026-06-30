package com.p314xaae8f345.mm.p949xdb1a5788;

/* renamed from: com.tencent.mm.modelgeo.Addr */
/* loaded from: classes15.dex */
public class C11121x1f1011 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011> f32563x681a0c0c = new i11.a();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152744d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152745e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152746f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152747g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152748h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f152749i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f152750m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f152751n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f152752o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f152753p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f152754q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f152755r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f152756s;

    /* renamed from: t, reason: collision with root package name */
    public float f152757t;

    /* renamed from: u, reason: collision with root package name */
    public float f152758u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f152759v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Object f152760w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f152761x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f152762y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f152763z;

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f152745e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String str2 = this.f152746f;
        sb6.append(str2 != null ? str2 : "");
        sb6.append(b());
        return sb6.toString();
    }

    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152747g)) {
            sb6.append(this.f152747g);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152748h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Addr", "locality & locality_shi all invalid!!!");
        } else {
            sb6.append(this.f152748h);
        }
        java.lang.String str = this.f152749i;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String str2 = this.f152750m;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        java.lang.String str3 = this.f152751n;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        java.lang.String str4 = this.f152752o;
        sb6.append(str4 != null ? str4 : "");
        return sb6.toString();
    }

    public java.lang.String c() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152755r)) {
            return this.f152755r;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152744d)) {
            return this.f152744d;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152754q)) {
            return this.f152754q;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Addr", "all invalid!!!");
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48126x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("address='" + this.f152744d + '\'');
        sb6.append(", country='" + this.f152745e + '\'');
        sb6.append(", administrative_area_level_1='" + this.f152746f + '\'');
        sb6.append(", locality='" + this.f152747g + '\'');
        sb6.append(", locality_shi='" + this.f152748h + '\'');
        sb6.append(", sublocality='" + this.f152749i + '\'');
        sb6.append(", neighborhood='" + this.f152750m + '\'');
        sb6.append(", route='" + this.f152751n + '\'');
        sb6.append(", streetNum='" + this.f152752o + '\'');
        sb6.append(", town='" + this.f152753p + '\'');
        sb6.append(", roughAddr='" + this.f152754q + '\'');
        sb6.append(", poi_name='" + this.f152755r + '\'');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(", lat=");
        sb7.append(this.f152757t);
        sb6.append(sb7.toString());
        sb6.append(", lng=" + this.f152758u);
        sb6.append(", tag=" + this.f152760w);
        sb6.append(", cityCode=" + this.f152762y);
        sb6.append(", nationalCode=" + this.f152759v);
        sb6.append(", addressNameId=" + this.f152761x);
        sb6.append(", adCode=" + this.f152763z);
        sb6.append(", countryCode=" + this.A);
        sb6.append(", uid=" + this.B);
        sb6.append(", addressCode=" + this.C);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f152744d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f152745e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f152746f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f152747g;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f152748h;
        if (str5 == null) {
            str5 = "";
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f152749i;
        if (str6 == null) {
            str6 = "";
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f152750m;
        if (str7 == null) {
            str7 = "";
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f152751n;
        if (str8 == null) {
            str8 = "";
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f152752o;
        if (str9 == null) {
            str9 = "";
        }
        parcel.writeString(str9);
        java.lang.String str10 = this.f152753p;
        if (str10 == null) {
            str10 = "";
        }
        parcel.writeString(str10);
        java.lang.String str11 = this.f152754q;
        if (str11 == null) {
            str11 = "";
        }
        parcel.writeString(str11);
        java.lang.String str12 = this.f152755r;
        if (str12 == null) {
            str12 = "";
        }
        parcel.writeString(str12);
        parcel.writeFloat(this.f152757t);
        parcel.writeFloat(this.f152758u);
        java.lang.String str13 = this.f152759v;
        if (str13 == null) {
            str13 = "";
        }
        parcel.writeString(str13);
        java.lang.String str14 = this.f152761x;
        if (str14 == null) {
            str14 = "";
        }
        parcel.writeString(str14);
        java.lang.String str15 = this.f152763z;
        if (str15 == null) {
            str15 = "";
        }
        parcel.writeString(str15);
        java.lang.String str16 = this.B;
        parcel.writeString(str16 != null ? str16 : "");
    }
}
