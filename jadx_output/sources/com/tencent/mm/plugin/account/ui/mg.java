package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class mg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI f74046d;

    public mg(com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI) {
        this.f74046d = regByMobileVoiceVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI = this.f74046d;
        int i17 = regByMobileVoiceVerifyUI.f73626m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            regByMobileVoiceVerifyUI.f73624h = new h11.e(regByMobileVoiceVerifyUI.f73620d, i17 != 0 ? i17 != 2 ? 16 : 8 : 14, "", 1, regByMobileVoiceVerifyUI.f73622f);
            gm0.j1.d().g(regByMobileVoiceVerifyUI.f73624h);
            db5.e1.m(regByMobileVoiceVerifyUI, com.tencent.mm.R.string.ahv, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.kg(this));
        } else if (i17 == 4 || i17 == 1) {
            regByMobileVoiceVerifyUI.f73625i = new r61.e1(regByMobileVoiceVerifyUI.f73620d, 1, "", 1, regByMobileVoiceVerifyUI.f73622f, "");
            gm0.j1.d().g(regByMobileVoiceVerifyUI.f73625i);
            db5.e1.m(regByMobileVoiceVerifyUI, com.tencent.mm.R.string.ahv, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.lg(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
