package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f128025a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f128026b;

    static {
        try {
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.class.getDeclaredMethod("setShowLogCallback", java.lang.ref.WeakReference.class);
            f128025a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.class.getDeclaredMethod("isShowLogEnabled", new java.lang.Class[0]);
            f128026b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            return false;
        }
        try {
            java.lang.Object invoke = f128026b.invoke(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, new java.lang.Object[0]);
            if (invoke != null && (invoke instanceof java.lang.Boolean)) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public static void a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b> weakReference) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            return;
        }
        try {
            f128025a.invoke(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, weakReference);
        } catch (java.lang.Exception unused) {
        }
    }
}
