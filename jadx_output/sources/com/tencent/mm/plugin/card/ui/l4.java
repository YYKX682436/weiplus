package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class l4 implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f95066a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f95067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95069d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95070e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f95071f = new java.util.LinkedList();

    public l4(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        this.f95066a = context;
        this.f95067b = baseAdapter;
        this.f95068c = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        this.f95069d = this.f95066a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
        this.f95070e = this.f95066a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480177qj);
        this.f95066a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480178qk);
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        com.tencent.mm.plugin.card.ui.k4 k4Var;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        boolean z17;
        java.util.LinkedList linkedList;
        if (view == null) {
            if (jVar.g().equals("PRIVATE_TICKET_TITLE")) {
                view2 = android.view.View.inflate(this.f95066a, com.tencent.mm.R.layout.f488335qh, null);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bag);
                if (textView != null) {
                    textView.setText(this.f95066a.getString(com.tencent.mm.R.string.f490809aw1));
                }
            } else if (jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
                view2 = android.view.View.inflate(this.f95066a, com.tencent.mm.R.layout.f488335qh, null);
                android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.bag);
                if (textView2 != null) {
                    textView2.setText(this.f95066a.getString(com.tencent.mm.R.string.ate));
                }
            } else {
                view2 = android.view.View.inflate(this.f95066a, com.tencent.mm.R.layout.f488333qf, null);
            }
            k4Var = new com.tencent.mm.plugin.card.ui.k4(this);
            k4Var.f95049a = (android.widget.RelativeLayout) view2.findViewById(com.tencent.mm.R.id.b99);
            k4Var.f95050b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b_w);
            k4Var.f95051c = view2.findViewById(com.tencent.mm.R.id.bcn);
            k4Var.f95052d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.bcm);
            k4Var.f95053e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b8b);
            k4Var.f95054f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483577bb0);
            k4Var.f95055g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483578bb1);
            k4Var.f95056h = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b7p);
            k4Var.f95058j = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483562b85);
            k4Var.f95059k = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b87);
            k4Var.f95060l = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.b86);
            k4Var.f95057i = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.bbr);
            view2.setTag(k4Var);
        } else {
            k4Var = (com.tencent.mm.plugin.card.ui.k4) view.getTag();
            view2 = view;
        }
        if (k4Var.f95054f != null) {
            k4Var.f95054f.setTextSize(0, this.f95066a.getResources().getDimension(com.tencent.mm.R.dimen.f479574q));
        }
        if (this.f95067b.getItem(i17) instanceof com.tencent.mm.plugin.card.model.CardInfo) {
            com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) this.f95067b.getItem(i17);
            int i18 = cardInfo.field_stickyIndex;
            if (i18 % 10 != 0) {
                if (i18 > 0) {
                    str = lu1.w.a(this.f95066a, i18, cardInfo);
                    z17 = true;
                }
                str = "";
                z17 = false;
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cardInfo.field_label_wording)) {
                    str = cardInfo.field_label_wording;
                    z17 = true;
                }
                str = "";
                z17 = false;
            }
            if (z17) {
                int i19 = 0;
                while (true) {
                    int childCount = k4Var.f95057i.getChildCount();
                    linkedList = this.f95071f;
                    if (i19 >= childCount) {
                        break;
                    }
                    linkedList.add((com.tencent.mm.plugin.card.widget.CardTagTextView) k4Var.f95057i.getChildAt(i19));
                    i19++;
                }
                k4Var.f95057i.removeAllViews();
                k4Var.f95057i.setVisibility(0);
                com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = linkedList.size() == 0 ? new com.tencent.mm.plugin.card.widget.CardTagTextView(this.f95066a) : (com.tencent.mm.plugin.card.widget.CardTagTextView) linkedList.removeFirst();
                int i27 = this.f95069d;
                int i28 = this.f95068c;
                cardTagTextView.setPadding(i27, i28, i27, i28);
                cardTagTextView.setGravity(17);
                cardTagTextView.setMinWidth(this.f95066a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480183qp));
                cardTagTextView.setMinHeight(this.f95066a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480182qo));
                if (cardInfo.o()) {
                    cardTagTextView.setTextColor(i65.a.d(this.f95066a, com.tencent.mm.R.color.f479549ab0));
                    cardTagTextView.setFillColor(i65.a.d(this.f95066a, com.tencent.mm.R.color.f478792hc));
                } else {
                    cardTagTextView.setTextColor(i65.a.d(this.f95066a, com.tencent.mm.R.color.f479308vo));
                    cardTagTextView.setFillColor(0);
                }
                cardTagTextView.setText(str);
                cardTagTextView.setTextSize(1, 10.0f);
                k4Var.f95057i.addView(cardTagTextView);
            } else {
                k4Var.f95057i.setVisibility(8);
            }
        }
        boolean c17 = jVar.c();
        int i29 = this.f95070e;
        if (c17) {
            k4Var.f95050b.setVisibility(0);
            k4Var.f95054f.setVisibility(0);
            k4Var.f95055g.setVisibility(8);
            k4Var.f95053e.setVisibility(0);
            k4Var.f95053e.setText(jVar.s0().f388552m);
            k4Var.f95054f.setText(jVar.s0().f388553n);
            if (jVar.X()) {
                android.view.View view3 = k4Var.f95051c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k4Var.f95050b.setVisibility(4);
                android.widget.ImageView imageView = k4Var.f95052d;
                if (android.text.TextUtils.isEmpty(jVar.s0().C)) {
                    lu1.g0.d(this.f95066a, imageView, com.tencent.mm.R.drawable.bz6, lu1.a0.d(jVar.s0().f388555p));
                } else {
                    lu1.g0.c(this.f95066a, imageView, jVar.s0().C, this.f95066a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.bz6, false, lu1.a0.d(jVar.s0().f388555p));
                }
            } else {
                android.view.View view4 = k4Var.f95051c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k4Var.f95050b.setVisibility(0);
                lu1.g0.b(k4Var.f95050b, jVar.s0().f388546e, this.f95066a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr), com.tencent.mm.R.drawable.cbt, true);
            }
            if (jVar.o()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.i0().A)) {
                    k4Var.f95049a.setBackgroundDrawable(lu1.a0.n(this.f95066a, lu1.a0.d(jVar.s0().f388555p), i29));
                    k4Var.f95058j.setVisibility(8);
                    k4Var.f95059k.setVisibility(8);
                    k4Var.f95060l.setVisibility(0);
                } else {
                    k4Var.f95049a.setBackgroundDrawable(this.f95066a.getResources().getDrawable(com.tencent.mm.R.drawable.f481110l0));
                    k4Var.f95058j.setVisibility(0);
                    k4Var.f95059k.setVisibility(0);
                    android.widget.ImageView imageView2 = k4Var.f95058j;
                    java.lang.String str2 = jVar.i0().A;
                    o11.f fVar = new o11.f();
                    fVar.f342083g = lp0.b.D();
                    fVar.f342082f = xt1.q.m(str2);
                    fVar.f342078b = true;
                    fVar.f342098v = true;
                    fVar.f342077a = true;
                    fVar.f342091o = com.tencent.mm.R.drawable.f481110l0;
                    fVar.f342087k = i65.a.h(this.f95066a, com.tencent.mm.R.dimen.f480178qk);
                    fVar.f342086j = i65.a.B(this.f95066a);
                    n11.a.b().h(str2, imageView2, fVar.a());
                    imageView2.setImageMatrix(new android.graphics.Matrix());
                    k4Var.f95060l.setVisibility(8);
                }
                k4Var.f95053e.setTextColor(this.f95066a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                k4Var.f95054f.setTextColor(this.f95066a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            } else {
                k4Var.f95060l.setVisibility(8);
                k4Var.f95058j.setVisibility(8);
                k4Var.f95059k.setVisibility(8);
                k4Var.f95049a.setBackgroundDrawable(this.f95066a.getResources().getDrawable(com.tencent.mm.R.drawable.f481110l0));
                k4Var.f95054f.setTextColor(this.f95066a.getResources().getColor(com.tencent.mm.R.color.a0c));
                k4Var.f95053e.setTextColor(this.f95066a.getResources().getColor(com.tencent.mm.R.color.a0c));
            }
        } else {
            k4Var.f95050b.setVisibility(8);
            k4Var.f95054f.setVisibility(8);
            k4Var.f95053e.setVisibility(8);
            k4Var.f95057i.setVisibility(8);
            k4Var.f95055g.setVisibility(0);
            android.content.Context context = this.f95066a;
            k4Var.f95049a.setBackgroundDrawable(lu1.a0.n(context, context.getResources().getColor(com.tencent.mm.R.color.f478791hb), i29));
            k4Var.f95055g.setText(this.f95066a.getResources().getString(com.tencent.mm.R.string.auh));
        }
        int i37 = jVar.s0().f388550i;
        if (i17 != this.f95067b.getCount() - 1 || (relativeLayout = k4Var.f95049a) == null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) k4Var.f95049a.getLayoutParams();
            if (layoutParams.bottomMargin != 0) {
                layoutParams.bottomMargin = 0;
                k4Var.f95049a.setLayoutParams(layoutParams);
            }
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams2.bottomMargin != this.f95066a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq)) {
                layoutParams2.bottomMargin = this.f95066a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq);
                k4Var.f95049a.setLayoutParams(layoutParams2);
            }
        }
        return view2;
    }

    public void b(android.view.View view, int i17) {
        ((com.tencent.mm.plugin.card.ui.k4) view.getTag()).f95056h.setVisibility(i17);
    }

    @Override // tt1.k
    public void release() {
        this.f95066a = null;
        this.f95067b = null;
        java.util.LinkedList linkedList = this.f95071f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
