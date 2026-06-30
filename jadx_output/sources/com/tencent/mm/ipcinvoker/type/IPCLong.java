package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes.dex */
public class IPCLong implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCLong> CREATOR = new tk0.f();

    /* renamed from: d, reason: collision with root package name */
    public long f68405d;

    public IPCLong(long j17) {
        this.f68405d = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCLong) {
            return this.f68405d == ((com.tencent.mm.ipcinvoker.type.IPCLong) obj).f68405d;
        }
        if (obj instanceof java.lang.Long) {
            return obj.equals(java.lang.Long.valueOf(this.f68405d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Long.toString(this.f68405d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f68405d);
    }
}
