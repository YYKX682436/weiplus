package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class q4 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f95138e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f95137d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f95139f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95140g = false;

    public q4(android.content.Context context) {
        this.f95138e = context;
    }

    public final void a(android.view.View view, boolean z17, boolean z18) {
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        if (z17) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        } else {
            view.setBackgroundResource(z18 ? com.tencent.mm.R.drawable.c7y : com.tencent.mm.R.drawable.bfj);
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f95137d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xt1.b) ((java.util.ArrayList) this.f95137d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        com.tencent.mm.plugin.card.ui.p4 p4Var;
        java.util.List list = this.f95137d;
        xt1.b bVar = (xt1.b) ((java.util.ArrayList) list).get(i17);
        int i18 = bVar.f456443t;
        android.content.Context context = this.f95138e;
        if (i18 == 2) {
            android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488278ow, null);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b8t);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.b8s);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.mu7);
            if (this.f95140g) {
                inflate2.setBackgroundResource(com.tencent.mm.R.drawable.f481118l8);
            }
            if (android.text.TextUtils.isEmpty(bVar.f456448y)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setTag(bVar.f456448y);
                linearLayout.setOnClickListener(new com.tencent.mm.plugin.card.ui.n4(this));
                ((android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.b8r)).setBackgroundColor(lu1.a0.d(bVar.f456449z));
                linearLayout.setVisibility(0);
            }
            textView.setText(bVar.f379843d);
            textView2.setText(bVar.f379844e);
            return inflate2;
        }
        com.tencent.mm.plugin.card.ui.p4 p4Var2 = view != null ? (com.tencent.mm.plugin.card.ui.p4) view.getTag() : null;
        if (view == null || p4Var2 == null) {
            inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488279ox, null);
            p4Var = new com.tencent.mm.plugin.card.ui.p4(this, null);
            p4Var.f95116a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b8p);
            p4Var.f95117b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b8o);
            p4Var.f95118c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b8k);
            p4Var.f95119d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.b8m);
            p4Var.f95120e = inflate.findViewById(com.tencent.mm.R.id.b8i);
            p4Var.f95121f = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.b8l);
            p4Var.f95122g = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.b8h);
            p4Var.f95123h = inflate.findViewById(com.tencent.mm.R.id.b8q);
            if (this.f95140g) {
                inflate.findViewById(com.tencent.mm.R.id.f483576ba5).setBackgroundResource(com.tencent.mm.R.drawable.f481118l8);
                p4Var.f95122g.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
            }
            inflate.setTag(p4Var);
        } else {
            p4Var = p4Var2;
            inflate = view;
        }
        if (i17 == 0 && ((com.tencent.mm.ui.MMFragmentActivity) context).findViewById(com.tencent.mm.R.id.b9m) == null) {
            android.view.View view2 = p4Var.f95123h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = p4Var.f95123h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p4Var.f95116a.setText(bVar.f379843d);
        if (bVar.f456445v) {
            p4Var.f95121f.setVisibility(0);
            p4Var.f95121f.setChecked(bVar.f456446w);
            p4Var.f95121f.setOnClickListener(new com.tencent.mm.plugin.card.ui.o4(this, bVar));
        } else {
            p4Var.f95121f.setVisibility(8);
        }
        if (android.text.TextUtils.isEmpty(bVar.f379844e)) {
            p4Var.f95117b.setVisibility(4);
        } else {
            p4Var.f95117b.setVisibility(0);
            p4Var.f95117b.setText(bVar.f379844e);
        }
        boolean z17 = (bVar.f379847h & 1) > 0;
        int i19 = com.tencent.mm.R.color.UN_BW_0_Alpha_0_5;
        if (z17) {
            p4Var.f95116a.setGravity(17);
            p4Var.f95116a.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
            p4Var.f95117b.setVisibility(8);
        } else {
            p4Var.f95116a.setGravity(3);
            p4Var.f95116a.setTextColor(context.getResources().getColor(bVar.f456447x ? com.tencent.mm.R.color.a0c : com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            if (bVar.f456447x) {
                inflate.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                inflate.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_97));
                p4Var.f95122g.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
            }
        }
        if (bVar.f456444u) {
            p4Var.f95118c.setVisibility(0);
        } else {
            p4Var.f95118c.setVisibility(8);
        }
        android.widget.TextView textView3 = p4Var.f95117b;
        android.content.res.Resources resources = context.getResources();
        if (bVar.f456447x) {
            i19 = com.tencent.mm.R.color.f478873jj;
        }
        textView3.setTextColor(resources.getColor(i19));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f379850n)) {
            p4Var.f95119d.setVisibility(0);
            lu1.g0.b(p4Var.f95119d, bVar.f379850n, i65.a.b(context, 20), com.tencent.mm.R.drawable.cbt, false);
        } else {
            p4Var.f95119d.setVisibility(8);
        }
        int i27 = i17 + 1;
        if (i27 < getCount()) {
            xt1.b bVar2 = (xt1.b) ((java.util.ArrayList) list).get(i17);
            android.view.View view4 = p4Var.f95120e;
            boolean z18 = !bVar.f456447x;
            if (bVar2 != null) {
                a(view4, bVar2.f456444u, z18);
            }
            xt1.b bVar3 = (xt1.b) ((java.util.ArrayList) list).get(i27);
            android.view.View view5 = p4Var.f95120e;
            boolean z19 = !bVar.f456447x;
            if (bVar3 != null) {
                a(view5, bVar3.f456444u, z19);
            }
        } else if (i27 == getCount()) {
            if (this.f95139f) {
                a(p4Var.f95120e, true, !bVar.f456447x);
            } else {
                a(p4Var.f95120e, false, !bVar.f456447x);
            }
        }
        return inflate;
    }
}
