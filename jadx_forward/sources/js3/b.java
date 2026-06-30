package js3;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            java.lang.String string = bundle.getString("download_url", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadMailApkTask", "download, url %s, md5 %s", string, bundle.getString("download_md5", ""));
            java.net.URL url = new java.net.URL(string);
            new java.net.URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
        } catch (java.lang.Exception e17) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadMailApkTask", "dz[download qq mail error:%s]", e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DownloadMailApkTask", e17, "", new java.lang.Object[0]);
        }
    }
}
