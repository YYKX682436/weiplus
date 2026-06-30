package yw4;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw4.i f548485b;

    public d(java.lang.String str, yw4.i iVar) {
        this.f548484a = str;
        this.f548485b = iVar;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: forceH5 */
    public final void m177954xd79a8518(java.lang.String url) {
        yw4.i iVar = this.f548485b;
        iVar.z();
        iVar.c().f263454c0 = true;
        iVar.c().M();
        if (url == null || r26.n0.N(url)) {
            iVar.c().J0();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = iVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17.T(), "reload for:".concat(url));
        c17.f263449a.mo32265x141096a9(url);
        c17.f263454c0 = true;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getLocalData */
    public final java.lang.String m177955xb79006ff(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            nu4.k kVar = nu4.b0.f421774J;
            return nu4.b0.L.s(this.f548484a + '-' + key, "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherInterceptor", e17, "getLocalData:".concat(key), new java.lang.Object[0]);
            return null;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setLocalData */
    public final void m177956x13e3c773(java.lang.String key, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            nu4.k kVar = nu4.b0.f421774J;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) nu4.b0.L.i()).D(this.f548484a + '-' + key, data);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherInterceptor", e17, "setLocalData:" + key + ", " + data, new java.lang.Object[0]);
        }
    }
}
