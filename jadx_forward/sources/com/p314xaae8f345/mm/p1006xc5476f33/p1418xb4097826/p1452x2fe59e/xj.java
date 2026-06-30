package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192605a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f192606b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f192607c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f192608d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f192609e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.x2 f192610f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f192611g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f192612h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f192613i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f192614j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hj f192615k;

    /* renamed from: l, reason: collision with root package name */
    public qr2.a f192616l;

    public xj(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f192605a = context;
        this.f192606b = presenter;
        android.view.View findViewById = context.findViewById(com.p314xaae8f345.mm.R.id.lr8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) findViewById;
        this.f192607c = c15343x638a173f;
        android.view.View findViewById2 = context.findViewById(com.p314xaae8f345.mm.R.id.f567991la3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f192608d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2;
        this.f192610f = new so2.x2();
        this.f192611g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kj(this));
        this.f192612h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lj(this));
        this.f192615k = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hj(this, c15343x638a173f);
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f192605a;
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.iql);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.ipw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            layoutParams2.topMargin = pm0.v.t(findViewById2)[1] + findViewById2.getHeight();
        }
        android.view.View findViewById3 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.iql);
        if (findViewById3 != null) {
            findViewById3.requestLayout();
        }
    }

    public final void b(android.widget.TextView textView, int i17, so2.u1 u1Var, android.content.Context context, yz5.a aVar, boolean z17) {
        r45.rz0 rz0Var;
        if (this.f192614j) {
            return;
        }
        int i18 = 0;
        if (i17 <= 0) {
            if (z17) {
                this.f192613i = false;
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        r45.dm2 m76806xdef68064 = u1Var.getFeedObject().m59240x7c94657b().m76806xdef68064();
        if (m76806xdef68064 != null && (rz0Var = (r45.rz0) m76806xdef68064.m75936x14adae67(38)) != null) {
            i18 = rz0Var.m75939xb282bd08(0);
        }
        java.lang.String string = i18 != 1 ? i18 != 2 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2q, java.lang.Integer.valueOf(i17)) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2r, java.lang.Integer.valueOf(i17)) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2p, java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        textView.setText(string);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jj jjVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jj(this, textView, i17, u1Var, context, aVar, z17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(jjVar, 1000L, "MicroMsg.FinderLongVideoRelViewCallback");
    }

    public final void c(qr2.a aVar) {
        if (aVar != null) {
            qr2.a aVar2 = this.f192616l;
            if (aVar2 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f192609e;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                c22848x6ddd90cf.i0(aVar2.mo2128x1ed62e84(), false);
                this.f192616l = null;
            }
            this.f192616l = aVar;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f192609e;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            if (c22848x6ddd90cf2.m82898xfb7e5820().size() > 0) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f192609e;
                if (c22848x6ddd90cf3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                if (c22848x6ddd90cf3.W(aVar)) {
                    return;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = this.f192609e;
                if (c22848x6ddd90cf4 != null) {
                    c22848x6ddd90cf4.R(aVar, false, 0);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r6 = this;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f192609e
            java.lang.String r1 = "adapter"
            r2 = 0
            if (r0 == 0) goto L57
            java.util.List r0 = r0.m82898xfb7e5820()
            int r0 = r0.size()
            if (r0 <= 0) goto L56
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f192609e
            if (r0 == 0) goto L52
            so2.x2 r3 = r6.f192610f
            boolean r0 = r0.W(r3)
            if (r0 != 0) goto L56
            qr2.a r0 = r6.f192616l
            r4 = 0
            if (r0 == 0) goto L43
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r6.f192609e
            if (r5 == 0) goto L3f
            boolean r5 = r5.W(r0)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto L43
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f192609e
            if (r0 == 0) goto L3b
            r5 = 1
            r0.R(r3, r4, r5)
            jz5.f0 r0 = jz5.f0.f384359a
            goto L44
        L3b:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L3f:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L56
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f192609e
            if (r0 == 0) goto L4e
            r0.Q(r3, r4)
            goto L56
        L4e:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L52:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L56:
            return
        L57:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj.d():void");
    }

    public final android.view.View e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f192611g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void f(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f192609e;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8147xed6e4d18(i17 + c22848x6ddd90cf.a0());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    public final void g(boolean z17) {
        android.view.View findViewById = this.f192605a.findViewById(com.p314xaae8f345.mm.R.id.iql);
        if (findViewById != null) {
            findViewById.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qj(this));
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
