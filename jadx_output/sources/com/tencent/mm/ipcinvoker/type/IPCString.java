package com.tencent.mm.ipcinvoker.type;

/* loaded from: classes.dex */
public class IPCString implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.type.IPCString> CREATOR = new tk0.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68406d;

    public IPCString(java.lang.String str) {
        this.f68406d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ipcinvoker.type.IPCString)) {
            if (obj instanceof java.lang.String) {
                return obj.equals(this.f68406d);
            }
            return false;
        }
        java.lang.String str = this.f68406d;
        java.lang.String str2 = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public java.lang.String toString() {
        return this.f68406d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f68406d);
    }
}
