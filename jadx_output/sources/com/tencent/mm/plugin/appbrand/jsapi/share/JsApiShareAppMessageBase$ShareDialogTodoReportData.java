package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes13.dex */
class JsApiShareAppMessageBase$ShareDialogTodoReportData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83054d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83055e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f83056f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83057g;

    /* renamed from: h, reason: collision with root package name */
    public final int f83058h;

    /* renamed from: i, reason: collision with root package name */
    public final int f83059i;

    public JsApiShareAppMessageBase$ShareDialogTodoReportData(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        this.f83054d = str;
        this.f83055e = str2;
        this.f83056f = str3;
        this.f83057g = i17;
        this.f83058h = i18;
        this.f83059i = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83054d);
        parcel.writeString(this.f83055e);
        parcel.writeString(this.f83056f);
        parcel.writeInt(this.f83057g);
        parcel.writeInt(this.f83058h);
        parcel.writeInt(this.f83059i);
    }

    public JsApiShareAppMessageBase$ShareDialogTodoReportData(android.os.Parcel parcel) {
        this.f83054d = parcel.readString();
        this.f83055e = parcel.readString();
        this.f83056f = parcel.readString();
        this.f83057g = parcel.readInt();
        this.f83058h = parcel.readInt();
        this.f83059i = parcel.readInt();
    }
}
