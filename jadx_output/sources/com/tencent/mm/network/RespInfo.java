package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class RespInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.RespInfo> CREATOR = new com.tencent.mm.network.f3();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f71953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71954e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71955f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f71956g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f71957h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71958i;

    public RespInfo(byte[] bArr, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f71953d = bArr;
        this.f71954e = str;
        this.f71955f = i17;
        this.f71956g = str2;
        this.f71957h = str3;
        this.f71958i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f71953d;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeString(this.f71954e);
        parcel.writeInt(this.f71955f);
        parcel.writeString(this.f71956g);
        parcel.writeString(this.f71957h);
        parcel.writeInt(this.f71958i);
    }

    public RespInfo(android.os.Parcel parcel) {
        if (parcel.readInt() == 1) {
            byte[] bArr = new byte[parcel.readInt()];
            this.f71953d = bArr;
            parcel.readByteArray(bArr);
        }
        this.f71954e = parcel.readString();
        this.f71955f = parcel.readInt();
        this.f71956g = parcel.readString();
        this.f71957h = parcel.readString();
        this.f71958i = parcel.readInt();
    }
}
