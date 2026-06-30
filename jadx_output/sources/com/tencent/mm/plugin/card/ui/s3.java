package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class s3 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f95157o;

    /* renamed from: p, reason: collision with root package name */
    public int f95158p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95159q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        super(cardNewMsgUI, new xt1.k());
        this.f95159q = cardNewMsgUI;
        this.f95157o = 10;
        this.f95158p = 10;
        r(true);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        xt1.k kVar = (xt1.k) obj;
        if (kVar == null) {
            kVar = new xt1.k();
        }
        kVar.convertFrom(cursor);
        return kVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.t3 t3Var;
        android.view.View view2;
        java.util.Map d17;
        java.util.Map d18;
        xt1.k kVar = (xt1.k) getItem(i17);
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95159q;
        if (view == null) {
            view2 = android.view.View.inflate(cardNewMsgUI.getContext(), com.tencent.mm.R.layout.f488343qp, null);
            t3Var = new com.tencent.mm.plugin.card.ui.t3(cardNewMsgUI, null);
            t3Var.f95163a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.iph);
            t3Var.f95164b = view2.findViewById(com.tencent.mm.R.id.bcn);
            t3Var.f95165c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.bcm);
            t3Var.f95166d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.odf);
            t3Var.f95167e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.o7z);
            t3Var.f95168f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cuz);
            t3Var.f95169g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dlk);
            t3Var.f95170h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nfg);
            t3Var.f95171i = view2.findViewById(com.tencent.mm.R.id.kjs);
            t3Var.f95172j = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kjt);
            t3Var.f95173k = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f482337br);
            t3Var.f95174l = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f482338bs);
            view2.setTag(t3Var);
        } else {
            t3Var = (com.tencent.mm.plugin.card.ui.t3) view.getTag();
            view2 = view;
        }
        t3Var.f95166d.setText(kVar.field_title);
        t3Var.f95167e.setText(k35.m1.f(cardNewMsgUI, kVar.field_time * 1000, true, false));
        t3Var.f95168f.setText(kVar.field_description);
        int dimensionPixelSize = cardNewMsgUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480195r1);
        if (android.text.TextUtils.isEmpty(kVar.field_logo_color)) {
            android.view.View view3 = t3Var.f95164b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f95163a.setVisibility(0);
            t3Var.f95163a.setImageResource(com.tencent.mm.R.drawable.cbt);
            lu1.g0.b(t3Var.f95163a, kVar.field_logo_url, dimensionPixelSize, com.tencent.mm.R.drawable.cbt, true);
        } else {
            android.view.View view4 = t3Var.f95164b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f95163a.setVisibility(8);
            if (android.text.TextUtils.isEmpty(kVar.field_logo_url)) {
                lu1.g0.d(cardNewMsgUI, t3Var.f95165c, com.tencent.mm.R.drawable.bz6, lu1.a0.d(kVar.field_logo_color));
            } else {
                lu1.g0.c(this.f95159q, t3Var.f95165c, kVar.field_logo_url, dimensionPixelSize, com.tencent.mm.R.drawable.bz6, false, lu1.a0.d(kVar.field_logo_color));
            }
        }
        r45.pt t07 = kVar.t0();
        if (t07 == null || android.text.TextUtils.isEmpty(t07.f383398e)) {
            t3Var.f95169g.setVisibility(8);
        } else {
            t3Var.f95169g.setText(t07.f383398e);
            t3Var.f95169g.setTag(kVar);
            t3Var.f95169g.setVisibility(0);
            t3Var.f95169g.setOnClickListener(cardNewMsgUI.f94900m);
        }
        r45.ju u07 = kVar.u0();
        if (u07 == null || android.text.TextUtils.isEmpty(u07.f378104e)) {
            android.view.View view5 = t3Var.f95171i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f95170h.setVisibility(8);
        } else {
            t3Var.f95172j.setText(u07.f378104e);
            android.view.View view6 = t3Var.f95171i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t3Var.f95171i.setOnClickListener(cardNewMsgUI.f94900m);
            t3Var.f95171i.setTag(kVar);
            t3Var.f95170h.setVisibility(0);
        }
        if (kVar.E1 == null) {
            kVar.E1 = new java.util.ArrayList();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_accept_buttons) && (d18 = com.tencent.mm.sdk.platformtools.aa.d(kVar.field_accept_buttons, "accept_buttons_list", null)) != null) {
                int i18 = 0;
                while (i18 < 100) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".accept_buttons_list.accept_buttons");
                    sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = (java.lang.String) d18.get(sb7 + ".card_id");
                    java.lang.String str2 = (java.lang.String) d18.get(sb7 + ".title");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        break;
                    }
                    int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d18.get(sb7 + ".end_time"), 0);
                    com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI2 = cardNewMsgUI;
                    if (P == 0 || P > com.tencent.mm.sdk.platformtools.t8.i1()) {
                        xt1.h hVar = new xt1.h(kVar);
                        hVar.f456481a = (java.lang.String) d18.get(sb7 + ".title");
                        hVar.f456482b = (java.lang.String) d18.get(sb7 + ".sub_title");
                        hVar.f456484d = (java.lang.String) d18.get(sb7 + ".card_ext");
                        hVar.f456483c = (java.lang.String) d18.get(sb7 + ".card_id");
                        hVar.f456485e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d18.get(sb7 + ".action_type"), 0);
                        ((java.util.ArrayList) kVar.E1).add(hVar);
                    }
                    i18++;
                    cardNewMsgUI = cardNewMsgUI2;
                }
            }
        }
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI3 = cardNewMsgUI;
        if (kVar.F1 == null) {
            kVar.F1 = new java.util.ArrayList();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_jump_buttons) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(kVar.field_jump_buttons, "jump_buttons_list", null)) != null) {
                int i19 = 0;
                while (i19 < 100) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".jump_buttons_list.jump_buttons");
                    sb8.append(i19 > 0 ? java.lang.Integer.valueOf(i19) : "");
                    java.lang.String sb9 = sb8.toString();
                    if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(sb9 + ".title"))) {
                        break;
                    }
                    xt1.i iVar = new xt1.i(kVar);
                    iVar.f456489a = (java.lang.String) d17.get(sb9 + ".title");
                    iVar.f456490b = (java.lang.String) d17.get(sb9 + ".description");
                    iVar.f456491c = (java.lang.String) d17.get(sb9 + ".button_wording");
                    iVar.f456492d = (java.lang.String) d17.get(sb9 + ".jump_url");
                    ((java.util.ArrayList) kVar.F1).add(iVar);
                    i19++;
                }
            }
        }
        java.util.List list = kVar.E1;
        java.util.List list2 = kVar.F1;
        t3Var.f95173k.removeAllViews();
        if ((list == null || ((java.util.ArrayList) list).size() == 0) && (list2 == null || ((java.util.ArrayList) list2).size() == 0)) {
            t3Var.f95174l.setVisibility(8);
        } else {
            boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list);
            int i27 = com.tencent.mm.R.id.b78;
            if (!L0) {
                int i28 = 0;
                while (true) {
                    java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                    if (i28 >= arrayList5.size()) {
                        break;
                    }
                    xt1.h hVar2 = (xt1.h) arrayList5.get(i28);
                    android.view.View inflate = android.view.View.inflate(cardNewMsgUI3.getContext(), com.tencent.mm.R.layout.f488270oo, null);
                    if (i28 == 0) {
                        android.view.View findViewById = inflate.findViewById(i27);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b7_)).setText(hVar2.f456481a);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b79)).setText(hVar2.f456482b);
                    android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.b77);
                    button.setOnClickListener(new com.tencent.mm.plugin.card.ui.q3(this, hVar2, kVar));
                    int i29 = hVar2.f456485e;
                    if (i29 == 0) {
                        button.setText(com.tencent.mm.R.string.f490782ar4);
                    } else if (i29 == 1) {
                        button.setText(com.tencent.mm.R.string.f490783ar5);
                    }
                    t3Var.f95173k.addView(inflate);
                    i28++;
                    i27 = com.tencent.mm.R.id.b78;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
                int i37 = 0;
                while (true) {
                    java.util.ArrayList arrayList7 = (java.util.ArrayList) list2;
                    if (i37 >= arrayList7.size()) {
                        break;
                    }
                    xt1.i iVar2 = (xt1.i) arrayList7.get(i37);
                    android.view.View inflate2 = android.view.View.inflate(cardNewMsgUI3.getContext(), com.tencent.mm.R.layout.f488270oo, null);
                    if (i37 == 0 && com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                        android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.b78);
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList8.add(8);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper", "renderAcceptButtonsLayout", "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b7_)).setText(iVar2.f456489a);
                    ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b79)).setText(iVar2.f456490b);
                    android.widget.Button button2 = (android.widget.Button) inflate2.findViewById(com.tencent.mm.R.id.b77);
                    button2.setOnClickListener(new com.tencent.mm.plugin.card.ui.r3(this, iVar2));
                    button2.setText(iVar2.f456491c);
                    t3Var.f95173k.addView(inflate2);
                    i37++;
                }
            }
            t3Var.f95174l.setVisibility(0);
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        if (xt1.t0.Vi().f() > 0) {
            s(xt1.t0.Vi().f456518d.B("select * from CardMsgInfo where read_state = ?  order by time desc", new java.lang.String[]{"1"}));
        } else {
            this.f95158p = xt1.t0.Vi().getCount();
            xt1.l Vi = xt1.t0.Vi();
            int i17 = this.f95157o;
            Vi.getClass();
            s(Vi.f456518d.B("select * from CardMsgInfo order by time desc LIMIT " + i17, null));
        }
        notifyDataSetChanged();
    }

    public int t() {
        int i17 = this.f95157o;
        int i18 = this.f95158p;
        if (i17 >= i18) {
            com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95159q;
            if (cardNewMsgUI.f94898h.getParent() != null) {
                cardNewMsgUI.f94894d.removeFooterView(cardNewMsgUI.f94898h);
            }
            return 0;
        }
        int i19 = i17 + 10;
        this.f95157o = i19;
        if (i19 <= i18) {
            return 10;
        }
        this.f95157o = i18;
        return i18 % 10;
    }
}
