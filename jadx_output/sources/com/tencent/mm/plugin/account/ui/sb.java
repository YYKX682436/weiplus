package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class sb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74197d;

    public sb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74197d = mobileInputUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74197d;
        intent.setClassName(mobileInputUI.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerMainUI");
        androidx.appcompat.app.AppCompatActivity context = mobileInputUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MobileInputUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
