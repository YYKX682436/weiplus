package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class s3 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f176690o;

    /* renamed from: p, reason: collision with root package name */
    public int f176691p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176692q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        super(activityC13057x768a6365, new xt1.k());
        this.f176692q = activityC13057x768a6365;
        this.f176690o = 10;
        this.f176691p = 10;
        r(true);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        xt1.k kVar = (xt1.k) obj;
        if (kVar == null) {
            kVar = new xt1.k();
        }
        kVar.mo9015xbf5d97fd(cursor);
        return kVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t3 t3Var;
        android.view.View view2;
        java.util.Map d17;
        java.util.Map d18;
        xt1.k kVar = (xt1.k) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176692q;
        if (view == null) {
            view2 = android.view.View.inflate(activityC13057x768a6365.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569876qp, null);
            t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t3(activityC13057x768a6365, null);
            t3Var.f176696a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.iph);
            t3Var.f176697b = view2.findViewById(com.p314xaae8f345.mm.R.id.bcn);
            t3Var.f176698c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.bcm);
            t3Var.f176699d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.odf);
            t3Var.f176700e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.o7z);
            t3Var.f176701f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cuz);
            t3Var.f176702g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dlk);
            t3Var.f176703h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nfg);
            t3Var.f176704i = view2.findViewById(com.p314xaae8f345.mm.R.id.kjs);
            t3Var.f176705j = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.kjt);
            t3Var.f176706k = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f563870br);
            t3Var.f176707l = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f563871bs);
            view2.setTag(t3Var);
        } else {
            t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t3) view.getTag();
            view2 = view;
        }
        t3Var.f176699d.setText(kVar.f68137x29dd02d3);
        t3Var.f176700e.setText(k35.m1.f(activityC13057x768a6365, kVar.f68136x2261f6f2 * 1000, true, false));
        t3Var.f176701f.setText(kVar.f68125x4f4dc37);
        int dimensionPixelSize = activityC13057x768a6365.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561728r1);
        if (android.text.TextUtils.isEmpty(kVar.f68128x74ff6034)) {
            android.view.View view3 = t3Var.f176697b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f176696a.setVisibility(0);
            t3Var.f176696a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cbt);
            lu1.g0.b(t3Var.f176696a, kVar.f68129x96a1f680, dimensionPixelSize, com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
        } else {
            android.view.View view4 = t3Var.f176697b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f176696a.setVisibility(8);
            if (android.text.TextUtils.isEmpty(kVar.f68129x96a1f680)) {
                lu1.g0.d(activityC13057x768a6365, t3Var.f176698c, com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, lu1.a0.d(kVar.f68128x74ff6034));
            } else {
                lu1.g0.c(this.f176692q, t3Var.f176698c, kVar.f68129x96a1f680, dimensionPixelSize, com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, false, lu1.a0.d(kVar.f68128x74ff6034));
            }
        }
        r45.pt t07 = kVar.t0();
        if (t07 == null || android.text.TextUtils.isEmpty(t07.f464931e)) {
            t3Var.f176702g.setVisibility(8);
        } else {
            t3Var.f176702g.setText(t07.f464931e);
            t3Var.f176702g.setTag(kVar);
            t3Var.f176702g.setVisibility(0);
            t3Var.f176702g.setOnClickListener(activityC13057x768a6365.f176433m);
        }
        r45.ju u07 = kVar.u0();
        if (u07 == null || android.text.TextUtils.isEmpty(u07.f459637e)) {
            android.view.View view5 = t3Var.f176704i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f176703h.setVisibility(8);
        } else {
            t3Var.f176705j.setText(u07.f459637e);
            android.view.View view6 = t3Var.f176704i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f176704i.setOnClickListener(activityC13057x768a6365.f176433m);
            t3Var.f176704i.setTag(kVar);
            t3Var.f176703h.setVisibility(0);
        }
        if (kVar.E1 == null) {
            kVar.E1 = new java.util.ArrayList();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f68118xe3b50d2f) && (d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(kVar.f68118xe3b50d2f, "accept_buttons_list", null)) != null) {
                int i18 = 0;
                while (i18 < 100) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".accept_buttons_list.accept_buttons");
                    sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = (java.lang.String) d18.get(sb7 + ".card_id");
                    java.lang.String str2 = (java.lang.String) d18.get(sb7 + ".title");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        break;
                    }
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d18.get(sb7 + ".end_time"), 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a63652 = activityC13057x768a6365;
                    if (P == 0 || P > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                        xt1.h hVar = new xt1.h(kVar);
                        hVar.f538014a = (java.lang.String) d18.get(sb7 + ".title");
                        hVar.f538015b = (java.lang.String) d18.get(sb7 + ".sub_title");
                        hVar.f538017d = (java.lang.String) d18.get(sb7 + ".card_ext");
                        hVar.f538016c = (java.lang.String) d18.get(sb7 + ".card_id");
                        hVar.f538018e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d18.get(sb7 + ".action_type"), 0);
                        ((java.util.ArrayList) kVar.E1).add(hVar);
                    }
                    i18++;
                    activityC13057x768a6365 = activityC13057x768a63652;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a63653 = activityC13057x768a6365;
        if (kVar.F1 == null) {
            kVar.F1 = new java.util.ArrayList();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f68126xc467fb95) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(kVar.f68126xc467fb95, "jump_buttons_list", null)) != null) {
                int i19 = 0;
                while (i19 < 100) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".jump_buttons_list.jump_buttons");
                    sb8.append(i19 > 0 ? java.lang.Integer.valueOf(i19) : "");
                    java.lang.String sb9 = sb8.toString();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(sb9 + ".title"))) {
                        break;
                    }
                    xt1.i iVar = new xt1.i(kVar);
                    iVar.f538022a = (java.lang.String) d17.get(sb9 + ".title");
                    iVar.f538023b = (java.lang.String) d17.get(sb9 + ".description");
                    iVar.f538024c = (java.lang.String) d17.get(sb9 + ".button_wording");
                    iVar.f538025d = (java.lang.String) d17.get(sb9 + ".jump_url");
                    ((java.util.ArrayList) kVar.F1).add(iVar);
                    i19++;
                }
            }
        }
        java.util.List list = kVar.E1;
        java.util.List list2 = kVar.F1;
        t3Var.f176706k.removeAllViews();
        if ((list == null || ((java.util.ArrayList) list).size() == 0) && (list2 == null || ((java.util.ArrayList) list2).size() == 0)) {
            t3Var.f176707l.setVisibility(8);
        } else {
            boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list);
            int i27 = com.p314xaae8f345.mm.R.id.b78;
            if (!L0) {
                int i28 = 0;
                while (true) {
                    java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                    if (i28 >= arrayList5.size()) {
                        break;
                    }
                    xt1.h hVar2 = (xt1.h) arrayList5.get(i28);
                    android.view.View inflate = android.view.View.inflate(activityC13057x768a63653.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569803oo, null);
                    if (i28 == 0) {
                        android.view.View findViewById = inflate.findViewById(i27);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b7_)).setText(hVar2.f538014a);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b79)).setText(hVar2.f538015b);
                    android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.b77);
                    button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q3(this, hVar2, kVar));
                    int i29 = hVar2.f538018e;
                    if (i29 == 0) {
                        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572315ar4);
                    } else if (i29 == 1) {
                        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572316ar5);
                    }
                    t3Var.f176706k.addView(inflate);
                    i28++;
                    i27 = com.p314xaae8f345.mm.R.id.b78;
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2)) {
                int i37 = 0;
                while (true) {
                    java.util.ArrayList arrayList7 = (java.util.ArrayList) list2;
                    if (i37 >= arrayList7.size()) {
                        break;
                    }
                    xt1.i iVar2 = (xt1.i) arrayList7.get(i37);
                    android.view.View inflate2 = android.view.View.inflate(activityC13057x768a63653.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569803oo, null);
                    if (i37 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                        android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.b78);
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList8.add(8);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b7_)).setText(iVar2.f538022a);
                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b79)).setText(iVar2.f538023b);
                    android.widget.Button button2 = (android.widget.Button) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b77);
                    button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r3(this, iVar2));
                    button2.setText(iVar2.f538024c);
                    t3Var.f176706k.addView(inflate2);
                    i37++;
                }
            }
            t3Var.f176707l.setVisibility(0);
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        if (xt1.t0.Vi().f() > 0) {
            s(xt1.t0.Vi().f538051d.B("select * from CardMsgInfo where read_state = ?  order by time desc", new java.lang.String[]{"1"}));
        } else {
            this.f176691p = xt1.t0.Vi().mo78086x7444f759();
            xt1.l Vi = xt1.t0.Vi();
            int i17 = this.f176690o;
            Vi.getClass();
            s(Vi.f538051d.B("select * from CardMsgInfo order by time desc LIMIT " + i17, null));
        }
        notifyDataSetChanged();
    }

    public int t() {
        int i17 = this.f176690o;
        int i18 = this.f176691p;
        if (i17 >= i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176692q;
            if (activityC13057x768a6365.f176431h.getParent() != null) {
                activityC13057x768a6365.f176427d.removeFooterView(activityC13057x768a6365.f176431h);
            }
            return 0;
        }
        int i19 = i17 + 10;
        this.f176690o = i19;
        if (i19 <= i18) {
            return 10;
        }
        this.f176690o = i18;
        return i18 % 10;
    }
}
