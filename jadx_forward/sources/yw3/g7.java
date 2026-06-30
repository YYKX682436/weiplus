package yw3;

/* loaded from: classes.dex */
public final class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c f548288d;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c activityC17164x1a40ce4c) {
        this.f548288d = activityC17164x1a40ce4c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        we0.c1 c1Var = (we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class));
        c1Var.getClass();
        if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "start insert..", 0).show();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new we0.b1(c1Var, currentTimeMillis, null), 2, null);
        }
        android.widget.Toast.makeText(this.f548288d.mo55332x76847179(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
