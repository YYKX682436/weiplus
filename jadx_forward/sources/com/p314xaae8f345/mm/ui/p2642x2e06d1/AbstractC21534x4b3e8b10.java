package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.VerticalScrollBar */
/* loaded from: classes15.dex */
public abstract class AbstractC21534x4b3e8b10 extends android.view.View {
    public android.content.Context A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public float f279237d;

    /* renamed from: e, reason: collision with root package name */
    public int f279238e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f279239f;

    /* renamed from: g, reason: collision with root package name */
    public int f279240g;

    /* renamed from: h, reason: collision with root package name */
    public float f279241h;

    /* renamed from: i, reason: collision with root package name */
    public float f279242i;

    /* renamed from: m, reason: collision with root package name */
    public float f279243m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279244n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f279245o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f279246p;

    /* renamed from: q, reason: collision with root package name */
    public db5.o9 f279247q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f279248r;

    /* renamed from: s, reason: collision with root package name */
    public int f279249s;

    /* renamed from: t, reason: collision with root package name */
    public int f279250t;

    /* renamed from: u, reason: collision with root package name */
    public int f279251u;

    /* renamed from: v, reason: collision with root package name */
    public int f279252v;

    /* renamed from: w, reason: collision with root package name */
    public int f279253w;

    /* renamed from: x, reason: collision with root package name */
    public int f279254x;

    /* renamed from: y, reason: collision with root package name */
    public int f279255y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f279256z;

    public AbstractC21534x4b3e8b10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279242i = 0.0f;
        this.f279244n = false;
        this.B = 0;
        c();
        this.A = context;
        setFocusable(true);
        setFocusableInTouchMode(true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 3.0f);
        this.f279256z = android.view.View.inflate(context, mo65174x34508176(), null);
        this.f279253w = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, this.f279238e);
        this.f279254x = this.A.getResources().getDisplayMetrics().widthPixels;
        this.f279255y = this.A.getResources().getDisplayMetrics().heightPixels;
        android.view.View view = this.f279256z;
        int i17 = this.f279253w;
        this.f279245o = new db5.d5(view, i17, i17);
        this.f279246p = (android.widget.TextView) this.f279256z.findViewById(com.p314xaae8f345.mm.R.id.mvd);
        this.f279249s = com.p314xaae8f345.mm.ui.zk.c(this.A, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559583a);
        this.f279250t = this.A.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
        this.f279251u = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f279252v = com.p314xaae8f345.mm.ui.zk.a(getContext(), 7);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f279248r = paint;
        paint.setAntiAlias(true);
        this.B = (int) (((((java.lang.Math.max(this.f279255y, this.f279254x) - com.p314xaae8f345.mm.ui.bl.a(this.A)) - com.p314xaae8f345.mm.ui.bl.h(this.A)) - com.p314xaae8f345.mm.ui.bl.c(this.A)) - ((int) (i65.a.f(this.A, com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2) * i65.a.m(this.A)))) / (this.f279239f.length * this.f279237d));
    }

    public void a(android.graphics.Canvas canvas, float f17, float f18, float f19, android.graphics.Paint paint, int i17) {
        canvas.drawCircle(f17, f18, f19, paint);
    }

    public void b(android.graphics.Canvas canvas, float f17, float f18, android.graphics.Paint paint, int i17, boolean z17) {
        java.lang.String str = this.f279239f[i17];
        if (str == null) {
            return;
        }
        canvas.drawText(str, f17, f18, paint);
    }

    public abstract void c();

    public void d(java.lang.String str) {
        this.f279246p.setText(str);
    }

    /* renamed from: getToastLayoutId */
    public abstract int mo65174x34508176();

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 9);
        float a18 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 11);
        this.f279241h = a18;
        int i18 = this.B;
        if (a18 > i18) {
            a18 = i18;
        }
        this.f279241h = a18;
        float f17 = a17;
        if (a18 < f17) {
            a18 = f17;
        }
        this.f279241h = a18;
        this.f279248r.setTextSize(a18);
        float f18 = this.f279242i;
        float f19 = this.f279241h;
        if (f18 != f19) {
            this.f279242i = f19;
            post(new db5.n9(this, measuredHeight, measuredWidth));
        }
        if (this.f279244n && this.f279240g != 0) {
            this.f279248r.setStyle(android.graphics.Paint.Style.FILL);
            this.f279248r.setColor(this.f279251u);
            float f27 = this.f279241h;
            a(canvas, measuredWidth / 2.0f, (f27 / 2.0f) + (this.f279240g * f27 * this.f279237d) + com.p314xaae8f345.mm.ui.zk.a(this.A, 1), this.f279252v, this.f279248r, this.f279240g);
        }
        this.f279248r.setTextAlign(android.graphics.Paint.Align.CENTER);
        int i19 = 0;
        while (i19 < this.f279239f.length) {
            boolean z17 = this.f279244n;
            boolean z18 = z17 && this.f279240g == i19;
            if (z17 && (i17 = this.f279240g) != 0 && i17 == i19) {
                this.f279248r.setColor(this.f279250t);
            } else {
                this.f279248r.setColor(this.f279249s);
            }
            float f28 = this.f279241h;
            b(canvas, measuredWidth / 2, f28 + (i19 * f28 * this.f279237d), this.f279248r, i19, z18);
            i19++;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f279244n = true;
            float y17 = motionEvent.getY();
            this.f279243m = y17;
            if (y17 < 0.0f) {
                this.f279243m = 0.0f;
            }
            if (this.f279243m > getMeasuredHeight()) {
                this.f279243m = getMeasuredHeight();
            }
            int i17 = (int) (this.f279243m / (this.f279241h * this.f279237d));
            java.lang.String[] strArr = this.f279239f;
            if (i17 >= strArr.length) {
                i17 = strArr.length - 1;
            }
            this.f279240g = i17;
            if (i17 == -1) {
                d(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibx));
            } else {
                d(strArr[i17]);
            }
            int a17 = this.f279254x - com.p314xaae8f345.mm.ui.zk.a(getContext(), 120);
            getLocationInWindow(new int[2]);
            float f17 = this.f279241h;
            int i18 = (int) ((((f17 / 2.0f) + ((this.f279240g * f17) * this.f279237d)) - (this.f279253w / 2.0d)) + r6[1]);
            if (motionEvent.getAction() == 0) {
                this.f279245o.showAtLocation(this, 0, a17, i18);
            }
            if (motionEvent.getAction() == 2) {
                db5.d5 d5Var = this.f279245o;
                int i19 = this.f279253w;
                d5Var.update(a17, i18, i19, i19);
            }
            db5.o9 o9Var = this.f279247q;
            if (o9Var != null) {
                int i27 = this.f279240g;
                if (i27 == -1) {
                    o9Var.Q0(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ibx));
                } else {
                    o9Var.Q0(this.f279239f[i27]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f279245o.dismiss();
            db5.o9 o9Var2 = this.f279247q;
            if (o9Var2 != null) {
                int i28 = this.f279240g;
                if (i28 == -1) {
                    o9Var2.O4(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ibx));
                } else {
                    o9Var2.O4(this.f279239f[i28]);
                }
            }
            this.f279244n = false;
        }
        return true;
    }

    /* renamed from: setOnScrollBarTouchListener */
    public void m79298x40d747ee(db5.o9 o9Var) {
        this.f279247q = o9Var;
    }
}
