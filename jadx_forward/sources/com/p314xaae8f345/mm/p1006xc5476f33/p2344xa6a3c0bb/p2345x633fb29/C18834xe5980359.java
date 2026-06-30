package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.p2345x633fb29;

/* renamed from: com.tencent.mm.plugin.voiceprint.model.VertifyInfo */
/* loaded from: classes16.dex */
public class C18834xe5980359 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.p2345x633fb29.C18834xe5980359> f38603x681a0c0c = new fq4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f257687d;

    /* renamed from: e, reason: collision with root package name */
    public int f257688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f257689f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f257690g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f257691h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f257692i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f257693m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f257694n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f257695o = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f257687d);
        parcel.writeInt(this.f257688e);
        parcel.writeInt(this.f257691h);
        parcel.writeInt(this.f257692i);
        java.lang.String str = this.f257689f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f257690g;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f257693m;
        parcel.writeString(str3 != null ? str3 : "");
        parcel.writeInt(this.f257694n ? 1 : 0);
        parcel.writeInt(this.f257695o ? 1 : 0);
    }
}
