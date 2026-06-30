package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsRatioView */
/* loaded from: classes4.dex */
public class C18423xc1dd5ed8 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f252438d;

    /* renamed from: e, reason: collision with root package name */
    public int f252439e;

    /* renamed from: f, reason: collision with root package name */
    public int f252440f;

    /* renamed from: g, reason: collision with root package name */
    public int f252441g;

    /* renamed from: h, reason: collision with root package name */
    public int f252442h;

    /* renamed from: i, reason: collision with root package name */
    public int f252443i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f252444m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f252445n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f252446o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f252447p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f252448q;

    public C18423xc1dd5ed8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252441g = 70;
        this.f252442h = 10;
        this.f252443i = 0;
        this.f252444m = new android.graphics.Path();
        this.f252445n = new android.graphics.Path();
        this.f252446o = new android.graphics.Paint();
        this.f252447p = new android.graphics.Paint();
        this.f252448q = new float[8];
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        this.f252438d = i17;
        this.f252439e = i18;
        int max = java.lang.Math.max(0, i17);
        this.f252438d = max;
        this.f252438d = java.lang.Math.min(100, max);
        int max2 = java.lang.Math.max(0, this.f252439e);
        this.f252439e = max2;
        int min = java.lang.Math.min(100, max2);
        this.f252439e = min;
        int i19 = this.f252438d;
        if (min + i19 != 100) {
            this.f252439e = 100 - i19;
        }
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        int width = getWidth();
        int height = getHeight();
        int tan = (int) (height / java.lang.Math.tan(java.lang.Math.toRadians(this.f252441g)));
        int max = java.lang.Math.max((int) ((((((width - tan) - this.f252442h) - (this.f252440f * 2)) * this.f252438d) * 1.0f) / 100.0f), this.f252443i);
        android.graphics.Path path = this.f252444m;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(tan + max, 0.0f);
        float f17 = height;
        path.lineTo(max, f17);
        path.lineTo(0.0f, f17);
        path.close();
        android.graphics.Path path2 = this.f252445n;
        path2.reset();
        path2.moveTo(r4 + this.f252442h, 0.0f);
        float f18 = width;
        path2.lineTo(f18, 0.0f);
        path2.lineTo(f18, f17);
        path2.lineTo(max + this.f252442h, f17);
        path2.close();
        android.graphics.Path path3 = new android.graphics.Path();
        path3.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f252448q, android.graphics.Path.Direction.CW);
        canvas.clipPath(path3);
        canvas.drawPath(path, this.f252446o);
        canvas.drawPath(path2, this.f252447p);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }
}
