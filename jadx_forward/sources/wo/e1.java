package wo;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f529215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera[] f529216e;

    public e1(int i17, android.hardware.Camera[] cameraArr) {
        this.f529215d = i17;
        this.f529216e = cameraArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i17 = this.f529215d;
            if (i17 >= 0) {
                android.hardware.Camera[] cameraArr = this.f529216e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                cameraArr[0] = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
            } else {
                this.f529216e[0] = (android.hardware.Camera) yj0.a.j(new java.lang.Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", "open", "()Landroid/hardware/Camera;");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCamera", e17, "syncCreateCamera error in new free thread", new java.lang.Object[0]);
        }
        java.lang.Object obj2 = wo.f1.f529218a;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCamera", "openCamera notifyAll");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCamera", e18, "MMCamera_openLooperNull notify error", new java.lang.Object[0]);
            }
        }
    }
}
