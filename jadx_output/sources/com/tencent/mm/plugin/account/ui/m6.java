package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class m6 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74037d;

    public m6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74037d = loginPasswordUI;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(final java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            new android.os.Handler(this.f74037d.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.m6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = com.tencent.mm.plugin.account.ui.m6.this.f74037d;
                    if (loginPasswordUI.A1) {
                        return;
                    }
                    loginPasswordUI.A1 = true;
                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    loginPasswordUI.f73369z1 = booleanValue;
                    if (booleanValue) {
                        if (!(loginPasswordUI.getIntent().getIntExtra("login_type", 0) == 0) || loginPasswordUI.T <= 6) {
                            return;
                        }
                        loginPasswordUI.r7(6);
                    }
                }
            });
        }
    }
}
