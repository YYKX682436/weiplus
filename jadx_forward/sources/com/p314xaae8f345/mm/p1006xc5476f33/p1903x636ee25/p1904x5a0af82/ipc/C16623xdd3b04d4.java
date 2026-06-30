package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc;

/* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse */
/* loaded from: classes7.dex */
public class C16623xdd3b04d4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16623xdd3b04d4> f37696x681a0c0c = new hl3.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232157d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f232158e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f232159f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f232160g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232161h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f232162i;

    /* renamed from: m, reason: collision with root package name */
    public final int f232163m;

    public C16623xdd3b04d4(b21.v vVar) {
        this.f232157d = vVar.f98901a;
        this.f232158e = vVar.f98902b;
        this.f232159f = vVar.f98903c;
        this.f232161h = vVar.f98905e;
        this.f232160g = vVar.f98906f;
        this.f232162i = vVar.f98904d;
        this.f232163m = vVar.f98907g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f232157d);
        parcel.writeString(this.f232158e);
        parcel.writeString(this.f232159f);
        parcel.writeString(this.f232160g);
        parcel.writeInt(this.f232161h);
        parcel.writeInt(this.f232163m);
        byte[] bArr = this.f232162i;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    public C16623xdd3b04d4(android.os.Parcel parcel) {
        this.f232157d = parcel.readString();
        this.f232158e = parcel.readString();
        this.f232159f = parcel.readString();
        this.f232160g = parcel.readString();
        this.f232161h = parcel.readInt();
        this.f232163m = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f232162i = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
