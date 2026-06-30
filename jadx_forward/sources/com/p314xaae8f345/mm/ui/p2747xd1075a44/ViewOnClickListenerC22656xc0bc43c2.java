package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.WeSwitch */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC22656xc0bc43c2 extends android.view.View implements android.view.View.OnClickListener {
    public static final /* synthetic */ int N = 0;
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
    public android.os.Vibrator f293030J;
    public final android.content.Context K;
    public final al5.z4 L;
    public al5.w4 M;

    /* renamed from: d, reason: collision with root package name */
    public float f293031d;

    /* renamed from: e, reason: collision with root package name */
    public float f293032e;

    /* renamed from: f, reason: collision with root package name */
    public long f293033f;

    /* renamed from: g, reason: collision with root package name */
    public int f293034g;

    /* renamed from: h, reason: collision with root package name */
    public int f293035h;

    /* renamed from: i, reason: collision with root package name */
    public int f293036i;

    /* renamed from: m, reason: collision with root package name */
    public int f293037m;

    /* renamed from: n, reason: collision with root package name */
    public int f293038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f293039o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f293040p;

    /* renamed from: q, reason: collision with root package name */
    public int f293041q;

    /* renamed from: r, reason: collision with root package name */
    public int f293042r;

    /* renamed from: s, reason: collision with root package name */
    public float f293043s;

    /* renamed from: t, reason: collision with root package name */
    public float f293044t;

    /* renamed from: u, reason: collision with root package name */
    public int f293045u;

    /* renamed from: v, reason: collision with root package name */
    public int f293046v;

    /* renamed from: w, reason: collision with root package name */
    public int f293047w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f293048x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f293049y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF f293050z;

    public ViewOnClickListenerC22656xc0bc43c2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293039o = false;
        this.f293040p = false;
        this.f293048x = false;
        this.f293049y = new android.graphics.Paint(1);
        this.f293050z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = new al5.z4(this, null);
        this.K = context;
        c();
        d(context, attributeSet);
    }

    public final void a(boolean z17) {
        android.os.Vibrator vibrator = this.f293030J;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        this.f293039o = true;
        al5.z4 z4Var = this.L;
        z4Var.reset();
        android.graphics.RectF rectF = this.A;
        if (z17) {
            z4Var.f87641f = (this.f293035h - rectF.left) + this.f293042r;
            z4Var.f87639d = 1;
        } else {
            z4Var.f87641f = rectF.left;
            z4Var.f87639d = 0;
        }
        z4Var.f87640e = rectF.left;
        z4Var.setDuration((z4Var.f87641f * 150) / this.f293035h);
        startAnimation(z4Var);
    }

    public final void b(boolean z17) {
        android.graphics.RectF rectF = this.A;
        float f17 = rectF.left;
        int i17 = this.f293042r;
        if (f17 < i17) {
            rectF.left = i17;
        }
        float f18 = this.f293035h + i17;
        if (z17) {
            f18 -= getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
        }
        if (rectF.left > f18) {
            rectF.left = f18;
        }
        if (this.G) {
            rectF.right = rectF.left + ((int) (this.f293044t * 2.0f));
        } else {
            rectF.right = rectF.left + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho);
        }
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahp) - this.f293042r;
        if (rectF.right > dimensionPixelSize) {
            rectF.right = dimensionPixelSize;
        }
    }

    public final void c() {
        this.f293042r = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f293043s = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahm) / 2.0f;
        this.f293044t = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn) / 2.0f;
        this.f293045u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahe);
        this.f293046v = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adn);
        this.f293047w = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ado);
        getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adn);
        this.C = this.f293047w;
        this.B = this.f293046v;
        this.D = this.f293045u;
        this.f293041q = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnClickListener(this);
        this.f293030J = (android.os.Vibrator) this.K.getSystemService("vibrator");
    }

    public final void d(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544640n);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yl5.a.f544630d);
        this.C = obtainStyledAttributes.getColor(2, this.f293047w);
        this.B = obtainStyledAttributes.getColor(0, this.f293046v);
        this.D = obtainStyledAttributes.getColor(4, this.f293045u);
        this.E = obtainStyledAttributes.getString(3);
        this.F = obtainStyledAttributes.getString(1);
        this.H = obtainStyledAttributes2.getBoolean(0, false);
        this.I = obtainStyledAttributes2.getBoolean(1, true);
        this.f293048x = this.H;
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    public final void e() {
        int i17 = this.f293038n;
        int i18 = this.f293037m;
        android.graphics.RectF rectF = this.A;
        if (i17 < i18) {
            float f17 = ((i18 - i17) / 2) + this.f293042r;
            rectF.top = f17;
            rectF.bottom = (f17 + i17) - (r3 * 2);
        } else {
            rectF.top = this.f293042r;
            rectF.bottom = i18 - r0;
        }
        if (!this.f293048x) {
            rectF.left = this.f293042r;
            rectF.right = ((int) (this.f293044t * 2.0f)) + r0;
        } else {
            int i19 = this.f293035h;
            int i27 = this.f293042r;
            rectF.left = i19 + i27;
            rectF.right = this.f293036i - i27;
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
        yj0.a.b("com/tencent/mm/ui/widget/WeSwitch", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a(!this.f293048x);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f293040p = false;
        yj0.a.h(this, "com/tencent/mm/ui/widget/WeSwitch", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean isEnabled = isEnabled();
        android.graphics.RectF rectF = this.A;
        android.graphics.RectF rectF2 = this.f293050z;
        android.graphics.Paint paint = this.f293049y;
        if (isEnabled) {
            int i17 = this.B;
            paint.setAlpha(255);
            paint.setColor(i17);
            float f17 = this.f293043s;
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            paint.setColor(this.C);
            paint.setAlpha(java.lang.Math.min(255, (int) (((rectF.left - this.f293042r) / this.f293035h) * 255.0f)));
            float f18 = this.f293043s;
            canvas.drawRoundRect(rectF2, f18, f18, paint);
        } else {
            paint.setColor(this.f293048x ? this.C : this.B);
            paint.setAlpha(this.f293048x ? 76 : 7);
            float f19 = this.f293043s;
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
        paint.setColor(this.D);
        float f27 = this.f293044t;
        canvas.drawRoundRect(rectF, f27, f27, paint);
        if (this.E == null || this.F == null) {
            return;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        paint2.setAntiAlias(true);
        int min = java.lang.Math.min(255, (int) (((rectF.left - this.f293042r) / this.f293035h) * 255.0f));
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String str = this.E;
        paint2.getTextBounds(str, 0, str.length(), rect);
        paint2.setAlpha(min);
        float a17 = (((rectF2.left + rectF2.right) / 2.0f) - this.f293044t) + com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        float height = (((rectF2.top + rectF2.bottom) / 2.0f) + (rect.height() / 2.0f)) - com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        canvas.drawText(this.E, a17, height, paint2);
        float a18 = (((rectF2.left + rectF2.right) / 2.0f) + this.f293044t) - com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        paint2.setAlpha(255 - min);
        canvas.drawText(this.F, a18, height, paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        this.f293036i = i28;
        this.f293037m = i27 - i18;
        int i29 = (i28 - ((int) (this.f293044t * 2.0f))) - (this.f293042r * 2);
        this.f293035h = i29;
        this.f293034g = i29 / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561467je);
        this.f293038n = dimensionPixelSize;
        int i37 = this.f293037m;
        android.graphics.RectF rectF = this.f293050z;
        if (dimensionPixelSize < i37) {
            float f17 = (i37 - dimensionPixelSize) / 2;
            rectF.top = f17;
            rectF.bottom = f17 + dimensionPixelSize;
        } else {
            rectF.top = 0.0f;
            rectF.bottom = i37;
        }
        rectF.left = 0.0f;
        rectF.right = this.f293036i;
        e();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f293049y;
        paint.setStyle(style);
        paint.setColor(this.f293046v);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f293039o || !isEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        android.graphics.RectF rectF = this.A;
        boolean z17 = false;
        if (action == 0) {
            clearAnimation();
            this.f293031d = motionEvent.getX();
            this.f293032e = motionEvent.getY();
            this.f293033f = android.os.SystemClock.elapsedRealtime();
            this.f293040p = false;
            if (this.f293048x) {
                rectF.left -= getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
            } else {
                rectF.right += getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aho) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahn);
            }
            invalidate();
        } else if (action == 1) {
            if (android.os.SystemClock.elapsedRealtime() - this.f293033f < 300) {
                this.G = true;
            } else if (this.f293048x) {
                this.G = true;
            } else {
                this.G = false;
            }
            a(!this.f293048x);
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f293040p = false;
        } else if (action == 2) {
            if (this.f293040p) {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                rectF.left += motionEvent.getX() - this.f293031d;
                this.G = false;
                b(true);
            } else {
                float x17 = motionEvent.getX() - this.f293031d;
                float y17 = motionEvent.getY() - this.f293032e;
                if (java.lang.Math.abs(x17) >= this.f293041q / 10.0f) {
                    if (y17 == 0.0f) {
                        y17 = 1.0f;
                    }
                    if (java.lang.Math.abs(x17 / y17) > 3.0f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    this.f293040p = true;
                    android.view.ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            this.f293031d = motionEvent.getX();
            this.f293032e = motionEvent.getY();
        } else if (action == 3) {
            this.G = true;
            if (rectF.left > this.f293034g) {
                a(true);
            } else {
                a(false);
            }
            android.view.ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            this.f293040p = false;
        }
        if (this.f293040p) {
            invalidate();
        }
        return true;
    }

    /* renamed from: setCheck */
    public void m81497x52cfa5c6(boolean z17) {
        if (this.f293048x != z17) {
            clearAnimation();
            this.f293048x = z17;
            e();
            this.f293039o = false;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.I = z17;
    }

    /* renamed from: setOffColor */
    public void m81498x46e33db6(int i17) {
        this.B = i17;
    }

    /* renamed from: setSwitchListener */
    public void m81499xb3e0a10a(al5.w4 w4Var) {
        this.M = w4Var;
    }

    public ViewOnClickListenerC22656xc0bc43c2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293039o = false;
        this.f293040p = false;
        this.f293048x = false;
        this.f293049y = new android.graphics.Paint(1);
        this.f293050z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = new al5.z4(this, null);
        this.K = context;
        c();
        d(context, attributeSet);
    }
}
