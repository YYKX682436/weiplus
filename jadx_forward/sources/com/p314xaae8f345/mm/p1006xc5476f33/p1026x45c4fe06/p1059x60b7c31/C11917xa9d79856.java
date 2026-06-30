package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData */
/* loaded from: classes4.dex */
public final class C11917xa9d79856 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11917xa9d79856> f33652x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p5();

    /* renamed from: d, reason: collision with root package name */
    public final int f160047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160048e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f160049f;

    public C11917xa9d79856(int i17, java.lang.String errmsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errmsg, "errmsg");
        this.f160047d = i17;
        this.f160048e = errmsg;
        this.f160049f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f160047d);
        out.writeString(this.f160048e);
        out.writeInt(this.f160049f ? 1 : 0);
    }
}
