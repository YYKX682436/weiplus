package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11398x839f4d83 f155767d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11398x839f4d83 activityC11398x839f4d83) {
        this.f155767d = activityC11398x839f4d83;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v61.g0 g0Var = v61.h0.f514974a;
        java.util.List S0 = kz5.n0.S0(v61.h0.f514976c.keySet());
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11398x839f4d83 activityC11398x839f4d83 = this.f155767d;
        java.lang.String str = (java.lang.String) S0.get(activityC11398x839f4d83.f154801f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseLanguageUI", "btnConfirm OnClickListener result:" + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_LANGUAGE_CODE", str);
        activityC11398x839f4d83.setResult(-1, intent);
        activityC11398x839f4d83.finish();
    }
}
