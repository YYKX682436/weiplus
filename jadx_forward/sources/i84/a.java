package i84;

/* loaded from: classes10.dex */
public final class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f371180d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f371181e;

    /* renamed from: f, reason: collision with root package name */
    public final float f371182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f371183g;

    public a(android.content.Context context, float f17, int i17) {
        super(context);
        android.view.Display defaultDisplay;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f371181e = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i17);
        paint.setStrokeWidth(f17);
        java.lang.Object systemService = context != null ? context.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        float refreshRate = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 60.0f : defaultDisplay.getRefreshRate();
        this.f371182f = refreshRate >= 30.0f ? refreshRate : 60.0f;
    }

    /* renamed from: getCurrentFPS */
    public final float m134928xad57eca6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        return this.f371182f;
    }

    /* renamed from: getPaint */
    public final android.graphics.Paint m134929x74f59ea8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        android.graphics.Paint paint = this.f371181e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        return paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f371181e;
        float strokeWidth = paint.getStrokeWidth();
        int width = getWidth();
        int height = getHeight();
        if (this.f371183g) {
            float f17 = strokeWidth + 0.0f;
            canvas.drawArc(f17, f17, width - strokeWidth, height - strokeWidth, this.f371180d + 270, 330.0f, false, paint);
            this.f371180d = (this.f371180d + (180.0f / this.f371182f)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            invalidate();
        } else {
            float f18 = strokeWidth + 0.0f;
            canvas.drawArc(f18, f18, width - strokeWidth, height - strokeWidth, 0.0f, 360.0f, false, paint);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
    }

    /* renamed from: setLoading */
    public final void m134930xc54f6a7a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        this.f371183g = z17;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
    }
}
