package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiGetWeAppNewTipsInfo$NewTipInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.l6();

    /* renamed from: d, reason: collision with root package name */
    public final int f78523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78524e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f78525f;

    /* renamed from: g, reason: collision with root package name */
    public final int f78526g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f78527h;

    public JsApiGetWeAppNewTipsInfo$NewTipInfo(int i17, java.lang.String title, java.lang.String iconUrl, int i18, java.lang.String uniqueId) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        this.f78523d = i17;
        this.f78524e = title;
        this.f78525f = iconUrl;
        this.f78526g = i18;
        this.f78527h = uniqueId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo jsApiGetWeAppNewTipsInfo$NewTipInfo = (com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo) obj;
        return this.f78523d == jsApiGetWeAppNewTipsInfo$NewTipInfo.f78523d && kotlin.jvm.internal.o.b(this.f78524e, jsApiGetWeAppNewTipsInfo$NewTipInfo.f78524e) && kotlin.jvm.internal.o.b(this.f78525f, jsApiGetWeAppNewTipsInfo$NewTipInfo.f78525f) && this.f78526g == jsApiGetWeAppNewTipsInfo$NewTipInfo.f78526g && kotlin.jvm.internal.o.b(this.f78527h, jsApiGetWeAppNewTipsInfo$NewTipInfo.f78527h);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f78523d) * 31) + this.f78524e.hashCode()) * 31) + this.f78525f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f78526g)) * 31) + this.f78527h.hashCode();
    }

    public java.lang.String toString() {
        return "NewTipInfo(showType=" + this.f78523d + ", title=" + this.f78524e + ", iconUrl=" + this.f78525f + ", tipsId=" + this.f78526g + ", uniqueId=" + this.f78527h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f78523d);
        out.writeString(this.f78524e);
        out.writeString(this.f78525f);
        out.writeInt(this.f78526g);
        out.writeString(this.f78527h);
    }
}
