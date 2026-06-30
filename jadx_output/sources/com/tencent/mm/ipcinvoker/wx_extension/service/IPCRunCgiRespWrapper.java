package com.tencent.mm.ipcinvoker.wx_extension.service;

/* loaded from: classes7.dex */
public class IPCRunCgiRespWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper> CREATOR = new wk0.a();

    /* renamed from: d, reason: collision with root package name */
    public int f68455d;

    /* renamed from: e, reason: collision with root package name */
    public int f68456e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f68457f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f68458g;

    public IPCRunCgiRespWrapper(android.os.Parcel parcel) {
        this.f68455d = parcel.readInt();
        this.f68456e = parcel.readInt();
        this.f68457f = parcel.readString();
        this.f68458g = (com.tencent.mm.modelbase.o) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f68455d);
        parcel.writeInt(this.f68456e);
        parcel.writeString(this.f68457f);
        com.tencent.mm.ipcinvoker.extension.c.d(this.f68458g, parcel);
    }
}
