package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class xd implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af f155855a;

    public xd(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af) {
        this.f155855a = activityC11457x794a57af;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileVerifyUI", "onActivityResult() called with: resultCode = [" + i17 + "], data = [" + intent + "]");
        if (i17 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155855a;
            if (intent != null) {
                activityC11457x794a57af.f155067q = intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE");
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.B;
            activityC11457x794a57af.f155057d.a();
            activityC11457x794a57af.f155071u.a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe.DoSend);
        }
    }
}
