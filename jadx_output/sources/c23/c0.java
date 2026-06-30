package c23;

/* loaded from: classes12.dex */
public final class c0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f38006e;

    /* renamed from: f, reason: collision with root package name */
    public long f38007f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f38008g;

    /* renamed from: h, reason: collision with root package name */
    public long f38009h;

    /* renamed from: i, reason: collision with root package name */
    public int f38010i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f38011m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f38012n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38013o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38014p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38015q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f38016r;

    /* renamed from: s, reason: collision with root package name */
    public int f38017s;

    /* renamed from: t, reason: collision with root package name */
    public em.l0 f38018t;

    /* renamed from: u, reason: collision with root package name */
    public final c23.u f38019u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38005d = "MicroMsg.FTS.FTSRelevantSearchFooterUIC";
        this.f38006e = "";
        this.f38008g = new java.util.LinkedList();
        this.f38010i = 10;
        this.f38011m = "";
        this.f38012n = "";
        this.f38019u = new c23.u(false);
    }

    public static final void T6(c23.c0 c0Var, java.lang.String str, long j17, java.util.LinkedList linkedList, boolean z17, java.lang.String str2, boolean z18, boolean z19) {
        char c17;
        java.lang.String str3;
        java.lang.CharSequence charSequence;
        boolean z27;
        com.tencent.mm.plugin.fts.ui.q2 q2Var;
        j75.f stateCenter;
        java.lang.String str4;
        java.lang.CharSequence charSequence2;
        r45.ak6 ak6Var;
        com.tencent.mm.plugin.fts.ui.q2 q2Var2;
        em.l0 l0Var = c0Var.f38018t;
        if (l0Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (l0Var.f254533e == null) {
                    l0Var.f254533e = (android.widget.TextView) l0Var.f254529a.findViewById(com.tencent.mm.R.id.ltq);
                }
                l0Var.f254533e.setText(str2);
            }
            l0Var.a().removeAllViews();
            boolean z28 = false;
            if (j62.e.g().i("clicfg_search_global_fts_sug_disable_raw_sug", 0, true, false) == 1 && z19) {
                return;
            }
            if (!z17) {
                em.l0 l0Var2 = c0Var.f38018t;
                android.widget.LinearLayout b17 = l0Var2 != null ? l0Var2.b() : null;
                if (b17 == null) {
                    return;
                }
                b17.setVisibility(8);
                return;
            }
            em.l0 l0Var3 = c0Var.f38018t;
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
                if (!c0Var.f38013o || i17 < c0Var.f38010i) {
                    r45.jo0 jo0Var = new r45.jo0();
                    jo0Var.f377988f = j17;
                    jo0Var.f377987e = i17;
                    jo0Var.f377986d = di6Var;
                    linkedList2.add(jo0Var);
                }
                i17 = i18;
            }
            if (linkedList2.isEmpty()) {
                r45.jo0 jo0Var2 = new r45.jo0();
                jo0Var2.f377988f = j17;
                jo0Var2.f377987e = 0;
                r45.di6 di6Var2 = new r45.di6();
                di6Var2.f372512d = str;
                di6Var2.f372513e = "LocalRelevantQuery";
                di6Var2.f372516h = 1;
                jo0Var2.f377986d = di6Var2;
                linkedList2.add(jo0Var2);
            }
            android.app.Activity context = c0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            if (((z13.f) a17).f7() && !linkedList2.isEmpty()) {
                r45.di6 di6Var3 = ((r45.jo0) kz5.n0.X(linkedList2)).f377986d;
                if (kotlin.jvm.internal.o.b(di6Var3 != null ? di6Var3.f372512d : null, str)) {
                    com.tencent.mars.xlog.Log.i(c0Var.f38005d, "[fts] removeSugItemEqualToQueryAtFirstIfNeeded: " + str);
                    linkedList2.removeFirst();
                }
            }
            if (linkedList2.isEmpty()) {
                em.l0 l0Var4 = c0Var.f38018t;
                android.widget.LinearLayout b19 = l0Var4 != null ? l0Var4.b() : null;
                if (b19 == null) {
                    return;
                }
                b19.setVisibility(8);
                return;
            }
            java.lang.String str5 = "";
            c0Var.f38012n = "";
            android.app.Activity context2 = c0Var.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(z13.f.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            boolean f76 = ((z13.f) a18).f7();
            boolean z29 = c0Var.f38017s > 0;
            int i19 = com.tencent.mm.R.id.f483271d15;
            java.lang.String str6 = "getArrowUpLeft(...)";
            java.lang.String str7 = "getArrowRight(...)";
            java.lang.String str8 = "getInflateRootView(...)";
            if (z29) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = c0Var.P6();
                com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = P6 instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) P6 : null;
                boolean z37 = (fTSMainUI != null && (q2Var2 = fTSMainUI.L1) != null && q2Var2.getCount() == 0) && !c0Var.U6();
                int i27 = 0;
                for (java.lang.Object obj2 : linkedList2) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.jo0 jo0Var3 = (r45.jo0) obj2;
                    android.view.View inflate = android.view.LayoutInflater.from(c0Var.getActivity()).inflate(com.tencent.mm.R.layout.efp, l0Var.a(), z28);
                    em.k0 k0Var = new em.k0(inflate);
                    android.app.Activity context3 = c0Var.getContext();
                    kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
                    if (k0Var.f254492b == null) {
                        k0Var.f254492b = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(i19);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = k0Var.f254492b;
                    kotlin.jvm.internal.o.f(weImageView, "getArrowRight(...)");
                    if (k0Var.f254493c == null) {
                        k0Var.f254493c = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.sf7);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = k0Var.f254493c;
                    kotlin.jvm.internal.o.f(weImageView2, str6);
                    java.lang.String str9 = str6;
                    int i29 = i27;
                    java.lang.String str10 = str5;
                    c0Var.W6(context3, inflate, weImageView, weImageView2, jo0Var3, f76, z37);
                    r45.di6 di6Var4 = jo0Var3.f377986d;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(di6Var4 != null ? di6Var4.f372520o : null)) {
                        r45.di6 di6Var5 = jo0Var3.f377986d;
                        if (di6Var5 == null || (str4 = di6Var5.f372512d) == null) {
                            str4 = str10;
                        }
                        charSequence2 = o13.q.e(p13.i.d(str4, p13.r.b(c0Var.f38006e, false), false, false)).f351105a;
                    } else {
                        int color = c0Var.getResources().getColor(com.tencent.mm.R.color.Brand_90);
                        r45.di6 di6Var6 = jo0Var3.f377986d;
                        charSequence2 = o13.q.g(di6Var6 != null ? di6Var6.f372520o : null, color);
                    }
                    k0Var.b().setText(charSequence2);
                    if (i29 == c0Var.f38008g.size() - 1) {
                        android.view.View a19 = k0Var.a();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(a19, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(a19, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View a27 = k0Var.a();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(a27, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(a27, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addNewSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    inflate.setOnClickListener(new c23.v(c0Var, jo0Var3, i29));
                    inflate.setTag(jo0Var3);
                    r45.di6 di6Var7 = jo0Var3.f377986d;
                    if (di6Var7 != null && (ak6Var = di6Var7.f372521p) != null) {
                        int i37 = ak6Var.f370072d;
                        if (i37 != 3) {
                            if (i37 == 6) {
                                k0Var.c().setVisibility(0);
                                k0Var.d().setVisibility(0);
                                k0Var.d().setTextColor(c0Var.getResources().getColor(com.tencent.mm.R.color.OrangeRed_100));
                                android.widget.TextView d17 = k0Var.d();
                                com.tencent.mm.protobuf.g gVar = ak6Var.f370073e;
                                d17.setText(gVar != null ? gVar.i() : str10);
                            } else if (i37 != 32) {
                                if (i37 == 33) {
                                    k0Var.c().setVisibility(0);
                                    android.view.ViewGroup.LayoutParams layoutParams = k0Var.c().getLayoutParams();
                                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.width = i65.a.h(c0Var.getContext(), com.tencent.mm.R.dimen.f479673ca);
                                    layoutParams2.height = i65.a.h(c0Var.getContext(), com.tencent.mm.R.dimen.f479673ca);
                                    k0Var.c().setLayoutParams(layoutParams2);
                                    k0Var.c().setImageResource(com.tencent.mm.R.raw.fts_ai_logo);
                                    k0Var.c().setIconColor(i65.a.d(c0Var.getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_2));
                                }
                            }
                        }
                        k0Var.d().setVisibility(0);
                        android.widget.TextView d18 = k0Var.d();
                        com.tencent.mm.protobuf.g gVar2 = ak6Var.f370073e;
                        d18.setText(gVar2 != null ? gVar2.i() : str10);
                        if (ak6Var.f370072d == 32) {
                            k0Var.d().setTextColor(c0Var.getResources().getColor(com.tencent.mm.R.color.f478520a84));
                        } else {
                            k0Var.d().setTextColor(c0Var.getResources().getColor(com.tencent.mm.R.color.adg));
                        }
                        k0Var.d().setBackground(c0Var.getResources().getDrawable(com.tencent.mm.R.drawable.f481854d55));
                        android.view.ViewGroup.LayoutParams layoutParams3 = k0Var.d().getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.setMarginStart(com.tencent.mm.ui.zk.a(c0Var.getContext(), 4));
                        k0Var.d().setLayoutParams(layoutParams4);
                    }
                    l0Var.a().addView(inflate);
                    java.lang.String str11 = c0Var.f38012n;
                    if (!(str11 == null || str11.length() == 0)) {
                        c0Var.f38012n += '|';
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(c0Var.f38012n);
                    r45.di6 di6Var8 = jo0Var3.f377986d;
                    sb6.append(di6Var8 != null ? di6Var8.f372512d : null);
                    c0Var.f38012n = sb6.toString();
                    i27 = i28;
                    str5 = str10;
                    str6 = str9;
                    i19 = com.tencent.mm.R.id.f483271d15;
                    z28 = false;
                }
            } else {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = c0Var.P6();
                com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI2 = P62 instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) P62 : null;
                boolean z38 = (fTSMainUI2 != null && (q2Var = fTSMainUI2.L1) != null && q2Var.getCount() == 0) && !c0Var.U6();
                int i38 = 0;
                for (java.lang.Object obj3 : linkedList2) {
                    int i39 = i38 + 1;
                    if (i38 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.jo0 jo0Var4 = (r45.jo0) obj3;
                    android.view.View inflate2 = android.view.LayoutInflater.from(c0Var.getActivity()).inflate(com.tencent.mm.R.layout.bcx, (android.view.ViewGroup) l0Var.a(), false);
                    android.app.Activity context4 = c0Var.getContext();
                    kotlin.jvm.internal.o.f(inflate2, str8);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.f483271d15);
                    kotlin.jvm.internal.o.f(weImageView3, str7);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.sf7);
                    kotlin.jvm.internal.o.f(weImageView4, "getArrowUpLeft(...)");
                    java.lang.String str12 = str8;
                    int i47 = i38;
                    java.lang.String str13 = str7;
                    c0Var.W6(context4, inflate2, weImageView3, weImageView4, jo0Var4, f76, z38);
                    r45.di6 di6Var9 = jo0Var4.f377986d;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(di6Var9 != null ? di6Var9.f372520o : null)) {
                        c17 = 150;
                        r45.di6 di6Var10 = jo0Var4.f377986d;
                        if (di6Var10 == null || (str3 = di6Var10.f372512d) == null) {
                            str3 = "";
                        }
                        charSequence = o13.q.e(p13.i.d(str3, p13.r.b(c0Var.f38006e, false), false, false)).f351105a;
                    } else {
                        c17 = 150;
                        int color2 = c0Var.getResources().getColor(com.tencent.mm.R.color.Brand_90);
                        r45.di6 di6Var11 = jo0Var4.f377986d;
                        charSequence = o13.q.g(di6Var11 != null ? di6Var11.f372520o : null, color2);
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ltk)).setText(charSequence);
                    if (i47 == c0Var.f38008g.size() - 1) {
                        android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.lt8);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "addSugItemView", "(Ljava/util/LinkedList;Lcom/tencent/mm/autogen/viewbinding/FtsRelevantSearchFooterVB;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        z27 = false;
                    } else {
                        android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.lt8);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
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
                    java.lang.String str14 = c0Var.f38012n;
                    if (!((str14 == null || str14.length() == 0) ? true : z27)) {
                        c0Var.f38012n += '|';
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c0Var.f38012n);
                    r45.di6 di6Var12 = jo0Var4.f377986d;
                    sb7.append(di6Var12 != null ? di6Var12.f372512d : null);
                    c0Var.f38012n = sb7.toString();
                    str8 = str12;
                    i38 = i39;
                    str7 = str13;
                }
            }
            java.lang.String str15 = c0Var.f38012n;
            kotlin.jvm.internal.o.g(str15, "<set-?>");
            com.tencent.mm.plugin.fts.ui.c3.f138031b = str15;
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = c0Var.P6();
            if (P63 == null || (stateCenter = P63.getStateCenter()) == null) {
                return;
            }
            stateCenter.B3(new fi0.i(str, j17, linkedList));
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
            java.lang.String r1 = r4.f38006e     // Catch: java.lang.Exception -> L25
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
            java.lang.String r1 = r4.f38006e     // Catch: java.lang.Exception -> L25
            boolean r1 = o13.n.n(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = r4.f38006e     // Catch: java.lang.Exception -> L25
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
            java.lang.String r3 = r4.f38005d
            com.tencent.mars.xlog.Log.e(r3, r2, r1)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c23.c0.U6():boolean");
    }

    public final void V6(java.lang.String str, long j17, boolean z17, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i(this.f38005d, "[fts][sug] footer onStartSearch: " + str + ", " + j17 + ", " + z17 + ", " + bool);
        em.l0 l0Var = this.f38018t;
        if (l0Var != null) {
            l0Var.a().removeAllViews();
            em.l0 l0Var2 = this.f38018t;
            android.widget.LinearLayout b17 = l0Var2 != null ? l0Var2.b() : null;
            if (b17 != null) {
                b17.setVisibility(8);
            }
        }
        synchronized (this.f38019u) {
            this.f38019u.f38057a = false;
        }
        this.f38015q = false;
        this.f38008g = new java.util.LinkedList();
        this.f38010i = 10;
        this.f38011m = "";
    }

    public final void W6(android.content.Context context, android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, r45.jo0 jo0Var, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        if (z17) {
            view.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479672c9), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (!z17 || !z18) {
            weImageView2.setVisibility(8);
            weImageView.setVisibility(0);
        } else {
            weImageView2.setVisibility(0);
            weImageView.setVisibility(8);
            weImageView2.setOnClickListener(new c23.b0(fVar, jo0Var));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f38016r = getActivity().findViewById(com.tencent.mm.R.id.typ);
        this.f38017s = j62.e.g().i("clicfg_android_fts_websearch_sug_style", 1, true, true);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new c23.z(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.m3(getActivity(), new c23.a0(this));
        }
    }
}
