package vw3;

/* loaded from: classes.dex */
public final class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f522651d;

    public t4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f522651d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f522651d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().g(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.d5c)).getText().toString(), ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.d5f)).getText().toString());
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
