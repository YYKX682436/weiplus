package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class je implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f73960d;

    public je(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f73960d = regAffiliateAccountUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f73960d;
        regAffiliateAccountUI.hideVKB();
        android.content.Intent intent = new android.content.Intent(regAffiliateAccountUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI.class);
        intent.putExtra("RegScene", regAffiliateAccountUI.f73556o);
        intent.putExtra("RegTicket", regAffiliateAccountUI.f73557p);
        intent.putExtra("sessionID", regAffiliateAccountUI.f73558q);
        intent.putExtra("NickName", regAffiliateAccountUI.f73559r);
        intent.putExtra("AvatarFileID", regAffiliateAccountUI.f73560s);
        intent.putExtra("AvatarAESKey", regAffiliateAccountUI.f73561t);
        intent.putExtra("STEP_ONE", false);
        regAffiliateAccountUI.startActivityForResult(intent, 702);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
