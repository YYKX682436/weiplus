package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginVoiceUI f74315d;

    public x7(com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI) {
        this.f74315d = loginVoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginVoiceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11557, 2);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI = this.f74315d;
        intent.putExtra("Kusername", loginVoiceUI.f73263x);
        intent.putExtra("kscene_type", 1);
        j45.l.n(loginVoiceUI.getContext(), "voiceprint", ".ui.VoiceLoginUI", intent, 1024);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginVoiceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
