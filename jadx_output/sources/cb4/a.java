package cb4;

/* loaded from: classes13.dex */
public class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final bb4.c f40348d;

    public a(android.content.Context context, bb4.c cVar) {
        super(context);
        this.f40348d = cVar;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
        super.onDraw(canvas);
        int height = getHeight();
        int min = (int) ((java.lang.Math.min(height, r3) / 2.0f) * 0.8d);
        int width = (int) (getWidth() / 2.0f);
        int i17 = (int) (height / 2.0f);
        bb4.c cVar = this.f40348d;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        android.graphics.Bitmap bitmap = cVar.f19121m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (bitmap != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f17 = cVar.f19122n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i18 = (int) ((min * 2) + (f17 * 2.0f));
            canvas.drawBitmap(android.graphics.Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * i18) / bitmap.getHeight(), i18, false), width - (r5 >>> 1), i17 - (i18 >>> 1), (android.graphics.Paint) null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
    }
}
