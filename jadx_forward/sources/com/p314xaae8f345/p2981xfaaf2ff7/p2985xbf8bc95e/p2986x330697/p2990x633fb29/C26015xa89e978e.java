package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.CameraPosition */
/* loaded from: classes13.dex */
public final class C26015xa89e978e {

    /* renamed from: bearing */
    public final float f49412xf20877ae;

    /* renamed from: target */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49413xcb7e7191;

    /* renamed from: tilt */
    public final float f49414x3652bd;

    /* renamed from: zoom */
    public final float f49415x3923d3;

    public C26015xa89e978e(int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19) {
        this.f49413xcb7e7191 = c26041x873d1d26;
        this.f49415x3923d3 = f17;
        this.f49414x3652bd = f18;
        this.f49412xf20877ae = f19;
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99376xdc3ef9b() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder();
    }

    /* renamed from: fromLatLngZoom */
    public static final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e m99378x2bc6bd43(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(c26041x873d1d26, f17, 0.0f, 0.0f);
    }

    /* renamed from: equals */
    public final boolean m99379xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e)) {
            return false;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e) obj;
        return this.f49413xcb7e7191.m99507xb2c87fbf(c26015xa89e978e.f49413xcb7e7191) && java.lang.Float.floatToIntBits(this.f49415x3923d3) == java.lang.Float.floatToIntBits(c26015xa89e978e.f49415x3923d3) && java.lang.Float.floatToIntBits(this.f49414x3652bd) == java.lang.Float.floatToIntBits(c26015xa89e978e.f49414x3652bd) && java.lang.Float.floatToIntBits(this.f49412xf20877ae) == java.lang.Float.floatToIntBits(c26015xa89e978e.f49412xf20877ae);
    }

    /* renamed from: toString */
    public final java.lang.String m99380x9616526c() {
        return "latlng:" + this.f49413xcb7e7191.f49501xaa2bac6c + "," + this.f49413xcb7e7191.f49502x83009af + ",zoom:" + this.f49415x3923d3 + ",tilt=" + this.f49414x3652bd + ",bearing:" + this.f49412xf20877ae;
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99377xdc3ef9b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder(c26015xa89e978e);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.CameraPosition$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: p, reason: collision with root package name */
        private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f296883p;

        /* renamed from: q, reason: collision with root package name */
        private float f296884q;

        /* renamed from: r, reason: collision with root package name */
        private float f296885r;

        /* renamed from: s, reason: collision with root package name */
        private float f296886s;

        public Builder() {
            this.f296885r = Float.MIN_VALUE;
            this.f296886s = Float.MIN_VALUE;
        }

        /* renamed from: bearing */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99381xf20877ae(float f17) {
            this.f296886s = f17;
            return this;
        }

        /* renamed from: build */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e m99382x59bc66e() {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(this.f296883p, this.f296884q, this.f296885r, this.f296886s);
        }

        /* renamed from: target */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99383xcb7e7191(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
            this.f296883p = c26041x873d1d26;
            return this;
        }

        /* renamed from: tilt */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99384x3652bd(float f17) {
            this.f296885r = f17;
            return this;
        }

        /* renamed from: zoom */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.Builder m99385x3923d3(float f17) {
            this.f296884q = f17;
            return this;
        }

        public Builder(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
            this.f296885r = Float.MIN_VALUE;
            this.f296886s = Float.MIN_VALUE;
            this.f296883p = c26015xa89e978e.f49413xcb7e7191;
            this.f296884q = c26015xa89e978e.f49415x3923d3;
            this.f296885r = c26015xa89e978e.f49414x3652bd;
            this.f296886s = c26015xa89e978e.f49412xf20877ae;
        }
    }

    public C26015xa89e978e(double d17, double d18, float f17, float f18, float f19) {
        this(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d17, d18), f17, f19, f18);
    }

    public C26015xa89e978e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19) {
        this(1, c26041x873d1d26, f17, f18, f19);
    }
}
