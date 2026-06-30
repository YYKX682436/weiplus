package bm2;

/* loaded from: classes3.dex */
public final class b6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.c6 f103331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.v2 f103332e;

    public b6(bm2.c6 c6Var, el2.v2 v2Var) {
        this.f103331d = c6Var;
        this.f103332e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zl2.r4 r4Var;
        bw5.mb0 P0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bm2.c6 c6Var = this.f103331d;
        c6Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemClick] type:");
        el2.v2 v2Var = this.f103332e;
        sb6.append(v2Var.mo127815xfb85f7b0());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = c6Var.f103353g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.Object mo127813xfb7e5820 = v2Var.mo127813xfb7e5820();
            jz5.f0 f0Var = null;
            f0Var = null;
            if (mo127813xfb7e5820 instanceof r45.k92) {
                java.lang.Object mo127813xfb7e58202 = v2Var.mo127813xfb7e5820();
                r45.k92 k92Var = mo127813xfb7e58202 instanceof r45.k92 ? (r45.k92) mo127813xfb7e58202 : null;
                if (k92Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r.f195592n.a(context, eVar, str, new cm2.h0(k92Var));
                }
            } else if (mo127813xfb7e5820 instanceof r45.wd5) {
                java.lang.Object mo127813xfb7e58203 = v2Var.mo127813xfb7e5820();
                r45.wd5 wd5Var = mo127813xfb7e58203 instanceof r45.wd5 ? (r45.wd5) mo127813xfb7e58203 : null;
                if (wd5Var != null) {
                    java.lang.String m75945x2fec8307 = wd5Var.m75945x2fec8307(4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "url: " + m75945x2fec8307);
                    android.content.Intent intent = new android.content.Intent();
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    intent.putExtra("rawUrl", m75945x2fec8307);
                    intent.putExtra("convertActivityFromTranslucent", true);
                    j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, 1011);
                }
            } else if (mo127813xfb7e5820 instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) {
                java.lang.Object mo127813xfb7e58204 = v2Var.mo127813xfb7e5820();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = mo127813xfb7e58204 instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) mo127813xfb7e58204 : null;
                if (c19786x6a1e2862 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40.f193640m.a(context, new cm2.b0(c19786x6a1e2862, v2Var.mo127815xfb85f7b0()));
                }
            } else if (mo127813xfb7e5820 instanceof r45.qy1) {
                java.lang.Object mo127813xfb7e58205 = v2Var.mo127813xfb7e5820();
                r45.qy1 qy1Var = mo127813xfb7e58205 instanceof r45.qy1 ? (r45.qy1) mo127813xfb7e58205 : null;
                if (qy1Var != null && (P0 = (r4Var = zl2.r4.f555483a).P0(qy1Var)) != null) {
                    r4Var.r2(context, P0, bw5.ar0.TingScene_Live_AnchorAddCategoryLiveHalfPage);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "jump ting but play info is null!");
                }
                gk2.e eVar2 = dk2.ef.I;
                if (eVar2 != null) {
                    bf2.c.b(bf2.c.f101131a, eVar2, 8, 12, null, 0, 24, null);
                }
            } else if (mo127813xfb7e5820 instanceof r45.do2) {
                java.lang.Object mo127813xfb7e58206 = v2Var.mo127813xfb7e5820();
                r45.do2 do2Var = mo127813xfb7e58206 instanceof r45.do2 ? (r45.do2) mo127813xfb7e58206 : null;
                if (do2Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    if (k0Var != null) {
                        qo0.c.a(k0Var, qo0.b.J2, null, 2, null);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onItemClick] invalid item");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
