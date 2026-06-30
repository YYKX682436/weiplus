package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer */
/* loaded from: classes7.dex */
public class C12072x6098f505 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09 implements if1.u, pq5.a {
    public static final java.util.HashMap C = new java.util.HashMap();
    public final float[] A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.c B;

    /* renamed from: e, reason: collision with root package name */
    public float f162160e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f162161f;

    /* renamed from: g, reason: collision with root package name */
    public float f162162g;

    /* renamed from: h, reason: collision with root package name */
    public int f162163h;

    /* renamed from: i, reason: collision with root package name */
    public int f162164i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f162165m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f162166n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f162167o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f162168p;

    /* renamed from: q, reason: collision with root package name */
    public int f162169q;

    /* renamed from: r, reason: collision with root package name */
    public int f162170r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f162171s;

    /* renamed from: t, reason: collision with root package name */
    public float f162172t;

    /* renamed from: u, reason: collision with root package name */
    public float f162173u;

    /* renamed from: v, reason: collision with root package name */
    public long f162174v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View.OnClickListener f162175w;

    /* renamed from: x, reason: collision with root package name */
    public int f162176x;

    /* renamed from: y, reason: collision with root package name */
    public int f162177y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f162178z;

    public C12072x6098f505(android.content.Context context, android.view.View view) {
        this(context, null, 0);
        e();
        m50861x3966f5d8(view);
        e();
    }

    public static android.graphics.RectF a(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new android.graphics.RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: getShadowDrawable */
    private android.graphics.drawable.Drawable m50851x8580ad4() {
        int i17;
        int i18 = this.f162164i;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f162178z;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f162161f;
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
        float f28 = this.f162162g;
        if (f28 > 0.0f && (i17 = this.f162163h) != 0) {
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
            if (cls.isAssignableFrom(this.f162166n.getClass())) {
                return this.f162166n;
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
        float[] fArr = this.f162161f;
        if (fArr != null && fArr.length > 0) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f162160e > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f162160e;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f162164i;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f162162g;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f162160e;
            canvas.drawRoundRect(rectF2, f28, f28, this.f162165m);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f162160e;
            if (f29 > 0.0f) {
                float f37 = this.f162162g;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f162162g;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f162162g, getHeight() - this.f162162g), f17, f17, android.graphics.Path.Direction.CW);
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
        android.graphics.Paint paint = this.f162165m;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (this.f162176x == 0) {
            this.f162176x = windowManager.getDefaultDisplay().getWidth();
            this.f162177y = windowManager.getDefaultDisplay().getHeight();
        }
    }

    public boolean g(float f17, float f18) {
        float f19 = this.f162160e;
        if (f19 <= 0.0f) {
            return true;
        }
        double pow = java.lang.Math.pow(f19, 2.0d);
        float width = getWidth();
        float height = getHeight();
        float f27 = this.f162160e;
        if (f17 < f27) {
            if (f18 < f27) {
                if (java.lang.Math.pow(f27 - f17, 2.0d) + java.lang.Math.pow(this.f162160e - f18, 2.0d) > pow) {
                    return false;
                }
            } else if (f18 > height - f27 && java.lang.Math.pow(f27 - f17, 2.0d) + java.lang.Math.pow((f18 + this.f162160e) - height, 2.0d) > pow) {
                return false;
            }
        } else if (f17 > width - f27) {
            if (f18 < f27) {
                if (java.lang.Math.pow((f17 + f27) - width, 2.0d) + java.lang.Math.pow(this.f162160e - f18, 2.0d) > pow) {
                    return false;
                }
            } else if (f18 > height - f27 && java.lang.Math.pow((f17 + f27) - width, 2.0d) + java.lang.Math.pow((f18 + this.f162160e) - height, 2.0d) > pow) {
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

    public final void j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505, android.view.MotionEvent motionEvent) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.c cVar = this.B;
        if (cVar != null) {
            java.lang.String str2 = c12072x6098f505.f162168p;
            int i17 = c12072x6098f505.f162169q;
            org.json.JSONObject jSONObject2 = null;
            try {
                jSONObject = new org.json.JSONObject();
                jSONObject.put("viewId", i17);
                jSONObject.put("left", c12072x6098f505.getX() / ik1.w.f());
                jSONObject.put("top", c12072x6098f505.getY() / ik1.w.f());
            } catch (org.json.JSONException unused) {
                jSONObject = null;
            }
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("viewId", this.f162169q);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505;
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        if (this.f162167o) {
            c12072x6098f505 = this;
        } else {
            int i17 = this.f162170r;
            c12072x6098f505 = i17 > 0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) C.get(java.lang.Integer.valueOf(i17)) : null;
        }
        if (!this.f162167o && (!this.f162171s || !h(c12072x6098f505, this))) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f162172t = motionEvent.getRawX();
            this.f162173u = motionEvent.getRawY();
            this.f162174v = java.lang.System.currentTimeMillis();
            if (c12072x6098f505 != null) {
                j("start", c12072x6098f505, motionEvent);
            }
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f162174v;
            long j18 = currentTimeMillis - j17;
            if (j17 != 0 && j18 < 300 && j18 >= 0 && (onClickListener = this.f162175w) != null) {
                onClickListener.onClick(this);
            }
            if (c12072x6098f505 != null) {
                j("end", c12072x6098f505, motionEvent);
            }
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f162172t;
            float rawY = motionEvent.getRawY() - this.f162173u;
            if (c12072x6098f505 != null && (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f)) {
                int x17 = (int) (c12072x6098f505.getX() + rawX);
                int y17 = (int) (c12072x6098f505.getY() + rawY);
                if (x17 < 0) {
                    x17 = 0;
                } else {
                    int width = c12072x6098f505.getWidth() + x17;
                    int i18 = this.f162176x;
                    if (width > i18) {
                        x17 = i18 - c12072x6098f505.getWidth();
                    }
                }
                c12072x6098f505.setX(x17);
                if (y17 < 0) {
                    y17 = 0;
                } else {
                    int height = c12072x6098f505.getHeight() + y17;
                    int i19 = this.f162177y;
                    if (height > i19) {
                        y17 = i19 - c12072x6098f505.getHeight();
                    }
                }
                c12072x6098f505.setY(y17);
                this.f162172t = motionEvent.getRawX();
                this.f162173u = motionEvent.getRawY();
                j("dragging", c12072x6098f505, motionEvent);
            }
        }
        return true;
    }

    @Override // if1.u
    /* renamed from: setBgColor */
    public void mo50852xa5089f5c(int i17) {
        this.f162164i = i17;
    }

    @Override // if1.u
    /* renamed from: setBorderColor */
    public void mo50853x9b5140d5(int i17) {
        this.f162163h = i17;
        this.f162165m.setColor(i17);
    }

    @Override // if1.u
    /* renamed from: setBorderRadius */
    public void mo50854xe7a68960(float f17) {
        this.f162160e = f17;
    }

    @Override // if1.u
    /* renamed from: setBorderWidth */
    public void mo50856x9c683f38(float f17) {
        this.f162162g = f17;
        this.f162165m.setStrokeWidth(f17);
    }

    /* renamed from: setDragConfig */
    public void m50857xad26eb98(java.lang.String str) {
    }

    /* renamed from: setDragEventCallback */
    public void m50858xc40e67e9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.c cVar) {
        this.B = cVar;
    }

    /* renamed from: setIsInterceptEvent */
    public void m50859x57300f44(boolean z17) {
        this.f162171s = z17;
    }

    /* renamed from: setOnCustomerClickListener */
    public void m50860xd050fbd(android.view.View.OnClickListener onClickListener) {
        this.f162175w = onClickListener;
    }

    /* renamed from: setTargetView */
    public void m50861x3966f5d8(android.view.View view) {
        this.f162166n = view;
        super.addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // if1.u
    /* renamed from: setBorderRadius */
    public void mo50855xe7a68960(float[] fArr) {
        this.f162161f = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(m50851x8580ad4());
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

    public C12072x6098f505(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        e();
    }

    public C12072x6098f505(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context), attributeSet, i17);
        this.f162165m = new android.graphics.Paint();
        this.f162167o = false;
        this.f162168p = "";
        this.f162171s = false;
        this.f162176x = 0;
        this.f162177y = 0;
        this.f162178z = new android.graphics.drawable.GradientDrawable();
        this.A = new float[8];
        e();
    }
}
