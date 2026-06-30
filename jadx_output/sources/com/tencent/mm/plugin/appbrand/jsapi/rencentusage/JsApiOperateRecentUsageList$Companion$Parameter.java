package com.tencent.mm.plugin.appbrand.jsapi.rencentusage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "td1/m", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final /* data */ class JsApiOperateRecentUsageList$Companion$Parameter implements android.os.Parcelable {
    public static final td1.m CREATOR = new td1.m(null);

    /* renamed from: d, reason: collision with root package name */
    public final td1.k f82914d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82915e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82916f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82917g;

    public JsApiOperateRecentUsageList$Companion$Parameter(td1.k actionType, java.lang.String username, java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f82914d = actionType;
        this.f82915e = username;
        this.f82916f = appId;
        this.f82917g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter jsApiOperateRecentUsageList$Companion$Parameter = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter) obj;
        return this.f82914d == jsApiOperateRecentUsageList$Companion$Parameter.f82914d && kotlin.jvm.internal.o.b(this.f82915e, jsApiOperateRecentUsageList$Companion$Parameter.f82915e) && kotlin.jvm.internal.o.b(this.f82916f, jsApiOperateRecentUsageList$Companion$Parameter.f82916f) && this.f82917g == jsApiOperateRecentUsageList$Companion$Parameter.f82917g;
    }

    public int hashCode() {
        return (((((this.f82914d.hashCode() * 31) + this.f82915e.hashCode()) * 31) + this.f82916f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f82917g);
    }

    public java.lang.String toString() {
        return "Parameter(actionType=" + this.f82914d + ", username=" + this.f82915e + ", appId=" + this.f82916f + ", versionType=" + this.f82917g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f82914d.name());
        parcel.writeString(this.f82915e);
        parcel.writeString(this.f82916f);
        parcel.writeInt(this.f82917g);
    }
}
