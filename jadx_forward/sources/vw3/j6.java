package vw3;

/* loaded from: classes5.dex */
public final class j6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f522537d;

    public j6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f522537d = repairerUDRUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUDRUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI = this.f522537d;
        vw3.e6 e6Var = repairerUDRUI.e;
        if (e6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
        java.lang.String str = (java.lang.String) e6Var.f522476e.get(i17);
        dp.a.m125854x26a183b(repairerUDRUI.mo55332x76847179(), "start check " + str, 0).show();
        ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi(str);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c(str);
        java.util.LinkedList linkedList = qVar.f299082f;
        java.util.RandomAccess mo14972x73ec24f3 = wi6 != null ? wi6.mo14972x73ec24f3() : null;
        if (mo14972x73ec24f3 == null) {
            mo14972x73ec24f3 = kz5.p0.f395529d;
        }
        linkedList.addAll(mo14972x73ec24f3);
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new vw3.i6(repairerUDRUI));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUDRUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
