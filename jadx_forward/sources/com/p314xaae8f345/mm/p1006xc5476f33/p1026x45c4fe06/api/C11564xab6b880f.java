package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppExportWarmLaunchInfoBundle;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle */
/* loaded from: classes7.dex */
public final /* data */ class C11564xab6b880f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f> f33406x681a0c0c = new l81.z0();

    /* renamed from: d, reason: collision with root package name */
    public final long f156515d;

    /* renamed from: e, reason: collision with root package name */
    public long f156516e;

    /* renamed from: f, reason: collision with root package name */
    public l81.a1 f156517f;

    /* renamed from: g, reason: collision with root package name */
    public long f156518g;

    public C11564xab6b880f(long j17, long j18, l81.a1 entryPageNavigationType, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryPageNavigationType, "entryPageNavigationType");
        this.f156515d = j17;
        this.f156516e = j18;
        this.f156517f = entryPageNavigationType;
        this.f156518g = j19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48859xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f) obj;
        return this.f156515d == c11564xab6b880f.f156515d && this.f156516e == c11564xab6b880f.f156516e && this.f156517f == c11564xab6b880f.f156517f && this.f156518g == c11564xab6b880f.f156518g;
    }

    /* renamed from: hashCode */
    public int m48860x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f156515d) * 31) + java.lang.Long.hashCode(this.f156516e)) * 31) + this.f156517f.hashCode()) * 31) + java.lang.Long.hashCode(this.f156518g);
    }

    /* renamed from: toString */
    public java.lang.String m48861x9616526c() {
        return "WeAppExportWarmLaunchInfoBundle(totalStartTimestampMs=" + this.f156515d + ", totalEndTimestampMs=" + this.f156516e + ", entryPageNavigationType=" + this.f156517f + ", entryPageNavigationStartTimestampMs=" + this.f156518g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f156515d);
        out.writeLong(this.f156516e);
        l81.a1 a1Var = this.f156517f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        out.writeInt(a1Var.ordinal());
        out.writeLong(this.f156518g);
    }
}
