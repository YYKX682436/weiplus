package vw3;

/* loaded from: classes.dex */
public final class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f522677d;

    public u4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f522677d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f522677d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.d5c)).getText().toString());
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.d5f)).setText(d17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), "Config is Empty", 0).show();
            }
        } catch (java.lang.Exception unused) {
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), "Error", 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
