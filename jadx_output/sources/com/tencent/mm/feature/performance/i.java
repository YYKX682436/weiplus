package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class i extends android.hardware.SensorManager.DynamicSensorCallback {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f67587a = jz5.h.a(jz5.i.f302829d, com.tencent.mm.feature.performance.h.f67578d);

    @Override // android.hardware.SensorManager.DynamicSensorCallback
    public void onDynamicSensorConnected(android.hardware.Sensor sensor) {
        kotlin.jvm.internal.o.g(sensor, "sensor");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower());
        ap.a.a(1, "statSensor", null, null, "sensorDynamic-1", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
        ((java.util.Map) this.f67587a.getValue()).put(java.lang.Integer.valueOf(sensor.getType()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // android.hardware.SensorManager.DynamicSensorCallback
    public void onDynamicSensorDisconnected(android.hardware.Sensor sensor) {
        long j17;
        kotlin.jvm.internal.o.g(sensor, "sensor");
        jz5.g gVar = this.f67587a;
        java.lang.Long l17 = (java.lang.Long) ((java.util.Map) gVar.getValue()).get(java.lang.Integer.valueOf(sensor.getType()));
        if (l17 != null) {
            if (!(l17.longValue() > 0)) {
                l17 = null;
            }
            if (l17 != null) {
                j17 = java.lang.System.currentTimeMillis() - l17.longValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower() + ",durationMs=" + j17);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("deltaMin", java.lang.Long.valueOf(j17 / ((long) com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)));
                ap.a.a(1, "statSensor", null, linkedHashMap, "sensorDynamic-0", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
                ((java.util.Map) gVar.getValue()).put(java.lang.Integer.valueOf(sensor.getType()), 0L);
            }
        }
        j17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryMonitorService", "onDynamicSensorConnected: type=" + sensor.getType() + '/' + sensor.getStringType() + ", name=" + sensor.getName() + ", power=" + sensor.getPower() + ",durationMs=" + j17);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("deltaMin", java.lang.Long.valueOf(j17 / ((long) com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)));
        ap.a.a(1, "statSensor", null, linkedHashMap2, "sensorDynamic-0", java.lang.String.valueOf(sensor.getType()), sensor.getStringType(), sensor.getName());
        ((java.util.Map) gVar.getValue()).put(java.lang.Integer.valueOf(sensor.getType()), 0L);
    }
}
