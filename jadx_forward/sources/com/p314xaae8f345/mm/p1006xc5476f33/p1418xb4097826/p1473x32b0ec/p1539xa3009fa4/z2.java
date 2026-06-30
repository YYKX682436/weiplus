package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class z2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.u7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199090d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199091e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f199092f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f199093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199094h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199095i;

    /* renamed from: m, reason: collision with root package name */
    public r45.lc1 f199096m;

    /* renamed from: n, reason: collision with root package name */
    public r45.s02 f199097n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f199098o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f199099p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f199100q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f199101r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f199090d = "Micro.FinderJoinLiveVisibleInfoUIC";
        this.f199093g = new java.util.LinkedList();
        this.f199098o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f199100q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y2(this));
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var) {
        z2Var.getClass();
        r45.aw1 aw1Var = dk2.u7.f315727n;
        java.lang.String str = "currentLevel = " + id2.v1.N;
        java.lang.String str2 = z2Var.f199090d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        sb6.append(aw1Var != null ? aw1Var.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        java.lang.String u07 = zl2.r4.f555483a.u0(aw1Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", u07);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(z2Var.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, 1016);
        yz5.a aVar = z2Var.f199101r;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public android.view.View Q6(r45.lc1 lc1Var, r45.s02 modInfo, boolean z17, boolean z18, boolean z19) {
        java.lang.Object obj;
        boolean z27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modInfo, "modInfo");
        this.f199099p = false;
        this.f199096m = lc1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refresh] data = ");
        if (lc1Var == null || (obj = pm0.b0.g(lc1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f199090d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (lc1Var != null) {
            this.f199094h = z17;
            this.f199095i = z18;
            this.f199097n = modInfo;
            boolean z28 = pm0.v.z(lc1Var.m75939xb282bd08(0), 1);
            boolean z29 = pm0.v.z(lc1Var.m75939xb282bd08(0), 2);
            boolean z37 = pm0.v.z(lc1Var.m75939xb282bd08(0), 4);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC;
            boolean z38 = (16 & c17.t(u3Var, 0L)) != 0;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z39 = (32 & gm0.j1.u().c().t(u3Var, 0L)) != 0;
            boolean z47 = (z38 || z39) ? false : true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z48 = !((512 & gm0.j1.u().c().t(u3Var, 0L)) != 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[refresh] hasNormalOption:" + z28 + ", hasInvisibleVipOption:" + z29 + ", hasHideIdentityOption:" + z37 + ", enableShowMysteriousAudienceInfo:" + z48 + ", chooseInvisibleVip:" + z38 + ", chooseHideIdentity:" + z39);
            if (z29 || z37) {
                java.util.LinkedList linkedList = this.f199093g;
                linkedList.clear();
                if (z28) {
                    java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqg);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    java.lang.String string2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqh);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2(0, string, string2, z47, null, 16, null));
                }
                if (z29) {
                    java.lang.String string3 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    java.lang.String string4 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                    z27 = z39;
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2(1, string3, string4, z38, null, 16, null));
                } else {
                    z27 = z39;
                }
                if (z37) {
                    java.lang.String string5 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqi);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                    java.lang.String string6 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqj);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2(1, string5, string6, z48);
                    java.lang.String string7 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqe);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                    java.lang.String string8 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2(2, string7, string8, z27, l2Var));
                }
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_t, (android.view.ViewGroup) null);
                this.f199091e = inflate;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = inflate != null ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) inflate.findViewById(com.p314xaae8f345.mm.R.id.tjv) : null;
                this.f199092f = c22849x81a93d25;
                jz5.g gVar = this.f199100q;
                if (c22849x81a93d25 != null) {
                    c22849x81a93d25.mo7960x6cab2c8d((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x2) ((jz5.n) gVar).mo141623x754a37bb());
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f199092f;
                if (c22849x81a93d252 != null) {
                    c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179()));
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x2) ((jz5.n) gVar).mo141623x754a37bb()).m8146xced61ae5();
                android.view.View view = this.f199091e;
                android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.tju) : null;
                android.view.View view2 = this.f199091e;
                android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.tjt) : null;
                if (this.f199095i) {
                    if (textView != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        android.widget.TextView textView2 = textView;
                        yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Integer.valueOf(intValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        android.view.View view3 = findViewById;
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(java.lang.Integer.valueOf(intValue2));
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o2(this));
                    }
                } else {
                    java.lang.String string9 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqa);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
                    java.lang.String string10 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nq_, string9);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
                    android.text.SpannableString spannableString = new android.text.SpannableString(string10);
                    int L = r26.n0.L(string10, string9, 0, false, 6, null);
                    if (L >= 0 && string9.length() + L <= string10.length()) {
                        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p2(this), L, string9.length() + L, 33);
                    }
                    if (textView != null) {
                        textView.setText(spannableString);
                    }
                    if (textView != null) {
                        textView.setHighlightColor(m80379x76847179().getResources().getColor(android.R.color.transparent));
                    }
                    if (textView != null) {
                        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    }
                    if (textView != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        android.widget.TextView textView3 = textView;
                        yj0.a.d(textView3, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(java.lang.Integer.valueOf(intValue3));
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(textView3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(textView3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(textView3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        android.view.View view4 = findViewById;
                        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(java.lang.Integer.valueOf(intValue4));
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view4, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(view4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (!z19) {
                    android.view.View view5 = this.f199091e;
                    if (view5 != null) {
                        view5.setPadding(0, 0, 0, 0);
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f199092f;
                    if (c22849x81a93d253 != null) {
                        c22849x81a93d253.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                    }
                }
                return this.f199091e;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f199098o, null, 1, null);
    }
}
