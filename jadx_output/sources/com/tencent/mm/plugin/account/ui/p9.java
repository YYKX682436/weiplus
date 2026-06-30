package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class p9 implements com.tencent.mm.ui.mmfb.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f74111a;

    public p9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI, com.tencent.mm.plugin.account.ui.MMFBLoginUI.AnonymousClass1 anonymousClass1) {
        this.f74111a = mMFBLoginUI;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74111a;
        mMFBLoginUI.f73461e = mMFBLoginUI.f73460d.f209213a;
        if (mMFBLoginUI.isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mMFBLoginUI, mMFBLoginUI.getString(com.tencent.mm.R.string.f490573yv), mMFBLoginUI.getString(com.tencent.mm.R.string.gic), true, true, null);
        mMFBLoginUI.f73462f = Q;
        Q.setOnCancelListener(mMFBLoginUI.f73463g);
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "dkwt Ready to Facebook auth user[%s] token[%d][%s]", "facebook@wechat_auth", java.lang.Integer.valueOf(mMFBLoginUI.f73461e.length()), mMFBLoginUI.f73461e.substring(0, 4));
        mMFBLoginUI.f73464h = new com.tencent.mm.modelsimple.v0("facebook@wechat_auth", mMFBLoginUI.f73461e, 0, "", "", "", 0, "", true, false);
        gm0.j1.d().g(mMFBLoginUI.f73464h);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void c(com.tencent.mm.ui.mmfb.sdk.h hVar) {
        hVar.getMessage();
        java.lang.String message = hVar.getMessage();
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74111a;
        db5.e1.s(mMFBLoginUI, message, mMFBLoginUI.getString(com.tencent.mm.R.string.c88));
        com.tencent.mm.plugin.account.ui.MMFBLoginUI.V6(mMFBLoginUI, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(mMFBLoginUI.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 8L, 1L, false);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void d(com.tencent.mm.ui.mmfb.sdk.n nVar) {
        nVar.getMessage();
        java.lang.String message = nVar.getMessage();
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74111a;
        db5.e1.s(mMFBLoginUI, message, mMFBLoginUI.getString(com.tencent.mm.R.string.c88));
        com.tencent.mm.plugin.account.ui.MMFBLoginUI.V6(mMFBLoginUI, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(mMFBLoginUI.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 7L, 1L, false);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void onCancel() {
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74111a;
        com.tencent.mm.plugin.account.ui.MMFBLoginUI.V6(mMFBLoginUI, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(mMFBLoginUI.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 9L, 1L, false);
    }
}
