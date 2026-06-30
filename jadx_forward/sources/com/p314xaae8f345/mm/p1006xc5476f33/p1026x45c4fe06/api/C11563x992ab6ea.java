package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle */
/* loaded from: classes7.dex */
public final /* data */ class C11563x992ab6ea implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea> f33405x681a0c0c = new l81.x0();

    /* renamed from: d, reason: collision with root package name */
    public int f156507d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f156508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f156509f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e f156510g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f f156511h;

    /* renamed from: i, reason: collision with root package name */
    public int f156512i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156513m;

    /* renamed from: n, reason: collision with root package name */
    public l81.y0 f156514n;

    public C11563x992ab6ea(int i17, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e c11562x60b4066e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f, int i18, java.lang.String customVersion, l81.y0 renderTypeOfStackTopView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customVersion, "customVersion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTypeOfStackTopView, "renderTypeOfStackTopView");
        this.f156507d = i17;
        this.f156508e = z17;
        this.f156509f = z18;
        this.f156510g = c11562x60b4066e;
        this.f156511h = c11564xab6b880f;
        this.f156512i = i18;
        this.f156513m = customVersion;
        this.f156514n = renderTypeOfStackTopView;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48855xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea c11563x992ab6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea) obj;
        return this.f156507d == c11563x992ab6ea.f156507d && this.f156508e == c11563x992ab6ea.f156508e && this.f156509f == c11563x992ab6ea.f156509f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156510g, c11563x992ab6ea.f156510g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156511h, c11563x992ab6ea.f156511h) && this.f156512i == c11563x992ab6ea.f156512i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156513m, c11563x992ab6ea.f156513m) && this.f156514n == c11563x992ab6ea.f156514n;
    }

    /* renamed from: hashCode */
    public int m48856x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f156507d) * 31) + java.lang.Boolean.hashCode(this.f156508e)) * 31) + java.lang.Boolean.hashCode(this.f156509f)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e c11562x60b4066e = this.f156510g;
        int m48852x8cdac1b = (hashCode + (c11562x60b4066e == null ? 0 : c11562x60b4066e.m48852x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f = this.f156511h;
        return ((((((m48852x8cdac1b + (c11564xab6b880f != null ? c11564xab6b880f.m48860x8cdac1b() : 0)) * 31) + java.lang.Integer.hashCode(this.f156512i)) * 31) + this.f156513m.hashCode()) * 31) + this.f156514n.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m48857x9616526c() {
        return "WeAppExportLaunchInfoBundle(preloadType=" + this.f156507d + ", isPreRender=" + this.f156508e + ", isWarmLaunch=" + this.f156509f + ", coldLaunchInfo=" + this.f156510g + ", warmLaunchInfo=" + this.f156511h + ", appVersion=" + this.f156512i + ", customVersion=" + this.f156513m + ", renderTypeOfStackTopView=" + this.f156514n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156507d);
        out.writeInt(this.f156508e ? 1 : 0);
        out.writeInt(this.f156509f ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e c11562x60b4066e = this.f156510g;
        if (c11562x60b4066e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c11562x60b4066e.writeToParcel(out, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f = this.f156511h;
        if (c11564xab6b880f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c11564xab6b880f.writeToParcel(out, i17);
        }
        out.writeInt(this.f156512i);
        out.writeString(this.f156513m);
        out.writeString(this.f156514n.name());
    }
}
