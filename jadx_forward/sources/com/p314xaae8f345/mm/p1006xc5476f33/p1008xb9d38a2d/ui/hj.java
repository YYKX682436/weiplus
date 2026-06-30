package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public final class hj implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 f155450a;

    public hj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0) {
        this.f155450a = activityC11474x746047e0;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0 activityC11474x746047e0 = this.f155450a;
        if (intent != null && (stringExtra = intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE")) != null) {
            activityC11474x746047e0.getClass();
            activityC11474x746047e0.f155223i = stringExtra;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11474x746047e0.f155217m;
        activityC11474x746047e0.U6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePhoneLanguageTipsUI", "resultCode: " + i17 + ' ');
    }
}
