package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc;

/* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest */
/* loaded from: classes7.dex */
public class C16622x2811239c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16622x2811239c> f37695x681a0c0c = new hl3.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f232153d;

    /* renamed from: e, reason: collision with root package name */
    public int f232154e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f232155f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f232156g;

    public C16622x2811239c() {
        this.f232153d = "";
        this.f232154e = 0;
        this.f232155f = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f232153d);
        parcel.writeInt(this.f232154e);
        parcel.writeString(this.f232155f);
        byte[] bArr = this.f232156g;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f232156g);
        }
    }

    public C16622x2811239c(android.os.Parcel parcel) {
        this.f232153d = "";
        this.f232154e = 0;
        this.f232155f = "";
        this.f232153d = parcel.readString();
        this.f232154e = parcel.readInt();
        this.f232155f = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f232156g = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
