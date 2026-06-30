package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class vc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110648d;

    public vc(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110648d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110648d;
        if (((java.lang.Boolean) ((jz5.n) kdVar.P).getValue()).booleanValue()) {
            android.content.Context context = kdVar.f118183e;
            boolean z17 = false;
            kdVar.F1 = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 2);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488918au1, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485720ir5);
            textView.setText(inflate.getContext().getString(com.tencent.mm.R.string.d9o));
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485717ir2);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.gd(kdVar));
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var = kdVar.F1;
            if (z2Var != null) {
                z2Var.s(inflate);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 1, false));
            rm2.d dVar = new rm2.d();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.lang.String string = recyclerView.getContext().getString(com.tencent.mm.R.string.d8r);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = recyclerView.getContext().getString(com.tencent.mm.R.string.d8s);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            rm2.a aVar = new rm2.a(string, string2, 1, false);
            java.lang.String string3 = recyclerView.getContext().getString(com.tencent.mm.R.string.d8t);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = recyclerView.getContext().getString(com.tencent.mm.R.string.d8w);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            rm2.a aVar2 = new rm2.a(string3, string4, 2, false);
            r45.hn1 hn1Var = kdVar.K1;
            r45.hf5 hf5Var = (r45.hf5) hn1Var.getCustom(3);
            if (hf5Var != null && hf5Var.getInteger(0) == 1) {
                aVar.f397432d = true;
            }
            r45.hf5 hf5Var2 = (r45.hf5) hn1Var.getCustom(3);
            if (hf5Var2 != null && hf5Var2.getInteger(0) == 2) {
                z17 = true;
            }
            if (z17) {
                aVar2.f397432d = true;
            }
            linkedList.add(aVar);
            linkedList.add(aVar2);
            dVar.f397439d = linkedList;
            dVar.f397440e = new com.tencent.mm.plugin.finder.feed.ui.hd(kdVar);
            recyclerView.setAdapter(dVar);
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = kdVar.F1;
            if (z2Var2 != null) {
                z2Var2.j(recyclerView);
            }
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = kdVar.F1;
            if (z2Var3 != null) {
                z2Var3.C();
            }
            if (lk5.s.b(context)) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var4 = kdVar.F1;
                if (z2Var4 != null) {
                    z2Var4.u(com.tencent.mm.ui.bl.b(context).y);
                }
                com.tencent.mm.ui.widget.dialog.z2 z2Var5 = kdVar.F1;
                if (z2Var5 != null && (i17 = com.tencent.mm.ui.bl.b(context).y) != 0) {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) z2Var5.f212058g.getLayoutParams();
                    layoutParams2.width = i17;
                    z2Var5.f212058g.setLayoutParams(layoutParams2);
                    z2Var5.f212058g.invalidate();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
