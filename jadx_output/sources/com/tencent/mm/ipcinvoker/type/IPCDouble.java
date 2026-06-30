package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes8.dex */
public class IPCDouble implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCDouble> CREATOR = new tk0.c();

    /* renamed from: d, reason: collision with root package name */
    public double f68402d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCDouble) {
            return this.f68402d == ((com.tencent.mm.ipcinvoker.type.IPCDouble) obj).f68402d;
        }
        if (obj instanceof java.lang.Double) {
            return obj.equals(java.lang.Double.valueOf(this.f68402d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Double.toString(this.f68402d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f68402d);
    }
}
