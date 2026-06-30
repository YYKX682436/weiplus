package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class g6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f73878d;

    public g6(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f73878d = loginIndepPass;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        n71.a.e("L200_100");
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f73878d;
        android.content.Intent intent = new android.content.Intent(loginIndepPass, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 1);
        intent.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass2 = this.f73878d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loginIndepPass2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$7", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginIndepPass2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(loginIndepPass2, "com/tencent/mm/plugin/account/ui/LoginIndepPass$7", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginIndepPass.finish();
        return true;
    }
}
