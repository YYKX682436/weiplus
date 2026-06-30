package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$OpenLiteAppData */
/* loaded from: classes8.dex */
public class C15887xf290520 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15887xf290520> f36929x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o2();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f221110d;

    public C15887xf290520(android.os.Bundle bundle) {
        this.f221110d = new android.os.Bundle();
        this.f221110d = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeBundle(this.f221110d);
    }

    public C15887xf290520(android.os.Parcel parcel) {
        this.f221110d = new android.os.Bundle();
        this.f221110d = parcel.readBundle();
    }
}
