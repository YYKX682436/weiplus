package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.RequestOptionConfig */
/* loaded from: classes14.dex */
public class C0997x61c5bc26 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: CAPTURE_REQUEST_ID_STEM */
    static final java.lang.String f2436xfd180a84 = "camera2.captureRequest.option.";

    /* renamed from: mConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f2437xfeabaa0f;

    /* renamed from: androidx.camera.extensions.internal.RequestOptionConfig$Builder */
    /* loaded from: classes14.dex */
    public static class Builder {

        /* renamed from: mMutableOptionsBundle */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f2438xd2127747 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();

        /* renamed from: from */
        public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder m6710x3017aa(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder builder = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder();
            interfaceC0692x78a46f62.mo5375xe75af6a5("camera2.captureRequest.option.", new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher() { // from class: androidx.camera.extensions.internal.RequestOptionConfig$Builder$$a
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher
                /* renamed from: onOptionMatched */
                public final boolean mo4164x271bff50(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option) {
                    boolean m6711xdf0a5d33;
                    m6711xdf0a5d33 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder.m6711xdf0a5d33(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder.this, interfaceC0692x78a46f62, option);
                    return m6711xdf0a5d33;
                }
            });
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$from$0 */
        public static /* synthetic */ boolean m6711xdf0a5d33(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder builder, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option) {
            builder.f2438xd2127747.mo5520x25e7888e(option, interfaceC0692x78a46f62.mo5376x2503ee2f(option), interfaceC0692x78a46f62.mo5379x77ba97d1(option));
            return true;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26 m6712x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f2438xd2127747));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: setCaptureRequestOption */
        public <ValueT> p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.Builder m6713xea2ad5c0(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f2438xd2127747.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0997x61c5bc26.m6709xff319084(key), valuet);
            return this;
        }
    }

    /* renamed from: createOptionFromKey */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Object> m6709xff319084(android.hardware.camera2.CaptureRequest.Key<?> key) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5383xaf65a0fc("camera2.captureRequest.option." + key.getName(), java.lang.Object.class, key);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
        return this.f2437xfeabaa0f;
    }

    private C0997x61c5bc26(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f2437xfeabaa0f = interfaceC0692x78a46f62;
    }
}
