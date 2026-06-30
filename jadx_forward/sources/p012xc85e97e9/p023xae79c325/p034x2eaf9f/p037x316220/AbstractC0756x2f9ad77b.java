package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.StreamSpec */
/* loaded from: classes14.dex */
public abstract class AbstractC0756x2f9ad77b {

    /* renamed from: FRAME_RATE_RANGE_UNSPECIFIED */
    public static final android.util.Range<java.lang.Integer> f1796xf5f0b888 = new android.util.Range<>(0, 0);

    /* renamed from: androidx.camera.core.impl.StreamSpec$Builder */
    /* loaded from: classes14.dex */
    public static abstract class Builder {
        /* renamed from: build */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo5196x59bc66e();

        /* renamed from: setDynamicRange */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5197xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e);

        /* renamed from: setExpectedFrameRateRange */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5198xe875cd2a(android.util.Range<java.lang.Integer> range);

        /* renamed from: setImplementationOptions */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5199x9a12cb4a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62);

        /* renamed from: setResolution */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5200xbd067eae(android.util.Size size);

        /* renamed from: setZslDisabled */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5201xc3162e2d(boolean z17);
    }

    /* renamed from: builder */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder m5673xdc3ef9b(android.util.Size size) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0656x72de12f8.Builder().mo5200xbd067eae(size).mo5198xe875cd2a(f1796xf5f0b888).mo5197xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR).mo5201xc3162e2d(false);
    }

    /* renamed from: getDynamicRange */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5188x82dbcab4();

    /* renamed from: getExpectedFrameRateRange */
    public abstract android.util.Range<java.lang.Integer> mo5189xb632311e();

    /* renamed from: getImplementationOptions */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5190xca0018d6();

    /* renamed from: getResolution */
    public abstract android.util.Size mo5191x8ee230a2();

    /* renamed from: getZslDisabled */
    public abstract boolean mo5192x2cb0bab9();

    /* renamed from: toBuilder */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5194xaaa148a0();
}
