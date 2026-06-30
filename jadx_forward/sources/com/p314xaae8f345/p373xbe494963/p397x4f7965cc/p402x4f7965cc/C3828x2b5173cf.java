package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker */
/* loaded from: classes14.dex */
public class C3828x2b5173cf {
    private static final java.lang.String TAG = "TXCCloudVideoViewMethodInvoker";

    /* renamed from: addView */
    public static void m31242xbb8aeee6(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.view.TextureView textureView) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "addViewInternal", new java.lang.Class[]{android.view.TextureView.class}, textureView);
    }

    /* renamed from: callMethod */
    private static java.lang.Object m31243x539f78df(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Object... objArr) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, str + ",TXCloudVideoView is null.");
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, objArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, str + ",Exception:", th6);
            return null;
        }
    }

    /* renamed from: getGLContextFromView */
    public static java.lang.Object m31244x5492cc03(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3) {
        if (c3826xc46e8cd3 == null || c3826xc46e8cd3.m31220x13d2be05() == null) {
            return null;
        }
        return c3826xc46e8cd3.m31220x13d2be05().m94620xcd74f24a();
    }

    /* renamed from: getTextureViewSetByUser */
    public static android.view.TextureView m31245xc29e49ba(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        java.lang.Object m31243x539f78df = m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "getTextureViewSetByUser", null, new java.lang.Object[0]);
        if (m31243x539f78df instanceof android.view.TextureView) {
            return (android.view.TextureView) m31243x539f78df;
        }
        return null;
    }

    /* renamed from: removeDeprecatedViews */
    public static void m31246xbed28357(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.view.TextureView textureView) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "removeDeprecatedViews", new java.lang.Class[]{android.view.TextureView.class}, textureView);
    }

    /* renamed from: removeView */
    public static void m31247x417bc549(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.view.TextureView textureView, boolean z17) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "removeViewInternal", new java.lang.Class[]{android.view.TextureView.class, java.lang.Boolean.TYPE}, textureView, java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: setAndroidViewEventListener */
    public static void m31248x16c8ba9c(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a interfaceC25489xb6bd843a) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "setAndroidViewEventListener", new java.lang.Class[]{com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a.class}, interfaceC25489xb6bd843a);
    }

    /* renamed from: setBackgroundColorForInternalView */
    public static void m31249xb5d57d8(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "setBackgroundColorForInternalView", new java.lang.Class[]{java.lang.Integer.TYPE}, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setTouchToFocusEnabled */
    public static void m31250xc787dac1(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, boolean z17) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "setTouchToFocusEnabled", new java.lang.Class[]{java.lang.Boolean.TYPE}, java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: setZoomEnabled */
    public static void m31251xd8e5562c(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, boolean z17) {
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "setZoomEnabled", new java.lang.Class[]{java.lang.Boolean.TYPE}, java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: showFocusView */
    public static void m31252x3ada2920(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17, int i18, int i19, int i27) {
        java.lang.Class cls = java.lang.Integer.TYPE;
        m31243x539f78df(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, "showFocusView", new java.lang.Class[]{cls, cls, cls, cls}, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
