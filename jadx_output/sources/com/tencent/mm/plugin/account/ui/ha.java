package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ha implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.la f73910d;

    public ha(com.tencent.mm.plugin.account.ui.la laVar) {
        this.f73910d = laVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.account.ui.la laVar = this.f73910d;
        if (itemId == 2001) {
            laVar.c();
            return;
        }
        if (itemId != 2002) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = laVar.f74009e;
        thirdAppRegisterStruct.f61234d = 1L;
        thirdAppRegisterStruct.f61235e = 10L;
        thirdAppRegisterStruct.k();
        android.content.Intent intent = new android.content.Intent(laVar.f74008d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBLoginUI.class);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = laVar.f74008d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileInputUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileInputUI, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
