package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
public final class f {
    public static boolean a(float f17, float f18) {
        return java.lang.Math.abs(f17 - f18) < 1.0E-6f;
    }

    public static float[] a(java.util.List<android.graphics.PointF> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        float[] fArr = new float[size * 2];
        for (int i17 = 0; i17 < size; i17++) {
            android.graphics.PointF pointF = list.get(i17);
            int i18 = i17 * 2;
            fArr[i18] = pointF.x;
            fArr[i18 + 1] = pointF.y;
        }
        return fArr;
    }
}
