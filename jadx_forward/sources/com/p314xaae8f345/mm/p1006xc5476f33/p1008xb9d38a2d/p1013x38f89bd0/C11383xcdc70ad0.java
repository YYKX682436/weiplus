package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileReqData;", "Landroid/os/Parcelable;", "CREATOR", "u61/q", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData */
/* loaded from: classes4.dex */
public final /* data */ class C11383xcdc70ad0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final u61.q f33358x681a0c0c = new u61.q(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe f154716d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f154717e;

    public C11383xcdc70ad0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe reqData, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqData, "reqData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f154716d = reqData;
        this.f154717e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48664xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0 c11383xcdc70ad0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154716d, c11383xcdc70ad0.f154716d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154717e, c11383xcdc70ad0.f154717e);
    }

    /* renamed from: hashCode */
    public int m48665x8cdac1b() {
        return (this.f154716d.m48661x8cdac1b() * 31) + this.f154717e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m48666x9616526c() {
        return "GetMobileReqData(reqData=" + this.f154716d + ", data=" + this.f154717e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f154716d.writeToParcel(parcel, i17);
        parcel.writeString(this.f154717e);
    }
}
