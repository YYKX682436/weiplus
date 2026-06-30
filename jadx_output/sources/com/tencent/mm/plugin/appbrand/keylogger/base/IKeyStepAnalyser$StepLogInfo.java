package com.tencent.mm.plugin.appbrand.keylogger.base;

/* loaded from: classes7.dex */
public final class IKeyStepAnalyser$StepLogInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo> CREATOR = new kg1.d();

    /* renamed from: d, reason: collision with root package name */
    public long f84132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f84133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f84134f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84135g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f84136h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84137i;

    /* renamed from: m, reason: collision with root package name */
    public long f84138m;

    public IKeyStepAnalyser$StepLogInfo() {
        this.f84138m = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f84132d);
        parcel.writeString(this.f84133e);
        parcel.writeString(this.f84134f);
        parcel.writeByte(this.f84135g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f84136h);
        parcel.writeString(this.f84137i);
        parcel.writeLong(this.f84138m);
    }

    public IKeyStepAnalyser$StepLogInfo(android.os.Parcel parcel) {
        this.f84138m = -1L;
        this.f84132d = parcel.readLong();
        this.f84133e = parcel.readString();
        this.f84134f = parcel.readString();
        this.f84135g = parcel.readByte() != 0;
        this.f84136h = parcel.readString();
        this.f84137i = parcel.readString();
        this.f84138m = parcel.readLong();
    }
}
