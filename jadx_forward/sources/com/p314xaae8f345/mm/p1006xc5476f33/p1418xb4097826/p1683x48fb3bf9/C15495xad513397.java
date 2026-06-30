package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$CancelRecogQBarData */
/* loaded from: classes8.dex */
class C15495xad513397 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15495xad513397> f36394x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.g1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f218341d;

    /* renamed from: e, reason: collision with root package name */
    public final long f218342e;

    public C15495xad513397(java.lang.String str, long j17) {
        this.f218341d = str;
        this.f218342e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f218341d);
        parcel.writeLong(this.f218342e);
    }

    public C15495xad513397(android.os.Parcel parcel) {
        this.f218341d = parcel.readString();
        this.f218342e = parcel.readLong();
    }
}
