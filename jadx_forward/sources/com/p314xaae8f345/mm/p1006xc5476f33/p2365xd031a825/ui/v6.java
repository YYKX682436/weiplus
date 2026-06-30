package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 f262204d;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8) {
        this.f262204d = activityC19117x82d08fb8;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f262204d.f261589m;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) this.f262204d.f261589m.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u6 u6Var;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8 = this.f262204d;
        if (view == null) {
            view2 = android.view.View.inflate(activityC19117x82d08fb8, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7l, null);
            u6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u6(this);
            u6Var.f262170a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pdb);
            u6Var.f262174e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pdg);
            u6Var.f262173d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f569203pe3);
            u6Var.f262171b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pe8);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pdv);
            u6Var.f262172c = textView;
            textView.getPaint().setFlags(16);
            u6Var.f262175f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pe9);
            u6Var.f262176g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pde);
            u6Var.f262177h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pda);
            u6Var.f262179j = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7) view2.findViewById(com.p314xaae8f345.mm.R.id.pdx);
            u6Var.f262180k = view2.findViewById(com.p314xaae8f345.mm.R.id.pdj);
            u6Var.f262178i = view2.findViewById(com.p314xaae8f345.mm.R.id.f569201pe1);
            u6Var.f262182m = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pea);
            u6Var.f262181l = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.peb);
            u6Var.f262183n = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pec);
            u6Var.f262184o = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ped);
            u6Var.f262186q = (android.view.ViewGroup) view2.findViewById(com.p314xaae8f345.mm.R.id.f569205pe5);
            u6Var.f262187r = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view2.findViewById(com.p314xaae8f345.mm.R.id.o9y);
            u6Var.f262188s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.o9u);
            u6Var.f262189t = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.o9z);
            u6Var.f262185p = view2.findViewById(com.p314xaae8f345.mm.R.id.f569202pe2);
            view2.setTag(u6Var);
        } else {
            u6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u6) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) activityC19117x82d08fb8.f261589m.get(i17);
        if (commodity != null && u6Var != null) {
            activityC19117x82d08fb8.f261602z = commodity.f261247r;
            u6Var.f262171b.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(commodity.f261242m, commodity.f261249t));
            double d17 = commodity.f261243n;
            if (d17 < 0.0d || commodity.f261242m >= d17) {
                u6Var.f262172c.setVisibility(8);
            } else {
                u6Var.f262172c.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(d17, commodity.f261249t));
                u6Var.f262172c.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) u6Var.f262180k;
            java.util.List list = commodity.A;
            linearLayout.removeAllViews();
            if (list != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 0) {
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo discountInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo) arrayList.get(i18);
                        android.widget.TextView textView2 = new android.widget.TextView(activityC19117x82d08fb8.mo55332x76847179());
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams.bottomMargin = activityC19117x82d08fb8.mo55332x76847179().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                        textView2.setLayoutParams(layoutParams);
                        textView2.setTextAppearance(activityC19117x82d08fb8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30868x68b1db1.f575944md);
                        if (discountInfo.f261273d > 0.0d) {
                            textView2.setText(discountInfo.f261274e + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(discountInfo.f261273d / 100.0d, activityC19117x82d08fb8.f261590n.f261214m));
                        } else {
                            textView2.setText(discountInfo.f261274e);
                        }
                        linearLayout.addView(textView2);
                        textView2.setTextColor(activityC19117x82d08fb8.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_s));
                    }
                }
            }
            if (linearLayout.getChildCount() > 0) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            u6Var.f262170a.setText(c01.z1.I() ? activityC19117x82d08fb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kso) : activityC19117x82d08fb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksn));
            u6Var.f262173d.setText(commodity.f261239g);
            u6Var.f262174e.setText(commodity.f261240h);
            u6Var.f262174e.setTag(commodity.f261240h);
            android.widget.TextView textView3 = u6Var.f262174e;
            android.view.View.OnLongClickListener onLongClickListener = activityC19117x82d08fb8.F;
            textView3.setOnLongClickListener(onLongClickListener);
            u6Var.f262174e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ba9);
            u6Var.f262175f.setText(commodity.f261247r);
            u6Var.f262175f.setTag(commodity.f261247r);
            u6Var.f262175f.setOnLongClickListener(onLongClickListener);
            u6Var.f262175f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ba9);
            u6Var.f262176g.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(commodity.f261246q));
            u6Var.f262177h.setText(commodity.f261248s);
            java.lang.String str = commodity.B;
            if (u6Var.f262183n != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    u6Var.f262184o.setVisibility(8);
                    u6Var.f262183n.setVisibility(8);
                } else {
                    u6Var.f262183n.setText(str);
                    u6Var.f262183n.setVisibility(0);
                    u6Var.f262184o.setVisibility(0);
                }
            }
            java.lang.String str2 = commodity.C;
            if (u6Var.f262182m != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    u6Var.f262181l.setVisibility(8);
                    u6Var.f262182m.setVisibility(8);
                } else {
                    u6Var.f262182m.setText(str2);
                    u6Var.f262182m.setVisibility(0);
                    u6Var.f262181l.setVisibility(0);
                }
            }
            if (((java.util.ArrayList) commodity.H).size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions) ((java.util.ArrayList) commodity.H).get(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13033, 1, promotions.f261309i, promotions.f261308h, promotions.f261306f, activityC19117x82d08fb8.f261602z);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y6 y6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y6(activityC19117x82d08fb8, commodity.H);
                activityC19117x82d08fb8.f261599w = y6Var;
                u6Var.f262179j.setAdapter((android.widget.ListAdapter) y6Var);
                u6Var.f262179j.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s6(this));
                activityC19117x82d08fb8.f261599w.notifyDataSetChanged();
                u6Var.f262179j.setVisibility(0);
                android.view.View view3 = u6Var.f262178i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                u6Var.f262179j.setVisibility(8);
                u6Var.f262186q.setVisibility(8);
                android.view.View view4 = u6Var.f262178i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo recommendTinyAppInfo = commodity.D;
            if (recommendTinyAppInfo == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(recommendTinyAppInfo.f261327g)) {
                u6Var.f262186q.setVisibility(8);
                android.view.View view5 = u6Var.f262185p;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                u6Var.f262187r.m75396xca029dad(commodity.D.f261325e);
                u6Var.f262188s.setText(commodity.D.f261326f);
                u6Var.f262189t.setText(commodity.D.f261324d);
                u6Var.f262186q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t6(this, commodity));
                android.view.View view6 = u6Var.f262185p;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return view2;
    }
}
