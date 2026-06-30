package za4;

/* loaded from: classes4.dex */
public class e extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.k f552609a;

    public e(za4.k kVar, za4.b bVar) {
        this.f552609a = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
        if (intent != null) {
            java.lang.String action = intent.getAction();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, action=" + action);
            boolean equals = "android.intent.action.PACKAGE_ADDED".equals(action);
            za4.k kVar = this.f552609a;
            if (equals) {
                java.lang.String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(schemeSpecificPart) || !za4.k.a(kVar).containsKey(schemeSpecificPart)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart);
                } else {
                    ((za4.h) za4.k.a(kVar).remove(schemeSpecificPart)).b(schemeSpecificPart);
                }
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                java.lang.String schemeSpecificPart2 = intent.getData().getSchemeSpecificPart();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(schemeSpecificPart2) || !za4.k.a(kVar).containsKey(schemeSpecificPart2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart2);
                } else {
                    ((za4.h) za4.k.a(kVar).remove(schemeSpecificPart2)).a(schemeSpecificPart2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
    }
}
