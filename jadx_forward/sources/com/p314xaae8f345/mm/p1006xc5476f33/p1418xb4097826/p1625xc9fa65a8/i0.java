package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 f207251d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182) {
        this.f207251d = activityC14944x7f25a182;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f207251d.f207073x.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182 = this.f207251d;
            java.lang.Object obj = activityC14944x7f25a182.f207073x.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.q21 q21Var = (r45.q21) obj;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) q21Var.m75936x14adae67(0);
            android.text.Spanned spanned = "";
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
                str = "";
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            int m75939xb282bd08 = q21Var.m75939xb282bd08(4);
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (m75939xb282bd08 == 0) {
                g1Var.l().c(new mn2.n(str, null, 2, null), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0) holder).f207215d, g1Var.h(mn2.f1.f411494o));
            } else {
                g1Var.a().c(new mn2.n(str, null, 2, null), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0) holder).f207215d, g1Var.h(mn2.f1.f411490h));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0) holder;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) q21Var.m75936x14adae67(0);
            if (c19782x23db1cfa2 == null || (str2 = c19782x23db1cfa2.m76184x8010e5e4()) == null) {
                str2 = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                spanned = android.text.Html.fromHtml("<font color=\"#06AD56\">" + str2 + "</font>");
            }
            android.widget.TextView textView = f0Var.f207216e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, spanned, textSize));
            java.util.ArrayList arrayList = activityC14944x7f25a182.f207073x;
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i18 = -1;
                    break;
                } else {
                    if (((r45.q21) listIterator.previous()).m75939xb282bd08(1) == 1) {
                        i18 = listIterator.nextIndex();
                        break;
                    }
                }
            }
            android.widget.TextView textView2 = f0Var.f207217f;
            if (i18 != i17 || i17 == mo1894x7e414b06() - 1) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            boolean m75933x41a8a7f2 = q21Var.m75933x41a8a7f2(3);
            android.widget.RelativeLayout relativeLayout = f0Var.f207218g;
            if (m75933x41a8a7f2) {
                relativeLayout.setOnClickListener(null);
            } else {
                relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.h0(activityC14944x7f25a182, q21Var));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_finder_identity] ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) q21Var.m75936x14adae67(0);
            sb6.append(c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76184x8010e5e4() : null);
            sb6.append(' ');
            r45.ub1 ub1Var = (r45.ub1) q21Var.m75936x14adae67(7);
            sb6.append(ub1Var != null ? java.lang.Integer.valueOf(ub1Var.m75939xb282bd08(0)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansSearchUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) t70Var.L1().r()).booleanValue()) {
                android.view.View view = f0Var.f207219h;
                if (view != null && (imageView = f0Var.f207220i) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3.f183585a;
                    r45.ub1 ub1Var2 = (r45.ub1) q21Var.m75936x14adae67(7);
                    boolean z18 = ub1Var2 != null && ub1Var2.m75939xb282bd08(0) == 1;
                    r45.ub1 ub1Var3 = (r45.ub1) q21Var.m75936x14adae67(7);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = ub1Var3 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) ub1Var3.m75936x14adae67(1) : null;
                    android.content.Context context2 = relativeLayout.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    c3Var.a(view, imageView, z18, c19780xceb4c4dc, false, context2);
                    if (((java.lang.Number) t70Var.u0().r()).intValue() != 1) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else {
                if (((java.lang.Number) t70Var.u0().r()).intValue() == 1) {
                    r45.ub1 ub1Var4 = (r45.ub1) q21Var.m75936x14adae67(7);
                    if (ub1Var4 != null && ub1Var4.m75939xb282bd08(0) == 1) {
                        android.view.View view2 = f0Var.f207219h;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.view.View view3 = f0Var.f207219h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15385xab9dd69 c15385xab9dd69 = f0Var.f207221m;
            if (c15385xab9dd69 == null) {
                return;
            }
            c15385xab9dd69.setVisibility(0);
            if (q21Var.m75939xb282bd08(9) == 1) {
                c15385xab9dd69.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214608d, null);
                return;
            }
            if (q21Var.m75939xb282bd08(10) > 0) {
                c15385xab9dd69.g(q21Var.m75939xb282bd08(10));
            } else if (q21Var.m75939xb282bd08(11) >= 5) {
                c15385xab9dd69.e(q21Var.m75939xb282bd08(11));
            } else {
                c15385xab9dd69.setVisibility(8);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182 = this.f207251d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14944x7f25a182.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x76847179);
        android.view.View inflate = mo55332x76847179.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agt, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f0(activityC14944x7f25a182, inflate);
    }
}
