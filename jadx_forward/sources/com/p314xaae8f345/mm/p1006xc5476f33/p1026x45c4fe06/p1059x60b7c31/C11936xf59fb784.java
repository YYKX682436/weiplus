package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam */
/* loaded from: classes.dex */
public final /* data */ class C11936xf59fb784 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11936xf59fb784> f33668x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nb();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160131d;

    public C11936xf59fb784(java.lang.String str) {
        this.f160131d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50476xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11936xf59fb784) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160131d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11936xf59fb784) obj).f160131d);
    }

    /* renamed from: hashCode */
    public int m50477x8cdac1b() {
        java.lang.String str = this.f160131d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50478x9616526c() {
        return "MsgQueryTaskParam(username=" + this.f160131d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f160131d);
    }
}
