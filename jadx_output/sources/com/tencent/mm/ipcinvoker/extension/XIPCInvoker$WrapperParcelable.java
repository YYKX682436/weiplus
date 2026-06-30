package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class XIPCInvoker$WrapperParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable> CREATOR = new com.tencent.mm.ipcinvoker.extension.k();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f68344e;

    public XIPCInvoker$WrapperParcelable(com.tencent.mm.ipcinvoker.extension.f fVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.ipcinvoker.extension.a b17;
        parcel.writeString(this.f68343d);
        java.lang.Object obj = this.f68344e;
        if (obj == null || (b17 = com.tencent.mm.ipcinvoker.extension.c.b(obj)) == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(b17.getName());
        b17.c(this.f68344e, parcel);
    }

    public XIPCInvoker$WrapperParcelable(java.lang.String str, java.lang.Object obj) {
        this.f68343d = str;
        this.f68344e = obj;
    }
}
