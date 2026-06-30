package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class wc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f192228d;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f192228d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var;
        y9.i iVar;
        android.widget.Button button;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f192228d;
        kdVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        zl2.r4 r4Var = zl2.r4.f555483a;
        r4Var.N0(arrayList2, com.p314xaae8f345.mm.R.C30867xcad56011.e0q);
        zl2.r4.v0(r4Var, arrayList3, arrayList2.size(), 0, 4, null);
        android.content.Context context = kdVar.f199716e;
        kdVar.G1 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(context, arrayList2, arrayList3);
        int f07 = kdVar.f0();
        if (f07 < 60) {
            f07 = 60;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var2 = kdVar.G1;
        if (c0Var2 != null) {
            c0Var2.j(f07 / 3600, (f07 % 3600) / 60);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var3 = kdVar.G1;
        if (c0Var3 != null) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0_);
            android.widget.Button button2 = c0Var3.f293784i;
            if (button2 != null) {
                button2.setText(string);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var4 = kdVar.G1;
        if (c0Var4 != null) {
            c0Var4.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.id(kdVar, arrayList2, arrayList3);
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b0j, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        r45.hf5 hf5Var = (r45.hf5) kdVar.K1.m75936x14adae67(3);
        boolean z17 = false;
        if (hf5Var != null && hf5Var.m75939xb282bd08(0) == 2) {
            z17 = true;
        }
        textView.setText(z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_7) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_6));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var5 = kdVar.G1;
        if (c0Var5 != null) {
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560596oq);
            android.widget.Button button3 = c0Var5.f293785m;
            if (button3 != null) {
                button3.setTextColor(color);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var6 = kdVar.G1;
        if (c0Var6 != null) {
            c0Var6.h(2);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var7 = kdVar.G1;
        if (c0Var7 != null && (button = c0Var7.f293784i) != null) {
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563234a12);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var8 = kdVar.G1;
        if (c0Var8 != null) {
            c0Var8.g(inflate);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var9 = kdVar.G1;
        if (c0Var9 != null) {
            c0Var9.l();
        }
        if (lk5.s.b(context) && (c0Var = kdVar.G1) != null && (iVar = c0Var.f293779d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.a(iVar, context);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
