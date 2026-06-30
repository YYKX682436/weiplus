package ax3;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI f96642d;

    public f(com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI repairerRefreshLayoutDemoUI) {
        this.f96642d = repairerRefreshLayoutDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoUI.U6(this.f96642d, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
