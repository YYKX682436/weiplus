package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal */
/* loaded from: classes14.dex */
final class C0460x152611f extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal {

    /* renamed from: cropRect */
    private final android.graphics.Rect f806x7e55c094;

    /* renamed from: resolution */
    private final android.util.Size f807xa0a178ac;

    /* renamed from: rotationDegrees */
    private final int f808x461e29c9;

    /* renamed from: androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder {

        /* renamed from: cropRect */
        private android.graphics.Rect f809x7e55c094;

        /* renamed from: resolution */
        private android.util.Size f810xa0a178ac;

        /* renamed from: rotationDegrees */
        private java.lang.Integer f811x461e29c9;

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal mo4221x59bc66e() {
            java.lang.String str = this.f810xa0a178ac == null ? " resolution" : "";
            if (this.f809x7e55c094 == null) {
                str = str + " cropRect";
            }
            if (this.f811x461e29c9 == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0460x152611f(this.f810xa0a178ac, this.f809x7e55c094, this.f811x461e29c9.intValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder
        /* renamed from: setCropRect */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4222xf4e85f16(android.graphics.Rect rect) {
            if (rect == null) {
                throw new java.lang.NullPointerException("Null cropRect");
            }
            this.f809x7e55c094 = rect;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder
        /* renamed from: setResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4223xbd067eae(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.f810xa0a178ac = size;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder
        /* renamed from: setRotationDegrees */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4224x61569507(int i17) {
            this.f811x461e29c9 = java.lang.Integer.valueOf(i17);
            return this;
        }
    }

    /* renamed from: equals */
    public boolean m4215xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal resolutionInfoInternal = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal) obj;
        return this.f807xa0a178ac.equals(resolutionInfoInternal.mo4217x8ee230a2()) && this.f806x7e55c094.equals(resolutionInfoInternal.mo4216xfa2ffe0a()) && this.f808x461e29c9 == resolutionInfoInternal.mo4218x2a7ffb93();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4216xfa2ffe0a() {
        return this.f806x7e55c094;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal
    /* renamed from: getResolution */
    public android.util.Size mo4217x8ee230a2() {
        return this.f807xa0a178ac;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal
    /* renamed from: getRotationDegrees */
    public int mo4218x2a7ffb93() {
        return this.f808x461e29c9;
    }

    /* renamed from: hashCode */
    public int m4219x8cdac1b() {
        return ((((this.f807xa0a178ac.hashCode() ^ 1000003) * 1000003) ^ this.f806x7e55c094.hashCode()) * 1000003) ^ this.f808x461e29c9;
    }

    /* renamed from: toString */
    public java.lang.String m4220x9616526c() {
        return "ResolutionInfoInternal{resolution=" + this.f807xa0a178ac + ", cropRect=" + this.f806x7e55c094 + ", rotationDegrees=" + this.f808x461e29c9 + "}";
    }

    private C0460x152611f(android.util.Size size, android.graphics.Rect rect, int i17) {
        this.f807xa0a178ac = size;
        this.f806x7e55c094 = rect;
        this.f808x461e29c9 = i17;
    }
}
