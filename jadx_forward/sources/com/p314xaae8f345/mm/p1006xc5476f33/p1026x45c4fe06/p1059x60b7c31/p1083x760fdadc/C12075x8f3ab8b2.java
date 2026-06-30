package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView */
/* loaded from: classes15.dex */
public class C12075x8f3ab8b2 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.s0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.t0, if1.u {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f162181d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f162182e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.HorizontalScrollView f162183f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r0 f162184g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162185h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f162186i;

    /* renamed from: m, reason: collision with root package name */
    public float f162187m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f162188n;

    /* renamed from: o, reason: collision with root package name */
    public float f162189o;

    /* renamed from: p, reason: collision with root package name */
    public int f162190p;

    /* renamed from: q, reason: collision with root package name */
    public int f162191q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f162192r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f162193s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f162194t;

    public C12075x8f3ab8b2(android.content.Context context, boolean z17) {
        super(context);
        this.f162185h = true;
        this.f162186i = true;
        this.f162192r = new android.graphics.Paint();
        this.f162193s = new android.graphics.drawable.GradientDrawable();
        this.f162194t = new float[8];
        this.f162185h = z17;
        this.f162186i = true ^ z17;
        c();
    }

    /* renamed from: getShadowDrawable */
    private android.graphics.drawable.Drawable m50863x8580ad4() {
        int i17;
        int i18 = this.f162191q;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f162193s;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f162188n;
        if (fArr != null && fArr.length > 3) {
            float f17 = fArr[0];
            float[] fArr2 = this.f162194t;
            fArr2[0] = f17;
            fArr2[1] = fArr[0];
            float f18 = fArr[1];
            fArr2[2] = f18;
            fArr2[3] = f18;
            float f19 = fArr[3];
            fArr2[4] = f19;
            fArr2[5] = f19;
            float f27 = fArr[2];
            fArr2[6] = f27;
            fArr2[7] = f27;
            gradientDrawable.setCornerRadii(fArr2);
        }
        float f28 = this.f162189o;
        if (f28 > 0.0f && (i17 = this.f162190p) != 0) {
            gradientDrawable.setStroke((int) f28, i17);
        }
        return gradientDrawable;
    }

    public final void a() {
        if (this.f162185h) {
            this.f162183f.removeView(this.f162181d);
            super.removeView(this.f162183f);
            this.f162182e.removeView(this.f162181d);
            super.removeView(this.f162182e);
            super.addView(this.f162182e, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f162182e.addView(this.f162181d, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            return;
        }
        this.f162182e.removeView(this.f162181d);
        super.removeView(this.f162182e);
        this.f162183f.removeView(this.f162181d);
        super.removeView(this.f162183f);
        super.addView(this.f162183f, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f162183f.addView(this.f162181d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        this.f162181d.addView(view, i17);
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaScrollView", "adjustScrollViewDirection scrollVertical:%b, scrollHorizontal:%b", java.lang.Boolean.valueOf(this.f162185h), java.lang.Boolean.valueOf(this.f162186i));
        if (this.f162185h && this.f162182e.getChildCount() == 0) {
            a();
        } else if (this.f162186i && this.f162183f.getChildCount() == 0) {
            a();
        }
    }

    public final void c() {
        this.f162182e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.u0(this, getContext());
        this.f162183f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.v0(this, getContext());
        this.f162181d = new android.widget.FrameLayout(getContext());
        a();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f162192r;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = this.f162187m;
            boolean z17 = true;
            if (f17 > 0.0f) {
                double pow = java.lang.Math.pow(f17, 2.0d);
                float width = getWidth();
                float height = getHeight();
                float f18 = this.f162187m;
                if (x17 >= f18 ? !(x17 <= width - f18 || (y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow((y17 + this.f162187m) - height, 2.0d) <= pow : java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow(this.f162187m - y17, 2.0d) <= pow)) : !(y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow((y17 + this.f162187m) - height, 2.0d) <= pow : java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow(this.f162187m - y17, 2.0d) <= pow)) {
                    z17 = false;
                }
            }
            if (!z17) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        float[] fArr = this.f162188n;
        if (fArr != null && fArr.length == 4) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f162187m > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f162187m;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f162191q;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f162189o;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f162187m;
            canvas.drawRoundRect(rectF2, f28, f28, this.f162192r);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f162187m;
            if (f29 > 0.0f) {
                float f37 = this.f162189o;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f162189o;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f162189o, getHeight() - this.f162189o), f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z17 = z18;
        }
        int save = canvas.save();
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (z17) {
            canvas.restore();
        }
    }

    /* renamed from: getTargetView */
    public android.view.ViewGroup m50864xb42a7cc() {
        return this.f162181d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.s0
    /* renamed from: getTargetViewChildCount */
    public int mo50865xfda7723f() {
        return this.f162181d.getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        this.f162181d.removeView(view);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        if (this.f162185h) {
            this.f162182e.scrollTo(i17, i18);
        } else {
            this.f162183f.scrollTo(i17, i18);
        }
        invalidate();
    }

    @Override // if1.u
    /* renamed from: setBgColor */
    public void mo50852xa5089f5c(int i17) {
        this.f162191q = i17;
    }

    @Override // if1.u
    /* renamed from: setBorderColor */
    public void mo50853x9b5140d5(int i17) {
        this.f162190p = i17;
        this.f162192r.setColor(i17);
    }

    @Override // if1.u
    /* renamed from: setBorderRadius */
    public void mo50854xe7a68960(float f17) {
        this.f162187m = f17;
    }

    @Override // if1.u
    /* renamed from: setBorderWidth */
    public void mo50856x9c683f38(float f17) {
        this.f162189o = f17;
        this.f162192r.setStrokeWidth(f17);
    }

    /* renamed from: setOnScrollChangedListener */
    public void m50866x6fa959a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r0 r0Var) {
        this.f162184g = r0Var;
    }

    /* renamed from: setScrollHorizontal */
    public void m50867x38bdef53(boolean z17) {
        this.f162186i = z17;
    }

    /* renamed from: setScrollVertical */
    public void m50868x8f91ca65(boolean z17) {
        this.f162185h = z17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f162181d.addView(view, i17, layoutParams);
    }

    @Override // if1.u
    /* renamed from: setBorderRadius */
    public void mo50855xe7a68960(float[] fArr) {
        this.f162188n = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(m50863x8580ad4());
    }

    public C12075x8f3ab8b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162185h = true;
        this.f162186i = true;
        this.f162192r = new android.graphics.Paint();
        this.f162193s = new android.graphics.drawable.GradientDrawable();
        this.f162194t = new float[8];
        c();
    }

    public C12075x8f3ab8b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162185h = true;
        this.f162186i = true;
        this.f162192r = new android.graphics.Paint();
        this.f162193s = new android.graphics.drawable.GradientDrawable();
        this.f162194t = new float[8];
        c();
    }
}
