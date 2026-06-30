package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView */
/* loaded from: classes4.dex */
public class C17822xa8f63df8 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f245469d;

    /* renamed from: e, reason: collision with root package name */
    public int f245470e;

    /* renamed from: f, reason: collision with root package name */
    public int f245471f;

    /* renamed from: g, reason: collision with root package name */
    public int f245472g;

    /* renamed from: h, reason: collision with root package name */
    public int f245473h;

    /* renamed from: i, reason: collision with root package name */
    public int f245474i;

    /* renamed from: m, reason: collision with root package name */
    public int f245475m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f245476n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f245477o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f245478p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f245479q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f245480r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f245481s;

    /* renamed from: t, reason: collision with root package name */
    public float f245482t;

    /* renamed from: u, reason: collision with root package name */
    public int f245483u;

    public C17822xa8f63df8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245482t = 0.9f;
        this.f245483u = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        setLayerType(1, null);
        this.f245470e = i65.a.b(context, 50);
        this.f245471f = i65.a.b(context, 7);
        this.f245472g = i65.a.b(context, 7);
        this.f245473h = i65.a.b(context, 14);
        i65.a.b(context, 4);
        i65.a.b(context, 3);
        this.f245475m = i65.a.b(context, 1);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f245476n = paint;
        paint.setColor(android.graphics.Color.parseColor("#99FFFFFF"));
        this.f245476n.setAntiAlias(true);
        this.f245476n.setDither(true);
        this.f245476n.setStyle(android.graphics.Paint.Style.STROKE);
        this.f245476n.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f245476n.setStrokeWidth(this.f245471f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f245480r = paint2;
        paint2.setColor(android.graphics.Color.parseColor("#99FFFFFF"));
        this.f245480r.setAntiAlias(true);
        this.f245480r.setDither(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f245477o = paint3;
        paint3.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        this.f245477o.setAntiAlias(true);
        this.f245477o.setDither(true);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f245478p = paint4;
        paint4.setColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.f245478p.setAntiAlias(true);
        this.f245478p.setDither(true);
        this.f245478p.setStyle(android.graphics.Paint.Style.STROKE);
        this.f245478p.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f245478p.setStrokeWidth(this.f245472g);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f245481s = paint5;
        paint5.setColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.f245481s.setAntiAlias(true);
        this.f245481s.setDither(true);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.f245479q = paint6;
        paint6.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        this.f245479q.setAntiAlias(true);
        this.f245479q.setDither(true);
        float f17 = this.f245471f / 2;
        float f18 = (this.f245470e * 2) - f17;
        this.f245469d = new android.graphics.RectF(f17, f17, f18, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void a(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        android.graphics.Point point;
        android.graphics.Point point2;
        android.graphics.Point point3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = java.lang.Math.toRadians(45.0d);
        if (this.f245483u == 0) {
            radians = java.lang.Math.toRadians(135.0d);
        }
        int cos = (int) (this.f245470e + ((r5 - (this.f245471f / 2)) * java.lang.Math.cos(radians)));
        int sin = (int) (this.f245470e - ((r6 - (this.f245471f / 2)) * java.lang.Math.sin(radians)));
        int i17 = this.f245473h / 2;
        if (this.f245483u == 0) {
            int i18 = cos - i17;
            int i19 = sin + i17;
            point = new android.graphics.Point(i18, i19);
            point2 = new android.graphics.Point(cos + i17, i19);
            point3 = new android.graphics.Point(i18, sin - i17);
        } else {
            int i27 = sin + i17;
            point = new android.graphics.Point(cos - i17, i27);
            int i28 = cos + i17;
            point2 = new android.graphics.Point(i28, i27);
            point3 = new android.graphics.Point(i28, sin - i17);
        }
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (this.f245469d != null) {
            canvas.save();
            canvas.translate(-this.f245474i, this.f245475m);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.drawArc(this.f245469d, 225.0f, 90.0f, false, this.f245476n);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            a(canvas, this.f245480r);
            float f17 = this.f245482t;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f245483u == 0) {
                canvas.drawArc(this.f245469d, 315.0f - f17, f17, false, this.f245478p);
            } else {
                canvas.drawArc(this.f245469d, 225.0f, f17, false, this.f245478p);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f245482t >= 86.4f) {
                a(canvas, this.f245481s);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.restore();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = java.lang.Math.toRadians(45.0d);
        int cos = (int) (this.f245470e * 2 * java.lang.Math.cos(radians));
        int i19 = this.f245470e;
        int sin = (int) (i19 - (i19 * java.lang.Math.sin(radians)));
        int i27 = this.f245470e;
        double cos2 = i27 - (i27 * java.lang.Math.cos(radians));
        int i28 = this.f245471f;
        this.f245474i = (int) (cos2 - (i28 / 2));
        setMeasuredDimension(cos + i28, sin + i28 + (this.f245475m * 2));
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    /* renamed from: setProgress */
    public void m69705x3ae760af(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (f17 <= 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        float f18 = f17 * 90.0f;
        this.f245482t = f18;
        if (f18 < 0.9f) {
            this.f245482t = 0.9f;
        }
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    /* renamed from: setShowMode */
    public void m69706x625d60c2(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f245483u = i17;
        postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }
}
