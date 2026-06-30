package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class ko extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f188758u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f188759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, boolean z17, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(context, i17, i18, z17, 0, false, 48, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f188758u = fragment;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void J(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (i17 < 0 || i17 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object obj = z().f188689e.m56388xcaeb60d0().get(i17);
        h0Var.f391656d = obj;
        if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && (this.f188758u instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca)) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            ym5.a1.h(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jo(this, V6, h0Var, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", "onGridItemClick");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
            sb6.append(", pos:");
            sb6.append(a07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(z().f188689e, intent, a07, null, 4, null);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188758u;
            if (fragment instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) {
                intent.putExtra("topic_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).f191579x);
                java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).A;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                intent.putExtra("from_object_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).f191581z);
                intent.putExtra("business_type", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).I);
                intent.putExtra("single_comment_scene", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).C);
                intent.putExtra("source_session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).F);
                intent.putExtra("cli_report_info", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) fragment).f191575J);
                intent.putExtra("key_click_feed_id", j5Var.mo2128x1ed62e84());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(this.f187707d, intent);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f525714d, m56022x4905e9fa(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), null, 8, null), 14, null);
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = fragment.mo7430x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e activityC13661xea07466e = mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e) mo7430x19263085 : null;
            if (activityC13661xea07466e != null) {
                activityC13661xea07466e.f183334v = 2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            i0Var.Zk((android.app.Activity) context, intent);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            java.lang.String w17 = abstractC14490x69736cb52.w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
            java.lang.String jSONObject = abstractC14490x69736cb52.getUdfKv().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, mo2128x1ed62e84, w17, m82555x4905e9fa, 0, jSONObject, 0L, null, 208, null);
            W(V6, j5Var, i17, "view_clk");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    public final void W(r45.qt2 qt2Var, so2.j5 j5Var, int i17, java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f188758u;
        if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            java.lang.String ek6 = o3Var.ek(mo2128x1ed62e84, abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
            lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
            lVarArr[3] = new jz5.l("session_buffer", ek6);
            lVarArr[4] = new jz5.l("feed_id", pm0.v.u(hc2.o0.s(j5Var)));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("finder_dstream_feed", str, l17, 1, false);
            l17.putAll(kz5.c1.k(new jz5.l("cluster_name", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) componentCallbacksC1101xa17d4670).G), new jz5.l("source_feedid", pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) componentCallbacksC1101xa17d4670).f191581z)), new jz5.l("source_session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) componentCallbacksC1101xa17d4670).F), new jz5.l("cluster_id", pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) componentCallbacksC1101xa17d4670).f191579x)), new jz5.l("cluster_tabtype", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca) componentCallbacksC1101xa17d4670).f191580y)), new jz5.l("feed_id", pm0.v.u(hc2.o0.s(j5Var))), new jz5.l(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17))));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("cluster_feature_card", str, l17, 1, false);
        }
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
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188758u;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", "getEmptyView");
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
        this.f188759v = inflate;
        if (inflate != null) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilh);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f187713m.m82697xe136b7d8(new android.widget.ImageView(abstractActivityC21394xb3d2c0cf));
        }
        return this.f188759v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", "getHeaderView");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", "getItemDecoration");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0) this.f187717q).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayContract", "getLayoutManager");
        return this.f187717q.d(context);
    }
}
