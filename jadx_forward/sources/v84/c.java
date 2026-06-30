package v84;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final v84.b f515624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f515626c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f515627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f515628e = new java.util.ArrayList();

    public c(android.content.Context context, v84.b bVar) {
        this.f515627d = context;
        this.f515624a = bVar;
        if (this.f515625b == 0) {
            this.f515625b = i65.a.b(context, 180);
        }
        if (this.f515626c == 0) {
            this.f515626c = i65.a.b(context, 220);
        }
    }

    public abstract void a(android.graphics.Rect rect);

    public synchronized void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        try {
            c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            int i17 = this.f515624a.f515623g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            for (int i18 = 0; i18 < i17; i18++) {
                this.f515628e.add(d());
            }
            java.util.Iterator it = this.f515628e.iterator();
            while (it.hasNext()) {
                a((android.graphics.Rect) it.next());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("longTouchAd.BaseScene", "buildSprites exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
    }

    public abstract void c();

    public abstract android.graphics.Rect d();

    public android.graphics.Rect e(android.graphics.Rect rect, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        int i27 = i19 / 2;
        rect.left = i17 - i27;
        rect.right = i17 + i27;
        rect.top = i18 - i27;
        rect.bottom = i18 + i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        return rect;
    }
}
