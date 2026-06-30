package com.p314xaae8f345.p2891x34da02;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/qbar/ScanDecodeFrameData;", "Landroid/os/Parcelable;", "scan-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.qbar.ScanDecodeFrameData */
/* loaded from: classes13.dex */
public final class C25308xdf65b80c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2891x34da02.C25308xdf65b80c> f45405x681a0c0c = new zs5.k0();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f296771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296772e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296773f;

    /* renamed from: g, reason: collision with root package name */
    public final int f296774g;

    public C25308xdf65b80c(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f296771d = parcel.createByteArray();
        this.f296772e = parcel.readInt();
        this.f296773f = parcel.readInt();
        this.f296774g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByteArray(this.f296771d);
        parcel.writeInt(this.f296772e);
        parcel.writeInt(this.f296773f);
        parcel.writeInt(this.f296774g);
    }
}
