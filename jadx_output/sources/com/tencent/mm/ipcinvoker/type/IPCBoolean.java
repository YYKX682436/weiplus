package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes.dex */
public class IPCBoolean implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCBoolean> CREATOR = new tk0.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f68400d;

    public IPCBoolean(boolean z17) {
        this.f68400d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.ipcinvoker.type.IPCBoolean) {
            return this.f68400d == ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        }
        if (obj instanceof java.lang.Boolean) {
            return obj.equals(java.lang.Boolean.valueOf(this.f68400d));
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.Boolean.toString(this.f68400d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f68400d ? 1 : 0);
    }
}
