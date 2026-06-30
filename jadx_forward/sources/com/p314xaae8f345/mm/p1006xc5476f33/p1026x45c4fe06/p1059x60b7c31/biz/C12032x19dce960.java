package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet */
/* loaded from: classes.dex */
public final /* data */ class C12032x19dce960 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960> f33939x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.b0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161475d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161476e;

    public C12032x19dce960(boolean z17, java.lang.String str) {
        this.f161475d = z17;
        this.f161476e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50697xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960 c12032x19dce960 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960) obj;
        return this.f161475d == c12032x19dce960.f161475d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161476e, c12032x19dce960.f161476e);
    }

    /* renamed from: hashCode */
    public int m50698x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f161475d) * 31;
        java.lang.String str = this.f161476e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m50699x9616526c() {
        return "IPCGetDraftTaskRet(success=" + this.f161475d + ", draftData=" + this.f161476e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161475d ? 1 : 0);
        out.writeString(this.f161476e);
    }
}
