package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes8.dex */
public class IPCFloat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCFloat> CREATOR = new tk0.d();

    /* renamed from: d, reason: collision with root package name */
    public float f68403d;

    public IPCFloat(float f17) {
        this.f68403d = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCFloat) {
            return this.f68403d == ((com.tencent.mm.ipcinvoker.type.IPCFloat) obj).f68403d;
        }
        if (obj instanceof java.lang.Float) {
            return obj.equals(java.lang.Float.valueOf(this.f68403d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Float.toString(this.f68403d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f68403d);
    }
}
