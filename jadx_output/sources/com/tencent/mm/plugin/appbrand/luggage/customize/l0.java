package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class l0 extends qd.a implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f85532d;

    public l0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f85532d = appBrandRuntime;
    }

    @Override // o91.e
    public java.lang.String T0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (!U0(lVar, str)) {
            return str;
        }
        return "wxapkg://icon?appId=" + lVar.getAppId() + "&path=" + android.net.Uri.encode(str);
    }

    @Override // o91.e
    public boolean U0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        return (lVar == null || str == null || str.length() == 0 || str.startsWith("wxapkg://") || str.startsWith("http://") || str.startsWith("https://") || str.startsWith("wxfile://") || str.contains("://")) ? false : true;
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return str != null && str.startsWith("wxapkg://");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (!a(str)) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = (java.lang.String) android.util.Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)).second;
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        android.graphics.Bitmap b17 = com.tencent.mm.plugin.appbrand.page.s5.b(this.f85532d, android.net.Uri.decode(str2));
        return rect != null ? new zg1.b(rect.left, rect.top, rect.width(), rect.height()).c(b17) : b17;
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (cVar == null) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = (java.lang.String) android.util.Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)).second;
        if (android.text.TextUtils.isEmpty(str2)) {
            cVar.a(null);
        } else {
            cVar.a(com.tencent.mm.plugin.appbrand.appcache.la.q(this.f85532d, str2));
        }
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxaPkgImageReader";
    }
}
