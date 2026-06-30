package com.tencent.mm.plugin.appbrand.page.web_renderingcache;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/page/web_renderingcache/WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel> CREATOR = new ri1.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87234d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f87235e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f87236f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f87237g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f87238h;

    public WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(java.lang.String appId, java.lang.String commLibVersionId, java.lang.String appVersionId, java.lang.String pageURL, java.lang.String str) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(commLibVersionId, "commLibVersionId");
        kotlin.jvm.internal.o.g(appVersionId, "appVersionId");
        kotlin.jvm.internal.o.g(pageURL, "pageURL");
        this.f87234d = appId;
        this.f87235e = commLibVersionId;
        this.f87236f = appVersionId;
        this.f87237g = pageURL;
        this.f87238h = str;
    }

    public final ri1.b a() {
        ri1.b bVar = new ri1.b();
        bVar.field_appId = this.f87234d;
        bVar.field_commLibVersionId = this.f87235e;
        bVar.field_appVersionId = this.f87236f;
        bVar.field_pageURL = this.f87237g;
        return bVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f87234d);
        dest.writeString(this.f87235e);
        dest.writeString(this.f87236f);
        dest.writeString(this.f87237g);
        dest.writeString(this.f87238h);
    }
}
