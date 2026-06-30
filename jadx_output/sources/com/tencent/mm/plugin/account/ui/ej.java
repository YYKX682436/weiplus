package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class ej implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI f73830d;

    public ej(com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI) {
        this.f73830d = voicePhoneLanguageTipsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("btnOk:OnClickListener language:");
        com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI = this.f73830d;
        sb6.append(voicePhoneLanguageTipsUI.f73690i);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePhoneLanguageTipsUI", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_LANGUAGE_CODE", voicePhoneLanguageTipsUI.f73690i);
        voicePhoneLanguageTipsUI.setResult(-1, intent);
        voicePhoneLanguageTipsUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
