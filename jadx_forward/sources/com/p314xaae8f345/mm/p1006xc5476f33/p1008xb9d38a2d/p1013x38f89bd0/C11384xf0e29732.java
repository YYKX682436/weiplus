package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;", "Landroid/os/Parcelable;", "CREATOR", "u61/r", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData */
/* loaded from: classes4.dex */
public final /* data */ class C11384xf0e29732 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final u61.r f33359x681a0c0c = new u61.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0 f154718d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fn4 f154719e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f154720f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f154721g;

    public C11384xf0e29732(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0 reqData, r45.fn4 fn4Var, java.lang.String msgId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqData, "reqData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        this.f154718d = reqData;
        this.f154719e = fn4Var;
        this.f154720f = msgId;
        this.f154721g = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48668xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732 c11384xf0e29732 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154718d, c11384xf0e29732.f154718d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154719e, c11384xf0e29732.f154719e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154720f, c11384xf0e29732.f154720f) && this.f154721g == c11384xf0e29732.f154721g;
    }

    /* renamed from: hashCode */
    public int m48669x8cdac1b() {
        int m48665x8cdac1b = this.f154718d.m48665x8cdac1b() * 31;
        r45.fn4 fn4Var = this.f154719e;
        return ((((m48665x8cdac1b + (fn4Var == null ? 0 : fn4Var.hashCode())) * 31) + this.f154720f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f154721g);
    }

    /* renamed from: toString */
    public java.lang.String m48670x9616526c() {
        return "GetMobileRespData(reqData=" + this.f154718d + ", mobileInfo=" + this.f154719e + ", msgId=" + this.f154720f + ", canRetry=" + this.f154721g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f154718d.writeToParcel(parcel, i17);
        r45.fn4 fn4Var = this.f154719e;
        if (fn4Var == null || (str = fn4Var.mo12245xcc313de3().toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f154720f);
        parcel.writeInt(this.f154721g ? 1 : 0);
    }
}
