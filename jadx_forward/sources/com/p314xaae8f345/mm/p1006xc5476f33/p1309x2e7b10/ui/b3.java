package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class b3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd f176491d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd) {
        this.f176491d = activityC13056x715f08fd;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f176491d.f176414o.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.a) this.f176491d.f176414o.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c3 c3Var;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd = this.f176491d;
        xt1.a aVar = (xt1.a) activityC13056x715f08fd.f176414o.get(i17);
        if (view == null) {
            view2 = android.view.View.inflate(activityC13056x715f08fd, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569888r1, null);
            c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c3(activityC13056x715f08fd);
            c3Var.f176499a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.bbz);
            c3Var.f176500b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hft);
            c3Var.f176501c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.obc);
            c3Var.f176502d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nqr);
            c3Var.f176503e = view2.findViewById(com.p314xaae8f345.mm.R.id.ovy);
            c3Var.f176504f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hfx);
            c3Var.f176505g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hfl);
            view2.setTag(c3Var);
        } else {
            c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c3) view.getTag();
            view2 = view;
        }
        if (lu1.a0.B(aVar.f537957b)) {
            if (android.text.TextUtils.isEmpty(aVar.f537959d)) {
                c3Var.f176501c.setVisibility(8);
            } else {
                c3Var.f176501c.setVisibility(0);
                c3Var.f176501c.setText(aVar.f537959d);
            }
            if (android.text.TextUtils.isEmpty(aVar.f537960e)) {
                c3Var.f176502d.setVisibility(8);
            } else {
                c3Var.f176502d.setVisibility(0);
                c3Var.f176502d.setText(aVar.f537960e);
            }
            int i18 = aVar.f537966k;
            if (i18 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c3Var.f176499a.setVisibility(0);
                c3Var.f176500b.setVisibility(8);
                java.lang.Boolean bool = (java.lang.Boolean) activityC13056x715f08fd.f176415p.get(java.lang.Integer.valueOf(i17));
                if (bool == null || !bool.booleanValue()) {
                    c3Var.f176499a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562630kn);
                } else {
                    c3Var.f176499a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562629km);
                }
            } else if (i18 == 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view3 = view2;
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c3Var.f176499a.setVisibility(8);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537969n)) {
                    c3Var.f176500b.setVisibility(8);
                } else {
                    c3Var.f176500b.setVisibility(0);
                    c3Var.f176500b.setText(aVar.f537969n);
                }
            } else {
                c3Var.f176499a.setVisibility(8);
                c3Var.f176500b.setVisibility(8);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537967l)) {
                c3Var.f176504f.setVisibility(8);
            } else {
                c3Var.f176504f.setVisibility(0);
                c3Var.f176504f.setText(aVar.f537967l);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537968m)) {
                c3Var.f176505g.setVisibility(8);
            } else {
                c3Var.f176505g.setVisibility(0);
                c3Var.f176505g.setText(aVar.f537968m);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537967l) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f537968m)) {
                android.view.View view4 = c3Var.f176503e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view5 = c3Var.f176503e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "not support type");
        }
        return view2;
    }
}
