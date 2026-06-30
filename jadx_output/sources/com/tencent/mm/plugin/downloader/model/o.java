package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public abstract class o {
    public static boolean a(java.lang.String str, java.lang.String str2, com.tencent.xweb.WebView webView) {
        java.util.List wi6;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.a0.c()) {
            return false;
        }
        java.lang.String str3 = null;
        try {
            wi6 = ((g60.e) ((h60.i) i95.n0.c(h60.i.class))).wi();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadChecker", "err: %s", e17.getMessage());
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(wi6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "raw check url: [ %s ], no regex to intercept", str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "raw check url: [ %s ], have (%d) regexes to intercept", str, java.lang.Integer.valueOf(wi6.size()));
        java.util.Iterator it = wi6.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str4).matcher(str.trim());
            if (matcher.find()) {
                str3 = matcher.group();
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "match the regex: %s", str4);
                break;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return false;
        }
        if (!((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(webView);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("download_url", str3);
            bundle.putString("main_url", webView.getUrl());
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, bundle, com.tencent.mm.plugin.downloader.model.n.class, new com.tencent.mm.plugin.downloader.model.j(weakReference, str));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "checkDownload isTeenMode and ignore downloadUrl: %s", str3);
        if (webView != null && webView.getContext() != null) {
            te0.e eVar = (te0.e) i95.n0.c(te0.e.class);
            android.content.Context context = webView.getContext();
            ((se0.e) eVar).getClass();
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        return true;
    }
}
