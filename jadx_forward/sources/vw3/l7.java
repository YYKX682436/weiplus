package vw3;

/* loaded from: classes.dex */
public final class l7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f522560d;

    public l7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f522560d = repairerXLogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerXLogUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f522560d;
        repairerXLogUI.d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(repairerXLogUI, "正在处理...", true, 0, null);
        ((ku5.t0) ku5.t0.f394148d).g(new vw3.k7(this.f522560d));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerXLogUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
