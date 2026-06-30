package di3;

/* loaded from: classes10.dex */
public abstract class t {
    public static android.graphics.Point a(java.util.ArrayList arrayList, android.graphics.Point point, boolean z17, int i17) {
        int i18;
        int i19 = point.x;
        int i27 = point.y * i17;
        if (i27 % i19 != 0) {
            return null;
        }
        int i28 = i27 / i19;
        if (z17) {
            int i29 = i17 ^ i28;
            i28 ^= i29;
            i18 = i29 ^ i28;
        } else {
            i18 = i17;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
            int i37 = size.width;
            if (i37 == i18 && size.height == i28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28));
                return new android.graphics.Point(i18, i28);
            }
            if (java.lang.Math.min(i37, size.height) < i17) {
                break;
            }
        }
        return null;
    }

    public static android.graphics.Point b(android.util.Size[] sizeArr, android.graphics.Point point, boolean z17, int i17) {
        int i18;
        int i19 = point.x;
        int i27 = point.y * i17;
        if (i27 % i19 != 0) {
            return null;
        }
        int i28 = i27 / i19;
        if (z17) {
            int i29 = i17 ^ i28;
            i28 ^= i29;
            i18 = i29 ^ i28;
        } else {
            i18 = i17;
        }
        for (android.util.Size size : sizeArr) {
            if (size.getWidth() == i18 && size.getHeight() == i28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28));
                return new android.graphics.Point(i18, i28);
            }
            if (java.lang.Math.min(size.getWidth(), size.getHeight()) < i17) {
                return null;
            }
        }
        return null;
    }

    public static di3.s c(android.util.Size[] sizeArr, android.graphics.Point point, int i17, boolean z17) {
        android.graphics.Point point2 = null;
        java.util.Arrays.sort(sizeArr, new di3.q(null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "findPreviewSizeWithoutCrop supportedPreviewSizes: %s", ai3.d.t(sizeArr));
        int i18 = point.x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(i18 / point.y), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.s sVar = new di3.s();
        int i19 = ((int) (i17 * 1.05f)) + 64;
        int length = sizeArr.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                break;
            }
            android.util.Size size = sizeArr[i27];
            if (size.getHeight() <= i19 && size.getWidth() <= 2000) {
                point2 = new android.graphics.Point();
                point2.x = size.getWidth();
                point2.y = size.getHeight();
                break;
            }
            i27++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s ", point2);
        sVar.f314294e = new android.graphics.Point(point2.x, point2.y);
        sVar.f314293d = new android.graphics.Point(point2.x, point2.y);
        sVar.f314295f = ai3.d.e(point, point2, z17, true);
        android.graphics.Point point3 = new android.graphics.Point(point2.x, point2.y);
        sVar.f314290a = point3;
        sVar.f314291b = point2;
        sVar.f314292c = ai3.d.e(point, point3, z17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s ", point3, point2);
        return sVar;
    }

    public static di3.s d(android.util.Size[] sizeArr, android.graphics.Point point, int i17, boolean z17) {
        android.graphics.Point point2 = null;
        java.util.Arrays.sort(sizeArr, new di3.q(null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "findPreviewSizeWithoutCrop isRotate: %b, supportedPreviewSizes: %s", java.lang.Boolean.valueOf(z17), ai3.d.t(sizeArr));
        int i18 = point.x;
        float f17 = i18 / point.y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.s sVar = new di3.s();
        int i19 = ((int) (i17 * 1.05f)) + 64;
        int length = sizeArr.length;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 >= length) {
                break;
            }
            android.util.Size size = sizeArr[i28];
            float height = size.getHeight() / size.getWidth();
            if (size.getHeight() <= i19 && size.getWidth() <= 2000 && height == f17) {
                point2 = new android.graphics.Point();
                point2.x = size.getWidth();
                point2.y = size.getHeight();
                break;
            }
            i28++;
        }
        if (point2 == null) {
            int length2 = sizeArr.length;
            while (true) {
                if (i27 >= length2) {
                    break;
                }
                android.util.Size size2 = sizeArr[i27];
                if (size2.getHeight() > i19 || size2.getWidth() > 2000) {
                    i27++;
                } else if (point2 == null) {
                    point2 = new android.graphics.Point();
                    point2.x = size2.getWidth();
                    point2.y = size2.getHeight();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s ", point2);
        sVar.f314294e = new android.graphics.Point(point2.x, point2.y);
        sVar.f314293d = new android.graphics.Point(point2.x, point2.y);
        sVar.f314295f = ai3.d.e(point, point2, z17, true);
        android.graphics.Point point3 = new android.graphics.Point(point2.x, point2.y);
        sVar.f314290a = point3;
        sVar.f314291b = point2;
        sVar.f314292c = ai3.d.e(point, point3, z17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s ", point3, point2);
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static di3.s e(android.hardware.Camera.Parameters r16, android.graphics.Point r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.t.e(android.hardware.Camera$Parameters, android.graphics.Point, int, int, boolean):di3.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static di3.s f(android.hardware.Camera.Parameters r10, android.graphics.Point r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.t.f(android.hardware.Camera$Parameters, android.graphics.Point, int, boolean):di3.s");
    }

    public static di3.s g(android.hardware.Camera.Parameters parameters, android.graphics.Point point, int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(parameters.getSupportedPreviewSizes());
        java.util.Collections.sort(arrayList, new di3.r(null));
        new java.util.ArrayList(parameters.getSupportedPictureSizes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWay supportedPreviewSizes: %s", ai3.d.u(arrayList));
        int i18 = point.x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(i18 / point.y), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.s sVar = new di3.s();
        android.graphics.Point a17 = a(arrayList, point, z17, i17);
        sVar.f314290a = a17;
        if (a17 == null) {
            android.graphics.Point point2 = new android.graphics.Point();
            java.lang.Math.min(point.x, point.y);
            java.lang.Math.max(point.x, point.y);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
                int i19 = size.width;
                point2.x = i19;
                int i27 = size.height;
                point2.y = i27;
                if (i19 != i27 && java.lang.Math.min(i19, i27) <= i17 && java.lang.Math.max(point2.x, point2.y) <= 2000 && ai3.d.d(point, point2, z17, false) != null) {
                    sVar.f314290a = null;
                    break;
                }
            }
        } else {
            sVar.f314291b = ai3.d.d(point, a17, z17, false);
            sVar.f314292c = ai3.d.d(point, sVar.f314290a, z17, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", sVar.f314290a, sVar.f314291b, 0);
        return sVar;
    }

    public static di3.s h(android.util.Size[] sizeArr, android.graphics.Point point, int i17, boolean z17) {
        java.util.Arrays.sort(sizeArr, new di3.q(null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWay supportedPreviewSizes: %s", ai3.d.t(sizeArr));
        int i18 = point.x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(i18 / point.y), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.s sVar = new di3.s();
        android.graphics.Point b17 = b(sizeArr, point, z17, i17);
        sVar.f314290a = b17;
        if (b17 == null) {
            android.graphics.Point point2 = new android.graphics.Point();
            java.lang.Math.min(point.x, point.y);
            java.lang.Math.max(point.x, point.y);
            int length = sizeArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                android.util.Size size = sizeArr[i19];
                point2.x = size.getWidth();
                int height = size.getHeight();
                point2.y = height;
                int i27 = point2.x;
                if (i27 != height && java.lang.Math.min(i27, height) <= i17 && java.lang.Math.max(point2.x, point2.y) <= 2000 && ai3.d.d(point, point2, z17, false) != null) {
                    sVar.f314290a = null;
                    break;
                }
                i19++;
            }
        } else {
            sVar.f314291b = ai3.d.d(point, b17, z17, false);
            sVar.f314292c = ai3.d.d(point, sVar.f314290a, z17, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", sVar.f314290a, sVar.f314291b, 0);
        return sVar;
    }

    public static di3.s i(android.util.Size[] sizeArr, android.graphics.Point point, int i17, boolean z17) {
        java.util.Arrays.sort(sizeArr, new di3.q(null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWayV1 isRoate:%b,supportedPreviewSizes: %s", java.lang.Boolean.valueOf(z17), ai3.d.t(sizeArr));
        int i18 = point.x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(i18 / point.y), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.s sVar = new di3.s();
        android.graphics.Point b17 = b(sizeArr, point, z17, i17);
        sVar.f314290a = b17;
        if (b17 == null) {
            android.graphics.Point point2 = new android.graphics.Point();
            java.lang.Math.min(point.x, point.y);
            java.lang.Math.max(point.x, point.y);
            int length = sizeArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                android.util.Size size = sizeArr[i19];
                point2.x = size.getWidth();
                int height = size.getHeight();
                point2.y = height;
                int i27 = point2.x;
                if (i27 != height && java.lang.Math.min(i27, height) <= i17 && java.lang.Math.max(point2.x, point2.y) <= 2000 && ai3.d.d(point, point2, z17, false) != null) {
                    sVar.f314290a = point2;
                    break;
                }
                i19++;
            }
        } else {
            sVar.f314291b = ai3.d.d(point, b17, z17, false);
            sVar.f314292c = ai3.d.d(point, sVar.f314290a, z17, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraInfo", "final tryFindPreviewSizeAnyWayV1 prewViewSize %s cropSize %s findcount %d with any way", sVar.f314290a, sVar.f314291b, 0);
        return sVar;
    }
}
