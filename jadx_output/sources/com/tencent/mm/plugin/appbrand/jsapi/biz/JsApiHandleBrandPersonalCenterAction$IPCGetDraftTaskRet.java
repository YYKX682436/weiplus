package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.b0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79942d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79943e;

    public JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet(boolean z17, java.lang.String str) {
        this.f79942d = z17;
        this.f79943e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet) obj;
        return this.f79942d == jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet.f79942d && kotlin.jvm.internal.o.b(this.f79943e, jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet.f79943e);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f79942d) * 31;
        java.lang.String str = this.f79943e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "IPCGetDraftTaskRet(success=" + this.f79942d + ", draftData=" + this.f79943e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f79942d ? 1 : 0);
        out.writeString(this.f79943e);
    }
}
