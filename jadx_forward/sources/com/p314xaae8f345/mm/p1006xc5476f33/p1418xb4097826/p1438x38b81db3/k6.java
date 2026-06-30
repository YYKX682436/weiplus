package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class k6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f185339f;

    public k6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f185337d = s0Var;
        this.f185338e = q6Var;
        this.f185339f = c14994x9b99c079;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String string;
        r45.hz0 m76167xefeda639;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        int i17;
        boolean z17;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792;
        char c17;
        r45.fm2 fm2Var = (r45.fm2) obj;
        in5.s0 s0Var = this.f185337d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566029rl3);
        if (p17 == null) {
            return;
        }
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.s1l);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.s1f);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.s1g);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.s1h);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) s0Var.p(com.p314xaae8f345.mm.R.id.c77);
        int i18 = 0;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566030te4);
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = this.f185339f;
        boolean H = hc2.o0.H(c14994x9b99c0793.getFeedObject());
        int i19 = 3;
        boolean z18 = 1;
        android.content.Context context2 = s0Var.f374654e;
        if (H) {
            string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2h);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c14994x9b99c0793.getFeedObject().m76760x76845fea();
            string = (m76760x76845fea != null && (m76167xefeda639 = m76760x76845fea.m76167xefeda639()) != null && m76167xefeda639.m75939xb282bd08(3) == 2) != false ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2i) : context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2j);
        }
        textView2.setText(string);
        viewGroup.removeAllViews();
        java.util.Iterator it = fm2Var.m75941xfb821914(0).iterator();
        while (it.hasNext()) {
            r45.eb1 eb1Var = (r45.eb1) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eb1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f185338e;
            q6Var.getClass();
            java.lang.String m75945x2fec8307 = eb1Var.m75945x2fec8307(i18);
            if (m75945x2fec8307 != null) {
                if (m75945x2fec8307.length() > 0) {
                    i18 = z18;
                }
                if (i18 == z18) {
                    z17 = z18;
                    if (z17 || viewGroup.getChildCount() >= i19) {
                        view = p19;
                        c14994x9b99c0792 = c14994x9b99c0793;
                        c17 = 2;
                    } else {
                        android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
                        imageView.setClipToOutline(z18);
                        imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e6());
                        if (eb1Var.m75933x41a8a7f2(3)) {
                            if ((!((ey2.l1) ((xy2.l) pf5.u.f435469a.e(zy2.b6.class).c(xy2.l.class))).O6() || q6Var.f185873e.r()) ? false : z18) {
                                pm0.v.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d6(imageView));
                            } else {
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
                            }
                            view = p19;
                        } else {
                            boolean m75933x41a8a7f2 = eb1Var.m75933x41a8a7f2(2);
                            mn2.g1 g1Var = mn2.g1.f411508a;
                            if (m75933x41a8a7f2) {
                                view = p19;
                                g1Var.b().c(new mn2.e0(eb1Var.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411490h));
                            } else {
                                view = p19;
                                c14994x9b99c0792 = c14994x9b99c0793;
                                c17 = 2;
                                g1Var.l().c(new mn2.n(eb1Var.m75945x2fec8307(0), null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
                                layoutParams.setMarginEnd(viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                                imageView.setLayoutParams(layoutParams);
                                viewGroup.addView(imageView);
                            }
                        }
                        c14994x9b99c0792 = c14994x9b99c0793;
                        c17 = 2;
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
                        layoutParams2.setMarginEnd(viewGroup.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                        imageView.setLayoutParams(layoutParams2);
                        viewGroup.addView(imageView);
                    }
                    c14994x9b99c0793 = c14994x9b99c0792;
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
            c14994x9b99c0792 = c14994x9b99c0793;
            c17 = 2;
            c14994x9b99c0793 = c14994x9b99c0792;
            p19 = view;
            i19 = 3;
            z18 = 1;
            i18 = 0;
        }
        android.view.View view2 = p19;
        int i27 = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = c14994x9b99c0793;
        java.lang.Long valueOf = java.lang.Long.valueOf(fm2Var.m75942xfb822ef2(i27));
        if ((valueOf.longValue() > 0 ? i27 : 0) == 0) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : viewGroup.getChildCount();
        if (((1 > longValue || longValue >= 4) ? 0 : i27) != 0) {
            textView.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            context = context2;
            c14994x9b99c079 = c14994x9b99c0794;
            i17 = 0;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njz, java.lang.Long.valueOf(longValue)));
        } else {
            context = context2;
            c14994x9b99c079 = c14994x9b99c0794;
            i17 = 0;
            if (longValue > 3) {
                textView.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njy, java.lang.Long.valueOf(longValue)));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/FinderObjectHelpPromotionInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) fm2Var.m75936x14adae67(2)) == null) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0795 = c14994x9b99c079;
        p18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f6(s0Var, c14994x9b99c0795));
        boolean z19 = i17;
        android.content.Context context3 = context;
        view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.j6(this.f185337d, fm2Var, this.f185338e, view2, this.f185339f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long m59251x5db1b11 = c14994x9b99c0795.m59251x5db1b11();
        java.lang.String m59229xb5af1dd5 = c14994x9b99c0795.m59229xb5af1dd5();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        java.lang.String ek6 = o3Var.ek(m59251x5db1b11, m59229xb5af1dd5, nyVar != null ? nyVar.f216913n : z19 ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view2, "increase_popularity_button");
        aVar.Tj(view2, 40, 1, z19);
        aVar.gk(view2, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("feed_id", pm0.v.u(c14994x9b99c0795.m59251x5db1b11())), new jz5.l("author_finder_username", c14994x9b99c0795.m59299x6bf53a6c()), new jz5.l("session_buffer", ek6)));
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(p18, "increase_popularity_people");
        aVar2.Tj(p18, 40, 1, false);
        aVar2.gk(p18, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("feed_id", pm0.v.u(c14994x9b99c0795.m59251x5db1b11())), new jz5.l("increase_popularity_uv", java.lang.Long.valueOf(fm2Var.m75942xfb822ef2(1))), new jz5.l("session_buffer", ek6)));
    }
}
