package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.RequestBuilder */
/* loaded from: classes14.dex */
class C1032x6368322c {

    /* renamed from: mCaptureStageId */
    int f2578x2e764460;

    /* renamed from: mTargetOutputConfigIds */
    private java.util.List<java.lang.Integer> f2580x4e97ebd7 = new java.util.ArrayList();

    /* renamed from: mParameters */
    private java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> f2579xf789ba37 = new java.util.HashMap();

    /* renamed from: mTemplateId */
    private int f2581x29eb9782 = 1;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.RequestBuilder$RequestProcessorRequest */
    /* loaded from: classes14.dex */
    public static class RequestProcessorRequest implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request {

        /* renamed from: mCaptureStageId */
        final int f2582x2e764460;

        /* renamed from: mParameterConfig */
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f2583xcdbc301e;

        /* renamed from: mTargetOutputConfigIds */
        final java.util.List<java.lang.Integer> f2584x4e97ebd7;

        /* renamed from: mTemplateId */
        final int f2585x29eb9782;

        public RequestProcessorRequest(java.util.List<java.lang.Integer> list, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> map, int i17, int i18) {
            this.f2584x4e97ebd7 = list;
            this.f2585x29eb9782 = i17;
            this.f2582x2e764460 = i18;
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder builder = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder();
            for (android.hardware.camera2.CaptureRequest.Key<?> key : map.keySet()) {
                builder.m6713xea2ad5c0(key, map.get(key));
            }
            this.f2583xcdbc301e = builder.m6712x59bc66e();
        }

        /* renamed from: getCaptureStageId */
        public int m6865x165b0789() {
            return this.f2582x2e764460;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getParameters */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5577x99879e0() {
            return this.f2583xcdbc301e;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getTargetOutputConfigIds */
        public java.util.List<java.lang.Integer> mo5578xa671f88e() {
            return this.f2584x4e97ebd7;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request
        /* renamed from: getTemplateId */
        public int mo5579x3bfa572b() {
            return this.f2585x29eb9782;
        }
    }

    /* renamed from: addTargetOutputConfigIds */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c m6860xbdb5c23(int i17) {
        this.f2580x4e97ebd7.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    /* renamed from: build */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0746x3c5d2ee3.Request m6861x59bc66e() {
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c.RequestProcessorRequest(this.f2580x4e97ebd7, this.f2579xf789ba37, this.f2581x29eb9782, this.f2578x2e764460);
    }

    /* renamed from: setCaptureStageId */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c m6862xde516f95(int i17) {
        this.f2578x2e764460 = i17;
        return this;
    }

    /* renamed from: setParameters */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c m6863x37bcc7ec(android.hardware.camera2.CaptureRequest.Key<?> key, java.lang.Object obj) {
        this.f2579xf789ba37.put(key, obj);
        return this;
    }

    /* renamed from: setTemplateId */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1032x6368322c m6864x6a1ea537(int i17) {
        this.f2581x29eb9782 = i17;
        return this;
    }
}
