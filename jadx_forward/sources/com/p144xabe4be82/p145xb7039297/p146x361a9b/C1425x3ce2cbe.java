package com.p144xabe4be82.p145xb7039297.p146x361a9b;

/* renamed from: com.appaac.haptic.sync.VibrationPattern */
/* loaded from: classes15.dex */
public class C1425x3ce2cbe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p144xabe4be82.p145xb7039297.p146x361a9b.C1425x3ce2cbe> f4392x681a0c0c = new q6.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125451e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125452f;

    public C1425x3ce2cbe(java.lang.String str, int i17, int i18) {
        this.f125450d = str;
        this.f125451e = i17;
        this.f125452f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m15448x9616526c() {
        return "loop='" + this.f125451e + "',interval='" + this.f125452f + "'," + this.f125450d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125450d);
        parcel.writeInt(this.f125451e);
        parcel.writeInt(this.f125452f);
    }

    public C1425x3ce2cbe(android.os.Parcel parcel) {
        this.f125450d = parcel.readString();
        this.f125451e = parcel.readInt();
        this.f125452f = parcel.readInt();
    }
}
