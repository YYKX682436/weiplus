package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class PerspectiveTransformMatrixCalculator {
    public static float[] getPerspectiveTransformMatrix(java.util.List<android.graphics.PointF> list, java.util.List<android.graphics.PointF> list2) {
        return nativeGetPerspectiveTransformMatrix(com.tencent.liteav.base.util.f.a(list), com.tencent.liteav.base.util.f.a(list2));
    }

    public static native float[] nativeGetPerspectiveTransformMatrix(float[] fArr, float[] fArr2);
}
