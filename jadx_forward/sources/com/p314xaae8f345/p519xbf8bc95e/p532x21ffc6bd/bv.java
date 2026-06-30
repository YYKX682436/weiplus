package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bv extends com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b {

    /* renamed from: a, reason: collision with root package name */
    static final double f130561a = 1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f130562b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final int f130563c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f130564d = 1280;

    /* renamed from: e, reason: collision with root package name */
    private static final int f130565e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static final int f130566f = 11;

    /* renamed from: g, reason: collision with root package name */
    private static final int f130567g = 22;

    /* renamed from: h, reason: collision with root package name */
    private final com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.OnHeatMapReadyListener f130568h;

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator f130569i;

    /* renamed from: j, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> f130570j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> f130571k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft f130572l;

    /* renamed from: m, reason: collision with root package name */
    private int f130573m;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 f130574n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f130575o;

    /* renamed from: p, reason: collision with root package name */
    private double[] f130576p;

    /* renamed from: q, reason: collision with root package name */
    private double f130577q;

    /* renamed from: r, reason: collision with root package name */
    private double[] f130578r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f130579s;

    /* renamed from: com.tencent.mapsdk.internal.bv$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {
        public AnonymousClass1() {
        }

        private java.lang.Boolean a() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130579s) {
                return java.lang.Boolean.FALSE;
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130569i != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
                bvVar.f130576p = bvVar.f130569i.m35579x73bda212(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130573m);
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
                bvVar2.f130576p = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.a(bvVar2.f130573m, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130573m / 3.0d);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
            bvVar3.mo35559x7bea95b2(bvVar3.f130574n);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
            bvVar4.a(bvVar4.f130571k);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this);
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130568h != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130568h.m35580x20470b36();
            }
            return java.lang.Boolean.TRUE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130579s) {
                return java.lang.Boolean.FALSE;
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130569i != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
                bvVar.f130576p = bvVar.f130569i.m35579x73bda212(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130573m);
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
                bvVar2.f130576p = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.a(bvVar2.f130573m, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130573m / 3.0d);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
            bvVar3.mo35559x7bea95b2(bvVar3.f130574n);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this;
            bvVar4.a(bvVar4.f130571k);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this);
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130568h != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.this.f130568h.m35580x20470b36();
            }
            return java.lang.Boolean.TRUE;
        }
    }

    public bv(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder builder) {
        this.f130571k = d(builder.m35566xfb7e5820());
        this.f130573m = builder.m35570x2d258f88();
        this.f130574n = builder.m35567x813234a6();
        this.f130577q = builder.m35569xf24533d5();
        this.f130568h = builder.m35571x3c966bc1();
        this.f130569i = builder.m35568xa0429aff();
        if (this.f130571k != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.AnonymousClass1()).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
    }

    public static /* synthetic */ boolean f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv bvVar) {
        bvVar.f130579s = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df
    /* renamed from: getTile */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce mo36666xfb85bb24(int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.mo36666xfb85bb24(int, int, int):com.tencent.tencentmap.mapsdk.maps.model.Tile");
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setData */
    public final void mo35558x76491f2c(java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw(it.next()));
        }
        a(arrayList);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setGradient */
    public final void mo35559x7bea95b2(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 c4277x9325b50) {
        this.f130574n = c4277x9325b50;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator heatTileGenerator = this.f130569i;
        if (heatTileGenerator != null) {
            this.f130575o = heatTileGenerator.m35578x42a8d38e(this.f130577q);
        } else {
            this.f130575o = c4277x9325b50.m35604x42a8d38e(this.f130577q);
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setHeatTileGenerator */
    public final void mo35560x7bd8a773(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator heatTileGenerator) {
        this.f130569i = heatTileGenerator;
        if (heatTileGenerator != null) {
            this.f130576p = heatTileGenerator.m35579x73bda212(this.f130573m);
            this.f130575o = this.f130569i.m35578x42a8d38e(this.f130577q);
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setOpacity */
    public final void mo35561x65b68149(double d17) {
        this.f130577q = d17;
        mo35559x7bea95b2(this.f130574n);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setRadius */
    public final void mo35562x205ac394(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.f130573m = i17;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator heatTileGenerator = this.f130569i;
        if (heatTileGenerator != null) {
            this.f130576p = heatTileGenerator.m35579x73bda212(i17);
        } else {
            this.f130576p = a(i17, i17 / 3.0d);
        }
        this.f130578r = a(this.f130573m);
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b
    /* renamed from: setWeightedData */
    public final <T extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> void mo35563xa07a1ee3(java.util.Collection<T> collection) {
        a(d(collection));
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft b(java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> collection) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> it = collection.iterator();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = it.next().f130583b;
        double d17 = fuVar.f131000a;
        double d18 = d17;
        double d19 = fuVar.f131001b;
        double d27 = d19;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = it.next().f130583b;
            double d28 = fuVar2.f131000a;
            double d29 = fuVar2.f131001b;
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
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft(d17, d18, d19, d27);
    }

    private static java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> c(java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw(it.next()));
        }
        return arrayList;
    }

    private static <T extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> d(java.util.Collection<T> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : collection) {
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw(t17.m35663x74fbfbda(), t17.m35662x1d30897d()));
        }
        return arrayList;
    }

    private void a() {
        if (this.f130571k != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bv.AnonymousClass1()).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
    }

    public final void a(java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> collection) {
        this.f130571k = collection;
        if (!collection.isEmpty()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft b17 = b(this.f130571k);
            this.f130572l = b17;
            this.f130570j = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<>(b17);
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> it = this.f130571k.iterator();
            while (it.hasNext()) {
                this.f130570j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw>) it.next());
            }
            this.f130578r = a(this.f130573m);
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
            dArr[i19] = a(this.f130571k, this.f130572l, i17, (int) (java.lang.Math.pow(2.0d, i19 - 3) * 1280.0d));
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

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce a(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce(256, 256, byteArrayOutputStream.toByteArray());
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

    private static double a(java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw> collection, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar, int i17, int i18) {
        double d17 = ftVar.f130994a;
        double d18 = ftVar.f130996c;
        double d19 = ftVar.f130995b;
        double d27 = d18 - d17;
        double d28 = ftVar.f130997d - d19;
        if (d27 <= d28) {
            d27 = d28;
        }
        double d29 = ((int) ((i18 / (i17 * 2)) + 0.5d)) / d27;
        java.util.HashMap hashMap = new java.util.HashMap();
        double d37 = 0.0d;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bw bwVar : collection) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = bwVar.f130583b;
            double d38 = fuVar.f131000a;
            double d39 = fuVar.f131001b;
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
            java.lang.Double valueOf = java.lang.Double.valueOf(d47.doubleValue() + bwVar.f130584c);
            map.put(java.lang.Integer.valueOf(i27), valueOf);
            if (valueOf.doubleValue() > d37) {
                d37 = valueOf.doubleValue();
            }
        }
        return d37;
    }
}
