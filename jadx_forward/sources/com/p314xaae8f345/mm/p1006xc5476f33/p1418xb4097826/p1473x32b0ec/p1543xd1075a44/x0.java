package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public abstract class x0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 B;
    public p3325xe03a0797.p3326xc267989b.y0 C;
    public boolean D;
    public boolean E;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f201787e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f201788f;

    /* renamed from: g, reason: collision with root package name */
    public final zl2.u4 f201789g;

    /* renamed from: h, reason: collision with root package name */
    public final float f201790h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f201791i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f201792m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f201793n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f0 f201794o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f201795p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f201796q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f201797r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f201798s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f201799t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f201800u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f201801v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f201802w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f201803x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f201804y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f201805z;

    public x0(android.content.Context context, boolean z17, zl2.u4 uiMode, float f17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? true : z17;
        uiMode = (i17 & 4) != 0 ? zl2.u4.f555521d : uiMode;
        f17 = (i17 & 8) != 0 ? -1.0f : f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        this.f201787e = context;
        this.f201788f = z17;
        this.f201789g = uiMode;
        this.f201790h = f17;
        this.f201795p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q0(this));
        this.f201796q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t0(this));
        this.f201797r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h0(this));
        this.f201798s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u0(this));
        this.f201799t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j0(this));
        this.f201800u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g0(this));
        this.f201801v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i0(this));
        this.f201802w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p0(this));
        this.f201803x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r0(this));
        this.f201804y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s0(this));
        this.f201805z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v0(this));
    }

    public static void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePanel");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var2 = x0Var.B;
        if (x0Var2 != null) {
            if (x0Var2.u()) {
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var3 = x0Var.B;
                    if (x0Var3 != null && (y1Var3 = x0Var3.A) != null) {
                        y1Var3.g(x0Var);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var4 = x0Var.B;
                    if (x0Var4 != null && (y1Var2 = x0Var4.A) != null) {
                        y1Var2.c(x0Var, false);
                    }
                }
                x0Var.B = null;
                return;
            }
        }
        x0Var.B = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = x0Var.A;
        if (!(y1Var4 != null && y1Var4.f()) || (y1Var = x0Var.A) == null) {
            return;
        }
        y1Var.q();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return s();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var) {
        return (x0Var != null ? x0Var.B : null) == null ? x0Var : r(x0Var.B);
    }

    public final android.view.View s() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f201798s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe t() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f201792m;
        if (c1190x18d3c3fe != null) {
            return c1190x18d3c3fe;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
        throw null;
    }

    public boolean u() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = this.A;
        if (y1Var2 != null && y1Var2.f()) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var = this.B;
        return x0Var != null && (y1Var = x0Var.A) != null && y1Var.f();
    }

    public abstract void v();

    public final void w(int i17) {
        if (i17 >= 0 && i17 < ((fn2.s1) this).H.length) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f201791i;
            if (c2718xca2902ff == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            oa.i k17 = c2718xca2902ff.k(i17);
            if (k17 != null) {
                k17.b();
            }
            if (t().m8300xfda78ef6() != i17) {
                t().m8316x940d026a(i17);
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f201793n;
            if (onPageChangeListener != null) {
                onPageChangeListener.mo8333x510f45c9(i17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageChangeListener");
                throw null;
            }
        }
    }
}
