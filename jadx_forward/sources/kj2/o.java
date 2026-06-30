package kj2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f389955a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f389956b;

    /* renamed from: c, reason: collision with root package name */
    public final pj2.b f389957c;

    /* renamed from: d, reason: collision with root package name */
    public final pj2.a f389958d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f389959e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f389960f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f389961g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f389962h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f389963i;

    /* renamed from: j, reason: collision with root package name */
    public r45.x71 f389964j;

    public o(android.view.View root, gk2.e liveData, pj2.b server, p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 p2Var, pj2.a pluginCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginCallback, "pluginCallback");
        this.f389955a = root;
        this.f389956b = liveData;
        this.f389957c = server;
        this.f389958d = pluginCallback;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.n_k);
        this.f389959e = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.jjj);
        this.f389960f = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14241x3314254d c14241x3314254d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14241x3314254d(liveData, new kj2.b(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f389962h = arrayList;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(c14241x3314254d, arrayList, false);
        this.f389963i = c22848x6ddd90cf;
        if (p2Var != null) {
            c1163xf1deaba4.N(p2Var);
        }
        c1163xf1deaba4.setNestedScrollingEnabled(false);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(c22848x6ddd90cf);
    }

    public static final void a(kj2.o oVar, java.util.ArrayList arrayList, r45.x71 x71Var) {
        java.util.ArrayList arrayList2;
        r45.il4 il4Var;
        java.lang.String str;
        java.lang.String str2;
        vi2.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.lang.String str3;
        oVar.f389964j = x71Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List list = ((mm2.o4) oVar.f389956b.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj);
                }
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str4 = qVar.f390705c;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put(str4, qVar);
        }
        java.util.List<km2.q> list2 = ((mm2.o4) oVar.f389956b.a(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserList>(...)");
        synchronized (list2) {
            for (km2.q qVar2 : list2) {
                java.lang.String str5 = qVar2.f390705c;
                if (str5 == null) {
                    str5 = "";
                }
                hashMap.put(str5, qVar2);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new kj2.a());
        java.util.ArrayList<r45.xn1> arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = F0.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xn1) next).m75936x14adae67(0);
            if (c19782x23db1cfa == null || (str3 = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str3 = "";
            }
            if (hashMap.get(str3) == null) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.size() > 300) {
            java.util.List subList = arrayList3.subList(0, 300);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(subList, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveContact>");
            arrayList3 = (java.util.ArrayList) subList;
        }
        if (x71Var == null || (m75934xbce7f2f = x71Var.m75934xbce7f2f(20)) == null) {
            il4Var = null;
        } else {
            r45.t04 t04Var = new r45.t04();
            t04Var.mo11468x92b714fd(m75934xbce7f2f.f273689a);
            il4Var = (r45.il4) t04Var.m75936x14adae67(0);
        }
        oVar.f389958d.c(true, arrayList3.size(), il4Var);
        oVar.e(arrayList3.size() > 0 ? 0 : 8);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        for (r45.xn1 xn1Var : arrayList3) {
            java.util.Map map = ((mm2.y2) oVar.f389956b.a(mm2.y2.class)).A;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            if (c19782x23db1cfa2 == null || (str = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
                str = "";
            }
            dk2.b8 b8Var = (dk2.b8) map.get(str);
            long j17 = b8Var != null ? b8Var.f314775a : 0L;
            boolean z17 = j17 > 0 && c01.id.c() > j17;
            if (j17 <= 0 || z17) {
                java.util.Map map2 = ((mm2.y2) oVar.f389956b.a(mm2.y2.class)).A;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                if (c19782x23db1cfa3 == null || (str2 = c19782x23db1cfa3.m76197x6c03c64c()) == null) {
                    str2 = "";
                }
                map2.remove(str2);
                gVar = vi2.g.f519079d;
            } else {
                gVar = vi2.g.f519081f;
            }
            arrayList4.add(new vi2.h(gVar, xn1Var));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new kj2.n(oVar, arrayList4), true).a(new kj2.m(oVar, arrayList4));
        android.widget.TextView textView = oVar.f389959e;
        if (textView == null) {
            return;
        }
        textView.setText(oVar.f389955a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz9, java.lang.Integer.valueOf(oVar.f389962h.size())));
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInviteVisitorMicWidget", "hide");
        this.f389960f.clear();
        this.f389962h.clear();
        this.f389963i.m8146xced61ae5();
        e(8);
    }

    public final void c() {
        pm0.v.X(new kj2.e(this));
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInviteVisitorMicWidget", "reload");
        pm0.v.X(new kj2.f(this));
    }

    public final void e(int i17) {
        android.view.View view = this.f389955a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveInviteVisitorMicWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveInviteVisitorMicWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show isActive: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f389961g;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInviteVisitorMicWidget", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f389961g;
        boolean z17 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 a17 = this.f389957c.a();
        this.f389961g = a17 != null ? p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new kj2.l(this, null), 3, null) : null;
    }
}
