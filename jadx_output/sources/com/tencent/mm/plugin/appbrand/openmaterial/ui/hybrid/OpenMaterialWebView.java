package com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid;

/* loaded from: classes8.dex */
public class OpenMaterialWebView extends com.tencent.mm.ui.widget.MMWebView {
    public android.content.Context G;

    public OpenMaterialWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = context;
        I0();
    }

    public final void I0() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AppBrand.OpenMaterialWebView", "init OpenMaterialWebView", new java.lang.Object[0]);
        if (fp.h.c(19)) {
            return;
        }
        try {
            java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
            if (a17 instanceof java.lang.Thread) {
                java.lang.Thread thread = (java.lang.Thread) a17;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                if (thread.getState() == java.lang.Thread.State.WAITING) {
                    thread.interrupt();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenMaterialWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
        }
    }

    public void J0(com.tencent.xweb.s0 s0Var, com.tencent.xweb.h1 h1Var) {
        getSettings().z(true);
        getSettings().E(true);
        getSettings().r(false);
        getSettings().I(true);
        getSettings().J(0);
        com.tencent.xweb.z0 settings = getSettings();
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        android.content.Context context = getContext();
        java.lang.String g17 = getSettings().g();
        ((yg0.s4) q3Var).getClass();
        settings.Q(com.tencent.mm.pluginsdk.ui.tools.e9.b(context, g17));
        getSettings().P(true);
        getSettings().G(true);
        getSettings().M(false);
        getSettings().L(false);
        getSettings().C(true);
        getSettings().D(true);
        getSettings().J(0);
        getSettings().l(10485760L);
        getSettings().m(this.G.getDir("webviewcache", 0).getAbsolutePath());
        getSettings().k(true);
        getSettings().t(true);
        getSettings().u(lp0.b.X() + "databases/");
        getSettings().h(true);
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(this, true);
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(true);
        setConfigCallback((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window"));
        super.setWebChromeClient(s0Var);
        super.setWebViewClient(h1Var);
        setBackgroundColor(-1);
        G0();
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f
    public void destroy() {
        this.G = null;
        super.setWebChromeClient(null);
        super.setWebViewClient(null);
        super.destroy();
    }

    public void setConfigCallback(android.view.WindowManager windowManager) {
        try {
            java.lang.reflect.Field declaredField = com.tencent.xweb.WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            if (obj == null) {
                return;
            }
            java.lang.reflect.Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, windowManager);
        } catch (java.lang.Exception unused) {
        }
    }

    public OpenMaterialWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = context;
        I0();
    }

    public OpenMaterialWebView(android.content.Context context) {
        super(context, null);
        this.G = context;
        I0();
    }
}
