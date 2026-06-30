package be1;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.z f19517e;

    public u(be1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f19517e = zVar;
        this.f19516d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.telephony.PhoneStateListener phoneStateListener;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.f19516d.getContext().getApplicationContext().getSystemService("phone");
            be1.x xVar = this.f19517e.f19545n;
            synchronized (xVar) {
                if (xVar.f19528a == null) {
                    xVar.f19528a = new be1.w(xVar);
                }
                phoneStateListener = xVar.f19528a;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(256);
            arrayList.add(phoneStateListener);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(telephonyManager, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetNetworkType", e17, "", new java.lang.Object[0]);
        }
    }
}
