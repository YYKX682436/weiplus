package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallTingController$OperateAppBrandTingParam", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam */
/* loaded from: classes7.dex */
public final /* data */ class C11872xdea30f5a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a> f33626x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f159594d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f159595e;

    public C11872xdea30f5a(java.lang.String operate, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operate, "operate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f159594d = operate;
        this.f159595e = appId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a c11872xdea30f5a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11872xdea30f5a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159594d, c11872xdea30f5a.f159594d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159595e, c11872xdea30f5a.f159595e);
    }

    /* renamed from: hashCode */
    public int m50323x8cdac1b() {
        return (this.f159594d.hashCode() * 31) + this.f159595e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50324x9616526c() {
        return "OperateAppBrandTingParam(operate=" + this.f159594d + ", appId=" + this.f159595e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f159594d);
        out.writeString(this.f159595e);
    }
}
