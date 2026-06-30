package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class me implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f74044d;

    public me(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f74044d = regAffiliateAccountUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.m2.d(), u11.b.d("CN")};
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f74044d;
        c71.b.c(regAffiliateAccountUI, regAffiliateAccountUI.getString(com.tencent.mm.R.string.k4f, objArr), 0, false);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
