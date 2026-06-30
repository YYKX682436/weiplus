package cb4;

/* loaded from: classes13.dex */
public class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final bb4.c f121881d;

    public a(android.content.Context context, bb4.c cVar) {
        super(context);
        this.f121881d = cVar;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
        super.onDraw(canvas);
        int height = getHeight();
        int min = (int) ((java.lang.Math.min(height, r3) / 2.0f) * 0.8d);
        int width = (int) (getWidth() / 2.0f);
        int i17 = (int) (height / 2.0f);
        bb4.c cVar = this.f121881d;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        android.graphics.Bitmap bitmap = cVar.f100654m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f17 = cVar.f100655n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i18 = (int) ((min * 2) + (f17 * 2.0f));
            canvas.drawBitmap(android.graphics.Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * i18) / bitmap.getHeight(), i18, false), width - (r5 >>> 1), i17 - (i18 >>> 1), (android.graphics.Paint) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
    }
}
