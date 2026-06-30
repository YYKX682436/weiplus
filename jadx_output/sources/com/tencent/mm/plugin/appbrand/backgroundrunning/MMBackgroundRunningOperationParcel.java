package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class MMBackgroundRunningOperationParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundrunning.f1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76945d;

    /* renamed from: e, reason: collision with root package name */
    public int f76946e;

    /* renamed from: f, reason: collision with root package name */
    public int f76947f;

    public MMBackgroundRunningOperationParcel(android.os.Parcel parcel) {
        this.f76945d = parcel.readString();
        this.f76946e = parcel.readInt();
        this.f76947f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "operation{appId='" + this.f76945d + "', usage=" + this.f76946e + ", operation=" + this.f76947f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76945d);
        parcel.writeInt(this.f76946e);
        parcel.writeInt(this.f76947f);
    }
}
