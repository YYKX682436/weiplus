package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/AppBrandAssistantParams;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams */
/* loaded from: classes7.dex */
public final /* data */ class C11805x4202731e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e> f33572x681a0c0c = new k91.t();

    /* renamed from: d, reason: collision with root package name */
    public boolean f158732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158733e;

    /* renamed from: f, reason: collision with root package name */
    public final double f158734f;

    /* renamed from: g, reason: collision with root package name */
    public final double f158735g;

    public C11805x4202731e(boolean z17, java.lang.String wxAssistSessionId, double d17, double d18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxAssistSessionId, "wxAssistSessionId");
        this.f158732d = z17;
        this.f158733e = wxAssistSessionId;
        this.f158734f = d17;
        this.f158735g = d18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50077xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e c11805x4202731e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e) obj;
        return this.f158732d == c11805x4202731e.f158732d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158733e, c11805x4202731e.f158733e) && java.lang.Double.compare(this.f158734f, c11805x4202731e.f158734f) == 0 && java.lang.Double.compare(this.f158735g, c11805x4202731e.f158735g) == 0;
    }

    /* renamed from: hashCode */
    public int m50078x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f158732d) * 31) + this.f158733e.hashCode()) * 31) + java.lang.Double.hashCode(this.f158734f)) * 31) + java.lang.Double.hashCode(this.f158735g);
    }

    /* renamed from: toString */
    public java.lang.String m50079x9616526c() {
        return "AppBrandAssistantParams(isWxAssistEnable=" + this.f158732d + ", wxAssistSessionId=" + this.f158733e + ", hookLatitude=" + this.f158734f + ", hookLongitude=" + this.f158735g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f158732d ? 1 : 0);
        out.writeString(this.f158733e);
        out.writeDouble(this.f158734f);
        out.writeDouble(this.f158735g);
    }

    public /* synthetic */ C11805x4202731e(boolean z17, java.lang.String str, double d17, double d18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? 0.0d : d17, (i17 & 8) == 0 ? d18 : 0.0d);
    }
}
