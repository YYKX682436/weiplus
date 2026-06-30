package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class bc extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f109703a;

    public bc(java.lang.ref.WeakReference rLicenseUI) {
        kotlin.jvm.internal.o.g(rLicenseUI, "rLicenseUI");
        this.f109703a = rLicenseUI;
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI;
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "load web progress:" + i17);
        }
        if (i17 != 100 || (finderLivePrecheckLicenseUI = (com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI) this.f109703a.get()) == null) {
            return;
        }
        if (kotlin.jvm.internal.o.b(finderLivePrecheckLicenseUI.B, "TYPE_STANDARD") && finderLivePrecheckLicenseUI.E) {
            finderLivePrecheckLicenseUI.D = 0;
            finderLivePrecheckLicenseUI.f7();
            android.widget.Button button = finderLivePrecheckLicenseUI.f109405x;
            if (button != null) {
                button.setEnabled(true);
            }
        } else {
            com.tencent.mm.sdk.platformtools.b4 b4Var = finderLivePrecheckLicenseUI.H;
            b4Var.d();
            finderLivePrecheckLicenseUI.D = 5;
            b4Var.c(1000L, 1000L);
            android.widget.Button button2 = finderLivePrecheckLicenseUI.f109405x;
            if (button2 != null) {
                button2.setEnabled(false);
            }
        }
        az2.f fVar = finderLivePrecheckLicenseUI.f109406y;
        if (fVar != null) {
            fVar.b();
        }
        finderLivePrecheckLicenseUI.f109406y = null;
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = (com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI) this.f109703a.get();
        if (finderLivePrecheckLicenseUI == null) {
            com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "licenseUI is null!");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "onReceivedTitle title:" + str);
        if ((str == null || str.length() == 0) || kotlin.jvm.internal.o.b(finderLivePrecheckLicenseUI.C, str)) {
            return;
        }
        ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
        if (com.tencent.mm.plugin.webview.luggage.util.g.d(str) || r26.i0.y(str, "about:blank", false)) {
            return;
        }
        finderLivePrecheckLicenseUI.setMMTitle(str);
    }
}
