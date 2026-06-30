package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class b3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f94958d;

    public b3(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f94958d = cardListSelectedUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94958d.f94881o.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.a) this.f94958d.f94881o.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.card.ui.c3 c3Var;
        android.view.View view2;
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f94958d;
        xt1.a aVar = (xt1.a) cardListSelectedUI.f94881o.get(i17);
        if (view == null) {
            view2 = android.view.View.inflate(cardListSelectedUI, com.tencent.mm.R.layout.f488355r1, null);
            c3Var = new com.tencent.mm.plugin.card.ui.c3(cardListSelectedUI);
            c3Var.f94966a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.bbz);
            c3Var.f94967b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hft);
            c3Var.f94968c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.obc);
            c3Var.f94969d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nqr);
            c3Var.f94970e = view2.findViewById(com.tencent.mm.R.id.ovy);
            c3Var.f94971f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hfx);
            c3Var.f94972g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hfl);
            view2.setTag(c3Var);
        } else {
            c3Var = (com.tencent.mm.plugin.card.ui.c3) view.getTag();
            view2 = view;
        }
        if (lu1.a0.B(aVar.f456424b)) {
            if (android.text.TextUtils.isEmpty(aVar.f456426d)) {
                c3Var.f94968c.setVisibility(8);
            } else {
                c3Var.f94968c.setVisibility(0);
                c3Var.f94968c.setText(aVar.f456426d);
            }
            if (android.text.TextUtils.isEmpty(aVar.f456427e)) {
                c3Var.f94969d.setVisibility(8);
            } else {
                c3Var.f94969d.setVisibility(0);
                c3Var.f94969d.setText(aVar.f456427e);
            }
            int i18 = aVar.f456433k;
            if (i18 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c3Var.f94966a.setVisibility(0);
                c3Var.f94967b.setVisibility(8);
                java.lang.Boolean bool = (java.lang.Boolean) cardListSelectedUI.f94882p.get(java.lang.Integer.valueOf(i17));
                if (bool == null || !bool.booleanValue()) {
                    c3Var.f94966a.setImageResource(com.tencent.mm.R.drawable.f481097kn);
                } else {
                    c3Var.f94966a.setImageResource(com.tencent.mm.R.drawable.f481096km);
                }
            } else if (i18 == 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view3 = view2;
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c3Var.f94966a.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456436n)) {
                    c3Var.f94967b.setVisibility(8);
                } else {
                    c3Var.f94967b.setVisibility(0);
                    c3Var.f94967b.setText(aVar.f456436n);
                }
            } else {
                c3Var.f94966a.setVisibility(8);
                c3Var.f94967b.setVisibility(8);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456434l)) {
                c3Var.f94971f.setVisibility(8);
            } else {
                c3Var.f94971f.setVisibility(0);
                c3Var.f94971f.setText(aVar.f456434l);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456435m)) {
                c3Var.f94972g.setVisibility(8);
            } else {
                c3Var.f94972g.setVisibility(0);
                c3Var.f94972g.setText(aVar.f456435m);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456434l) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f456435m)) {
                android.view.View view4 = c3Var.f94970e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view5 = c3Var.f94970e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "not support type");
        }
        return view2;
    }
}
