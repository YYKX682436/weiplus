package com.tencent.mm.plugin.cdndownloader.service;

/* loaded from: classes8.dex */
public class CDNDownloadService extends android.app.Service implements vk0.a {

    /* renamed from: d, reason: collision with root package name */
    public static fv1.f f95514d;

    /* renamed from: e, reason: collision with root package name */
    public static final dn.k f95515e = new lv1.b();

    public CDNDownloadService() {
        new lv1.a(this);
    }

    public static void a(com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService cDNDownloadService, dn.m mVar, java.lang.String str) {
        cDNDownloadService.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            mVar.f241784J = new java.util.HashMap();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                ((java.util.HashMap) mVar.f241784J).put(next, jSONObject.optString(next));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadService", "addVerifyHeaders: " + e17.getMessage());
        }
    }

    public static void b(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        try {
            f95514d.L2(str, i17, i18, str2);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadService", "updateDownloadState: " + e17);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "onBind");
        throw new java.lang.RuntimeException("Access Error!");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "onDestroy");
        vk0.c.f437751a.c(this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 1L, 1L, false);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "onUnbind");
        return super.onUnbind(intent);
    }
}
