package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class fj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI f73867d;

    public fj(com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI) {
        this.f73867d = voicePhoneLanguageTipsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI = this.f73867d;
        voicePhoneLanguageTipsUI.setResult(0);
        voicePhoneLanguageTipsUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
