package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskResult */
/* loaded from: classes.dex */
public final /* data */ class C11937xc1fa0806 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11937xc1fa0806> f33669x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ob();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f160132d;

    public C11937xc1fa0806(boolean z17) {
        this.f160132d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11937xc1fa0806) && this.f160132d == ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11937xc1fa0806) obj).f160132d;
    }

    /* renamed from: hashCode */
    public int m50481x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f160132d);
    }

    /* renamed from: toString */
    public java.lang.String m50482x9616526c() {
        return "MsgQueryTaskResult(showRelatedServiceNotify=" + this.f160132d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f160132d ? 1 : 0);
    }
}
