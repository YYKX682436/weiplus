package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/EventWxAssistant;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.service.EventWxAssistant */
/* loaded from: classes7.dex */
public final /* data */ class C12578x35916623 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623> f35174x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170147d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r0 f170148e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f170149f;

    public C12578x35916623(java.lang.String sessionId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r0 method, android.os.Parcelable parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        this.f170147d = sessionId;
        this.f170148e = method;
        this.f170149f = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52565xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623 c12578x35916623 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12578x35916623) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170147d, c12578x35916623.f170147d) && this.f170148e == c12578x35916623.f170148e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170149f, c12578x35916623.f170149f);
    }

    /* renamed from: hashCode */
    public int m52566x8cdac1b() {
        int hashCode = ((this.f170147d.hashCode() * 31) + this.f170148e.hashCode()) * 31;
        android.os.Parcelable parcelable = this.f170149f;
        return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m52567x9616526c() {
        return "EventWxAssistant(sessionId=" + this.f170147d + ", method=" + this.f170148e + ", params=" + this.f170149f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170147d);
        out.writeString(this.f170148e.name());
        out.writeParcelable(this.f170149f, i17);
    }
}
