package com.appaac.haptic.sync;

/* loaded from: classes15.dex */
public class VibrationPattern implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.appaac.haptic.sync.VibrationPattern> CREATOR = new q6.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f43917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43919f;

    public VibrationPattern(java.lang.String str, int i17, int i18) {
        this.f43917d = str;
        this.f43918e = i17;
        this.f43919f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "loop='" + this.f43918e + "',interval='" + this.f43919f + "'," + this.f43917d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f43917d);
        parcel.writeInt(this.f43918e);
        parcel.writeInt(this.f43919f);
    }

    public VibrationPattern(android.os.Parcel parcel) {
        this.f43917d = parcel.readString();
        this.f43918e = parcel.readInt();
        this.f43919f = parcel.readInt();
    }
}
