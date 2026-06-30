package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/page/web_renderingcache/WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel */
/* loaded from: classes4.dex */
public class C12531x2a8ddffe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe> f35144x681a0c0c = new ri1.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168767d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f168768e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f168769f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f168770g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168771h;

    public C12531x2a8ddffe(java.lang.String appId, java.lang.String commLibVersionId, java.lang.String appVersionId, java.lang.String pageURL, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commLibVersionId, "commLibVersionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appVersionId, "appVersionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageURL, "pageURL");
        this.f168767d = appId;
        this.f168768e = commLibVersionId;
        this.f168769f = appVersionId;
        this.f168770g = pageURL;
        this.f168771h = str;
    }

    public final ri1.b a() {
        ri1.b bVar = new ri1.b();
        bVar.f68354x28d45f97 = this.f168767d;
        bVar.f68357x8fc538df = this.f168768e;
        bVar.f68355x1e3e7a17 = this.f168769f;
        bVar.f68358x44ad561b = this.f168770g;
        return bVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f168767d);
        dest.writeString(this.f168768e);
        dest.writeString(this.f168769f);
        dest.writeString(this.f168770g);
        dest.writeString(this.f168771h);
    }
}
