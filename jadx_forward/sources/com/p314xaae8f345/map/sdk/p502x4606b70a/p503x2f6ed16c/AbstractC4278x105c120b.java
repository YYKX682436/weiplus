package com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c;

/* renamed from: com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC4278x105c120b implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df {

    /* renamed from: DEFAULT_GRADIENT */
    public static final com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 f16714x98298b8e;

    /* renamed from: DEFAULT_GRADIENT_COLORS */
    private static final int[] f16715x923ca741;

    /* renamed from: DEFAULT_GRADIENT_START_POINTS */
    private static final float[] f16716xd1c2891;

    /* renamed from: DEFAULT_OPACITY */
    public static final double f16717xf302dbcd = 0.6d;

    /* renamed from: DEFAULT_RADIUS */
    public static final int f16718x98868470 = 40;

    /* renamed from: MAX_RADIUS */
    private static final int f16719x5efffed = 50;

    /* renamed from: MIN_RADIUS */
    private static final int f16720x9947b73f = 10;

    /* renamed from: WORLD_WIDTH */
    static final double f16721x557de99 = 1.0d;

    /* renamed from: com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: data */
        private java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4279x85cd0d1d> f16722x2eefaa;

        /* renamed from: heatTileGenerator */
        private com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator f16724x4d0e13b5;

        /* renamed from: readyListener */
        private com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.OnHeatMapReadyListener f16727x7f36af77;

        /* renamed from: radius */
        private int f16726xc80e6c92 = 40;

        /* renamed from: gradient */
        private com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 f16723x557f730 = com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.f16714x98298b8e;

        /* renamed from: opacity */
        private double f16725xb477f80b = 0.6d;

        /* renamed from: build */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b m35564x59bc66e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7) {
            if (interfaceC25961x718093f7 != null) {
                return interfaceC25961x718093f7.mo37455x2de760a9().mo36657xbe21778f(this);
            }
            return null;
        }

        /* renamed from: data */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35565x2eefaa(java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> collection) {
            return m35577x93e9161(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.m35557x8402ff14(collection));
        }

        /* renamed from: getData */
        public java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4279x85cd0d1d> m35566xfb7e5820() {
            return this.f16722x2eefaa;
        }

        /* renamed from: getGradient */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 m35567x813234a6() {
            return this.f16723x557f730;
        }

        /* renamed from: getHeatTileGenerator */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator m35568xa0429aff() {
            return this.f16724x4d0e13b5;
        }

        /* renamed from: getOpacity */
        public double m35569xf24533d5() {
            return this.f16725xb477f80b;
        }

        /* renamed from: getRadius */
        public int m35570x2d258f88() {
            return this.f16726xc80e6c92;
        }

        /* renamed from: getReadyListener */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.OnHeatMapReadyListener m35571x3c966bc1() {
            return this.f16727x7f36af77;
        }

        /* renamed from: gradient */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35572x557f730(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 c4277x9325b50) {
            this.f16723x557f730 = c4277x9325b50;
            return this;
        }

        /* renamed from: opacity */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35573xb477f80b(double d17) {
            if (d17 < 0.0d || d17 > 1.0d) {
                throw new java.lang.IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            this.f16725xb477f80b = d17;
            return this;
        }

        /* renamed from: radius */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35574xc80e6c92(int i17) {
            if (i17 < 10 || i17 > 50) {
                throw new java.lang.IllegalArgumentException("Radius not within bounds.");
            }
            this.f16726xc80e6c92 = i17;
            return this;
        }

        /* renamed from: readyListener */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35575x7f36af77(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.OnHeatMapReadyListener onHeatMapReadyListener) {
            this.f16727x7f36af77 = onHeatMapReadyListener;
            return this;
        }

        /* renamed from: tileGenerator */
        public com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35576xf53d8bc5(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator heatTileGenerator) {
            this.f16724x4d0e13b5 = heatTileGenerator;
            return this;
        }

        /* renamed from: weightedData */
        public <T extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.Builder m35577x93e9161(java.util.Collection<T> collection) {
            if (collection.isEmpty()) {
                throw new java.lang.IllegalArgumentException("No input points.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t17 : collection) {
                arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4279x85cd0d1d(t17.m35663x74fbfbda(), t17.m35662x1d30897d()));
            }
            this.f16722x2eefaa = arrayList;
            return this;
        }
    }

    /* renamed from: com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider$HeatTileGenerator */
    /* loaded from: classes13.dex */
    public interface HeatTileGenerator {
        /* renamed from: generateColorMap */
        int[] m35578x42a8d38e(double d17);

        /* renamed from: generateKernel */
        double[] m35579x73bda212(int i17);
    }

    /* renamed from: com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider$OnHeatMapReadyListener */
    /* loaded from: classes13.dex */
    public interface OnHeatMapReadyListener {
        /* renamed from: onHeatMapReady */
        void m35580x20470b36();
    }

    static {
        int[] iArr = {android.graphics.Color.argb(0, 25, 0, 255), android.graphics.Color.argb(170, 30, 0, 255), android.graphics.Color.rgb(0, 191, 255), android.graphics.Color.rgb(0, 255, 0), android.graphics.Color.rgb(255, 255, 0), android.graphics.Color.rgb(255, 0, 0)};
        f16715x923ca741 = iArr;
        float[] fArr = {0.0f, 0.4f, 0.6f, 0.75f, 0.8f, 1.0f};
        f16716xd1c2891 = fArr;
        f16714x98298b8e = new com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50(iArr, fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapData */
    public static java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4279x85cd0d1d> m35557x8402ff14(java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4279x85cd0d1d(it.next()));
        }
        return arrayList;
    }

    /* renamed from: setData */
    public abstract void mo35558x76491f2c(java.util.Collection<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> collection);

    /* renamed from: setGradient */
    public abstract void mo35559x7bea95b2(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.C4277x9325b50 c4277x9325b50);

    /* renamed from: setHeatTileGenerator */
    public abstract void mo35560x7bd8a773(com.p314xaae8f345.map.sdk.p502x4606b70a.p503x2f6ed16c.AbstractC4278x105c120b.HeatTileGenerator heatTileGenerator);

    /* renamed from: setOpacity */
    public abstract void mo35561x65b68149(double d17);

    /* renamed from: setRadius */
    public abstract void mo35562x205ac394(int i17);

    /* renamed from: setWeightedData */
    public abstract <T extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> void mo35563xa07a1ee3(java.util.Collection<T> collection);
}
