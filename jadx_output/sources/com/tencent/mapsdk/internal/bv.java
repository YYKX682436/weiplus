package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bv extends com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider {

    /* renamed from: a, reason: collision with root package name */
    static final double f49028a = 1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f49029b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final int f49030c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f49031d = 1280;

    /* renamed from: e, reason: collision with root package name */
    private static final int f49032e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static final int f49033f = 11;

    /* renamed from: g, reason: collision with root package name */
    private static final int f49034g = 22;

    /* renamed from: h, reason: collision with root package name */
    private final com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.OnHeatMapReadyListener f49035h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator f49036i;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gd<com.tencent.mapsdk.internal.bw> f49037j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.Collection<com.tencent.mapsdk.internal.bw> f49038k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ft f49039l;

    /* renamed from: m, reason: collision with root package name */
    private int f49040m;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.map.sdk.utilities.heatmap.Gradient f49041n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f49042o;

    /* renamed from: p, reason: collision with root package name */
    private double[] f49043p;

    /* renamed from: q, reason: collision with root package name */
    private double f49044q;

    /* renamed from: r, reason: collision with root package name */
    private double[] f49045r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f49046s;

    /* renamed from: com.tencent.mapsdk.internal.bv$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {
        public AnonymousClass1() {
        }

        private java.lang.Boolean a() {
            if (com.tencent.mapsdk.internal.bv.this.f49046s) {
                return java.lang.Boolean.FALSE;
            }
            if (com.tencent.mapsdk.internal.bv.this.f49036i != null) {
                com.tencent.mapsdk.internal.bv bvVar = com.tencent.mapsdk.internal.bv.this;
                bvVar.f49043p = bvVar.f49036i.generateKernel(com.tencent.mapsdk.internal.bv.this.f49040m);
            } else {
                com.tencent.mapsdk.internal.bv bvVar2 = com.tencent.mapsdk.internal.bv.this;
                bvVar2.f49043p = com.tencent.mapsdk.internal.bv.a(bvVar2.f49040m, com.tencent.mapsdk.internal.bv.this.f49040m / 3.0d);
            }
            com.tencent.mapsdk.internal.bv bvVar3 = com.tencent.mapsdk.internal.bv.this;
            bvVar3.setGradient(bvVar3.f49041n);
            com.tencent.mapsdk.internal.bv bvVar4 = com.tencent.mapsdk.internal.bv.this;
            bvVar4.a(bvVar4.f49038k);
            com.tencent.mapsdk.internal.bv.f(com.tencent.mapsdk.internal.bv.this);
            if (com.tencent.mapsdk.internal.bv.this.f49035h != null) {
                com.tencent.mapsdk.internal.bv.this.f49035h.onHeatMapReady();
            }
            return java.lang.Boolean.TRUE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            if (com.tencent.mapsdk.internal.bv.this.f49046s) {
                return java.lang.Boolean.FALSE;
            }
            if (com.tencent.mapsdk.internal.bv.this.f49036i != null) {
                com.tencent.mapsdk.internal.bv bvVar = com.tencent.mapsdk.internal.bv.this;
                bvVar.f49043p = bvVar.f49036i.generateKernel(com.tencent.mapsdk.internal.bv.this.f49040m);
            } else {
                com.tencent.mapsdk.internal.bv bvVar2 = com.tencent.mapsdk.internal.bv.this;
                bvVar2.f49043p = com.tencent.mapsdk.internal.bv.a(bvVar2.f49040m, com.tencent.mapsdk.internal.bv.this.f49040m / 3.0d);
            }
            com.tencent.mapsdk.internal.bv bvVar3 = com.tencent.mapsdk.internal.bv.this;
            bvVar3.setGradient(bvVar3.f49041n);
            com.tencent.mapsdk.internal.bv bvVar4 = com.tencent.mapsdk.internal.bv.this;
            bvVar4.a(bvVar4.f49038k);
            com.tencent.mapsdk.internal.bv.f(com.tencent.mapsdk.internal.bv.this);
            if (com.tencent.mapsdk.internal.bv.this.f49035h != null) {
                com.tencent.mapsdk.internal.bv.this.f49035h.onHeatMapReady();
            }
            return java.lang.Boolean.TRUE;
        }
    }

    public bv(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder builder) {
        this.f49038k = d(builder.getData());
        this.f49040m = builder.getRadius();
        this.f49041n = builder.getGradient();
        this.f49044q = builder.getOpacity();
        this.f49035h = builder.getReadyListener();
        this.f49036i = builder.getHeatTileGenerator();
        if (this.f49038k != null) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.bv.AnonymousClass1()).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
    }

    public static /* synthetic */ boolean f(com.tencent.mapsdk.internal.bv bvVar) {
        bvVar.f49046s = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.tencentmap.mapsdk.maps.model.Tile getTile(int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bv.getTile(int, int, int):com.tencent.tencentmap.mapsdk.maps.model.Tile");
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setData(java.util.Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mapsdk.internal.bw(it.next()));
        }
        a(arrayList);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setGradient(com.tencent.map.sdk.utilities.heatmap.Gradient gradient) {
        this.f49041n = gradient;
        com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator = this.f49036i;
        if (heatTileGenerator != null) {
            this.f49042o = heatTileGenerator.generateColorMap(this.f49044q);
        } else {
            this.f49042o = gradient.generateColorMap(this.f49044q);
        }
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setHeatTileGenerator(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator) {
        this.f49036i = heatTileGenerator;
        if (heatTileGenerator != null) {
            this.f49043p = heatTileGenerator.generateKernel(this.f49040m);
            this.f49042o = this.f49036i.generateColorMap(this.f49044q);
        }
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setOpacity(double d17) {
        this.f49044q = d17;
        setGradient(this.f49041n);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setRadius(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.f49040m = i17;
        com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator = this.f49036i;
        if (heatTileGenerator != null) {
            this.f49043p = heatTileGenerator.generateKernel(i17);
        } else {
            this.f49043p = a(i17, i17 / 3.0d);
        }
        this.f49045r = a(this.f49040m);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> void setWeightedData(java.util.Collection<T> collection) {
        a(d(collection));
    }

    private static com.tencent.mapsdk.internal.ft b(java.util.Collection<com.tencent.mapsdk.internal.bw> collection) {
        java.util.Iterator<com.tencent.mapsdk.internal.bw> it = collection.iterator();
        com.tencent.mapsdk.internal.fu fuVar = it.next().f49050b;
        double d17 = fuVar.f49467a;
        double d18 = d17;
        double d19 = fuVar.f49468b;
        double d27 = d19;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.fu fuVar2 = it.next().f49050b;
            double d28 = fuVar2.f49467a;
            double d29 = fuVar2.f49468b;
            if (d28 < d17) {
                d17 = d28;
            }
            if (d28 > d18) {
                d18 = d28;
            }
            if (d29 < d19) {
                d19 = d29;
            }
            if (d29 > d27) {
                d27 = d29;
            }
        }
        return new com.tencent.mapsdk.internal.ft(d17, d18, d19, d27);
    }

    private static java.util.Collection<com.tencent.mapsdk.internal.bw> c(java.util.Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mapsdk.internal.bw(it.next()));
        }
        return arrayList;
    }

    private static <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> java.util.Collection<com.tencent.mapsdk.internal.bw> d(java.util.Collection<T> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : collection) {
            arrayList.add(new com.tencent.mapsdk.internal.bw(t17.getPoint(), t17.getIntensity()));
        }
        return arrayList;
    }

    private void a() {
        if (this.f49038k != null) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.bv.AnonymousClass1()).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
    }

    public final void a(java.util.Collection<com.tencent.mapsdk.internal.bw> collection) {
        this.f49038k = collection;
        if (!collection.isEmpty()) {
            com.tencent.mapsdk.internal.ft b17 = b(this.f49038k);
            this.f49039l = b17;
            this.f49037j = new com.tencent.mapsdk.internal.gd<>(b17);
            java.util.Iterator<com.tencent.mapsdk.internal.bw> it = this.f49038k.iterator();
            while (it.hasNext()) {
                this.f49037j.a((com.tencent.mapsdk.internal.gd<com.tencent.mapsdk.internal.bw>) it.next());
            }
            this.f49045r = a(this.f49040m);
            return;
        }
        throw new java.lang.IllegalArgumentException("No input points.");
    }

    private double[] a(int i17) {
        int i18;
        double[] dArr = new double[22];
        int i19 = 5;
        while (true) {
            if (i19 >= 11) {
                break;
            }
            dArr[i19] = a(this.f49038k, this.f49039l, i17, (int) (java.lang.Math.pow(2.0d, i19 - 3) * 1280.0d));
            if (i19 == 5) {
                for (int i27 = 0; i27 < i19; i27++) {
                    dArr[i27] = dArr[i19];
                }
            }
            i19++;
        }
        for (i18 = 11; i18 < 22; i18++) {
            dArr[i18] = dArr[10];
        }
        return dArr;
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.Tile a(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new com.tencent.tencentmap.mapsdk.maps.model.Tile(256, 256, byteArrayOutputStream.toByteArray());
    }

    public static double[] a(int i17, double d17) {
        double[] dArr = new double[(i17 * 2) + 1];
        for (int i18 = -i17; i18 <= i17; i18++) {
            dArr[i18 + i17] = java.lang.Math.exp(((-i18) * i18) / ((2.0d * d17) * d17));
        }
        return dArr;
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
        int floor = (int) java.lang.Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i17 = length - (floor * 2);
        int i18 = (floor + i17) - 1;
        double[][] dArr3 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, length, length);
        for (int i19 = 0; i19 < length; i19++) {
            for (int i27 = 0; i27 < length; i27++) {
                double d17 = dArr[i19][i27];
                if (d17 != 0.0d) {
                    int i28 = i19 + floor;
                    if (i18 < i28) {
                        i28 = i18;
                    }
                    int i29 = i28 + 1;
                    int i37 = i19 - floor;
                    for (int i38 = floor > i37 ? floor : i37; i38 < i29; i38++) {
                        double[] dArr4 = dArr3[i38];
                        dArr4[i27] = dArr4[i27] + (dArr2[i38 - i37] * d17);
                    }
                }
            }
        }
        double[][] dArr5 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i17, i17);
        for (int i39 = floor; i39 < i18 + 1; i39++) {
            for (int i47 = 0; i47 < length; i47++) {
                double d18 = dArr3[i39][i47];
                if (d18 != 0.0d) {
                    int i48 = i47 + floor;
                    if (i18 < i48) {
                        i48 = i18;
                    }
                    int i49 = i48 + 1;
                    int i57 = i47 - floor;
                    for (int i58 = floor > i57 ? floor : i57; i58 < i49; i58++) {
                        double[] dArr6 = dArr5[i39 - floor];
                        int i59 = i58 - floor;
                        dArr6[i59] = dArr6[i59] + (dArr2[i58 - i57] * d18);
                    }
                }
            }
        }
        return dArr5;
    }

    private static android.graphics.Bitmap a(double[][] dArr, int[] iArr, double d17) {
        int i17 = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d17;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i18 = 0; i18 < length2; i18++) {
            for (int i19 = 0; i19 < length2; i19++) {
                double d18 = dArr[i19][i18];
                int i27 = (i18 * length2) + i19;
                int i28 = (int) (d18 * length);
                if (d18 != 0.0d) {
                    if (i28 < iArr.length) {
                        iArr2[i27] = iArr[i28];
                    } else {
                        iArr2[i27] = i17;
                    }
                } else {
                    iArr2[i27] = 0;
                }
            }
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(length2, length2, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static double a(java.util.Collection<com.tencent.mapsdk.internal.bw> collection, com.tencent.mapsdk.internal.ft ftVar, int i17, int i18) {
        double d17 = ftVar.f49461a;
        double d18 = ftVar.f49463c;
        double d19 = ftVar.f49462b;
        double d27 = d18 - d17;
        double d28 = ftVar.f49464d - d19;
        if (d27 <= d28) {
            d27 = d28;
        }
        double d29 = ((int) ((i18 / (i17 * 2)) + 0.5d)) / d27;
        java.util.HashMap hashMap = new java.util.HashMap();
        double d37 = 0.0d;
        for (com.tencent.mapsdk.internal.bw bwVar : collection) {
            com.tencent.mapsdk.internal.fu fuVar = bwVar.f49050b;
            double d38 = fuVar.f49467a;
            double d39 = fuVar.f49468b;
            int i19 = (int) ((d38 - d17) * d29);
            int i27 = (int) ((d39 - d19) * d29);
            java.util.Map map = (java.util.Map) hashMap.get(java.lang.Integer.valueOf(i19));
            if (map == null) {
                map = new java.util.HashMap();
                hashMap.put(java.lang.Integer.valueOf(i19), map);
            }
            java.lang.Double d47 = (java.lang.Double) map.get(java.lang.Integer.valueOf(i27));
            if (d47 == null) {
                d47 = java.lang.Double.valueOf(0.0d);
            }
            java.lang.Double valueOf = java.lang.Double.valueOf(d47.doubleValue() + bwVar.f49051c);
            map.put(java.lang.Integer.valueOf(i27), valueOf);
            if (valueOf.doubleValue() > d37) {
                d37 = valueOf.doubleValue();
            }
        }
        return d37;
    }
}
