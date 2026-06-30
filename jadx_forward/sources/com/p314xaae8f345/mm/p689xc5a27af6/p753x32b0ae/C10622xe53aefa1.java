package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* renamed from: com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData */
/* loaded from: classes8.dex */
class C10622xe53aefa1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10622xe53aefa1> f28882x681a0c0c = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.o1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148650e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148651f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f148652g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f148653h;

    public C10622xe53aefa1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.f148649d = str;
        this.f148650e = str2;
        this.f148651f = str3;
        this.f148652g = bool;
        this.f148653h = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f148649d);
        parcel.writeString(this.f148650e);
        parcel.writeString(this.f148651f);
        parcel.writeByte(this.f148652g.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f148653h.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public C10622xe53aefa1(android.os.Parcel parcel) {
        this.f148649d = parcel.readString();
        this.f148650e = parcel.readString();
        this.f148651f = parcel.readString();
        this.f148652g = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f148653h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
