package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
/* loaded from: classes13.dex */
public final class AppBrandXWebDownloadProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f89491h;

    /* renamed from: d, reason: collision with root package name */
    public zx5.c f89492d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f89493e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f89494f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f89495g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate");
        com.tencent.mm.ui.v9.e(getWindow());
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.tencent.mm.xwebutil.y0.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, kill tools");
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
        com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        boolean l17 = com.tencent.xweb.a3.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, current status downloading:%b", java.lang.Boolean.valueOf(l17));
        if (!l17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), null, null, true, true, null);
            this.f89493e = Q;
            Q.setOnCancelListener(new com.tencent.mm.plugin.appbrand.ui.ac(this));
            if (this.f89492d == null) {
                this.f89492d = new com.tencent.mm.plugin.appbrand.ui.gc(this, null);
            }
            com.tencent.xweb.b3.f220215c = this.f89492d;
            by5.c4.f("XWebUpdater", "checkNeedDownload, start check runtime update");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "2");
            ((zx5.i0) zx5.n0.f477252a).e(org.xwalk.core.XWalkEnvironment.f347970c, hashMap);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, is foreground downloading");
        if (f89491h) {
            setResult(0, new android.content.Intent());
            finish();
            return;
        }
        if (this.f89492d == null) {
            this.f89492d = new com.tencent.mm.plugin.appbrand.ui.gc(this, null);
        }
        com.tencent.xweb.b3.f220215c = this.f89492d;
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onCreate, xweb is downloading, ignore duplicated request");
        com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(getContext(), getContext().getString(com.tencent.mm.R.string.f490573yv), getContext().getString(com.tencent.mm.R.string.f490345se), true, true, null);
        this.f89493e = Q2;
        if (Q2.getWindow() != null) {
            android.view.WindowManager.LayoutParams attributes = this.f89493e.getWindow().getAttributes();
            attributes.dimAmount = 0.0f;
            this.f89493e.getWindow().setAttributes(attributes);
        }
        this.f89493e.setOnCancelListener(new com.tencent.mm.plugin.appbrand.ui.yb(this));
        android.os.Handler handler = new android.os.Handler();
        this.f89494f = handler;
        com.tencent.mm.plugin.appbrand.ui.zb zbVar = new com.tencent.mm.plugin.appbrand.ui.zb(this);
        this.f89495g = zbVar;
        handler.postDelayed(zbVar, 20000L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.Runnable runnable;
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDestroy");
        this.f89492d = null;
        com.tencent.xweb.b3.f220215c = null;
        android.os.Handler handler = this.f89494f;
        if (handler != null && (runnable = this.f89495g) != null) {
            handler.removeCallbacks(runnable);
        }
        super.onDestroy();
    }
}
