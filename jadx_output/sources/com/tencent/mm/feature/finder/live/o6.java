package com.tencent.mm.feature.finder.live;

/* loaded from: classes5.dex */
public final class o6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f66856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f66857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66858f;

    public o6(int i17, v65.n nVar, android.app.Activity activity, kotlin.jvm.internal.h0 h0Var) {
        this.f66856d = nVar;
        this.f66857e = activity;
        this.f66858f = h0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (valueOf != null && 40003 == valueOf.intValue()) {
            boolean z17 = false;
            if (valueOf2 != null && valueOf2.intValue() == -1 && intent != null && intent.getBooleanExtra("FinderLiveCashOutMultiAuthUIC.KEY_SUCCESS", false)) {
                z17 = true;
            }
            this.f66856d.a(java.lang.Boolean.valueOf(z17));
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.feature.finder.live.n6(this.f66857e, this.f66858f));
        }
    }
}
