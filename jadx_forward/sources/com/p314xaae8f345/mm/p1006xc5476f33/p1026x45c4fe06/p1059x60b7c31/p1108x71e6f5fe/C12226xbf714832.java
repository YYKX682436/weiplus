package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$A8KeyRespData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData */
/* loaded from: classes7.dex */
public final /* data */ class C12226xbf714832 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832> f34743x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f164462d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164463e;

    public C12226xbf714832(int i17, java.lang.String respStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respStr, "respStr");
        this.f164462d = i17;
        this.f164463e = respStr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51245xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832 c12226xbf714832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832) obj;
        return this.f164462d == c12226xbf714832.f164462d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164463e, c12226xbf714832.f164463e);
    }

    /* renamed from: hashCode */
    public int m51246x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f164462d) * 31) + this.f164463e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51247x9616526c() {
        return "A8KeyRespData(actionCode=" + this.f164462d + ", respStr=" + this.f164463e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f164462d);
        out.writeString(this.f164463e);
    }
}
