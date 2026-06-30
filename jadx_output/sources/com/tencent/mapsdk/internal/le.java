package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class le {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f50288a = {"北", "东北", "东", "东南", "南", "西南", "西", "西北"};

    private static double a(double d17) {
        return (d17 / 3.141592653589793d) * 180.0d;
    }

    private static double b(double d17) {
        return (d17 / 180.0d) * 3.141592653589793d;
    }

    private static double c(double d17) {
        double abs = java.lang.Math.abs(d17 % 360.0d);
        return abs > 270.0d ? 360.0d - abs : abs;
    }

    private static double d(double d17, double d18, double d19, double d27) {
        double asin = java.lang.Math.asin((d19 - d17) / java.lang.Math.sqrt(java.lang.Math.pow(d17 - d19, 2.0d) + java.lang.Math.pow(d18 - d27, 2.0d)));
        if (d27 - d18 < 0.0d) {
            asin = 3.141592653589793d - asin;
        }
        return (asin / 3.141592653589793d) * 180.0d;
    }

    private static java.lang.String a(float f17) {
        if (f17 < 0.0f) {
            f17 += 360.0f;
        }
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = f50288a;
            if (i17 >= strArr.length) {
                return strArr[0];
            }
            float f18 = (i17 * 45) - 22.0f;
            if (f17 < 45.0f + f18 && f17 >= f18) {
                return strArr[i17];
            }
            i17++;
        }
    }

    private static java.nio.IntBuffer b(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18, int i19, int i27) {
        java.nio.IntBuffer wrap = java.nio.IntBuffer.wrap(new int[i19 * i27]);
        wrap.position(0);
        gl10.glReadPixels(i17, i18, i19, i27, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        return wrap;
    }

    private static double c(double d17, double d18, double d19, double d27) {
        double abs;
        double d28 = d19 - d17;
        double d29 = d27 - d18;
        double atan = java.lang.Math.atan(d29 / d28);
        if (d28 > 0.0d && d29 > 0.0d) {
            abs = 1.5707963267948966d - java.lang.Math.abs(atan);
        } else if (d28 >= 0.0d && d29 <= 0.0d) {
            abs = 1.5707963267948966d + java.lang.Math.abs(atan);
        } else if (d28 <= 0.0d && d29 <= 0.0d) {
            abs = 4.71238898038469d - java.lang.Math.abs(atan);
        } else {
            abs = java.lang.Math.abs(atan) + 4.71238898038469d;
        }
        return (abs * 180.0d) / 3.141592653589793d;
    }

    private static android.graphics.Bitmap a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18, int i19, int i27, int i28, int i29) {
        int i37 = i18 + i27;
        int[] iArr = new int[i19 * i37];
        int[] iArr2 = new int[i28 * i29];
        java.nio.IntBuffer wrap = java.nio.IntBuffer.wrap(iArr);
        int i38 = 0;
        wrap.position(0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gl10.glReadPixels(i17, 0, i19, i37, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        com.tencent.mapsdk.core.utils.log.LogUtil.b("readPixels 使用的时间:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        float f17 = ((float) i19) / ((float) i28);
        float f18 = ((float) i27) / ((float) i29);
        int i39 = 0;
        int i47 = 0;
        while (i39 < i29) {
            for (int i48 = i38; i48 < i28; i48++) {
                int i49 = iArr[(((int) java.lang.Math.ceil((i39 * f18) - 0.5d)) * i19) + ((int) java.lang.Math.ceil((i48 * f17) - 0.5d))];
                iArr2[(((i29 - i47) - 1) * i28) + i48] = (i49 & (-16711936)) | ((i49 << 16) & 16711680) | ((i49 >> 16) & 255);
            }
            i39++;
            i47++;
            i38 = 0;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr2, i28, i29, android.graphics.Bitmap.Config.RGB_565);
        com.tencent.mapsdk.core.utils.log.LogUtil.b("buffer 转成位图使用的时间:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + "ms");
        return createBitmap;
    }

    private static int b(float f17) {
        int i17 = 1;
        while (true) {
            int i18 = i17 + 1;
            int i19 = 2 << i17;
            if (i19 >= ((int) java.lang.Math.ceil(f17))) {
                return i19;
            }
            i17 = i18;
        }
    }

    private static double b(double d17, double d18, double d19, double d27) {
        return java.lang.Math.sqrt(java.lang.Math.pow(d17 - d19, 2.0d) + java.lang.Math.pow(d18 - d27, 2.0d));
    }

    private static com.tencent.mapsdk.internal.gi b(float f17, float f18, float[] fArr, float[] fArr2, int[] iArr) {
        float[] a17 = a(f17, f18, 0.0f, fArr, fArr2, iArr);
        float[] a18 = a(f17, f18, 1.0f, fArr, fArr2, iArr);
        for (int i17 = 0; i17 < 3; i17++) {
            a17[i17] = a17[i17] / a17[3];
            a18[i17] = a18[i17] / a18[3];
        }
        return new com.tencent.mapsdk.internal.gi(a18[0] - a17[0], a18[1] - a17[1], a18[2] - a17[2]);
    }

    private static float b(com.tencent.mapsdk.internal.gj gjVar, com.tencent.mapsdk.internal.gj gjVar2) {
        double asin = java.lang.Math.asin((gjVar2.f49587a - gjVar.f49587a) / java.lang.Math.sqrt(java.lang.Math.pow(gjVar.f49587a - gjVar2.f49587a, 2.0d) + java.lang.Math.pow(gjVar.f49589c - gjVar2.f49589c, 2.0d)));
        if (gjVar2.f49589c - gjVar.f49589c < 0.0f) {
            asin = 3.141592653589793d - asin;
        }
        return (float) ((asin / 3.141592653589793d) * 180.0d);
    }

    private static com.tencent.mapsdk.internal.gj a(float f17, float f18, float f19, float[] fArr, float f27) {
        float[] fArr2 = new float[16];
        android.opengl.Matrix.invertM(fArr2, 0, fArr, 0);
        com.tencent.mapsdk.internal.gj gjVar = new com.tencent.mapsdk.internal.gj(f17, f18, f27);
        float[] fArr3 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr3, 0, fArr2, 0, new float[]{gjVar.f49587a, gjVar.f49588b, gjVar.f49589c, gjVar.f49590d}, 0);
        float f28 = fArr3[0];
        float f29 = fArr3[3];
        com.tencent.mapsdk.internal.gj gjVar2 = new com.tencent.mapsdk.internal.gj(f28 / f29, fArr3[1] / f29, fArr3[2] / f29);
        float f37 = gjVar2.f49588b;
        float f38 = f37 != 0.0f ? f19 / f37 : 1.0f;
        return new com.tencent.mapsdk.internal.gj(gjVar2.f49587a * f38, f19, gjVar2.f49589c * f38);
    }

    private static com.tencent.mapsdk.internal.gj a(double d17, double d18, double d19, double d27) {
        return new com.tencent.mapsdk.internal.gj((float) (d17 - d19), 0.0f, -((float) (d18 - d27)));
    }

    private static android.graphics.PointF a(com.tencent.mapsdk.internal.gj gjVar, double d17, double d18) {
        return new android.graphics.PointF((float) (gjVar.f49587a + d17), (float) ((-gjVar.f49589c) + d18));
    }

    private static double a(com.tencent.mapsdk.internal.gj gjVar, com.tencent.mapsdk.internal.gj gjVar2) {
        return java.lang.Math.sqrt(java.lang.Math.pow(gjVar.f49587a - gjVar2.f49587a, 2.0d) + java.lang.Math.pow(gjVar.f49589c - gjVar2.f49589c, 2.0d));
    }

    private static float[] a(float f17, float f18, float f19, float[] fArr, float[] fArr2, int[] iArr) {
        float[] fArr3 = new float[4];
        if (android.opengl.GLU.gluUnProject(f17, iArr[3] - f18, f19, fArr, 0, fArr2, 0, iArr, 0, fArr3, 0) == 1) {
            return fArr3;
        }
        throw new java.lang.RuntimeException("unProject fail");
    }

    private static com.tencent.mapsdk.internal.gi a(float[] fArr) {
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        float f28 = fArr[4];
        float f29 = fArr[5];
        float f37 = fArr[6];
        float[] fArr2 = {f27 - f17, f28 - f18, f29 - f19};
        float f38 = fArr[7] - f18;
        float f39 = fArr[8] - f19;
        float[] fArr3 = {f37 - f17, f38, f39};
        float f47 = fArr2[1] * f39;
        float f48 = fArr2[2];
        float f49 = fArr3[0];
        float f57 = fArr2[0];
        return new com.tencent.mapsdk.internal.gi(f47 - (f38 * f48), (f48 * f49) - (f39 * f57), (f57 * fArr3[1]) - (fArr2[1] * f49));
    }

    private static boolean a(float[] fArr, float[] fArr2) {
        com.tencent.mapsdk.internal.gh ghVar = new com.tencent.mapsdk.internal.gh(fArr2);
        com.tencent.mapsdk.internal.gj gjVar = new com.tencent.mapsdk.internal.gj(fArr[0], fArr[1], fArr[2]);
        return ((double) java.lang.Math.abs(ghVar.a() - ((new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49580a, ghVar.f49581b).a() + new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49580a, ghVar.f49582c).a()) + new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49581b, ghVar.f49582c).a()))) < 0.001d;
    }

    private static float[] a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        float[] fArr5 = new float[3];
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr2[0];
        float f28 = fArr2[1];
        float f29 = fArr2[2];
        float f37 = fArr3[0];
        float f38 = fArr3[1];
        float f39 = fArr3[2];
        float f47 = fArr4[0];
        float f48 = fArr4[1];
        float f49 = fArr4[2];
        float f57 = (f37 * f17) + (f38 * f18) + (f39 * f19);
        if (f57 == 0.0f) {
            return null;
        }
        float f58 = ((((f27 - f47) * f17) + ((f28 - f48) * f18)) + ((f29 - f49) * f19)) / f57;
        fArr5[0] = f47 + (f37 * f58);
        fArr5[1] = f48 + (f38 * f58);
        fArr5[2] = f49 + (f39 * f58);
        return fArr5;
    }

    private static android.graphics.Bitmap a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18, int i19, int i27) {
        int i28 = i18 + i27;
        int[] iArr = new int[i19 * i28];
        int[] iArr2 = new int[i19 * i27];
        java.nio.IntBuffer wrap = java.nio.IntBuffer.wrap(iArr);
        int i29 = 0;
        wrap.position(0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gl10.glReadPixels(i17, 0, i19, i28, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        com.tencent.mapsdk.core.utils.log.LogUtil.b("readPixels 使用的时间:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        float f17 = (float) i19;
        float f18 = f17 / f17;
        float f19 = i27;
        float f27 = f19 / f19;
        int i37 = 0;
        int i38 = 0;
        while (i37 < i27) {
            for (int i39 = i29; i39 < i19; i39++) {
                int i47 = iArr[(((int) java.lang.Math.ceil((i37 * f27) - 0.5d)) * i19) + ((int) java.lang.Math.ceil((i39 * f18) - 0.5d))];
                iArr2[(((i27 - i38) - 1) * i19) + i39] = (i47 & (-16711936)) | ((i47 << 16) & 16711680) | ((i47 >> 16) & 255);
            }
            i37++;
            i38++;
            i29 = 0;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr2, i19, i27, android.graphics.Bitmap.Config.RGB_565);
        com.tencent.mapsdk.core.utils.log.LogUtil.b("buffer 转成位图使用的时间:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + "ms");
        return createBitmap;
    }

    private static boolean a(float f17, float f18, float[] fArr, float[] fArr2, int[] iArr) {
        float f19 = fArr[0];
        float f27 = fArr[1];
        float f28 = fArr[2];
        float f29 = fArr[3];
        float f37 = fArr[4];
        float f38 = fArr[5];
        float f39 = fArr[6];
        float[] fArr3 = {f29 - f19, f37 - f27, f38 - f28};
        float f47 = fArr[7] - f27;
        float f48 = fArr[8] - f28;
        float[] fArr4 = {f39 - f19, f47, f48};
        float f49 = fArr3[1] * f48;
        float f57 = fArr3[2];
        float f58 = fArr4[0];
        float f59 = fArr3[0];
        com.tencent.mapsdk.internal.gi giVar = new com.tencent.mapsdk.internal.gi(f49 - (f47 * f57), (f57 * f58) - (f48 * f59), (f59 * fArr4[1]) - (fArr3[1] * f58));
        float[] fArr5 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr5, 0);
        float[] a17 = a(f17, f18, 0.0f, fArr5, fArr2, iArr);
        float[] a18 = a(f17, f18, 1.0f, fArr5, fArr2, iArr);
        for (int i17 = 0; i17 < 3; i17++) {
            a17[i17] = a17[i17] / a17[3];
            a18[i17] = a18[i17] / a18[3];
        }
        com.tencent.mapsdk.internal.gi giVar2 = new com.tencent.mapsdk.internal.gi(a18[0] - a17[0], a18[1] - a17[1], a18[2] - a17[2]);
        float[] a19 = giVar.a();
        float[] fArr6 = {fArr[0], fArr[1], fArr[2]};
        float[] a27 = giVar2.a();
        float f66 = a17[0];
        float f67 = a17[1];
        float f68 = a17[2];
        float[] fArr7 = new float[3];
        float f69 = a19[0];
        float f76 = a19[1];
        float f77 = a19[2];
        float f78 = fArr6[0];
        float f79 = fArr6[1];
        float f86 = fArr6[2];
        float f87 = a27[0];
        float f88 = a27[1];
        float f89 = a27[2];
        float f96 = (f87 * f69) + (f88 * f76) + (f89 * f77);
        if (f96 == 0.0f) {
            fArr7 = null;
        } else {
            float f97 = ((((f78 - f66) * f69) + ((f79 - f67) * f76)) + ((f86 - f68) * f77)) / f96;
            fArr7[0] = f66 + (f87 * f97);
            fArr7[1] = f67 + (f88 * f97);
            fArr7[2] = f68 + (f89 * f97);
        }
        if (fArr7 == null) {
            return false;
        }
        com.tencent.mapsdk.internal.gh ghVar = new com.tencent.mapsdk.internal.gh(fArr);
        com.tencent.mapsdk.internal.gj gjVar = new com.tencent.mapsdk.internal.gj(fArr7[0], fArr7[1], fArr7[2]);
        return ((double) java.lang.Math.abs(ghVar.a() - ((new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49580a, ghVar.f49581b).a() + new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49580a, ghVar.f49582c).a()) + new com.tencent.mapsdk.internal.gh(gjVar, ghVar.f49581b, ghVar.f49582c).a()))) < 0.001d;
    }
}
