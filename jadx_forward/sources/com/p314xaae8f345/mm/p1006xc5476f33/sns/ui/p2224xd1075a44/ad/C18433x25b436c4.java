package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView */
/* loaded from: classes4.dex */
public class C18433x25b436c4 extends android.widget.LinearLayout {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f252485d;

    /* renamed from: e, reason: collision with root package name */
    public int f252486e;

    /* renamed from: f, reason: collision with root package name */
    public int f252487f;

    /* renamed from: g, reason: collision with root package name */
    public float f252488g;

    /* renamed from: h, reason: collision with root package name */
    public float f252489h;

    /* renamed from: i, reason: collision with root package name */
    public float f252490i;

    /* renamed from: m, reason: collision with root package name */
    public float f252491m;

    /* renamed from: n, reason: collision with root package name */
    public float f252492n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f252493o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f252494p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f252495q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f252496r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f252497s;

    /* renamed from: t, reason: collision with root package name */
    public int f252498t;

    /* renamed from: u, reason: collision with root package name */
    public float f252499u;

    /* renamed from: v, reason: collision with root package name */
    public int f252500v;

    /* renamed from: w, reason: collision with root package name */
    public float f252501w;

    /* renamed from: x, reason: collision with root package name */
    public float f252502x;

    /* renamed from: y, reason: collision with root package name */
    public float f252503y;

    /* renamed from: z, reason: collision with root package name */
    public float f252504z;

    public C18433x25b436c4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        canvas.drawCircle(this.f252502x, this.f252503y, this.f252491m, this.f252495q);
        canvas.drawCircle(this.f252502x, this.f252503y, this.f252491m, this.f252494p);
        float f17 = this.f252501w + (this.f252490i * 2.0f);
        this.f252501w = f17;
        this.f252502x = f17 + this.f252491m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        float f17;
        float f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        if (z17) {
            float f19 = this.f252489h;
            float f27 = this.f252499u;
            f18 = f19 - (this.f252492n * f27);
            f17 = f27 <= 0.3f ? 1.0f - ((f27 * 10.0f) / 3.0f) : 0.0f;
        } else {
            float f28 = this.f252499u;
            float f29 = (this.f252492n * f28) + this.f252490i;
            f17 = f28 >= 0.7f ? ((f28 - 0.7f) * 10.0f) / 3.0f : 0.0f;
            f18 = f29;
        }
        int i17 = (int) (f17 * 255.0f);
        float f37 = this.f252501w + f18;
        android.graphics.RectF rectF = new android.graphics.RectF(this.f252501w, 0.0f, f37, this.f252490i);
        float f38 = this.f252491m;
        canvas.drawRoundRect(rectF, f38, f38, this.f252493o);
        if (z17) {
            this.f252497s.setAlpha(i17);
            float f39 = this.f252502x;
            float f47 = this.f252491m;
            canvas.drawLine(f39, f47, f39 + ((f18 - (2.0f * f47)) * this.f252504z), f47, this.f252497s);
        } else if (this.A) {
            this.f252496r.setAlpha(i17);
            canvas.drawCircle(this.f252502x, this.f252503y, this.f252491m, this.f252496r);
        } else {
            this.f252497s.setAlpha(i17);
            float f48 = this.f252502x;
            float f49 = this.f252491m;
            canvas.drawLine(f48, f49, f48 + ((f18 - (2.0f * f49)) * this.f252504z), f49, this.f252497s);
        }
        float f57 = this.f252491m;
        canvas.drawRoundRect(rectF, f57, f57, this.f252494p);
        float f58 = f37 + this.f252490i;
        this.f252501w = f58;
        this.f252502x = f58 + this.f252491m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        super.onDraw(canvas);
        float f17 = this.f252488g;
        this.f252501w = f17;
        float f18 = this.f252491m;
        this.f252502x = f17 + f18;
        this.f252503y = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        int i17 = this.f252500v;
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i18 = 2; i18 <= this.f252486e - 1; i18++) {
                a(canvas);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i19 = 1; i19 < this.f252498t; i19++) {
                a(canvas);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i27 = this.f252498t + 2; i27 <= this.f252486e; i27++) {
                a(canvas);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public C18433x25b436c4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.A = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f252485d = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f252487f = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(this.f252485d)[0];
        this.f252489h = i65.a.b(this.f252485d, 28);
        float b17 = i65.a.b(this.f252485d, 7);
        this.f252490i = b17;
        this.f252491m = b17 / 2.0f;
        this.f252492n = this.f252489h - b17;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f252493o = paint;
        paint.setFlags(1);
        this.f252493o.setColor(this.f252485d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561040a51));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f252494p = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f252494p.setStrokeWidth(0.5f);
        this.f252494p.setFlags(1);
        this.f252494p.setColor(this.f252485d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561039a50));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f252495q = paint3;
        paint3.setFlags(1);
        this.f252495q.setColor(this.f252485d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561040a51));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f252496r = paint4;
        paint4.setFlags(1);
        this.f252496r.setColor(-1);
        this.f252496r.setAlpha(0);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f252497s = paint5;
        paint5.setFlags(1);
        this.f252497s.setColor(-1);
        this.f252497s.setAlpha(0);
        this.f252497s.setStyle(android.graphics.Paint.Style.STROKE);
        this.f252497s.setStrokeWidth(this.f252490i);
        this.f252497s.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        setWillNotDraw(false);
    }
}
