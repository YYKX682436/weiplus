package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.z();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79933e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f79934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f79935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Long f79936h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f79937i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f79938m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f79939n;

    public JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f79932d = z17;
        this.f79933e = str;
        this.f79934f = str2;
        this.f79935g = str3;
        this.f79936h = l17;
        this.f79937i = str4;
        this.f79938m = str5;
        this.f79939n = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet) obj;
        return this.f79932d == jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79932d && kotlin.jvm.internal.o.b(this.f79933e, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79933e) && kotlin.jvm.internal.o.b(this.f79934f, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79934f) && kotlin.jvm.internal.o.b(this.f79935g, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79935g) && kotlin.jvm.internal.o.b(this.f79936h, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79936h) && kotlin.jvm.internal.o.b(this.f79937i, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79937i) && kotlin.jvm.internal.o.b(this.f79938m, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79938m) && kotlin.jvm.internal.o.b(this.f79939n, jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79939n);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f79932d) * 31;
        java.lang.String str = this.f79933e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f79934f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f79935g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l17 = this.f79936h;
        int hashCode5 = (hashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str4 = this.f79937i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f79938m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f79939n;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "IPCEditTextCoverTaskRet(isSuc=" + this.f79932d + ", filePath=" + this.f79933e + ", picId=" + this.f79934f + ", prompt=" + this.f79935g + ", source=" + this.f79936h + ", templateId=" + this.f79937i + ", dataBuf=" + this.f79938m + ", style=" + this.f79939n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f79932d ? 1 : 0);
        out.writeString(this.f79933e);
        out.writeString(this.f79934f);
        out.writeString(this.f79935g);
        java.lang.Long l17 = this.f79936h;
        if (l17 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l17.longValue());
        }
        out.writeString(this.f79937i);
        out.writeString(this.f79938m);
        out.writeString(this.f79939n);
    }
}
