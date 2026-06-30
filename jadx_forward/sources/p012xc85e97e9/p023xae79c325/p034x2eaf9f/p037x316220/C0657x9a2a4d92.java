package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_SurfaceConfig */
/* loaded from: classes13.dex */
final class C0657x9a2a4d92 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f {

    /* renamed from: configSize */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize f1484x318f6663;

    /* renamed from: configType */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType f1485x3190159c;

    /* renamed from: streamUseCase */
    private final long f1486x135871b7;

    public C0657x9a2a4d92(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize, long j17) {
        if (configType == null) {
            throw new java.lang.NullPointerException("Null configType");
        }
        this.f1485x3190159c = configType;
        if (configSize == null) {
            throw new java.lang.NullPointerException("Null configSize");
        }
        this.f1484x318f6663 = configSize;
        this.f1486x135871b7 = j17;
    }

    /* renamed from: equals */
    public boolean m5202xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f) obj;
        return this.f1485x3190159c.equals(abstractC0758x2d42962f.mo5204x1fd0cd92()) && this.f1484x318f6663.equals(abstractC0758x2d42962f.mo5203x1fd01e59()) && this.f1486x135871b7 == abstractC0758x2d42962f.mo5205xd0b82e01();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f
    /* renamed from: getConfigSize */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize mo5203x1fd01e59() {
        return this.f1484x318f6663;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f
    /* renamed from: getConfigType */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType mo5204x1fd0cd92() {
        return this.f1485x3190159c;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f
    /* renamed from: getStreamUseCase */
    public long mo5205xd0b82e01() {
        return this.f1486x135871b7;
    }

    /* renamed from: hashCode */
    public int m5206x8cdac1b() {
        int hashCode = (((this.f1485x3190159c.hashCode() ^ 1000003) * 1000003) ^ this.f1484x318f6663.hashCode()) * 1000003;
        long j17 = this.f1486x135871b7;
        return hashCode ^ ((int) (j17 ^ (j17 >>> 32)));
    }

    /* renamed from: toString */
    public java.lang.String m5207x9616526c() {
        return "SurfaceConfig{configType=" + this.f1485x3190159c + ", configSize=" + this.f1484x318f6663 + ", streamUseCase=" + this.f1486x135871b7 + "}";
    }
}
