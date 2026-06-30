package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle */
/* loaded from: classes13.dex */
public class C26067xc981814a {

    /* renamed from: candidatePositions */
    private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0[] f49615xa6d9a27;

    /* renamed from: color */
    private final int f49616x5a72f63;

    /* renamed from: effect */
    private final int f49617xb226b991;

    /* renamed from: fontSize */
    private final float f49618x15caa0f0;

    /* renamed from: haloColor */
    private final int f49619xaa8e4487;

    /* renamed from: haloSize */
    private final float f49620xfd45965d;

    /* renamed from: hideWhenAvoidFailed */
    private final boolean f49621xd58410d6;

    /* renamed from: iconSpace */
    private final float f49622xac74a80d;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: candidatePositions */
        private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0[] f49623xa6d9a27 = {com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0.BOTTOM, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0.LEFT, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0.RIGHT, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0.TOP};

        /* renamed from: color */
        private int f49624x5a72f63 = -13421773;

        /* renamed from: fontSize */
        private float f49626x15caa0f0 = 12.0f;

        /* renamed from: haloSize */
        private float f49628xfd45965d = 1.0f;

        /* renamed from: haloColor */
        private int f49627xaa8e4487 = -1;

        /* renamed from: iconSpace */
        private float f49630xac74a80d = 2.0f;

        /* renamed from: effect */
        private int f49625xb226b991 = 0;

        /* renamed from: hideWhenAvoidFailed */
        private boolean f49629xd58410d6 = true;

        /* renamed from: build */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a m99746x59bc66e() {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a(this);
        }

        /* renamed from: candidatePositions */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99747xa6d9a27(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0... enumC26066x2b22e2f0Arr) {
            if (enumC26066x2b22e2f0Arr != null) {
                this.f49623xa6d9a27 = enumC26066x2b22e2f0Arr;
            }
            return this;
        }

        /* renamed from: color */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99748x5a72f63(int i17) {
            this.f49624x5a72f63 = i17;
            return this;
        }

        /* renamed from: effect */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99749xb226b991(int i17) {
            this.f49625xb226b991 = i17;
            return this;
        }

        /* renamed from: fontSize */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99750x15caa0f0(float f17) {
            this.f49626x15caa0f0 = f17;
            return this;
        }

        /* renamed from: haloColor */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99751xaa8e4487(int i17) {
            this.f49627xaa8e4487 = i17;
            return this;
        }

        /* renamed from: haloSize */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99752xfd45965d(float f17) {
            this.f49628xfd45965d = java.lang.Math.min(java.lang.Math.max(f17, 0.0f), 3.0f);
            return this;
        }

        /* renamed from: hideWhenAvoidFailed */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99753xd58410d6(boolean z17) {
            this.f49629xd58410d6 = z17;
            return this;
        }

        /* renamed from: iconSpace */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder m99754xac74a80d(float f17) {
            this.f49630xac74a80d = f17;
            return this;
        }
    }

    /* renamed from: getCandidatePositions */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26066x2b22e2f0[] m99730x1dc9fc1d() {
        return this.f49615xa6d9a27;
    }

    /* renamed from: getColor */
    public int m99731x7444d5ad() {
        return this.f49616x5a72f63;
    }

    /* renamed from: getEffect */
    public int m99732x173ddc87() {
        return this.f49617xb226b991;
    }

    /* renamed from: getFontSize */
    public float m99733x91a4de66() {
        return this.f49618x15caa0f0;
    }

    /* renamed from: getHaloColor */
    public int m99734xa9fbb5d1() {
        return this.f49619xaa8e4487;
    }

    /* renamed from: getHaloSize */
    public float m99735x791fd3d3() {
        return this.f49620xfd45965d;
    }

    /* renamed from: getIconSpace */
    public float m99736xabe21957() {
        return this.f49622xac74a80d;
    }

    /* renamed from: isHideWhenAvoidFailed */
    public boolean m99737x58a7d74c() {
        return this.f49621xd58410d6;
    }

    private C26067xc981814a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder builder) {
        this.f49615xa6d9a27 = builder.f49623xa6d9a27;
        this.f49616x5a72f63 = builder.f49624x5a72f63;
        this.f49618x15caa0f0 = builder.f49626x15caa0f0;
        this.f49620xfd45965d = builder.f49628xfd45965d;
        this.f49619xaa8e4487 = builder.f49627xaa8e4487;
        this.f49622xac74a80d = builder.f49630xac74a80d;
        this.f49617xb226b991 = builder.f49625xb226b991;
        this.f49621xd58410d6 = builder.f49629xd58410d6;
    }
}
