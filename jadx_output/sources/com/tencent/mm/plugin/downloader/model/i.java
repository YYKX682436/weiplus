package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean f97050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.j f97051e;

    public i(com.tencent.mm.plugin.downloader.model.j jVar, com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean) {
        this.f97051e = jVar;
        this.f97050d = downloadChecker$DownloadInterceptBean;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.xweb.WebView webView;
        java.lang.ref.WeakReference weakReference = this.f97051e.f97055d;
        android.content.Context context = null;
        if (weakReference == null || weakReference.get() == null) {
            webView = null;
        } else {
            webView = (com.tencent.xweb.WebView) this.f97051e.f97055d.get();
            if (webView != null) {
                context = webView.getContext();
            }
        }
        com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean = this.f97050d;
        if (downloadChecker$DownloadInterceptBean == null || !downloadChecker$DownloadInterceptBean.f96935d) {
            if (webView != null) {
                webView.loadUrl(this.f97051e.f97056e);
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "reload apk");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "confirm type: %d", java.lang.Integer.valueOf(downloadChecker$DownloadInterceptBean.f96936e));
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean2 = this.f97050d;
        int i17 = downloadChecker$DownloadInterceptBean2.f96936e;
        if (i17 == 0) {
            if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                dp.a.makeText(context3, context3.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "startDownload fail, network not ready");
                return;
            } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || !(context2 instanceof com.tencent.mm.ui.MMActivity) || ((com.tencent.mm.ui.MMActivity) context2).isFinishing()) {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, this.f97050d, com.tencent.mm.plugin.downloader.model.m.class, new com.tencent.mm.plugin.downloader.model.d(this));
                return;
            } else {
                db5.e1.D(context2, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.l5x), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.l5y), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.l5q), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.downloader.model.g(this), new com.tencent.mm.plugin.downloader.model.h(this), com.tencent.mm.R.color.aaq);
                return;
            }
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "coonfirm url: %s", downloadChecker$DownloadInterceptBean2.f96937f);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context2, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
        intent.putExtra("task_name", this.f97050d.f96939h);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f97050d.f96939h);
        intent.putExtra("thumb_url", this.f97050d.f96940i);
        intent.putExtra("task_url", this.f97050d.f96941m);
        intent.putExtra("alternative_url", this.f97050d.f96942n);
        intent.putExtra("task_size", this.f97050d.f96943o);
        intent.putExtra("file_md5", this.f97050d.f96945q);
        intent.putExtra("fileType", 1);
        intent.putExtra("appid", this.f97050d.f96938g);
        intent.putExtra("package_name", this.f97050d.f96944p);
        if (webView != null) {
            intent.putExtra("page_url", webView.getUrl());
        }
        intent.putExtra("page_scene", -1);
        intent.putExtra("task_scene", 8070);
        intent.addFlags(268435456);
        android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context4.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context4, "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
