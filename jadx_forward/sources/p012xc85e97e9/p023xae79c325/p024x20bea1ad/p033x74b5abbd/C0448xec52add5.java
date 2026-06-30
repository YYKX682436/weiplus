package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd;

/* renamed from: androidx.camera.camera2.interop.CaptureRequestOptions */
/* loaded from: classes14.dex */
public class C0448xec52add5 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: mConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f784xfeabaa0f;

    /* renamed from: androidx.camera.camera2.interop.CaptureRequestOptions$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5> {

        /* renamed from: mMutableOptionsBundle */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f785xd2127747 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();

        /* renamed from: from */
        public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder m4165x3017aa(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder builder = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder();
            interfaceC0692x78a46f62.mo5375xe75af6a5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f106xfd180a84, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher() { // from class: androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$a
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher
                /* renamed from: onOptionMatched */
                public final boolean mo4164x271bff50(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option) {
                    boolean m4166xdf0a5d33;
                    m4166xdf0a5d33 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4166xdf0a5d33(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.this, interfaceC0692x78a46f62, option);
                    return m4166xdf0a5d33;
                }
            });
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$from$0 */
        public static /* synthetic */ boolean m4166xdf0a5d33(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder builder, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option) {
            builder.mo2889xc37a2e52().mo5520x25e7888e(option, interfaceC0692x78a46f62.mo5376x2503ee2f(option), interfaceC0692x78a46f62.mo5379x77ba97d1(option));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: clearCaptureRequestOption */
        public <ValueT> p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder m4167x1781ac2b(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
            this.f785xd2127747.mo5522xc616fa19(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: getMutableConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
            return this.f785xd2127747;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: setCaptureRequestOption */
        public <ValueT> p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder m4168xea2ad5c0(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f785xd2127747.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f785xd2127747));
        }
    }

    public C0448xec52add5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f784xfeabaa0f = interfaceC0692x78a46f62;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCaptureRequestOption */
    public <ValueT> ValueT m4162x6fd7a6b4(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.f784xfeabaa0f.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
        return this.f784xfeabaa0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCaptureRequestOption */
    public <ValueT> ValueT m4163x6fd7a6b4(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.f784xfeabaa0f.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), valuet);
    }
}
