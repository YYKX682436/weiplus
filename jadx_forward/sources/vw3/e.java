package vw3;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f522467d;

    public e(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f522467d = baseRepairerPrefUI;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/BaseRepairerPrefUI$onCreate$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMainUI repairerMainUI = this.f522467d;
        if (repairerMainUI instanceof com.tencent.mm.plugin.repairer.ui.RepairerMainUI) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(repairerMainUI.mo55332x76847179());
            u1Var.u("");
            u1Var.g("是否重置所有维修厂配置");
            u1Var.a(true);
            u1Var.b(new vw3.d(repairerMainUI));
            u1Var.q(false);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/repairer/ui/BaseRepairerPrefUI$onCreate$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
