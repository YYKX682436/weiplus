package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder */
/* loaded from: classes14.dex */
class C1023x4fac6c30 {

    /* renamed from: mSessionTemplateId */
    private int f2556x9483c17e = 1;

    /* renamed from: mSessionType */
    private int f2557xa8b65c43 = 0;

    /* renamed from: mSessionParameters */
    private java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> f2555x6221e433 = new java.util.HashMap();

    /* renamed from: mCamera2OutputConfigs */
    private java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2554xf3309c90 = new java.util.ArrayList();

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder$SessionConfigImpl */
    /* loaded from: classes14.dex */
    public static class SessionConfigImpl implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb {

        /* renamed from: mCamera2OutputConfigs */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2558xf3309c90;

        /* renamed from: mSessionParameters */
        private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> f2559x6221e433;

        /* renamed from: mSessionTemplateId */
        private final int f2560x9483c17e;

        /* renamed from: mSessionType */
        private final int f2561xa8b65c43;

        public SessionConfigImpl(int i17, int i18, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> map, java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> list) {
            this.f2560x9483c17e = i17;
            this.f2561xa8b65c43 = i18;
            this.f2559x6221e433 = map;
            this.f2558xf3309c90 = list;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb
        /* renamed from: getOutputConfigs */
        public java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> mo6821x755b2d7a() {
            return this.f2558xf3309c90;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb
        /* renamed from: getSessionParameters */
        public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mo6822x1874e46a() {
            return this.f2559x6221e433;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb
        /* renamed from: getSessionTemplateId */
        public int mo6823x4ad6c1b5() {
            return this.f2560x9483c17e;
        }

        @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb
        /* renamed from: getSessionType */
        public int mo6824xd87f91ba() {
            return this.f2561xa8b65c43;
        }
    }

    /* renamed from: addOutputConfig */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 m6825x5864e6e4(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 interfaceC1020xba84a5d0) {
        this.f2554xf3309c90.add(interfaceC1020xba84a5d0);
        return this;
    }

    /* renamed from: addSessionParameter */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 m6826x4c53474(android.hardware.camera2.CaptureRequest.Key key, java.lang.Object obj) {
        this.f2555x6221e433.put(key, obj);
        return this;
    }

    /* renamed from: build */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1022xba06cceb m6827x59bc66e() {
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30.SessionConfigImpl(this.f2556x9483c17e, this.f2557xa8b65c43, this.f2555x6221e433, this.f2554xf3309c90);
    }

    /* renamed from: getCamera2OutputConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> m6828x38169cf9() {
        return this.f2554xf3309c90;
    }

    /* renamed from: getSessionParameters */
    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> m6829x1874e46a() {
        return this.f2555x6221e433;
    }

    /* renamed from: getSessionTemplateId */
    public int m6830x4ad6c1b5() {
        return this.f2556x9483c17e;
    }

    /* renamed from: setSessionTemplateId */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 m6831x266cce29(int i17) {
        this.f2556x9483c17e = i17;
        return this;
    }

    /* renamed from: setSessionType */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1023x4fac6c30 m6832x6ee5052e(int i17) {
        this.f2557xa8b65c43 = i17;
        return this;
    }
}
