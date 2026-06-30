package as3;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16916xb2db4a89 f95079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ as3.l0 f95080e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16916xb2db4a89 c16916xb2db4a89, as3.l0 l0Var) {
        this.f95079d = c16916xb2db4a89;
        this.f95080e = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l onTabSelected = this.f95079d.getOnTabSelected();
        as3.l0 l0Var = this.f95080e;
        if (onTabSelected != null) {
            onTabSelected.mo146xb9724478(l0Var.f95057a);
        }
        yz5.a aVar = l0Var.f95061e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
