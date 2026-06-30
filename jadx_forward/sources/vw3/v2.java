package vw3;

/* loaded from: classes5.dex */
public final class v2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f522690d;

    public v2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI) {
        this.f522690d = repairerMagicBootsUI;
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
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMagicBootsUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI = this.f522690d;
        vw3.q2 q2Var = repairerMagicBootsUI.e;
        if (q2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
        java.lang.String str = (java.lang.String) q2Var.f522614e.get(i17);
        dp.a.m125854x26a183b(repairerMagicBootsUI.mo55332x76847179(), "start check " + str, 0).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) s4Var).wi(lowerCase, "", false, new vw3.u2(repairerMagicBootsUI));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMagicBootsUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
