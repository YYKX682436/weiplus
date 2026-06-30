package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
class LiteAppFeatureService$OpenLiteAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData> CREATOR = new com.tencent.mm.feature.lite.o1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67116d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67117e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f67118f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f67119g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f67120h;

    public LiteAppFeatureService$OpenLiteAppData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.f67116d = str;
        this.f67117e = str2;
        this.f67118f = str3;
        this.f67119g = bool;
        this.f67120h = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f67116d);
        parcel.writeString(this.f67117e);
        parcel.writeString(this.f67118f);
        parcel.writeByte(this.f67119g.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f67120h.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public LiteAppFeatureService$OpenLiteAppData(android.os.Parcel parcel) {
        this.f67116d = parcel.readString();
        this.f67117e = parcel.readString();
        this.f67118f = parcel.readString();
        this.f67119g = java.lang.Boolean.valueOf(parcel.readByte() != 0);
        this.f67120h = java.lang.Boolean.valueOf(parcel.readByte() != 0);
    }
}
