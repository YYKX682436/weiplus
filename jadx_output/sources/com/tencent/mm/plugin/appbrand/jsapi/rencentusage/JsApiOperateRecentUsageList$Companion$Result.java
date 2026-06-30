package com.tencent.mm.plugin.appbrand.jsapi.rencentusage;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final /* data */ class JsApiOperateRecentUsageList$Companion$Result implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result> CREATOR = new td1.n();

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result f82918g = new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result(true, td1.l.f417608e, null, 4, null);

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result f82919h = new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result(false, td1.l.f417609f, null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82920d;

    /* renamed from: e, reason: collision with root package name */
    public final td1.l f82921e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82922f;

    public JsApiOperateRecentUsageList$Companion$Result(boolean z17, td1.l errorCode, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f82920d = z17;
        this.f82921e = errorCode;
        this.f82922f = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result jsApiOperateRecentUsageList$Companion$Result = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result) obj;
        return this.f82920d == jsApiOperateRecentUsageList$Companion$Result.f82920d && this.f82921e == jsApiOperateRecentUsageList$Companion$Result.f82921e && kotlin.jvm.internal.o.b(this.f82922f, jsApiOperateRecentUsageList$Companion$Result.f82922f);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f82920d) * 31) + this.f82921e.hashCode()) * 31) + this.f82922f.hashCode();
    }

    public java.lang.String toString() {
        return "Result(success=" + this.f82920d + ", errorCode=" + this.f82921e + ", errorMsg=" + this.f82922f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByte(this.f82920d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f82921e.name());
        parcel.writeString(this.f82922f);
    }

    public /* synthetic */ JsApiOperateRecentUsageList$Companion$Result(boolean z17, td1.l lVar, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, lVar, (i17 & 4) != 0 ? "" : str);
    }
}
