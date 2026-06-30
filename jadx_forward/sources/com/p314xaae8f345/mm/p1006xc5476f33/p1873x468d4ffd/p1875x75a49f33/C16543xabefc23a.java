package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.SliderSeekBar */
/* loaded from: classes10.dex */
public class C16543xabefc23a extends android.view.View {
    public int A;
    public android.graphics.Rect B;
    public android.graphics.Rect C;
    public boolean D;
    public boolean E;
    public final android.view.View.OnTouchListener F;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 f230472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f230473e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230474f;

    /* renamed from: g, reason: collision with root package name */
    public int f230475g;

    /* renamed from: h, reason: collision with root package name */
    public int f230476h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f230477i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f230478m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f230479n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f230480o;

    /* renamed from: p, reason: collision with root package name */
    public int f230481p;

    /* renamed from: q, reason: collision with root package name */
    public int f230482q;

    /* renamed from: r, reason: collision with root package name */
    public float f230483r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f230484s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f230485t;

    /* renamed from: u, reason: collision with root package name */
    public int f230486u;

    /* renamed from: v, reason: collision with root package name */
    public float f230487v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f230488w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f230489x;

    /* renamed from: y, reason: collision with root package name */
    public float f230490y;

    /* renamed from: z, reason: collision with root package name */
    public int f230491z;

    public C16543xabefc23a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!c16543xabefc23a.f230473e || (drawable = c16543xabefc23a.f230479n) == null || c16543xabefc23a.f230480o == null || drawable.getBounds().width() <= 0 || c16543xabefc23a.f230480o.getBounds().width() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1 l1Var = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1) c16543xabefc23a.f230479n : (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1) c16543xabefc23a.f230480o;
        if (l1Var.f230586a != z18) {
            l1Var.f230586a = z18;
            l1Var.f230589d.invalidate();
        }
        c16543xabefc23a.postInvalidate();
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (c16543xabefc23a.f230473e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = c16543xabefc23a.A;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(boolean z17) {
        return z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1) this.f230479n).f230586a : ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1) this.f230480o).f230586a;
    }

    public void d() {
        if (this.B == null || this.C == null) {
            return;
        }
        android.graphics.Rect rect = this.B;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect3 = this.C;
        android.graphics.Rect rect4 = new android.graphics.Rect(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.f230479n.setBounds(rect2);
        this.f230480o.setBounds(rect4);
        this.f230483r = 0.0f;
        postInvalidate();
    }

    public void e() {
        android.graphics.drawable.Drawable drawable = this.f230479n;
        int i17 = this.f230491z;
        drawable.setBounds(i17 - this.f230481p, 0, i17, getHeight());
        android.graphics.drawable.Drawable drawable2 = this.f230480o;
        int i18 = this.f230491z;
        int i19 = this.f230475g;
        drawable2.setBounds(i18 + i19, 0, i19 + i18 + this.f230481p, getHeight());
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f230473e || (drawable = this.f230479n) == null || this.f230480o == null || drawable.getBounds().width() <= 0 || this.f230480o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f230480o.getBounds().left - this.f230476h;
            f18 = java.lang.Math.max(this.f230491z, this.f230480o.getBounds().left - this.f230475g);
        } else {
            f18 = this.f230479n.getBounds().right + this.f230476h;
            min = java.lang.Math.min(getWidth() - this.f230491z, this.f230479n.getBounds().right + this.f230475g);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f230479n.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f230481p), 0);
            this.f230479n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f230480o.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f230480o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    /* renamed from: getLeftSliderBound */
    public int m66934xcc839460() {
        return this.f230479n.getBounds().right;
    }

    /* renamed from: getRightSliderBound */
    public int m66935x961e58d7() {
        return this.f230480o.getBounds().left;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f230483r > 0.0f) {
            float width = getWidth() * this.f230483r;
            int i17 = this.f230482q;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f230484s);
        }
        if (this.f230473e) {
            int centerX = this.f230479n.getBounds().centerX();
            int centerX2 = this.f230480o.getBounds().centerX();
            if ((c(true) || c(false)) && this.D && this.E) {
                float f17 = this.f230491z;
                float f18 = this.f230490y;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f230491z) - this.f230490y, getBottom() - this.f230490y, this.f230489x);
            }
            if (this.f230479n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f230488w);
            }
            if (this.f230480o.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f230488w);
            }
            if (this.D) {
                canvas.drawLine(this.f230479n.getBounds().left, this.f230487v, this.f230480o.getBounds().right, this.f230487v, this.f230485t);
                canvas.drawLine(this.f230479n.getBounds().left, getHeight() - this.f230487v, this.f230480o.getBounds().right, getHeight() - this.f230487v, this.f230485t);
            }
            this.f230479n.draw(canvas);
            this.f230480o.draw(canvas);
        }
    }

    /* renamed from: setBlackMastPaintColor */
    public void m66936x8a7ed497(int i17) {
        this.f230488w.setColor(i17);
    }

    /* renamed from: setBorderColor */
    public void m66937x9b5140d5(int i17) {
        this.f230485t.setColor(i17);
    }

    /* renamed from: setCursorColor */
    public void m66938x111e8beb(int i17) {
        this.f230484s.setColor(i17);
    }

    /* renamed from: setCursorPos */
    public void m66939x853690dc(float f17) {
        if (this.f230473e) {
            this.f230483r = f17;
            invalidate();
        }
    }

    /* renamed from: setCursorWidth */
    public void m66940x12358a4e(int i17) {
        this.f230482q = i17;
    }

    /* renamed from: setEnableHapticAtEdge */
    public void m66941x4c2ebf2c(boolean z17) {
        this.f230478m = z17;
    }

    /* renamed from: setEnableOldBorder */
    public void m66942xd42f7e2e(boolean z17) {
        this.E = z17;
    }

    /* renamed from: setMaskColor */
    public void m66943x571ddd95(int i17) {
        this.f230488w.setColor(i17);
    }

    /* renamed from: setOnSliderTouchListener */
    public void m66944x5e352211(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 k1Var) {
        this.f230472d = k1Var;
    }

    public C16543xabefc23a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230473e = false;
        this.f230474f = false;
        this.f230477i = false;
        this.f230478m = false;
        this.f230483r = -1.0f;
        this.f230491z = 0;
        this.D = true;
        this.E = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j1(this);
        this.F = j1Var;
        this.f230481p = i65.a.b(getContext(), 8);
        this.A = i65.a.b(getContext(), 8);
        this.f230479n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.f230480o = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l1(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.D = true;
        postInvalidate();
        this.f230482q = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ad_);
        this.f230483r = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230484s = paint;
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230484s.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f230488w = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f230488w.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f230485t = paint3;
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230485t.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f230486u = round;
        this.f230485t.setStrokeWidth(round);
        this.f230487v = this.f230486u * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f230489x = paint4;
        paint4.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230489x.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f230490y = 0.5f * round2;
        this.f230489x.setStrokeWidth(round2);
        this.f230489x.setAlpha(178);
        setOnTouchListener(j1Var);
    }
}
