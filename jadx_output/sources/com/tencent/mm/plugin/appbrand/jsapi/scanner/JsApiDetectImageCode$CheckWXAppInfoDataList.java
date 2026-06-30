package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoDataList", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class JsApiDetectImageCode$CheckWXAppInfoDataList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f82935d;

    public JsApiDetectImageCode$CheckWXAppInfoDataList(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f82935d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList) && kotlin.jvm.internal.o.b(this.f82935d, ((com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList) obj).f82935d);
    }

    public int hashCode() {
        return this.f82935d.hashCode();
    }

    public java.lang.String toString() {
        return "CheckWXAppInfoDataList(list=" + this.f82935d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f82935d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData) it.next()).writeToParcel(out, i17);
        }
    }
}
