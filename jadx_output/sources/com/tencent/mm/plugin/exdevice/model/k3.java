package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class k3 implements java.lang.Runnable {
    public k3(com.tencent.mm.plugin.exdevice.model.l3 l3Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean hasSystemFeature = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        boolean hasSystemFeature2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        if (hasSystemFeature && hasSystemFeature2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.f(11891, "3", true, true);
        } else if (hasSystemFeature) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.f(11891, "1", true, true);
        } else if (hasSystemFeature2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.f(11891, "2", true, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] deviceFeatures stepCounter %s, stepDetector %s", java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(hasSystemFeature2));
    }
}
