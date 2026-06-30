package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class l4 implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f176599a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f176600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f176601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f176602d;

    /* renamed from: e, reason: collision with root package name */
    public final int f176603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f176604f = new java.util.LinkedList();

    public l4(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        this.f176599a = context;
        this.f176600b = baseAdapter;
        this.f176601c = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f176602d = this.f176599a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
        this.f176603e = this.f176599a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561710qj);
        this.f176599a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561711qk);
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k4 k4Var;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        boolean z17;
        java.util.LinkedList linkedList;
        if (view == null) {
            if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                view2 = android.view.View.inflate(this.f176599a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569868qh, null);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bag);
                if (textView != null) {
                    textView.setText(this.f176599a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572342aw1));
                }
            } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                view2 = android.view.View.inflate(this.f176599a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569868qh, null);
                android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bag);
                if (textView2 != null) {
                    textView2.setText(this.f176599a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ate));
                }
            } else {
                view2 = android.view.View.inflate(this.f176599a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569866qf, null);
            }
            k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k4(this);
            k4Var.f176582a = (android.widget.RelativeLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.b99);
            k4Var.f176583b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b_w);
            k4Var.f176584c = view2.findViewById(com.p314xaae8f345.mm.R.id.bcn);
            k4Var.f176585d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.bcm);
            k4Var.f176586e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b8b);
            k4Var.f176587f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565110bb0);
            k4Var.f176588g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565111bb1);
            k4Var.f176589h = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b7p);
            k4Var.f176591j = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565095b85);
            k4Var.f176592k = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b87);
            k4Var.f176593l = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b86);
            k4Var.f176590i = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.bbr);
            view2.setTag(k4Var);
        } else {
            k4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k4) view.getTag();
            view2 = view;
        }
        if (k4Var.f176587f != null) {
            k4Var.f176587f.setTextSize(0, this.f176599a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561107q));
        }
        if (this.f176600b.getItem(i17) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) this.f176600b.getItem(i17);
            int i18 = c13038x357affe.f67752xead628a4;
            if (i18 % 10 != 0) {
                if (i18 > 0) {
                    str = lu1.w.a(this.f176599a, i18, c13038x357affe);
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
                int i19 = 0;
                while (true) {
                    int childCount = k4Var.f176590i.getChildCount();
                    linkedList = this.f176604f;
                    if (i19 >= childCount) {
                        break;
                    }
                    linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) k4Var.f176590i.getChildAt(i19));
                    i19++;
                }
                k4Var.f176590i.removeAllViews();
                k4Var.f176590i.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = linkedList.size() == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(this.f176599a) : (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) linkedList.removeFirst();
                int i27 = this.f176602d;
                int i28 = this.f176601c;
                c13079x2ba3d9dc.setPadding(i27, i28, i27, i28);
                c13079x2ba3d9dc.setGravity(17);
                c13079x2ba3d9dc.setMinWidth(this.f176599a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561716qp));
                c13079x2ba3d9dc.setMinHeight(this.f176599a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561715qo));
                if (c13038x357affe.o()) {
                    c13079x2ba3d9dc.setTextColor(i65.a.d(this.f176599a, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                    c13079x2ba3d9dc.m54468x17b1755e(i65.a.d(this.f176599a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560325hc));
                } else {
                    c13079x2ba3d9dc.setTextColor(i65.a.d(this.f176599a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                    c13079x2ba3d9dc.m54468x17b1755e(0);
                }
                c13079x2ba3d9dc.setText(str);
                c13079x2ba3d9dc.setTextSize(1, 10.0f);
                k4Var.f176590i.addView(c13079x2ba3d9dc);
            } else {
                k4Var.f176590i.setVisibility(8);
            }
        }
        boolean c17 = jVar.c();
        int i29 = this.f176603e;
        if (c17) {
            k4Var.f176583b.setVisibility(0);
            k4Var.f176587f.setVisibility(0);
            k4Var.f176588g.setVisibility(8);
            k4Var.f176586e.setVisibility(0);
            k4Var.f176586e.setText(jVar.s0().f470085m);
            k4Var.f176587f.setText(jVar.s0().f470086n);
            if (jVar.X()) {
                android.view.View view3 = k4Var.f176584c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k4Var.f176583b.setVisibility(4);
                android.widget.ImageView imageView = k4Var.f176585d;
                if (android.text.TextUtils.isEmpty(jVar.s0().C)) {
                    lu1.g0.d(this.f176599a, imageView, com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, lu1.a0.d(jVar.s0().f470088p));
                } else {
                    lu1.g0.c(this.f176599a, imageView, jVar.s0().C, this.f176599a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.bz6, false, lu1.a0.d(jVar.s0().f470088p));
                }
            } else {
                android.view.View view4 = k4Var.f176584c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k4Var.f176583b.setVisibility(0);
                lu1.g0.b(k4Var.f176583b, jVar.s0().f470079e, this.f176599a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
            }
            if (jVar.o()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.i0().A)) {
                    k4Var.f176582a.setBackgroundDrawable(lu1.a0.n(this.f176599a, lu1.a0.d(jVar.s0().f470088p), i29));
                    k4Var.f176591j.setVisibility(8);
                    k4Var.f176592k.setVisibility(8);
                    k4Var.f176593l.setVisibility(0);
                } else {
                    k4Var.f176582a.setBackgroundDrawable(this.f176599a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0));
                    k4Var.f176591j.setVisibility(0);
                    k4Var.f176592k.setVisibility(0);
                    android.widget.ImageView imageView2 = k4Var.f176591j;
                    java.lang.String str2 = jVar.i0().A;
                    o11.f fVar = new o11.f();
                    fVar.f423616g = lp0.b.D();
                    fVar.f423615f = xt1.q.m(str2);
                    fVar.f423611b = true;
                    fVar.f423631v = true;
                    fVar.f423610a = true;
                    fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0;
                    fVar.f423620k = i65.a.h(this.f176599a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561711qk);
                    fVar.f423619j = i65.a.B(this.f176599a);
                    n11.a.b().h(str2, imageView2, fVar.a());
                    imageView2.setImageMatrix(new android.graphics.Matrix());
                    k4Var.f176593l.setVisibility(8);
                }
                k4Var.f176586e.setTextColor(this.f176599a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                k4Var.f176587f.setTextColor(this.f176599a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            } else {
                k4Var.f176593l.setVisibility(8);
                k4Var.f176591j.setVisibility(8);
                k4Var.f176592k.setVisibility(8);
                k4Var.f176582a.setBackgroundDrawable(this.f176599a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0));
                k4Var.f176587f.setTextColor(this.f176599a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                k4Var.f176586e.setTextColor(this.f176599a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
        } else {
            k4Var.f176583b.setVisibility(8);
            k4Var.f176587f.setVisibility(8);
            k4Var.f176586e.setVisibility(8);
            k4Var.f176590i.setVisibility(8);
            k4Var.f176588g.setVisibility(0);
            android.content.Context context = this.f176599a;
            k4Var.f176582a.setBackgroundDrawable(lu1.a0.n(context, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560324hb), i29));
            k4Var.f176588g.setText(this.f176599a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.auh));
        }
        int i37 = jVar.s0().f470083i;
        if (i17 != this.f176600b.getCount() - 1 || (relativeLayout = k4Var.f176582a) == null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) k4Var.f176582a.getLayoutParams();
            if (layoutParams.bottomMargin != 0) {
                layoutParams.bottomMargin = 0;
                k4Var.f176582a.setLayoutParams(layoutParams);
            }
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams2.bottomMargin != this.f176599a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq)) {
                layoutParams2.bottomMargin = this.f176599a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                k4Var.f176582a.setLayoutParams(layoutParams2);
            }
        }
        return view2;
    }

    public void b(android.view.View view, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k4) view.getTag()).f176589h.setVisibility(i17);
    }

    @Override // tt1.k
    /* renamed from: release */
    public void mo54459x41012807() {
        this.f176599a = null;
        this.f176600b = null;
        java.util.LinkedList linkedList = this.f176604f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
