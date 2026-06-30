package com.tencent.mm.plugin.cdndownloader.service;

/* loaded from: classes8.dex */
public class CDNDownloadServiceSlot extends android.app.Service implements vk0.a {

    /* renamed from: e, reason: collision with root package name */
    public static fv1.f f95516e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f95517f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f95518g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final dn.k f95519h;

    /* renamed from: i, reason: collision with root package name */
    public static final lv1.e f95520i;

    /* renamed from: d, reason: collision with root package name */
    public final fv1.b f95521d = new lv1.c(this);

    static {
        lv1.d dVar = new lv1.d();
        f95519h = dVar;
        f95520i = new lv1.e(dVar);
    }

    public static void a(com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot cDNDownloadServiceSlot, dn.m mVar, java.lang.String str) {
        cDNDownloadServiceSlot.getClass();
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
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "addVerifyHeaders: " + e17.getMessage());
        }
    }

    public static void b(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        try {
            f95516e.L2(str, i17, i18, str2);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState: " + e17);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "onBind");
        return this.f95521d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "onCreate");
        hv1.d.f().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "onDestroy");
        vk0.c.f437751a.c(this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 1L, 1L, false);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "onUnbind");
        return super.onUnbind(intent);
    }
}
