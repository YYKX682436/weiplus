package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput */
/* loaded from: classes.dex */
public final /* data */ class C12027xa36b91a0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12027xa36b91a0> f33934x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161457d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161458e;

    public C12027xa36b91a0(java.lang.String scene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f161457d = scene;
        this.f161458e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50677xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12027xa36b91a0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12027xa36b91a0 c12027xa36b91a0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12027xa36b91a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161457d, c12027xa36b91a0.f161457d) && this.f161458e == c12027xa36b91a0.f161458e;
    }

    /* renamed from: hashCode */
    public int m50678x8cdac1b() {
        return (this.f161457d.hashCode() * 31) + java.lang.Integer.hashCode(this.f161458e);
    }

    /* renamed from: toString */
    public java.lang.String m50679x9616526c() {
        return "IPCDeleteDraftTaskInput(scene=" + this.f161457d + ", bizType=" + this.f161458e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f161457d);
        out.writeInt(this.f161458e);
    }
}
