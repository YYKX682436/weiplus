package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo */
/* loaded from: classes7.dex */
public final class C12311xaad8723 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723> f35040x681a0c0c = new kg1.d();

    /* renamed from: d, reason: collision with root package name */
    public long f165665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f165666e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f165667f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f165668g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f165669h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f165670i;

    /* renamed from: m, reason: collision with root package name */
    public long f165671m;

    public C12311xaad8723() {
        this.f165671m = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f165665d);
        parcel.writeString(this.f165666e);
        parcel.writeString(this.f165667f);
        parcel.writeByte(this.f165668g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f165669h);
        parcel.writeString(this.f165670i);
        parcel.writeLong(this.f165671m);
    }

    public C12311xaad8723(android.os.Parcel parcel) {
        this.f165671m = -1L;
        this.f165665d = parcel.readLong();
        this.f165666e = parcel.readString();
        this.f165667f = parcel.readString();
        this.f165668g = parcel.readByte() != 0;
        this.f165669h = parcel.readString();
        this.f165670i = parcel.readString();
        this.f165671m = parcel.readLong();
    }
}
