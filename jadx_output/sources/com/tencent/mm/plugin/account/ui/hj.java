package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class hj implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI f73917a;

    public hj(com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI) {
        this.f73917a = voicePhoneLanguageTipsUI;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI voicePhoneLanguageTipsUI = this.f73917a;
        if (intent != null && (stringExtra = intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE")) != null) {
            voicePhoneLanguageTipsUI.getClass();
            voicePhoneLanguageTipsUI.f73690i = stringExtra;
        }
        int i18 = com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI.f73684m;
        voicePhoneLanguageTipsUI.U6();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePhoneLanguageTipsUI", "resultCode: " + i17 + ' ');
    }
}
