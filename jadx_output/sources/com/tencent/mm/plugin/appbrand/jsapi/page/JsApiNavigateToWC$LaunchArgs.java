package com.tencent.mm.plugin.appbrand.jsapi.page;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/page/JsApiNavigateToWC$LaunchArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiNavigateToWC$LaunchArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs> CREATOR = new nd1.v();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82493d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f82494e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f82495f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f82496g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f82497h;

    public JsApiNavigateToWC$LaunchArgs(java.lang.String url, android.os.Bundle singlePageUiParams, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC oldConfig, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(singlePageUiParams, "singlePageUiParams");
        kotlin.jvm.internal.o.g(oldConfig, "oldConfig");
        this.f82493d = url;
        this.f82494e = singlePageUiParams;
        this.f82495f = oldConfig;
        this.f82496g = num;
        this.f82497h = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs jsApiNavigateToWC$LaunchArgs = (com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs) obj;
        return kotlin.jvm.internal.o.b(this.f82493d, jsApiNavigateToWC$LaunchArgs.f82493d) && kotlin.jvm.internal.o.b(this.f82494e, jsApiNavigateToWC$LaunchArgs.f82494e) && kotlin.jvm.internal.o.b(this.f82495f, jsApiNavigateToWC$LaunchArgs.f82495f) && kotlin.jvm.internal.o.b(this.f82496g, jsApiNavigateToWC$LaunchArgs.f82496g) && kotlin.jvm.internal.o.b(this.f82497h, jsApiNavigateToWC$LaunchArgs.f82497h);
    }

    public int hashCode() {
        int hashCode = ((((this.f82493d.hashCode() * 31) + this.f82494e.hashCode()) * 31) + this.f82495f.hashCode()) * 31;
        java.lang.Integer num = this.f82496g;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f82497h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LaunchArgs(url=" + this.f82493d + ", singlePageUiParams=" + this.f82494e + ", oldConfig=" + this.f82495f + ", scene=" + this.f82496g + ", sceneNote=" + this.f82497h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82493d);
        out.writeBundle(this.f82494e);
        out.writeParcelable(this.f82495f, i17);
        java.lang.Integer num = this.f82496g;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f82497h);
    }
}
