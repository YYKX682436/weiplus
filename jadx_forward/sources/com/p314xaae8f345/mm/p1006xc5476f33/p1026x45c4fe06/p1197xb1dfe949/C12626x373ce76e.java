package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/tipsmsg/TipsIPCData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData */
/* loaded from: classes7.dex */
public final /* data */ class C12626x373ce76e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12626x373ce76e> f35290x681a0c0c = new rj1.i();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 f170764d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f170765e;

    public C12626x373ce76e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f170764d = info;
        this.f170765e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52862xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12626x373ce76e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12626x373ce76e c12626x373ce76e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12626x373ce76e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170764d, c12626x373ce76e.f170764d) && this.f170765e == c12626x373ce76e.f170765e;
    }

    /* renamed from: hashCode */
    public int m52863x8cdac1b() {
        return (this.f170764d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f170765e);
    }

    /* renamed from: toString */
    public java.lang.String m52864x9616526c() {
        return "TipsIPCData(info=" + this.f170764d + ", isAdd=" + this.f170765e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f170764d, i17);
        out.writeInt(this.f170765e ? 1 : 0);
    }
}
