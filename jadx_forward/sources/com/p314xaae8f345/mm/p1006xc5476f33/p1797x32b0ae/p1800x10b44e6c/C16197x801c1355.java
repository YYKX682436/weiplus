package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c;

/* renamed from: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion */
/* loaded from: classes7.dex */
public class C16197x801c1355 extends bd.d {

    /* renamed from: LITE_APP_MODULE_MOTION_THREAD_NAME */
    private static final java.lang.String f37393x2e38c8bb = "lite_app_module_motion_thread";
    private static final java.lang.String TAG = "MicroMsg.LiteAppModuleMotion";

    /* renamed from: THREAD_MAP */
    private static final java.util.HashMap<java.lang.String, android.os.HandlerThread> f37394xd65c4587 = new java.util.HashMap<>();

    /* renamed from: listenerStore */
    private static final java.util.HashMap<java.lang.Long, android.hardware.SensorEventListener> f37395x230e148d = new java.util.HashMap<>();

    /* renamed from: fetchSensorThread */
    private static android.os.HandlerThread m65692x15352e3e(java.lang.String str) {
        android.os.HandlerThread handlerThread;
        java.lang.String str2 = "MicroMsg.LiteAppModuleMotion." + str;
        java.util.HashMap<java.lang.String, android.os.HandlerThread> hashMap = f37394xd65c4587;
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

    /* renamed from: getUpdateInterval */
    private int m65693x447575a4(int i17) {
        if (i17 >= 0 && i17 <= 0) {
            return 0;
        }
        if (i17 <= 0 || i17 > 1) {
            return (i17 <= 1 || i17 > 2) ? 3 : 2;
        }
        return 1;
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: offDeviceOrientationChange */
    public void m65694xd3af7b() {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get sensor manager fail");
            return;
        }
        android.hardware.SensorEventListener sensorEventListener = f37395x230e148d.get(java.lang.Long.valueOf(m10168x71965dbb().f100730a));
        if (sensorEventListener == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "listener already stopped");
        } else {
            sensorManager.unregisterListener(sensorEventListener);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: onDeviceOrientationChange */
    public void m65695xb957d10b(org.json.JSONObject jSONObject) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        if (sensorManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get sensor manager fail");
            return;
        }
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "sensor not supported");
            return;
        }
        android.hardware.SensorEventListener sensorEventListener = new android.hardware.SensorEventListener() { // from class: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
                if (sensorEvent.sensor.getType() == 11) {
                    float[] fArr = new float[16];
                    android.hardware.SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                    float[] fArr2 = new float[3];
                    android.hardware.SensorManager.getOrientation(fArr, fArr2);
                    float f17 = -fArr2[1];
                    float f18 = -fArr2[0];
                    float f19 = fArr2[2];
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16197x801c1355.TAG, "Pitch: " + f17 + ", Yaw: " + f18 + ", Roll: " + f19);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("pitch", f17);
                        jSONObject2.put("yaw", f18);
                        jSONObject2.put("roll", f19);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16197x801c1355.this.m10168x71965dbb().a(jSONObject2, true, false);
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
        };
        sensorManager.registerListener(sensorEventListener, defaultSensor, m65693x447575a4(jSONObject.optInt("interval")), new android.os.Handler(m65692x15352e3e(f37393x2e38c8bb).getLooper()));
        f37395x230e148d.put(java.lang.Long.valueOf(m10168x71965dbb().f100730a), sensorEventListener);
    }
}
