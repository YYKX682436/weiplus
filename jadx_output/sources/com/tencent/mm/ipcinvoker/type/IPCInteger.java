package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes.dex */
public class IPCInteger implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCInteger> CREATOR = new tk0.e();

    /* renamed from: d, reason: collision with root package name */
    public int f68404d;

    public IPCInteger(int i17) {
        this.f68404d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCInteger) {
            return this.f68404d == ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        }
        if (obj instanceof java.lang.Integer) {
            return obj.equals(java.lang.Integer.valueOf(this.f68404d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Integer.toString(this.f68404d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f68404d);
    }
}
