package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$A8KeyRespDataList", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiDetectImageCode$A8KeyRespDataList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f82931d;

    public JsApiDetectImageCode$A8KeyRespDataList(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f82931d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList) && kotlin.jvm.internal.o.b(this.f82931d, ((com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList) obj).f82931d);
    }

    public int hashCode() {
        return this.f82931d.hashCode();
    }

    public java.lang.String toString() {
        return "A8KeyRespDataList(list=" + this.f82931d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f82931d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData) it.next()).writeToParcel(out, i17);
        }
    }
}
