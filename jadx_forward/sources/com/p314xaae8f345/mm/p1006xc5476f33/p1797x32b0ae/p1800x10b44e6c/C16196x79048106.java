package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c;

/* renamed from: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope */
/* loaded from: classes7.dex */
public class C16196x79048106 extends bd.d {

    /* renamed from: LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX */
    private static final java.lang.String f37381x1adc2b2f = "lite_app_module_gyroscope_session_id_";

    /* renamed from: LITE_APP_MODULE_GYROSCOPE_THREAD_NAME */
    private static final java.lang.String f37382xf44430a2 = "lite_app_module_gyroscope_thread";

    /* renamed from: SENSOR_DELAY_FASTEST */
    private static final int f37383x74b070e9 = 10;

    /* renamed from: SENSOR_DELAY_GAME */
    private static final int f37384x9dd876f3 = 20;

    /* renamed from: SENSOR_DELAY_NORMAL */
    private static final int f37385x965027a8 = 200;

    /* renamed from: SENSOR_DELAY_UI */
    private static final int f37386xc43a09d5 = 60;
    private static final java.lang.String TAG = "MicroMsg.LiteAppModuleGyroscope";

    /* renamed from: listenerStore */
    private static final java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl> f37388x230e148d = new java.util.HashMap();

    /* renamed from: THREAD_MAP */
    private static final java.util.HashMap<java.lang.String, android.os.HandlerThread> f37387xd65c4587 = new java.util.HashMap<>();

    /* renamed from: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope$SensorEventListenerImpl */
    /* loaded from: classes15.dex */
    public static class SensorEventListenerImpl implements android.hardware.SensorEventListener {

        /* renamed from: SENSOR_REFRESH_DATA_INTERVAL_SHORT */
        private static final int f37389xcd8ee30e = 5;

        /* renamed from: mCallback */
        private bd.e f37390x1ab9c7d2;

        /* renamed from: mLimiter */
        private final ra3.c f37391xa898087b = new ra3.c(5, new ra3.b() { // from class: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl.1
            @Override // ra3.b
            /* renamed from: onAction */
            public boolean mo65690x3a2454f5(java.lang.Object... objArr) {
                float[] fArr = (float[]) objArr[0];
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("x", java.lang.Float.valueOf(fArr[0]));
                hashMap.put("y", java.lang.Float.valueOf(fArr[1]));
                hashMap.put("z", java.lang.Float.valueOf(fArr[2]));
                org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl.this.f37390x1ab9c7d2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl.this.f37390x1ab9c7d2.a(jSONObject, true, false);
                }
                return true;
            }
        });

        /* renamed from: getCallback */
        public bd.e m65688x71965dbb() {
            return this.f37390x1ab9c7d2;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            ra3.b bVar;
            if (sensorEvent.sensor.getType() != 4) {
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.TAG, "gyroscope sensor callback data invalidate.");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.TAG, "onSensorChanged invoked, x:%f, y:%f, z:%f", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]), java.lang.Float.valueOf(fArr[2]));
            ra3.c cVar = this.f37391xa898087b;
            java.lang.Object[] objArr = {fArr};
            cVar.getClass();
            if ((java.lang.System.currentTimeMillis() - cVar.f475023a < 5) || (bVar = cVar.f475024b) == null || !bVar.mo65690x3a2454f5(objArr)) {
                return;
            }
            cVar.f475023a = java.lang.System.currentTimeMillis();
        }

        /* renamed from: setCallback */
        public void m65689x6c4ebec7(bd.e eVar) {
            this.f37390x1ab9c7d2 = eVar;
        }
    }

    /* renamed from: fetchSensorThread */
    private static android.os.HandlerThread m65681x15352e3e(java.lang.String str) {
        android.os.HandlerThread handlerThread;
        java.lang.String str2 = "MicroMsg.LiteAppModuleGyroscope." + str;
        java.util.HashMap<java.lang.String, android.os.HandlerThread> hashMap = f37387xd65c4587;
        synchronized (hashMap) {
            handlerThread = hashMap.get(str2);
            if (handlerThread == null) {
                int i17 = pu5.i.f440006b;
                handlerThread = pu5.f.a(str2, 5);
                hashMap.put(str2, handlerThread);
            }
        }
        if (handlerThread.getLooper() == null) {
            handlerThread.start();
        }
        return handlerThread;
    }

    /* renamed from: getSensorRefreshInterval */
    private int m65682x678edbf0(int i17) {
        if (i17 >= 0 && i17 <= 10) {
            return 0;
        }
        if (i17 <= 10 || i17 > 20) {
            return (i17 <= 20 || i17 > 60) ? 3 : 2;
        }
        return 1;
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: offGyroscopeChange */
    public boolean m65683xe78073a6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "offGyroscopeChange start ...");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl sensorEventListenerImpl = f37388x230e148d.get(f37381x1adc2b2f + m10168x71965dbb().f100730a);
        if (sensorEventListenerImpl == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no listener registered before, fail");
            return false;
        }
        if (sensorEventListenerImpl.m65688x71965dbb() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no js callback registered before, fail");
            return false;
        }
        sensorEventListenerImpl.m65689x6c4ebec7(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "offGyroscopeChange success ...");
        return true;
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: onGyroscopeChange */
    public void m65684x8ec72536() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onGyroscopeChange start ...");
        if (((android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor")) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get sensor manager fail");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl sensorEventListenerImpl = f37388x230e148d.get(f37381x1adc2b2f + m10168x71965dbb().f100730a);
        if (sensorEventListenerImpl == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no listener registered before, fail");
        } else {
            sensorEventListenerImpl.m65689x6c4ebec7(m10168x71965dbb());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onGyroscopeChange success ...");
        }
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: startGyroscope */
    public boolean m65685xfe4b96c3(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startGyroscope start ...");
        try {
            int i17 = jSONObject.getInt("interval");
            if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "illegal update interval, fail");
                return false;
            }
            java.lang.String str = f37381x1adc2b2f + m10168x71965dbb().f100730a;
            java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl> map = f37388x230e148d;
            if (map.get(str) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listener already exists, fail");
                return false;
            }
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            if (sensorManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get sensor manager fail");
                return false;
            }
            android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl sensorEventListenerImpl = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl();
            map.put(str, sensorEventListenerImpl);
            if (!sensorManager.registerListener(sensorEventListenerImpl, defaultSensor, m65682x678edbf0(i17), new android.os.Handler(m65681x15352e3e(f37382xf44430a2).getLooper()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listener register fail");
                sensorManager.unregisterListener(sensorEventListenerImpl);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startGyroscope success ...");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no interval args, error:" + e17);
            return false;
        }
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: stopGyroscope */
    public boolean m65686x9b826723() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stopGyroscope start ...");
        java.lang.String str = f37381x1adc2b2f + m10168x71965dbb().f100730a;
        java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl> map = f37388x230e148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.SensorEventListenerImpl sensorEventListenerImpl = map.get(str);
        if (sensorEventListenerImpl == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "no listener registered before, fail");
            return false;
        }
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get sensor manager fail");
            return false;
        }
        sensorManager.unregisterListener(sensorEventListenerImpl);
        map.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stopGyroscope success ...");
        return true;
    }
}
