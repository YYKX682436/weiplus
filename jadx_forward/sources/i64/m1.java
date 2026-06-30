package i64;

/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i64.m1 f370771c = new i64.m1();

    /* renamed from: a, reason: collision with root package name */
    public final lt0.l f370772a = new lt0.l(5);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f370773b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    public final boolean a(android.widget.ImageView imageView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        java.lang.String str2 = (java.lang.String) a84.y0.d(imageView, com.p314xaae8f345.mm.R.id.nae);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url, in fillImageViewWithCache");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        if (!str.equalsIgnoreCase(za4.t0.l("adId", str2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath, in fillImageViewWithCache!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f370773b.get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap is null or recycled!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        imageView.setImageBitmap(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        return true;
    }

    public android.graphics.Bitmap b(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        lt0.l lVar = this.f370772a;
        if (lVar.k(str) && (bitmap = (android.graphics.Bitmap) lVar.i(str)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "hit cache %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return bitmap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "not hit cache %s", str);
        android.graphics.Bitmap b17 = r94.a.b(str, null, 0.1f);
        if (b17 != null) {
            lVar.put(str, b17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        return b17;
    }

    public void c(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        try {
            if (!a(imageView, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "there is no cache bitmap, it should reload from flash!");
                d(imageView, str, i17);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "there is something wrong in setImageToImageView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return;
        }
        java.lang.String str2 = (java.lang.String) a84.y0.d(imageView, com.p314xaae8f345.mm.R.id.nae);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        } else {
            if (!str.equalsIgnoreCase(za4.t0.l("adId", str2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                return;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            ((ku5.t0) ku5.t0.f394148d).g(new i64.l1(this, i17, width, height, str, str2, imageView));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        }
    }
}
