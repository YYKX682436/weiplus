package as3;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout f13546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ as3.l0 f13547e;

    public z(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout bizProfileTabLayout, as3.l0 l0Var) {
        this.f13546d = bizProfileTabLayout;
        this.f13547e = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l onTabSelected = this.f13546d.getOnTabSelected();
        as3.l0 l0Var = this.f13547e;
        if (onTabSelected != null) {
            onTabSelected.invoke(l0Var.f13524a);
        }
        yz5.a aVar = l0Var.f13528e;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
