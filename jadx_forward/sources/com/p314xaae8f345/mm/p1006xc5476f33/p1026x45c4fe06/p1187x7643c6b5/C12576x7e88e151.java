package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandParamsWrapper;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper */
/* loaded from: classes7.dex */
public final /* data */ class C12576x7e88e151 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12576x7e88e151> f35172x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m0();

    /* renamed from: d, reason: collision with root package name */
    public final int f170143d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 f170144e;

    public C12576x7e88e151(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f170143d = i17;
        this.f170144e = params;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52557xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12576x7e88e151)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12576x7e88e151 c12576x7e88e151 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12576x7e88e151) obj;
        return this.f170143d == c12576x7e88e151.f170143d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170144e, c12576x7e88e151.f170144e);
    }

    /* renamed from: hashCode */
    public int m52558x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f170143d) * 31) + this.f170144e.m52554x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m52559x9616526c() {
        return "CdpCommandParamsWrapper(callbackId=" + this.f170143d + ", params=" + this.f170144e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f170143d);
        this.f170144e.writeToParcel(out, i17);
    }
}
