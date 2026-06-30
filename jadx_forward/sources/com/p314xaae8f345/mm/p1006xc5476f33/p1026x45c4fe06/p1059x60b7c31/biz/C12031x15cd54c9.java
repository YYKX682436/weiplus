package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput */
/* loaded from: classes.dex */
public final /* data */ class C12031x15cd54c9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12031x15cd54c9> f33938x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.a0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161474e;

    public C12031x15cd54c9(java.lang.String scene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f161473d = scene;
        this.f161474e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50693xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12031x15cd54c9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12031x15cd54c9 c12031x15cd54c9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12031x15cd54c9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161473d, c12031x15cd54c9.f161473d) && this.f161474e == c12031x15cd54c9.f161474e;
    }

    /* renamed from: hashCode */
    public int m50694x8cdac1b() {
        return (this.f161473d.hashCode() * 31) + java.lang.Integer.hashCode(this.f161474e);
    }

    /* renamed from: toString */
    public java.lang.String m50695x9616526c() {
        return "IPCGetDraftTaskInput(scene=" + this.f161473d + ", bizType=" + this.f161474e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f161473d);
        out.writeInt(this.f161474e);
    }
}
