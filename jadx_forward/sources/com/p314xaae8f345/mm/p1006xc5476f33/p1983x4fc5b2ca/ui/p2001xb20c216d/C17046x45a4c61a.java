package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorCircularProgressBar */
/* loaded from: classes3.dex */
public class C17046x45a4c61a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f237553d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f237555f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f237556g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f237557h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f237558i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f237559m;

    /* renamed from: n, reason: collision with root package name */
    public float f237560n;

    /* renamed from: o, reason: collision with root package name */
    public float f237561o;

    /* renamed from: p, reason: collision with root package name */
    public int f237562p;

    /* renamed from: q, reason: collision with root package name */
    public float f237563q;

    /* renamed from: r, reason: collision with root package name */
    public float f237564r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f237565s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f237566t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237567u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237568v;

    public C17046x45a4c61a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f237553d = android.graphics.Color.parseColor("#1AAD19");
        this.f237554e = android.graphics.Color.parseColor("#FFFFFF");
        this.f237555f = android.graphics.Color.parseColor("#FA5151");
        this.f237560n = 0.0f;
        this.f237561o = 0.0f;
        this.f237562p = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        this.f237563q = 0.0f;
        this.f237564r = 0.0f;
        this.f237566t = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f237567u = false;
        this.f237568v = false;
        this.f237565s = context;
    }

    /* renamed from: getDrawWidth */
    public int m68238x7b72c2c() {
        return (int) this.f237556g.width();
    }

    /* renamed from: getSubProgress */
    public java.util.ArrayList<java.lang.Float> m68239xec84eb57() {
        return this.f237566t;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float f17 = this.f237561o;
        canvas.translate(f17, f17);
        android.graphics.RectF rectF = this.f237556g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.f237567u) {
            float f18 = 0.0f;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f237566t;
                if (i17 >= arrayList.size()) {
                    break;
                }
                canvas.drawArc(this.f237556g, ((f18 / this.f237564r) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f237564r) * 360.0f, false, this.f237557h);
                float floatValue = ((java.lang.Float) arrayList.get(i17)).floatValue();
                android.graphics.RectF rectF2 = this.f237556g;
                float f19 = this.f237564r;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f19) * 360.0f) + 90.0f, (0.85f / f19) * 360.0f, false, this.f237558i);
                i17++;
                f18 = floatValue;
            }
            android.graphics.RectF rectF3 = this.f237556g;
            float f27 = this.f237564r;
            canvas.drawArc(rectF3, ((f18 / f27) * 360.0f) + 90.0f, ((this.f237563q - f18) / f27) * 360.0f, false, this.f237557h);
        } else {
            canvas.drawArc(this.f237556g, 90.0f, (this.f237563q / this.f237564r) * 360.0f, false, this.f237557h);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f237568v) {
            return;
        }
        this.f237568v = true;
        float width = getWidth();
        float dimensionPixelSize = this.f237565s.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562101a61);
        this.f237560n = dimensionPixelSize;
        this.f237561o = dimensionPixelSize / 2.0f;
        float f17 = this.f237561o;
        float f18 = width - f17;
        this.f237556g = new android.graphics.RectF(f17, f17, f18, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f237557h = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f237557h.setStrokeWidth(this.f237560n);
        this.f237557h.setColor(this.f237553d);
        this.f237557h.setAlpha(this.f237562p);
        this.f237557h.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f237558i = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f237558i.setStrokeWidth(this.f237560n);
        this.f237558i.setColor(this.f237554e);
        this.f237558i.setAlpha(this.f237562p);
        this.f237558i.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f237559m = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f237559m.setStrokeWidth(this.f237560n);
        this.f237559m.setColor(this.f237555f);
        this.f237559m.setAntiAlias(true);
    }

    /* renamed from: setCircularColor */
    public void m68240xe2eba6c2(int i17) {
        this.f237553d = i17;
        this.f237562p = 255;
        android.graphics.Paint paint = this.f237557h;
        if (paint == null || i17 == 0) {
            return;
        }
        paint.setColor(i17);
    }

    /* renamed from: setCurrentProgress */
    public void m68241x65dec604(float f17) {
        this.f237563q = f17;
        invalidate();
    }

    /* renamed from: setDuration */
    public void m68242xffd6ec16(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setEnableSubProgress */
    public void m68243x8ffc3ac8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", java.lang.Boolean.valueOf(z17));
        this.f237567u = z17;
    }

    /* renamed from: setInitProgress */
    public void m68244xe2ae08df(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
    }

    /* renamed from: setMaxProgress */
    public void m68245xadb2e1ef(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", java.lang.Float.valueOf(f17));
        this.f237564r = f17;
    }

    /* renamed from: setProgressCallback */
    public void m68246x61e5c614(wu3.l1 l1Var) {
    }

    public C17046x45a4c61a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f237553d = android.graphics.Color.parseColor("#1AAD19");
        this.f237554e = android.graphics.Color.parseColor("#FFFFFF");
        this.f237555f = android.graphics.Color.parseColor("#FA5151");
        this.f237560n = 0.0f;
        this.f237561o = 0.0f;
        this.f237562p = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        this.f237563q = 0.0f;
        this.f237564r = 0.0f;
        this.f237566t = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f237567u = false;
        this.f237568v = false;
        this.f237565s = context;
    }
}
