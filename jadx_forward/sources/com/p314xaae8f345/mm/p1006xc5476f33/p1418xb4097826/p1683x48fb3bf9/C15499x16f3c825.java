package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ScanImageData */
/* loaded from: classes8.dex */
class C15499x16f3c825 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15499x16f3c825> f36396x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.m1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f218349d;

    /* renamed from: e, reason: collision with root package name */
    public final long f218350e;

    /* renamed from: f, reason: collision with root package name */
    public final float f218351f;

    /* renamed from: g, reason: collision with root package name */
    public final float f218352g;

    /* renamed from: h, reason: collision with root package name */
    public final int f218353h;

    /* renamed from: i, reason: collision with root package name */
    public final int f218354i;

    public C15499x16f3c825(java.lang.String str, long j17, float f17, float f18, int i17, int i18) {
        this.f218349d = str;
        this.f218350e = j17;
        this.f218351f = f17;
        this.f218352g = f18;
        this.f218353h = i17;
        this.f218354i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f218349d);
        parcel.writeLong(this.f218350e);
        parcel.writeFloat(this.f218351f);
        parcel.writeFloat(this.f218352g);
        parcel.writeInt(this.f218353h);
        parcel.writeInt(this.f218354i);
    }

    public C15499x16f3c825(android.os.Parcel parcel) {
        this.f218349d = parcel.readString();
        this.f218350e = parcel.readLong();
        this.f218351f = parcel.readFloat();
        this.f218352g = parcel.readFloat();
        this.f218353h = parcel.readInt();
        this.f218354i = parcel.readInt();
    }
}
