package be1;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.z f101050e;

    public u(be1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f101050e = zVar;
        this.f101049d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.telephony.PhoneStateListener phoneStateListener;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.f101049d.mo50352x76847179().getApplicationContext().getSystemService("phone");
            be1.x xVar = this.f101050e.f101078n;
            synchronized (xVar) {
                if (xVar.f101061a == null) {
                    xVar.f101061a = new be1.w(xVar);
                }
                phoneStateListener = xVar.f101061a;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(256);
            arrayList.add(phoneStateListener);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(telephonyManager, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetNetworkType", e17, "", new java.lang.Object[0]);
        }
    }
}
