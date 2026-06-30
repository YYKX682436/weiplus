package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData */
/* loaded from: classes8.dex */
class C15496xce3811a4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15496xce3811a4> f36395x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.h1();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f218343d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f218344e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f218345f;

    public C15496xce3811a4(java.util.ArrayList arrayList, java.lang.String str, java.lang.Boolean bool) {
        this.f218343d = arrayList;
        this.f218344e = str;
        this.f218345f = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f218343d);
        parcel.writeString(this.f218344e);
        parcel.writeByte(this.f218345f ? (byte) 1 : (byte) 0);
    }

    public C15496xce3811a4(android.os.Parcel parcel) {
        this.f218343d = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357.f37911x681a0c0c);
        this.f218344e = parcel.readString();
        this.f218345f = parcel.readByte() != 0;
    }
}
