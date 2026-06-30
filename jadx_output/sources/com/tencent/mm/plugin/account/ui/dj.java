package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class dj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI f73813d;

    public dj(com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI) {
        this.f73813d = voicePhoneLanguageTipsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI = this.f73813d;
        voicePhoneLanguageTipsUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        pf5.j0.a(intent, com.tencent.mm.plugin.account.ui.e3.class);
        intent.putExtra("INTENT_KEY_INDEX", v61.h0.f433441a.a());
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = voicePhoneLanguageTipsUI.getContext();
        cVar.d(intent);
        cVar.e(true);
        cVar.a("com.tencent.mm.plugin.account.ui.ChooseLanguageUI");
        cVar.b(com.tencent.mm.plugin.account.ui.EnterAnimationHalfScreen.class);
        cVar.i(new com.tencent.mm.plugin.account.ui.hj(voicePhoneLanguageTipsUI));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
