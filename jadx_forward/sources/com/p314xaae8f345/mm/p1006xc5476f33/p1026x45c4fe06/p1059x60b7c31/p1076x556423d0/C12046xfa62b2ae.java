package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest */
/* loaded from: classes.dex */
final /* data */ class C12046xfa62b2ae implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12046xfa62b2ae> f33977x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161736d;

    public C12046xfa62b2ae(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f161736d = params;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50772xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12046xfa62b2ae) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161736d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12046xfa62b2ae) obj).f161736d);
    }

    /* renamed from: hashCode */
    public int m50773x8cdac1b() {
        return this.f161736d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50774x9616526c() {
        return "SignRequest(params=" + this.f161736d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f161736d);
    }
}
