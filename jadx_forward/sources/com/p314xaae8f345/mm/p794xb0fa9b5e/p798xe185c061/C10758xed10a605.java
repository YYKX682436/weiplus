package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper */
/* loaded from: classes7.dex */
final class C10758xed10a605 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.C10758xed10a605> f29264x681a0c0c = new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149945d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f149946e;

    public C10758xed10a605(android.os.Parcel parcel) {
        this.f149945d = parcel.readString();
        this.f149946e = (com.p314xaae8f345.mm.p944x882e457a.o) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f149945d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(this.f149946e, parcel);
    }
}
