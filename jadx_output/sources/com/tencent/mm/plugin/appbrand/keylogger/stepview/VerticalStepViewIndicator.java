package com.tencent.mm.plugin.appbrand.keylogger.stepview;

/* loaded from: classes5.dex */
public class VerticalStepViewIndicator extends android.view.View {
    public lg1.d A;
    public android.graphics.Rect B;
    public int C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final int f84180d;

    /* renamed from: e, reason: collision with root package name */
    public float f84181e;

    /* renamed from: f, reason: collision with root package name */
    public float f84182f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f84183g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f84184h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f84185i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f84186m;

    /* renamed from: n, reason: collision with root package name */
    public float f84187n;

    /* renamed from: o, reason: collision with root package name */
    public float f84188o;

    /* renamed from: p, reason: collision with root package name */
    public float f84189p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f84190q;

    /* renamed from: r, reason: collision with root package name */
    public float f84191r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f84192s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f84193t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f84194u;

    /* renamed from: v, reason: collision with root package name */
    public int f84195v;

    /* renamed from: w, reason: collision with root package name */
    public int f84196w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.PathEffect f84197x;

    /* renamed from: y, reason: collision with root package name */
    public int f84198y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.Path f84199z;

    public VerticalStepViewIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public java.util.List<java.lang.Float> getCircleCenterPointPositionList() {
        return this.f84192s;
    }

    public float getCircleRadius() {
        return this.f84182f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        lg1.d dVar = this.A;
        if (dVar != null) {
            ((com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView) dVar).a();
        }
        this.f84193t.setColor(this.f84195v);
        this.f84194u.setColor(this.f84196w);
        int i17 = 0;
        while (i17 < ((java.util.ArrayList) this.f84192s).size() - 1) {
            float floatValue = ((java.lang.Float) ((java.util.ArrayList) this.f84192s).get(i17)).floatValue();
            int i18 = i17 + 1;
            float floatValue2 = ((java.lang.Float) ((java.util.ArrayList) this.f84192s).get(i18)).floatValue();
            if (i17 < this.f84198y) {
                if (this.D) {
                    float f17 = this.f84188o;
                    float f18 = this.f84182f;
                    canvas.drawRect(f17, (floatValue2 + f18) - 10.0f, this.f84189p, (floatValue - f18) + 10.0f, this.f84194u);
                } else {
                    float f19 = this.f84188o;
                    float f27 = this.f84182f;
                    canvas.drawRect(f19, (floatValue + f27) - 10.0f, this.f84189p, (floatValue2 - f27) + 10.0f, this.f84194u);
                }
            } else if (this.D) {
                this.f84199z.moveTo(this.f84187n, floatValue2 + this.f84182f);
                this.f84199z.lineTo(this.f84187n, floatValue - this.f84182f);
                canvas.drawPath(this.f84199z, this.f84193t);
            } else {
                this.f84199z.moveTo(this.f84187n, floatValue + this.f84182f);
                this.f84199z.lineTo(this.f84187n, floatValue2 - this.f84182f);
                canvas.drawPath(this.f84199z, this.f84193t);
            }
            i17 = i18;
        }
        for (int i19 = 0; i19 < ((java.util.ArrayList) this.f84192s).size(); i19++) {
            float floatValue3 = ((java.lang.Float) ((java.util.ArrayList) this.f84192s).get(i19)).floatValue();
            float f28 = this.f84187n;
            float f29 = this.f84182f;
            this.B = new android.graphics.Rect((int) (f28 - f29), (int) (floatValue3 - f29), (int) (f28 + f29), (int) (floatValue3 + f29));
            int i27 = ((lg1.b) this.f84190q.get(i19)).f318553b;
            if (i27 == 0) {
                this.f84183g.setBounds(this.B);
                this.f84183g.draw(canvas);
            } else if (i27 == 2) {
                this.f84184h.setBounds(this.B);
                this.f84184h.draw(canvas);
            } else if (i27 == -2) {
                this.f84185i.setBounds(this.B);
                this.f84185i.draw(canvas);
            } else {
                this.f84186m.setBounds(this.B);
                this.f84186m.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.C = 0;
        int size = this.f84190q.size();
        if (size > 0) {
            this.C = (int) (getPaddingTop() + getPaddingBottom() + (this.f84182f * 2.0f * size) + ((size - 1) * this.f84191r));
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int i19 = this.f84180d;
        if (mode != 0) {
            i19 = java.lang.Math.min(i19, android.view.View.MeasureSpec.getSize(i17));
        }
        setMeasuredDimension(i19, this.C);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float width = getWidth() / 2;
        this.f84187n = width;
        float f17 = this.f84181e;
        this.f84188o = width - (f17 / 2.0f);
        this.f84189p = width + (f17 / 2.0f);
        for (int i28 = 0; i28 < this.f84190q.size(); i28++) {
            if (this.D) {
                java.util.List list = this.f84192s;
                float f18 = this.C;
                float f19 = this.f84182f;
                float f27 = i28;
                ((java.util.ArrayList) list).add(java.lang.Float.valueOf(f18 - ((f19 + ((f27 * f19) * 2.0f)) + (f27 * this.f84191r))));
            } else {
                java.util.List list2 = this.f84192s;
                float f28 = this.f84182f;
                float f29 = i28;
                ((java.util.ArrayList) list2).add(java.lang.Float.valueOf(f28 + (f29 * f28 * 2.0f) + (f29 * this.f84191r)));
            }
        }
        lg1.d dVar = this.A;
        if (dVar != null) {
            ((com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView) dVar).a();
        }
    }

    public void setAttentionIcon(android.graphics.drawable.Drawable drawable) {
        this.f84184h = drawable;
    }

    public void setComplectingPosition(int i17) {
        this.f84198y = i17;
        requestLayout();
    }

    public void setCompleteIcon(android.graphics.drawable.Drawable drawable) {
        this.f84183g = drawable;
    }

    public void setCompletedLineColor(int i17) {
        this.f84196w = i17;
    }

    public void setDefaultIcon(android.graphics.drawable.Drawable drawable) {
        this.f84185i = drawable;
    }

    public void setIndicatorLinePaddingProportion(float f17) {
        this.f84191r = f17 * this.f84180d;
    }

    public void setOnDrawListener(lg1.d dVar) {
        this.A = dVar;
    }

    public void setSteps(java.util.List<lg1.b> list) {
        if (list == null) {
            this.f84190q = new java.util.ArrayList();
        } else {
            this.f84190q = list;
            requestLayout();
        }
    }

    public void setUnCompletedLineColor(int i17) {
        this.f84195v = i17;
    }

    public VerticalStepViewIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        this.f84180d = applyDimension;
        this.f84190q = new java.util.ArrayList();
        this.f84195v = b3.l.getColor(getContext(), com.tencent.mm.R.color.a9q);
        this.f84196w = -1;
        this.f84199z = new android.graphics.Path();
        this.f84197x = new android.graphics.DashPathEffect(new float[]{8.0f, 8.0f, 8.0f, 8.0f}, 1.0f);
        this.f84192s = new java.util.ArrayList();
        this.f84193t = new android.graphics.Paint();
        this.f84194u = new android.graphics.Paint();
        this.f84193t.setAntiAlias(true);
        this.f84193t.setColor(this.f84195v);
        this.f84193t.setStyle(android.graphics.Paint.Style.STROKE);
        this.f84193t.setStrokeWidth(2.0f);
        this.f84194u.setAntiAlias(true);
        this.f84194u.setColor(this.f84196w);
        this.f84194u.setStyle(android.graphics.Paint.Style.STROKE);
        this.f84194u.setStrokeWidth(2.0f);
        this.f84193t.setPathEffect(this.f84197x);
        this.f84194u.setStyle(android.graphics.Paint.Style.FILL);
        float f17 = applyDimension;
        this.f84181e = 0.05f * f17;
        this.f84182f = 0.28f * f17;
        this.f84191r = f17 * 0.85f;
        this.f84183g = b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.bru);
        this.f84184h = b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.brs);
        this.f84185i = b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.brv);
        this.f84186m = b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.brt);
        this.D = true;
    }
}
