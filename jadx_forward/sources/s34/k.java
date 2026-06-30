package s34;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f484213a;

    /* renamed from: b, reason: collision with root package name */
    public int f484214b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f484215c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f484216d;

    /* renamed from: dragImagUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76708xc0bf78f1;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f484217e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f484218f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f484219g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f484220h = false;

    public static android.graphics.Rect a(android.graphics.Rect rect, int i17, android.graphics.Point point) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rect2.left = c(rect.left, i17) + point.x;
        rect2.top = c(rect.top, i17) + point.y;
        rect2.right = c(rect.right, i17) + point.x;
        rect2.bottom = c(rect.bottom, i17) + point.y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return rect2;
    }

    public static int c(float f17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        int i18 = (int) ((f17 * i17) / 1280.0f);
        if (r8 - i18 > 0.001d) {
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return i18;
    }

    public static android.graphics.Rect d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split != null && split.length >= 4) {
                android.graphics.Rect rect = new android.graphics.Rect();
                rect.left = java.lang.Integer.parseInt(split[0]);
                rect.top = java.lang.Integer.parseInt(split[1]);
                rect.right = java.lang.Integer.parseInt(split[2]);
                rect.bottom = java.lang.Integer.parseInt(split[3]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                return rect;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDragInfo", "parseRect, exp=" + e17.toString() + ", data=" + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return null;
    }

    public android.graphics.Bitmap b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (android.text.TextUtils.isEmpty(this.f76708xc0bf78f1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        android.graphics.Bitmap bitmap = this.f484219g;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return bitmap;
        }
        java.lang.String e17 = a84.m.e(this.f76708xc0bf78f1);
        if (android.text.TextUtils.isEmpty(e17) || !com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragInfo", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f484220h + ", url=" + this.f76708xc0bf78f1);
            if (!this.f484220h) {
                this.f484220h = true;
                a84.m.d(this.f76708xc0bf78f1, new s34.j(this));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragInfo", "hit local cache, hash=" + hashCode());
            ((ku5.t0) ku5.t0.f394148d).g(new s34.h(this, e17));
        }
        android.graphics.Bitmap bitmap2 = this.f484219g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return bitmap2;
    }
}
