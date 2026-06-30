package com.p314xaae8f345.p3178x498cab9f.p3186x760fdadc.p3187x373aa5;

/* renamed from: com.tencent.wemagic.coverview.view.CoverViewContainer */
/* loaded from: classes3.dex */
public class C27736x6098f505 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f301621d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f301622e;

    /* renamed from: f, reason: collision with root package name */
    public float f301623f;

    /* renamed from: g, reason: collision with root package name */
    public int f301624g;

    /* renamed from: h, reason: collision with root package name */
    public int f301625h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f301626i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f301627m;

    /* renamed from: n, reason: collision with root package name */
    public int f301628n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f301629o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f301630p;

    public C27736x6098f505(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        a();
    }

    /* renamed from: getShadowDrawable */
    private android.graphics.drawable.Drawable m119814x8580ad4() {
        int i17;
        int i18 = this.f301625h;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f301629o;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f301622e;
        float f17 = fArr[0];
        float[] fArr2 = this.f301630p;
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
        float f28 = this.f301623f;
        if (f28 > 0.0f && (i17 = this.f301624g) != 0) {
            gradientDrawable.setStroke((int) f28, i17);
        }
        return gradientDrawable;
    }

    public void a() {
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f301626i;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (this.f301628n == 0) {
            this.f301628n = windowManager.getDefaultDisplay().getWidth();
            windowManager.getDefaultDisplay().getHeight();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (i17 < 0) {
            i17 = 0;
        } else if (i17 > getChildCount() - 1) {
            i17 = getChildCount() - 1;
        }
        super.addView(view, i17 + 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean z17 = true;
        boolean contains = new android.graphics.RectF(iArr[0], iArr[1], r5 + getWidth(), iArr[1] + getHeight()).contains(rawX, rawY);
        if (motionEvent.getActionMasked() == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = this.f301621d;
            if (f17 > 0.0f) {
                double pow = java.lang.Math.pow(f17, 2.0d);
                float width = getWidth();
                float height = getHeight();
                float f18 = this.f301621d;
                if (x17 >= f18 ? !(x17 <= width - f18 || (y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow((y17 + this.f301621d) - height, 2.0d) <= pow : java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow(this.f301621d - y17, 2.0d) <= pow)) : !(y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow((y17 + this.f301621d) - height, 2.0d) <= pow : java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow(this.f301621d - y17, 2.0d) <= pow)) {
                    z17 = false;
                }
            }
            if (!z17 && !contains) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        float[] fArr = this.f301622e;
        if (fArr != null && fArr.length > 0) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f301621d > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f301621d;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f301625h;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f301623f;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f301621d;
            canvas.drawRoundRect(rectF2, f28, f28, this.f301626i);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f301621d;
            if (f29 > 0.0f) {
                float f37 = this.f301623f;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f301623f;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f301623f, getHeight() - this.f301623f), f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z17 = z18;
        }
        super.draw(canvas);
        if (z17) {
            canvas.restore();
        }
    }

    /* renamed from: setBgColor */
    public void m119815xa5089f5c(int i17) {
        this.f301625h = i17;
    }

    /* renamed from: setBorderColor */
    public void m119816x9b5140d5(int i17) {
        this.f301624g = i17;
        this.f301626i.setColor(i17);
    }

    /* renamed from: setBorderRadius */
    public void m119817xe7a68960(float f17) {
        this.f301621d = f17;
    }

    /* renamed from: setBorderWidth */
    public void m119819x9c683f38(float f17) {
        this.f301623f = f17;
        this.f301626i.setStrokeWidth(f17);
    }

    /* renamed from: setIsInterceptEvent */
    public void m119820x57300f44(boolean z17) {
    }

    /* renamed from: setOnCustomerClickListener */
    public void m119821xd050fbd(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setTargetView */
    public void m119822x3966f5d8(android.view.View view) {
        this.f301627m = view;
        super.addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: setViewId */
    public void m119823x279f85a2(int i17) {
    }

    /* renamed from: setBorderRadius */
    public void m119818xe7a68960(float[] fArr) {
        this.f301622e = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(m119814x8580ad4());
    }

    public C27736x6098f505(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f301626i = new android.graphics.Paint();
        this.f301628n = 0;
        this.f301629o = new android.graphics.drawable.GradientDrawable();
        this.f301630p = new float[8];
        new java.util.HashMap();
        a();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (i17 < 0) {
            i17 = 0;
        } else if (i17 > getChildCount() - 1) {
            i17 = getChildCount() - 1;
        }
        super.addView(view, i17 + 1, layoutParams);
    }
}
