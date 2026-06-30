package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.y();

    /* renamed from: d, reason: collision with root package name */
    public final int f79927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79928e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f79929f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f79930g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79931h;

    public JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput(int i17, int i18, java.lang.String draftPrompt, java.lang.String draftPicId, int i19) {
        kotlin.jvm.internal.o.g(draftPrompt, "draftPrompt");
        kotlin.jvm.internal.o.g(draftPicId, "draftPicId");
        this.f79927d = i17;
        this.f79928e = i18;
        this.f79929f = draftPrompt;
        this.f79930g = draftPicId;
        this.f79931h = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput) obj;
        return this.f79927d == jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput.f79927d && this.f79928e == jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput.f79928e && kotlin.jvm.internal.o.b(this.f79929f, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput.f79929f) && kotlin.jvm.internal.o.b(this.f79930g, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput.f79930g) && this.f79931h == jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput.f79931h;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f79927d) * 31) + java.lang.Integer.hashCode(this.f79928e)) * 31) + this.f79929f.hashCode()) * 31) + this.f79930g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f79931h);
    }

    public java.lang.String toString() {
        return "IPCEditTextCoverTaskInput(topInset=" + this.f79927d + ", bottomInset=" + this.f79928e + ", draftPrompt=" + this.f79929f + ", draftPicId=" + this.f79930g + ", editScene=" + this.f79931h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f79927d);
        out.writeInt(this.f79928e);
        out.writeString(this.f79929f);
        out.writeString(this.f79930g);
        out.writeInt(this.f79931h);
    }
}
