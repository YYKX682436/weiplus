package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class q3 implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 f242994a;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 activityC17395x33991581) {
        this.f242994a = activityC17395x33991581;
    }

    @Override // du5.d
    public void a() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationSucceed", new java.lang.Object[0]);
        android.widget.TextView textView = this.f242994a.f241751g;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("verifyDescErrorTv");
            throw null;
        }
    }

    @Override // du5.d
    public void b() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onStartAuthentication", new java.lang.Object[0]);
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationHelp helpCode: " + i17 + ", helpString: " + ((java.lang.Object) charSequence), new java.lang.Object[0]);
    }

    @Override // du5.d
    public void d() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationCancelled", new java.lang.Object[0]);
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationError errorCode: " + i17 + ", errorString: " + ((java.lang.Object) charSequence), new java.lang.Object[0]);
    }

    @Override // du5.d
    public void f() {
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] onAuthenticationFailed", new java.lang.Object[0]);
        android.widget.TextView textView = this.f242994a.f241751g;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("verifyDescErrorTv");
            throw null;
        }
    }
}
