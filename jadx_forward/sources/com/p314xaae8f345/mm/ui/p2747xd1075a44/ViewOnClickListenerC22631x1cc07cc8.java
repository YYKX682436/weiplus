package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMSwitchBtn */
/* loaded from: classes10.dex */
public class ViewOnClickListenerC22631x1cc07cc8 extends android.view.View implements android.view.View.OnClickListener {
    public static final /* synthetic */ int Q = 0;
    public final android.graphics.RectF A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Vibrator f292878J;
    public final android.content.Context K;
    public boolean L;
    public final al5.f2 M;
    public al5.c2 N;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public float f292879d;

    /* renamed from: e, reason: collision with root package name */
    public float f292880e;

    /* renamed from: f, reason: collision with root package name */
    public long f292881f;

    /* renamed from: g, reason: collision with root package name */
    public int f292882g;

    /* renamed from: h, reason: collision with root package name */
    public int f292883h;

    /* renamed from: i, reason: collision with root package name */
    public int f292884i;

    /* renamed from: m, reason: collision with root package name */
    public int f292885m;

    /* renamed from: n, reason: collision with root package name */
    public int f292886n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f292887o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f292888p;

    /* renamed from: q, reason: collision with root package name */
    public int f292889q;

    /* renamed from: r, reason: collision with root package name */
    public int f292890r;

    /* renamed from: s, reason: collision with root package name */
    public float f292891s;

    /* renamed from: t, reason: collision with root package name */
    public float f292892t;

    /* renamed from: u, reason: collision with root package name */
    public int f292893u;

    /* renamed from: v, reason: collision with root package name */
    public int f292894v;

    /* renamed from: w, reason: collision with root package name */
    public int f292895w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f292896x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f292897y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF f292898z;

    public ViewOnClickListenerC22631x1cc07cc8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292887o = false;
        this.f292888p = false;
        this.f292896x = false;
        this.f292897y = new android.graphics.Paint(1);
        this.f292898z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
        e(context, attributeSet);
    }

    public final void a(boolean z17) {
        android.os.Vibrator vibrator = this.f292878J;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        boolean z18 = this.L;
        al5.f2 f2Var = this.M;
        if (!z18) {
            this.f292896x = z17;
            this.f292887o = false;
            f2Var.reset();
            f2Var.f87436d = z17 ? 1 : 0;
            f();
            invalidate();
            al5.c2 c2Var = this.N;
            if (c2Var != null) {
                c2Var.mo2289xd6191dc1(this.f292896x);
                return;
            }
            return;
        }
        this.f292887o = true;
        f2Var.reset();
        android.graphics.RectF rectF = this.A;
        if (z17) {
            f2Var.f87438f = (this.f292883h - rectF.left) + this.f292890r;
            f2Var.f87436d = 1;
        } else {
            f2Var.f87438f = rectF.left;
            f2Var.f87436d = 0;
        }
        f2Var.f87437e = rectF.left;
        f2Var.setDuration((f2Var.f87438f * 150) / this.f292883h);
        startAnimation(f2Var);
    }

    public final void b(boolean z17) {
        android.graphics.RectF rectF = this.A;
        float f17 = rectF.left;
        int i17 = this.f292890r;
        if (f17 < i17) {
            rectF.left = i17;
        }
        float f18 = this.f292883h + i17;
        if (z17) {
            f18 -= getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
        }
        if (rectF.left > f18) {
            rectF.left = f18;
        }
        if (this.G) {
            rectF.right = rectF.left + ((int) (this.f292892t * 2.0f));
        } else {
            rectF.right = rectF.left + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho);
        }
        float f19 = this.f292884i - this.f292890r;
        if (rectF.right > f19) {
            rectF.right = f19;
        }
    }

    public final void c() {
        this.f292890r = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f292891s = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahm) / 2.0f;
        this.f292892t = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn) / 2.0f;
        this.f292893u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahe);
        this.f292894v = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adn);
        this.f292895w = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ado);
        getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adn);
        this.C = this.f292895w;
        this.B = this.f292894v;
        this.D = this.f292893u;
        this.f292889q = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnClickListener(this);
        this.f292878J = (android.os.Vibrator) this.K.getSystemService("vibrator");
    }

    public boolean d() {
        return this.f292896x;
    }

    public final void e(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544640n);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yl5.a.f544630d);
        this.C = obtainStyledAttributes.getColor(2, this.f292895w);
        this.B = obtainStyledAttributes.getColor(0, this.f292894v);
        this.D = obtainStyledAttributes.getColor(4, this.f292893u);
        this.E = obtainStyledAttributes.getString(3);
        this.F = obtainStyledAttributes.getString(1);
        this.H = obtainStyledAttributes2.getBoolean(0, false);
        this.I = obtainStyledAttributes2.getBoolean(1, true);
        this.f292896x = this.H;
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    public final void f() {
        int i17 = this.f292886n;
        int i18 = this.f292885m;
        android.graphics.RectF rectF = this.A;
        if (i17 < i18) {
            float f17 = ((i18 - i17) / 2) + this.f292890r;
            rectF.top = f17;
            rectF.bottom = (f17 + i17) - (r3 * 2);
        } else {
            rectF.top = this.f292890r;
            rectF.bottom = i18 - r0;
        }
        if (this.f292896x) {
            float f18 = this.f292884i - this.f292890r;
            rectF.right = f18;
            rectF.left = f18 - (this.f292892t * 2.0f);
        } else {
            rectF.left = this.f292890r;
            rectF.right = ((int) (this.f292892t * 2.0f)) + r0;
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.I;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a(!this.f292896x);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f292888p = false;
        yj0.a.h(this, "com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean isEnabled = isEnabled();
        android.graphics.RectF rectF = this.A;
        android.graphics.RectF rectF2 = this.f292898z;
        android.graphics.Paint paint = this.f292897y;
        if (isEnabled) {
            int i17 = this.B;
            paint.setAlpha(255);
            paint.setColor(i17);
            float f17 = this.f292891s;
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            paint.setColor(this.C);
            paint.setAlpha(java.lang.Math.min(255, (int) (((rectF.left - this.f292890r) / this.f292883h) * 255.0f)));
            float f18 = this.f292891s;
            canvas.drawRoundRect(rectF2, f18, f18, paint);
        } else {
            paint.setColor(this.f292896x ? this.C : this.B);
            paint.setAlpha(this.f292896x ? 76 : 7);
            float f19 = this.f292891s;
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
        paint.setColor(this.D);
        float f27 = this.f292892t;
        canvas.drawRoundRect(rectF, f27, f27, paint);
        if (this.E == null || this.F == null) {
            return;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        paint2.setAntiAlias(true);
        int min = java.lang.Math.min(255, (int) (((rectF.left - this.f292890r) / this.f292883h) * 255.0f));
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String str = this.E;
        paint2.getTextBounds(str, 0, str.length(), rect);
        paint2.setAlpha(min);
        float a17 = (((rectF2.left + rectF2.right) / 2.0f) - this.f292892t) + com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        float height = (((rectF2.top + rectF2.bottom) / 2.0f) + (rect.height() / 2.0f)) - com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        canvas.drawText(this.E, a17, height, paint2);
        float a18 = (((rectF2.left + rectF2.right) / 2.0f) + this.f292892t) - com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        paint2.setAlpha(255 - min);
        canvas.drawText(this.F, a18, height, paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f292884i = i19 - i17;
        this.f292885m = i27 - i18;
        float min = java.lang.Math.min((java.lang.Math.min(r5, r4) - (this.f292890r * 2)) / 2, this.f292892t);
        this.f292892t = min;
        int i28 = (this.f292884i - ((int) (min * 2.0f))) - (this.f292890r * 2);
        this.f292883h = i28;
        this.f292882g = i28 / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561467je);
        this.f292886n = dimensionPixelSize;
        int i29 = this.f292885m;
        android.graphics.RectF rectF = this.f292898z;
        if (dimensionPixelSize < i29) {
            float f17 = (i29 - dimensionPixelSize) / 2;
            rectF.top = f17;
            rectF.bottom = f17 + dimensionPixelSize;
        } else {
            rectF.top = 0.0f;
            rectF.bottom = i29;
        }
        rectF.left = 0.0f;
        rectF.right = this.f292884i;
        f();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f292897y;
        paint.setStyle(style);
        paint.setColor(this.f292894v);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f292887o || !isEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        android.graphics.RectF rectF = this.A;
        boolean z17 = false;
        if (action == 0) {
            clearAnimation();
            this.f292879d = motionEvent.getX();
            this.f292880e = motionEvent.getY();
            this.f292881f = android.os.SystemClock.elapsedRealtime();
            this.f292888p = false;
            if (this.f292896x) {
                rectF.left -= getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
            } else {
                rectF.right += getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
            }
            invalidate();
        } else if (action == 1) {
            if (android.os.SystemClock.elapsedRealtime() - this.f292881f < 300) {
                this.G = true;
            } else if (this.f292896x) {
                this.G = true;
            } else {
                this.G = false;
            }
            a(!this.f292896x);
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f292888p = false;
        } else if (action == 2) {
            if (this.f292888p) {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                rectF.left += motionEvent.getX() - this.f292879d;
                this.G = false;
                b(true);
            } else {
                float x17 = motionEvent.getX() - this.f292879d;
                float y17 = motionEvent.getY() - this.f292880e;
                if (java.lang.Math.abs(x17) >= this.f292889q / 10.0f) {
                    if (y17 == 0.0f) {
                        y17 = 1.0f;
                    }
                    if (java.lang.Math.abs(x17 / y17) > 3.0f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    this.f292888p = true;
                    android.view.ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            this.f292879d = motionEvent.getX();
            this.f292880e = motionEvent.getY();
        } else if (action == 3) {
            this.G = true;
            if (rectF.left > this.f292882g) {
                a(true);
            } else {
                a(false);
            }
            android.view.ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            this.f292888p = false;
        }
        if (this.f292888p) {
            invalidate();
        }
        return true;
    }

    /* renamed from: setCheck */
    public void m81392x52cfa5c6(boolean z17) {
        if (this.f292896x != z17) {
            clearAnimation();
            this.f292896x = z17;
            f();
            this.f292887o = false;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.I = z17;
    }

    /* renamed from: setOffColor */
    public void m81393x46e33db6(int i17) {
        this.B = i17;
    }

    /* renamed from: setRemoveAnimateEndPost */
    public void m81394xabebbf20(boolean z17) {
        this.P = z17;
    }

    /* renamed from: setSlideAnimationEnabled */
    public void m81395xcb764fac(boolean z17) {
        if (this.L != z17) {
            this.L = z17;
            if (z17) {
                return;
            }
            if (this.f292887o) {
                this.f292896x = this.M.f87436d == 1;
            }
            clearAnimation();
            f();
            this.f292887o = false;
            invalidate();
        }
    }

    /* renamed from: setSwitchListener */
    public void m81396xb3e0a10a(al5.c2 c2Var) {
        this.N = c2Var;
    }

    public ViewOnClickListenerC22631x1cc07cc8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292887o = false;
        this.f292888p = false;
        this.f292896x = false;
        this.f292897y = new android.graphics.Paint(1);
        this.f292898z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
        e(context, attributeSet);
    }

    public ViewOnClickListenerC22631x1cc07cc8(android.content.Context context) {
        super(context);
        this.f292887o = false;
        this.f292888p = false;
        this.f292896x = false;
        this.f292897y = new android.graphics.Paint(1);
        this.f292898z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
    }
}
