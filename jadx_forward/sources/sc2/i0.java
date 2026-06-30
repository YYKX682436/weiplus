package sc2;

/* loaded from: classes2.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487495f;

    public i0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f487493d = h1Var;
        this.f487494e = s0Var;
        this.f487495f = t01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf5.z zVar;
        r45.t01 t01Var;
        p3325xe03a0797.p3326xc267989b.y0 a17;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        sc2.h1 h1Var = this.f487493d;
        h1Var.getClass();
        in5.s0 s0Var = this.f487494e;
        if (!(s0Var.f374654e.getResources().getConfiguration().orientation == 1) || h1Var.I == null || h1Var.f487457J == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = h1Var.f487462x;
        if (c15188xd8bd4bd2 != null) {
            c15188xd8bd4bd2.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = h1Var.f487462x;
        if (c15188xd8bd4bd3 != null) {
            c15188xd8bd4bd3.b();
        }
        h1Var.f487462x = null;
        android.widget.FrameLayout frameLayout = h1Var.I;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m76746xaf65a0fc = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725.m76746xaf65a0fc();
        r45.t01 t01Var2 = this.f487495f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = t01Var2.m75934xbce7f2f(10);
        if (m75934xbce7f2f != null) {
            m76746xaf65a0fc.mo11468x92b714fd(m75934xbce7f2f.g());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76746xaf65a0fc);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 b17 = jVar.b(h90Var.a(m76746xaf65a0fc, 0));
        java.util.LinkedList<r45.mb4> m59135x7efe73ec = b17.m59135x7efe73ec();
        boolean isEmpty = m59135x7efe73ec.isEmpty();
        java.lang.String str = h1Var.f487461w;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "initVideoView but mediaList is empty!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showCard");
        h1Var.E = true;
        h1Var.f487467y1 = m59135x7efe73ec.get(0).m75942xfb822ef2(24);
        so2.b M = h1Var.M(s0Var, m76746xaf65a0fc.m76784x5db1b11());
        ds2.h hVar = ds2.h.f324399a;
        long m59127x5db1b11 = b17.m59127x5db1b11();
        r45.mb4 mb4Var = m59135x7efe73ec.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mb4Var, "get(...)");
        mn2.g4 c17 = hVar.c(m59127x5db1b11, mb4Var, false);
        boolean z17 = b17.m59127x5db1b11() == 0 && com.p314xaae8f345.mm.vfs.w6.j(c17.mo148084xb5887639());
        if (M != null) {
            M.f491797c = false;
        }
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.jdk);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.g1y);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.edq);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) s0Var.p(com.p314xaae8f345.mm.R.id.f566429qk3);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar2.a(activityC0065xcd7aa112).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
        if (c15477xbd78f833 != null) {
            c15477xbd78f833.S6(s0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 fullSeekBarLayout = c15175x44dff2e9 != null ? c15175x44dff2e9.getFullSeekBarLayout() : null;
        if (fullSeekBarLayout != null) {
            fullSeekBarLayout.m61290xc6ccf75e(true);
        }
        if (p17 != null) {
            h1Var.K(p17, 4);
        }
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p19 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = h1Var.Y;
        if (c15196x85976f5f != null) {
            c15196x85976f5f.m61504xc6cbb41a(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestNotPlay set true");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = h1Var.Y;
        cw2.da videoView = c15196x85976f5f2 != null ? c15196x85976f5f2.getVideoView() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        if (c15188xd8bd4bd4 != null) {
            c15188xd8bd4bd4.mo58788x65825f6();
            c15188xd8bd4bd4.mo56716x4121a19(false);
        }
        android.view.View view = s0Var.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
        if (c15379x1d4ea971 != null) {
            c15379x1d4ea971.a(true, str);
        }
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) uVar.b(context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        if (ptVar != null) {
            ptVar.f217158z = true;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        android.view.ViewGroup viewGroup = h1Var.G;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        jz5.g gVar = h1Var.f487468z;
        if (layoutParams2 != null) {
            int[] iArr = new int[2];
            s0Var.p(com.p314xaae8f345.mm.R.id.f566018ee2).getLocationInWindow(iArr);
            layoutParams2.bottomMargin = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() - iArr[1];
            android.view.ViewGroup viewGroup2 = h1Var.G;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(layoutParams2);
            }
            android.view.ViewGroup viewGroup3 = h1Var.G;
            if (viewGroup3 != null) {
                viewGroup3.requestLayout();
            }
        }
        android.view.ViewGroup viewGroup4 = h1Var.f487457J;
        if (viewGroup4 != null) {
            com.p314xaae8f345.mm.ui.kk.f(viewGroup4, com.p314xaae8f345.mm.ui.bl.h(context) / 2);
        }
        android.widget.FrameLayout frameLayout2 = h1Var.I;
        if (frameLayout2 != null) {
            float m75938x746dc8a6 = ((int) m59135x7efe73ec.get(0).m75938x746dc8a6(5)) / ((int) m59135x7efe73ec.get(0).m75938x746dc8a6(4));
            if (m75938x746dc8a6 > 1.0f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd5 = h1Var.f487462x;
                if (c15188xd8bd4bd5 != null) {
                    c15188xd8bd4bd5.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd6 = h1Var.f487462x;
                if (c15188xd8bd4bd6 != null) {
                    c15188xd8bd4bd6.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
                }
            }
            float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
            int height = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3).getHeight();
            zVar = zVar2;
            float min = java.lang.Math.min(((java.lang.Number) ((jz5.n) h1Var.f487465y).mo141623x754a37bb()).intValue() - context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561245an5));
            float intValue = ((((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() - dimension) - height) - context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ams);
            float f17 = min * m75938x746dc8a6;
            if (f17 > intValue) {
                min = intValue / m75938x746dc8a6;
            } else {
                intValue = f17;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = layoutParams3 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).width = (int) min;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).height = (int) intValue;
            }
            frameLayout2.requestLayout();
        } else {
            zVar = zVar2;
        }
        android.view.ViewGroup viewGroup5 = h1Var.G;
        if (viewGroup5 != null) {
            viewGroup5.post(new sc2.t0(h1Var, viewGroup5, s0Var));
        }
        h1Var.f487464x1 = java.lang.System.currentTimeMillis();
        android.view.ViewGroup viewGroup6 = h1Var.f487457J;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(new sc2.u0(h1Var, viewGroup6, s0Var));
        }
        sc2.z0 z0Var = new sc2.z0(h1Var, M);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).P6(c15188xd8bd4bd7);
        h1Var.f487462x = c15188xd8bd4bd7;
        c15188xd8bd4bd7.mo56700x2cb6856d(context.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd8 = h1Var.f487462x;
        if (c15188xd8bd4bd8 != null) {
            c15188xd8bd4bd8.setId(com.p314xaae8f345.mm.R.id.tba);
        }
        android.widget.FrameLayout frameLayout3 = h1Var.I;
        if (frameLayout3 != null) {
            frameLayout3.addView(h1Var.f487462x, new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd9 = h1Var.f487462x;
        if (c15188xd8bd4bd9 != null) {
            c15188xd8bd4bd9.n(c17, z17, b17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd10 = h1Var.f487462x;
        if (c15188xd8bd4bd10 != null) {
            c15188xd8bd4bd10.mo56706x561757e0(true);
        }
        zy2.a7 a7Var = (zy2.a7) i95.n0.c(zy2.a7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2) a7Var).Bi(m76746xaf65a0fc, nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd11 = h1Var.f487462x;
        if (c15188xd8bd4bd11 != null) {
            c15188xd8bd4bd11.m61412x49bc1928(z0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd12 = h1Var.f487462x;
        if (c15188xd8bd4bd12 != null) {
            c15188xd8bd4bd12.mo56708x764cf626(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd13 = h1Var.f487462x;
        if (c15188xd8bd4bd13 != null) {
            c15188xd8bd4bd13.mo56716x4121a19(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd14 = h1Var.f487462x;
        if (c15188xd8bd4bd14 != null) {
            zy2.g5.u(c15188xd8bd4bd14, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd15 = h1Var.f487462x;
        if (c15188xd8bd4bd15 != null) {
            c15188xd8bd4bd15.m61417xc3ae5018(new sc2.v0(h1Var, M));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd16 = h1Var.f487462x;
        if (c15188xd8bd4bd16 != null) {
            t01Var = t01Var2;
            c15188xd8bd4bd16.mo56704x526554de(new sc2.y0(h1Var, s0Var, t01Var));
        } else {
            t01Var = t01Var2;
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V5).mo141623x754a37bb()).r()).booleanValue() && (c15188xd8bd4bd = h1Var.f487462x) != null) {
            c15188xd8bd4bd.mo56708x764cf626(false);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R5).mo141623x754a37bb()).r()).intValue();
        if (intValue2 == -1) {
            intValue2 = t01Var.m75939xb282bd08(0);
        }
        long j17 = intValue2 * 1000;
        if (M != null && (l17 = M.f491799e) != null) {
            j17 = l17.longValue();
        }
        if (j17 > 0) {
            android.widget.TextView textView = h1Var.K;
            if (textView != null) {
                textView.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            }
            android.widget.TextView textView2 = h1Var.K;
            if (textView2 != null && (a17 = v65.m.a(textView2)) != null) {
                android.widget.TextView textView3 = h1Var.K;
                if (textView3 != null) {
                    textView3.setOnClickListener(sc2.k0.f487540d);
                }
                p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(p3325xe03a0797.p3326xc267989b.p3328x30012e.l.n(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new sc2.l0(j17, null)), p3325xe03a0797.p3326xc267989b.q1.f392101a), new sc2.m0(h1Var, s0Var, M, null)), new sc2.o0(M, h1Var, s0Var, t01Var, null)), a17);
            }
        } else {
            android.widget.TextView textView4 = h1Var.K;
            if (textView4 != null) {
                textView4.setOnClickListener(new sc2.p0(h1Var, s0Var, t01Var));
            }
            android.widget.TextView textView5 = h1Var.K;
            if (textView5 != null) {
                textView5.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhz));
            }
            android.widget.TextView textView6 = h1Var.K;
            if (textView6 != null) {
                textView6.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
        }
        android.widget.TextView textView7 = h1Var.K;
        if (textView7 != null) {
            hc2.v0.e(textView7, "close_ad", 8, 0, false, false, null, new sc2.q0(h1Var, s0Var), 60, null);
        }
        java.lang.String m75945x2fec8307 = t01Var.m75945x2fec8307(13);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            android.widget.TextView textView8 = h1Var.P;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
        } else {
            android.widget.TextView textView9 = h1Var.P;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            android.widget.TextView textView10 = h1Var.P;
            if (textView10 != null) {
                textView10.setText(t01Var.m75945x2fec8307(13));
            }
        }
        android.view.View view2 = h1Var.f487463x0;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showCard", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderCrossPlatformCardStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showCard", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderCrossPlatformCardStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
