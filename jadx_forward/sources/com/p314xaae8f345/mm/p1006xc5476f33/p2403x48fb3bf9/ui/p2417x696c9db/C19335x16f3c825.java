package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData */
/* loaded from: classes8.dex */
class C19335x16f3c825 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19335x16f3c825> f38739x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b6();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265322d;

    /* renamed from: e, reason: collision with root package name */
    public final long f265323e;

    /* renamed from: f, reason: collision with root package name */
    public final float f265324f;

    /* renamed from: g, reason: collision with root package name */
    public final float f265325g;

    /* renamed from: h, reason: collision with root package name */
    public final int f265326h;

    /* renamed from: i, reason: collision with root package name */
    public final int f265327i;

    public C19335x16f3c825(java.lang.String str, long j17, float f17, float f18, int i17, int i18) {
        this.f265322d = str;
        this.f265323e = j17;
        this.f265324f = f17;
        this.f265325g = f18;
        this.f265326h = i17;
        this.f265327i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f265322d);
        parcel.writeLong(this.f265323e);
        parcel.writeFloat(this.f265324f);
        parcel.writeFloat(this.f265325g);
        parcel.writeInt(this.f265326h);
        parcel.writeInt(this.f265327i);
    }

    public C19335x16f3c825(android.os.Parcel parcel) {
        this.f265322d = parcel.readString();
        this.f265323e = parcel.readLong();
        this.f265324f = parcel.readFloat();
        this.f265325g = parcel.readFloat();
        this.f265326h = parcel.readInt();
        this.f265327i = parcel.readInt();
    }
}
