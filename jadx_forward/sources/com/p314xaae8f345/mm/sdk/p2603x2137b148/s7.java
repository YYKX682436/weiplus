package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class s7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f274504a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.r7 f274505b;

    public s7(android.content.Context context) {
        this.f274504a = (android.hardware.SensorManager) context.getSystemService("sensor");
    }

    public boolean a(java.lang.Runnable runnable) {
        java.util.List<android.hardware.Sensor> sensorList;
        android.hardware.SensorManager sensorManager = this.f274504a;
        if (sensorManager == null || (sensorList = sensorManager.getSensorList(1)) == null || sensorList.size() <= 0) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r7 r7Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r7(runnable);
        this.f274505b = r7Var;
        sensorManager.registerListener(r7Var, 2, 3);
        return true;
    }

    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r7 r7Var;
        android.hardware.SensorManager sensorManager = this.f274504a;
        if (sensorManager == null || (r7Var = this.f274505b) == null) {
            return;
        }
        sensorManager.unregisterListener(r7Var, 2);
    }
}
