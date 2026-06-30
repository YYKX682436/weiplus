package com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5;

/* renamed from: com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot */
/* loaded from: classes8.dex */
public class ServiceC13094x9254a35e extends android.app.Service implements vk0.a {

    /* renamed from: e, reason: collision with root package name */
    public static fv1.f f177049e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f177050f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f177051g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final dn.k f177052h;

    /* renamed from: i, reason: collision with root package name */
    public static final lv1.e f177053i;

    /* renamed from: d, reason: collision with root package name */
    public final fv1.b f177054d = new lv1.c(this);

    static {
        lv1.d dVar = new lv1.d();
        f177052h = dVar;
        f177053i = new lv1.e(dVar);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e serviceC13094x9254a35e, dn.m mVar, java.lang.String str) {
        serviceC13094x9254a35e.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            mVar.f323317J = new java.util.HashMap();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                ((java.util.HashMap) mVar.f323317J).put(next, jSONObject.optString(next));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "addVerifyHeaders: " + e17.getMessage());
        }
    }

    public static void b(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        try {
            f177049e.L2(str, i17, i18, str2);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState: " + e17);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "onBind");
        return this.f177054d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "onCreate");
        hv1.d.f().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "onDestroy");
        vk0.c.f519284a.c(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 1L, 1L, false);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "onUnbind");
        return super.onUnbind(intent);
    }
}
