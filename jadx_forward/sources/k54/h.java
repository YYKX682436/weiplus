package k54;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f385959a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f385960b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f385961c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f385962d;

    /* renamed from: e, reason: collision with root package name */
    public final fe0.z3 f385963e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f385964f;

    public h(int i17, java.lang.String url, java.lang.String canvasKey, java.lang.String compId, fe0.z3 z3Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasKey, "canvasKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compId, "compId");
        this.f385959a = i17;
        this.f385960b = url;
        this.f385961c = canvasKey;
        this.f385962d = compId;
        this.f385963e = z3Var;
        this.f385964f = z17;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f385961c;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f385962d;
    }

    public final int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f385959a;
    }

    public final java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f385960b;
    }

    public final void e(java.util.Map params) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        params.put("componentId", this.f385962d);
        fe0.z3 z3Var = this.f385963e;
        if (z3Var != null) {
            z3Var.a(params);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
    }

    /* renamed from: equals */
    public boolean m142006xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return true;
        }
        if (!(obj instanceof k54.h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        k54.h hVar = (k54.h) obj;
        if (this.f385959a != hVar.f385959a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385960b, hVar.f385960b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385961c, hVar.f385961c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385962d, hVar.f385962d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385963e, hVar.f385963e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        boolean z17 = this.f385964f;
        boolean z18 = hVar.f385964f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m142007x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f385959a) * 31) + this.f385960b.hashCode()) * 31) + this.f385961c.hashCode()) * 31) + this.f385962d.hashCode()) * 31;
        fe0.z3 z3Var = this.f385963e;
        int hashCode2 = ((hashCode + (z3Var == null ? 0 : z3Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f385964f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m142008x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        java.lang.String str = "WebViewData(id=" + this.f385959a + ", url=" + this.f385960b + ", canvasKey=" + this.f385961c + ", compId=" + this.f385962d + ", onEvent=" + this.f385963e + ", isBackgroundTransparent=" + this.f385964f + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return str;
    }
}
