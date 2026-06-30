package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes14.dex */
public final class b {
    public static com.tencent.liteav.base.util.Size a(java.util.List<com.tencent.liteav.base.util.Size> list, com.tencent.liteav.base.util.k kVar, int i17, int i18) {
        double d17;
        com.tencent.liteav.base.util.Size size = new com.tencent.liteav.base.util.Size(i17, i18);
        com.tencent.liteav.base.util.LiteavLog.i("CameraSupervisor", "preview wanted: " + size + " cameraRotation:" + kVar);
        if (list == null) {
            com.tencent.liteav.base.util.LiteavLog.e("CameraSupervisor", "findBestMatchedPreviewSize getPreviewSizes null");
            return size;
        }
        if (kVar == com.tencent.liteav.base.util.k.ROTATION_90 || kVar == com.tencent.liteav.base.util.k.ROTATION_270) {
            size.swap();
        }
        double aspectRatio = size.aspectRatio();
        com.tencent.liteav.base.util.Size size2 = new com.tencent.liteav.base.util.Size(640, 640);
        int i19 = size.width;
        int i27 = size2.width;
        if (i19 <= i27 && size.height <= size2.height) {
            size2.set(size);
        } else {
            int i28 = size.height;
            if (i19 > i28) {
                size2.height = (i27 * i28) / i19;
            } else {
                size2.width = (size2.height * i19) / i28;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = Long.MAX_VALUE;
        for (com.tencent.liteav.base.util.Size size3 : list) {
            sb6.append(size3);
            sb6.append(", ");
            long round = (size3.width < size2.width || size3.height < size2.height) ? Long.MAX_VALUE : java.lang.Math.round(java.lang.Math.abs(size3.aspectRatio() - aspectRatio) * 10.0d);
            if (round < j17) {
                arrayList.clear();
                arrayList.add(size3);
                j17 = round;
            } else if (round == j17) {
                arrayList.add(size3);
            }
        }
        com.tencent.liteav.base.util.LiteavLog.i("CameraSupervisor", "support preview size list: ".concat(java.lang.String.valueOf(sb6)));
        java.util.Collections.sort(arrayList, com.tencent.liteav.videoproducer.capture.c.a());
        com.tencent.liteav.base.util.Size size4 = (com.tencent.liteav.base.util.Size) arrayList.get(0);
        int area = size.getArea();
        java.util.Iterator it = arrayList.iterator();
        double d18 = Double.MAX_VALUE;
        while (it.hasNext()) {
            com.tencent.liteav.base.util.Size size5 = (com.tencent.liteav.base.util.Size) it.next();
            com.tencent.liteav.base.util.LiteavLog.i("CameraSupervisor", "size in same buck ".concat(java.lang.String.valueOf(size5)));
            if (aspectRatio > size5.aspectRatio()) {
                int i29 = size5.width;
                d17 = (i29 * i29) / aspectRatio;
            } else {
                int i37 = size5.height;
                d17 = i37 * i37 * aspectRatio;
            }
            double d19 = area;
            if (d17 / d19 >= 0.9d) {
                double d27 = d17 - d19;
                if (java.lang.Math.abs(d27) < d18) {
                    d18 = java.lang.Math.abs(d27);
                    size4 = size5;
                }
            }
        }
        com.tencent.liteav.base.util.LiteavLog.i("CameraSupervisor", "best match preview size ".concat(java.lang.String.valueOf(size4)));
        return new com.tencent.liteav.base.util.Size(size4.width, size4.height);
    }

    public static com.tencent.liteav.videoproducer.a.a a(com.tencent.liteav.videoproducer.a.a[] aVarArr, int i17, boolean z17) {
        if (aVarArr != null && aVarArr.length != 0) {
            int i18 = 0;
            for (com.tencent.liteav.videoproducer.a.a aVar : aVarArr) {
                com.tencent.liteav.base.util.LiteavLog.i("CameraSupervisor", "supported fps range: ".concat(java.lang.String.valueOf(aVar)));
            }
            if (z17) {
                java.util.Arrays.sort(aVarArr, com.tencent.liteav.videoproducer.capture.d.a());
                int length = aVarArr.length;
                while (i18 < length) {
                    com.tencent.liteav.videoproducer.a.a aVar2 = aVarArr[i18];
                    if (aVar2.f46990a >= i17) {
                        return aVar2;
                    }
                    i18++;
                }
            } else {
                java.util.Arrays.sort(aVarArr, com.tencent.liteav.videoproducer.capture.e.a());
                int length2 = aVarArr.length;
                while (i18 < length2) {
                    com.tencent.liteav.videoproducer.a.a aVar3 = aVarArr[i18];
                    if (aVar3.f46990a <= i17 && i17 <= aVar3.f46991b) {
                        return aVar3;
                    }
                    i18++;
                }
            }
        }
        return null;
    }
}
