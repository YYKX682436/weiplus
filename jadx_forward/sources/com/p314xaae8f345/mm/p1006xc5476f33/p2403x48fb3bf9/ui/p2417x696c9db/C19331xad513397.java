package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData */
/* loaded from: classes8.dex */
class C19331xad513397 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19331xad513397> f38737x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265314d;

    /* renamed from: e, reason: collision with root package name */
    public final long f265315e;

    public C19331xad513397(java.lang.String str, long j17) {
        this.f265314d = str;
        this.f265315e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f265314d);
        parcel.writeLong(this.f265315e);
    }

    public C19331xad513397(android.os.Parcel parcel) {
        this.f265314d = parcel.readString();
        this.f265315e = parcel.readLong();
    }
}
