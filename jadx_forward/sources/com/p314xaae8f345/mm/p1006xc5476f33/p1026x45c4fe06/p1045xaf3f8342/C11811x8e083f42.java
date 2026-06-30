package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/AppBrandLaunchModeParams;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams */
/* loaded from: classes7.dex */
public final /* data */ class C11811x8e083f42 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42> f33585x681a0c0c = new k91.k0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158854d;

    public C11811x8e083f42(java.lang.String chatToolMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
        this.f158854d = chatToolMode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50094xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158854d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42) obj).f158854d);
    }

    /* renamed from: hashCode */
    public int m50095x8cdac1b() {
        return this.f158854d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50096x9616526c() {
        return "AppBrandLaunchModeParams(chatToolMode=" + this.f158854d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f158854d);
    }
}
