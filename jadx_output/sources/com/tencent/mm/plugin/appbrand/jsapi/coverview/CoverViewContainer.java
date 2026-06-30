package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class CoverViewContainer extends com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView implements if1.u, pq5.a {
    public static final java.util.HashMap C = new java.util.HashMap();
    public final float[] A;
    public com.tencent.mm.plugin.appbrand.jsapi.coverview.c B;

    /* renamed from: e, reason: collision with root package name */
    public float f80627e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f80628f;

    /* renamed from: g, reason: collision with root package name */
    public float f80629g;

    /* renamed from: h, reason: collision with root package name */
    public int f80630h;

    /* renamed from: i, reason: collision with root package name */
    public int f80631i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f80632m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f80633n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f80634o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f80635p;

    /* renamed from: q, reason: collision with root package name */
    public int f80636q;

    /* renamed from: r, reason: collision with root package name */
    public int f80637r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80638s;

    /* renamed from: t, reason: collision with root package name */
    public float f80639t;

    /* renamed from: u, reason: collision with root package name */
    public float f80640u;

    /* renamed from: v, reason: collision with root package name */
    public long f80641v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View.OnClickListener f80642w;

    /* renamed from: x, reason: collision with root package name */
    public int f80643x;

    /* renamed from: y, reason: collision with root package name */
    public int f80644y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f80645z;

    public CoverViewContainer(android.content.Context context, android.view.View view) {
        this(context, null, 0);
        e();
        setTargetView(view);
        e();
    }

    public static android.graphics.RectF a(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new android.graphics.RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    private android.graphics.drawable.Drawable getShadowDrawable() {
        int i17;
        int i18 = this.f80631i;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f80645z;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f80628f;
        float f17 = fArr[0];
        float[] fArr2 = this.A;
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
        float f28 = this.f80629g;
        if (f28 > 0.0f && (i17 = this.f80630h) != 0) {
            gradientDrawable.setStroke((int) f28, i17);
        }
        return gradientDrawable;
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

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        if (getWidth() != 0 && getHeight() != 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
            draw(canvas);
            canvas.restore();
        }
        return true;
    }

    public java.lang.Object d(java.lang.Class cls) {
        try {
            if (cls.isAssignableFrom(this.f80633n.getClass())) {
                return this.f80633n;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean contains = a(this).contains(motionEvent.getRawX(), motionEvent.getRawY());
        if (motionEvent.getActionMasked() != 0 || g(motionEvent.getX(), motionEvent.getY()) || contains) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        float[] fArr = this.f80628f;
        if (fArr != null && fArr.length > 0) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f80627e > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f80627e;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f80631i;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f80629g;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f80627e;
            canvas.drawRoundRect(rectF2, f28, f28, this.f80632m);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f80627e;
            if (f29 > 0.0f) {
                float f37 = this.f80629g;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f80629g;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f80629g, getHeight() - this.f80629g), f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z17 = z18;
        }
        super.draw(canvas);
        if (z17) {
            canvas.restore();
        }
    }

    public void e() {
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f80632m;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (this.f80643x == 0) {
            this.f80643x = windowManager.getDefaultDisplay().getWidth();
            this.f80644y = windowManager.getDefaultDisplay().getHeight();
        }
    }

    public boolean g(float f17, float f18) {
        float f19 = this.f80627e;
        if (f19 <= 0.0f) {
            return true;
        }
        double pow = java.lang.Math.pow(f19, 2.0d);
        float width = getWidth();
        float height = getHeight();
        float f27 = this.f80627e;
        if (f17 < f27) {
            if (f18 < f27) {
                if (java.lang.Math.pow(f27 - f17, 2.0d) + java.lang.Math.pow(this.f80627e - f18, 2.0d) > pow) {
                    return false;
                }
            } else if (f18 > height - f27 && java.lang.Math.pow(f27 - f17, 2.0d) + java.lang.Math.pow((f18 + this.f80627e) - height, 2.0d) > pow) {
                return false;
            }
        } else if (f17 > width - f27) {
            if (f18 < f27) {
                if (java.lang.Math.pow((f17 + f27) - width, 2.0d) + java.lang.Math.pow(this.f80627e - f18, 2.0d) > pow) {
                    return false;
                }
            } else if (f18 > height - f27 && java.lang.Math.pow((f17 + f27) - width, 2.0d) + java.lang.Math.pow((f18 + this.f80627e) - height, 2.0d) > pow) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        if (viewGroup == viewGroup2) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt == viewGroup2) {
                return true;
            }
            if ((childAt instanceof android.view.ViewGroup) && h((android.view.ViewGroup) childAt, viewGroup2)) {
                return true;
            }
        }
        return false;
    }

    public final void j(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer, android.view.MotionEvent motionEvent) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.c cVar = this.B;
        if (cVar != null) {
            java.lang.String str2 = coverViewContainer.f80635p;
            int i17 = coverViewContainer.f80636q;
            org.json.JSONObject jSONObject2 = null;
            try {
                jSONObject = new org.json.JSONObject();
                jSONObject.put("viewId", i17);
                jSONObject.put("left", coverViewContainer.getX() / ik1.w.f());
                jSONObject.put("top", coverViewContainer.getY() / ik1.w.f());
            } catch (org.json.JSONException unused) {
                jSONObject = null;
            }
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("viewId", this.f80636q);
                jSONObject3.put("x", motionEvent.getRawX() / ik1.w.f());
                jSONObject3.put("y", motionEvent.getRawY() / ik1.w.f());
                jSONObject2 = jSONObject3;
            } catch (org.json.JSONException unused2) {
            }
            cVar.a(str, str2, jSONObject, jSONObject2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer;
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        if (this.f80634o) {
            coverViewContainer = this;
        } else {
            int i17 = this.f80637r;
            coverViewContainer = i17 > 0 ? (com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) C.get(java.lang.Integer.valueOf(i17)) : null;
        }
        if (!this.f80634o && (!this.f80638s || !h(coverViewContainer, this))) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f80639t = motionEvent.getRawX();
            this.f80640u = motionEvent.getRawY();
            this.f80641v = java.lang.System.currentTimeMillis();
            if (coverViewContainer != null) {
                j("start", coverViewContainer, motionEvent);
            }
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f80641v;
            long j18 = currentTimeMillis - j17;
            if (j17 != 0 && j18 < 300 && j18 >= 0 && (onClickListener = this.f80642w) != null) {
                onClickListener.onClick(this);
            }
            if (coverViewContainer != null) {
                j("end", coverViewContainer, motionEvent);
            }
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f80639t;
            float rawY = motionEvent.getRawY() - this.f80640u;
            if (coverViewContainer != null && (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f)) {
                int x17 = (int) (coverViewContainer.getX() + rawX);
                int y17 = (int) (coverViewContainer.getY() + rawY);
                if (x17 < 0) {
                    x17 = 0;
                } else {
                    int width = coverViewContainer.getWidth() + x17;
                    int i18 = this.f80643x;
                    if (width > i18) {
                        x17 = i18 - coverViewContainer.getWidth();
                    }
                }
                coverViewContainer.setX(x17);
                if (y17 < 0) {
                    y17 = 0;
                } else {
                    int height = coverViewContainer.getHeight() + y17;
                    int i19 = this.f80644y;
                    if (height > i19) {
                        y17 = i19 - coverViewContainer.getHeight();
                    }
                }
                coverViewContainer.setY(y17);
                this.f80639t = motionEvent.getRawX();
                this.f80640u = motionEvent.getRawY();
                j("dragging", coverViewContainer, motionEvent);
            }
        }
        return true;
    }

    @Override // if1.u
    public void setBgColor(int i17) {
        this.f80631i = i17;
    }

    @Override // if1.u
    public void setBorderColor(int i17) {
        this.f80630h = i17;
        this.f80632m.setColor(i17);
    }

    @Override // if1.u
    public void setBorderRadius(float f17) {
        this.f80627e = f17;
    }

    @Override // if1.u
    public void setBorderWidth(float f17) {
        this.f80629g = f17;
        this.f80632m.setStrokeWidth(f17);
    }

    public void setDragConfig(java.lang.String str) {
    }

    public void setDragEventCallback(com.tencent.mm.plugin.appbrand.jsapi.coverview.c cVar) {
        this.B = cVar;
    }

    public void setIsInterceptEvent(boolean z17) {
        this.f80638s = z17;
    }

    public void setOnCustomerClickListener(android.view.View.OnClickListener onClickListener) {
        this.f80642w = onClickListener;
    }

    public void setTargetView(android.view.View view) {
        this.f80633n = view;
        super.addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // if1.u
    public void setBorderRadius(float[] fArr) {
        this.f80628f = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(getShadowDrawable());
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

    public CoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        e();
    }

    public CoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context), attributeSet, i17);
        this.f80632m = new android.graphics.Paint();
        this.f80634o = false;
        this.f80635p = "";
        this.f80638s = false;
        this.f80643x = 0;
        this.f80644y = 0;
        this.f80645z = new android.graphics.drawable.GradientDrawable();
        this.A = new float[8];
        e();
    }
}
