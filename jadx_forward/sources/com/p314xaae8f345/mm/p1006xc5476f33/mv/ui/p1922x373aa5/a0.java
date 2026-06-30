package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: v, reason: collision with root package name */
    public static final float f233289v = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final float f233290w = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 28);

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String f233291x = "MicroMsg.LyricItemDecoration";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f233292d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f233293e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f233294f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f233295g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f233296h;

    /* renamed from: i, reason: collision with root package name */
    public int f233297i;

    /* renamed from: m, reason: collision with root package name */
    public int f233298m;

    /* renamed from: n, reason: collision with root package name */
    public float f233299n;

    /* renamed from: o, reason: collision with root package name */
    public float f233300o;

    /* renamed from: p, reason: collision with root package name */
    public int f233301p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f233302q;

    /* renamed from: r, reason: collision with root package name */
    public long f233303r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f233304s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f233305t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f233306u;

    public a0(android.content.Context ctx, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 lyricRv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricRv, "lyricRv");
        this.f233292d = ctx;
        this.f233293e = lyricRv;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f233294f = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f233295g = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f233296h = paint3;
        this.f233297i = 2;
        this.f233298m = 1;
        float f17 = f233289v;
        this.f233299n = f17;
        this.f233300o = f17;
        this.f233301p = 2;
        this.f233304s = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t.f233481d);
        this.f233305t = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.u.f233487d);
        this.f233306u = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.s.f233476d);
        paint.setColor(b3.l.m9702x7444d5ad(ctx, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint2.setColor(b3.l.m9702x7444d5ad(ctx, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint3.setColor(b3.l.m9702x7444d5ad(ctx, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
    }

    public final android.animation.ValueAnimator d() {
        return (android.animation.ValueAnimator) ((jz5.n) this.f233306u).mo141623x754a37bb();
    }

    public final float e(int i17) {
        return i17 == this.f233298m ? this.f233300o : i17 == this.f233297i ? this.f233299n : f233289v;
    }

    public final void f(long j17) {
        float f17 = f233289v;
        this.f233300o = f17;
        this.f233299n = f17;
        this.f233293e.invalidate();
        if (j17 > 5000) {
            j17 = 3000;
        }
        int i17 = (int) j17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofInt);
        ofInt.setDuration(i17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v(this));
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w(i17, this, c0Var3, c0Var2, c0Var));
        ofInt.cancel();
        ofInt.start();
        d().addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.x(this));
    }

    public final void g(long j17) {
        boolean z17 = this.f233302q;
        java.lang.String str = f233291x;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAnim");
        this.f233302q = true;
        this.f233297i = 2;
        this.f233298m = 1;
        float f17 = f233289v;
        this.f233299n = f17;
        this.f233300o = f17;
        this.f233301p = 2;
        android.graphics.Paint paint = this.f233294f;
        android.content.Context context = this.f233292d;
        paint.setColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        this.f233295g.setColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        this.f233296h.setColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        long j18 = this.f233303r - j17;
        if (j18 <= 5000) {
            if (j18 >= 3000) {
                f(j18);
                return;
            } else {
                this.f233302q = false;
                return;
            }
        }
        jz5.g gVar = this.f233304s;
        ((android.animation.ValueAnimator) ((jz5.n) gVar).mo141623x754a37bb()).addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.y(j18, this));
        jz5.g gVar2 = this.f233305t;
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).mo141623x754a37bb()).addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.z(j18, this));
        ((android.animation.ValueAnimator) ((jz5.n) gVar).mo141623x754a37bb()).cancel();
        ((android.animation.ValueAnimator) ((jz5.n) gVar).mo141623x754a37bb()).start();
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).mo141623x754a37bb()).cancel();
        ((android.animation.ValueAnimator) ((jz5.n) gVar2).mo141623x754a37bb()).start();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 == -1) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        if (u07 == 0) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            outRect.top = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.f233213J;
        } else if (u07 != mo1894x7e414b06 - 1) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            outRect.top = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
        } else {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            outRect.top = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            outRect.bottom = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.f233213J;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(canvas, parent, state);
        if (this.f233302q && parent.getChildCount() > 0) {
            android.view.View childAt = parent.getChildAt(0);
            if (parent.u0(childAt) != 0) {
                return;
            }
            float f17 = f233289v;
            float top = childAt.getTop();
            float f18 = f233290w;
            canvas.drawCircle((f17 * 0.2f) + f17, top - f18, e(0), this.f233294f);
            canvas.drawCircle((4 * f17) + (f17 * 0.2f), childAt.getTop() - f18, e(1), this.f233295g);
            canvas.drawCircle((7 * f17) + (f17 * 0.2f), childAt.getTop() - f18, e(2), this.f233296h);
        }
    }
}
