package com.tencent.map.sdk.utilities.heatmap;

/* loaded from: classes13.dex */
public class Gradient extends com.tencent.map.sdk.utilities.visualization.Gradient {
    public Gradient(int[] iArr, float[] fArr) {
        super(iArr, fArr);
    }

    public Gradient(int[] iArr, float[] fArr, int i17) {
        super(iArr, fArr, i17);
    }

    public Gradient(com.tencent.map.sdk.utilities.visualization.Gradient gradient) {
        super(gradient.mColors, gradient.mStartPoints, gradient.mColorMapSize);
    }
}
