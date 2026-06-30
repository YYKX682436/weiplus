package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class q4 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f176671e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f176670d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f176672f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176673g = false;

    public q4(android.content.Context context) {
        this.f176671e = context;
    }

    public final void a(android.view.View view, boolean z17, boolean z18) {
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        if (z17) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        } else {
            view.setBackgroundResource(z18 ? com.p314xaae8f345.mm.R.C30861xcebc809e.c7y : com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f176670d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.b) ((java.util.ArrayList) this.f176670d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p4 p4Var;
        java.util.List list = this.f176670d;
        xt1.b bVar = (xt1.b) ((java.util.ArrayList) list).get(i17);
        int i18 = bVar.f537976t;
        android.content.Context context = this.f176671e;
        if (i18 == 2) {
            android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569811ow, null);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b8t);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b8s);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.mu7);
            if (this.f176673g) {
                inflate2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562651l8);
            }
            if (android.text.TextUtils.isEmpty(bVar.f537981y)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setTag(bVar.f537981y);
                linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n4(this));
                ((android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.b8r)).setBackgroundColor(lu1.a0.d(bVar.f537982z));
                linearLayout.setVisibility(0);
            }
            textView.setText(bVar.f461376d);
            textView2.setText(bVar.f461377e);
            return inflate2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p4 p4Var2 = view != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p4) view.getTag() : null;
        if (view == null || p4Var2 == null) {
            inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569812ox, null);
            p4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p4(this, null);
            p4Var.f176649a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8p);
            p4Var.f176650b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8o);
            p4Var.f176651c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8k);
            p4Var.f176652d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8m);
            p4Var.f176653e = inflate.findViewById(com.p314xaae8f345.mm.R.id.b8i);
            p4Var.f176654f = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8l);
            p4Var.f176655g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.b8h);
            p4Var.f176656h = inflate.findViewById(com.p314xaae8f345.mm.R.id.b8q);
            if (this.f176673g) {
                inflate.findViewById(com.p314xaae8f345.mm.R.id.f565109ba5).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562651l8);
                p4Var.f176655g.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
            }
            inflate.setTag(p4Var);
        } else {
            p4Var = p4Var2;
            inflate = view;
        }
        if (i17 == 0 && ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).findViewById(com.p314xaae8f345.mm.R.id.b9m) == null) {
            android.view.View view2 = p4Var.f176656h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = p4Var.f176656h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p4Var.f176649a.setText(bVar.f461376d);
        if (bVar.f537978v) {
            p4Var.f176654f.setVisibility(0);
            p4Var.f176654f.setChecked(bVar.f537979w);
            p4Var.f176654f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o4(this, bVar));
        } else {
            p4Var.f176654f.setVisibility(8);
        }
        if (android.text.TextUtils.isEmpty(bVar.f461377e)) {
            p4Var.f176650b.setVisibility(4);
        } else {
            p4Var.f176650b.setVisibility(0);
            p4Var.f176650b.setText(bVar.f461377e);
        }
        boolean z17 = (bVar.f461380h & 1) > 0;
        int i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92;
        if (z17) {
            p4Var.f176649a.setGravity(17);
            p4Var.f176649a.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            p4Var.f176650b.setVisibility(8);
        } else {
            p4Var.f176649a.setGravity(3);
            p4Var.f176649a.setTextColor(context.getResources().getColor(bVar.f537980x ? com.p314xaae8f345.mm.R.C30859x5a72f63.a0c : com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            if (bVar.f537980x) {
                inflate.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else {
                inflate.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22));
                p4Var.f176655g.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
            }
        }
        if (bVar.f537977u) {
            p4Var.f176651c.setVisibility(0);
        } else {
            p4Var.f176651c.setVisibility(8);
        }
        android.widget.TextView textView3 = p4Var.f176650b;
        android.content.res.Resources resources = context.getResources();
        if (bVar.f537980x) {
            i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
        }
        textView3.setTextColor(resources.getColor(i19));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f461383n)) {
            p4Var.f176652d.setVisibility(0);
            lu1.g0.b(p4Var.f176652d, bVar.f461383n, i65.a.b(context, 20), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, false);
        } else {
            p4Var.f176652d.setVisibility(8);
        }
        int i27 = i17 + 1;
        if (i27 < getCount()) {
            xt1.b bVar2 = (xt1.b) ((java.util.ArrayList) list).get(i17);
            android.view.View view4 = p4Var.f176653e;
            boolean z18 = !bVar.f537980x;
            if (bVar2 != null) {
                a(view4, bVar2.f537977u, z18);
            }
            xt1.b bVar3 = (xt1.b) ((java.util.ArrayList) list).get(i27);
            android.view.View view5 = p4Var.f176653e;
            boolean z19 = !bVar.f537980x;
            if (bVar3 != null) {
                a(view5, bVar3.f537977u, z19);
            }
        } else if (i27 == getCount()) {
            if (this.f176672f) {
                a(p4Var.f176653e, true, !bVar.f537980x);
            } else {
                a(p4Var.f176653e, false, !bVar.f537980x);
            }
        }
        return inflate;
    }
}
