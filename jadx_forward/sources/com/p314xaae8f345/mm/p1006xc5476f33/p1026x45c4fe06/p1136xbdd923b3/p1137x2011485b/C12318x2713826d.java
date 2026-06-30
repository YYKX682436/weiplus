package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper */
/* loaded from: classes7.dex */
public final /* data */ class C12318x2713826d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d> f35043x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.r();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f165784d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 f165785e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165786f;

    public C12318x2713826d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195, java.lang.String str) {
        this.f165784d = z17;
        this.f165785e = c11813xf952a195;
        this.f165786f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51627xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d c12318x2713826d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d) obj;
        return this.f165784d == c12318x2713826d.f165784d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165785e, c12318x2713826d.f165785e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165786f, c12318x2713826d.f165786f);
    }

    /* renamed from: hashCode */
    public int m51628x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f165784d) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = this.f165785e;
        int hashCode2 = (hashCode + (c11813xf952a195 == null ? 0 : c11813xf952a195.hashCode())) * 31;
        java.lang.String str = this.f165786f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51629x9616526c() {
        return "WAMagicBrushFrameColdLaunchResultIPCWrapper(succeed=" + this.f165784d + ", config=" + this.f165785e + ", exceptionMessage=" + this.f165786f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f165784d ? 1 : 0);
        out.writeParcelable(this.f165785e, i17);
        out.writeString(this.f165786f);
    }

    public /* synthetic */ C12318x2713826d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : c11813xf952a195, (i17 & 4) != 0 ? null : str);
    }
}
