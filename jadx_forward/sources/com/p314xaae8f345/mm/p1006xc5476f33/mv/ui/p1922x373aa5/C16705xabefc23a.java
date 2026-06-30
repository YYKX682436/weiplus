package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.SliderSeekBar */
/* loaded from: classes15.dex */
public class C16705xabefc23a extends android.view.View {
    public android.graphics.Rect A;
    public android.graphics.Rect B;
    public boolean C;
    public final android.view.View.OnTouchListener D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f233268d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f233269e;

    /* renamed from: f, reason: collision with root package name */
    public int f233270f;

    /* renamed from: g, reason: collision with root package name */
    public int f233271g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f233272h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f233273i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f233274m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f233275n;

    /* renamed from: o, reason: collision with root package name */
    public int f233276o;

    /* renamed from: p, reason: collision with root package name */
    public int f233277p;

    /* renamed from: q, reason: collision with root package name */
    public float f233278q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f233279r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f233280s;

    /* renamed from: t, reason: collision with root package name */
    public int f233281t;

    /* renamed from: u, reason: collision with root package name */
    public float f233282u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f233283v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f233284w;

    /* renamed from: x, reason: collision with root package name */
    public float f233285x;

    /* renamed from: y, reason: collision with root package name */
    public int f233286y;

    /* renamed from: z, reason: collision with root package name */
    public int f233287z;

    public C16705xabefc23a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!c16705xabefc23a.f233268d || (drawable = c16705xabefc23a.f233274m) == null || c16705xabefc23a.f233275n == null || drawable.getBounds().width() <= 0 || c16705xabefc23a.f233275n.getBounds().width() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4 j4Var = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4) c16705xabefc23a.f233274m : (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4) c16705xabefc23a.f233275n;
        if (j4Var.f233411a != z18) {
            j4Var.f233411a = z18;
            j4Var.f233414d.invalidate();
        }
        c16705xabefc23a.postInvalidate();
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (c16705xabefc23a.f233268d && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = c16705xabefc23a.f233287z;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        this.f233274m = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.f233275n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.C = true;
        postInvalidate();
    }

    public void d() {
        this.f233276o = i65.a.b(getContext(), 8);
        this.f233287z = i65.a.b(getContext(), 8);
        c();
        this.f233277p = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.a76);
        this.f233278q = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f233279r = paint;
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f233279r.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f233283v = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f233283v.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f233280s = paint3;
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f233280s.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f233281t = round;
        this.f233280s.setStrokeWidth(round);
        this.f233282u = this.f233281t * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f233284w = paint4;
        paint4.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f233284w.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f233285x = 0.5f * round2;
        this.f233284w.setStrokeWidth(round2);
        this.f233284w.setAlpha(178);
        setOnTouchListener(this.D);
    }

    public final boolean e(boolean z17) {
        return z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4) this.f233274m).f233411a : ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4) this.f233275n).f233411a;
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f233268d || (drawable = this.f233274m) == null || this.f233275n == null || drawable.getBounds().width() <= 0 || this.f233275n.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f233275n.getBounds().left - this.f233271g;
            f18 = java.lang.Math.max(this.f233286y, this.f233275n.getBounds().left - this.f233270f);
        } else {
            f18 = this.f233274m.getBounds().right + this.f233271g;
            min = java.lang.Math.min(getWidth() - this.f233286y, this.f233274m.getBounds().right + this.f233270f);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f233274m.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f233276o), 0);
            this.f233274m.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f233275n.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f233275n.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    /* renamed from: getLeftSliderBound */
    public int m67375xcc839460() {
        return this.f233274m.getBounds().right;
    }

    /* renamed from: getRightSliderBound */
    public int m67376x961e58d7() {
        return this.f233275n.getBounds().left;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f233278q > 0.0f) {
            float width = getWidth() * this.f233278q;
            int i17 = this.f233277p;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f233279r);
        }
        if (this.f233268d) {
            int centerX = this.f233274m.getBounds().centerX();
            int centerX2 = this.f233275n.getBounds().centerX();
            if ((e(true) || e(false)) && this.C) {
                float f17 = this.f233286y;
                float f18 = this.f233285x;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f233286y) - this.f233285x, getBottom() - this.f233285x, this.f233284w);
            }
            if (this.f233274m.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f233283v);
            }
            if (this.f233275n.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f233283v);
            }
            if (this.C) {
                float f19 = centerX;
                float f27 = this.f233282u;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f233280s);
                canvas.drawLine(f19, getHeight() - this.f233282u, f28, getHeight() - this.f233282u, this.f233280s);
            }
            this.f233274m.draw(canvas);
            this.f233275n.draw(canvas);
        }
    }

    /* renamed from: setCursorColor */
    public void m67377x111e8beb(int i17) {
        this.f233279r.setColor(i17);
    }

    /* renamed from: setCursorPos */
    public void m67378x853690dc(float f17) {
        if (this.f233268d) {
            this.f233278q = f17;
            invalidate();
        }
    }

    /* renamed from: setCursorWidth */
    public void m67379x12358a4e(int i17) {
        this.f233277p = i17;
    }

    /* renamed from: setEnableHapticAtEdge */
    public void m67380x4c2ebf2c(boolean z17) {
        this.f233273i = z17;
    }

    /* renamed from: setMaskColor */
    public void m67381x571ddd95(int i17) {
        this.f233283v.setColor(i17);
    }

    /* renamed from: setOnSliderTouchListener */
    public void m67382x5e352211(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i4 i4Var) {
    }

    public C16705xabefc23a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f233268d = false;
        this.f233269e = false;
        this.f233272h = false;
        this.f233273i = false;
        this.f233278q = -1.0f;
        this.f233286y = 0;
        this.C = true;
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h4(this);
        d();
    }
}
