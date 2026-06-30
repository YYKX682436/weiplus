package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public class h0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f272394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca f272395b;

    public h0(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca activityC19635xb390e7ca, com.p314xaae8f345.mm.p2470x93e71c27.ui.c0 c0Var) {
        this.f272395b = activityC19635xb390e7ca;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public int a() {
        return com.p314xaae8f345.mm.R.C30861xcebc809e.btr;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String b() {
        return this.f272395b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ais);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String c() {
        return this.f272395b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.air);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String d() {
        return this.f272395b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ain);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca activityC19635xb390e7ca = this.f272395b;
            if (i17 == 1024 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    stringExtra.length();
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("VoiceLoginAuthPwd", stringExtra);
                intent2.putExtra("KVoiceHelpCode", activityC19635xb390e7ca.f271296i);
                activityC19635xb390e7ca.setResult(-1, intent2);
            }
            activityC19635xb390e7ca.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void f(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        this.f272394a = intent.getIntExtra("kscene_type", 73);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void g(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kscene_type", this.f272394a);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca activityC19635xb390e7ca = this.f272395b;
        intent.putExtra("Kusername", activityC19635xb390e7ca.f271292e);
        intent.putExtra("Kvertify_key", activityC19635xb390e7ca.f271293f);
        j45.l.n(context, "voiceprint", ".ui.VoiceLoginUI", intent, 1024);
    }
}
