package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class xg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f110735d;

    public xg(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI) {
        this.f110735d = finderNewManagementUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI = this.f110735d;
        intent.setClass(finderNewManagementUI, com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI.class);
        androidx.appcompat.app.AppCompatActivity context = finderNewManagementUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        intent.putExtra("key_click_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        intent.putExtra("key_context_id", nyVar != null ? nyVar.f135382p : null);
        androidx.appcompat.app.AppCompatActivity context2 = finderNewManagementUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
