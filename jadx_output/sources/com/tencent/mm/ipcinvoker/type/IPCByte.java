package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes7.dex */
public class IPCByte implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCByte> CREATOR = new tk0.b();

    /* renamed from: d, reason: collision with root package name */
    public byte f68401d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCByte) {
            return this.f68401d == ((com.tencent.mm.ipcinvoker.type.IPCByte) obj).f68401d;
        }
        if (obj instanceof java.lang.Byte) {
            return obj.equals(java.lang.Byte.valueOf(this.f68401d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Integer.toString(this.f68401d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f68401d);
    }
}
