package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db;

/* renamed from: com.tencent.youtu.ytcommon.tools.YTFaceUtils */
/* loaded from: classes14.dex */
public class C27961xf8ea1f79 {
    private static final java.lang.String TAG = "FaceUtils";

    /* renamed from: com.tencent.youtu.ytcommon.tools.YTFaceUtils$ShelterJudge */
    /* loaded from: classes6.dex */
    public interface ShelterJudge {

        /* renamed from: SHELTER_CHIN */
        public static final int f62600x243faf84 = 2;

        /* renamed from: SHELTER_LEFTEYE */
        public static final int f62601x25fcff30 = 7;

        /* renamed from: SHELTER_LEFTFACE */
        public static final int f62602x99a3011e = 1;

        /* renamed from: SHELTER_MOUTH */
        public static final int f62603x644688ad = 3;

        /* renamed from: SHELTER_NOSE */
        public static final int f62604x2444cb0d = 5;

        /* renamed from: SHELTER_PARAM_ERROR */
        public static final int f62605x458b3f1c = -2;

        /* renamed from: SHELTER_PARAM_NULL */
        public static final int f62606x3c10e1d3 = -1;

        /* renamed from: SHELTER_PASS */
        public static final int f62607x24457f4b = 0;

        /* renamed from: SHELTER_RIGHTEYE */
        public static final int f62608xdd9528cf = 6;

        /* renamed from: SHELTER_RIGHTFACE */
        public static final int f62609xd5100b5f = 4;
    }

    /* renamed from: getFaceScreen */
    public static android.graphics.Rect m121261xfa6411f(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i17 = 0;
        float f28 = f18;
        while (i17 < 180) {
            float[] fArr2 = faceStatus.xys;
            float f29 = fArr2[i17];
            if (f19 >= f29) {
                f19 = f29;
            }
            if (f27 <= f29) {
                f27 = f29;
            }
            int i18 = i17 + 1;
            float f37 = fArr2[i18];
            if (f18 >= f37) {
                f18 = f37;
            }
            if (f28 <= f37) {
                f28 = f37;
            }
            i17 = i18 + 1;
        }
        return new android.graphics.Rect((int) f19, (int) f18, (int) f27, (int) f28);
    }

    /* renamed from: shelterJudge */
    public static int m121262x973e0932(float[] fArr) {
        if (fArr == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis is null.");
            return -1;
        }
        if (fArr.length != 90) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis.length != 90. current pointsVis.length: " + fArr.length);
            return -2;
        }
        int i17 = 0;
        for (int i18 = 33; i18 <= 45; i18++) {
            if (fArr[i18 - 1] < 0.7f) {
                i17++;
            }
        }
        if (i17 >= 4) {
            return 5;
        }
        int i19 = 0;
        for (int i27 = 46; i27 <= 67; i27++) {
            if (fArr[i27 - 1] < 0.7f) {
                i19++;
            }
        }
        if (i19 >= 4) {
            return 3;
        }
        int i28 = 0;
        for (int i29 = 9; i29 <= 16; i29++) {
            if (fArr[i29 - 1] < 0.7f) {
                i28++;
            }
        }
        for (int i37 = 25; i37 <= 32; i37++) {
            if (fArr[i37 - 1] < 0.7f) {
                i28++;
            }
        }
        if (fArr[89] < 0.7f) {
            i28++;
        }
        if (i28 >= 4) {
            return 6;
        }
        int i38 = 0;
        for (int i39 = 1; i39 <= 8; i39++) {
            if (fArr[i39 - 1] < 0.7f) {
                i38++;
            }
        }
        for (int i47 = 17; i47 <= 24; i47++) {
            if (fArr[i47 - 1] < 0.7f) {
                i38++;
            }
        }
        if (fArr[88] < 0.7f) {
            i38++;
        }
        if (i38 >= 4) {
            return 7;
        }
        int i48 = 0;
        for (int i49 = 68; i49 < 74; i49++) {
            if (fArr[i49 - 1] < 0.7f) {
                i48++;
            }
        }
        if (i48 >= 3) {
            return 1;
        }
        int i57 = 0;
        for (int i58 = 82; i58 <= 88; i58++) {
            if (fArr[i58 - 1] < 0.7f) {
                i57++;
            }
        }
        if (i57 >= 3) {
            return 4;
        }
        int i59 = 0;
        for (int i66 = 75; i66 <= 81; i66++) {
            if (fArr[i66 - 1] < 0.7f) {
                i59++;
            }
        }
        return i59 >= 3 ? 2 : 0;
    }
}
