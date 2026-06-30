package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002;

/* renamed from: androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo */
/* loaded from: classes14.dex */
final class C0946xafc976ef extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c {

    /* renamed from: eglExtensions */
    private final java.lang.String f2249xd9ecbbe;

    /* renamed from: eglVersion */
    private final java.lang.String f2250x53aeed6e;

    /* renamed from: glExtensions */
    private final java.lang.String f2251xf3ed3ad9;

    /* renamed from: glVersion */
    private final java.lang.String f2252xf2b54c33;

    /* renamed from: androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder {

        /* renamed from: eglExtensions */
        private java.lang.String f2253xd9ecbbe;

        /* renamed from: eglVersion */
        private java.lang.String f2254x53aeed6e;

        /* renamed from: glExtensions */
        private java.lang.String f2255xf3ed3ad9;

        /* renamed from: glVersion */
        private java.lang.String f2256xf2b54c33;

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c mo6431x59bc66e() {
            java.lang.String str = this.f2256xf2b54c33 == null ? " glVersion" : "";
            if (this.f2254x53aeed6e == null) {
                str = str + " eglVersion";
            }
            if (this.f2255xf3ed3ad9 == null) {
                str = str + " glExtensions";
            }
            if (this.f2253xd9ecbbe == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0946xafc976ef(this.f2256xf2b54c33, this.f2254x53aeed6e, this.f2255xf3ed3ad9, this.f2253xd9ecbbe);
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder
        /* renamed from: setEglExtensions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder mo6432x5dd4ee7c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglExtensions");
            }
            this.f2253xd9ecbbe = str;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder
        /* renamed from: setEglVersion */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder mo6433x7013f370(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglVersion");
            }
            this.f2254x53aeed6e = str;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder
        /* renamed from: setGlExtensions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder mo6434x8b28c85b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glExtensions");
            }
            this.f2255xf3ed3ad9 = str;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder
        /* renamed from: setGlVersion */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder mo6435x4e767df1(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glVersion");
            }
            this.f2256xf2b54c33 = str;
            return this;
        }
    }

    /* renamed from: equals */
    public boolean m6424xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c abstractC0950xf622290c = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c) obj;
        return this.f2252xf2b54c33.equals(abstractC0950xf622290c.mo6428xf222bd7d()) && this.f2250x53aeed6e.equals(abstractC0950xf622290c.mo6426x41efa564()) && this.f2251xf3ed3ad9.equals(abstractC0950xf622290c.mo6427x54dfcd4f()) && this.f2249xd9ecbbe.equals(abstractC0950xf622290c.mo6425xcafe8808());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c
    /* renamed from: getEglExtensions */
    public java.lang.String mo6425xcafe8808() {
        return this.f2249xd9ecbbe;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c
    /* renamed from: getEglVersion */
    public java.lang.String mo6426x41efa564() {
        return this.f2250x53aeed6e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c
    /* renamed from: getGlExtensions */
    public java.lang.String mo6427x54dfcd4f() {
        return this.f2251xf3ed3ad9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c
    /* renamed from: getGlVersion */
    public java.lang.String mo6428xf222bd7d() {
        return this.f2252xf2b54c33;
    }

    /* renamed from: hashCode */
    public int m6429x8cdac1b() {
        return ((((((this.f2252xf2b54c33.hashCode() ^ 1000003) * 1000003) ^ this.f2250x53aeed6e.hashCode()) * 1000003) ^ this.f2251xf3ed3ad9.hashCode()) * 1000003) ^ this.f2249xd9ecbbe.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6430x9616526c() {
        return "GraphicDeviceInfo{glVersion=" + this.f2252xf2b54c33 + ", eglVersion=" + this.f2250x53aeed6e + ", glExtensions=" + this.f2251xf3ed3ad9 + ", eglExtensions=" + this.f2249xd9ecbbe + "}";
    }

    private C0946xafc976ef(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f2252xf2b54c33 = str;
        this.f2250x53aeed6e = str2;
        this.f2251xf3ed3ad9 = str3;
        this.f2249xd9ecbbe = str4;
    }
}
