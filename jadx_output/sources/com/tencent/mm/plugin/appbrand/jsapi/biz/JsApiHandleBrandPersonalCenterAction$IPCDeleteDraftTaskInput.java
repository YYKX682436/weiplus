package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f79924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79925e;

    public JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput(java.lang.String scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f79924d = scene;
        this.f79925e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput jsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput) obj;
        return kotlin.jvm.internal.o.b(this.f79924d, jsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput.f79924d) && this.f79925e == jsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput.f79925e;
    }

    public int hashCode() {
        return (this.f79924d.hashCode() * 31) + java.lang.Integer.hashCode(this.f79925e);
    }

    public java.lang.String toString() {
        return "IPCDeleteDraftTaskInput(scene=" + this.f79924d + ", bizType=" + this.f79925e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f79924d);
        out.writeInt(this.f79925e);
    }
}
