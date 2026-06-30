package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524;

/* renamed from: com.tencent.map.sdk.utilities.visualization.Gradient */
/* loaded from: classes13.dex */
public class C4281x9325b50 {

    /* renamed from: DEFAULT_COLOR_MAP_SIZE */
    private static final int f16744xb535a87e = 1000;

    /* renamed from: mColorMapSize */
    public final int f16745x5076e7a7;

    /* renamed from: mColors */
    public int[] f16746xfeaae43d;

    /* renamed from: mStartPoints */
    public float[] f16747x3568cd38;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.Gradient$a */
    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final int f130215a;

        /* renamed from: b, reason: collision with root package name */
        final int f130216b;

        /* renamed from: c, reason: collision with root package name */
        final float f130217c;

        public /* synthetic */ a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50 c4281x9325b50, int i17, int i18, float f17, byte b17) {
            this(i17, i18, f17);
        }

        private a(int i17, int i18, float f17) {
            this.f130215a = i17;
            this.f130216b = i18;
            this.f130217c = f17;
        }
    }

    public C4281x9325b50(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    /* renamed from: generateColorIntervals */
    private java.util.HashMap<java.lang.Integer, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a> m35602x3b00f500() {
        java.util.HashMap<java.lang.Integer, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a> hashMap = new java.util.HashMap<>();
        if (this.f16747x3568cd38[0] != 0.0f) {
            hashMap.put(0, new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a(this, android.graphics.Color.argb(0, android.graphics.Color.red(this.f16746xfeaae43d[0]), android.graphics.Color.green(this.f16746xfeaae43d[0]), android.graphics.Color.blue(this.f16746xfeaae43d[0])), this.f16746xfeaae43d[0], this.f16745x5076e7a7 * this.f16747x3568cd38[0], (byte) 0));
        }
        for (int i17 = 1; i17 < this.f16746xfeaae43d.length; i17++) {
            int i18 = i17 - 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (this.f16745x5076e7a7 * this.f16747x3568cd38[i18]));
            int[] iArr = this.f16746xfeaae43d;
            int i19 = iArr[i18];
            int i27 = iArr[i17];
            float f17 = this.f16745x5076e7a7;
            float[] fArr = this.f16747x3568cd38;
            hashMap.put(valueOf, new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a(this, i19, i27, (fArr[i17] - fArr[i18]) * f17, (byte) 0));
        }
        float[] fArr2 = this.f16747x3568cd38;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (this.f16745x5076e7a7 * fArr2[length]));
            int i28 = this.f16746xfeaae43d[length];
            hashMap.put(valueOf2, new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a(this, i28, i28, this.f16745x5076e7a7 * (1.0f - this.f16747x3568cd38[length]), (byte) 0));
        }
        return hashMap;
    }

    /* renamed from: interpolateColor */
    public static int m35603xa20fdee2(int i17, int i18, float f17) {
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

    /* renamed from: generateColorMap */
    public final int[] m35604x42a8d38e(double d17) {
        java.util.HashMap<java.lang.Integer, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a> m35602x3b00f500 = m35602x3b00f500();
        int[] iArr = new int[this.f16745x5076e7a7];
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.C4281x9325b50.a aVar = m35602x3b00f500.get(0);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f16745x5076e7a7; i18++) {
            if (m35602x3b00f500.containsKey(java.lang.Integer.valueOf(i18))) {
                aVar = m35602x3b00f500.get(java.lang.Integer.valueOf(i18));
                i17 = i18;
            }
            iArr[i18] = m35603xa20fdee2(aVar.f130215a, aVar.f130216b, (i18 - i17) / aVar.f130217c);
        }
        if (d17 != 1.0d) {
            for (int i19 = 0; i19 < this.f16745x5076e7a7; i19++) {
                int i27 = iArr[i19];
                iArr[i19] = android.graphics.Color.argb((int) (android.graphics.Color.alpha(i27) * d17), android.graphics.Color.red(i27), android.graphics.Color.green(i27), android.graphics.Color.blue(i27));
            }
        }
        return iArr;
    }

    public C4281x9325b50(int[] iArr, float[] fArr, int i17) {
        if (iArr.length == fArr.length) {
            if (iArr.length != 0) {
                for (int i18 = 1; i18 < fArr.length; i18++) {
                    if (fArr[i18] <= fArr[i18 - 1]) {
                        throw new java.lang.IllegalArgumentException("startPoints should be in increasing order");
                    }
                }
                this.f16745x5076e7a7 = i17;
                int[] iArr2 = new int[iArr.length];
                this.f16746xfeaae43d = iArr2;
                this.f16747x3568cd38 = new float[fArr.length];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(fArr, 0, this.f16747x3568cd38, 0, fArr.length);
                return;
            }
            throw new java.lang.IllegalArgumentException("No colors have been defined");
        }
        throw new java.lang.IllegalArgumentException("colors and startPoints should be same length");
    }
}
