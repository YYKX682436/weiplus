package com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.p1410x4e42091;

/* renamed from: com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult */
/* loaded from: classes5.dex */
public class C13538x88559b5c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.p1410x4e42091.C13538x88559b5c> f35510x681a0c0c = new m72.a();

    /* renamed from: data */
    public byte[] f35511x2eefaa;

    /* renamed from: result */
    public int f35512xc84dc81d;

    /* renamed from: sidedata */
    public byte[] f35513xcf84981;

    public C13538x88559b5c(int i17) {
        this.f35512xc84dc81d = i17;
        this.f35511x2eefaa = null;
        this.f35513xcf84981 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: setData */
    public void m55295x76491f2c(byte[] bArr) {
        this.f35511x2eefaa = bArr;
    }

    /* renamed from: setResult */
    public void m55296x209a1f1f(int i17) {
        this.f35512xc84dc81d = i17;
    }

    /* renamed from: setSidedata */
    public void m55297x838ae803(byte[] bArr) {
        this.f35513xcf84981 = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f35512xc84dc81d);
        parcel.writeByteArray(this.f35511x2eefaa);
        parcel.writeByteArray(this.f35513xcf84981);
    }

    public C13538x88559b5c(android.os.Parcel parcel) {
        this.f35512xc84dc81d = parcel.readInt();
        this.f35511x2eefaa = parcel.createByteArray();
        this.f35513xcf84981 = parcel.createByteArray();
    }
}
