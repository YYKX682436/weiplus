package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ld {
    private static double a(int i17, int i18, int i19, float f17) {
        double d17 = 1.0d - f17;
        return (d17 * d17 * i17) + (2.0f * f17 * d17 * i18) + (f17 * f17 * i19);
    }

    private static float a(int i17, int i18, int i19, int i27, float f17) {
        float f18 = (i18 - i17) * 3.0f;
        float f19 = ((i19 - i18) * 3.0f) - f18;
        float f27 = ((i27 - i17) - f18) - f19;
        float f28 = f17 * f17;
        return (f27 * f28 * f17) + (f19 * f28) + (f18 * f17) + i17;
    }

    private static int a(java.util.List<com.tencent.map.lib.models.GeoPoint> list, int[] iArr, com.tencent.mapsdk.internal.ey eyVar) {
        int size;
        int i17 = 0;
        if (list == null || (size = list.size()) < 2) {
            return 0;
        }
        int i18 = 0;
        while (i17 < size - 1) {
            com.tencent.map.lib.models.GeoPoint geoPoint = list.get(i17);
            int i19 = i17 + 1;
            com.tencent.map.lib.models.GeoPoint geoPoint2 = list.get(i19);
            com.tencent.mapsdk.internal.fu a17 = eyVar.a(geoPoint);
            com.tencent.mapsdk.internal.fu a18 = eyVar.a(geoPoint2);
            double d17 = a18.f49467a - a17.f49467a;
            double d18 = a18.f49468b - a17.f49468b;
            int sqrt = (int) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
            int max = sqrt / java.lang.Math.max(4, (sqrt / 500) * 4);
            iArr[i17] = max;
            i18 += max;
            i17 = i19;
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.tencent.map.lib.models.GeoPoint> a(java.util.List<com.tencent.map.lib.models.GeoPoint> r16, int r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ld.a(java.util.List, int):java.util.List");
    }

    private static com.tencent.map.lib.models.GeoPoint a(java.util.List<com.tencent.map.lib.models.GeoPoint> list, float f17) {
        int size;
        if (list == null || list.isEmpty() || !((size = list.size()) == 3 || size == 4)) {
            return null;
        }
        if (size == 3) {
            com.tencent.map.lib.models.GeoPoint geoPoint = list.get(0);
            com.tencent.map.lib.models.GeoPoint geoPoint2 = list.get(1);
            com.tencent.map.lib.models.GeoPoint geoPoint3 = list.get(2);
            if (geoPoint == null || geoPoint2 == null || geoPoint3 == null) {
                return null;
            }
            return new com.tencent.map.lib.models.GeoPoint((int) a(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6(), geoPoint3.getLatitudeE6(), f17), (int) a(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6(), geoPoint3.getLongitudeE6(), f17));
        }
        com.tencent.map.lib.models.GeoPoint geoPoint4 = list.get(0);
        com.tencent.map.lib.models.GeoPoint geoPoint5 = list.get(1);
        com.tencent.map.lib.models.GeoPoint geoPoint6 = list.get(2);
        com.tencent.map.lib.models.GeoPoint geoPoint7 = list.get(3);
        if (geoPoint4 != null && geoPoint5 != null && geoPoint6 != null && geoPoint7 != null) {
            return new com.tencent.map.lib.models.GeoPoint((int) a(geoPoint4.getLatitudeE6(), geoPoint5.getLatitudeE6(), geoPoint6.getLatitudeE6(), geoPoint7.getLatitudeE6(), f17), (int) a(geoPoint4.getLongitudeE6(), geoPoint5.getLongitudeE6(), geoPoint6.getLongitudeE6(), geoPoint7.getLongitudeE6(), f17));
        }
        return null;
    }

    private static double a(com.tencent.mapsdk.internal.fu fuVar, com.tencent.mapsdk.internal.fu fuVar2) {
        double d17 = fuVar2.f49467a - fuVar.f49467a;
        double d18 = fuVar2.f49468b - fuVar.f49468b;
        return java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
    }
}
