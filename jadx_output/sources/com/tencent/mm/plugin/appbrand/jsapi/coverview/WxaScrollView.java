package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class WxaScrollView extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.jsapi.coverview.s0, com.tencent.mm.plugin.appbrand.jsapi.coverview.t0, if1.u {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f80648d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f80649e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.HorizontalScrollView f80650f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.coverview.r0 f80651g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f80652h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80653i;

    /* renamed from: m, reason: collision with root package name */
    public float f80654m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f80655n;

    /* renamed from: o, reason: collision with root package name */
    public float f80656o;

    /* renamed from: p, reason: collision with root package name */
    public int f80657p;

    /* renamed from: q, reason: collision with root package name */
    public int f80658q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f80659r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f80660s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f80661t;

    public WxaScrollView(android.content.Context context, boolean z17) {
        super(context);
        this.f80652h = true;
        this.f80653i = true;
        this.f80659r = new android.graphics.Paint();
        this.f80660s = new android.graphics.drawable.GradientDrawable();
        this.f80661t = new float[8];
        this.f80652h = z17;
        this.f80653i = true ^ z17;
        c();
    }

    private android.graphics.drawable.Drawable getShadowDrawable() {
        int i17;
        int i18 = this.f80658q;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f80660s;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f80655n;
        if (fArr != null && fArr.length > 3) {
            float f17 = fArr[0];
            float[] fArr2 = this.f80661t;
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
        float f28 = this.f80656o;
        if (f28 > 0.0f && (i17 = this.f80657p) != 0) {
            gradientDrawable.setStroke((int) f28, i17);
        }
        return gradientDrawable;
    }

    public final void a() {
        if (this.f80652h) {
            this.f80650f.removeView(this.f80648d);
            super.removeView(this.f80650f);
            this.f80649e.removeView(this.f80648d);
            super.removeView(this.f80649e);
            super.addView(this.f80649e, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f80649e.addView(this.f80648d, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            return;
        }
        this.f80649e.removeView(this.f80648d);
        super.removeView(this.f80649e);
        this.f80650f.removeView(this.f80648d);
        super.removeView(this.f80650f);
        super.addView(this.f80650f, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f80650f.addView(this.f80648d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        this.f80648d.addView(view, i17);
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaScrollView", "adjustScrollViewDirection scrollVertical:%b, scrollHorizontal:%b", java.lang.Boolean.valueOf(this.f80652h), java.lang.Boolean.valueOf(this.f80653i));
        if (this.f80652h && this.f80649e.getChildCount() == 0) {
            a();
        } else if (this.f80653i && this.f80650f.getChildCount() == 0) {
            a();
        }
    }

    public final void c() {
        this.f80649e = new com.tencent.mm.plugin.appbrand.jsapi.coverview.u0(this, getContext());
        this.f80650f = new com.tencent.mm.plugin.appbrand.jsapi.coverview.v0(this, getContext());
        this.f80648d = new android.widget.FrameLayout(getContext());
        a();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f80659r;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = this.f80654m;
            boolean z17 = true;
            if (f17 > 0.0f) {
                double pow = java.lang.Math.pow(f17, 2.0d);
                float width = getWidth();
                float height = getHeight();
                float f18 = this.f80654m;
                if (x17 >= f18 ? !(x17 <= width - f18 || (y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow((y17 + this.f80654m) - height, 2.0d) <= pow : java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow(this.f80654m - y17, 2.0d) <= pow)) : !(y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow((y17 + this.f80654m) - height, 2.0d) <= pow : java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow(this.f80654m - y17, 2.0d) <= pow)) {
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
        float[] fArr = this.f80655n;
        if (fArr != null && fArr.length == 4) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f80654m > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f80654m;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f80658q;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f80656o;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f80654m;
            canvas.drawRoundRect(rectF2, f28, f28, this.f80659r);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f80654m;
            if (f29 > 0.0f) {
                float f37 = this.f80656o;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f80656o;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f80656o, getHeight() - this.f80656o), f17, f17, android.graphics.Path.Direction.CW);
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

    public android.view.ViewGroup getTargetView() {
        return this.f80648d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.coverview.s0
    public int getTargetViewChildCount() {
        return this.f80648d.getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        this.f80648d.removeView(view);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        if (this.f80652h) {
            this.f80649e.scrollTo(i17, i18);
        } else {
            this.f80650f.scrollTo(i17, i18);
        }
        invalidate();
    }

    @Override // if1.u
    public void setBgColor(int i17) {
        this.f80658q = i17;
    }

    @Override // if1.u
    public void setBorderColor(int i17) {
        this.f80657p = i17;
        this.f80659r.setColor(i17);
    }

    @Override // if1.u
    public void setBorderRadius(float f17) {
        this.f80654m = f17;
    }

    @Override // if1.u
    public void setBorderWidth(float f17) {
        this.f80656o = f17;
        this.f80659r.setStrokeWidth(f17);
    }

    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.jsapi.coverview.r0 r0Var) {
        this.f80651g = r0Var;
    }

    public void setScrollHorizontal(boolean z17) {
        this.f80653i = z17;
    }

    public void setScrollVertical(boolean z17) {
        this.f80652h = z17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f80648d.addView(view, i17, layoutParams);
    }

    @Override // if1.u
    public void setBorderRadius(float[] fArr) {
        this.f80655n = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(getShadowDrawable());
    }

    public WxaScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80652h = true;
        this.f80653i = true;
        this.f80659r = new android.graphics.Paint();
        this.f80660s = new android.graphics.drawable.GradientDrawable();
        this.f80661t = new float[8];
        c();
    }

    public WxaScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f80652h = true;
        this.f80653i = true;
        this.f80659r = new android.graphics.Paint();
        this.f80660s = new android.graphics.drawable.GradientDrawable();
        this.f80661t = new float[8];
        c();
    }
}
