package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.x();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79926d;

    public JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet(boolean z17) {
        this.f79926d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet) && this.f79926d == ((com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet) obj).f79926d;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f79926d);
    }

    public java.lang.String toString() {
        return "IPCDeleteDraftTaskRet(success=" + this.f79926d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f79926d ? 1 : 0);
    }
}
