package w44;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f524424a;

    /* renamed from: b, reason: collision with root package name */
    public final m54.l f524425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f524426c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f524427d;

    /* renamed from: e, reason: collision with root package name */
    public final w44.a f524428e;

    public b(android.app.Activity activity, m54.l pageParam, boolean z17, yz5.l lVar, w44.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParam, "pageParam");
        this.f524424a = activity;
        this.f524425b = pageParam;
        this.f524426c = z17;
        this.f524427d = lVar;
        this.f524428e = aVar;
    }

    public final android.app.Activity a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActivity", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return this.f524424a;
    }

    public final m54.l b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return this.f524425b;
    }

    /* renamed from: equals */
    public boolean m173206xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return true;
        }
        if (!(obj instanceof w44.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        w44.b bVar = (w44.b) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524424a, bVar.f524424a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524425b, bVar.f524425b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (this.f524426c != bVar.f524426c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524427d, bVar.f524427d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524428e, bVar.f524428e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return b17;
    }

    /* renamed from: hashCode */
    public int m173207x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        android.app.Activity activity = this.f524424a;
        int hashCode = (((((activity == null ? 0 : activity.hashCode()) * 31) + this.f524425b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f524426c)) * 31;
        yz5.l lVar = this.f524427d;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        w44.a aVar = this.f524428e;
        int hashCode3 = hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return hashCode3;
    }

    /* renamed from: toString */
    public java.lang.String m173208x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        java.lang.String str = "JsApiEnv(activity=" + this.f524424a + ", pageParam=" + this.f524425b + ", async=" + this.f524426c + ", backToJS=" + this.f524427d + ", onEvent=" + this.f524428e + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return str;
    }
}
