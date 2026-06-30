package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220;

/* renamed from: androidx.camera.camera2.impl.Camera2ImplConfig */
/* loaded from: classes14.dex */
public final class C0108x2f5802ef extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 {

    /* renamed from: CAPTURE_REQUEST_ID_STEM */
    public static final java.lang.String f106xfd180a84 = "camera2.captureRequest.option.";

    /* renamed from: TEMPLATE_TYPE_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f113x187870d5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.captureRequest.templateType", java.lang.Integer.TYPE);

    /* renamed from: STREAM_USE_CASE_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Long> f112xb3c16ecd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.cameraCaptureSession.streamUseCase", java.lang.Long.TYPE);

    /* renamed from: DEVICE_STATE_CALLBACK_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.hardware.camera2.CameraDevice.StateCallback> f108xa4f5f0b8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.cameraDevice.stateCallback", android.hardware.camera2.CameraDevice.StateCallback.class);

    /* renamed from: SESSION_STATE_CALLBACK_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> f111x836214d8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.cameraCaptureSession.stateCallback", android.hardware.camera2.CameraCaptureSession.StateCallback.class);

    /* renamed from: SESSION_CAPTURE_CALLBACK_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> f109x23e1afcd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.cameraCaptureSession.captureCallback", android.hardware.camera2.CameraCaptureSession.CaptureCallback.class);

    /* renamed from: CAPTURE_REQUEST_TAG_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Object> f107x48cfea63 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.captureRequest.tag", java.lang.Object.class);

    /* renamed from: SESSION_PHYSICAL_CAMERA_ID_OPTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.String> f110x1d046d5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camera2.cameraCaptureSession.physicalCameraId", java.lang.String.class);

    /* renamed from: androidx.camera.camera2.impl.Camera2ImplConfig$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef> {

        /* renamed from: mMutableOptionsBundle */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f114xd2127747 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: getMutableConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
            return this.f114xd2127747;
        }

        /* renamed from: insertAllOptions */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder m2890x156e0956(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            m2891x156e0956(interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.OPTIONAL);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: setCaptureRequestOption */
        public <ValueT> p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f114xd2127747.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: setCaptureRequestOptionWithPriority */
        public <ValueT> p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority) {
            this.f114xd2127747.mo5520x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), optionPriority, valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef mo2888x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f114xd2127747));
        }

        /* renamed from: insertAllOptions */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder m2891x156e0956(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : interfaceC0692x78a46f62.mo5378xc8202020()) {
                this.f114xd2127747.mo5520x25e7888e(option, optionPriority, interfaceC0692x78a46f62.mo5379x77ba97d1(option));
            }
            return this;
        }
    }

    public C0108x2f5802ef(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        super(interfaceC0692x78a46f62);
    }

    /* renamed from: createCaptureRequestOption */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Object> m2879xd8b8695a(android.hardware.camera2.CaptureRequest.Key<?> key) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5383xaf65a0fc(f106xfd180a84 + key.getName(), java.lang.Object.class, key);
    }

    /* renamed from: getCaptureRequestOptions */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 m2880x8b1d303f() {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(mo3494x1456a638()).mo2888x59bc66e();
    }

    /* renamed from: getCaptureRequestTag */
    public java.lang.Object m2881x4be861bb(java.lang.Object obj) {
        return mo3494x1456a638().mo5380x77ba97d1(f107x48cfea63, obj);
    }

    /* renamed from: getCaptureRequestTemplate */
    public int m2882x8e7956f9(int i17) {
        return ((java.lang.Integer) mo3494x1456a638().mo5380x77ba97d1(f113x187870d5, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getDeviceStateCallback */
    public android.hardware.camera2.CameraDevice.StateCallback m2883x3146920a(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        return (android.hardware.camera2.CameraDevice.StateCallback) mo3494x1456a638().mo5380x77ba97d1(f108xa4f5f0b8, stateCallback);
    }

    /* renamed from: getPhysicalCameraId */
    public java.lang.String m2884x936d7c8d(java.lang.String str) {
        return (java.lang.String) mo3494x1456a638().mo5380x77ba97d1(f110x1d046d5e, str);
    }

    /* renamed from: getSessionCaptureCallback */
    public android.hardware.camera2.CameraCaptureSession.CaptureCallback m2885x4ba132b(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) mo3494x1456a638().mo5380x77ba97d1(f109x23e1afcd, captureCallback);
    }

    /* renamed from: getSessionStateCallback */
    public android.hardware.camera2.CameraCaptureSession.StateCallback m2886x5751f576(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
        return (android.hardware.camera2.CameraCaptureSession.StateCallback) mo3494x1456a638().mo5380x77ba97d1(f111x836214d8, stateCallback);
    }

    /* renamed from: getStreamUseCase */
    public long m2887xd0b82e01(long j17) {
        return ((java.lang.Long) mo3494x1456a638().mo5380x77ba97d1(f112xb3c16ecd, java.lang.Long.valueOf(j17))).longValue();
    }
}
