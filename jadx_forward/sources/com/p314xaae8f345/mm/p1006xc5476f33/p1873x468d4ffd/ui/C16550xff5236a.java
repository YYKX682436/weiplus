package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar */
/* loaded from: classes10.dex */
public class C16550xff5236a extends android.view.View {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public int f230706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f230707e;

    /* renamed from: f, reason: collision with root package name */
    public final int f230708f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f230709g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f230710h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f230711i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f230712m;

    /* renamed from: n, reason: collision with root package name */
    public float f230713n;

    /* renamed from: o, reason: collision with root package name */
    public float f230714o;

    /* renamed from: p, reason: collision with root package name */
    public int f230715p;

    /* renamed from: q, reason: collision with root package name */
    public float f230716q;

    /* renamed from: r, reason: collision with root package name */
    public int f230717r;

    /* renamed from: s, reason: collision with root package name */
    public int f230718s;

    /* renamed from: t, reason: collision with root package name */
    public int f230719t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f230720u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f230721v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 f230722w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x f230723x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f230724y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f230725z;

    public C16550xff5236a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230706d = android.graphics.Color.parseColor("#1AAD19");
        this.f230707e = android.graphics.Color.parseColor("#FFFFFF");
        this.f230708f = android.graphics.Color.parseColor("#FA5151");
        this.f230713n = 0.0f;
        this.f230714o = 0.0f;
        this.f230715p = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        this.f230716q = 0.0f;
        this.f230717r = 0;
        this.f230718s = 0;
        this.f230719t = 0;
        this.f230720u = false;
        this.f230724y = new java.util.ArrayList();
        this.f230725z = new java.util.ArrayList();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f230721v = context;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "reset");
        this.f230723x = null;
        this.f230717r = 0;
        this.f230718s = 100;
        this.f230719t = 0;
        this.f230720u = false;
        this.f230724y.clear();
        this.f230716q = 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var = this.f230722w;
        if (e2Var != null) {
            e2Var.f230852g = false;
            e2Var.f230849d = 0L;
            this.f230722w = null;
        }
        invalidate();
    }

    /* renamed from: getDrawWidth */
    public int m66960x7b72c2c() {
        return (int) this.f230709g.width();
    }

    /* renamed from: getSubProgress */
    public java.util.ArrayList<java.lang.Float> m66961xec84eb57() {
        return this.f230724y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float f17 = this.f230714o;
        canvas.translate(f17, f17);
        android.graphics.RectF rectF = this.f230709g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.A) {
            float f18 = 0.0f;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f230724y;
                if (i17 >= arrayList.size()) {
                    break;
                }
                if (this.B && i17 == arrayList.size() - 1) {
                    canvas.drawArc(this.f230709g, ((f18 / this.f230718s) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f230718s) * 360.0f, false, this.f230712m);
                } else {
                    canvas.drawArc(this.f230709g, ((f18 / this.f230718s) * 360.0f) + 90.0f, ((((java.lang.Float) arrayList.get(i17)).floatValue() - f18) / this.f230718s) * 360.0f, false, this.f230710h);
                }
                float floatValue = ((java.lang.Float) arrayList.get(i17)).floatValue();
                android.graphics.RectF rectF2 = this.f230709g;
                float f19 = this.f230718s;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f19) * 360.0f) + 90.0f, (0.85f / f19) * 360.0f, false, this.f230711i);
                i17++;
                f18 = floatValue;
            }
            int i18 = this.f230718s;
            if (i18 > 0) {
                float f27 = i18;
                canvas.drawArc(this.f230709g, ((f18 / f27) * 360.0f) + 90.0f, ((this.f230716q - f18) / f27) * 360.0f, false, this.f230710h);
            }
        } else {
            canvas.drawArc(this.f230709g, 90.0f, (this.f230716q / this.f230718s) * 360.0f, false, this.f230710h);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.C) {
            return;
        }
        this.C = true;
        float width = getWidth();
        float dimensionPixelSize = this.f230721v.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562101a61);
        this.f230713n = dimensionPixelSize;
        this.f230714o = dimensionPixelSize / 2.0f;
        float f17 = this.f230714o;
        float f18 = width - f17;
        this.f230709g = new android.graphics.RectF(f17, f17, f18, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230710h = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f230710h.setStrokeWidth(this.f230713n);
        this.f230710h.setColor(this.f230706d);
        this.f230710h.setAlpha(this.f230715p);
        this.f230710h.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f230711i = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f230711i.setStrokeWidth(this.f230713n);
        this.f230711i.setColor(this.f230707e);
        this.f230711i.setAlpha(this.f230715p);
        this.f230711i.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f230712m = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f230712m.setStrokeWidth(this.f230713n);
        this.f230712m.setColor(this.f230708f);
        this.f230712m.setAntiAlias(true);
    }

    /* renamed from: setCircularColor */
    public void m66962xe2eba6c2(int i17) {
        this.f230706d = i17;
        this.f230715p = 255;
        android.graphics.Paint paint = this.f230710h;
        if (paint == null || i17 == 0) {
            return;
        }
        paint.setColor(i17);
    }

    /* renamed from: setDuration */
    public void m66963xffd6ec16(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", java.lang.Integer.valueOf(i17));
        this.f230719t = i17;
    }

    /* renamed from: setEnableSubProgress */
    public void m66964x8ffc3ac8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    /* renamed from: setInitProgress */
    public void m66965xe2ae08df(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f230720u));
        if (this.f230720u) {
            return;
        }
        this.f230717r = i17;
    }

    /* renamed from: setMaxProgress */
    public void m66966xadb2e1ef(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", java.lang.Integer.valueOf(i17));
        this.f230718s = i17;
    }

    /* renamed from: setProgressCallback */
    public void m66967x61e5c614(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x xVar) {
        this.f230723x = xVar;
    }

    public C16550xff5236a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230706d = android.graphics.Color.parseColor("#1AAD19");
        this.f230707e = android.graphics.Color.parseColor("#FFFFFF");
        this.f230708f = android.graphics.Color.parseColor("#FA5151");
        this.f230713n = 0.0f;
        this.f230714o = 0.0f;
        this.f230715p = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        this.f230716q = 0.0f;
        this.f230717r = 0;
        this.f230718s = 0;
        this.f230719t = 0;
        this.f230720u = false;
        this.f230724y = new java.util.ArrayList();
        this.f230725z = new java.util.ArrayList();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f230721v = context;
    }
}
