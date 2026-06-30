package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b;

/* renamed from: androidx.camera.core.resolutionselector.ResolutionSelector */
/* loaded from: classes14.dex */
public final class C0955xda4820cb {

    /* renamed from: PREFER_CAPTURE_RATE_OVER_HIGHER_RESOLUTION */
    public static final int f2305x6e87c868 = 0;

    /* renamed from: PREFER_HIGHER_RESOLUTION_OVER_CAPTURE_RATE */
    public static final int f2306xed48d8d2 = 1;

    /* renamed from: mAllowedResolutionMode */
    private final int f2307x99707dca;

    /* renamed from: mAspectRatioStrategy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 f2308x39091579;

    /* renamed from: mResolutionFilter */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 f2309xfddcc9d1;

    /* renamed from: mResolutionStrategy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f f2310x8f5d6f8c;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.resolutionselector.ResolutionSelector$AllowedResolutionMode */
    /* loaded from: classes6.dex */
    public @interface AllowedResolutionMode {
    }

    public C0955xda4820cb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 c0953x9920cf06, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f c0956xfdd1d05f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 interfaceC0954xa5894364, int i17) {
        this.f2308x39091579 = c0953x9920cf06;
        this.f2310x8f5d6f8c = c0956xfdd1d05f;
        this.f2309xfddcc9d1 = interfaceC0954xa5894364;
        this.f2307x99707dca = i17;
    }

    /* renamed from: getAllowedResolutionMode */
    public int m6496xf14a8a81() {
        return this.f2307x99707dca;
    }

    /* renamed from: getAspectRatioStrategy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 m6497xa69ce3f0() {
        return this.f2308x39091579;
    }

    /* renamed from: getResolutionFilter */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 m6498x7f9d66ba() {
        return this.f2309xfddcc9d1;
    }

    /* renamed from: getResolutionStrategy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f m6499xa36a7635() {
        return this.f2310x8f5d6f8c;
    }

    /* renamed from: androidx.camera.core.resolutionselector.ResolutionSelector$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: mAllowedResolutionMode */
        private int f2311x99707dca;

        /* renamed from: mAspectRatioStrategy */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 f2312x39091579;

        /* renamed from: mResolutionFilter */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 f2313xfddcc9d1;

        /* renamed from: mResolutionStrategy */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f f2314x8f5d6f8c;

        public Builder() {
            this.f2312x39091579 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06.f2302xcd77a971;
            this.f2314x8f5d6f8c = null;
            this.f2313xfddcc9d1 = null;
            this.f2311x99707dca = 0;
        }

        /* renamed from: fromResolutionSelector */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder m6500x106561f5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder(c0955xda4820cb);
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m6501x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb(this.f2312x39091579, this.f2314x8f5d6f8c, this.f2313xfddcc9d1, this.f2311x99707dca);
        }

        /* renamed from: setAllowedResolutionMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder m6502xc15d3cf5(int i17) {
            this.f2311x99707dca = i17;
            return this;
        }

        /* renamed from: setAspectRatioStrategy */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder m6503xf4e1a364(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 c0953x9920cf06) {
            this.f2312x39091579 = c0953x9920cf06;
            return this;
        }

        /* renamed from: setResolutionFilter */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder m6504x2399fbc6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 interfaceC0954xa5894364) {
            this.f2313xfddcc9d1 = interfaceC0954xa5894364;
            return this;
        }

        /* renamed from: setResolutionStrategy */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder m6505x3a95f841(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f c0956xfdd1d05f) {
            this.f2314x8f5d6f8c = c0956xfdd1d05f;
            return this;
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            this.f2312x39091579 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06.f2302xcd77a971;
            this.f2314x8f5d6f8c = null;
            this.f2313xfddcc9d1 = null;
            this.f2311x99707dca = 0;
            this.f2312x39091579 = c0955xda4820cb.m6497xa69ce3f0();
            this.f2314x8f5d6f8c = c0955xda4820cb.m6499xa36a7635();
            this.f2313xfddcc9d1 = c0955xda4820cb.m6498x7f9d66ba();
            this.f2311x99707dca = c0955xda4820cb.m6496xf14a8a81();
        }
    }
}
