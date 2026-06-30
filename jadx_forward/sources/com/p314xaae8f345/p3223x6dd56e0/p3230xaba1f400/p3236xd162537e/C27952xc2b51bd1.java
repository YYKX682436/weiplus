package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker */
/* loaded from: classes14.dex */
public class C27952xc2b51bd1 {
    private static final java.lang.String TAG = "MicroMsg.LightSensor";

    /* renamed from: mHasStarted */
    private boolean f62557xe440fcd4;

    /* renamed from: mLightSensorListener */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.LightSensorListener f62558xe96d9397;

    /* renamed from: mOnGetValue */
    private com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.OnGetValue f62559xf6965307;

    /* renamed from: mSensorManager */
    private android.hardware.SensorManager f62560x61369726;

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker$LightSensorListener */
    /* loaded from: classes14.dex */
    public class LightSensorListener implements android.hardware.SensorEventListener {
        private float lux;

        private LightSensorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                this.lux = sensorEvent.values[0];
                if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.this.f62559xf6965307 != null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.this.f62559xf6965307.mo121071x1a645aba(this.lux);
                }
            }
        }
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker$OnGetValue */
    /* loaded from: classes14.dex */
    public interface OnGetValue {
        /* renamed from: onGetValue */
        void mo121071x1a645aba(float f17);
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker$Singleton */
    /* loaded from: classes14.dex */
    public static class Singleton {

        /* renamed from: instance */
        private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1 f62562x21169495 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1();

        private Singleton() {
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1 m121190x9cf0d20b() {
        return com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.Singleton.f62562x21169495;
    }

    /* renamed from: getLux */
    public float m121191xb58854d9() {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.LightSensorListener lightSensorListener = this.f62558xe96d9397;
        if (lightSensorListener == null) {
            return -1.0f;
        }
        float unused = lightSensorListener.lux;
        return this.f62558xe96d9397.lux;
    }

    /* renamed from: start */
    public int m121192x68ac462(android.content.Context context, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.OnGetValue onGetValue) {
        if (this.f62557xe440fcd4) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[SensorManagerWorker.start] light sensor has started");
            return 2;
        }
        this.f62557xe440fcd4 = true;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getApplicationContext().getSystemService("sensor");
        this.f62560x61369726 = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[SensorManagerWorker.start] System do not have lightSensor");
            return 1;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.LightSensorListener lightSensorListener = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.LightSensorListener();
        this.f62558xe96d9397 = lightSensorListener;
        this.f62560x61369726.registerListener(lightSensorListener, defaultSensor, 3);
        this.f62559xf6965307 = onGetValue;
        return 0;
    }

    /* renamed from: stop */
    public void m121193x360802() {
        android.hardware.SensorManager sensorManager;
        if (!this.f62557xe440fcd4 || (sensorManager = this.f62560x61369726) == null) {
            return;
        }
        this.f62557xe440fcd4 = false;
        sensorManager.unregisterListener(this.f62558xe96d9397);
    }

    private C27952xc2b51bd1() {
        this.f62557xe440fcd4 = false;
    }
}
