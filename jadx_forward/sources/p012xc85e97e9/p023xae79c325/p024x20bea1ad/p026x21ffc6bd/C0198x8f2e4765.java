package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CaptureRequestBuilder */
/* loaded from: classes14.dex */
class C0198x8f2e4765 {
    private static final java.lang.String TAG = "Camera2CaptureRequestBuilder";

    /* renamed from: androidx.camera.camera2.internal.Camera2CaptureRequestBuilder$Api23Impl */
    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: createReprocessCaptureRequest */
        public static android.hardware.camera2.CaptureRequest.Builder m3267xae4b5fc9(android.hardware.camera2.CameraDevice cameraDevice, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private C0198x8f2e4765() {
    }

    /* renamed from: applyAeFpsRange */
    private static void m3260xb068e026(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08, android.hardware.camera2.CaptureRequest.Builder builder) {
        if (c0690x88f65a08.m5331xb632311e().equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888)) {
            return;
        }
        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0690x88f65a08.m5331xb632311e());
    }

    /* renamed from: applyImplementationOptionToCaptureBuilder */
    private static void m3261xc5794e45(android.hardware.camera2.CaptureRequest.Builder builder, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5 mo2888x59bc66e = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0448xec52add5.Builder.m4165x3017aa(interfaceC0692x78a46f62).mo2888x59bc66e();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : mo2888x59bc66e.mo5378xc8202020()) {
            android.hardware.camera2.CaptureRequest.Key key = (android.hardware.camera2.CaptureRequest.Key) option.mo5111x75346043();
            try {
                builder.set(key, mo2888x59bc66e.mo5379x77ba97d1(option));
            } catch (java.lang.IllegalArgumentException unused) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: applyTemplateParamsOverrideWorkaround */
    private static void m3262x14187758(android.hardware.camera2.CaptureRequest.Builder builder, int i17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0432x6c6b7aac c0432x6c6b7aac) {
        for (java.util.Map.Entry<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> entry : c0432x6c6b7aac.m4111xbeb5c568(i17).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: applyVideoStabilization */
    public static void m3263xf1651932(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08, android.hardware.camera2.CaptureRequest.Builder builder) {
        if (c0690x88f65a08.m5334x732bab0() == 1 || c0690x88f65a08.m5338x96948bdd() == 1) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (c0690x88f65a08.m5334x732bab0() == 2) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (c0690x88f65a08.m5338x96948bdd() == 2) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    /* renamed from: build */
    public static android.hardware.camera2.CaptureRequest m3264x59bc66e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08, android.hardware.camera2.CameraDevice cameraDevice, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, android.view.Surface> map, boolean z17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0432x6c6b7aac c0432x6c6b7aac) {
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        java.util.List<android.view.Surface> m3266x27824bba = m3266x27824bba(c0690x88f65a08.m5335x1b8de6dc(), map);
        if (m3266x27824bba.isEmpty()) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be m5330xedfdbca8 = c0690x88f65a08.m5330xedfdbca8();
        if (c0690x88f65a08.m5337x26c6954a() == 5 && m5330xedfdbca8 != null && (m5330xedfdbca8.mo2933x2fc52b4d() instanceof android.hardware.camera2.TotalCaptureResult)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "createReprocessCaptureRequest");
            createCaptureRequest = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0198x8f2e4765.Api23Impl.m3267xae4b5fc9(cameraDevice, (android.hardware.camera2.TotalCaptureResult) m5330xedfdbca8.mo2933x2fc52b4d());
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "createCaptureRequest");
            if (c0690x88f65a08.m5337x26c6954a() == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z17 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(c0690x88f65a08.m5337x26c6954a());
            }
        }
        m3262x14187758(createCaptureRequest, c0690x88f65a08.m5337x26c6954a(), c0432x6c6b7aac);
        m3260xb068e026(c0690x88f65a08, createCaptureRequest);
        m3263xf1651932(c0690x88f65a08, createCaptureRequest);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5333xca0018d6 = c0690x88f65a08.m5333xca0018d6();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1604x5742e808;
        if (m5333xca0018d6.mo5374xdccd9774(option)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION, (java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5379x77ba97d1(option));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5333xca0018d62 = c0690x88f65a08.m5333xca0018d6();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1602x542c7792;
        if (m5333xca0018d62.mo5374xdccd9774(option2)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_QUALITY, java.lang.Byte.valueOf(((java.lang.Integer) c0690x88f65a08.m5333xca0018d6().mo5379x77ba97d1(option2)).byteValue()));
        }
        m3261xc5794e45(createCaptureRequest, c0690x88f65a08.m5333xca0018d6());
        java.util.Iterator<android.view.Surface> it = m3266x27824bba.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(c0690x88f65a08.m5336x4aa7b206());
        return createCaptureRequest.build();
    }

    /* renamed from: buildWithoutTarget */
    public static android.hardware.camera2.CaptureRequest m3265x22974ab(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08, android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0432x6c6b7aac c0432x6c6b7aac) {
        if (cameraDevice == null) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "template type = " + c0690x88f65a08.m5337x26c6954a());
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c0690x88f65a08.m5337x26c6954a());
        m3262x14187758(createCaptureRequest, c0690x88f65a08.m5337x26c6954a(), c0432x6c6b7aac);
        m3261xc5794e45(createCaptureRequest, c0690x88f65a08.m5333xca0018d6());
        return createCaptureRequest.build();
    }

    /* renamed from: getConfiguredSurfaces */
    private static java.util.List<android.view.Surface> m3266x27824bba(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293, android.view.Surface> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = list.iterator();
        while (it.hasNext()) {
            android.view.Surface surface = map.get(it.next());
            if (surface == null) {
                throw new java.lang.IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
