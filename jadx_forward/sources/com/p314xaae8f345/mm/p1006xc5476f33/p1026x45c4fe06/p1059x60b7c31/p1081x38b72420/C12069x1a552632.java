package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$UpdateWxaAttrsTaskParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam */
/* loaded from: classes5.dex */
public final /* data */ class C12069x1a552632 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12069x1a552632> f34046x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.s0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162029d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162030e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162031f;

    public C12069x1a552632(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f162029d = str;
        this.f162030e = str2;
        this.f162031f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50846xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12069x1a552632)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12069x1a552632 c12069x1a552632 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12069x1a552632) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162029d, c12069x1a552632.f162029d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162030e, c12069x1a552632.f162030e) && this.f162031f == c12069x1a552632.f162031f;
    }

    /* renamed from: hashCode */
    public int m50847x8cdac1b() {
        java.lang.String str = this.f162029d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f162030e;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f162031f);
    }

    /* renamed from: toString */
    public java.lang.String m50848x9616526c() {
        return "UpdateWxaAttrsTaskParam(appId=" + this.f162029d + ", username=" + this.f162030e + ", isByAppId=" + this.f162031f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f162029d);
        out.writeString(this.f162030e);
        out.writeInt(this.f162031f ? 1 : 0);
    }
}
