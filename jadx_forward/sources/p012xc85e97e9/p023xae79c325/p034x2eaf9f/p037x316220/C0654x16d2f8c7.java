package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig */
/* loaded from: classes14.dex */
final class C0654x16d2f8c7 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig {

    /* renamed from: dynamicRange */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1461x21e9383e;

    /* renamed from: mirrorMode */
    private final int f1462x67f82202;

    /* renamed from: physicalCameraId */
    private final java.lang.String f1463xeb951517;

    /* renamed from: sharedSurfaces */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f1464x834684eb;

    /* renamed from: surface */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1465x9189ecad;

    /* renamed from: surfaceGroupId */
    private final int f1466x8f95da8d;

    /* renamed from: androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder {

        /* renamed from: dynamicRange */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1467x21e9383e;

        /* renamed from: mirrorMode */
        private java.lang.Integer f1468x67f82202;

        /* renamed from: physicalCameraId */
        private java.lang.String f1469xeb951517;

        /* renamed from: sharedSurfaces */
        private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> f1470x834684eb;

        /* renamed from: surface */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1471x9189ecad;

        /* renamed from: surfaceGroupId */
        private java.lang.Integer f1472x8f95da8d;

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig mo5176x59bc66e() {
            java.lang.String str = this.f1471x9189ecad == null ? " surface" : "";
            if (this.f1470x834684eb == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f1468x67f82202 == null) {
                str = str + " mirrorMode";
            }
            if (this.f1472x8f95da8d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f1467x21e9383e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0654x16d2f8c7(this.f1471x9189ecad, this.f1470x834684eb, this.f1469xeb951517, this.f1468x67f82202.intValue(), this.f1472x8f95da8d.intValue(), this.f1467x21e9383e);
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setDynamicRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5177xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            if (c0491x2bb48c5e == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.f1467x21e9383e = c0491x2bb48c5e;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setMirrorMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5178x845d2804(int i17) {
            this.f1468x67f82202 = java.lang.Integer.valueOf(i17);
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setPhysicalCameraId */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5179x376a1199(java.lang.String str) {
            this.f1469xeb951517 = str;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setSharedSurfaces */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5180x39d4b9ed(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null sharedSurfaces");
            }
            this.f1470x834684eb = list;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5181x42c875eb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            if (abstractC0697x654a0293 == null) {
                throw new java.lang.NullPointerException("Null surface");
            }
            this.f1471x9189ecad = abstractC0697x654a0293;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder
        /* renamed from: setSurfaceGroupId */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5182x46240f8f(int i17) {
            this.f1472x8f95da8d = java.lang.Integer.valueOf(i17);
            return this;
        }
    }

    /* renamed from: equals */
    public boolean m5167xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig) obj;
        return this.f1465x9189ecad.equals(outputConfig.mo5172xcf572877()) && this.f1464x834684eb.equals(outputConfig.mo5171x71de51e1()) && ((str = this.f1463xeb951517) != null ? str.equals(outputConfig.mo5170x936d7c8d()) : outputConfig.mo5170x936d7c8d() == null) && this.f1462x67f82202 == outputConfig.mo5169x5638d9f8() && this.f1466x8f95da8d == outputConfig.mo5173x7e2da783() && this.f1461x21e9383e.m4384xb2c87fbf(outputConfig.mo5168x82dbcab4());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getDynamicRange */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5168x82dbcab4() {
        return this.f1461x21e9383e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getMirrorMode */
    public int mo5169x5638d9f8() {
        return this.f1462x67f82202;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo5170x936d7c8d() {
        return this.f1463xeb951517;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getSharedSurfaces */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> mo5171x71de51e1() {
        return this.f1464x834684eb;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 mo5172xcf572877() {
        return this.f1465x9189ecad;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig
    /* renamed from: getSurfaceGroupId */
    public int mo5173x7e2da783() {
        return this.f1466x8f95da8d;
    }

    /* renamed from: hashCode */
    public int m5174x8cdac1b() {
        int hashCode = (((this.f1465x9189ecad.hashCode() ^ 1000003) * 1000003) ^ this.f1464x834684eb.hashCode()) * 1000003;
        java.lang.String str = this.f1463xeb951517;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f1462x67f82202) * 1000003) ^ this.f1466x8f95da8d) * 1000003) ^ this.f1461x21e9383e.m4387x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m5175x9616526c() {
        return "OutputConfig{surface=" + this.f1465x9189ecad + ", sharedSurfaces=" + this.f1464x834684eb + ", physicalCameraId=" + this.f1463xeb951517 + ", mirrorMode=" + this.f1462x67f82202 + ", surfaceGroupId=" + this.f1466x8f95da8d + ", dynamicRange=" + this.f1461x21e9383e + "}";
    }

    private C0654x16d2f8c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, java.lang.String str, int i17, int i18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        this.f1465x9189ecad = abstractC0697x654a0293;
        this.f1464x834684eb = list;
        this.f1463xeb951517 = str;
        this.f1462x67f82202 = i17;
        this.f1466x8f95da8d = i18;
        this.f1461x21e9383e = c0491x2bb48c5e;
    }
}
