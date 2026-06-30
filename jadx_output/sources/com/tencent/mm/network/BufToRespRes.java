package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class BufToRespRes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.BufToRespRes> CREATOR = new com.tencent.mm.network.h();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f71924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71925e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71926f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71927g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71928h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71929i;

    /* renamed from: m, reason: collision with root package name */
    public final int f71930m;

    /* renamed from: n, reason: collision with root package name */
    public final int f71931n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f71932o;

    public BufToRespRes(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str) {
        this.f71924d = bArr;
        this.f71925e = i17;
        this.f71926f = i18;
        this.f71927g = i19;
        this.f71928h = i27;
        this.f71929i = i28;
        this.f71930m = i29;
        this.f71931n = i37;
        this.f71932o = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f71924d;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f71925e);
        parcel.writeInt(this.f71926f);
        parcel.writeInt(this.f71927g);
        parcel.writeInt(this.f71928h);
        parcel.writeInt(this.f71929i);
        parcel.writeInt(this.f71930m);
        parcel.writeInt(this.f71931n);
        parcel.writeString(this.f71932o);
    }

    public BufToRespRes(android.os.Parcel parcel) {
        if (parcel.readInt() == 1) {
            byte[] bArr = new byte[parcel.readInt()];
            this.f71924d = bArr;
            parcel.readByteArray(bArr);
        }
        this.f71925e = parcel.readInt();
        this.f71926f = parcel.readInt();
        this.f71927g = parcel.readInt();
        this.f71928h = parcel.readInt();
        this.f71929i = parcel.readInt();
        this.f71930m = parcel.readInt();
        this.f71931n = parcel.readInt();
        this.f71932o = parcel.readString();
    }
}
