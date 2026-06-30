package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet */
/* loaded from: classes.dex */
public final /* data */ class C12028x4ac26ff7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12028x4ac26ff7> f33935x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161459d;

    public C12028x4ac26ff7(boolean z17) {
        this.f161459d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50681xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12028x4ac26ff7) && this.f161459d == ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12028x4ac26ff7) obj).f161459d;
    }

    /* renamed from: hashCode */
    public int m50682x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f161459d);
    }

    /* renamed from: toString */
    public java.lang.String m50683x9616526c() {
        return "IPCDeleteDraftTaskRet(success=" + this.f161459d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161459d ? 1 : 0);
    }
}
