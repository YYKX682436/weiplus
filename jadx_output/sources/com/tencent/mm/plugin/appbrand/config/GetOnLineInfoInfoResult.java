package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class GetOnLineInfoInfoResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult> CREATOR = new k91.r2();

    /* renamed from: d, reason: collision with root package name */
    public int f77351d;

    /* renamed from: e, reason: collision with root package name */
    public int f77352e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f77353f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77354g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77355h;

    public GetOnLineInfoInfoResult() {
        this.f77351d = -1;
        this.f77352e = 0;
        this.f77353f = false;
        this.f77354g = false;
        this.f77355h = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = (com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult) obj;
        return this.f77351d == getOnLineInfoInfoResult.f77351d && this.f77352e == getOnLineInfoInfoResult.f77352e && this.f77353f == getOnLineInfoInfoResult.f77353f && this.f77354g == getOnLineInfoInfoResult.f77354g && this.f77355h == getOnLineInfoInfoResult.f77355h;
    }

    public java.lang.String toString() {
        return "GetOnLineInfoInfoResult{iconType=" + this.f77351d + ", clientVersion=" + this.f77352e + ", isWXOnline=" + this.f77353f + ", canSendXWechatOpenRequest=" + this.f77354g + ", canSendHandoffOpenRequest=" + this.f77355h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77351d);
        parcel.writeInt(this.f77352e);
        parcel.writeByte(this.f77353f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77354g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77355h ? (byte) 1 : (byte) 0);
    }

    public GetOnLineInfoInfoResult(android.os.Parcel parcel) {
        this.f77351d = -1;
        this.f77352e = 0;
        this.f77353f = false;
        this.f77354g = false;
        this.f77355h = false;
        this.f77351d = parcel.readInt();
        this.f77352e = parcel.readInt();
        this.f77353f = parcel.readByte() != 0;
        this.f77354g = parcel.readByte() != 0;
        this.f77355h = parcel.readByte() != 0;
    }
}
