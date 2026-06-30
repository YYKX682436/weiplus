package ku1;

/* loaded from: classes15.dex */
public class k0 implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f393657a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f393658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f393659c;

    /* renamed from: d, reason: collision with root package name */
    public final int f393660d;

    /* renamed from: e, reason: collision with root package name */
    public final int f393661e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f393662f = new java.util.LinkedList();

    public k0(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        this.f393657a = context;
        this.f393658b = baseAdapter;
        this.f393659c = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f393660d = this.f393657a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
        this.f393661e = this.f393657a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561710qj);
        this.f393657a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561711qk);
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        ku1.j0 j0Var;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        boolean z17;
        java.util.LinkedList linkedList;
        android.widget.TextView textView;
        if (view == null) {
            int itemViewType = this.f393658b.getItemViewType(i17);
            if (itemViewType != 0) {
                view2 = itemViewType != 1 ? itemViewType != 2 ? android.view.View.inflate(this.f393657a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569866qf, null) : android.view.View.inflate(this.f393657a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569871qk, null) : android.view.View.inflate(this.f393657a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569866qf, null);
            } else {
                view2 = android.view.View.inflate(this.f393657a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569868qh, null);
                if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                    android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bag);
                    if (textView2 != null) {
                        textView2.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572342aw1));
                    }
                } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE") && (textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bag)) != null) {
                    textView.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ate));
                }
            }
            j0Var = new ku1.j0(this);
            if (jVar.g().equals("PRIVATE_TICKET_TITLE") || jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                j0Var.f393646h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bag);
            } else if (jVar.m0()) {
                j0Var.f393651m = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ban);
                j0Var.f393652n = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.baj);
                j0Var.f393653o = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bal);
                j0Var.f393654p = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bam);
            } else {
                j0Var.f393639a = (android.widget.RelativeLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.b99);
                j0Var.f393640b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b_w);
                j0Var.f393641c = view2.findViewById(com.p314xaae8f345.mm.R.id.bcn);
                j0Var.f393642d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.bcm);
                j0Var.f393643e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b8b);
                j0Var.f393644f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565110bb0);
                j0Var.f393645g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565111bb1);
                j0Var.f393648j = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565095b85);
                j0Var.f393649k = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b87);
                j0Var.f393650l = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b86);
                j0Var.f393647i = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.bbr);
            }
            view2.setTag(j0Var);
        } else {
            j0Var = (ku1.j0) view.getTag();
            if (j0Var.f393646h != null) {
                if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                    j0Var.f393646h.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572342aw1));
                } else {
                    j0Var.f393646h.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ate));
                }
            }
            view2 = view;
        }
        if (j0Var.f393644f != null) {
            j0Var.f393644f.setTextSize(0, this.f393657a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561107q));
        }
        boolean c17 = jVar.c();
        int i18 = this.f393661e;
        if (c17) {
            if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                j0Var.f393646h.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572342aw1));
            } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                j0Var.f393646h.setText(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ate));
            } else if (jVar.m0()) {
                java.util.LinkedList linkedList2 = jVar.s0().f470093s;
                j0Var.f393651m.setText(((r45.w50) linkedList2.get(0)).f470412e);
                j0Var.f393653o.setText(((r45.w50) linkedList2.get(1)).f470412e);
                java.util.LinkedList linkedList3 = jVar.i0().f466724q;
                j0Var.f393654p.setText(java.lang.String.format(this.f393657a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atm), ((r45.w50) linkedList3.get(0)).f470412e));
                if (linkedList3.size() >= 2) {
                    j0Var.f393652n.setText(((r45.w50) linkedList3.get(1)).f470412e);
                }
            } else {
                if (this.f393658b.getItem(i17) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) this.f393658b.getItem(i17);
                    if (!c13038x357affe.f67736x95970a65.equals("PRIVATE_TICKET_TITLE") && !c13038x357affe.f67736x95970a65.equals("PRIVATE_INVOICE_TITLE")) {
                        int i19 = c13038x357affe.f67752xead628a4;
                        if (i19 % 10 != 0) {
                            if (i19 > 0) {
                                str = lu1.w.a(this.f393657a, i19, c13038x357affe);
                                z17 = true;
                            }
                            str = "";
                            z17 = false;
                        } else {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13038x357affe.f67745xd7ba23c8)) {
                                str = c13038x357affe.f67745xd7ba23c8;
                                z17 = true;
                            }
                            str = "";
                            z17 = false;
                        }
                        if (z17) {
                            int i27 = 0;
                            while (true) {
                                int childCount = j0Var.f393647i.getChildCount();
                                linkedList = this.f393662f;
                                if (i27 >= childCount) {
                                    break;
                                }
                                linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) j0Var.f393647i.getChildAt(i27));
                                i27++;
                            }
                            j0Var.f393647i.removeAllViews();
                            j0Var.f393647i.setVisibility(0);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = linkedList.size() == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(this.f393657a) : (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) linkedList.removeFirst();
                            int i28 = this.f393660d;
                            int i29 = this.f393659c;
                            c13079x2ba3d9dc.setPadding(i28, i29, i28, i29);
                            c13079x2ba3d9dc.setGravity(17);
                            c13079x2ba3d9dc.setMinWidth(this.f393657a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561716qp));
                            c13079x2ba3d9dc.setMinHeight(this.f393657a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561715qo));
                            if (c13038x357affe.o()) {
                                c13079x2ba3d9dc.setTextColor(i65.a.d(this.f393657a, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                                c13079x2ba3d9dc.m54468x17b1755e(i65.a.d(this.f393657a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560325hc));
                            } else {
                                c13079x2ba3d9dc.setTextColor(i65.a.d(this.f393657a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                                c13079x2ba3d9dc.m54468x17b1755e(0);
                            }
                            c13079x2ba3d9dc.setText(str);
                            c13079x2ba3d9dc.setTextSize(1, 10.0f);
                            j0Var.f393647i.addView(c13079x2ba3d9dc);
                        } else {
                            j0Var.f393647i.setVisibility(8);
                        }
                    }
                }
                j0Var.f393639a.setVisibility(0);
                j0Var.f393640b.setVisibility(0);
                j0Var.f393644f.setVisibility(0);
                j0Var.f393645g.setVisibility(8);
                j0Var.f393643e.setVisibility(0);
                j0Var.f393643e.setText(jVar.s0().f470085m);
                j0Var.f393644f.setText(jVar.s0().f470086n);
                if (jVar.X()) {
                    android.view.View view3 = j0Var.f393641c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j0Var.f393640b.setVisibility(4);
                    android.widget.ImageView imageView = j0Var.f393642d;
                    if (android.text.TextUtils.isEmpty(jVar.s0().C)) {
                        lu1.g0.d(this.f393657a, imageView, com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, lu1.a0.d(jVar.s0().f470088p));
                    } else {
                        lu1.g0.c(this.f393657a, imageView, jVar.s0().C, this.f393657a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, false, lu1.a0.d(jVar.s0().f470088p));
                    }
                } else {
                    android.view.View view4 = j0Var.f393641c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j0Var.f393640b.setVisibility(0);
                    lu1.g0.b(j0Var.f393640b, jVar.s0().f470079e, this.f393657a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
                }
                if (jVar.o()) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.i0().A)) {
                        j0Var.f393639a.setBackgroundDrawable(lu1.a0.n(this.f393657a, lu1.a0.d(jVar.s0().f470088p), i18));
                        j0Var.f393648j.setVisibility(8);
                        j0Var.f393649k.setVisibility(8);
                        j0Var.f393650l.setVisibility(0);
                    } else {
                        j0Var.f393639a.setBackgroundDrawable(this.f393657a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0));
                        j0Var.f393648j.setVisibility(0);
                        j0Var.f393649k.setVisibility(0);
                        android.widget.ImageView imageView2 = j0Var.f393648j;
                        java.lang.String str2 = jVar.i0().A;
                        o11.f fVar = new o11.f();
                        fVar.f423616g = lp0.b.D();
                        fVar.f423615f = xt1.q.m(str2);
                        fVar.f423611b = true;
                        fVar.f423631v = true;
                        fVar.f423610a = true;
                        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0;
                        fVar.f423620k = i65.a.h(this.f393657a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561711qk);
                        fVar.f423619j = i65.a.B(this.f393657a);
                        n11.a.b().h(str2, imageView2, fVar.a());
                        imageView2.setImageMatrix(new android.graphics.Matrix());
                        j0Var.f393650l.setVisibility(8);
                    }
                    j0Var.f393643e.setTextColor(this.f393657a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                    j0Var.f393644f.setTextColor(this.f393657a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                } else {
                    j0Var.f393650l.setVisibility(8);
                    j0Var.f393648j.setVisibility(8);
                    j0Var.f393649k.setVisibility(8);
                    j0Var.f393639a.setBackgroundDrawable(this.f393657a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0));
                    j0Var.f393644f.setTextColor(this.f393657a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560314h1));
                    j0Var.f393643e.setTextColor(this.f393657a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560314h1));
                }
            }
        } else if (!jVar.g().equals("PRIVATE_TICKET_TITLE") && !jVar.g().equals("PRIVATE_INVOICE_TITLE") && !jVar.m0()) {
            j0Var.f393640b.setVisibility(8);
            j0Var.f393644f.setVisibility(8);
            j0Var.f393643e.setVisibility(8);
            j0Var.f393647i.setVisibility(8);
            j0Var.f393645g.setVisibility(0);
            android.content.Context context = this.f393657a;
            j0Var.f393639a.setBackgroundDrawable(lu1.a0.n(context, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560324hb), i18));
            j0Var.f393645g.setText(this.f393657a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.auh));
        }
        if (!jVar.g().equals("PRIVATE_TICKET_TITLE") && !jVar.g().equals("PRIVATE_INVOICE_TITLE") && !jVar.m0()) {
            int i37 = jVar.s0().f470083i;
            if (i17 != this.f393658b.getCount() - 1 || (relativeLayout = j0Var.f393639a) == null) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) j0Var.f393639a.getLayoutParams();
                if (layoutParams.bottomMargin != 0) {
                    layoutParams.bottomMargin = 0;
                    j0Var.f393639a.setLayoutParams(layoutParams);
                }
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                if (layoutParams2.bottomMargin != this.f393657a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq)) {
                    layoutParams2.bottomMargin = this.f393657a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                    j0Var.f393639a.setLayoutParams(layoutParams2);
                }
            }
        }
        return view2;
    }

    @Override // tt1.k
    /* renamed from: release */
    public void mo54459x41012807() {
        this.f393657a = null;
        this.f393658b = null;
        java.util.LinkedList linkedList = this.f393662f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
