package fn2;

/* loaded from: classes5.dex */
public final class b0 extends android.widget.LinearLayout implements fn2.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f345745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345746e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f345747f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f345748g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f345749h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f345750i;

    /* renamed from: m, reason: collision with root package name */
    public fn2.e f345751m;

    /* renamed from: n, reason: collision with root package name */
    public fn2.s f345752n;

    /* renamed from: o, reason: collision with root package name */
    public int f345753o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f345754p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f345755q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f345756r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f345757s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f345745d = controller;
        this.f345746e = i17;
        this.f345747f = sourceScene;
        this.f345748g = y0Var;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsh, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568883s91);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f345749h = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s_w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f345750i = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2;
        this.f345754p = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.rfr);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568998vj3);
        this.f345755q = textView;
        if (textView != null) {
            textView.setOnClickListener(new fn2.u(this));
        }
        this.f345752n = new fn2.s(this, y0Var, controller, i17, sourceScene, new fn2.v(this), new fn2.w(this));
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c18;
            ml2.b4 b4Var = ml2.b4.f408786o2;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 1);
            jSONObject2.put("element", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        }
        this.f345756r = new java.util.LinkedHashSet();
        this.f345757s = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x016d A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:11:0x0031, B:12:0x0169, B:14:0x016d, B:16:0x0171, B:18:0x0175, B:22:0x017f, B:26:0x0186), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0171 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:11:0x0031, B:12:0x0169, B:14:0x016d, B:16:0x0171, B:18:0x0175, B:22:0x017f, B:26:0x0186), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // fn2.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.b0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(boolean z17) {
        android.view.View view;
        android.view.View view2;
        java.lang.Object obj;
        fn2.s0 s0Var;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345749h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        int m20353x443e53f0 = c2718xca2902ff.m20353x443e53f0();
        for (int i17 = 0; i17 < m20353x443e53f0; i17++) {
            java.util.Map map = this.f345757s;
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
            } else {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f345749h;
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
                java.util.Set set = this.f345756r;
                if (!z18) {
                    set.remove(java.lang.Integer.valueOf(i17));
                } else if (z17 || !set.contains(java.lang.Integer.valueOf(i17))) {
                    set.add(java.lang.Integer.valueOf(i17));
                    fn2.e eVar = this.f345751m;
                    if (eVar != null && (s0Var = (fn2.s0) eVar.f345782g.get(i17)) != null) {
                        r45.in inVar = s0Var.f345929r;
                        int i18 = inVar.f458689d;
                        java.lang.String board_name = inVar.f458690e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(board_name, "board_name");
                        s0Var.a(1, i18, board_name, null, null);
                    }
                }
            }
        }
    }

    public final void c() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m129824x2fa4312f;
        fn2.e eVar = this.f345751m;
        if (eVar != null) {
            kz5.x0 it = e06.p.m(0, eVar.mo8338x7444f759()).iterator();
            while (((e06.j) it).f327747f) {
                int b17 = it.b();
                fn2.s0 s0Var = (fn2.s0) eVar.f345782g.get(b17);
                if (s0Var != null && (m129824x2fa4312f = s0Var.m129824x2fa4312f()) != null) {
                    int i17 = b17 == this.f345753o ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m129824x2fa4312f, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m129824x2fa4312f.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m129824x2fa4312f, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m129824x2fa4312f.setNestedScrollingEnabled(b17 == this.f345753o);
                }
            }
        }
    }

    public final void d() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f345754p;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f345755q;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345749h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c2718xca2902ff, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345750i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c1190x18d3c3fe, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e(int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        java.util.ArrayList arrayList;
        this.f345753o = i17;
        fn2.e eVar = this.f345751m;
        fn2.s0 s0Var = eVar != null ? (fn2.s0) eVar.f345782g.get(i17) : null;
        java.lang.Object obj = linkedList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.in inVar = (r45.in) obj;
        r45.in inVar2 = (r45.in) kz5.n0.a0(linkedList, i17);
        if (inVar2 != null) {
            if (s0Var != null) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f345748g;
                sf2.d3 controller = this.f345745d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
                if (!s0Var.f345922h) {
                    s0Var.f345922h = true;
                    s0Var.f345920f = controller;
                    java.util.LinkedList linkedList2 = inVar2.f458691f;
                    java.util.Collection collection = linkedList2 == null ? kz5.p0.f395529d : linkedList2;
                    android.widget.ScrollView scrollView = s0Var.f345925n;
                    boolean z17 = false;
                    int i19 = collection.isEmpty() ^ true ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(scrollView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    scrollView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(scrollView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int i27 = 0;
                    for (java.lang.Object obj2 : collection) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.ch6 ch6Var = (r45.ch6) obj2;
                        android.view.LayoutInflater from = android.view.LayoutInflater.from(s0Var.getContext());
                        android.widget.LinearLayout linearLayout = s0Var.f345926o;
                        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsq, linearLayout, z17);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s9r)).setText(ch6Var.f453089e);
                        linearLayout.addView(inflate);
                        r45.in inVar3 = s0Var.f345929r;
                        int i29 = inVar3.f458689d;
                        java.lang.String board_name = inVar3.f458690e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(board_name, "board_name");
                        s0Var.a(1, i29, board_name, java.lang.Integer.valueOf(ch6Var.f453088d), ch6Var.f453089e);
                        inflate.setOnClickListener(new fn2.n0(s0Var, i27, y0Var));
                        i27 = i28;
                        z17 = false;
                    }
                    s0Var.b(i18, zw1Var, y0Var);
                    s0Var.f345924m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv(s0Var, controller, y0Var, null);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init tab ");
                    sb6.append(inVar2.f458690e);
                    sb6.append(", sub tab ");
                    if (linkedList2 != null) {
                        arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((r45.ch6) it.next()).f453089e);
                        }
                    } else {
                        arrayList = null;
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabView", sb6.toString());
                    android.content.Context context = s0Var.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    bm2.o6 o6Var = new bm2.o6(context, controller, s0Var.f345918d, s0Var.f345919e, y0Var);
                    s0Var.f345921g = o6Var;
                    o6Var.f103734q = inVar2;
                    o6Var.f103732o = r45.y4.AddSongSourceType_MusicBoard;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s0Var.f345923i;
                    c1163xf1deaba4.mo7960x6cab2c8d(o6Var);
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
                    ym5.a1.g(c1163xf1deaba4, new fn2.o0(s0Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = s0Var.f345924m;
                    if (dvVar != null) {
                        fn2.p0 p0Var = new fn2.p0(controller, s0Var, null);
                        fn2.q0 q0Var = new fn2.q0(s0Var);
                        dvVar.f199695o = p0Var;
                        dvVar.f199696p = q0Var;
                    }
                }
            }
            if (s0Var != null) {
                int i37 = inVar.f458689d;
                java.lang.String board_name2 = inVar.f458690e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(board_name2, "board_name");
                s0Var.a(2, i37, board_name2, null, null);
            }
            b(true);
        }
        c();
    }

    public final void f(r45.ax1 ax1Var, r45.zw1 zw1Var) {
        int i17;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = ax1Var.f451860d;
        if (linkedList2 != null) {
            this.f345751m = new fn2.e(linkedList2, this.f345746e, this.f345747f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequest", "tab list ".concat(kz5.n0.g0(linkedList2, null, null, null, 0, null, fn2.y.f345979d, 31, null)));
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345750i;
            if (c1190x18d3c3fe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe.m8315x6cab2c8d(this.f345751m);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.f345750i;
            if (c1190x18d3c3fe2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe2.m8321x40341e13(ax1Var.f451860d.size());
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345749h;
            if (c2718xca2902ff == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = this.f345750i;
            if (c1190x18d3c3fe3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe3);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f345749h;
            if (c2718xca2902ff2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            c2718xca2902ff2.getViewTreeObserver().addOnScrollChangedListener(new fn2.z(this));
            fn2.a0 a0Var = new fn2.a0(this, linkedList2);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = this.f345750i;
            if (c1190x18d3c3fe4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe4.m8289xa5a25773(a0Var);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequest", "default tab type " + ax1Var.f451862f + " pos " + i19 + ", default sub tab type " + ax1Var.f451863g + " pos " + i18);
            e(i19, linkedList2, i18, zw1Var);
            if (i19 != 0) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff3 = this.f345749h;
                if (c2718xca2902ff3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = c2718xca2902ff3.k(i19);
                if (k17 != null) {
                    k17.b();
                }
            }
            i();
        }
    }

    public final void g() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f345754p;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345749h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c2718xca2902ff, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345750i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1190x18d3c3fe, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f345755q;
        if (textView == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getTitle */
    public java.lang.String m129813x7531c8a2() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // fn2.y1
    public void h() {
        fn2.s sVar = this.f345752n;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void i() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345749h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c2718xca2902ff, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345750i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1190x18d3c3fe, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fn2.s sVar = this.f345752n;
        if (sVar != null) {
            sVar.d();
        }
        c();
    }
}
