package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_StreamSpec */
/* loaded from: classes14.dex */
final class C0656x72de12f8 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b {

    /* renamed from: dynamicRange */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1474x21e9383e;

    /* renamed from: expectedFrameRateRange */
    private final android.util.Range<java.lang.Integer> f1475x4c63ba28;

    /* renamed from: implementationOptions */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f1476xbe54468c;

    /* renamed from: resolution */
    private final android.util.Size f1477xa0a178ac;

    /* renamed from: zslDisabled */
    private final boolean f1478x52da73ef;

    /* renamed from: androidx.camera.core.impl.AutoValue_StreamSpec$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder {

        /* renamed from: dynamicRange */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1479x21e9383e;

        /* renamed from: expectedFrameRateRange */
        private android.util.Range<java.lang.Integer> f1480x4c63ba28;

        /* renamed from: implementationOptions */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f1481xbe54468c;

        /* renamed from: resolution */
        private android.util.Size f1482xa0a178ac;

        /* renamed from: zslDisabled */
        private java.lang.Boolean f1483x52da73ef;

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo5196x59bc66e() {
            java.lang.String str = this.f1482xa0a178ac == null ? " resolution" : "";
            if (this.f1479x21e9383e == null) {
                str = str + " dynamicRange";
            }
            if (this.f1480x4c63ba28 == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f1483x52da73ef == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0656x72de12f8(this.f1482xa0a178ac, this.f1479x21e9383e, this.f1480x4c63ba28, this.f1481xbe54468c, this.f1483x52da73ef.booleanValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: setDynamicRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5197xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            if (c0491x2bb48c5e == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.f1479x21e9383e = c0491x2bb48c5e;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: setExpectedFrameRateRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5198xe875cd2a(android.util.Range<java.lang.Integer> range) {
            if (range == null) {
                throw new java.lang.NullPointerException("Null expectedFrameRateRange");
            }
            this.f1480x4c63ba28 = range;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: setImplementationOptions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5199x9a12cb4a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            this.f1481xbe54468c = interfaceC0692x78a46f62;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: setResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5200xbd067eae(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.f1482xa0a178ac = size;
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder
        /* renamed from: setZslDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5201xc3162e2d(boolean z17) {
            this.f1483x52da73ef = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public Builder() {
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
            this.f1482xa0a178ac = abstractC0756x2f9ad77b.mo5191x8ee230a2();
            this.f1479x21e9383e = abstractC0756x2f9ad77b.mo5188x82dbcab4();
            this.f1480x4c63ba28 = abstractC0756x2f9ad77b.mo5189xb632311e();
            this.f1481xbe54468c = abstractC0756x2f9ad77b.mo5190xca0018d6();
            this.f1483x52da73ef = java.lang.Boolean.valueOf(abstractC0756x2f9ad77b.mo5192x2cb0bab9());
        }
    }

    /* renamed from: equals */
    public boolean m5187xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b) obj;
        return this.f1477xa0a178ac.equals(abstractC0756x2f9ad77b.mo5191x8ee230a2()) && this.f1474x21e9383e.m4384xb2c87fbf(abstractC0756x2f9ad77b.mo5188x82dbcab4()) && this.f1475x4c63ba28.equals(abstractC0756x2f9ad77b.mo5189xb632311e()) && ((interfaceC0692x78a46f62 = this.f1476xbe54468c) != null ? interfaceC0692x78a46f62.equals(abstractC0756x2f9ad77b.mo5190xca0018d6()) : abstractC0756x2f9ad77b.mo5190xca0018d6() == null) && this.f1478x52da73ef == abstractC0756x2f9ad77b.mo5192x2cb0bab9();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: getDynamicRange */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5188x82dbcab4() {
        return this.f1474x21e9383e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: getExpectedFrameRateRange */
    public android.util.Range<java.lang.Integer> mo5189xb632311e() {
        return this.f1475x4c63ba28;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: getImplementationOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5190xca0018d6() {
        return this.f1476xbe54468c;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: getResolution */
    public android.util.Size mo5191x8ee230a2() {
        return this.f1477xa0a178ac;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: getZslDisabled */
    public boolean mo5192x2cb0bab9() {
        return this.f1478x52da73ef;
    }

    /* renamed from: hashCode */
    public int m5193x8cdac1b() {
        int hashCode = (((((this.f1477xa0a178ac.hashCode() ^ 1000003) * 1000003) ^ this.f1474x21e9383e.m4387x8cdac1b()) * 1000003) ^ this.f1475x4c63ba28.hashCode()) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62 = this.f1476xbe54468c;
        return ((hashCode ^ (interfaceC0692x78a46f62 == null ? 0 : interfaceC0692x78a46f62.hashCode())) * 1000003) ^ (this.f1478x52da73ef ? 1231 : 1237);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b
    /* renamed from: toBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5194xaaa148a0() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0656x72de12f8.Builder(this);
    }

    /* renamed from: toString */
    public java.lang.String m5195x9616526c() {
        return "StreamSpec{resolution=" + this.f1477xa0a178ac + ", dynamicRange=" + this.f1474x21e9383e + ", expectedFrameRateRange=" + this.f1475x4c63ba28 + ", implementationOptions=" + this.f1476xbe54468c + ", zslDisabled=" + this.f1478x52da73ef + "}";
    }

    private C0656x72de12f8(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, android.util.Range<java.lang.Integer> range, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, boolean z17) {
        this.f1477xa0a178ac = size;
        this.f1474x21e9383e = c0491x2bb48c5e;
        this.f1475x4c63ba28 = range;
        this.f1476xbe54468c = interfaceC0692x78a46f62;
        this.f1478x52da73ef = z17;
    }
}
