package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator */
/* loaded from: classes5.dex */
public class C12313xeff8b488 extends android.view.View {
    public lg1.d A;
    public android.graphics.Rect B;
    public int C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final int f165713d;

    /* renamed from: e, reason: collision with root package name */
    public float f165714e;

    /* renamed from: f, reason: collision with root package name */
    public float f165715f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f165716g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f165717h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f165718i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f165719m;

    /* renamed from: n, reason: collision with root package name */
    public float f165720n;

    /* renamed from: o, reason: collision with root package name */
    public float f165721o;

    /* renamed from: p, reason: collision with root package name */
    public float f165722p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f165723q;

    /* renamed from: r, reason: collision with root package name */
    public float f165724r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f165725s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f165726t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f165727u;

    /* renamed from: v, reason: collision with root package name */
    public int f165728v;

    /* renamed from: w, reason: collision with root package name */
    public int f165729w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.PathEffect f165730x;

    /* renamed from: y, reason: collision with root package name */
    public int f165731y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.Path f165732z;

    public C12313xeff8b488(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getCircleCenterPointPositionList */
    public java.util.List<java.lang.Float> m51587xf20f749c() {
        return this.f165725s;
    }

    /* renamed from: getCircleRadius */
    public float m51588xcee5cbf8() {
        return this.f165715f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        lg1.d dVar = this.A;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12312x14b5a947) dVar).a();
        }
        this.f165726t.setColor(this.f165728v);
        this.f165727u.setColor(this.f165729w);
        int i17 = 0;
        while (i17 < ((java.util.ArrayList) this.f165725s).size() - 1) {
            float floatValue = ((java.lang.Float) ((java.util.ArrayList) this.f165725s).get(i17)).floatValue();
            int i18 = i17 + 1;
            float floatValue2 = ((java.lang.Float) ((java.util.ArrayList) this.f165725s).get(i18)).floatValue();
            if (i17 < this.f165731y) {
                if (this.D) {
                    float f17 = this.f165721o;
                    float f18 = this.f165715f;
                    canvas.drawRect(f17, (floatValue2 + f18) - 10.0f, this.f165722p, (floatValue - f18) + 10.0f, this.f165727u);
                } else {
                    float f19 = this.f165721o;
                    float f27 = this.f165715f;
                    canvas.drawRect(f19, (floatValue + f27) - 10.0f, this.f165722p, (floatValue2 - f27) + 10.0f, this.f165727u);
                }
            } else if (this.D) {
                this.f165732z.moveTo(this.f165720n, floatValue2 + this.f165715f);
                this.f165732z.lineTo(this.f165720n, floatValue - this.f165715f);
                canvas.drawPath(this.f165732z, this.f165726t);
            } else {
                this.f165732z.moveTo(this.f165720n, floatValue + this.f165715f);
                this.f165732z.lineTo(this.f165720n, floatValue2 - this.f165715f);
                canvas.drawPath(this.f165732z, this.f165726t);
            }
            i17 = i18;
        }
        for (int i19 = 0; i19 < ((java.util.ArrayList) this.f165725s).size(); i19++) {
            float floatValue3 = ((java.lang.Float) ((java.util.ArrayList) this.f165725s).get(i19)).floatValue();
            float f28 = this.f165720n;
            float f29 = this.f165715f;
            this.B = new android.graphics.Rect((int) (f28 - f29), (int) (floatValue3 - f29), (int) (f28 + f29), (int) (floatValue3 + f29));
            int i27 = ((lg1.b) this.f165723q.get(i19)).f400086b;
            if (i27 == 0) {
                this.f165716g.setBounds(this.B);
                this.f165716g.draw(canvas);
            } else if (i27 == 2) {
                this.f165717h.setBounds(this.B);
                this.f165717h.draw(canvas);
            } else if (i27 == -2) {
                this.f165718i.setBounds(this.B);
                this.f165718i.draw(canvas);
            } else {
                this.f165719m.setBounds(this.B);
                this.f165719m.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.C = 0;
        int size = this.f165723q.size();
        if (size > 0) {
            this.C = (int) (getPaddingTop() + getPaddingBottom() + (this.f165715f * 2.0f * size) + ((size - 1) * this.f165724r));
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int i19 = this.f165713d;
        if (mode != 0) {
            i19 = java.lang.Math.min(i19, android.view.View.MeasureSpec.getSize(i17));
        }
        setMeasuredDimension(i19, this.C);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float width = getWidth() / 2;
        this.f165720n = width;
        float f17 = this.f165714e;
        this.f165721o = width - (f17 / 2.0f);
        this.f165722p = width + (f17 / 2.0f);
        for (int i28 = 0; i28 < this.f165723q.size(); i28++) {
            if (this.D) {
                java.util.List list = this.f165725s;
                float f18 = this.C;
                float f19 = this.f165715f;
                float f27 = i28;
                ((java.util.ArrayList) list).add(java.lang.Float.valueOf(f18 - ((f19 + ((f27 * f19) * 2.0f)) + (f27 * this.f165724r))));
            } else {
                java.util.List list2 = this.f165725s;
                float f28 = this.f165715f;
                float f29 = i28;
                ((java.util.ArrayList) list2).add(java.lang.Float.valueOf(f28 + (f29 * f28 * 2.0f) + (f29 * this.f165724r)));
            }
        }
        lg1.d dVar = this.A;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12312x14b5a947) dVar).a();
        }
    }

    /* renamed from: setAttentionIcon */
    public void m51589x426e3575(android.graphics.drawable.Drawable drawable) {
        this.f165717h = drawable;
    }

    /* renamed from: setComplectingPosition */
    public void m51590x124b7290(int i17) {
        this.f165731y = i17;
        requestLayout();
    }

    /* renamed from: setCompleteIcon */
    public void m51591x7ec62ad4(android.graphics.drawable.Drawable drawable) {
        this.f165716g = drawable;
    }

    /* renamed from: setCompletedLineColor */
    public void m51592x193759c6(int i17) {
        this.f165729w = i17;
    }

    /* renamed from: setDefaultIcon */
    public void m51593x562b3898(android.graphics.drawable.Drawable drawable) {
        this.f165718i = drawable;
    }

    /* renamed from: setIndicatorLinePaddingProportion */
    public void m51594x5b08242a(float f17) {
        this.f165724r = f17 * this.f165713d;
    }

    /* renamed from: setOnDrawListener */
    public void m51595x4ac79299(lg1.d dVar) {
        this.A = dVar;
    }

    /* renamed from: setSteps */
    public void m51596x53b693e5(java.util.List<lg1.b> list) {
        if (list == null) {
            this.f165723q = new java.util.ArrayList();
        } else {
            this.f165723q = list;
            requestLayout();
        }
    }

    /* renamed from: setUnCompletedLineColor */
    public void m51597x40bf17bf(int i17) {
        this.f165728v = i17;
    }

    public C12313xeff8b488(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        this.f165713d = applyDimension;
        this.f165723q = new java.util.ArrayList();
        this.f165728v = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9q);
        this.f165729w = -1;
        this.f165732z = new android.graphics.Path();
        this.f165730x = new android.graphics.DashPathEffect(new float[]{8.0f, 8.0f, 8.0f, 8.0f}, 1.0f);
        this.f165725s = new java.util.ArrayList();
        this.f165726t = new android.graphics.Paint();
        this.f165727u = new android.graphics.Paint();
        this.f165726t.setAntiAlias(true);
        this.f165726t.setColor(this.f165728v);
        this.f165726t.setStyle(android.graphics.Paint.Style.STROKE);
        this.f165726t.setStrokeWidth(2.0f);
        this.f165727u.setAntiAlias(true);
        this.f165727u.setColor(this.f165729w);
        this.f165727u.setStyle(android.graphics.Paint.Style.STROKE);
        this.f165727u.setStrokeWidth(2.0f);
        this.f165726t.setPathEffect(this.f165730x);
        this.f165727u.setStyle(android.graphics.Paint.Style.FILL);
        float f17 = applyDimension;
        this.f165714e = 0.05f * f17;
        this.f165715f = 0.28f * f17;
        this.f165724r = f17 * 0.85f;
        this.f165716g = b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.bru);
        this.f165717h = b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.brs);
        this.f165718i = b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.brv);
        this.f165719m = b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.brt);
        this.D = true;
    }
}
