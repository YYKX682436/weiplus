package com.tencent.mm.plugin.exdevice.service;

/* loaded from: classes12.dex */
public class ExDeviceService extends com.tencent.mm.service.MMService {

    /* renamed from: i, reason: collision with root package name */
    public u32.z f99141i = null;

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.exdevice.ExDeviceService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onBind");
        if (this.f99141i == null) {
            this.f99141i = new u32.a2();
        }
        g32.c.c(g32.b.INVOKE_ONCE);
        return this.f99141i;
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onCreate");
        super.d();
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onDestroy");
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.closeBluetoothAccessoryLibV2();
        super.e();
        android.content.pm.PackageManager packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager();
        try {
            z17 = true;
            packageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
            packageManager.getPackageInfo("com.google.android.wearable.app", 1);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceService", "isInstallWearApp %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceService", "kill exdevice process now");
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/service/ExDeviceService", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/exdevice/service/ExDeviceService", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
