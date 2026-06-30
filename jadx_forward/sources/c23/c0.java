package c23;

/* loaded from: classes12.dex */
public final class c0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f119539e;

    /* renamed from: f, reason: collision with root package name */
    public long f119540f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f119541g;

    /* renamed from: h, reason: collision with root package name */
    public long f119542h;

    /* renamed from: i, reason: collision with root package name */
    public int f119543i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f119544m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f119545n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f119546o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f119547p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f119548q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f119549r;

    /* renamed from: s, reason: collision with root package name */
    public int f119550s;

    /* renamed from: t, reason: collision with root package name */
    public em.l0 f119551t;

    /* renamed from: u, reason: collision with root package name */
    public final c23.u f119552u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119538d = "MicroMsg.FTS.FTSRelevantSearchFooterUIC";
        this.f119539e = "";
        this.f119541g = new java.util.LinkedList();
        this.f119543i = 10;
        this.f119544m = "";
        this.f119545n = "";
        this.f119552u = new c23.u(false);
    }

    public static final void T6(c23.c0 c0Var, java.lang.String str, long j17, java.util.LinkedList linkedList, boolean z17, java.lang.String str2, boolean z18, boolean z19) {
        char c17;
        java.lang.String str3;
        java.lang.CharSequence charSequence;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var;
        j75.f m67437x4bd5310;
        java.lang.String str4;
        java.lang.CharSequence charSequence2;
        r45.ak6 ak6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var2;
        em.l0 l0Var = c0Var.f119551t;
        if (l0Var != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (l0Var.f336066e == null) {
                    l0Var.f336066e = (android.widget.TextView) l0Var.f336062a.findViewById(com.p314xaae8f345.mm.R.id.ltq);
                }
                l0Var.f336066e.setText(str2);
            }
            l0Var.a().removeAllViews();
            boolean z28 = false;
            if (j62.e.g().i("clicfg_search_global_fts_sug_disable_raw_sug", 0, true, false) == 1 && z19) {
                return;
            }
            if (!z17) {
                em.l0 l0Var2 = c0Var.f119551t;
                android.widget.LinearLayout b17 = l0Var2 != null ? l0Var2.b() : null;
                if (b17 == null) {
                    return;
                }
                b17.setVisibility(8);
                return;
            }
            em.l0 l0Var3 = c0Var.f119551t;
            android.widget.LinearLayout b18 = l0Var3 != null ? l0Var3.b() : null;
            if (b18 != null) {
                b18.setVisibility(0);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.di6 di6Var = (r45.di6) obj;
                if (!c0Var.f119546o || i17 < c0Var.f119543i) {
                    r45.jo0 jo0Var = new r45.jo0();
                    jo0Var.f459521f = j17;
                    jo0Var.f459520e = i17;
                    jo0Var.f459519d = di6Var;
                    linkedList2.add(jo0Var);
                }
                i17 = i18;
            }
            if (linkedList2.isEmpty()) {
                r45.jo0 jo0Var2 = new r45.jo0();
                jo0Var2.f459521f = j17;
                jo0Var2.f459520e = 0;
                r45.di6 di6Var2 = new r45.di6();
                di6Var2.f454045d = str;
                di6Var2.f454046e = "LocalRelevantQuery";
                di6Var2.f454049h = 1;
                jo0Var2.f459519d = di6Var2;
                linkedList2.add(jo0Var2);
            }
            android.app.Activity context = c0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            if (((z13.f) a17).f7() && !linkedList2.isEmpty()) {
                r45.di6 di6Var3 = ((r45.jo0) kz5.n0.X(linkedList2)).f459519d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(di6Var3 != null ? di6Var3.f454045d : null, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f119538d, "[fts] removeSugItemEqualToQueryAtFirstIfNeeded: " + str);
                    linkedList2.removeFirst();
                }
            }
            if (linkedList2.isEmpty()) {
                em.l0 l0Var4 = c0Var.f119551t;
                android.widget.LinearLayout b19 = l0Var4 != null ? l0Var4.b() : null;
                if (b19 == null) {
                    return;
                }
                b19.setVisibility(8);
                return;
            }
            java.lang.String str5 = "";
            c0Var.f119545n = "";
            android.app.Activity context2 = c0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            boolean f76 = ((z13.f) a18).f7();
            boolean z29 = c0Var.f119550s > 0;
            int i19 = com.p314xaae8f345.mm.R.id.f564804d15;
            java.lang.String str6 = "getArrowUpLeft(...)";
            java.lang.String str7 = "getArrowRight(...)";
            java.lang.String str8 = "getInflateRootView(...)";
            if (z29) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = c0Var.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = P6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) P6 : null;
                boolean z37 = (activityC15607x502bbbb2 != null && (q2Var2 = activityC15607x502bbbb2.L1) != null && q2Var2.getCount() == 0) && !c0Var.U6();
                int i27 = 0;
                for (java.lang.Object obj2 : linkedList2) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.jo0 jo0Var3 = (r45.jo0) obj2;
                    android.view.View inflate = android.view.LayoutInflater.from(c0Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efp, l0Var.a(), z28);
                    em.k0 k0Var = new em.k0(inflate);
                    android.app.Activity m80379x76847179 = c0Var.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
                    if (k0Var.f336025b == null) {
                        k0Var.f336025b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(i19);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = k0Var.f336025b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "getArrowRight(...)");
                    if (k0Var.f336026c == null) {
                        k0Var.f336026c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.sf7);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = k0Var.f336026c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3522, str6);
                    java.lang.String str9 = str6;
                    int i29 = i27;
                    java.lang.String str10 = str5;
                    c0Var.W6(m80379x76847179, inflate, c22699x3dcdb352, c22699x3dcdb3522, jo0Var3, f76, z37);
                    r45.di6 di6Var4 = jo0Var3.f459519d;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di6Var4 != null ? di6Var4.f454053o : null)) {
                        r45.di6 di6Var5 = jo0Var3.f459519d;
                        if (di6Var5 == null || (str4 = di6Var5.f454045d) == null) {
                            str4 = str10;
                        }
                        charSequence2 = o13.q.e(p13.i.d(str4, p13.r.b(c0Var.f119539e, false), false, false)).f432638a;
                    } else {
                        int color = c0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77742x25702ef);
                        r45.di6 di6Var6 = jo0Var3.f459519d;
                        charSequence2 = o13.q.g(di6Var6 != null ? di6Var6.f454053o : null, color);
                    }
                    k0Var.b().setText(charSequence2);
                    if (i29 == c0Var.f119541g.size() - 1) {
                        android.view.View a19 = k0Var.a();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(a19, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(a19, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View a27 = k0Var.a();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(a27, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(a27, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    inflate.setOnClickListener(new c23.v(c0Var, jo0Var3, i29));
                    inflate.setTag(jo0Var3);
                    r45.di6 di6Var7 = jo0Var3.f459519d;
                    if (di6Var7 != null && (ak6Var = di6Var7.f454054p) != null) {
                        int i37 = ak6Var.f451605d;
                        if (i37 != 3) {
                            if (i37 == 6) {
                                k0Var.c().setVisibility(0);
                                k0Var.d().setVisibility(0);
                                k0Var.d().setTextColor(c0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77843xb0e5e715));
                                android.widget.TextView d17 = k0Var.d();
                                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ak6Var.f451606e;
                                d17.setText(gVar != null ? gVar.i() : str10);
                            } else if (i37 != 32) {
                                if (i37 == 33) {
                                    k0Var.c().setVisibility(0);
                                    android.view.ViewGroup.LayoutParams layoutParams = k0Var.c().getLayoutParams();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.width = i65.a.h(c0Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
                                    layoutParams2.height = i65.a.h(c0Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
                                    k0Var.c().setLayoutParams(layoutParams2);
                                    k0Var.c().setImageResource(com.p314xaae8f345.mm.R.raw.f79414xef8aca88);
                                    k0Var.c().m82040x7541828(i65.a.d(c0Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                                }
                            }
                        }
                        k0Var.d().setVisibility(0);
                        android.widget.TextView d18 = k0Var.d();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ak6Var.f451606e;
                        d18.setText(gVar2 != null ? gVar2.i() : str10);
                        if (ak6Var.f451605d == 32) {
                            k0Var.d().setTextColor(c0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
                        } else {
                            k0Var.d().setTextColor(c0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
                        }
                        k0Var.d().setBackground(c0Var.m158361x893a2f6f().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563387d55));
                        android.view.ViewGroup.LayoutParams layoutParams3 = k0Var.d().getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.setMarginStart(com.p314xaae8f345.mm.ui.zk.a(c0Var.m80379x76847179(), 4));
                        k0Var.d().setLayoutParams(layoutParams4);
                    }
                    l0Var.a().addView(inflate);
                    java.lang.String str11 = c0Var.f119545n;
                    if (!(str11 == null || str11.length() == 0)) {
                        c0Var.f119545n += '|';
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(c0Var.f119545n);
                    r45.di6 di6Var8 = jo0Var3.f459519d;
                    sb6.append(di6Var8 != null ? di6Var8.f454045d : null);
                    c0Var.f119545n = sb6.toString();
                    i27 = i28;
                    str5 = str10;
                    str6 = str9;
                    i19 = com.p314xaae8f345.mm.R.id.f564804d15;
                    z28 = false;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = c0Var.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb22 = P62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) P62 : null;
                boolean z38 = (activityC15607x502bbbb22 != null && (q2Var = activityC15607x502bbbb22.L1) != null && q2Var.getCount() == 0) && !c0Var.U6();
                int i38 = 0;
                for (java.lang.Object obj3 : linkedList2) {
                    int i39 = i38 + 1;
                    if (i38 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.jo0 jo0Var4 = (r45.jo0) obj3;
                    android.view.View inflate2 = android.view.LayoutInflater.from(c0Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcx, (android.view.ViewGroup) l0Var.a(), false);
                    android.app.Activity m80379x768471792 = c0Var.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, str8);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564804d15);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3523, str7);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.sf7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb3524, "getArrowUpLeft(...)");
                    java.lang.String str12 = str8;
                    int i47 = i38;
                    java.lang.String str13 = str7;
                    c0Var.W6(m80379x768471792, inflate2, c22699x3dcdb3523, c22699x3dcdb3524, jo0Var4, f76, z38);
                    r45.di6 di6Var9 = jo0Var4.f459519d;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di6Var9 != null ? di6Var9.f454053o : null)) {
                        c17 = 150;
                        r45.di6 di6Var10 = jo0Var4.f459519d;
                        if (di6Var10 == null || (str3 = di6Var10.f454045d) == null) {
                            str3 = "";
                        }
                        charSequence = o13.q.e(p13.i.d(str3, p13.r.b(c0Var.f119539e, false), false, false)).f432638a;
                    } else {
                        c17 = 150;
                        int color2 = c0Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77742x25702ef);
                        r45.di6 di6Var11 = jo0Var4.f459519d;
                        charSequence = o13.q.g(di6Var11 != null ? di6Var11.f454053o : null, color2);
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ltk)).setText(charSequence);
                    if (i47 == c0Var.f119541g.size() - 1) {
                        android.view.View findViewById = inflate2.findViewById(com.p314xaae8f345.mm.R.id.lt8);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        z27 = false;
                    } else {
                        android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.lt8);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        z27 = false;
                        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    inflate2.setOnClickListener(new c23.w(c0Var, jo0Var4, i47));
                    inflate2.setTag(jo0Var4);
                    l0Var.a().addView(inflate2);
                    java.lang.String str14 = c0Var.f119545n;
                    if (!((str14 == null || str14.length() == 0) ? true : z27)) {
                        c0Var.f119545n += '|';
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c0Var.f119545n);
                    r45.di6 di6Var12 = jo0Var4.f459519d;
                    sb7.append(di6Var12 != null ? di6Var12.f454045d : null);
                    c0Var.f119545n = sb7.toString();
                    str8 = str12;
                    i38 = i39;
                    str7 = str13;
                }
            }
            java.lang.String str15 = c0Var.f119545n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str15, "<set-?>");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c3.f219564b = str15;
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = c0Var.P6();
            if (P63 == null || (m67437x4bd5310 = P63.m67437x4bd5310()) == null) {
                return;
            }
            m67437x4bd5310.B3(new fi0.i(str, j17, linkedList));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013 A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0001, B:5:0x0006, B:12:0x0013), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U6() {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f119539e     // Catch: java.lang.Exception -> L25
            r2 = 1
            if (r1 == 0) goto Lf
            int r1 = r1.length()     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = r0
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r1 == 0) goto L13
            return r0
        L13:
            java.lang.String r1 = r4.f119539e     // Catch: java.lang.Exception -> L25
            boolean r1 = o13.n.n(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = r4.f119539e     // Catch: java.lang.Exception -> L25
            boolean r3 = o13.n.o(r3)     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L23
            if (r3 == 0) goto L31
        L23:
            r0 = r2
            goto L31
        L25:
            r1 = move-exception
            java.lang.String r2 = "isContactFooterVisible error"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = r4.f119538d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2, r1)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c23.c0.U6():boolean");
    }

    public final void V6(java.lang.String str, long j17, boolean z17, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f119538d, "[fts][sug] footer onStartSearch: " + str + ", " + j17 + ", " + z17 + ", " + bool);
        em.l0 l0Var = this.f119551t;
        if (l0Var != null) {
            l0Var.a().removeAllViews();
            em.l0 l0Var2 = this.f119551t;
            android.widget.LinearLayout b17 = l0Var2 != null ? l0Var2.b() : null;
            if (b17 != null) {
                b17.setVisibility(8);
            }
        }
        synchronized (this.f119552u) {
            this.f119552u.f119590a = false;
        }
        this.f119548q = false;
        this.f119541g = new java.util.LinkedList();
        this.f119543i = 10;
        this.f119544m = "";
    }

    public final void W6(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522, r45.jo0 jo0Var, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        if (z17) {
            view.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (!z17 || !z18) {
            c22699x3dcdb3522.setVisibility(8);
            c22699x3dcdb352.setVisibility(0);
        } else {
            c22699x3dcdb3522.setVisibility(0);
            c22699x3dcdb352.setVisibility(8);
            c22699x3dcdb3522.setOnClickListener(new c23.b0(fVar, jo0Var));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f119549r = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.typ);
        this.f119550s = j62.e.g().i("clicfg_android_fts_websearch_sug_style", 1, true, true);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(m158354x19263085(), new c23.z(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.m3(m158354x19263085(), new c23.a0(this));
        }
    }
}
