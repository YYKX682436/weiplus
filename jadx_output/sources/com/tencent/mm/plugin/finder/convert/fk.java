package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f103395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103396e;

    public fk(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var) {
        this.f103395d = recyclerView;
        this.f103396e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f103395d;
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127652d4).getValue()).r()).intValue() == 1) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context2 = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            i0Var.getClass();
            hz2.d dVar = hz2.d.f286313a;
            if (dVar.b(ya.a.SEARCH) != 0) {
                db5.e1.y(context2, dVar.c(ya.a.SEARCH), "", context2.getString(com.tencent.mm.R.string.l_e), null);
            } else {
                jx3.f.INSTANCE.idkeyStat(1265L, 0L, 1L, false);
                intent.setClass(context2, com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderHotSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else {
            android.content.Context context3 = this.f103396e.f293121e;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            boolean z17 = xy2.c.e(context3).length() > 0;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[2] = 2;
            g0Var.d(20971, objArr);
            com.tencent.mm.plugin.finder.assist.i0 i0Var2 = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context4 = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            i0Var2.Vj(context4, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSearchConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
