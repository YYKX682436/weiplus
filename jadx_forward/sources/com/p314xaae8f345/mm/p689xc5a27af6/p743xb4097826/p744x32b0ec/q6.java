package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes5.dex */
public final class q6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f148410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f148411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f148412f;

    public q6(int i17, v65.n nVar, android.app.Activity activity, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f148410d = nVar;
        this.f148411e = activity;
        this.f148412f = h0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (valueOf != null && valueOf.intValue() == 40004) {
            java.lang.String str = null;
            java.lang.String stringExtra = (valueOf2 == null || valueOf2.intValue() != -1 || intent == null) ? null : intent.getStringExtra("FinderLiveBasePhoneNumberAuthUIC.KEY_SESSION_ID");
            if (stringExtra != null) {
                if (stringExtra.length() > 0) {
                    str = stringExtra;
                }
            }
            this.f148410d.a(str);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p6(this.f148411e, this.f148412f));
        }
    }
}
