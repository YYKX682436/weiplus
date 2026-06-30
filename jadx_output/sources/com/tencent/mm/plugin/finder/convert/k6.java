package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class k6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103806f;

    public k6(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.q6 q6Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f103804d = s0Var;
        this.f103805e = q6Var;
        this.f103806f = finderItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String string;
        r45.hz0 extInfo;
        android.content.Context context;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        int i17;
        boolean z17;
        android.view.View view;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2;
        char c17;
        r45.fm2 fm2Var = (r45.fm2) obj;
        in5.s0 s0Var = this.f103804d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484496rl3);
        if (p17 == null) {
            return;
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.s1l);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.s1f);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.s1g);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.s1h);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) s0Var.p(com.tencent.mm.R.id.c77);
        int i18 = 0;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484497te4);
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f103806f;
        boolean H = hc2.o0.H(finderItem3.getFeedObject());
        int i19 = 3;
        boolean z18 = 1;
        android.content.Context context2 = s0Var.f293121e;
        if (H) {
            string = context2.getString(com.tencent.mm.R.string.o2h);
        } else {
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderItem3.getFeedObject().getContact();
            string = (contact != null && (extInfo = contact.getExtInfo()) != null && extInfo.getInteger(3) == 2) != false ? context2.getString(com.tencent.mm.R.string.o2i) : context2.getString(com.tencent.mm.R.string.o2j);
        }
        textView2.setText(string);
        viewGroup.removeAllViews();
        java.util.Iterator it = fm2Var.getList(0).iterator();
        while (it.hasNext()) {
            r45.eb1 eb1Var = (r45.eb1) it.next();
            kotlin.jvm.internal.o.d(eb1Var);
            com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103805e;
            q6Var.getClass();
            java.lang.String string2 = eb1Var.getString(i18);
            if (string2 != null) {
                if (string2.length() > 0) {
                    i18 = z18;
                }
                if (i18 == z18) {
                    z17 = z18;
                    if (z17 || viewGroup.getChildCount() >= i19) {
                        view = p19;
                        finderItem2 = finderItem3;
                        c17 = 2;
                    } else {
                        android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
                        imageView.setClipToOutline(z18);
                        imageView.setOutlineProvider(new com.tencent.mm.plugin.finder.convert.e6());
                        if (eb1Var.getBoolean(3)) {
                            if ((!((ey2.l1) ((xy2.l) pf5.u.f353936a.e(zy2.b6.class).c(xy2.l.class))).O6() || q6Var.f104340e.r()) ? false : z18) {
                                pm0.v.w(new com.tencent.mm.plugin.finder.convert.d6(imageView));
                            } else {
                                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
                            }
                            view = p19;
                        } else {
                            boolean z19 = eb1Var.getBoolean(2);
                            mn2.g1 g1Var = mn2.g1.f329975a;
                            if (z19) {
                                view = p19;
                                g1Var.b().c(new mn2.e0(eb1Var.getString(0), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329957h));
                            } else {
                                view = p19;
                                finderItem2 = finderItem3;
                                c17 = 2;
                                g1Var.l().c(new mn2.n(eb1Var.getString(0), null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs), viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs));
                                layoutParams.setMarginEnd(viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl));
                                imageView.setLayoutParams(layoutParams);
                                viewGroup.addView(imageView);
                            }
                        }
                        finderItem2 = finderItem3;
                        c17 = 2;
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs), viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs));
                        layoutParams2.setMarginEnd(viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl));
                        imageView.setLayoutParams(layoutParams2);
                        viewGroup.addView(imageView);
                    }
                    finderItem3 = finderItem2;
                    p19 = view;
                    i19 = 3;
                    z18 = 1;
                    i18 = 0;
                }
            }
            z17 = false;
            if (z17) {
            }
            view = p19;
            finderItem2 = finderItem3;
            c17 = 2;
            finderItem3 = finderItem2;
            p19 = view;
            i19 = 3;
            z18 = 1;
            i18 = 0;
        }
        android.view.View view2 = p19;
        int i27 = z18;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = finderItem3;
        java.lang.Long valueOf = java.lang.Long.valueOf(fm2Var.getLong(i27));
        if ((valueOf.longValue() > 0 ? i27 : 0) == 0) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : viewGroup.getChildCount();
        if (((1 > longValue || longValue >= 4) ? 0 : i27) != 0) {
            textView.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            context = context2;
            finderItem = finderItem4;
            i17 = 0;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(context.getString(com.tencent.mm.R.string.njz, java.lang.Long.valueOf(longValue)));
        } else {
            context = context2;
            finderItem = finderItem4;
            i17 = 0;
            if (longValue > 3) {
                textView.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(context.getString(com.tencent.mm.R.string.njy, java.lang.Long.valueOf(longValue)));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (((com.tencent.mm.protocal.protobuf.FinderJumpInfo) fm2Var.getCustom(2)) == null) {
            view2.setOnClickListener(null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList5.get(i17)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = finderItem;
        p18.setOnClickListener(new com.tencent.mm.plugin.finder.convert.f6(s0Var, finderItem5));
        boolean z27 = i17;
        android.content.Context context3 = context;
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.j6(this.f103804d, fm2Var, this.f103805e, view2, this.f103806f));
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long id6 = finderItem5.getId();
        java.lang.String dupFlag = finderItem5.getDupFlag();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        java.lang.String ek6 = o3Var.ek(id6, dupFlag, nyVar != null ? nyVar.f135380n : z27 ? 1 : 0);
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view2, "increase_popularity_button");
        aVar.Tj(view2, 40, 1, z27);
        aVar.gk(view2, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("feed_id", pm0.v.u(finderItem5.getId())), new jz5.l("author_finder_username", finderItem5.getUserName()), new jz5.l("session_buffer", ek6)));
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(p18, "increase_popularity_people");
        aVar2.Tj(p18, 40, 1, false);
        aVar2.gk(p18, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("feed_id", pm0.v.u(finderItem5.getId())), new jz5.l("increase_popularity_uv", java.lang.Long.valueOf(fm2Var.getLong(1))), new jz5.l("session_buffer", ek6)));
    }
}
