package i54;

/* loaded from: classes4.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i54.x f370351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h54.d f370352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f370353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f370355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i54.x xVar, h54.d dVar, ca4.b0 b0Var, java.lang.String str, int i17) {
        super(2);
        this.f370351d = xVar;
        this.f370352e = dVar;
        this.f370353f = b0Var;
        this.f370354g = str;
        this.f370355h = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String path = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (intValue == 0) {
            if ((path.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(path)) {
                i54.x xVar = this.f370351d;
                h54.d dVar = this.f370352e;
                ca4.b0 b0Var = this.f370353f;
                java.lang.String qrUrl = this.f370354g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(qrUrl, "$qrUrl");
                boolean z17 = this.f370355h == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
                xVar.c(dVar, b0Var, path, qrUrl, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
                return f0Var;
            }
        }
        i54.x.b(this.f370351d, this.f370352e, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        return f0Var2;
    }
}
