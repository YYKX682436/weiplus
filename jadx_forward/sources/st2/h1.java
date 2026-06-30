package st2;

/* loaded from: classes3.dex */
public final class h1 implements android.view.View.OnClickListener {
    public android.view.View A;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 B;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public android.view.View H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public xt2.u1 f493865J;
    public st2.p2 K;
    public st2.s1 L;
    public final jz5.g M;
    public boolean N;
    public final tt2.e1 P;
    public final tt2.a Q;
    public final tt2.e1 R;
    public st2.v1 S;
    public int T;
    public boolean U;
    public final java.util.Set V;
    public st2.i1 W;
    public final jz5.g X;
    public boolean Y;
    public final yz5.p Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f493866d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f493867e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f493868f;

    /* renamed from: g, reason: collision with root package name */
    public final dk2.xf f493869g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f493870h;

    /* renamed from: i, reason: collision with root package name */
    public ut2.j5 f493871i;

    /* renamed from: m, reason: collision with root package name */
    public ut2.h4 f493872m;

    /* renamed from: n, reason: collision with root package name */
    public ut2.k0 f493873n;

    /* renamed from: o, reason: collision with root package name */
    public ut2.m0 f493874o;

    /* renamed from: p, reason: collision with root package name */
    public ut2.u3 f493875p;

    /* renamed from: p0, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 f493876p0;

    /* renamed from: q, reason: collision with root package name */
    public bc2.b f493877q;

    /* renamed from: r, reason: collision with root package name */
    public ut2.a4 f493878r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f493879s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a f493880t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 f493881u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f493882v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f493883w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f493884x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashMap f493885x0;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f493886y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.List f493887y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f493888z;

    /* JADX WARN: Removed duplicated region for block: B:44:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1(android.view.ViewGroup r9, qo0.c r10, gk2.e r11, dk2.xf r12, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l r13) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.<init>(android.view.ViewGroup, qo0.c, gk2.e, dk2.xf, com.tencent.mm.plugin.finder.live.plugin.l):void");
    }

    public static /* synthetic */ void P(st2.h1 h1Var, android.os.Bundle bundle, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            z18 = false;
        }
        h1Var.O(bundle, i17, z17, z18);
    }

    public static final int[] a(st2.h1 h1Var) {
        return (int[]) ((jz5.n) h1Var.X).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.x0() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(st2.h1 r6, l81.b1 r7) {
        /*
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r6.f493870h
            if (r0 == 0) goto Lc
            boolean r1 = r0.x0()
            r2 = 1
            if (r1 != r2) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "openFullScreenMiniprogram isLandscape:"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.LiveShoppingListPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            if (r2 == 0) goto L36
            zl2.r4 r1 = zl2.r4.f555483a
            boolean r1 = r1.x1()
            if (r1 != 0) goto L36
            if (r0 == 0) goto L39
            java.lang.String r1 = "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO"
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r7
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(r0, r1, r2, r3, r4, r5)
            goto L39
        L36:
            r6.E(r7)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.b(st2.h1, l81.b1):void");
    }

    public final void A() {
        if (!w() || this.U) {
            return;
        }
        gk2.e eVar = this.f493868f;
        if (((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "has notify visitor shopping:" + this.U);
        int i17 = this.T + 1;
        this.T = i17;
        if (i17 >= 3) {
            this.T = 0;
            return;
        }
        int i18 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        int i19 = i18 | 16;
        dk2.xf xfVar = this.f493869g;
        if (xfVar != null) {
            ((dk2.r4) xfVar).p0(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, i19, 16L, 2, new st2.h0(this));
        }
    }

    public final void B(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "refresh shop page,view visibility:" + this.f493866d.getVisibility());
        int i17 = w() ? 0 : 3;
        if (!(bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SHOPPING_REFRESH_WHEN_OPEN", false) : false) || h().isShowing) {
            P(this, bundle, i17, true, false, 8, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "onLiveShoppingRefresh, try to refresh when shopping list is not opened");
        }
    }

    public final void C(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        if (lVar != null) {
            lVar.K0(8);
        }
        if (w()) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f408976q, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if ((r0.T7() || r0.X7()) != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1  */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.D(android.os.Bundle):void");
    }

    public final void E(l81.b1 b1Var) {
        st2.h2 h2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context = this.f493866d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gk2.e eVar = this.f493868f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        if (lVar == null || (Y0 = lVar.Y0()) == null) {
            h2Var = null;
        } else {
            java.lang.String appId = b1Var.f398547b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            h2Var = new st2.h2(Y0, appId);
        }
        q4Var.l(context, eVar, b1Var, true, h2Var);
    }

    public final void F(l81.b1 b1Var) {
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context = this.f493866d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        q4Var.n(context, this.f493868f, b1Var, lVar != null ? lVar.Y0() : null);
    }

    public final void G() {
        android.content.Context context = this.f493866d.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveShoppingListPlugin", "refreshCouponList, context is not MMActivity");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(lVar, null, null, new st2.o0(abstractActivityC21394xb3d2c0cf, this, null), 3, null);
        }
    }

    public final void H(tt2.e1 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        adapter.f503425w = this.Z;
        adapter.f503426x = new st2.q0(this);
        adapter.f503427y = new st2.r0(this, adapter);
        adapter.f503428z = new st2.s0(this);
        adapter.A = new st2.m(this);
    }

    public final void I(boolean z17) {
        java.lang.String string;
        if (p().getVisibility() != 0 || z17) {
            if (j().getVisibility() != 0 || z17) {
                android.view.View findViewById = k().t().findViewById(com.p314xaae8f345.mm.R.id.flt);
                android.widget.TextView textView = (android.widget.TextView) findViewById;
                d92.f fVar = d92.f.f309003a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                fVar.h(textView, java.lang.Float.valueOf(12.0f));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
                android.widget.TextView textView2 = (android.widget.TextView) findViewById;
                if (w()) {
                    android.view.View j17 = k().j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(j17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    string = "";
                } else {
                    android.view.View findViewById2 = k().j().findViewById(com.p314xaae8f345.mm.R.id.fls);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                    fVar.k(findViewById2, 20.0f, 20.0f);
                    android.view.View findViewById3 = k().j().findViewById(com.p314xaae8f345.mm.R.id.flt);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                    fVar.h((android.widget.TextView) findViewById3, java.lang.Float.valueOf(12.0f));
                    android.view.View j18 = k().j();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(j18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(j18, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    string = this.f493866d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eec);
                }
                textView2.setText(string);
            }
        }
    }

    public final void J() {
        java.util.LinkedList linkedList = ((mm2.f6) this.f493868f.a(mm2.f6.class)).f410576q;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        t(false, false);
        ut2.a4 a4Var = this.f493878r;
        if (a4Var != null) {
            a4Var.b(false, w(), false);
        }
        l().setVisibility(8);
        android.view.View t17 = k().t();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(0);
        o().setVisibility(8);
        I(false);
        d(java.lang.Boolean.TRUE);
        h().post(new st2.w0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        if (lVar != null) {
            lVar.K0(0);
        }
    }

    public final void K(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.B;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("couponList");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCouponList", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCouponList", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.B;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("couponList");
            throw null;
        }
        c1163xf1deaba42.setVisibility(0);
        R();
        boolean z18 = !z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "showSecondaryPage " + z18);
        p().setVisibility(0);
        if (z18) {
            p().setTranslationX(0.0f);
        } else {
            p().setTranslationX(q().getWidth());
            p().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(0.0f).setListener(null).start();
        }
        if (x()) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(1, 3, 0);
        }
    }

    public final void L() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "showEmptyShoppingPanel");
        l().setVisibility(8);
        o().setVisibility(8);
        ut2.a4 a4Var = this.f493878r;
        if (a4Var != null) {
            a4Var.b(false, w(), false);
        }
        android.view.View view = this.H;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h().post(new st2.w0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        if (lVar != null) {
            lVar.K0(0);
        }
    }

    public final void M(boolean z17) {
        ut2.a4 a4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "showEmptyContent");
        android.view.View m17 = k().m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        try {
            if (this.f493878r == null) {
                st2.g3 g3Var = st2.g3.f493859a;
                android.view.ViewGroup root = this.f493866d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
                android.view.View inflate = ((android.view.ViewStub) root.findViewById(com.p314xaae8f345.mm.R.id.flj)).inflate();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                this.f493878r = new ut2.a4(inflate, this);
            }
            r45.dv1 dv1Var = ((mm2.f6) this.f493868f.a(mm2.f6.class)).P;
            if (dv1Var != null && (a4Var = this.f493878r) != null) {
                a4Var.a(dv1Var);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.LiveShoppingListPlugin-initEmptyHolder");
        }
        ut2.a4 a4Var2 = this.f493878r;
        if (a4Var2 != null) {
            a4Var2.b(true, w(), z17);
        }
        l().setVisibility(8);
        android.view.View t17 = k().t();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        I(false);
        o().setVisibility(8);
        ut2.a4 a4Var3 = this.f493878r;
        if (a4Var3 == null || a4Var3.f512354c.getVisibility() != 0) {
            return;
        }
        a4Var3.f512353b.h().getViewTreeObserver().addOnGlobalLayoutListener(new ut2.z3(a4Var3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0525, code lost:
    
        if (r6 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if ((!r6.isEmpty()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(qm0.a r51, android.os.Bundle r52) {
        /*
            Method dump skipped, instructions count: 3397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.N(qm0.a, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(android.os.Bundle r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.O(android.os.Bundle, int, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0250, code lost:
    
        if (r14.f116804d == 3) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0541  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(qm0.a r37, java.util.List r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.Q(qm0.a, java.util.List, java.util.List):void");
    }

    public final void R() {
        java.util.List list;
        r45.zv2 zv2Var;
        java.util.LinkedList<r45.ov2> m75941xfb821914;
        gk2.e eVar = this.f493868f;
        java.util.List O6 = ((mm2.f6) eVar.a(mm2.f6.class)).O6();
        java.util.List instantDiscountList = ((mm2.f6) eVar.a(mm2.f6.class)).f410577r;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var == null || (zv2Var = (r45.zv2) dv1Var.m75936x14adae67(34)) == null || (m75941xfb821914 = zv2Var.m75941xfb821914(0)) == null) {
            list = kz5.p0.f395529d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.ov2 ov2Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ov2Var);
                arrayList.add(new cm2.k0(ov2Var));
            }
            list = kz5.n0.S0(arrayList);
        }
        tt2.a aVar = this.Q;
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instantDiscountList, "instantDiscountList");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) aVar.f503357f;
        arrayList2.clear();
        arrayList2.addAll(O6);
        aVar.f503358g = instantDiscountList;
        aVar.f503359h = list;
        java.util.LinkedList linkedList = aVar.f503360i;
        linkedList.clear();
        linkedList.addAll(aVar.x());
        aVar.m8146xced61ae5();
    }

    public final void S() {
        java.lang.Object obj;
        gk2.e eVar = this.f493868f;
        so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410582w;
        if (j5Var instanceof cm2.k0) {
            qo0.b bVar = qo0.b.N2;
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator it = ((mm2.f6) eVar.a(mm2.f6.class)).O6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var2 = (so2.j5) obj;
                if ((j5Var2 instanceof cm2.k0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cm2.k0) j5Var2).f124895x, ((cm2.k0) j5Var).f124895x)) {
                    break;
                }
            }
            so2.j5 j5Var3 = (so2.j5) obj;
            if (j5Var3 != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", ((cm2.k0) j5Var3).f124893v.mo14344x5f01b1f6());
            }
            this.f493867e.mo46557x60d69242(bVar, bundle);
        }
    }

    public final void c() {
        java.lang.String str;
        java.lang.String str2;
        r45.c33 c33Var;
        r45.c33 c33Var2;
        r45.c33 c33Var3;
        r45.c33 c33Var4;
        gk2.e eVar = this.f493868f;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        java.lang.String str3 = null;
        bw5.x7 x7Var = dv1Var != null ? (bw5.x7) dv1Var.m75936x14adae67(42) : null;
        if (x7Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "add product jump");
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = h().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add product appId:");
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        sb6.append((dv1Var2 == null || (c33Var4 = (r45.c33) dv1Var2.m75936x14adae67(2)) == null) ? null : c33Var4.m75945x2fec8307(0));
        sb6.append(",path:");
        r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        if (dv1Var3 != null && (c33Var3 = (r45.c33) dv1Var3.m75936x14adae67(2)) != null) {
            str3 = c33Var3.m75945x2fec8307(1);
        }
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        st2.g gVar = new st2.g(this);
        java.lang.String obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
        l81.b1 b1Var = new l81.b1();
        r45.dv1 dv1Var4 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        if (dv1Var4 == null || (c33Var2 = (r45.c33) dv1Var4.m75936x14adae67(2)) == null || (str = c33Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        b1Var.f398547b = str;
        st2.c2 c2Var = st2.c2.f493782a;
        r45.dv1 dv1Var5 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
        if (dv1Var5 == null || (c33Var = (r45.c33) dv1Var5.m75936x14adae67(2)) == null || (str2 = c33Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        b1Var.f398555f = c2Var.a(str2, ((mm2.e1) eVar.a(mm2.e1.class)).f410516m);
        b1Var.f398561i = new dk2.ah();
        b1Var.f398565k = 1176;
        java.lang.String str4 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) == 0 ? "pre_live_add" : "post_live_add";
        b1Var.f398567l = str4 + ':' + ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f410385o + "::" + ((mm2.c1) eVar.a(mm2.c1.class)).f410394p2 + ':' + obj + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        java.lang.String sceneNote = b1Var.f398567l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sceneNote, "sceneNote");
        y4Var.getClass();
        y4Var.f409839n = sceneNote;
        p52.c cVar = p52.h.f433549a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        p52.h.f433562n = obj;
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        java.lang.String appId = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar).Ck(3L, appId, obj, 1176L, java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f410394p2), str4, ((mm2.c1) eVar.a(mm2.c1.class)).P3);
        gVar.mo149xb9724478(java.lang.Boolean.FALSE, b1Var);
        qo0.c statusMonitor = this.f493867e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        if (statusMonitor.mo11219xd0598cf8() != 1) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.t2[] t2VarArr = ml2.t2.f409547d;
        jSONObject.put("type", 2);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        jSONObject.put("sessionid", y4Var.f409839n);
        jSONObject.put("shopwindowid", "");
        if (((mm2.c1) eVar.a(mm2.c1.class)).T7()) {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.Y = true;
            jSONObject.put("appid", ((mm2.f6) eVar.a(mm2.f6.class)).A);
            long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            if (m75942xfb822ef2 < 0) {
                jSONObject.put("liveid", "");
            } else {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                jSONObject.put("liveid", b52.b.q(m75942xfb822ef2));
            }
            jSONObject.put("clickid", p52.h.f433562n);
            p52.h.f433562n = "";
            so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410582w;
            jSONObject.put("productid", j5Var != null ? java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()) : "");
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb.y6((zy2.zb) c19, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
        }
    }

    public final void d(java.lang.Boolean bool) {
        android.content.Context context = this.f493866d.getContext();
        gk2.e eVar = this.f493868f;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkg, ((mm2.f6) eVar.a(mm2.f6.class)).U);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.widget.TextView textView = this.f493888z;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodsOfCouponTitleTxt");
            throw null;
        }
        textView.setText(string);
        tt2.e1 e1Var = this.R;
        java.util.LinkedList productList = ((mm2.f6) eVar.a(mm2.f6.class)).f410576q;
        e1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productList, "productList");
        java.util.LinkedList linkedList = e1Var.f503417o;
        linkedList.clear();
        linkedList.addAll(productList);
        e1Var.m8146xced61ae5();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.C;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodListOfCoupon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.C;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodListOfCoupon");
            throw null;
        }
        c1163xf1deaba42.setVisibility(0);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "showSecondaryPage " + b17);
        j().setVisibility(0);
        if (b17) {
            j().setTranslationX(0.0f);
        } else {
            j().setTranslationX(q().getWidth());
            j().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(0.0f).setListener(null).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if ((r0 != null && r0.m75939xb282bd08(0) == 1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r11 = this;
            android.view.View r8 = r11.F
            if (r8 != 0) goto L6
            goto L7d
        L6:
            zl2.r4 r0 = zl2.r4.f555483a
            boolean r0 = r0.w1()
            r9 = 0
            if (r0 == 0) goto L39
            gk2.e r0 = r11.f493868f
            java.lang.Class<mm2.f6> r1 = mm2.f6.class
            androidx.lifecycle.c1 r2 = r0.a(r1)
            mm2.f6 r2 = (mm2.f6) r2
            long r2 = r2.G
            int r2 = (int) r2
            r3 = 1
            boolean r2 = pm0.v.z(r2, r3)
            if (r2 != 0) goto L37
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.f6 r0 = (mm2.f6) r0
            r45.j31 r0 = r0.Y
            if (r0 == 0) goto L34
            int r0 = r0.m75939xb282bd08(r9)
            if (r0 != r3) goto L34
            goto L35
        L34:
            r3 = r9
        L35:
            if (r3 == 0) goto L39
        L37:
            r0 = r9
            goto L3b
        L39:
            r0 = 8
        L3b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f554818a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.add(r0)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r1 = r10.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r3 = "checkOptionVisibility"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r2 = "checkOptionVisibility"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r8
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.e():void");
    }

    public final void f() {
        gk2.e eVar = this.f493868f;
        if (!pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 16) && ((mm2.c1) eVar.a(mm2.c1.class)).a8() && pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410411s, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "checkShoppingAvailableAnchorStatus backEndAnchorStatusFlag:" + ((mm2.c1) eVar.a(mm2.c1.class)).f410411s);
            int i17 = ((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q) | 16;
            dk2.xf xfVar = this.f493869g;
            if (xfVar != null) {
                dk2.xf.h(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, i17, 16L, 2, null, 32, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(long r12) {
        /*
            r11 = this;
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r1 = -1
            if (r0 > 0) goto L8
            return r1
        L8:
            tt2.e1 r0 = r11.P
            java.util.LinkedList r2 = r0.f503418p
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L12:
            boolean r5 = r2.hasNext()
            r6 = 1
            if (r5 == 0) goto L34
            java.lang.Object r5 = r2.next()
            so2.j5 r5 = (so2.j5) r5
            boolean r7 = r5 instanceof cm2.m0
            if (r7 == 0) goto L2d
            cm2.m0 r5 = (cm2.m0) r5
            long r7 = r5.f124902w
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 != 0) goto L2d
            r5 = r6
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r5 == 0) goto L31
            goto L35
        L31:
            int r4 = r4 + 1
            goto L12
        L34:
            r4 = r1
        L35:
            if (r4 != r1) goto Lc1
            ut2.u3 r2 = r11.n()
            r45.xv2 r2 = r2.f512650g
            if (r2 != 0) goto L41
            r5 = r6
            goto L42
        L41:
            r5 = r3
        L42:
            if (r5 != 0) goto L94
            java.lang.String r2 = r2.m75945x2fec8307(r3)
            android.view.ViewGroup r5 = r11.f493866d
            android.content.Context r7 = r5.getContext()
            r8 = 2131762957(0x7f101f0d, float:1.9157006E38)
            java.lang.String r7 = r7.getString(r8)
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r7)
            if (r2 == 0) goto L5c
            goto L94
        L5c:
            ut2.u3 r2 = r11.n()
            java.util.List r2 = r2.f512649f
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r2.next()
            r9 = r7
            r45.xv2 r9 = (r45.xv2) r9
            java.lang.String r9 = r9.m75945x2fec8307(r3)
            android.content.Context r10 = r5.getContext()
            java.lang.String r10 = r10.getString(r8)
            boolean r9 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, r10)
            if (r9 == 0) goto L66
            goto L87
        L86:
            r7 = 0
        L87:
            r45.xv2 r7 = (r45.xv2) r7
            if (r7 == 0) goto L94
            ut2.u3 r2 = r11.n()
            r2.a(r7, r3, r3)
            r2 = r6
            goto L95
        L94:
            r2 = r3
        L95:
            if (r2 == 0) goto Lc1
            java.util.LinkedList r0 = r0.f503418p
            java.util.Iterator r0 = r0.iterator()
            r2 = r3
        L9e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r0.next()
            so2.j5 r4 = (so2.j5) r4
            boolean r5 = r4 instanceof cm2.m0
            if (r5 == 0) goto Lb8
            cm2.m0 r4 = (cm2.m0) r4
            long r4 = r4.f124902w
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto Lb8
            r4 = r6
            goto Lb9
        Lb8:
            r4 = r3
        Lb9:
            if (r4 == 0) goto Lbd
            r1 = r2
            goto Lc0
        Lbd:
            int r2 = r2 + 1
            goto L9e
        Lc0:
            r4 = r1
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.g(long):int");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a c14980xd3f2584a = this.f493880t;
        if (c14980xd3f2584a != null) {
            return c14980xd3f2584a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentGroup");
        throw null;
    }

    public final android.view.ViewGroup i() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.I).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    public final android.view.ViewGroup j() {
        android.view.ViewGroup viewGroup = this.f493886y;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodListOfCouponContainer");
        throw null;
    }

    public final ut2.j5 k() {
        ut2.j5 j5Var = this.f493871i;
        if (j5Var != null) {
            return j5Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerHolder");
        throw null;
    }

    public final android.widget.ProgressBar l() {
        java.lang.Object mo141623x754a37bb = this.f493882v.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ProgressBar) mo141623x754a37bb;
    }

    public final bc2.b m() {
        bc2.b bVar = this.f493877q;
        if (bVar != null) {
            return bVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notifyViewHolder");
        throw null;
    }

    public final ut2.u3 n() {
        ut2.u3 u3Var = this.f493875p;
        if (u3Var != null) {
            return u3Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productLabelsHolder");
        throw null;
    }

    public final android.widget.TextView o() {
        java.lang.Object mo141623x754a37bb = this.f493883w.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.g2y) {
            u();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.flu) {
            P(this, null, w() ? 0 : 4, true, false, 8, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.flq) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "[onClickOptionView]");
            h().m59103x89d9adf8(true);
            u();
            int h07 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));
            android.content.Context context = this.f493866d.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                xt2.b5 b5Var = new xt2.b5(abstractActivityC21394xb3d2c0cf, this.f493868f, h07);
                b5Var.G = new st2.i0(this);
                b5Var.f199917g.f(h07);
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.rqm) {
            s(true);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.s47) {
            t(true, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final android.view.ViewGroup p() {
        android.view.ViewGroup viewGroup = this.f493884x;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("secondaryPageContainer");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 c14399xad75a698 = this.f493881u;
        if (c14399xad75a698 != null) {
            return c14399xad75a698;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shoppingList");
        throw null;
    }

    public final void r() {
        this.f493865J = null;
        i().removeAllViews();
        i().setVisibility(8);
    }

    public final void s(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "hideSecondaryPage " + z17);
        if (z17) {
            j().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(q().getWidth()).setListener(new st2.p(this)).start();
        } else {
            j().setVisibility(8);
        }
    }

    public final void t(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "hideSecondaryPage " + z17 + ",visibility:" + p().getVisibility());
        if (z17) {
            if (p().getVisibility() == 8) {
                return;
            }
            this.N = true;
            p().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(q().getWidth()).setListener(new st2.q(this)).start();
        } else if (!this.N) {
            p().setVisibility(8);
        }
        if (z18) {
            O(null, 0, true, false);
        }
    }

    public final void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideShoppingContent:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        gk2.e eVar = this.f493868f;
        ((mm2.f6) eVar.a(mm2.f6.class)).f410576q.clear();
        ((mm2.f6) eVar.a(mm2.f6.class)).D = null;
        h().post(new st2.s(this));
        ut2.j5 k17 = k();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = k17.E;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        xt2.n nVar = k17.C;
        if (nVar != null) {
            nVar.dismiss();
        }
        xt2.n nVar2 = k().D;
        if (nVar2 != null) {
            nVar2.dismiss();
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = lVar != null ? lVar.R0() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) R0 : null;
        ((c61.p2) ybVar).Kj(c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null, 18054, zl2.r4.k0(zl2.r4.f555483a, this.f493868f, 30, null, 0, null, 28, null));
        vt2.m.f521512d.clear();
        r();
        st2.s1 s1Var = this.L;
        if (s1Var != null) {
            s1Var.c(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchProductPage");
            throw null;
        }
    }

    public final boolean v(boolean z17) {
        return w() && z17;
    }

    public final boolean w() {
        return ((java.lang.Boolean) this.M.mo141623x754a37bb()).booleanValue();
    }

    public final boolean x() {
        return ((mm2.c1) this.f493868f.a(mm2.c1.class)).T;
    }

    public final boolean y() {
        r45.xv2 xv2Var = n().f512650g;
        return xv2Var != null && xv2Var.m75939xb282bd08(4) == 1;
    }

    public final boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f493870h;
        return (lVar != null && lVar.w0() == 0) && h().getVisibility() == 0 && j().getVisibility() != 0 && p().getVisibility() != 0;
    }
}
