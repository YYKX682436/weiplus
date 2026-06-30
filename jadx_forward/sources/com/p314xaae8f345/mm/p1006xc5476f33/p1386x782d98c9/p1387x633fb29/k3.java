package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes.dex */
public class k3 implements java.lang.Runnable {
    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3 l3Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean hasSystemFeature = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        boolean hasSystemFeature2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        if (hasSystemFeature && hasSystemFeature2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(11891, "3", true, true);
        } else if (hasSystemFeature) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(11891, "1", true, true);
        } else if (hasSystemFeature2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(11891, "2", true, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] deviceFeatures stepCounter %s, stepDetector %s", java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(hasSystemFeature2));
    }
}
