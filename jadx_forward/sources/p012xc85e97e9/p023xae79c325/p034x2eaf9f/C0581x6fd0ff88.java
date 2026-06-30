package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.UseCaseGroup */
/* loaded from: classes14.dex */
public final class C0581x6fd0ff88 {

    /* renamed from: mEffects */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> f1271x30c92bd5;

    /* renamed from: mUseCases */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> f1272x128b3989;

    /* renamed from: mViewPort */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 f1273x6c431453;

    /* renamed from: androidx.camera.core.UseCaseGroup$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: SUPPORTED_TARGETS */
        private static final java.util.List<java.lang.Integer> f1274x38666a31 = java.util.Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: mViewPort */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 f1277x6c431453;

        /* renamed from: mUseCases */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> f1276x128b3989 = new java.util.ArrayList();

        /* renamed from: mEffects */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> f1275x30c92bd5 = new java.util.ArrayList();

        /* renamed from: checkEffectTargets */
        private void m4855x6dbfa209() {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> it = this.f1275x30c92bd5.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int m4264xe21cfccc = it.next().m4264xe21cfccc();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6382xa6199d9c(f1274x38666a31, m4264xe21cfccc);
                int i18 = i17 & m4264xe21cfccc;
                if (i18 > 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "More than one effects has targets %s.", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6383x8dc88bb2(i18)));
                }
                i17 |= m4264xe21cfccc;
            }
        }

        /* renamed from: addEffect */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88.Builder m4856xe75e6192(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36) {
            this.f1275x30c92bd5.add(abstractC0468xb9790d36);
            return this;
        }

        /* renamed from: addUseCase */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88.Builder m4857x68e2f176(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
            this.f1276x128b3989.add(abstractC0580x5a5e3137);
            return this;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88 m4858x59bc66e() {
            m3.h.b(!this.f1276x128b3989.isEmpty(), "UseCase must not be empty.");
            m4855x6dbfa209();
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88(this.f1277x6c431453, this.f1276x128b3989, this.f1275x30c92bd5);
        }

        /* renamed from: setViewPort */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88.Builder m4859xbdd80b48(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 c0582x4b1fd0e6) {
            this.f1277x6c431453 = c0582x4b1fd0e6;
            return this;
        }
    }

    public C0581x6fd0ff88(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 c0582x4b1fd0e6, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> list2) {
        this.f1273x6c431453 = c0582x4b1fd0e6;
        this.f1272x128b3989 = list;
        this.f1271x30c92bd5 = list2;
    }

    /* renamed from: getEffects */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> m4851xd07db4cc() {
        return this.f1271x30c92bd5;
    }

    /* renamed from: getUseCases */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m4852x6967cf72() {
        return this.f1272x128b3989;
    }

    /* renamed from: getViewPort */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 m4853xc31faa3c() {
        return this.f1273x6c431453;
    }
}
