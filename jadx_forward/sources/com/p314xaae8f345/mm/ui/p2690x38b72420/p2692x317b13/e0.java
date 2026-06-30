package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class e0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f288396a;

    public e0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f0Var) {
        this.f288396a = f0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d0 d0Var = this.f288396a.D;
        d0Var.f288389a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        d0Var.f288390b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        d0Var.f288391c = textView;
        textView.setVisibility(8);
        d0Var.f288392d = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        d0Var.f288393e = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1g);
        d0Var.f288394f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        d0Var.f288395g = inflate.findViewById(com.p314xaae8f345.mm.R.id.m38);
        d0Var.f288389a.setImportantForAccessibility(2);
        inflate.setTag(d0Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0) dVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d0 d0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d0) bVar;
        d0Var.f288390b.setCompoundDrawables(null, null, null, null);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f0Var2 = this.f288396a;
        f0Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(f0Var.f288351y, d0Var.f288390b);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f0Var.f288352z)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f0Var.f288352z, true);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, d0Var.f288390b, f0Var.f288351y, n17.Q0(), n17.G0(), (int) d0Var.f288390b.getTextSize());
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(d0Var.f288389a, f0Var.f288352z, null);
        if (c01.e2.R(f0Var.f288352z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            d0Var.f288390b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            d0Var.f288390b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (android.text.TextUtils.isEmpty(f0Var.f288370f)) {
            d0Var.f288391c.setVisibility(8);
        } else {
            d0Var.f288391c.setVisibility(0);
            d0Var.f288391c.setText(f0Var.f288370f);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f0Var.f288352z) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(f0Var.f288352z)) {
            d0Var.f288392d.setVisibility(4);
            android.view.View view = d0Var.f288395g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = d0Var.f288395g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/item/ConversationMemberDataItem$ConversationMemberViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z17) {
                d0Var.f288392d.setChecked(true);
                d0Var.f288392d.setEnabled(false);
                d0Var.f288392d.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                d0Var.f288392d.setChecked(z18);
                d0Var.f288392d.setEnabled(true);
            }
            d0Var.f288392d.setVisibility(0);
        }
        if (f0Var2.f288376l) {
            d0Var.f288393e.setBackground(null);
        }
        if (f0Var2.f288377m) {
            d0Var.f288394f.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
        } else {
            d0Var.f288394f.setBackground(null);
        }
    }
}
