package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f83028d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f83029a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f83030b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f83031c = null;

    public m0(java.lang.String str) {
        android.os.HandlerThread handlerThread;
        java.lang.String str2 = "MicroMsg.UnitSensor." + str;
        java.util.HashMap hashMap = f83028d;
        synchronized (hashMap) {
            handlerThread = (android.os.HandlerThread) hashMap.get(str2);
            if (handlerThread == null) {
                int i17 = pu5.i.f358473b;
                handlerThread = pu5.f.a(str2, 5);
                hashMap.put(str2, handlerThread);
            }
        }
        if (handlerThread.getLooper() == null) {
            handlerThread.start();
        }
        this.f83030b = new android.os.Handler(handlerThread.getLooper());
    }

    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 l0Var, java.lang.String str, java.util.List list) {
        java.lang.String appId = lVar.getAppId();
        this.f83031c = str;
        boolean optBoolean = jSONObject.optBoolean("enable");
        int optInt = jSONObject.optInt("interval", 200);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "sessionId:%s,interval:%s,enable:%b", str, java.lang.Integer.valueOf(optInt), java.lang.Boolean.valueOf(optBoolean));
        if (this.f83029a == null) {
            this.f83029a = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        }
        if (this.f83029a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "getSystemService(SENSOR_SERVICE) failed.");
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:null system service", new java.lang.Object[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.hardware.Sensor defaultSensor = this.f83029a.getDefaultSensor(((java.lang.Integer) it.next()).intValue());
            if (defaultSensor == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "get sensor failed.");
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:null sensor", new java.lang.Object[0]);
            }
            arrayList.add(defaultSensor);
        }
        if (!optBoolean) {
            c01.l2 e17 = c01.n2.d().e(str);
            if (e17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "unregister sensor event listener failed, keyValueSet do not exist.");
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:fail to disable, not enable?", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 l0Var2 = (com.tencent.mm.plugin.appbrand.jsapi.sensor.l0) e17.c("sensor_event_listener", null);
            if (l0Var2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "unregister sensor event listener failed, listener do not exist.");
                return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:fail to disable, not enable?", new java.lang.Object[0]);
            }
            this.f83029a.unregisterListener(l0Var2);
            com.tencent.mm.plugin.appbrand.x0.e(appId, l0Var2);
            l0Var2.h(true);
            e17.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "unregister sensor finished(%s).", str);
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("ok", new java.lang.Object[0]);
        }
        c01.l2 b17 = c01.n2.d().b(str);
        if (b17 == null) {
            b17 = c01.n2.d().c(str, true);
        }
        if (((com.tencent.mm.plugin.appbrand.jsapi.sensor.l0) b17.c("sensor_event_listener", null)) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UnitSensor", "register failed, sensorEventListener has already registered.");
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail, has enable, should stop pre operation", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.x0.a(appId, l0Var);
        b17.i("sensor_event_listener", l0Var);
        java.util.Iterator it6 = arrayList.iterator();
        boolean z17 = false;
        while (it6.hasNext()) {
            z17 = this.f83029a.registerListener(l0Var, (android.hardware.Sensor) it6.next(), optInt != 0 ? optInt != 20 ? optInt != 60 ? 3 : 2 : 1 : 0, this.f83030b);
            if (!z17) {
                break;
            }
        }
        if (!z17) {
            this.f83029a.unregisterListener(l0Var);
            l0Var.h(true);
            com.tencent.mm.plugin.appbrand.x0.e(appId, l0Var);
            b17.h();
            c01.n2.d().e(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UnitSensor", "register sensor finished(s : %s, r : %s).", str, java.lang.Boolean.valueOf(z17));
        return new com.tencent.mm.plugin.appbrand.jsapi.file.b0(z17 ? "ok" : "fail:system error", new java.lang.Object[0]);
    }

    public void b(com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 l0Var) {
        this.f83029a.unregisterListener(l0Var);
        if (android.text.TextUtils.isEmpty(this.f83031c)) {
            return;
        }
        c01.n2.d().e(this.f83031c);
    }
}
