package com.tencent.mm.plugin.downloader.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class n implements com.tencent.mm.ipcinvoker.j {
    private n() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean = new com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean();
        if (bundle == null) {
            downloadChecker$DownloadInterceptBean.f96935d = false;
            if (rVar != null) {
                rVar.a(downloadChecker$DownloadInterceptBean);
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("download_url");
        java.lang.String string2 = bundle.getString("main_url");
        java.lang.String string3 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            downloadChecker$DownloadInterceptBean.f96935d = false;
            if (rVar != null) {
                rVar.a(downloadChecker$DownloadInterceptBean);
                return;
            }
            return;
        }
        c02.p pVar = new c02.p();
        pVar.f37615d = string;
        pVar.f37616e = string2;
        pVar.f37617f = string3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pVar;
        lVar.f70665b = new c02.q();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getdownloadinterceptinfo";
        lVar.f70667d = 2884;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.downloader.model.k(string, string2, string3, rVar), false);
    }
}
