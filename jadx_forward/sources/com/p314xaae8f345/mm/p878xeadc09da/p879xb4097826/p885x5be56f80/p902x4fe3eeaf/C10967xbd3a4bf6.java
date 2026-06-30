package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0006\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/SectionSeekBar;", "Landroid/view/View;", "Lkotlin/Function2;", "", "Ljz5/f0;", "callback", "setOnProgressChanged", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.SectionSeekBar */
/* loaded from: classes5.dex */
public final class C10967xbd3a4bf6 extends android.view.View {
    public final int A;
    public int B;
    public yz5.p C;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f150982d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f150983e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f150984f;

    /* renamed from: g, reason: collision with root package name */
    public final float f150985g;

    /* renamed from: h, reason: collision with root package name */
    public final float f150986h;

    /* renamed from: i, reason: collision with root package name */
    public final float f150987i;

    /* renamed from: m, reason: collision with root package name */
    public final float f150988m;

    /* renamed from: n, reason: collision with root package name */
    public final int f150989n;

    /* renamed from: o, reason: collision with root package name */
    public final float f150990o;

    /* renamed from: p, reason: collision with root package name */
    public final float f150991p;

    /* renamed from: q, reason: collision with root package name */
    public final int f150992q;

    /* renamed from: r, reason: collision with root package name */
    public final int f150993r;

    /* renamed from: s, reason: collision with root package name */
    public final int f150994s;

    /* renamed from: t, reason: collision with root package name */
    public final int f150995t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150996u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f150997v;

    /* renamed from: w, reason: collision with root package name */
    public float f150998w;

    /* renamed from: x, reason: collision with root package name */
    public float f150999x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String[] f151000y;

    /* renamed from: z, reason: collision with root package name */
    public int f151001z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10967xbd3a4bf6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(int i17) {
        java.lang.String[] strArr = this.f151000y;
        int i18 = this.A;
        int length = strArr.length;
        if (i18 > 0) {
            length = java.lang.Math.min(i18, length);
        }
        int max = java.lang.Math.max(java.lang.Math.min(length - 1, i17), 0);
        if (max == this.f151001z) {
            return;
        }
        this.f151001z = max;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f150999x == 0.0f) {
            return;
        }
        android.graphics.Paint paint = this.f150982d;
        paint.setColor(-16777216);
        android.graphics.Paint paint2 = this.f150983e;
        android.graphics.Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fontMetrics, "getFontMetrics(...)");
        float f17 = fontMetrics.bottom;
        float f18 = 2;
        float f19 = ((f17 - fontMetrics.top) / f18) - f17;
        java.lang.String[] strArr = this.f151000y;
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            float f27 = this.f150990o;
            int i19 = this.f150989n;
            int i27 = this.f150993r;
            android.graphics.RectF rectF = this.f150984f;
            if (i17 >= length) {
                paint.setColor(i27);
                float f28 = 4;
                rectF.left = (this.f150999x / f18) - ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f28));
                rectF.right = (getWidth() - (this.f150999x / f18)) + ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f28));
                float f29 = rectF.bottom + i19;
                float f37 = this.f150991p;
                float f38 = f29 + f37;
                rectF.top = f38;
                rectF.bottom = f38 + this.f150985g;
                canvas.drawRoundRect(rectF, f27, f27, paint);
                paint.setColor(this.f150994s);
                canvas.drawCircle(this.f150999x * (this.f151001z + 0.5f), rectF.centerY(), f37, paint);
                return;
            }
            java.lang.String str = strArr[i17];
            int i28 = i18 + 1;
            int i29 = this.f151001z;
            java.lang.String[] strArr2 = strArr;
            int i37 = this.f150995t;
            paint.setColor(i29 == i18 ? i37 : i27);
            if (this.f151001z != i18) {
                i37 = this.f150992q;
            }
            paint2.setColor(i37);
            int i38 = this.A;
            if (1 <= i38 && i38 <= i18) {
                paint2.setColor(i27);
            }
            float f39 = this.f150986h;
            float f47 = i18 + 0.5f;
            canvas.drawText(str, this.f150999x * f47, (f39 / f18) + f19, paint2);
            float f48 = f39 + i19;
            rectF.top = f48;
            rectF.bottom = f48 + this.f150988m;
            float f49 = this.f150999x * f47;
            float f57 = this.f150987i;
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
            int i19 = this.f150989n;
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), (int) (this.f150986h + i19 + this.f150988m + i19 + (this.f150991p * 2) + i19));
        } else {
            super.onMeasure(i17, i18);
        }
        this.f150999x = getMeasuredWidth() / this.f151000y.length;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.p pVar;
        yz5.p pVar2;
        if (this.f150999x == 0.0f) {
            return super.onTouchEvent(motionEvent);
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            float x17 = motionEvent.getX();
            this.f150998w = x17;
            boolean z17 = java.lang.Math.abs(x17 - ((((float) this.f151001z) + 0.5f) * this.f150999x)) < this.f150999x / ((float) 2);
            this.f150996u = z17;
            this.f150997v = !z17;
            this.B = this.f151001z;
            if (z17) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            float x18 = motionEvent.getX() - this.f150998w;
            if (this.f150996u) {
                if (java.lang.Math.abs(x18) >= this.f150999x * 0.25f) {
                    float x19 = (motionEvent.getX() / this.f150999x) - 0.5f;
                    int round = java.lang.Math.round(x19);
                    if (java.lang.Math.abs(x19 - round) >= 0.3f) {
                        round = this.f151001z;
                    }
                    a(round);
                }
            } else if (this.f150997v) {
                this.f150997v = java.lang.Math.abs(x18) < ((float) ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * ((float) 4))));
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            int i17 = this.B;
            int i18 = this.f151001z;
            if (i17 != i18 && (pVar2 = this.C) != null) {
                pVar2.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.B));
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f150997v) {
                float f17 = (this.f150998w / this.f150999x) - 0.5f;
                int round2 = java.lang.Math.round(f17);
                if (java.lang.Math.abs(f17 - round2) >= 0.3f) {
                    round2 = this.f151001z;
                }
                int i19 = this.A;
                if (i19 <= 0 || round2 < i19) {
                    a(round2);
                }
            }
            int i27 = this.B;
            int i28 = this.f151001z;
            if (i27 != i28 && (pVar = this.C) != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.B));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setOnProgressChanged */
    public final void m47263xc4b7bfa6(yz5.p pVar) {
        this.C = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10967xbd3a4bf6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150982d = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f150983e = paint;
        this.f150984f = new android.graphics.RectF();
        this.f150985g = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 1);
        this.f150986h = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 16);
        this.f150987i = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 4);
        this.f150988m = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 5);
        this.f150989n = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8);
        this.f150990o = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 2);
        this.f150991p = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * r0);
        this.f150992q = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ada);
        this.f150993r = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ad_);
        this.f150994s = -1;
        this.f150995t = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ad9);
        this.f151000y = new java.lang.String[0];
        this.A = 2;
        paint.setTextSize(android.util.TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
    }
}
