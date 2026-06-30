package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class i extends android.hardware.SensorManager.DynamicSensorCallback {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f149120a = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.h.f149111d);

    @Override // android.hardware.SensorManager.DynamicSensorCallback
    public void onDynamicSensorConnected(android.hardware.Sensor sensor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensor, "sensor");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower());
        ap.a.a(1, "statSensor", null, null, "sensorDynamic-1", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
        ((java.util.Map) this.f149120a.mo141623x754a37bb()).put(java.lang.Integer.valueOf(sensor.getType()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // android.hardware.SensorManager.DynamicSensorCallback
    public void onDynamicSensorDisconnected(android.hardware.Sensor sensor) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensor, "sensor");
        jz5.g gVar = this.f149120a;
        java.lang.Long l17 = (java.lang.Long) ((java.util.Map) gVar.mo141623x754a37bb()).get(java.lang.Integer.valueOf(sensor.getType()));
        if (l17 != null) {
            if (!(l17.longValue() > 0)) {
                l17 = null;
            }
            if (l17 != null) {
                j17 = java.lang.System.currentTimeMillis() - l17.longValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower() + ",durationMs=" + j17);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("deltaMin", java.lang.Long.valueOf(j17 / ((long) com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8)));
                ap.a.a(1, "statSensor", null, linkedHashMap, "sensorDynamic-0", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
                ((java.util.Map) gVar.mo141623x754a37bb()).put(java.lang.Integer.valueOf(sensor.getType()), 0L);
            }
        }
        j17 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower() + ",durationMs=" + j17);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("deltaMin", java.lang.Long.valueOf(j17 / ((long) com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8)));
        ap.a.a(1, "statSensor", null, linkedHashMap2, "sensorDynamic-0", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
        ((java.util.Map) gVar.mo141623x754a37bb()).put(java.lang.Integer.valueOf(sensor.getType()), 0L);
    }
}
