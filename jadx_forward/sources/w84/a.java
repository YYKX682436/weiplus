package w84;

/* loaded from: classes4.dex */
public abstract class a extends v84.c {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 f525563f;

    public a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77, v84.b bVar) {
        super(context, bVar);
        this.f525563f = c17797xece4de77;
        b();
    }

    @Override // v84.c
    public void a(android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        t84.c cVar = new t84.c(this.f515627d);
        int abs = java.lang.Math.abs(rect.right - rect.left);
        int abs2 = java.lang.Math.abs(rect.top - rect.bottom);
        t84.b bVar = new t84.b(abs, abs2);
        ((android.widget.FrameLayout.LayoutParams) bVar).leftMargin = rect.left;
        ((android.widget.FrameLayout.LayoutParams) bVar).topMargin = rect.top;
        cVar.k(bVar);
        cVar.f(this.f515624a.f515617a);
        cVar.j(0.0f);
        this.f525563f.d(cVar);
        f(cVar, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    @Override // v84.c
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f515628e.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77 = this.f525563f;
        c17797xece4de77.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        c17797xece4de77.queueEvent(new t84.e(c17797xece4de77));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    public abstract void f(t84.c cVar, int i17, int i18, int i19, int i27);
}
