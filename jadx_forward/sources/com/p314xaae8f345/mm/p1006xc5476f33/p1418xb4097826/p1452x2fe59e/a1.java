package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class a1 implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f187707d;

    /* renamed from: e, reason: collision with root package name */
    public final int f187708e;

    /* renamed from: f, reason: collision with root package name */
    public final int f187709f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f187710g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f187711h;

    /* renamed from: i, reason: collision with root package name */
    public final int f187712i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f187713m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f187714n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 f187715o;

    /* renamed from: p, reason: collision with root package name */
    public final int f187716p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 f187717q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f187718r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f187719s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f187720t;

    public a1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, boolean z17, int i19, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f187707d = context;
        this.f187708e = i18;
        this.f187709f = i19;
        this.f187710g = z18;
        this.f187711h = "Finder.FinderBaseGridFeedUIContract.ViewCallback";
        this.f187712i = 3;
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        this.f187713m = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) l17;
        this.f187716p = -1;
        this.f187717q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0(0, null, 3, null);
        this.f187720t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m0(this));
    }

    public android.view.View A() {
        return null;
    }

    public abstract java.lang.CharSequence B(ym5.s3 s3Var);

    public void C(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public void D(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public boolean E(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return false;
    }

    public float F() {
        return 0.0f;
    }

    public final boolean G(r45.qt2 qt2Var) {
        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
        boolean z17 = m75939xb282bd08 == 22 || m75939xb282bd08 == 26 || m75939xb282bd08 == 28 || m75939xb282bd08 == 30 || m75939xb282bd08 == 81 || m75939xb282bd08 == 138 || m75939xb282bd08 == 155;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187711h, "needMarkRead:" + z17 + " commentScene:" + qt2Var.m75939xb282bd08(5) + " fromCommentScene:" + qt2Var.m75939xb282bd08(7));
        return z17;
    }

    public final boolean H(r45.qt2 qt2Var) {
        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
        boolean z17 = m75939xb282bd08 == 95 || m75939xb282bd08 == 138 || m75939xb282bd08 == 195;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187711h, "needReportWhiteScreen:" + z17 + " commentScene:" + qt2Var.m75939xb282bd08(5) + " fromCommentScene:" + qt2Var.m75939xb282bd08(7));
        return z17;
    }

    public boolean I() {
        return false;
    }

    public void J(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public abstract void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, android.view.View view, int i17);

    public void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    public abstract void M();

    public void N(boolean z17) {
    }

    public void O(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public void P() {
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x0(this));
    }

    public boolean Q(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return false;
    }

    public boolean R() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa);
    }

    public boolean S() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa);
    }

    public final void T(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 k0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<set-?>");
        this.f187715o = k0Var;
    }

    public void U() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187711h, "showEmptyView");
        android.view.View t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f187713m;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean V() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co;
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa() {
        return this.f187713m.m82555x4905e9fa();
    }

    public final android.view.View l(int i17) {
        android.view.View findViewById;
        android.view.View A = A();
        return (A == null || (findViewById = A.findViewById(i17)) == null) ? this.f187707d.findViewById(i17) : findViewById;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf o() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f187714n;
        if (c22848x6ddd90cf != null) {
            return c22848x6ddd90cf;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 q() {
        return this.f187717q;
    }

    public void r(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187707d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y17 = y(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "<set-?>");
        m82555x4905e9fa.mo7967x900dcbe1(y17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n0(data, this, z().c(), I());
        this.f187714n = n0Var;
        m82555x4905e9fa.mo7960x6cab2c8d(n0Var);
        m82555x4905e9fa.N(x());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f187714n;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o0(this);
        c22848x6ddd90cf.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p0(this);
        android.view.View w17 = w();
        this.f187718r = w17;
        if (w17 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f187714n;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            in5.n0.U(c22848x6ddd90cf2, w17, 0, false, 4, null);
        }
        android.view.View v17 = v();
        this.f187719s = v17;
        if (v17 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f187714n;
            if (c22848x6ddd90cf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf3.O(v17, this.f187716p, false);
        }
        this.f187713m.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u0(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        int i17 = this.f187709f;
        fc2.o Z6 = nyVar.Z6(i17);
        if (Z6 != null) {
            Z6.d(m82555x4905e9fa);
        }
        P();
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.S1().r()).intValue() == 1) {
            m82555x4905e9fa.i(u());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17;
        r45.qt2 W6 = nyVar2.n7() ? nyVar2.W6(i17) : nyVar2.V6();
        if (G(W6) || H(W6)) {
            in5.o.b(m82555x4905e9fa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y0(this, W6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w0(this, W6), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v0(this, W6), F()), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z0.f192752d);
        } else {
            z().f188692h.b(m82555x4905e9fa, W6);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            or2.j.f429189a.a(m82555x4905e9fa, getClass().getSimpleName());
        }
    }

    public abstract java.lang.String s(ym5.s3 s3Var);

    public abstract android.view.View t();

    public final sc2.c8 u() {
        return (sc2.c8) ((jz5.n) this.f187720t).mo141623x754a37bb();
    }

    public android.view.View v() {
        return null;
    }

    public abstract android.view.View w();

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x();

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context);

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 k0Var = this.f187715o;
        if (k0Var != null) {
            return k0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("present");
        throw null;
    }

    public /* synthetic */ a1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18, boolean z17, int i19, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(abstractActivityC21394xb3d2c0cf, i17, i18, (i27 & 8) != 0 ? false : z17, (i27 & 16) != 0 ? -1 : i19, (i27 & 32) != 0 ? false : z18);
    }
}
