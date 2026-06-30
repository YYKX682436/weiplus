package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public static double f50289a = 6378137.0d;

    /* renamed from: b, reason: collision with root package name */
    public static final double f50290b = 111319.49079327357d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f50291c = 0.017453292519943295d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f50292d = 6378137.0d * 6.283185307179586d;

    /* renamed from: e, reason: collision with root package name */
    private static final double f50293e = 0.017453292519943295d;

    /* renamed from: f, reason: collision with root package name */
    private static final double f50294f = 2.68435456E8d;

    public static boolean a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list, double d17) {
        long j17;
        double abs;
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2 = list;
        if (latLng == null || list2 == null || list.size() == 0 || d17 <= f50292d) {
            return false;
        }
        double d18 = d17 / 2.0d;
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds build = com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(list2).build();
        double lonEast = build.getLonEast() + d17;
        if (com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.from(build.getLatNorth() + d17, lonEast, build.getLatSouth() - d17, build.getLonWest() - d17).contains(latLng)) {
            int i17 = 0;
            while (i17 < list.size() - 1) {
                com.tencent.mapsdk.internal.lf.a a17 = com.tencent.mapsdk.internal.lf.a.a(list2.get(i17));
                int i18 = i17 + 1;
                com.tencent.mapsdk.internal.lf.a a18 = com.tencent.mapsdk.internal.lf.a.a(list2.get(i18));
                com.tencent.mapsdk.internal.lf.a a19 = com.tencent.mapsdk.internal.lf.a.a(latLng);
                com.tencent.mapsdk.internal.lf.a aVar = new com.tencent.mapsdk.internal.lf.a();
                aVar.f50295a = a18.f50295a - a17.f50295a;
                aVar.f50296b = a18.f50296b - a17.f50296b;
                com.tencent.mapsdk.internal.lf.a aVar2 = new com.tencent.mapsdk.internal.lf.a();
                aVar2.f50295a = a19.f50295a - a18.f50295a;
                aVar2.f50296b = a19.f50296b - a18.f50296b;
                com.tencent.mapsdk.internal.lf.a aVar3 = new com.tencent.mapsdk.internal.lf.a();
                double d19 = a19.f50295a - a17.f50295a;
                aVar3.f50295a = d19;
                double d27 = a19.f50296b - a17.f50296b;
                aVar3.f50296b = d27;
                double d28 = aVar.f50295a;
                double d29 = aVar2.f50295a * d28;
                double d37 = d18;
                double d38 = aVar.f50296b;
                double d39 = (d28 * d19) + (d38 * d27);
                if (d29 + (aVar2.f50296b * d38) > f50292d) {
                    double d47 = a19.f50296b - a18.f50296b;
                    double d48 = a19.f50295a - a18.f50295a;
                    abs = java.lang.Math.sqrt((d48 * d48) + (d47 * d47));
                    j17 = 0;
                } else {
                    j17 = 0;
                    if (d39 < f50292d) {
                        double d49 = a19.f50296b - a17.f50296b;
                        double d57 = a19.f50295a - a17.f50295a;
                        abs = java.lang.Math.sqrt((d57 * d57) + (d49 * d49));
                    } else {
                        abs = java.lang.Math.abs((d28 * d27) - (d38 * d19)) / java.lang.Math.sqrt((d28 * d28) + (d38 * d38));
                    }
                }
                if (abs <= d37) {
                    return true;
                }
                list2 = list;
                d18 = d37;
                i17 = i18;
            }
        }
        return false;
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        double f50295a;

        /* renamed from: b, reason: collision with root package name */
        double f50296b;

        private a(double d17, double d18) {
            this.f50295a = d17;
            this.f50296b = d18;
        }

        public static com.tencent.mapsdk.internal.lf.a a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
            return new com.tencent.mapsdk.internal.lf.a(latLng.x(), latLng.y());
        }

        public a() {
        }
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, double d17) {
        double lonEast = latLngBounds.getLonEast() + d17;
        return com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.from(latLngBounds.getLatNorth() + d17, lonEast, latLngBounds.getLatSouth() - d17, latLngBounds.getLonWest() - d17);
    }

    public static double a(double d17, double d18) {
        return (d17 * (f50294f / f50292d)) / java.lang.Math.cos(d18 * 0.017453292519943295d);
    }

    public static double a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        double d17 = f50292d;
        if (list == null || list.size() < 3) {
            return f50292d;
        }
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = list.get(i17);
            i17++;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = list.get(i17 % size);
            double cos = latLng.longitude * 111319.49079327357d * java.lang.Math.cos(latLng.latitude * 0.017453292519943295d);
            double d18 = latLng.latitude * 111319.49079327357d;
            d17 += (cos * (latLng2.latitude * 111319.49079327357d)) - (((latLng2.longitude * 111319.49079327357d) * java.lang.Math.cos(latLng2.latitude * 0.017453292519943295d)) * d18);
        }
        return java.lang.Math.abs(d17 / 2.0d);
    }

    private static double a(com.tencent.mapsdk.internal.lf.a aVar, com.tencent.mapsdk.internal.lf.a aVar2, com.tencent.mapsdk.internal.lf.a aVar3) {
        com.tencent.mapsdk.internal.lf.a aVar4 = new com.tencent.mapsdk.internal.lf.a();
        aVar4.f50295a = aVar2.f50295a - aVar.f50295a;
        aVar4.f50296b = aVar2.f50296b - aVar.f50296b;
        com.tencent.mapsdk.internal.lf.a aVar5 = new com.tencent.mapsdk.internal.lf.a();
        aVar5.f50295a = aVar3.f50295a - aVar2.f50295a;
        aVar5.f50296b = aVar3.f50296b - aVar2.f50296b;
        com.tencent.mapsdk.internal.lf.a aVar6 = new com.tencent.mapsdk.internal.lf.a();
        double d17 = aVar3.f50295a - aVar.f50295a;
        aVar6.f50295a = d17;
        double d18 = aVar3.f50296b - aVar.f50296b;
        aVar6.f50296b = d18;
        double d19 = aVar4.f50295a;
        double d27 = aVar5.f50295a * d19;
        double d28 = aVar4.f50296b;
        double d29 = (d19 * d17) + (d28 * d18);
        if (d27 + (aVar5.f50296b * d28) > f50292d) {
            double d37 = aVar3.f50296b - aVar2.f50296b;
            double d38 = aVar3.f50295a - aVar2.f50295a;
            return java.lang.Math.sqrt((d38 * d38) + (d37 * d37));
        }
        if (d29 < f50292d) {
            double d39 = aVar3.f50296b - aVar.f50296b;
            double d47 = aVar3.f50295a - aVar.f50295a;
            return java.lang.Math.sqrt((d47 * d47) + (d39 * d39));
        }
        return java.lang.Math.abs((d19 * d18) - (d28 * d17)) / java.lang.Math.sqrt((d19 * d19) + (d28 * d28));
    }
}
