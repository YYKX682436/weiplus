package wo;

/* loaded from: classes13.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f529218a = new java.lang.Object();

    public static wo.d1 a(int i17, android.os.Looper looper) {
        if (!fp.h.c(28)) {
            return new wo.d1(c(i17, looper));
        }
        try {
            return new wo.d1(c(i17, looper));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCamera", e17, "opnImpl error, try camera directly, myLooper: %s", android.os.Looper.myLooper());
            if (android.os.Looper.myLooper() == null) {
                return new wo.d1(d(i17, looper));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            return new wo.d1((android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "open", "(ILandroid/os/Looper;)Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;"));
        }
    }

    public static wo.d1 b(android.os.Looper looper) {
        return looper == null ? new wo.d1((android.hardware.Camera) yj0.a.j(new java.lang.Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "open", "(Landroid/os/Looper;)Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "android/hardware/Camera", "open", "()Landroid/hardware/Camera;")) : new wo.d1(d(-1, looper));
    }

    public static android.hardware.Camera c(int i17, android.os.Looper looper) {
        if (looper != null) {
            return d(i17, looper);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        return (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "openImpl", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
    }

    public static android.hardware.Camera d(int i17, android.os.Looper looper) {
        if (looper == android.os.Looper.getMainLooper() && android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            if (i17 < 0) {
                return (android.hardware.Camera) yj0.a.j(new java.lang.Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "syncCreateCamera", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", "open", "()Landroid/hardware/Camera;");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            return (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "syncCreateCamera", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
        }
        android.hardware.Camera[] cameraArr = {null};
        ((ku5.t0) ku5.t0.f394148d).g(new wo.e1(i17, cameraArr));
        java.lang.Object obj2 = f529218a;
        synchronized (obj2) {
            try {
                if (cameraArr[0] == null) {
                    obj2.wait();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCamera", "openCamera wait finish");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCamera", e17, "MMCamera_openLooperNull wait error", new java.lang.Object[0]);
            }
        }
        return cameraArr[0];
    }
}
