package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/report/AppBrandRuntimeReloadReportBundle;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle */
/* loaded from: classes7.dex */
public final /* data */ class C12376xdd2459a1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1> f35067x681a0c0c = new wg1.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166660d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f166661e;

    public C12376xdd2459a1(java.lang.String refererInstanceId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refererInstanceId, "refererInstanceId");
        this.f166660d = refererInstanceId;
        this.f166661e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51804xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1 c12376xdd2459a1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166660d, c12376xdd2459a1.f166660d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166661e, c12376xdd2459a1.f166661e);
    }

    /* renamed from: hashCode */
    public int m51805x8cdac1b() {
        int hashCode = this.f166660d.hashCode() * 31;
        java.lang.String str = this.f166661e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51806x9616526c() {
        return "AppBrandRuntimeReloadReportBundle(refererInstanceId=" + this.f166660d + ", reloadReason=" + this.f166661e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f166660d);
        out.writeString(this.f166661e);
    }
}
