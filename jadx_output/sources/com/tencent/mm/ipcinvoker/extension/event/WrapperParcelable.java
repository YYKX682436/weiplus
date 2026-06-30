package com.tencent.mm.ipcinvoker.extension.event;

/* loaded from: classes7.dex */
class WrapperParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable> CREATOR = new com.tencent.mm.ipcinvoker.extension.event.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f68350d;

    public WrapperParcelable(com.tencent.mm.ipcinvoker.extension.event.a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.ipcinvoker.extension.a b17;
        java.lang.Object obj = this.f68350d;
        if (obj == null || (b17 = com.tencent.mm.ipcinvoker.extension.c.b(obj)) == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(b17.getName());
        b17.c(this.f68350d, parcel);
    }
}
