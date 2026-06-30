package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public final class r8 implements com.tencent.mm.ui.mmfb.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBAuthUI f74158a;

    public r8(com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI, com.tencent.mm.plugin.account.ui.MMFBAuthUI.AnonymousClass1 anonymousClass1) {
        this.f74158a = mMFBAuthUI;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f74158a;
        mMFBAuthUI.f73446m = mMFBAuthUI.f73440d.f209213a;
        gm0.j1.u().c().w(65830, mMFBAuthUI.f73446m);
        if (mMFBAuthUI.f73440d.f209214b != 0) {
            gm0.j1.u().c().w(65832, java.lang.Long.valueOf(mMFBAuthUI.f73440d.f209214b));
        }
        mMFBAuthUI.V6();
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void c(com.tencent.mm.ui.mmfb.sdk.h hVar) {
        hVar.getMessage();
        java.lang.String message = hVar.getMessage();
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f74158a;
        db5.e1.s(mMFBAuthUI, message, mMFBAuthUI.getString(com.tencent.mm.R.string.bdd));
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.MMFBAuthUI.f73439q;
        mMFBAuthUI.W6(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 3L, 1L, false);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void d(com.tencent.mm.ui.mmfb.sdk.n nVar) {
        java.lang.String str = nVar.f209219e;
        java.lang.String message = nVar.getMessage();
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f74158a;
        db5.e1.s(mMFBAuthUI, message, mMFBAuthUI.getString(com.tencent.mm.R.string.bdd));
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.MMFBAuthUI.f73439q;
        mMFBAuthUI.W6(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 2L, 1L, false);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void onCancel() {
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.MMFBAuthUI.f73439q;
        this.f74158a.W6(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 4L, 1L, false);
    }
}
