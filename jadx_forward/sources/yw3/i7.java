package yw3;

/* loaded from: classes11.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c f548305d;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c activityC17164x1a40ce4c) {
        this.f548305d = activityC17164x1a40ce4c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.util.Iterator it = ((kz5.h) ai4.a.f86652m).iterator();
        while (it.hasNext()) {
            L.G(ai4.b0.f86656a.c((ai4.a) it.next()), false);
        }
        for (int n17 = L.n(ai4.b0.f86656a.d()); -1 < n17; n17--) {
            L.B(ai4.b0.f86656a.b(n17), 0L);
        }
        L.A(ai4.b0.f86656a.d(), 0);
        L.A("V7_T2_P13_StateDailyReportTime_StatusAffDBTransfer_" + gm0.j1.b().h(), 0);
        android.widget.Toast.makeText(this.f548305d.mo55332x76847179(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
