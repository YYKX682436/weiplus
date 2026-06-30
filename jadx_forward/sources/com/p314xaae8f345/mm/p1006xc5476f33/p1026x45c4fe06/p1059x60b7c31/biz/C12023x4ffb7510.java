package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiLaunchResponse", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse */
/* loaded from: classes11.dex */
public final /* data */ class C12023x4ffb7510 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510> f33930x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.c();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f161441d;

    public C12023x4ffb7510(android.content.Intent intent) {
        this.f161441d = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50661xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161441d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510) obj).f161441d);
    }

    /* renamed from: hashCode */
    public int m50662x8cdac1b() {
        android.content.Intent intent = this.f161441d;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50663x9616526c() {
        return "BizPoiLaunchResponse(startIntent=" + this.f161441d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f161441d, i17);
    }
}
