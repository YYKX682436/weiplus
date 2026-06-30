package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.RespInfo */
/* loaded from: classes12.dex */
public class C11183xef8030be implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.C11183xef8030be> f32686x681a0c0c = new com.p314xaae8f345.mm.p971x6de15a2e.f3();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f153486d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153488f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f153489g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f153490h;

    /* renamed from: i, reason: collision with root package name */
    public final int f153491i;

    public C11183xef8030be(byte[] bArr, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f153486d = bArr;
        this.f153487e = str;
        this.f153488f = i17;
        this.f153489g = str2;
        this.f153490h = str3;
        this.f153491i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f153486d;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeString(this.f153487e);
        parcel.writeInt(this.f153488f);
        parcel.writeString(this.f153489g);
        parcel.writeString(this.f153490h);
        parcel.writeInt(this.f153491i);
    }

    public C11183xef8030be(android.os.Parcel parcel) {
        if (parcel.readInt() == 1) {
            byte[] bArr = new byte[parcel.readInt()];
            this.f153486d = bArr;
            parcel.readByteArray(bArr);
        }
        this.f153487e = parcel.readString();
        this.f153488f = parcel.readInt();
        this.f153489g = parcel.readString();
        this.f153490h = parcel.readString();
        this.f153491i = parcel.readInt();
    }
}
