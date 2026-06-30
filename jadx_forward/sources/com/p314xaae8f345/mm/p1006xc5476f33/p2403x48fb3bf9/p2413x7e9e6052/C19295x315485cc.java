package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper */
/* loaded from: classes8.dex */
final class C19295x315485cc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19295x315485cc> f38734x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.d0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f264768d;

    /* renamed from: e, reason: collision with root package name */
    public int f264769e;

    /* renamed from: f, reason: collision with root package name */
    public int f264770f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f264771g;

    public C19295x315485cc(android.os.Parcel parcel) {
        this.f264768d = parcel.readString();
        this.f264769e = parcel.readInt();
        this.f264770f = parcel.readInt();
        this.f264771g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f264768d);
        parcel.writeInt(this.f264769e);
        parcel.writeInt(this.f264770f);
        parcel.writeString(this.f264771g);
    }
}
