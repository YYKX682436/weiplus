package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ChooseLanguageUI f74234d;

    public u0(com.tencent.mm.plugin.account.ui.ChooseLanguageUI chooseLanguageUI) {
        this.f74234d = chooseLanguageUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v61.g0 g0Var = v61.h0.f433441a;
        java.util.List S0 = kz5.n0.S0(v61.h0.f433443c.keySet());
        com.tencent.mm.plugin.account.ui.ChooseLanguageUI chooseLanguageUI = this.f74234d;
        java.lang.String str = (java.lang.String) S0.get(chooseLanguageUI.f73268f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseLanguageUI", "btnConfirm OnClickListener result:" + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_KEY_LANGUAGE_CODE", str);
        chooseLanguageUI.setResult(-1, intent);
        chooseLanguageUI.finish();
    }
}
