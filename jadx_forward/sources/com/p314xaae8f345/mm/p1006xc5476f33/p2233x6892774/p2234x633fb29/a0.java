package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public final class a0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public long f253304d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f253305e;

    public a0(android.hardware.SensorEventListener originListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originListener, "originListener");
        this.f253305e = new java.lang.ref.WeakReference(originListener);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        android.hardware.SensorEventListener sensorEventListener = (android.hardware.SensorEventListener) this.f253305e.get();
        if (sensorEventListener != null) {
            sensorEventListener.onAccuracyChanged(sensor, i17);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        android.hardware.SensorEventListener sensorEventListener = (android.hardware.SensorEventListener) this.f253305e.get();
        if (sensorEventListener != null) {
            sensorEventListener.onSensorChanged(sensorEvent);
        }
        android.hardware.Sensor sensor = sensorEvent != null ? sensorEvent.sensor : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSensorChanged: type=");
        sb6.append(sensor != null ? java.lang.Integer.valueOf(sensor.getType()) : null);
        sb6.append('/');
        sb6.append(sensor != null ? sensor.getStringType() : null);
        sb6.append(", name=");
        sb6.append(sensor != null ? sensor.getName() : null);
        sb6.append(", power=");
        sb6.append(sensor != null ? java.lang.Float.valueOf(sensor.getPower()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportSensorListener", sb6.toString());
        if (mm.o.j(false, 1, null)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f253304d);
            if (!(valueOf.longValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.longValue();
                linkedHashMap.put("delta-millis", java.lang.Long.valueOf(currentTimeMillis - this.f253304d));
            }
            if (mm.o.k(100)) {
                java.lang.Throwable th6 = new java.lang.Throwable();
                java.lang.String[] strArr = new java.lang.String[2];
                strArr[0] = "sensorChanged";
                strArr[1] = sensorEvent != null ? sensorEvent.toString() : null;
                ap.a.a(1, "statSensor", th6, linkedHashMap, strArr);
            }
            this.f253304d = currentTimeMillis;
        }
    }
}
