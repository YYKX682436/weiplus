package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
final class IPCRunCgi$IPCRunCgiParamsWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper> CREATOR = new com.tencent.mm.ipcinvoker.wx_extension.c0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68412d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f68413e;

    public IPCRunCgi$IPCRunCgiParamsWrapper(android.os.Parcel parcel) {
        this.f68412d = parcel.readString();
        this.f68413e = (com.tencent.mm.modelbase.o) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f68412d);
        com.tencent.mm.ipcinvoker.extension.c.d(this.f68413e, parcel);
    }
}
