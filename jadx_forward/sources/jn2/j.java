package jn2;

/* loaded from: classes5.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f382165J;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe K;
    public jn2.k L;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 M;
    public android.widget.TextView N;
    public jn2.w P;
    public final java.util.Set Q;
    public final java.util.Map R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.Q = new java.util.LinkedHashSet();
        this.R = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:28|29))(4:30|(1:32)|33|(2:35|(4:37|(1:39)|40|(2:42|43))(2:44|45))(2:46|47))|12|(1:14)|(3:16|(1:26)|(1:21)(3:22|23|24))|27|23|24))|50|6|7|(0)(0)|12|(0)|(0)|27|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongAddPanel", "load tab list failed: " + r0.getMessage());
        r1.j0();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016c A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:11:0x0034, B:12:0x0168, B:14:0x016c, B:16:0x0170, B:18:0x0174, B:22:0x017e, B:27:0x0185, B:40:0x015b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0170 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:11:0x0034, B:12:0x0168, B:14:0x016c, B:16:0x0170, B:18:0x0174, B:22:0x017e, B:27:0x0185, B:40:0x015b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(jn2.j r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.j.e0(jn2.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8l;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ooz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568882vg0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f382165J = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.voo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.K = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2;
        this.M = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView.findViewById(com.p314xaae8f345.mm.R.id.sse);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.vhj);
        this.N = textView;
        if (textView != null) {
            textView.setOnClickListener(new jn2.b(this));
        }
        this.P = new jn2.w(rootView, this.E, this.I, this.H, new jn2.c(this), new jn2.d(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        sf2.j0.l((sf2.o1) ((jz5.n) this.I.f488881q).mo141623x754a37bb(), "", false, false, 4, null);
        super.S();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        te2.a9.f499416a.a(this.I.h7(), 1, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        jn2.w wVar = this.P;
        if (wVar != null) {
            wVar.f();
        }
        k0();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.e(this, null), 3, null);
        }
    }

    public final void f0(boolean z17) {
        android.view.View view;
        android.view.View view2;
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f382165J;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        int m20353x443e53f0 = c2718xca2902ff.m20353x443e53f0();
        for (int i17 = 0; i17 < m20353x443e53f0; i17++) {
            java.util.Map map = this.R;
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
            } else {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f382165J;
                if (c2718xca2902ff2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = c2718xca2902ff2.k(i17);
                try {
                    java.lang.reflect.Field declaredField = oa.i.class.getDeclaredField("h");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(k17);
                } catch (java.lang.Exception unused) {
                }
                if (obj instanceof android.view.View) {
                    view = (android.view.View) obj;
                    map.put(java.lang.Integer.valueOf(i17), view);
                    view2 = view;
                }
                view = null;
                map.put(java.lang.Integer.valueOf(i17), view);
                view2 = view;
            }
            if (view2 != null) {
                int width = pm0.v.r(view2).width();
                int width2 = view2.getWidth();
                if (width > width2) {
                    width = width2;
                }
                boolean z18 = width >= view2.getWidth() / 3;
                java.util.Set set = this.Q;
                if (!z18) {
                    set.remove(java.lang.Integer.valueOf(i17));
                } else if (z17 || !set.contains(java.lang.Integer.valueOf(i17))) {
                    set.add(java.lang.Integer.valueOf(i17));
                }
            }
        }
    }

    public final void g0() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.M;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.N;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f382165J;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c2718xca2902ff, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.K;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c1190x18d3c3fe, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h0(int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        jn2.k kVar = this.L;
        java.util.ArrayList arrayList = null;
        jn2.f0 f0Var = kVar != null ? (jn2.f0) kVar.f382169e.get(i17) : null;
        java.lang.Object obj = linkedList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.in inVar = (r45.in) kz5.n0.a0(linkedList, i17);
        if (inVar != null) {
            boolean z17 = true;
            if (f0Var != null) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
                sf2.x controller = this.I;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
                gk2.e liveData = this.H;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
                if (!f0Var.f382134g) {
                    f0Var.f382134g = true;
                    f0Var.f382131d = controller;
                    f0Var.f382132e = y0Var;
                    java.util.LinkedList linkedList2 = inVar.f458691f;
                    java.util.Collection collection = linkedList2 == null ? kz5.p0.f395529d : linkedList2;
                    android.widget.ScrollView scrollView = f0Var.f382136i;
                    int i19 = collection.isEmpty() ^ true ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(scrollView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    scrollView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(scrollView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int i27 = 0;
                    for (java.lang.Object obj2 : collection) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        android.view.LayoutInflater from = android.view.LayoutInflater.from(f0Var.getContext());
                        android.widget.LinearLayout linearLayout = f0Var.f382137m;
                        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8j, (android.view.ViewGroup) linearLayout, false);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.vhl)).setText(((r45.ch6) obj2).f453089e);
                        linearLayout.addView(inflate);
                        inflate.setOnClickListener(new jn2.b0(f0Var, i27, y0Var));
                        i27 = i28;
                    }
                    f0Var.a(i18, zw1Var, y0Var);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init tab ");
                    sb6.append(inVar.f458690e);
                    sb6.append(", sub tab ");
                    if (linkedList2 != null) {
                        arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((r45.ch6) it.next()).f453089e);
                        }
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongAddPanelTabView", sb6.toString());
                    android.content.Context context = f0Var.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    jn2.c1 c1Var = new jn2.c1(context, controller, liveData, y0Var, jn2.a2.f382083d, inVar, null, 64, null);
                    f0Var.f382133f = c1Var;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = f0Var.f382135h;
                    c1163xf1deaba4.mo7960x6cab2c8d(c1Var);
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
                    c1163xf1deaba4.setOnTouchListener(new zl2.k5(c1163xf1deaba4));
                    ym5.a1.g(c1163xf1deaba4, new jn2.c0(f0Var, controller));
                    c1163xf1deaba4.i(new jn2.e0(f0Var));
                }
                z17 = true;
            }
            f0(z17);
        }
    }

    public final void i0(r45.ax1 ax1Var, r45.zw1 zw1Var) {
        int i17;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = ax1Var.f451860d;
        if (linkedList2 != null) {
            jn2.k kVar = new jn2.k(linkedList2);
            this.L = kVar;
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.K;
            if (c1190x18d3c3fe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe.m8315x6cab2c8d(kVar);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.K;
            if (c1190x18d3c3fe2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe2.m8321x40341e13(linkedList2.size());
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f382165J;
            if (c2718xca2902ff == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = this.K;
            if (c1190x18d3c3fe3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe3);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f382165J;
            if (c2718xca2902ff2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            c2718xca2902ff2.getViewTreeObserver().addOnScrollChangedListener(new jn2.g(this));
            jn2.i iVar = new jn2.i(this, linkedList2);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = this.K;
            if (c1190x18d3c3fe4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe4.m8289xa5a25773(iVar);
            java.util.Iterator it = linkedList2.iterator();
            int i18 = 0;
            int i19 = 0;
            while (true) {
                i17 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((r45.in) it.next()).f458689d == ax1Var.f451862f) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 < 0) {
                i19 = 0;
            }
            r45.in inVar = (r45.in) kz5.n0.a0(linkedList2, i19);
            if (inVar != null && (linkedList = inVar.f458691f) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((r45.ch6) it6.next()).f453088d == ax1Var.f451863g) {
                        i17 = i27;
                        break;
                    }
                    i27++;
                }
                if (i17 >= 0) {
                    i18 = i17;
                }
            }
            int i28 = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongAddPanel", "default tab type " + ax1Var.f451862f + " pos " + i19 + ", default sub tab type " + ax1Var.f451863g + " pos " + i28);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe5 = this.K;
            if (c1190x18d3c3fe5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe5.post(new jn2.h(this, i19, linkedList2, i28, zw1Var));
            k0();
        }
    }

    public final void j0() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.M;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f382165J;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c2718xca2902ff, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.K;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1190x18d3c3fe, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.N;
        if (textView == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void k0() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f382165J;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c2718xca2902ff, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.K;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe.setVisibility(0);
        jn2.w wVar = this.P;
        if (wVar != null) {
            wVar.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void s(boolean z17) {
        sf2.j0.l((sf2.o1) ((jz5.n) this.I.f488881q).mo141623x754a37bb(), "", false, false, 4, null);
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(H().getWindowToken(), 0);
        }
        super.s(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
