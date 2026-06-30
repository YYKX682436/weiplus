package yw2;

/* loaded from: classes10.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {
    public android.view.View A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm B;
    public ux2.f C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f548141d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f548142e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f548143f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f548144g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f548145h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f548146i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f548147m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f548148n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f548149o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f548150p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f548151q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f548152r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f548153s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f548154t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f548155u;

    /* renamed from: v, reason: collision with root package name */
    public android.content.Context f548156v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f548157w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f548158x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f548159y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f548160z;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f548141d = presenter;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        if (k().isSingleMode && n().getFooterMode() == 2) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) l()).mo48674x36654fab();
        }
        float b17 = f17 / (i65.a.b(l(), 56) / (k().getHeight() - k().getTopOffset()));
        float f18 = (b17 - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (b17 > 1.0f) {
            b17 = 1.0f;
        }
        float f19 = 0.0f < b17 ? b17 : 0.0f;
        int b18 = i65.a.b(l(), 16);
        int b19 = i65.a.b(l(), 4);
        android.view.View view = this.f548159y;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLine");
            throw null;
        }
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
        view.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f548160z;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setAlpha(f18);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerArrow");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        this.f548141d.mo979x3f5eee52();
        k().t(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        if (!this.f548142e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.TimelineDrawerBuilder", "[onDrawerOpen] isOpen=" + z17 + " isBegin=" + z18 + " is nerver build before.");
            return;
        }
        if (z17 && z18) {
            v();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f548141d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a k17 = k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj = k().getFeedObj();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(feedObj);
            nPresenter.q0(k17, this, feedObj, k().getOnCloseDrawerCallback(), k().getScene(), k().isSingleMode, k().getRefCommentId(), k().getReplyCommentObj(), k().getUseCache(), k().getBlinkRefComment(), k().getBlinkDuration(), k().getCloseComment(), k().getOldVersion(), k().isOnlyShowDesc, i17);
        } else if (!z17 && z18) {
            ux2.f fVar = this.C;
            if (fVar != null && fVar.f513389f) {
                pm0.v.C(fVar.f513397n);
                db5.d5 d5Var = fVar.f513396m;
                if (d5Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubble");
                    throw null;
                }
                d5Var.dismiss();
            }
            this.f548141d.mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        this.f548151q = headerLayout;
        android.view.View inflate = z17 ? com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570197zu, headerLayout) : com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570196zt, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f548143f = (android.widget.TextView) findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.t5m);
        if (c22699x3dcdb352 != null) {
            java.lang.Object tag = c22699x3dcdb352.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                c22699x3dcdb352.setTag(bool);
                c22699x3dcdb352.post(new d92.a(c22699x3dcdb352));
            }
        } else {
            c22699x3dcdb352 = null;
        }
        this.f548144g = c22699x3dcdb352;
        this.f548145h = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5n);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ear);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f548157w = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f548158x = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f548159y = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gxz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f548160z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        this.f548146i = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568868sb3);
        this.f548147m = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.vfq);
        android.widget.TextView textView = this.f548143f;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
    }

    public final void h(boolean z17) {
        if (k().isOnlyShowDesc) {
            s().m82690xd3a27e96(false);
            return;
        }
        if (!z17) {
            s().m82690xd3a27e96(false);
            return;
        }
        s().m82690xd3a27e96(true);
        if (s().getRefreshHeader() == null) {
            int dimension = (int) l().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s17 = s();
            android.view.View view = new android.view.View(l());
            view.setMinimumHeight(dimension);
            s17.m82701x7344efcb(view);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = this.f548150p;
        if (c15268x6a41bd8a != null) {
            return c15268x6a41bd8a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("commentDrawer");
        throw null;
    }

    public final android.content.Context l() {
        android.content.Context context = this.f548156v;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f548149o;
        if (c15270x6d877a34 != null) {
            return c15270x6d877a34;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout o() {
        android.widget.FrameLayout frameLayout = this.f548151q;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
        throw null;
    }

    public final android.widget.FrameLayout p() {
        android.widget.FrameLayout frameLayout = this.f548152r;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
        throw null;
    }

    public final android.widget.TextView q() {
        android.widget.TextView textView = this.f548154t;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
        throw null;
    }

    public final android.view.View r() {
        android.view.View view = this.f548155u;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f548148n;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae = this.D;
        if (c15304x8ca13bae != null) {
            c15304x8ca13bae.a(new yw2.p(c15304x8ca13bae));
        }
        this.D = null;
        this.E = false;
    }

    public final void u() {
        p().setVisibility(8);
        r().setOnClickListener(null);
    }

    public final void v() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        boolean z17 = false;
        if (k().getShowFooter()) {
            n().setVisibility(0);
            android.view.View findViewById = o().findViewById(com.p314xaae8f345.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj = k().getFeedObj();
            java.lang.Long valueOf = (feedObj == null || (feedObject = feedObj.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null) ? null : java.lang.Long.valueOf(m76806xdef68064.m75942xfb822ef2(30));
            if (valueOf != null && (valueOf.longValue() & 262144) == 0) {
                z17 = true;
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209214ee).mo141623x754a37bb()).r()).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineDrawerBuilder", "refreshCommentOpen permissionAllowRecentImageBubble=" + z17 + ", xExptAllowRecentImageBubble=" + booleanValue);
            if (z17 && booleanValue) {
                pm0.v.V(600L, new yw2.w(this));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineDrawerBuilder", "CommentInvisibleDebug commentDrawer.showFooter=" + k().getShowFooter() + " drawerFooter.visibility = View.GONE");
        n().setVisibility(8);
        if (!k().getCloseComment()) {
            android.view.View findViewById2 = o().findViewById(com.p314xaae8f345.mm.R.id.eal);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = o().findViewById(com.p314xaae8f345.mm.R.id.eal);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(r17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p().setVisibility(0);
    }

    public final void w() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        p().setVisibility(0);
        android.view.View view = this.f548153s;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        if (r2.m59302xe7dcf583() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.a0.x():void");
    }
}
