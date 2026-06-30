package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class jg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI f73962d;

    public jg(com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI) {
        this.f73962d = regByMobileVoiceVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI = this.f73962d;
        regByMobileVoiceVerifyUI.startActivityForResult(new android.content.Intent(regByMobileVoiceVerifyUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI.class).putExtra("voice_verify_code", regByMobileVoiceVerifyUI.f73622f), 10000);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
