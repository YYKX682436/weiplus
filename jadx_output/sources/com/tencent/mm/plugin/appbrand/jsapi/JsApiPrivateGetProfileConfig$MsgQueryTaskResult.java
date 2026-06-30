package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiPrivateGetProfileConfig$MsgQueryTaskResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ob();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78599d;

    public JsApiPrivateGetProfileConfig$MsgQueryTaskResult(boolean z17) {
        this.f78599d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskResult) && this.f78599d == ((com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskResult) obj).f78599d;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f78599d);
    }

    public java.lang.String toString() {
        return "MsgQueryTaskResult(showRelatedServiceNotify=" + this.f78599d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f78599d ? 1 : 0);
    }
}
