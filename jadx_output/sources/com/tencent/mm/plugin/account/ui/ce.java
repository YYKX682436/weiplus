package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class ce implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f73778d;

    public ce(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f73778d = mobileVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f73778d;
        int i17 = mobileVerifyUI.f73537t;
        int i18 = 3;
        if (i17 == 2) {
            n71.a.e("R200_500");
        } else if (i17 == 3) {
            n71.a.e("F200_300");
        }
        android.content.Intent intent = new android.content.Intent(mobileVerifyUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bindmcontact_mobile", mobileVerifyUI.f73528h);
        int i19 = mobileVerifyUI.f73537t;
        if (i19 == 2) {
            i18 = 0;
        } else if (i19 == 3) {
            i18 = 2;
        }
        bundle.putInt("voice_verify_type", i18);
        intent.putExtras(bundle);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f73778d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mobileVerifyUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileVerifyUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mobileVerifyUI2, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
