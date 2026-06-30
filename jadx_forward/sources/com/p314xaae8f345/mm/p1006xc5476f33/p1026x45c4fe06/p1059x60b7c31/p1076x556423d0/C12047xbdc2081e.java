package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult */
/* loaded from: classes.dex */
final /* data */ class C12047xbdc2081e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e> f33978x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161737d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161738e;

    public C12047xbdc2081e(java.lang.String signature, java.lang.String suffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        this.f161737d = signature;
        this.f161738e = suffix;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50776xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e c12047xbdc2081e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161737d, c12047xbdc2081e.f161737d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161738e, c12047xbdc2081e.f161738e);
    }

    /* renamed from: hashCode */
    public int m50777x8cdac1b() {
        return (this.f161737d.hashCode() * 31) + this.f161738e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50778x9616526c() {
        return "SignResult(signature=" + this.f161737d + ", suffix=" + this.f161738e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f161737d);
        out.writeString(this.f161738e);
    }
}
