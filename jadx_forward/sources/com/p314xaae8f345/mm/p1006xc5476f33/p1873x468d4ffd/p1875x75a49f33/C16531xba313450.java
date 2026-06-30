package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar */
/* loaded from: classes10.dex */
public class C16531xba313450 extends android.view.View {
    public android.graphics.Rect A;
    public android.graphics.Rect B;
    public boolean C;
    public final android.view.View.OnTouchListener D;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b f230369d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f230370e;

    /* renamed from: f, reason: collision with root package name */
    public int f230371f;

    /* renamed from: g, reason: collision with root package name */
    public int f230372g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f230373h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f230374i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f230375m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f230376n;

    /* renamed from: o, reason: collision with root package name */
    public int f230377o;

    /* renamed from: p, reason: collision with root package name */
    public int f230378p;

    /* renamed from: q, reason: collision with root package name */
    public float f230379q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f230380r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f230381s;

    /* renamed from: t, reason: collision with root package name */
    public int f230382t;

    /* renamed from: u, reason: collision with root package name */
    public float f230383u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f230384v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f230385w;

    /* renamed from: x, reason: collision with root package name */
    public float f230386x;

    /* renamed from: y, reason: collision with root package name */
    public int f230387y;

    /* renamed from: z, reason: collision with root package name */
    public int f230388z;

    public C16531xba313450(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (c16531xba313450.f230370e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = c16531xba313450.f230388z;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450, boolean z17) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2 = c16531xba313450.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z17);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!c16531xba313450.f230370e || (drawable = c16531xba313450.f230375m) == null || c16531xba313450.f230376n == null || drawable.getBounds().width() <= 0 || c16531xba313450.f230376n.getBounds().width() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c cVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c) c16531xba313450.f230375m : (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c) c16531xba313450.f230376n;
        if (cVar.f230523a != z18) {
            cVar.f230523a = z18;
            cVar.f230526d.invalidate();
        }
        c16531xba313450.postInvalidate();
    }

    public void d(int i17, int i18, int i19) {
        int i27 = this.f230377o;
        if (i17 <= i27 * 2) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        this.f230370e = true;
        this.f230387y = i19;
        this.f230371f = i17;
        this.f230372g = i18;
        if (this.C) {
            this.f230375m.setBounds(i19 - i27, 0, i19, getHeight());
            android.graphics.drawable.Drawable drawable = this.f230376n;
            int i28 = this.f230387y + this.f230371f;
            drawable.setBounds(i28, 0, this.f230377o + i28, getHeight());
        } else {
            this.f230375m.setBounds(i19 - i27, 0, i19, getHeight());
            android.graphics.drawable.Drawable drawable2 = this.f230376n;
            int i29 = this.f230387y + this.f230371f;
            drawable2.setBounds(i29, 0, this.f230377o + i29, getHeight());
        }
        if (this.A == null && this.B == null) {
            this.A = new android.graphics.Rect(this.f230375m.getBounds().left, this.f230375m.getBounds().top, this.f230375m.getBounds().right, this.f230375m.getBounds().bottom);
            this.B = new android.graphics.Rect(this.f230376n.getBounds().left, this.f230376n.getBounds().top, this.f230376n.getBounds().right, this.f230376n.getBounds().bottom);
        }
        invalidate();
    }

    public final boolean e(boolean z17) {
        return z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c) this.f230375m).f230523a : ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c) this.f230376n).f230523a;
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f230370e || (drawable = this.f230375m) == null || this.f230376n == null || drawable.getBounds().width() <= 0 || this.f230376n.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f230376n.getBounds().left - this.f230372g;
            f18 = java.lang.Math.max(this.f230387y, this.f230376n.getBounds().left - this.f230371f);
        } else {
            f18 = this.f230375m.getBounds().right + this.f230372g;
            min = java.lang.Math.min(this.f230387y + this.f230371f, this.f230375m.getBounds().right + this.f230371f);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f230375m.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f230377o), 0);
            this.f230375m.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f230376n.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f230376n.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    /* renamed from: getLeftSliderBound */
    public int m66829xcc839460() {
        return this.f230375m.getBounds().right - this.f230387y;
    }

    /* renamed from: getRightSliderBound */
    public int m66830x961e58d7() {
        return this.f230376n.getBounds().left - this.f230387y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f230379q > 0.0f) {
            float width = getWidth() * this.f230379q;
            int i17 = this.f230378p;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f230380r);
        }
        if (this.f230370e) {
            int centerX = this.f230375m.getBounds().centerX();
            int centerX2 = this.f230376n.getBounds().centerX();
            if ((e(true) || e(false)) && this.C) {
                float f17 = this.f230387y;
                float f18 = this.f230386x;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f230387y) - this.f230386x, getBottom() - this.f230386x, this.f230385w);
            }
            if (this.f230375m.getBounds().left > 0) {
                canvas.drawRect(this.f230387y, 0.0f, centerX, getHeight(), this.f230384v);
            }
            if (this.f230376n.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth() - this.f230387y, getHeight(), this.f230384v);
            }
            if (this.C) {
                float f19 = centerX;
                float f27 = this.f230383u;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f230381s);
                canvas.drawLine(f19, getHeight() - this.f230383u, f28, getHeight() - this.f230383u, this.f230381s);
            }
            this.f230375m.draw(canvas);
            this.f230376n.draw(canvas);
        }
    }

    /* renamed from: setCursorPos */
    public void m66831x853690dc(float f17) {
        if (this.f230370e) {
            this.f230379q = f17;
            invalidate();
        }
    }

    /* renamed from: setEnableHapticAtEdge */
    public void m66832x4c2ebf2c(boolean z17) {
        this.f230374i = z17;
    }

    /* renamed from: setMaskColor */
    public void m66833x571ddd95(int i17) {
        this.f230384v.setColor(i17);
    }

    /* renamed from: setOnSliderTouchListener */
    public void m66834x5e352211(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b bVar) {
        this.f230369d = bVar;
    }

    public C16531xba313450(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230370e = false;
        this.f230373h = false;
        this.f230374i = false;
        this.f230379q = -1.0f;
        this.f230387y = 0;
        this.C = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a(this);
        this.D = aVar;
        this.f230377o = i65.a.b(getContext(), 8);
        this.f230388z = i65.a.b(getContext(), 8);
        this.f230375m = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.f230376n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.c(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.C = true;
        postInvalidate();
        this.f230378p = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ad_);
        this.f230379q = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230380r = paint;
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230380r.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f230384v = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f230384v.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f230381s = paint3;
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230381s.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f230382t = round;
        this.f230381s.setStrokeWidth(round);
        this.f230383u = this.f230382t * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f230385w = paint4;
        paint4.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        this.f230385w.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f230386x = 0.5f * round2;
        this.f230385w.setStrokeWidth(round2);
        this.f230385w.setAlpha(178);
        setOnTouchListener(aVar);
    }
}
