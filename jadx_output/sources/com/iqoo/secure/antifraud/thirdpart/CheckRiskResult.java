package com.iqoo.secure.antifraud.thirdpart;

/* loaded from: classes13.dex */
public class CheckRiskResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.iqoo.secure.antifraud.thirdpart.CheckRiskResult> CREATOR = new nb.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f45813d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45814e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45815f;

    public CheckRiskResult(android.os.Parcel parcel) {
        this.f45813d = parcel.readInt();
        this.f45814e = parcel.readInt();
        this.f45815f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f45813d);
        parcel.writeInt(this.f45814e);
        parcel.writeInt(this.f45815f);
    }
}
