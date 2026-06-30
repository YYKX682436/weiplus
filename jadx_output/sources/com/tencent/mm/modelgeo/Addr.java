package com.tencent.mm.modelgeo;

/* loaded from: classes15.dex */
public class Addr implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelgeo.Addr> CREATOR = new i11.a();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f71211d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71213f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f71214g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f71215h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f71216i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f71217m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f71218n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f71219o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f71220p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f71221q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f71222r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f71223s;

    /* renamed from: t, reason: collision with root package name */
    public float f71224t;

    /* renamed from: u, reason: collision with root package name */
    public float f71225u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f71226v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Object f71227w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f71228x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f71229y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f71230z;

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f71212e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String str2 = this.f71213f;
        sb6.append(str2 != null ? str2 : "");
        sb6.append(b());
        return sb6.toString();
    }

    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f71214g)) {
            sb6.append(this.f71214g);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f71215h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Addr", "locality & locality_shi all invalid!!!");
        } else {
            sb6.append(this.f71215h);
        }
        java.lang.String str = this.f71216i;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String str2 = this.f71217m;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        java.lang.String str3 = this.f71218n;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        java.lang.String str4 = this.f71219o;
        sb6.append(str4 != null ? str4 : "");
        return sb6.toString();
    }

    public java.lang.String c() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f71222r)) {
            return this.f71222r;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f71211d)) {
            return this.f71211d;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f71221q)) {
            return this.f71221q;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Addr", "all invalid!!!");
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("address='" + this.f71211d + '\'');
        sb6.append(", country='" + this.f71212e + '\'');
        sb6.append(", administrative_area_level_1='" + this.f71213f + '\'');
        sb6.append(", locality='" + this.f71214g + '\'');
        sb6.append(", locality_shi='" + this.f71215h + '\'');
        sb6.append(", sublocality='" + this.f71216i + '\'');
        sb6.append(", neighborhood='" + this.f71217m + '\'');
        sb6.append(", route='" + this.f71218n + '\'');
        sb6.append(", streetNum='" + this.f71219o + '\'');
        sb6.append(", town='" + this.f71220p + '\'');
        sb6.append(", roughAddr='" + this.f71221q + '\'');
        sb6.append(", poi_name='" + this.f71222r + '\'');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(", lat=");
        sb7.append(this.f71224t);
        sb6.append(sb7.toString());
        sb6.append(", lng=" + this.f71225u);
        sb6.append(", tag=" + this.f71227w);
        sb6.append(", cityCode=" + this.f71229y);
        sb6.append(", nationalCode=" + this.f71226v);
        sb6.append(", addressNameId=" + this.f71228x);
        sb6.append(", adCode=" + this.f71230z);
        sb6.append(", countryCode=" + this.A);
        sb6.append(", uid=" + this.B);
        sb6.append(", addressCode=" + this.C);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f71211d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f71212e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f71213f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f71214g;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f71215h;
        if (str5 == null) {
            str5 = "";
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f71216i;
        if (str6 == null) {
            str6 = "";
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f71217m;
        if (str7 == null) {
            str7 = "";
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f71218n;
        if (str8 == null) {
            str8 = "";
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f71219o;
        if (str9 == null) {
            str9 = "";
        }
        parcel.writeString(str9);
        java.lang.String str10 = this.f71220p;
        if (str10 == null) {
            str10 = "";
        }
        parcel.writeString(str10);
        java.lang.String str11 = this.f71221q;
        if (str11 == null) {
            str11 = "";
        }
        parcel.writeString(str11);
        java.lang.String str12 = this.f71222r;
        if (str12 == null) {
            str12 = "";
        }
        parcel.writeString(str12);
        parcel.writeFloat(this.f71224t);
        parcel.writeFloat(this.f71225u);
        java.lang.String str13 = this.f71226v;
        if (str13 == null) {
            str13 = "";
        }
        parcel.writeString(str13);
        java.lang.String str14 = this.f71228x;
        if (str14 == null) {
            str14 = "";
        }
        parcel.writeString(str14);
        java.lang.String str15 = this.f71230z;
        if (str15 == null) {
            str15 = "";
        }
        parcel.writeString(str15);
        java.lang.String str16 = this.B;
        parcel.writeString(str16 != null ? str16 : "");
    }
}
