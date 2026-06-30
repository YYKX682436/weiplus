package com.tencent.mm.feature.finder.live;

/* loaded from: classes5.dex */
public final class q6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f66877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f66878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66879f;

    public q6(int i17, v65.n nVar, android.app.Activity activity, kotlin.jvm.internal.h0 h0Var) {
        this.f66877d = nVar;
        this.f66878e = activity;
        this.f66879f = h0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
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
            this.f66877d.a(str);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.feature.finder.live.p6(this.f66878e, this.f66879f));
        }
    }
}
