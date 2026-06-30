package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandResponse;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.service.CdpCommandResponse */
/* loaded from: classes7.dex */
public final /* data */ class C12577x28e18c9d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d> f35173x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n0();

    /* renamed from: d, reason: collision with root package name */
    public final int f170145d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170146e;

    public C12577x28e18c9d(int i17, java.lang.String responseJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(responseJson, "responseJson");
        this.f170145d = i17;
        this.f170146e = responseJson;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52561xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d c12577x28e18c9d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d) obj;
        return this.f170145d == c12577x28e18c9d.f170145d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170146e, c12577x28e18c9d.f170146e);
    }

    /* renamed from: hashCode */
    public int m52562x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f170145d) * 31) + this.f170146e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52563x9616526c() {
        return "CdpCommandResponse(code=" + this.f170145d + ", responseJson=" + this.f170146e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f170145d);
        out.writeString(this.f170146e);
    }
}
