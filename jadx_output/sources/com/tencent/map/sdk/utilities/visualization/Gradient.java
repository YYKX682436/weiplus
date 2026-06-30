package com.tencent.map.sdk.utilities.visualization;

/* loaded from: classes13.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final int f48682a;

        /* renamed from: b, reason: collision with root package name */
        final int f48683b;

        /* renamed from: c, reason: collision with root package name */
        final float f48684c;

        public /* synthetic */ a(com.tencent.map.sdk.utilities.visualization.Gradient gradient, int i17, int i18, float f17, byte b17) {
            this(i17, i18, f17);
        }

        private a(int i17, int i18, float f17) {
            this.f48682a = i17;
            this.f48683b = i18;
            this.f48684c = f17;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private java.util.HashMap<java.lang.Integer, com.tencent.map.sdk.utilities.visualization.Gradient.a> generateColorIntervals() {
        java.util.HashMap<java.lang.Integer, com.tencent.map.sdk.utilities.visualization.Gradient.a> hashMap = new java.util.HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new com.tencent.map.sdk.utilities.visualization.Gradient.a(this, android.graphics.Color.argb(0, android.graphics.Color.red(this.mColors[0]), android.graphics.Color.green(this.mColors[0]), android.graphics.Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], (byte) 0));
        }
        for (int i17 = 1; i17 < this.mColors.length; i17++) {
            int i18 = i17 - 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i18]));
            int[] iArr = this.mColors;
            int i19 = iArr[i18];
            int i27 = iArr[i17];
            float f17 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new com.tencent.map.sdk.utilities.visualization.Gradient.a(this, i19, i27, (fArr[i17] - fArr[i18]) * f17, (byte) 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i28 = this.mColors[length];
            hashMap.put(valueOf2, new com.tencent.map.sdk.utilities.visualization.Gradient.a(this, i28, i28, this.mColorMapSize * (1.0f - this.mStartPoints[length]), (byte) 0));
        }
        return hashMap;
    }

    public static int interpolateColor(int i17, int i18, float f17) {
        int alpha = (int) (((android.graphics.Color.alpha(i18) - android.graphics.Color.alpha(i17)) * f17) + android.graphics.Color.alpha(i17));
        float[] fArr = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17), fArr);
        float[] fArr2 = new float[3];
        android.graphics.Color.RGBToHSV(android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18), fArr2);
        float f18 = fArr[0];
        float f19 = fArr2[0];
        if (f18 - f19 > 180.0f) {
            fArr2[0] = f19 + 360.0f;
        } else if (f19 - f18 > 180.0f) {
            fArr[0] = f18 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i19 = 0; i19 < 3; i19++) {
            float f27 = fArr2[i19];
            float f28 = fArr[i19];
            fArr3[i19] = ((f27 - f28) * f17) + f28;
        }
        return android.graphics.Color.HSVToColor(alpha, fArr3);
    }

    public final int[] generateColorMap(double d17) {
        java.util.HashMap<java.lang.Integer, com.tencent.map.sdk.utilities.visualization.Gradient.a> generateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        com.tencent.map.sdk.utilities.visualization.Gradient.a aVar = generateColorIntervals.get(0);
        int i17 = 0;
        for (int i18 = 0; i18 < this.mColorMapSize; i18++) {
            if (generateColorIntervals.containsKey(java.lang.Integer.valueOf(i18))) {
                aVar = generateColorIntervals.get(java.lang.Integer.valueOf(i18));
                i17 = i18;
            }
            iArr[i18] = interpolateColor(aVar.f48682a, aVar.f48683b, (i18 - i17) / aVar.f48684c);
        }
        if (d17 != 1.0d) {
            for (int i19 = 0; i19 < this.mColorMapSize; i19++) {
                int i27 = iArr[i19];
                iArr[i19] = android.graphics.Color.argb((int) (android.graphics.Color.alpha(i27) * d17), android.graphics.Color.red(i27), android.graphics.Color.green(i27), android.graphics.Color.blue(i27));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i17) {
        if (iArr.length == fArr.length) {
            if (iArr.length != 0) {
                for (int i18 = 1; i18 < fArr.length; i18++) {
                    if (fArr[i18] <= fArr[i18 - 1]) {
                        throw new java.lang.IllegalArgumentException("startPoints should be in increasing order");
                    }
                }
                this.mColorMapSize = i17;
                int[] iArr2 = new int[iArr.length];
                this.mColors = iArr2;
                this.mStartPoints = new float[fArr.length];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
                return;
            }
            throw new java.lang.IllegalArgumentException("No colors have been defined");
        }
        throw new java.lang.IllegalArgumentException("colors and startPoints should be same length");
    }
}
