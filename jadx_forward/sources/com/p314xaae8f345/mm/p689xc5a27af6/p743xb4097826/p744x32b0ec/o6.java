package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes5.dex */
public final class o6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f148389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f148390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f148391f;

    public o6(int i17, v65.n nVar, android.app.Activity activity, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f148389d = nVar;
        this.f148390e = activity;
        this.f148391f = h0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (valueOf != null && 40003 == valueOf.intValue()) {
            boolean z17 = false;
            if (valueOf2 != null && valueOf2.intValue() == -1 && intent != null && intent.getBooleanExtra("FinderLiveCashOutMultiAuthUIC.KEY_SUCCESS", false)) {
                z17 = true;
            }
            this.f148389d.a(java.lang.Boolean.valueOf(z17));
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.n6(this.f148390e, this.f148391f));
        }
    }
}
