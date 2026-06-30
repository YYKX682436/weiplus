package v84;

/* loaded from: classes4.dex */
public abstract class a extends v84.c {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f515616f;

    public a(android.content.Context context, android.widget.FrameLayout frameLayout, v84.b bVar) {
        super(context, bVar);
        this.f515616f = frameLayout;
        b();
    }

    @Override // v84.c
    public void a(android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        android.widget.ImageView imageView = new android.widget.ImageView(this.f515627d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int abs = java.lang.Math.abs(rect.right - rect.left);
        int abs2 = java.lang.Math.abs(rect.top - rect.bottom);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(abs, abs2);
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        imageView.setImageBitmap(this.f515624a.f515617a);
        this.f515616f.addView(imageView, layoutParams);
        f(imageView, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    @Override // v84.c
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f515628e.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        this.f515616f.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    public abstract void f(android.view.View view, int i17, int i18, int i19, int i27);
}
