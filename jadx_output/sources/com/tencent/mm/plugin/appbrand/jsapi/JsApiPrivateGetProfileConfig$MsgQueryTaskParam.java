package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiPrivateGetProfileConfig$MsgQueryTaskParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.nb();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78598d;

    public JsApiPrivateGetProfileConfig$MsgQueryTaskParam(java.lang.String str) {
        this.f78598d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam) && kotlin.jvm.internal.o.b(this.f78598d, ((com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam) obj).f78598d);
    }

    public int hashCode() {
        java.lang.String str = this.f78598d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "MsgQueryTaskParam(username=" + this.f78598d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78598d);
    }
}
