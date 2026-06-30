package qd2;

/* loaded from: classes10.dex */
public final class g1 {

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f443278u;

    /* renamed from: v, reason: collision with root package name */
    public static final float f443279v;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f443280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f443281b;

    /* renamed from: c, reason: collision with root package name */
    public final long f443282c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f443283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f443284e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f443285f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckBox f443286g;

    /* renamed from: h, reason: collision with root package name */
    public y9.i f443287h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f443288i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m f443289j;

    /* renamed from: k, reason: collision with root package name */
    public int f443290k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f443291l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f443292m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f443293n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f443294o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f443295p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ao2 f443296q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f443297r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f443298s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f443299t;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostOriginRuleUrl");
        if (d17 == null) {
            d17 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/GzdzwPjCFZDCZkmI";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_POST_ORIGIN_RULE_URL info = ".concat(d17));
        f443278u = d17;
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        f443279v = i18 * 0.75f;
    }

    public g1(android.content.Context context, int i17, long j17, java.lang.String exportId, boolean z17, int i18) {
        m92.b j37;
        r45.wn2 wn2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        this.f443280a = context;
        this.f443281b = i17;
        this.f443282c = j17;
        this.f443283d = z17;
        this.f443284e = i18;
        this.f443290k = -1;
        this.f443291l = new java.util.ArrayList();
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(context));
        boolean z18 = true;
        if (((b17 != null ? b17.f69298x75e87a18 : 0L) & 64) != 64) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209128a4).mo141623x754a37bb()).r()).intValue() != 1) {
                z18 = false;
            }
        }
        this.f443293n = z18;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209147b4).mo141623x754a37bb()).r()).intValue() != 3 || (j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null)) == null || (wn2Var = (r45.wn2) j37.u0().m75936x14adae67(28)) == null) {
            return;
        }
        wn2Var.m75939xb282bd08(2);
    }

    public static final void a(qd2.g1 g1Var, java.lang.String str) {
        if (g1Var.f443289j == null) {
            oy2.g gVar = new oy2.g(g1Var.f443280a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m(gVar, str);
            g1Var.f443289j = mVar;
            mVar.f214154f = new qd2.c1(g1Var, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca c17 = gVar.c();
            android.view.View findViewById = c17.findViewById(com.p314xaae8f345.mm.R.id.l0w);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initAnnounceView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initAnnounceView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = c17.findViewById(com.p314xaae8f345.mm.R.id.l0z);
            float dimension = f443279v - c17.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = (int) dimension;
            findViewById2.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar2 = g1Var.f443289j;
        if (mVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(mVar2.f214151c));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "realShow");
            mVar2.f214149a.show();
        }
    }

    public final r45.ao2 b() {
        r45.wn2 wn2Var;
        java.util.LinkedList m75941xfb821914;
        java.util.ArrayList arrayList = this.f443291l;
        int size = arrayList.size();
        int i17 = this.f443290k;
        java.lang.Object obj = null;
        if (!(i17 >= 0 && i17 < size)) {
            return null;
        }
        java.lang.Object obj2 = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        java.lang.String str = (java.lang.String) obj2;
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(this.f443280a), false, 2, null);
        if (j37 == null || (wn2Var = (r45.wn2) j37.u0().m75936x14adae67(28)) == null || (m75941xfb821914 = wn2Var.m75941xfb821914(0)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (r26.i0.q(((r45.ao2) next).m75945x2fec8307(1), str, false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (r45.ao2) obj;
    }

    public final void c(android.view.View view, java.lang.String eventId) {
        java.lang.String str = this.f443283d ? "upgrade_original_right" : "set_original_statement";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5 n5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("original_statement_type", java.lang.Integer.valueOf(this.f443293n ? 1 : 0));
        r45.ao2 b17 = b();
        lVarArr[1] = new jz5.l("original_type", java.lang.Integer.valueOf(b17 != null ? b17.m75939xb282bd08(0) : 0));
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(this.f443282c));
        lVarArr[3] = new jz5.l("original_statement_source_page", java.lang.Integer.valueOf(this.f443284e));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        hc2.v0.b(view, str, eventId, 0, k17, null, 20, null);
    }

    public final void d() {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = this.f443291l;
        int size = arrayList.size();
        int i17 = this.f443290k;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (textView = this.f443285f) == null) {
            return;
        }
        textView.setText((java.lang.CharSequence) arrayList.get(i17));
    }

    public final void e(boolean z17, boolean z18) {
        java.lang.String string;
        java.util.LinkedList m75941xfb821914;
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        if (this.f443287h == null) {
            android.content.Context context = this.f443280a;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5y, (android.view.ViewGroup) null, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            android.widget.ScrollView scrollView = (android.widget.ScrollView) inflate;
            scrollView.setOnTouchListener(new qd2.l0(scrollView));
            android.widget.TextView textView = (android.widget.TextView) scrollView.findViewById(com.p314xaae8f345.mm.R.id.l19);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.Button button = (android.widget.Button) scrollView.findViewById(com.p314xaae8f345.mm.R.id.l1c);
            button.setEnabled(false);
            com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
            button.setOnClickListener(new qd2.v0(this, button));
            c(scrollView, "view_exp");
            android.widget.TextView textView2 = (android.widget.TextView) scrollView.findViewById(com.p314xaae8f345.mm.R.id.q9z);
            if (this.f443283d) {
                textView.setText(scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lke));
                button.setText(scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lkd));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            android.view.View findViewById = scrollView.findViewById(com.p314xaae8f345.mm.R.id.tsd);
            if (findViewById != null) {
                findViewById.setOnClickListener(new qd2.m0(this));
            }
            android.widget.CheckBox checkBox = (android.widget.CheckBox) scrollView.findViewById(com.p314xaae8f345.mm.R.id.f567903l14);
            this.f443286g = checkBox;
            checkBox.setOnCheckedChangeListener(new qd2.u0(this, z18, button));
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) scrollView.findViewById(com.p314xaae8f345.mm.R.id.l17);
            java.lang.String string2 = scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573533ew3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573535ew5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String string4 = scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573534ew4, string2, string3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string4);
            int L = r26.n0.L(string4, string2, 0, false, 6, null);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string4, scrollView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), scrollView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new qd2.n0(this)), L, string2.length() + L, 17);
            int L2 = r26.n0.L(string4, string3, 0, false, 6, null);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string4, scrollView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), scrollView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new qd2.o0(this)), L2, string3.length() + L2, 17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15331xdf2796b6 c15331xdf2796b6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15331xdf2796b6) scrollView.findViewById(com.p314xaae8f345.mm.R.id.f567902l13);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = "";
            if (this.f443293n) {
                string = "";
            } else {
                string = c15331xdf2796b6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lk_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            }
            arrayList.add(new jz5.o(c15331xdf2796b6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lka), string, new qd2.p0(c15331xdf2796b6)));
            arrayList.add(new jz5.o(c15331xdf2796b6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p48), "", null));
            arrayList.add(new jz5.o(c15331xdf2796b6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p47), "", null));
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jz5.o oVar = (jz5.o) next;
                java.util.Iterator it6 = it;
                java.lang.String str2 = str;
                android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(c15331xdf2796b6.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5v, (android.view.ViewGroup) null, true);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                if (i17 != 0) {
                    layoutParams.topMargin = c15331xdf2796b6.f212894d;
                }
                c15331xdf2796b6.addView(inflate2, layoutParams);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
                ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l1g)).setText((java.lang.CharSequence) oVar.f384374d);
                c15331xdf2796b6.contentContainer = inflate2.findViewById(com.p314xaae8f345.mm.R.id.q9y);
                java.lang.CharSequence charSequence = (java.lang.CharSequence) oVar.f384375e;
                if (charSequence.length() > 0) {
                    android.view.View view = c15331xdf2796b6.contentContainer;
                    if (view != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view2 = c15331xdf2796b6.contentContainer;
                    if (view2 != null) {
                        view2.setOnClickListener((android.view.View.OnClickListener) oVar.f384376f);
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.l1e)).setText(charSequence);
                } else {
                    android.view.View view3 = c15331xdf2796b6.contentContainer;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView", "setAnnounceText", "(Landroid/view/View;Lkotlin/Triple;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        str = str2;
                        it = it6;
                        i17 = i18;
                    }
                }
                str = str2;
                it = it6;
                i17 = i18;
            }
            java.lang.String str3 = str;
            c23001x9d3a0bdc.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(scrollView.getContext()));
            c23001x9d3a0bdc.b(spannableString);
            c23001x9d3a0bdc.setOnClickListener(new qd2.q0(checkBox));
            ((android.widget.FrameLayout) scrollView.findViewById(com.p314xaae8f345.mm.R.id.f567904l15)).setOnClickListener(new qd2.r0(checkBox));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J8).mo141623x754a37bb()).r()).intValue();
            java.util.ArrayList arrayList4 = this.f443291l;
            if (intValue == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOriginSheetHelper", "[initOriginData] switch is off");
            } else {
                arrayList4.clear();
                m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
                r45.wn2 wn2Var = j37 != null ? (r45.wn2) j37.u0().m75936x14adae67(28) : null;
                if (wn2Var != null && (m75941xfb821914 = wn2Var.m75941xfb821914(0)) != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj : m75941xfb821914) {
                        if (((r45.ao2) obj).m75941xfb821914(2).contains(java.lang.Integer.valueOf(this.f443281b))) {
                            arrayList5.add(obj);
                        }
                    }
                    java.util.Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        java.lang.String m75945x2fec8307 = ((r45.ao2) it7.next()).m75945x2fec8307(1);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = str3;
                        }
                        arrayList4.add(m75945x2fec8307);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J8).mo141623x754a37bb()).r()).intValue() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOriginSheetHelper", "[initOriginType] switch is off");
            } else if (arrayList4.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOriginSheetHelper", "[initOriginType] list is empty");
            } else {
                android.view.View findViewById2 = scrollView.findViewById(com.p314xaae8f345.mm.R.id.l1_);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new qd2.w0(this));
                this.f443285f = (android.widget.TextView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.l1a);
                d();
            }
            if (z17) {
                checkBox.setChecked(true);
                button.setEnabled(true);
            }
            if (z18) {
                textView.setText(scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p49));
                button.setText(scrollView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575335p46));
                android.widget.Button button2 = (android.widget.Button) scrollView.findViewById(com.p314xaae8f345.mm.R.id.ure);
                if (button2 != null) {
                    button2.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.bk.r0(button2.getPaint(), 0.8f);
                button2.setOnClickListener(new qd2.s0(this));
                android.widget.TextView textView3 = (android.widget.TextView) scrollView.findViewById(com.p314xaae8f345.mm.R.id.urc);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (textView3 != null) {
                    textView3.setOnClickListener(new qd2.t0(this));
                }
            }
            y9.i iVar = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
            this.f443287h = iVar;
            iVar.setContentView(scrollView);
            java.lang.Object parent = scrollView.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            this.f443288i = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
            y9.i iVar2 = this.f443287h;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.5f);
            }
            y9.i iVar3 = this.f443287h;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayr);
            }
            y9.i iVar4 = this.f443287h;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new qd2.d1(this));
            }
            y9.i iVar5 = this.f443287h;
            if (iVar5 != null) {
                iVar5.setOnShowListener(new qd2.e1(this));
            }
        }
        y9.i iVar6 = this.f443287h;
        if (iVar6 != null) {
            iVar6.show();
        }
    }

    public /* synthetic */ g1(android.content.Context context, int i17, long j17, java.lang.String str, boolean z17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, i17, (i19 & 4) != 0 ? 0L : j17, (i19 & 8) != 0 ? "" : str, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? 0 : i18);
    }
}
