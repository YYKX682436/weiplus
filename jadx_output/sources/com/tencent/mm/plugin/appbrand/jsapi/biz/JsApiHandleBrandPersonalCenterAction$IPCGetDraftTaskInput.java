package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.a0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79941e;

    public JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput(java.lang.String scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f79940d = scene;
        this.f79941e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput) obj;
        return kotlin.jvm.internal.o.b(this.f79940d, jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput.f79940d) && this.f79941e == jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput.f79941e;
    }

    public int hashCode() {
        return (this.f79940d.hashCode() * 31) + java.lang.Integer.hashCode(this.f79941e);
    }

    public java.lang.String toString() {
        return "IPCGetDraftTaskInput(scene=" + this.f79940d + ", bizType=" + this.f79941e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f79940d);
        out.writeInt(this.f79941e);
    }
}
