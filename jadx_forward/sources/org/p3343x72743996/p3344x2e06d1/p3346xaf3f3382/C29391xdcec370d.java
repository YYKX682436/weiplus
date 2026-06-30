package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForN */
/* loaded from: classes13.dex */
public final class C29391xdcec370d {
    private C29391xdcec370d() {
    }

    /* renamed from: getRestrictBackgroundStatus */
    public static int m152810x17a28f12(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus();
    }

    /* renamed from: getStartUptimeMillis */
    public static long m152811x5059b11a() {
        return android.os.Process.getStartUptimeMillis();
    }

    /* renamed from: isCleartextTrafficPermitted */
    public static boolean m152812xc4f99fab(java.lang.String str) {
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: onResolvePointerIcon */
    public static android.view.PointerIcon m152813xb70f3309(android.view.View view, android.view.MotionEvent motionEvent, int i17) {
        return view.onResolvePointerIcon(motionEvent, i17);
    }

    /* renamed from: setCryptoInfoPattern */
    public static void m152814x4551173f(android.media.MediaCodec.CryptoInfo cryptoInfo, int i17, int i18) {
        cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(i17, i18));
    }

    /* renamed from: setVrModeEnabled */
    public static void m152815x4c32ca80(android.app.Activity activity, boolean z17, android.content.ComponentName componentName) {
        activity.setVrModeEnabled(z17, componentName);
    }

    /* renamed from: startDragAndDrop */
    public static boolean m152816xd29af3d0(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i17) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i17);
    }
}
