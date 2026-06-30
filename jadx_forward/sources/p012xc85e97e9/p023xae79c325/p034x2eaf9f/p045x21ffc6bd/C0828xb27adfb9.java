package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.AutoValue_ImmutableZoomState */
/* loaded from: classes14.dex */
final class C0828xb27adfb9 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c {

    /* renamed from: linearZoom */
    private final float f2051xc9b0c98;

    /* renamed from: maxZoomRatio */
    private final float f2052xceef2f4;

    /* renamed from: minZoomRatio */
    private final float f2053x29361dc6;

    /* renamed from: zoomRatio */
    private final float f2054x61c4a7f8;

    public C0828xb27adfb9(float f17, float f18, float f19, float f27) {
        this.f2054x61c4a7f8 = f17;
        this.f2052xceef2f4 = f18;
        this.f2053x29361dc6 = f19;
        this.f2051xc9b0c98 = f27;
    }

    /* renamed from: equals */
    public boolean m6046xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c abstractC0834x3738713c = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c) obj;
        return java.lang.Float.floatToIntBits(this.f2054x61c4a7f8) == java.lang.Float.floatToIntBits(abstractC0834x3738713c.mo3671x61321942()) && java.lang.Float.floatToIntBits(this.f2052xceef2f4) == java.lang.Float.floatToIntBits(abstractC0834x3738713c.mo3669x6de1856a()) && java.lang.Float.floatToIntBits(this.f2053x29361dc6) == java.lang.Float.floatToIntBits(abstractC0834x3738713c.mo3670x8a28b03c()) && java.lang.Float.floatToIntBits(this.f2051xc9b0c98) == java.lang.Float.floatToIntBits(abstractC0834x3738713c.mo3668xfadbc48e());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getLinearZoom */
    public float mo3668xfadbc48e() {
        return this.f2051xc9b0c98;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getMaxZoomRatio */
    public float mo3669x6de1856a() {
        return this.f2052xceef2f4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getMinZoomRatio */
    public float mo3670x8a28b03c() {
        return this.f2053x29361dc6;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0583xd94d3c5e
    /* renamed from: getZoomRatio */
    public float mo3671x61321942() {
        return this.f2054x61c4a7f8;
    }

    /* renamed from: hashCode */
    public int m6047x8cdac1b() {
        return ((((((java.lang.Float.floatToIntBits(this.f2054x61c4a7f8) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.f2052xceef2f4)) * 1000003) ^ java.lang.Float.floatToIntBits(this.f2053x29361dc6)) * 1000003) ^ java.lang.Float.floatToIntBits(this.f2051xc9b0c98);
    }

    /* renamed from: toString */
    public java.lang.String m6048x9616526c() {
        return "ImmutableZoomState{zoomRatio=" + this.f2054x61c4a7f8 + ", maxZoomRatio=" + this.f2052xceef2f4 + ", minZoomRatio=" + this.f2053x29361dc6 + ", linearZoom=" + this.f2051xc9b0c98 + "}";
    }
}
