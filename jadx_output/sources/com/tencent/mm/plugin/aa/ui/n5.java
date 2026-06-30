package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72748d;

    public n5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72748d = launchAAUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.List linkedList;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72748d;
        g0Var.d(13721, 9, 0, java.lang.Integer.valueOf(launchAAUI.f72504h));
        z60.k kVar = (z60.k) i95.n0.c(z60.k.class);
        java.lang.String str = launchAAUI.f72507m;
        java.lang.String r17 = c01.z1.r();
        ((z60.i) kVar).getClass();
        y63.c Bi = ((t63.e) i95.n0.c(t63.e.class)).Bi();
        Bi.getClass();
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(r17)) {
            linkedList = new java.util.LinkedList();
        } else {
            p75.n0 n0Var = dm.c6.f236130p;
            p75.d dVar = dm.c6.f236131q;
            p75.d dVar2 = dm.c6.f236132r;
            p75.d dVar3 = dm.c6.f236133s;
            p75.d dVar4 = dm.c6.f236134t;
            long e17 = c01.id.e();
            kk.j jVar = x63.g.f452235a;
            long longValue = e17 - (5 * y63.c.f459658e.longValue());
            p75.i0 i17 = n0Var.i();
            com.tencent.mm.sdk.platformtools.t8.n(str);
            p75.y yVar = (p75.y) dVar.j(str).c(dVar2.j(r17));
            yVar.f(dVar3.i(1));
            yVar.f(dVar4.n(java.lang.Long.valueOf(longValue)));
            i17.f352657d = yVar;
            i17.e(dVar4.u());
            linkedList = i17.a().k(Bi.f459662d, y63.a.class);
            java.util.Iterator it = ((java.util.ArrayList) linkedList).iterator();
            while (it.hasNext()) {
                x63.g.n((y63.a) it.next());
            }
        }
        linkedList.sort(new com.tencent.mm.plugin.aa.ui.j5(this));
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(launchAAUI);
        android.view.View inflate = android.view.View.inflate(launchAAUI.getContext(), com.tencent.mm.R.layout.f487865a2, null);
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482298am)).setOnClickListener(new com.tencent.mm.plugin.aa.ui.k5(this, y1Var));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482299an)).getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f482294ai);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.f482292ag);
        com.tencent.mm.view.MaxHeightScrollView maxHeightScrollView = (com.tencent.mm.view.MaxHeightScrollView) inflate.findViewById(com.tencent.mm.R.id.f482293ah);
        maxHeightScrollView.setMaxHeight((com.tencent.mm.ui.bl.b(launchAAUI.getContext()).y * 2) / 3);
        if (linkedList.size() <= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maxHeightScrollView.setVisibility(8);
            view2 = inflate;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maxHeightScrollView.setVisibility(0);
            ww1.f fVar = new ww1.f(launchAAUI.getContext());
            fVar.f450178e = linkedList;
            fVar.notifyDataSetChanged();
            recyclerView.setAdapter(fVar);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(launchAAUI));
            fVar.f450180g = new com.tencent.mm.plugin.aa.ui.l5(this, y1Var);
            fVar.f450179f = new com.tencent.mm.plugin.aa.ui.m5(this);
            view2 = inflate;
        }
        y1Var.k(view2);
        y1Var.f212027f.setFocusable(false);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
