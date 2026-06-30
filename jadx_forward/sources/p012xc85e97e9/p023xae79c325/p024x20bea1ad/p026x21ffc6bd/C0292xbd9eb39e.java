package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.ZoomStateImpl */
/* loaded from: classes14.dex */
class C0292xbd9eb39e implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e {

    /* renamed from: mLinearZoom */
    private float f580xe8cd04e5;

    /* renamed from: mMaxZoomRatio */
    private final float f581xa4840c01;

    /* renamed from: mMinZoomRatio */
    private final float f582xc0cb36d3;

    /* renamed from: mZoomRatio */
    private float f583xdc7bf20b;

    public C0292xbd9eb39e(float f17, float f18) {
        this.f581xa4840c01 = f17;
        this.f582xc0cb36d3 = f18;
    }

    /* renamed from: getPercentageByRatio */
    private float m3666x81ee5d44(float f17) {
        float f18 = this.f581xa4840c01;
        float f19 = this.f582xc0cb36d3;
        if (f18 == f19) {
            return 0.0f;
        }
        if (f17 == f18) {
            return 1.0f;
        }
        if (f17 == f19) {
            return 0.0f;
        }
        float f27 = 1.0f / f19;
        return ((1.0f / f17) - f27) / ((1.0f / f18) - f27);
    }

    /* renamed from: getRatioByPercentage */
    private float m3667x19170d46(float f17) {
        if (f17 == 1.0f) {
            return this.f581xa4840c01;
        }
        if (f17 == 0.0f) {
            return this.f582xc0cb36d3;
        }
        float f18 = this.f581xa4840c01;
        float f19 = this.f582xc0cb36d3;
        double d17 = 1.0f / f19;
        double d18 = 1.0d / (d17 + (((1.0f / f18) - d17) * f17));
        double d19 = f19;
        double d27 = f18;
        if (d18 < d19) {
            d18 = d19;
        } else if (d18 > d27) {
            d18 = d27;
        }
        return (float) d18;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getLinearZoom */
    public float mo3668xfadbc48e() {
        return this.f580xe8cd04e5;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getMaxZoomRatio */
    public float mo3669x6de1856a() {
        return this.f581xa4840c01;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getMinZoomRatio */
    public float mo3670x8a28b03c() {
        return this.f582xc0cb36d3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getZoomRatio */
    public float mo3671x61321942() {
        return this.f583xdc7bf20b;
    }

    /* renamed from: setLinearZoom */
    public void m3672x2900129a(float f17) {
        if (f17 <= 1.0f && f17 >= 0.0f) {
            this.f580xe8cd04e5 = f17;
            this.f583xdc7bf20b = m3667x19170d46(f17);
        } else {
            throw new java.lang.IllegalArgumentException("Requested linearZoom " + f17 + " is not within valid range [0..1]");
        }
    }

    /* renamed from: setZoomRatio */
    public void m3673xbd85d9b6(float f17) {
        if (f17 <= this.f581xa4840c01 && f17 >= this.f582xc0cb36d3) {
            this.f583xdc7bf20b = f17;
            this.f580xe8cd04e5 = m3666x81ee5d44(f17);
            return;
        }
        throw new java.lang.IllegalArgumentException("Requested zoomRatio " + f17 + " is not within valid range [" + this.f582xc0cb36d3 + " , " + this.f581xa4840c01 + "]");
    }
}
