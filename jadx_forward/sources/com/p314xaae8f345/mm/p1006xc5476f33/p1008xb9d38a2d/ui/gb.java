package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class gb implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa f155416a;

    public gb(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa saVar) {
        this.f155416a = saVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "onActivityResult() called with: resultCode = [" + i17 + "], data = [" + intent + "]");
        if (i17 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE") : "zh-TW";
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa saVar = this.f155416a;
            saVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "requestVoicePhone() called with: diaLang = [" + stringExtra + "]");
            h11.e eVar = new h11.e(saVar.f155724g, 16, "", 1, stringExtra, 3);
            gm0.j1.d().g(eVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = saVar.f155721d;
            activityC11453xa58e34bc.f155019n = db5.e1.Q(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), saVar.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.hb(saVar, eVar));
        }
    }
}
