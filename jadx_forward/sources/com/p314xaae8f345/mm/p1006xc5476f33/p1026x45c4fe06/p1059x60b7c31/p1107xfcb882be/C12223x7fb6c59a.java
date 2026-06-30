package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result */
/* loaded from: classes4.dex */
public final /* data */ class C12223x7fb6c59a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a> f34728x681a0c0c = new td1.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164444d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164445e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164446f;

    public C12223x7fb6c59a(java.lang.String data, int i17, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f164444d = data;
        this.f164445e = i17;
        this.f164446f = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51232xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a c12223x7fb6c59a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164444d, c12223x7fb6c59a.f164444d) && this.f164445e == c12223x7fb6c59a.f164445e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164446f, c12223x7fb6c59a.f164446f);
    }

    /* renamed from: hashCode */
    public int m51233x8cdac1b() {
        return (((this.f164444d.hashCode() * 31) + java.lang.Integer.hashCode(this.f164445e)) * 31) + this.f164446f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51234x9616526c() {
        return "Result(data=" + this.f164444d + ", errorCode=" + this.f164445e + ", errorMsg=" + this.f164446f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f164444d);
        parcel.writeInt(this.f164445e);
        parcel.writeString(this.f164446f);
    }
}
