package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class gb implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.sa f73883a;

    public gb(com.tencent.mm.plugin.account.ui.sa saVar) {
        this.f73883a = saVar;
    }

    @Override // com.tencent.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "onActivityResult() called with: resultCode = [" + i17 + "], data = [" + intent + "]");
        if (i17 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE") : "zh-TW";
            com.tencent.mm.plugin.account.ui.sa saVar = this.f73883a;
            saVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "requestVoicePhone() called with: diaLang = [" + stringExtra + "]");
            h11.e eVar = new h11.e(saVar.f74191g, 16, "", 1, stringExtra, 3);
            gm0.j1.d().g(eVar);
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = saVar.f74188d;
            mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), saVar.f74188d.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.hb(saVar, eVar));
        }
    }
}
