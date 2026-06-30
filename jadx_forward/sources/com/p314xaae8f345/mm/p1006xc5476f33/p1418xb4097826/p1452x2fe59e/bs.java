package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class bs extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f187944u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f187945v;

    /* renamed from: w, reason: collision with root package name */
    public int f187946w;

    /* renamed from: x, reason: collision with root package name */
    public int f187947x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, boolean z17, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(context, i17, i18, z17, 0, false, 48, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f187944u = fragment;
        this.f187946w = 337;
        this.f187947x = 336;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void J(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f187944u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (i17 < 0 || i17 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j5Var.mo2128x1ed62e84()));
        lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr[4] = new jz5.l("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j5Var.mo2128x1ed62e84(), null, V6 != null ? V6.m75939xb282bd08(5) : 0));
        d2Var.n(itemView, "finder_dstream_feed", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(lVarArr), (r20 & 128) != 0 ? null : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "onGridItemClick");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "onClick " + a07 + " id:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() + ", pos:" + a07);
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(z().f188689e, intent, a07, null, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13912xc57e89ad c13912xc57e89ad = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13912xc57e89ad) abstractC13919x46aff122;
            intent.putExtra("KEY_BY_PASS", c13912xc57e89ad.f189155d);
            intent.putExtra("KEY_PREFETCH", c13912xc57e89ad.f189156e);
            intent.putExtra("KEY_BUSINESS_TYPE", c13912xc57e89ad.f189157f);
            intent.putExtra("KEY_JUMP_FEEDID", c13912xc57e89ad.f189158g);
            intent.putExtra("KEY_SOURCE_SESSION_BUFFER", c13912xc57e89ad.f189159h);
            intent.putExtra("KEY_CLI_REPORT_INFO", c13912xc57e89ad.f189161m);
            intent.putExtra("key_click_feed_id", j5Var.mo2128x1ed62e84());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            iyVar.c(this.f187707d, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f525714d, m56022x4905e9fa(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), null, 8, null), 14, null);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f187944u;
            if (fragment instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a) fragment).B = 2;
            }
            intent.putExtra("KEY_SINGLE_COMMENT_SCENE", this.f187946w);
            intent.putExtra("KEY_DOUBLE_COMMENT_SCENE", this.f187947x);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            i0Var.getClass();
            intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14079xb263cf2f.class);
            iyVar.c(activity, intent);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRecommendReasonTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRecommendReasonTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            java.lang.String w17 = abstractC14490x69736cb5.w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
            java.lang.String jSONObject = abstractC14490x69736cb5.getUdfKv().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, mo2128x1ed62e84, w17, m82555x4905e9fa, 0, jSONObject, 0L, null, 208, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, j5Var, 18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        this.f187713m.m82690xd3a27e96(false);
        this.f187713m.m82565x6107557d(true);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f187944u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(m56022x4905e9fa());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "getEmptyView");
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.f565762dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View v() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd, null);
        this.f187945v = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f187945v;
        android.view.View findViewById2 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ilh) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f187713m.m82697xe136b7d8(new android.widget.ImageView(abstractActivityC21394xb3d2c0cf));
        return this.f187945v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "getHeaderView");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "getItemDecoration");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0) this.f187717q).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecommendReasonContract", "getLayoutManager");
        return this.f187717q.d(context);
    }
}
