package com.tencent.mm.plugin.appbrand.jsapi.rencentusage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "td1/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiGetRecentUsageList$Companion$Parameter implements android.os.Parcelable {
    public static final td1.a CREATOR = new td1.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f82908d;

    /* renamed from: e, reason: collision with root package name */
    public final long f82909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82910f;

    public JsApiGetRecentUsageList$Companion$Parameter(int i17, long j17, int i18) {
        this.f82908d = i17;
        this.f82909e = j17;
        this.f82910f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter) obj;
        return this.f82908d == jsApiGetRecentUsageList$Companion$Parameter.f82908d && this.f82909e == jsApiGetRecentUsageList$Companion$Parameter.f82909e && this.f82910f == jsApiGetRecentUsageList$Companion$Parameter.f82910f;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f82908d) * 31) + java.lang.Long.hashCode(this.f82909e)) * 31) + java.lang.Integer.hashCode(this.f82910f);
    }

    public java.lang.String toString() {
        return "Parameter(count=" + this.f82908d + ", lastUpdateTime=" + this.f82909e + ", requestId=" + this.f82910f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f82908d);
        parcel.writeLong(this.f82909e);
        parcel.writeInt(this.f82910f);
    }
}
