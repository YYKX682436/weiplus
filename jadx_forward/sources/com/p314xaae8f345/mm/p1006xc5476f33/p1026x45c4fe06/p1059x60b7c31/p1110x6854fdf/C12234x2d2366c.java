package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData */
/* loaded from: classes13.dex */
class C12234x2d2366c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12234x2d2366c> f34777x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164587d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164588e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f164590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f164591h;

    /* renamed from: i, reason: collision with root package name */
    public final int f164592i;

    public C12234x2d2366c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        this.f164587d = str;
        this.f164588e = str2;
        this.f164589f = str3;
        this.f164590g = i17;
        this.f164591h = i18;
        this.f164592i = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164587d);
        parcel.writeString(this.f164588e);
        parcel.writeString(this.f164589f);
        parcel.writeInt(this.f164590g);
        parcel.writeInt(this.f164591h);
        parcel.writeInt(this.f164592i);
    }

    public C12234x2d2366c(android.os.Parcel parcel) {
        this.f164587d = parcel.readString();
        this.f164588e = parcel.readString();
        this.f164589f = parcel.readString();
        this.f164590g = parcel.readInt();
        this.f164591h = parcel.readInt();
        this.f164592i = parcel.readInt();
    }
}
