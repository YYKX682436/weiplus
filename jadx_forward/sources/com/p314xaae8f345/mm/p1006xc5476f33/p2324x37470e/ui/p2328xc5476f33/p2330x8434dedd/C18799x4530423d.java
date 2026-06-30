package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd;

/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar */
/* loaded from: classes10.dex */
public class C18799x4530423d extends android.view.View {
    public int A;
    public android.graphics.Paint B;
    public float C;
    public int D;
    public int E;
    public android.graphics.Rect F;
    public android.graphics.Rect G;
    public final boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnTouchListener f257446J;

    /* renamed from: d, reason: collision with root package name */
    public fp4.c f257447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f257448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f257449f;

    /* renamed from: g, reason: collision with root package name */
    public int f257450g;

    /* renamed from: h, reason: collision with root package name */
    public int f257451h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257452i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257453m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f257454n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f257455o;

    /* renamed from: p, reason: collision with root package name */
    public int f257456p;

    /* renamed from: q, reason: collision with root package name */
    public float f257457q;

    /* renamed from: r, reason: collision with root package name */
    public int f257458r;

    /* renamed from: s, reason: collision with root package name */
    public float f257459s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f257460t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f257461u;

    /* renamed from: v, reason: collision with root package name */
    public int f257462v;

    /* renamed from: w, reason: collision with root package name */
    public float f257463w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f257464x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Paint f257465y;

    /* renamed from: z, reason: collision with root package name */
    public int f257466z;

    public C18799x4530423d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d c18799x4530423d, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!c18799x4530423d.f257448e || (drawable = c18799x4530423d.f257454n) == null || c18799x4530423d.f257455o == null || drawable.getBounds().width() <= 0 || c18799x4530423d.f257455o.getBounds().width() <= 0) {
            return;
        }
        fp4.d dVar = z17 ? (fp4.d) c18799x4530423d.f257454n : (fp4.d) c18799x4530423d.f257455o;
        if (dVar.f346888a != z18) {
            dVar.f346888a = z18;
            dVar.f346891d.invalidate();
        }
        c18799x4530423d.postInvalidate();
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d c18799x4530423d, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (c18799x4530423d.f257448e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = c18799x4530423d.E;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(boolean z17) {
        return z17 ? ((fp4.d) this.f257454n).f346888a : ((fp4.d) this.f257455o).f346888a;
    }

    public void d() {
        this.f257454n = new fp4.d(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78075x95a65a24), i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78075x95a65a24));
        this.f257455o = new fp4.d(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78075x95a65a24), i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78075x95a65a24));
        this.I = false;
        int b17 = i65.a.b(getContext(), 16);
        this.f257456p = b17;
        this.f257457q = b17 * 0.5f;
        this.E = i65.a.b(getContext(), 8);
        e();
        postInvalidate();
    }

    public final void e() {
        android.graphics.drawable.Drawable drawable = this.f257454n;
        int i17 = this.D;
        int i18 = this.f257456p;
        drawable.setBounds(i17 - (i18 / 2), 0, i17 + (i18 / 2), getHeight());
        android.graphics.drawable.Drawable drawable2 = this.f257455o;
        int i19 = this.D;
        int i27 = this.f257450g;
        int i28 = this.f257456p;
        drawable2.setBounds((i19 + i27) - (i28 / 2), 0, i27 + i19 + (i28 / 2), getHeight());
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f257448e || (drawable = this.f257454n) == null || this.f257455o == null || drawable.getBounds().width() <= 0 || this.f257455o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = (this.f257455o.getBounds().right - this.f257451h) + this.f257457q;
            f18 = java.lang.Math.max(this.D, (this.f257455o.getBounds().right - this.f257450g) - this.f257457q);
        } else {
            f18 = (this.f257454n.getBounds().left + this.f257451h) - this.f257457q;
            min = java.lang.Math.min(getWidth() - this.D, this.f257454n.getBounds().left + this.f257450g + this.f257457q);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f257454n.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f257457q), 0);
            this.f257454n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f257455o.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max - this.f257457q), 0);
            this.f257455o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    /* renamed from: getLeftSliderBound */
    public int m72556xcc839460() {
        return (int) (this.f257454n.getBounds().left + this.f257457q);
    }

    /* renamed from: getRightSliderBound */
    public int m72557x961e58d7() {
        return (int) (this.f257455o.getBounds().right - this.f257457q);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f257459s > 0.0f) {
            float width = getWidth() * this.f257459s;
            int i17 = this.f257458r;
            canvas.drawRect(width - (i17 * 0.5f), this.f257466z, width + (i17 * 0.5f), r2 + (this.I ? getHeight() : this.A), this.f257460t);
        }
        if (this.f257448e) {
            int centerX = this.f257454n.getBounds().centerX();
            int centerX2 = this.f257455o.getBounds().centerX();
            if ((c(true) || c(false)) && this.I) {
                float f17 = this.D;
                float f18 = this.C;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.D) - this.C, getBottom() - this.C, this.B);
            }
            if (this.f257454n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f257464x);
            }
            if (this.f257455o.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f257464x);
            }
            if (this.H && this.A != 0) {
                canvas.drawRect(centerX, this.f257466z - getTop(), centerX2, (this.f257466z + this.A) - getTop(), this.f257465y);
            }
            if (this.I) {
                float f19 = centerX;
                float f27 = this.f257463w;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f257461u);
                canvas.drawLine(f19, getHeight() - this.f257463w, f28, getHeight() - this.f257463w, this.f257461u);
            }
            this.f257454n.draw(canvas);
            this.f257455o.draw(canvas);
        }
    }

    /* renamed from: setContentHeight */
    public void m72558x2925d5be(int i17) {
        this.A = i17;
    }

    /* renamed from: setContentTop */
    public void m72559x2c299c1e(int i17) {
        this.f257466z = i17;
    }

    /* renamed from: setCursorPos */
    public void m72560x853690dc(float f17) {
        if (this.f257448e) {
            this.f257459s = f17;
            invalidate();
        }
    }

    /* renamed from: setEnableHapticAtEdge */
    public void m72561x4c2ebf2c(boolean z17) {
        this.f257453m = z17;
    }

    /* renamed from: setMaskColor */
    public void m72562x571ddd95(int i17) {
        this.f257464x.setColor(i17);
    }

    /* renamed from: setOnSliderTouchListener */
    public void m72563x5e352211(fp4.c cVar) {
        this.f257447d = cVar;
    }

    public C18799x4530423d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f257448e = false;
        this.f257449f = false;
        this.f257452i = false;
        this.f257453m = false;
        this.f257459s = -1.0f;
        this.f257466z = 0;
        this.A = 0;
        this.D = 0;
        this.H = true;
        this.I = true;
        fp4.b bVar = new fp4.b(this);
        this.f257446J = bVar;
        int b17 = i65.a.b(getContext(), 8);
        this.f257456p = b17;
        this.f257457q = b17 * 0.5f;
        this.E = i65.a.b(getContext(), 16);
        this.f257454n = new fp4.d(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.f257455o = new fp4.d(this, i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81292xf45a28e), i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f81291x9647cd9a));
        this.I = true;
        postInvalidate();
        this.f257458r = i65.a.b(getContext(), 2);
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ad_);
        this.f257459s = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257460t = paint;
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        this.f257460t.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f257464x = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        this.f257464x.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f257465y = paint3;
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        this.f257465y.setAlpha(102);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f257461u = paint4;
        paint4.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f257461u.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f257462v = round;
        this.f257461u.setStrokeWidth(round);
        this.f257463w = this.f257462v * 0.5f;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.B = paint5;
        paint5.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.B.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.C = 0.5f * round2;
        this.B.setStrokeWidth(round2);
        this.B.setAlpha(178);
        setOnTouchListener(bVar);
    }
}
