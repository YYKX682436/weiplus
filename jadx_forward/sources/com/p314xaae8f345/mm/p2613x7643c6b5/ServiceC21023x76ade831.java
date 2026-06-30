package com.p314xaae8f345.mm.p2613x7643c6b5;

/* renamed from: com.tencent.mm.service.CommonProcessService */
/* loaded from: classes12.dex */
public class ServiceC21023x76ade831 extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f274731g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f274732h;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f274733d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f274734e;

    /* renamed from: f, reason: collision with root package name */
    public final l85.l0 f274735f = new l85.a(this);

    public static void a(com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831, java.lang.Boolean bool, java.lang.Runnable runnable) {
        serviceC21023x76ade831.getClass();
        if (!bool.booleanValue()) {
            serviceC21023x76ade831.f274733d.post(runnable);
            return;
        }
        if (serviceC21023x76ade831.f274734e == null) {
            synchronized (serviceC21023x76ade831) {
                if (serviceC21023x76ade831.f274734e == null) {
                    int i17 = pu5.i.f440006b;
                    android.os.HandlerThread a17 = pu5.f.a("push-worker", 5);
                    a17.start();
                    serviceC21023x76ade831.f274734e = new android.os.Handler(a17.getLooper());
                }
            }
        }
        serviceC21023x76ade831.f274734e.post(runnable);
    }

    public static com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 b(com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831, java.lang.String str) {
        serviceC21023x76ade831.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f274731g;
        com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 abstractC21025xb0cc40f5 = (com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5) concurrentHashMap.get(str);
        if (abstractC21025xb0cc40f5 != null) {
            return abstractC21025xb0cc40f5;
        }
        com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 abstractC21025xb0cc40f52 = (com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5) java.lang.Class.forName(str).newInstance();
        abstractC21025xb0cc40f52.f274738e = concurrentHashMap;
        abstractC21025xb0cc40f52.f274739f = serviceC21023x76ade831;
        concurrentHashMap.put(str, abstractC21025xb0cc40f52);
        return abstractC21025xb0cc40f52;
    }

    public java.lang.String c() {
        return "MicroMsg.MMProcessService";
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onBind()");
        l85.j1.a(intent);
        return this.f274735f;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onCreate()");
        java.lang.System.currentTimeMillis();
        this.f274733d = new android.os.Handler();
        super.onCreate();
        f274732h = new java.lang.ref.WeakReference(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onDestroy()");
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onRebind()");
        l85.j1.a(intent);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onStart()");
        l85.j1.a(intent);
        super.onStart(intent, i17);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onStartCommand()");
        l85.j1.a(intent);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onUnbind()");
        return super.onUnbind(intent);
    }
}
