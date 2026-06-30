package com.tencent.mars;

/* loaded from: classes12.dex */
public class MarsContext {
    private static final java.lang.String TAG = "MicroMsg.MarsContext";
    public static com.tencent.mars.app.Context ctx;

    public static com.tencent.mars.app.Context getContext() {
        if (ctx == null) {
            synchronized (com.tencent.mars.MarsContext.class) {
                ctx = new com.tencent.mars.app.Context("default");
            }
        }
        return ctx;
    }

    public static <T extends com.tencent.mars.app.BaseManager> T getManager(java.lang.Class<T> cls) {
        T t17 = (T) getContext().getManager(cls);
        if (t17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "getManager %s failed", cls.getName());
            bm5.n.a(t17);
        }
        return t17;
    }

    public static void release() {
        com.tencent.mars.xlog.Log.i(TAG, "mars2 release.");
        com.tencent.mars.app.Context context = ctx;
        if (context != null) {
            context.onDestroy();
        }
        ctx = null;
    }
}
