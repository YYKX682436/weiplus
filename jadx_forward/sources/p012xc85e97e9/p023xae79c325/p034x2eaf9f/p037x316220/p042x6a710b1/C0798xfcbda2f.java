package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.SurfaceUtil */
/* loaded from: classes14.dex */
public class C0798xfcbda2f {

    /* renamed from: JNI_LIB_NAME */
    public static final java.lang.String f1970xa7ddf39f = "surface_util_jni";
    private static final java.lang.String TAG = "SurfaceUtil";

    /* renamed from: _hellAccFlag_ */
    private byte f1971x7f11beae;

    /* renamed from: androidx.camera.core.impl.utils.SurfaceUtil$SurfaceInfo */
    /* loaded from: classes14.dex */
    public static class SurfaceInfo {

        /* renamed from: format */
        public int f1972xb45ff7f7 = 0;

        /* renamed from: width */
        public int f1974x6be2dc6 = 0;

        /* renamed from: height */
        public int f1973xb7389127 = 0;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(f1970xa7ddf39f);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/impl/utils/SurfaceUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "androidx/camera/core/impl/utils/SurfaceUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private C0798xfcbda2f() {
    }

    /* renamed from: getSurfaceInfo */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0798xfcbda2f.SurfaceInfo m5936x8632edc5(android.view.Surface surface) {
        int[] m5937x542695bc = m5937x542695bc(surface);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0798xfcbda2f.SurfaceInfo surfaceInfo = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0798xfcbda2f.SurfaceInfo();
        surfaceInfo.f1972xb45ff7f7 = m5937x542695bc[0];
        surfaceInfo.f1974x6be2dc6 = m5937x542695bc[1];
        surfaceInfo.f1973xb7389127 = m5937x542695bc[2];
        return surfaceInfo;
    }

    /* renamed from: nativeGetSurfaceInfo */
    private static native int[] m5937x542695bc(android.view.Surface surface);
}
