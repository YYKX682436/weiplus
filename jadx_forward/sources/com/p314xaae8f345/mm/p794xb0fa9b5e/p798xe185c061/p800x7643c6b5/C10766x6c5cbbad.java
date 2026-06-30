package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper */
/* loaded from: classes7.dex */
public class C10766x6c5cbbad implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad> f29265x681a0c0c = new wk0.a();

    /* renamed from: d, reason: collision with root package name */
    public int f149988d;

    /* renamed from: e, reason: collision with root package name */
    public int f149989e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149990f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f149991g;

    public C10766x6c5cbbad(android.os.Parcel parcel) {
        this.f149988d = parcel.readInt();
        this.f149989e = parcel.readInt();
        this.f149990f = parcel.readString();
        this.f149991g = (com.p314xaae8f345.mm.p944x882e457a.o) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f149988d);
        parcel.writeInt(this.f149989e);
        parcel.writeString(this.f149990f);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(this.f149991g, parcel);
    }
}
