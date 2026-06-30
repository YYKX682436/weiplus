package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData */
/* loaded from: classes7.dex */
final /* data */ class C12401x11aca2ea implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea> f35083x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.c0();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 f167088d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167089e;

    public C12401x11aca2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 invokeReq, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeReq, "invokeReq");
        this.f167088d = invokeReq;
        this.f167089e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51913xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea c12401x11aca2ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167088d, c12401x11aca2ea.f167088d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167089e, c12401x11aca2ea.f167089e);
    }

    /* renamed from: hashCode */
    public int m51914x8cdac1b() {
        int hashCode = this.f167088d.hashCode() * 31;
        java.lang.String str = this.f167089e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51915x9616526c() {
        return "NewSdkInvokeBackData(invokeReq=" + this.f167088d + ", backData=" + this.f167089e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        this.f167088d.writeToParcel(out, i17);
        out.writeString(this.f167089e);
    }
}
