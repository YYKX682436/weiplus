package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult */
/* loaded from: classes7.dex */
public class C11815xcf47e362 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362> f33590x681a0c0c = new k91.r2();

    /* renamed from: d, reason: collision with root package name */
    public int f158884d;

    /* renamed from: e, reason: collision with root package name */
    public int f158885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f158886f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158887g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158888h;

    public C11815xcf47e362() {
        this.f158884d = -1;
        this.f158885e = 0;
        this.f158886f = false;
        this.f158887g = false;
        this.f158888h = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50105xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 c11815xcf47e362 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362) obj;
        return this.f158884d == c11815xcf47e362.f158884d && this.f158885e == c11815xcf47e362.f158885e && this.f158886f == c11815xcf47e362.f158886f && this.f158887g == c11815xcf47e362.f158887g && this.f158888h == c11815xcf47e362.f158888h;
    }

    /* renamed from: toString */
    public java.lang.String m50106x9616526c() {
        return "GetOnLineInfoInfoResult{iconType=" + this.f158884d + ", clientVersion=" + this.f158885e + ", isWXOnline=" + this.f158886f + ", canSendXWechatOpenRequest=" + this.f158887g + ", canSendHandoffOpenRequest=" + this.f158888h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f158884d);
        parcel.writeInt(this.f158885e);
        parcel.writeByte(this.f158886f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158887g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158888h ? (byte) 1 : (byte) 0);
    }

    public C11815xcf47e362(android.os.Parcel parcel) {
        this.f158884d = -1;
        this.f158885e = 0;
        this.f158886f = false;
        this.f158887g = false;
        this.f158888h = false;
        this.f158884d = parcel.readInt();
        this.f158885e = parcel.readInt();
        this.f158886f = parcel.readByte() != 0;
        this.f158887g = parcel.readByte() != 0;
        this.f158888h = parcel.readByte() != 0;
    }
}
