package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public class SurfaceUtil {
    public static final java.lang.String JNI_LIB_NAME = "surface_util_jni";
    private static final java.lang.String TAG = "SurfaceUtil";
    private byte _hellAccFlag_;

    /* loaded from: classes14.dex */
    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(JNI_LIB_NAME);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/impl/utils/SurfaceUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "androidx/camera/core/impl/utils/SurfaceUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private SurfaceUtil() {
    }

    public static androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo getSurfaceInfo(android.view.Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo surfaceInfo = new androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo();
        surfaceInfo.format = nativeGetSurfaceInfo[0];
        surfaceInfo.width = nativeGetSurfaceInfo[1];
        surfaceInfo.height = nativeGetSurfaceInfo[2];
        return surfaceInfo;
    }

    private static native int[] nativeGetSurfaceInfo(android.view.Surface surface);
}
