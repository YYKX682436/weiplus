package com.tencent.map.lib;

/* loaded from: classes13.dex */
public interface JNIInterfaceCallback {
    java.lang.Object callback(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.Object obj);

    int callbackGetGLContext();

    boolean onJniCallbackRenderMapFrame(int i17);

    void onMapCameraChangeStopped();

    void onMapCameraChanged();

    void onMapLoaded();

    void onMarkerCollisionCallback(int[] iArr, int[] iArr2);

    void onVisualLayerClickResult(float f17, float f18, long j17, java.lang.String str, java.lang.String str2);
}
