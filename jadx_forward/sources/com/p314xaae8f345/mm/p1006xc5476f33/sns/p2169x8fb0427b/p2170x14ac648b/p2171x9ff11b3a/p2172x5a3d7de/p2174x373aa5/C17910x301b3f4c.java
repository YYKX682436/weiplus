package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2172x5a3d7de.p2174x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid */
/* loaded from: classes13.dex */
public class C17910x301b3f4c extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2172x5a3d7de.p2173x997370f6.AbstractC17906x5a4d4e9 {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Point f246562o = new android.graphics.Point(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public int f246563d;

    /* renamed from: e, reason: collision with root package name */
    public int f246564e;

    /* renamed from: f, reason: collision with root package name */
    public android.text.Spannable[] f246565f;

    /* renamed from: g, reason: collision with root package name */
    public int f246566g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Point f246567h;

    /* renamed from: i, reason: collision with root package name */
    public bb4.c f246568i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f246569m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f246570n;

    public C17910x301b3f4c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f246563d = 4;
        this.f246564e = 4;
        this.f246566g = 80;
        this.f246567h = f246562o;
        this.f246570n = new android.graphics.Path();
        new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: getGridDotRadius */
    private int m70179x9646a2df() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100657p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    /* renamed from: getPaintGLabelFont */
    private android.graphics.Paint m70180x76ae5184() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100649h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100650i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGScaleFont */
    private android.graphics.Paint m70181x2af8c0da() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100652k;
        if (i17 == -1) {
            i17 = cVar.f100649h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100653l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGridBorder */
    private android.graphics.Paint m70182xe63127da() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100644c;
        if (i17 == -1) {
            i17 = cVar.f100645d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100648g;
        if (f17 == -1.0f) {
            f17 = cVar2.f100647f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        paint.setAntiAlias(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGridDot */
    private android.graphics.Paint m70183x973b205b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100656o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGridFill */
    private android.graphics.Paint m70184x5029bcb1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100643b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setAntiAlias(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGridLatitude */
    private android.graphics.Paint m70185x4c722c9a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100645d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100647f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        paint.setAntiAlias(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getPaintGridLongitude */
    private android.graphics.Paint m70186xaeb98f41() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100646e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100647f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    /* renamed from: getTextPaintGLabelFont */
    private android.text.TextPaint m70187x738a2f97() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.text.TextPaint textPaint = new android.text.TextPaint();
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f100649h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setColor(i17);
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f100650i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setTextSize(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return textPaint;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2172x5a3d7de.p2173x997370f6.AbstractC17906x5a4d4e9
    public int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i17 = this.f246566g * 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2172x5a3d7de.p2173x997370f6.AbstractC17906x5a4d4e9
    public int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i17 = this.f246566g * 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    public java.util.List c(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2172x5a3d7de.p2174x373aa5.C17910x301b3f4c c17910x301b3f4c = this;
        java.lang.String str = "getGridPoints";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridPoints", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (i17 < c17910x301b3f4c.f246563d) {
            android.graphics.PointF pointF = new android.graphics.PointF();
            android.graphics.Point point = c17910x301b3f4c.f246567h;
            double d17 = i17 * 2 * 3.141592653589793d;
            pointF.set((float) (point.x - ((c17910x301b3f4c.f246566g * f17) * java.lang.Math.sin(d17 / c17910x301b3f4c.f246563d))), (float) (point.y - ((c17910x301b3f4c.f246566g * f17) * java.lang.Math.cos(d17 / c17910x301b3f4c.f246563d))));
            arrayList.add(pointF);
            i17++;
            c17910x301b3f4c = this;
            str = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return arrayList;
    }

    /* renamed from: getGridStyle */
    public bb4.c m70188x4b172f55() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return cVar;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3 = "onDraw";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f246566g = (int) ((java.lang.Math.min(height, width) / 2.0f) * 0.8d);
        this.f246567h.set((int) (width / 2.0f), (int) (height / 2.0f));
        if (this.f246568i.a() != null) {
            float f17 = this.f246566g * 2;
            bb4.c cVar = this.f246568i;
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f18 = cVar.f100655n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i18 = (int) (f17 + (f18 * 2.0f));
            int width2 = (this.f246568i.a().getWidth() * i18) / this.f246568i.a().getHeight();
            if (this.f246568i.a() != null) {
                canvas.drawBitmap(android.graphics.Bitmap.createScaledBitmap(this.f246568i.a(), width2, i18, false), r2 - (width2 >>> 1), r1 - (i18 >>> 1), (android.graphics.Paint) null);
            }
        }
        this.f246568i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        bb4.c cVar2 = this.f246568i;
        cVar2.getClass();
        java.lang.String str5 = "getGridChartType";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i19 = cVar2.f100642a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        android.graphics.Path path = this.f246570n;
        float f19 = 1.0f;
        if (i19 == 0) {
            this.f246569m = c(1.0f);
            for (int i27 = 0; i27 < this.f246563d; i27++) {
                android.graphics.PointF pointF = (android.graphics.PointF) ((java.util.ArrayList) this.f246569m).get(i27);
                if (i27 == 0) {
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                }
            }
            path.close();
            bb4.c cVar3 = this.f246568i;
            cVar3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i28 = cVar3.f100643b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (i28 != 0 && this.f246568i.a() == null) {
                canvas.drawPath(path, m70184x5029bcb1());
            }
        } else if (i19 == 1) {
            canvas.drawCircle(r10.x, r10.y, this.f246566g, m70184x5029bcb1());
        }
        this.f246568i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        this.f246569m = c(1.0f);
        int i29 = 0;
        while (i29 < this.f246563d) {
            android.graphics.PointF pointF2 = (android.graphics.PointF) ((java.util.ArrayList) this.f246569m).get(i29);
            canvas.drawLine(r10.x, r10.y, pointF2.x, pointF2.y, m70186xaeb98f41());
            i29++;
            path = path;
            str5 = str5;
            f19 = 1.0f;
        }
        float f27 = f19;
        android.graphics.Path path2 = path;
        java.lang.String str6 = str5;
        this.f246568i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        bb4.c cVar4 = this.f246568i;
        cVar4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str6, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i37 = cVar4.f100642a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (i37 == 0) {
            canvas.drawPath(path2, m70182xe63127da());
            path2.reset();
            int i38 = 1;
            while (true) {
                int i39 = this.f246564e;
                if (i38 >= i39) {
                    break;
                }
                this.f246569m = c((i38 * f27) / i39);
                for (int i47 = 0; i47 < this.f246563d; i47++) {
                    android.graphics.PointF pointF3 = (android.graphics.PointF) ((java.util.ArrayList) this.f246569m).get(i47);
                    if (i47 == 0) {
                        path2.moveTo(pointF3.x, pointF3.y);
                    } else {
                        path2.lineTo(pointF3.x, pointF3.y);
                    }
                    canvas.drawCircle(pointF3.x, pointF3.y, m70179x9646a2df(), m70183x973b205b());
                }
                path2.close();
                canvas.drawPath(path2, m70185x4c722c9a());
                path2.reset();
                i38++;
            }
        } else if (i37 == 1) {
            canvas.drawCircle(r10.x, r10.y, this.f246566g, m70182xe63127da());
            int i48 = 1;
            while (true) {
                int i49 = this.f246564e;
                if (i48 >= i49) {
                    break;
                }
                canvas.drawCircle(r10.x, r10.y, this.f246566g * ((i48 * f27) / i49), m70185x4c722c9a());
                i48++;
            }
        }
        if (this.f246565f != null) {
            this.f246568i.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (this.f246565f.length != this.f246563d) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Labels array length not matches longitude lines number.");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
                throw runtimeException;
            }
            int i57 = 0;
            while (i57 < this.f246563d) {
                android.text.Spannable spannable = this.f246565f[i57];
                if (spannable.equals(null)) {
                    str = str3;
                    str2 = str4;
                } else {
                    float f28 = 0.0f;
                    float f29 = (i57 == 0 || i57 == (i17 = this.f246563d >>> 1)) ? 0.5f : (i57 <= 0 || i57 >= i17) ? f27 : 0.0f;
                    if (i57 == 0) {
                        f28 = this.f246568i.b();
                    } else if (i57 == (this.f246563d >>> 1)) {
                        f28 = -this.f246568i.b();
                    }
                    android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannable, m70187x738a2f97(), 1000, android.text.Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
                    double d17 = i57 * 2 * 3.141592653589793d;
                    str = str3;
                    str2 = str4;
                    float lineWidth = (float) ((r10.x - (staticLayout.getLineWidth(0) * f29)) - ((this.f246566g + this.f246568i.b()) * java.lang.Math.sin(6.283185307179586d - (d17 / this.f246563d))));
                    float height2 = (float) (((r10.y - (staticLayout.getHeight() / 2)) - ((this.f246566g + this.f246568i.b()) * java.lang.Math.cos(6.283185307179586d - (d17 / this.f246563d)))) - f28);
                    canvas.save();
                    canvas.translate(lineWidth, height2);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                i57++;
                str3 = str;
                str4 = str2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100643b = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridBorderColor */
    public void m70189x3ae566af(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100644c = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridBorderStrokeWidth */
    public void m70190x6c8178ba(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100648g = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridChartType */
    public void m70191x839c250(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100642a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridLabelColor */
    public void m70192x3149b5b7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100649h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridLabelPadding */
    public void m70193x9d0a7d65(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100651j = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridLabelSize */
    public void m70194x85bf3f2d(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100650i = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridLatitudeColor */
    public void m70195x91c7b06f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100645d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridLongitudeColor */
    public void m70196x2fa0f3dc(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100646e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridScaleColor */
    public void m70197x64d3121(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100652k = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridScaleLabelPadding */
    public void m70198xc5c486ff(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f246568i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridScaleSize */
    public void m70199x3a09ae83(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100653l = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridStrokeWidth */
    public void m70200x827eca86(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f246568i;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f100647f = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setGridStyle */
    public void m70201xa76aefc9(bb4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f246568i = cVar;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setLabelsArray */
    public void m70202xa7bc03d8(android.text.Spannable[] spannableArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f246565f = spannableArr;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setLatNum */
    public void m70203x16249069(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f246564e = i17;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setLonNum */
    public void m70204x16e71f3d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f246563d = i17;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    /* renamed from: setMaxValue */
    public void m70205x8e5e58ef(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public C17910x301b3f4c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f246563d = 4;
        this.f246564e = 4;
        this.f246566g = 80;
        this.f246567h = f246562o;
        this.f246570n = new android.graphics.Path();
        new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public C17910x301b3f4c(android.content.Context context, int i17, int i18, float f17, android.text.Spannable[] spannableArr, bb4.c cVar) {
        super(context);
        this.f246563d = 4;
        this.f246564e = 4;
        this.f246566g = 80;
        this.f246567h = f246562o;
        this.f246570n = new android.graphics.Path();
        new android.graphics.Rect();
        this.f246563d = i17;
        this.f246564e = i18;
        this.f246565f = spannableArr;
        this.f246568i = cVar;
    }
}
