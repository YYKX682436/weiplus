package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class b0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 f288360a;

    public b0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var) {
        this.f288360a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0 a0Var = this.f288360a.F;
        a0Var.f288353a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        a0Var.f288354b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        a0Var.f288355c = textView;
        textView.setVisibility(8);
        a0Var.f288356d = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        a0Var.f288357e = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1g);
        a0Var.f288358f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        a0Var.f288359g = inflate.findViewById(com.p314xaae8f345.mm.R.id.m38);
        a0Var.f288353a.setImportantForAccessibility(2);
        inflate.setTag(a0Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0) dVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0 a0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0) bVar;
        a0Var.f288354b.setCompoundDrawables(null, null, null, null);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var2 = this.f288360a;
        int i17 = c0Var2.D;
        if (i17 != 0 && c0Var2.C != null) {
            a0Var.f288353a.setImageResource(i17);
            a0Var.f288354b.setText(c0Var2.C);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(c0Var.f288351y, a0Var.f288354b);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c0Var.f288352z) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(c0Var.f288352z)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c0Var.f288352z, true);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, a0Var.f288354b, c0Var.f288351y, n17.Q0(), n17.G0(), (int) a0Var.f288354b.getTextSize());
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(a0Var.f288353a, c0Var.f288352z, null);
        if (c01.e2.R(c0Var.f288352z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            a0Var.f288354b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            a0Var.f288354b.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(a0Var.f288354b, c0Var.f288352z, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        if (a0Var.f288359g != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(c0Var.f288352z) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(c0Var.f288352z)) {
                android.view.View view = a0Var.f288359g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = a0Var.f288359g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (android.text.TextUtils.isEmpty(c0Var.f288370f)) {
            a0Var.f288355c.setVisibility(8);
        } else {
            a0Var.f288355c.setVisibility(0);
            a0Var.f288355c.setText(c0Var.f288370f);
        }
        if (!c0Var2.f288369e) {
            a0Var.f288356d.setVisibility(8);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(c0Var.f288352z) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(c0Var.f288352z)) {
            a0Var.f288356d.setVisibility(4);
        } else {
            if (z17) {
                a0Var.f288356d.setChecked(true);
                a0Var.f288356d.setEnabled(false);
                a0Var.f288356d.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                a0Var.f288356d.setChecked(z18);
                a0Var.f288356d.setEnabled(true);
            }
            a0Var.f288356d.setVisibility(0);
        }
        if (c0Var2.f288376l) {
            a0Var.f288357e.setBackground(null);
        }
        if (c0Var2.f288377m) {
            a0Var.f288358f.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
        } else {
            a0Var.f288358f.setBackground(null);
        }
    }
}
