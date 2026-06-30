package com.tencent.liteav.live;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f46492a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f46493b;

    static {
        try {
            java.lang.reflect.Method declaredMethod = com.tencent.rtmp.ui.TXCloudVideoView.class.getDeclaredMethod("setShowLogCallback", java.lang.ref.WeakReference.class);
            f46492a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = com.tencent.rtmp.ui.TXCloudVideoView.class.getDeclaredMethod("isShowLogEnabled", new java.lang.Class[0]);
            f46493b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null) {
            return false;
        }
        try {
            java.lang.Object invoke = f46493b.invoke(tXCloudVideoView, new java.lang.Object[0]);
            if (invoke != null && (invoke instanceof java.lang.Boolean)) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public static void a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView.b> weakReference) {
        if (tXCloudVideoView == null) {
            return;
        }
        try {
            f46492a.invoke(tXCloudVideoView, weakReference);
        } catch (java.lang.Exception unused) {
        }
    }
}
