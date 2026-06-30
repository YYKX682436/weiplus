package com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/openim/impl/SpamInfo;", "Landroid/os/Parcelable;", "CREATOR", "cb0/f", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.openim.impl.SpamInfo */
/* loaded from: classes10.dex */
public final class C10636x7e6467b7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final cb0.f f28883x681a0c0c = new cb0.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f148851d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148852e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f148853f;

    public C10636x7e6467b7(int i17, java.lang.String str, byte[] bArr) {
        this.f148851d = i17;
        this.f148852e = str;
        this.f148853f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f148851d);
        parcel.writeString(this.f148852e);
        parcel.writeByteArray(this.f148853f);
    }
}
