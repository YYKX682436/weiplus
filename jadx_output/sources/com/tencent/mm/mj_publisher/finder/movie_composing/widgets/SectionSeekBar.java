package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0006\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/SectionSeekBar;", "Landroid/view/View;", "Lkotlin/Function2;", "", "Ljz5/f0;", "callback", "setOnProgressChanged", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SectionSeekBar extends android.view.View {
    public final int A;
    public int B;
    public yz5.p C;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f69449d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f69450e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f69451f;

    /* renamed from: g, reason: collision with root package name */
    public final float f69452g;

    /* renamed from: h, reason: collision with root package name */
    public final float f69453h;

    /* renamed from: i, reason: collision with root package name */
    public final float f69454i;

    /* renamed from: m, reason: collision with root package name */
    public final float f69455m;

    /* renamed from: n, reason: collision with root package name */
    public final int f69456n;

    /* renamed from: o, reason: collision with root package name */
    public final float f69457o;

    /* renamed from: p, reason: collision with root package name */
    public final float f69458p;

    /* renamed from: q, reason: collision with root package name */
    public final int f69459q;

    /* renamed from: r, reason: collision with root package name */
    public final int f69460r;

    /* renamed from: s, reason: collision with root package name */
    public final int f69461s;

    /* renamed from: t, reason: collision with root package name */
    public final int f69462t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f69463u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f69464v;

    /* renamed from: w, reason: collision with root package name */
    public float f69465w;

    /* renamed from: x, reason: collision with root package name */
    public float f69466x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String[] f69467y;

    /* renamed from: z, reason: collision with root package name */
    public int f69468z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectionSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(int i17) {
        java.lang.String[] strArr = this.f69467y;
        int i18 = this.A;
        int length = strArr.length;
        if (i18 > 0) {
            length = java.lang.Math.min(i18, length);
        }
        int max = java.lang.Math.max(java.lang.Math.min(length - 1, i17), 0);
        if (max == this.f69468z) {
            return;
        }
        this.f69468z = max;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f69466x == 0.0f) {
            return;
        }
        android.graphics.Paint paint = this.f69449d;
        paint.setColor(-16777216);
        android.graphics.Paint paint2 = this.f69450e;
        android.graphics.Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        kotlin.jvm.internal.o.f(fontMetrics, "getFontMetrics(...)");
        float f17 = fontMetrics.bottom;
        float f18 = 2;
        float f19 = ((f17 - fontMetrics.top) / f18) - f17;
        java.lang.String[] strArr = this.f69467y;
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            float f27 = this.f69457o;
            int i19 = this.f69456n;
            int i27 = this.f69460r;
            android.graphics.RectF rectF = this.f69451f;
            if (i17 >= length) {
                paint.setColor(i27);
                float f28 = 4;
                rectF.left = (this.f69466x / f18) - ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f28));
                rectF.right = (getWidth() - (this.f69466x / f18)) + ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f28));
                float f29 = rectF.bottom + i19;
                float f37 = this.f69458p;
                float f38 = f29 + f37;
                rectF.top = f38;
                rectF.bottom = f38 + this.f69452g;
                canvas.drawRoundRect(rectF, f27, f27, paint);
                paint.setColor(this.f69461s);
                canvas.drawCircle(this.f69466x * (this.f69468z + 0.5f), rectF.centerY(), f37, paint);
                return;
            }
            java.lang.String str = strArr[i17];
            int i28 = i18 + 1;
            int i29 = this.f69468z;
            java.lang.String[] strArr2 = strArr;
            int i37 = this.f69462t;
            paint.setColor(i29 == i18 ? i37 : i27);
            if (this.f69468z != i18) {
                i37 = this.f69459q;
            }
            paint2.setColor(i37);
            int i38 = this.A;
            if (1 <= i38 && i38 <= i18) {
                paint2.setColor(i27);
            }
            float f39 = this.f69453h;
            float f47 = i18 + 0.5f;
            canvas.drawText(str, this.f69466x * f47, (f39 / f18) + f19, paint2);
            float f48 = f39 + i19;
            rectF.top = f48;
            rectF.bottom = f48 + this.f69455m;
            float f49 = this.f69466x * f47;
            float f57 = this.f69454i;
            float f58 = f49 - (f57 / f18);
            rectF.left = f58;
            rectF.right = f58 + (f57 / f18);
            canvas.drawRoundRect(rectF, f27, f27, paint);
            i17++;
            i18 = i28;
            strArr = strArr2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE) {
            int i19 = this.f69456n;
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), (int) (this.f69453h + i19 + this.f69455m + i19 + (this.f69458p * 2) + i19));
        } else {
            super.onMeasure(i17, i18);
        }
        this.f69466x = getMeasuredWidth() / this.f69467y.length;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.p pVar;
        yz5.p pVar2;
        if (this.f69466x == 0.0f) {
            return super.onTouchEvent(motionEvent);
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            float x17 = motionEvent.getX();
            this.f69465w = x17;
            boolean z17 = java.lang.Math.abs(x17 - ((((float) this.f69468z) + 0.5f) * this.f69466x)) < this.f69466x / ((float) 2);
            this.f69463u = z17;
            this.f69464v = !z17;
            this.B = this.f69468z;
            if (z17) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            float x18 = motionEvent.getX() - this.f69465w;
            if (this.f69463u) {
                if (java.lang.Math.abs(x18) >= this.f69466x * 0.25f) {
                    float x19 = (motionEvent.getX() / this.f69466x) - 0.5f;
                    int round = java.lang.Math.round(x19);
                    if (java.lang.Math.abs(x19 - round) >= 0.3f) {
                        round = this.f69468z;
                    }
                    a(round);
                }
            } else if (this.f69464v) {
                this.f69464v = java.lang.Math.abs(x18) < ((float) ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * ((float) 4))));
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            int i17 = this.B;
            int i18 = this.f69468z;
            if (i17 != i18 && (pVar2 = this.C) != null) {
                pVar2.invoke(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.B));
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f69464v) {
                float f17 = (this.f69465w / this.f69466x) - 0.5f;
                int round2 = java.lang.Math.round(f17);
                if (java.lang.Math.abs(f17 - round2) >= 0.3f) {
                    round2 = this.f69468z;
                }
                int i19 = this.A;
                if (i19 <= 0 || round2 < i19) {
                    a(round2);
                }
            }
            int i27 = this.B;
            int i28 = this.f69468z;
            if (i27 != i28 && (pVar = this.C) != null) {
                pVar.invoke(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.B));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnProgressChanged(yz5.p pVar) {
        this.C = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69449d = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f69450e = paint;
        this.f69451f = new android.graphics.RectF();
        this.f69452g = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 1);
        this.f69453h = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16);
        this.f69454i = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4);
        this.f69455m = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 5);
        this.f69456n = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8);
        this.f69457o = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 2);
        this.f69458p = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * r0);
        this.f69459q = getResources().getColor(com.tencent.mm.R.color.ada);
        this.f69460r = getResources().getColor(com.tencent.mm.R.color.ad_);
        this.f69461s = -1;
        this.f69462t = getResources().getColor(com.tencent.mm.R.color.ad9);
        this.f69467y = new java.lang.String[0];
        this.A = 2;
        paint.setTextSize(android.util.TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
    }
}
