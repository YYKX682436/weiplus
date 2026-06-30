package ax3;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI f15112d;

    public i(com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI repairerRefreshLayoutDemoUI) {
        this.f15112d = repairerRefreshLayoutDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI.U6(this.f15112d, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
