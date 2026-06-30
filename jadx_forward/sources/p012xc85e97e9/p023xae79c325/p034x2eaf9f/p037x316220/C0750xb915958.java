package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SessionConfig */
/* loaded from: classes14.dex */
public final class C0750xb915958 {

    /* renamed from: DEFAULT_SESSION_TYPE */
    public static final int f1746xc5e110c1 = 0;

    /* renamed from: SUPPORTED_TEMPLATE_PRIORITY */
    private static final java.util.List<java.lang.Integer> f1747xa7244e58 = java.util.Arrays.asList(1, 5, 3);

    /* renamed from: mDeviceStateCallbacks */
    private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> f1748xb2a5af40;

    /* renamed from: mErrorListener */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener f1749x761b7b6f;

    /* renamed from: mInputConfiguration */
    private android.hardware.camera2.params.InputConfiguration f1750x48d2099;

    /* renamed from: mOutputConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> f1751x130979c3;

    /* renamed from: mPostviewOutputConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig f1752x7d28d795;

    /* renamed from: mRepeatingCaptureConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 f1753xb3e0a5ce;

    /* renamed from: mSessionStateCallbacks */
    private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> f1754x3b12ad06;

    /* renamed from: mSessionType */
    private final int f1755xa8b65c43;

    /* renamed from: mSingleCameraCaptureCallbacks */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1756xfc70d6e2;

    /* renamed from: androidx.camera.core.impl.SessionConfig$BaseBuilder */
    /* loaded from: classes14.dex */
    public static class BaseBuilder {

        /* renamed from: mErrorListener */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener f1759x761b7b6f;

        /* renamed from: mInputConfiguration */
        android.hardware.camera2.params.InputConfiguration f1760x48d2099;

        /* renamed from: mPostviewOutputConfig */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig f1762x7d28d795;

        /* renamed from: mOutputConfigs */
        final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> f1761x130979c3 = new java.util.LinkedHashSet();

        /* renamed from: mCaptureConfigBuilder */
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder f1757xcd36dc60 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();

        /* renamed from: mDeviceStateCallbacks */
        final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> f1758xb2a5af40 = new java.util.ArrayList();

        /* renamed from: mSessionStateCallbacks */
        final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> f1763x3b12ad06 = new java.util.ArrayList();

        /* renamed from: mSingleCameraCaptureCallbacks */
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1765xfc70d6e2 = new java.util.ArrayList();

        /* renamed from: mSessionType */
        int f1764xa8b65c43 = 0;
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$Builder */
    /* loaded from: classes14.dex */
    public static class Builder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.BaseBuilder {
        /* renamed from: createFrom */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, android.util.Size size) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker m5750x8226ce74 = interfaceC0768x83509b59.m5750x8226ce74(null);
            if (m5750x8226ce74 != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
                m5750x8226ce74.mo3296xcde97c32(size, interfaceC0768x83509b59, builder);
                return builder;
            }
            throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + interfaceC0768x83509b59.m6139xb3ee7b2(interfaceC0768x83509b59.toString()));
        }

        /* renamed from: addAllCameraCaptureCallbacks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5604xc7f822cd(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> collection) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6 : collection) {
                this.f1757xcd36dc60.m5345xd4aa81a5(abstractC0659xd0769ba6);
                if (!this.f1765xfc70d6e2.contains(abstractC0659xd0769ba6)) {
                    this.f1765xfc70d6e2.add(abstractC0659xd0769ba6);
                }
            }
            return this;
        }

        /* renamed from: addAllDeviceStateCallbacks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5605x3e1c093(java.util.Collection<android.hardware.camera2.CameraDevice.StateCallback> collection) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                m5609x836dd6df(it.next());
            }
            return this;
        }

        /* renamed from: addAllRepeatingCameraCaptureCallbacks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5606x4b7c5954(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> collection) {
            this.f1757xcd36dc60.m5343xc7f822cd(collection);
            return this;
        }

        /* renamed from: addAllSessionStateCallbacks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5607x1158c613(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                m5615x4a134b41(it.next());
            }
            return this;
        }

        /* renamed from: addCameraCaptureCallback */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5608xd4aa81a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            this.f1757xcd36dc60.m5345xd4aa81a5(abstractC0659xd0769ba6);
            if (!this.f1765xfc70d6e2.contains(abstractC0659xd0769ba6)) {
                this.f1765xfc70d6e2.add(abstractC0659xd0769ba6);
            }
            return this;
        }

        /* renamed from: addDeviceStateCallback */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5609x836dd6df(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            if (this.f1758xb2a5af40.contains(stateCallback)) {
                return this;
            }
            this.f1758xb2a5af40.add(stateCallback);
            return this;
        }

        /* renamed from: addImplementationOptions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5610x2f697c6b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            this.f1757xcd36dc60.m5347x2f697c6b(interfaceC0692x78a46f62);
            return this;
        }

        /* renamed from: addNonRepeatingSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5611x96a2a8d2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            return m5612x96a2a8d2(abstractC0697x654a0293, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR);
        }

        /* renamed from: addOutputConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5613x5864e6e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig) {
            this.f1761x130979c3.add(outputConfig);
            this.f1757xcd36dc60.m5348x34744cc(outputConfig.mo5172xcf572877());
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = outputConfig.mo5171x71de51e1().iterator();
            while (it.hasNext()) {
                this.f1757xcd36dc60.m5348x34744cc(it.next());
            }
            return this;
        }

        /* renamed from: addRepeatingCameraCaptureCallback */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5614x503be6a0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            this.f1757xcd36dc60.m5345xd4aa81a5(abstractC0659xd0769ba6);
            return this;
        }

        /* renamed from: addSessionStateCallback */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5615x4a134b41(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            if (this.f1763x3b12ad06.contains(stateCallback)) {
                return this;
            }
            this.f1763x3b12ad06.add(stateCallback);
            return this;
        }

        /* renamed from: addSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5616x34744cc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            return m5617x34744cc(abstractC0697x654a0293, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR, null, -1);
        }

        /* renamed from: addTag */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5618xab35ff39(java.lang.String str, java.lang.Object obj) {
            this.f1757xcd36dc60.m5349xab35ff39(str, obj);
            return this;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5619x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958(new java.util.ArrayList(this.f1761x130979c3), new java.util.ArrayList(this.f1758xb2a5af40), new java.util.ArrayList(this.f1763x3b12ad06), new java.util.ArrayList(this.f1765xfc70d6e2), this.f1757xcd36dc60.m5350x59bc66e(), this.f1759x761b7b6f, this.f1760x48d2099, this.f1764xa8b65c43, this.f1762x7d28d795);
        }

        /* renamed from: clearSurfaces */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5620x73b326d3() {
            this.f1761x130979c3.clear();
            this.f1757xcd36dc60.m5351x73b326d3();
            return this;
        }

        /* renamed from: getSingleCameraCaptureCallbacks */
        public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> m5621xcb685e4b() {
            return java.util.Collections.unmodifiableList(this.f1765xfc70d6e2);
        }

        /* renamed from: removeCameraCaptureCallback */
        public boolean m5622xe42adda2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            return this.f1757xcd36dc60.m5358xe42adda2(abstractC0659xd0769ba6) || this.f1765xfc70d6e2.remove(abstractC0659xd0769ba6);
        }

        /* renamed from: removeSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5623xd8cbaf89(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig;
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> it = this.f1761x130979c3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    outputConfig = null;
                    break;
                }
                outputConfig = it.next();
                if (outputConfig.mo5172xcf572877().equals(abstractC0697x654a0293)) {
                    break;
                }
            }
            if (outputConfig != null) {
                this.f1761x130979c3.remove(outputConfig);
            }
            this.f1757xcd36dc60.m5359xd8cbaf89(abstractC0697x654a0293);
            return this;
        }

        /* renamed from: setErrorListener */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5624x6b43959a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener errorListener) {
            this.f1759x761b7b6f = errorListener;
            return this;
        }

        /* renamed from: setExpectedFrameRateRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5625xe875cd2a(android.util.Range<java.lang.Integer> range) {
            this.f1757xcd36dc60.m5361xe875cd2a(range);
            return this;
        }

        /* renamed from: setImplementationOptions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5626x9a12cb4a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            this.f1757xcd36dc60.m5363x9a12cb4a(interfaceC0692x78a46f62);
            return this;
        }

        /* renamed from: setInputConfiguration */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5627xafc5a94e(android.hardware.camera2.params.InputConfiguration inputConfiguration) {
            this.f1760x48d2099 = inputConfiguration;
            return this;
        }

        /* renamed from: setPostviewSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5628x8cb424e6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            this.f1762x7d28d795 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.m5634xdc3ef9b(abstractC0697x654a0293).mo5176x59bc66e();
            return this;
        }

        /* renamed from: setPreviewStabilization */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5629xb21eba79(int i17) {
            if (i17 != 0) {
                this.f1757xcd36dc60.m5365xb21eba79(i17);
            }
            return this;
        }

        /* renamed from: setSessionType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5630x6ee5052e(int i17) {
            this.f1764xa8b65c43 = i17;
            return this;
        }

        /* renamed from: setTemplateType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5631x5d0f9056(int i17) {
            this.f1757xcd36dc60.m5366x5d0f9056(i17);
            return this;
        }

        /* renamed from: setVideoStabilization */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5632xc6227d26(int i17) {
            if (i17 != 0) {
                this.f1757xcd36dc60.m5368xc6227d26(i17);
            }
            return this;
        }

        /* renamed from: addNonRepeatingSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5612x96a2a8d2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            this.f1761x130979c3.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.m5634xdc3ef9b(abstractC0697x654a0293).mo5177xb924c5c0(c0491x2bb48c5e).mo5176x59bc66e());
            return this;
        }

        /* renamed from: addSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5617x34744cc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.lang.String str, int i17) {
            this.f1761x130979c3.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.m5634xdc3ef9b(abstractC0697x654a0293).mo5179x376a1199(str).mo5177xb924c5c0(c0491x2bb48c5e).mo5178x845d2804(i17).mo5176x59bc66e());
            this.f1757xcd36dc60.m5348x34744cc(abstractC0697x654a0293);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$CloseableErrorListener */
    /* loaded from: classes14.dex */
    public static final class CloseableErrorListener implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener {

        /* renamed from: mErrorListener */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener f1766x761b7b6f;

        /* renamed from: mIsClosed */
        private final java.util.concurrent.atomic.AtomicBoolean f1767xfc407ac3 = new java.util.concurrent.atomic.AtomicBoolean(false);

        public CloseableErrorListener(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener errorListener) {
            this.f1766x761b7b6f = errorListener;
        }

        /* renamed from: close */
        public void m5633x5a5ddf8() {
            this.f1767xfc407ac3.set(true);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
        /* renamed from: onError */
        public void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
            if (this.f1767xfc407ac3.get()) {
                return;
            }
            this.f1766x761b7b6f.mo3491xaf8aa769(c0750xb915958, sessionError);
        }
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$ErrorListener */
    /* loaded from: classes14.dex */
    public interface ErrorListener {
        /* renamed from: onError */
        void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError);
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$OptionUnpacker */
    /* loaded from: classes14.dex */
    public interface OptionUnpacker {
        /* renamed from: unpack */
        void mo3296xcde97c32(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder);
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$OutputConfig */
    /* loaded from: classes14.dex */
    public static abstract class OutputConfig {

        /* renamed from: SURFACE_GROUP_ID_NONE */
        public static final int f1768x49c075ca = -1;

        /* renamed from: androidx.camera.core.impl.SessionConfig$OutputConfig$Builder */
        /* loaded from: classes14.dex */
        public static abstract class Builder {
            /* renamed from: build */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig mo5176x59bc66e();

            /* renamed from: setDynamicRange */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5177xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e);

            /* renamed from: setMirrorMode */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5178x845d2804(int i17);

            /* renamed from: setPhysicalCameraId */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5179x376a1199(java.lang.String str);

            /* renamed from: setSharedSurfaces */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5180x39d4b9ed(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list);

            /* renamed from: setSurface */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5181x42c875eb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293);

            /* renamed from: setSurfaceGroupId */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder mo5182x46240f8f(int i17);
        }

        /* renamed from: builder */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig.Builder m5634xdc3ef9b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0654x16d2f8c7.Builder().mo5181x42c875eb(abstractC0697x654a0293).mo5180x39d4b9ed(java.util.Collections.emptyList()).mo5179x376a1199(null).mo5178x845d2804(-1).mo5182x46240f8f(-1).mo5177xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR);
        }

        /* renamed from: getDynamicRange */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5168x82dbcab4();

        /* renamed from: getMirrorMode */
        public abstract int mo5169x5638d9f8();

        /* renamed from: getPhysicalCameraId */
        public abstract java.lang.String mo5170x936d7c8d();

        /* renamed from: getSharedSurfaces */
        public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> mo5171x71de51e1();

        /* renamed from: getSurface */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 mo5172xcf572877();

        /* renamed from: getSurfaceGroupId */
        public abstract int mo5173x7e2da783();
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$SessionError */
    /* loaded from: classes6.dex */
    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$ValidatingBuilder */
    /* loaded from: classes14.dex */
    public static final class ValidatingBuilder extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.BaseBuilder {
        private static final java.lang.String TAG = "ValidatingBuilder";

        /* renamed from: mSurfaceSorter */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0866x489225b8 f1773x7400fe6b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0866x489225b8();

        /* renamed from: mValid */
        private boolean f1775xbee9db8f = true;

        /* renamed from: mTemplateSet */
        private boolean f1774x13877edb = false;

        /* renamed from: mErrorListeners */
        private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener> f1772x4d53f2e4 = new java.util.ArrayList();

        /* renamed from: getSurfaces */
        private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5639x1b8de6dc() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig : this.f1761x130979c3) {
                arrayList.add(outputConfig.mo5172xcf572877());
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = outputConfig.mo5171x71de51e1().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$build$0 */
        public /* synthetic */ void m5640x3372d39d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener> it = this.f1772x4d53f2e4.iterator();
            while (it.hasNext()) {
                it.next().mo3491xaf8aa769(c0750xb915958, sessionError);
            }
        }

        /* renamed from: setOrVerifyExpectFrameRateRange */
        private void m5641xfb99c5e7(android.util.Range<java.lang.Integer> range) {
            android.util.Range<java.lang.Integer> range2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.f1796xf5f0b888;
            if (range.equals(range2)) {
                return;
            }
            if (this.f1757xcd36dc60.m5352xb632311e().equals(range2)) {
                this.f1757xcd36dc60.m5361xe875cd2a(range);
            } else {
                if (this.f1757xcd36dc60.m5352xb632311e().equals(range)) {
                    return;
                }
                this.f1775xbee9db8f = false;
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Different ExpectedFrameRateRange values");
            }
        }

        /* renamed from: setPreviewStabilizationMode */
        private void m5642xb6ff83bc(int i17) {
            if (i17 != 0) {
                this.f1757xcd36dc60.m5365xb21eba79(i17);
            }
        }

        /* renamed from: setVideoStabilizationMode */
        private void m5643xc8d827e9(int i17) {
            if (i17 != 0) {
                this.f1757xcd36dc60.m5368xc6227d26(i17);
            }
        }

        public void add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7 = c0750xb915958.m5597x57482ff7();
            if (m5597x57482ff7.m5337x26c6954a() != -1) {
                this.f1774x13877edb = true;
                this.f1757xcd36dc60.m5366x5d0f9056(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.m5588x52ddc6fd(m5597x57482ff7.m5337x26c6954a(), this.f1757xcd36dc60.m5356x26c6954a()));
            }
            m5641xfb99c5e7(m5597x57482ff7.m5331xb632311e());
            m5642xb6ff83bc(m5597x57482ff7.m5334x732bab0());
            m5643xc8d827e9(m5597x57482ff7.m5338x96948bdd());
            this.f1757xcd36dc60.m5344x3b5ec179(c0750xb915958.m5597x57482ff7().m5336x4aa7b206());
            this.f1758xb2a5af40.addAll(c0750xb915958.m5589xf78bafa9());
            this.f1763x3b12ad06.addAll(c0750xb915958.m5598x92ecb9bd());
            this.f1757xcd36dc60.m5343xc7f822cd(c0750xb915958.m5596x26db407e());
            this.f1765xfc70d6e2.addAll(c0750xb915958.m5600xcb685e4b());
            if (c0750xb915958.m5590xd86d2f26() != null) {
                this.f1772x4d53f2e4.add(c0750xb915958.m5590xd86d2f26());
            }
            if (c0750xb915958.m5593x189a2742() != null) {
                this.f1760x48d2099 = c0750xb915958.m5593x189a2742();
            }
            this.f1761x130979c3.addAll(c0750xb915958.m5594x755b2d7a());
            this.f1757xcd36dc60.m5354x1b8de6dc().addAll(m5597x57482ff7.m5335x1b8de6dc());
            if (!m5639x1b8de6dc().containsAll(this.f1757xcd36dc60.m5354x1b8de6dc())) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f1775xbee9db8f = false;
            }
            if (c0750xb915958.m5599xd87f91ba() != this.f1764xa8b65c43 && c0750xb915958.m5599xd87f91ba() != 0 && this.f1764xa8b65c43 != 0) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Invalid configuration due to that two non-default session types are set");
                this.f1775xbee9db8f = false;
            } else if (c0750xb915958.m5599xd87f91ba() != 0) {
                this.f1764xa8b65c43 = c0750xb915958.m5599xd87f91ba();
            }
            if (c0750xb915958.f1752x7d28d795 != null) {
                if (this.f1762x7d28d795 == c0750xb915958.f1752x7d28d795 || this.f1762x7d28d795 == null) {
                    this.f1762x7d28d795 = c0750xb915958.f1752x7d28d795;
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Invalid configuration due to that two different postview output configs are set");
                    this.f1775xbee9db8f = false;
                }
            }
            this.f1757xcd36dc60.m5347x2f697c6b(m5597x57482ff7.m5333xca0018d6());
        }

        /* renamed from: addImplementationOption */
        public <T> void m5644xcffb2508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<T> option, T t17) {
            this.f1757xcd36dc60.m5346xcffb2508(option, t17);
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5645x59bc66e() {
            if (!this.f1775xbee9db8f) {
                throw new java.lang.IllegalArgumentException("Unsupported session configuration combination");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f1761x130979c3);
            this.f1773x7400fe6b.m6204x35f59e(arrayList);
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958(arrayList, new java.util.ArrayList(this.f1758xb2a5af40), new java.util.ArrayList(this.f1763x3b12ad06), new java.util.ArrayList(this.f1765xfc70d6e2), this.f1757xcd36dc60.m5350x59bc66e(), !this.f1772x4d53f2e4.isEmpty() ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener() { // from class: androidx.camera.core.impl.SessionConfig$ValidatingBuilder$$a
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
                /* renamed from: onError */
                public final void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder.this.m5640x3372d39d(c0750xb915958, sessionError);
                }
            } : null, this.f1760x48d2099, this.f1764xa8b65c43, this.f1762x7d28d795);
        }

        /* renamed from: clearSurfaces */
        public void m5646x73b326d3() {
            this.f1761x130979c3.clear();
            this.f1757xcd36dc60.m5351x73b326d3();
        }

        /* renamed from: isValid */
        public boolean m5647x7b953cf2() {
            return this.f1774x13877edb && this.f1775xbee9db8f;
        }
    }

    public C0750xb915958(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> list, java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list2, java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list3, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener errorListener, android.hardware.camera2.params.InputConfiguration inputConfiguration, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig) {
        this.f1751x130979c3 = list;
        this.f1748xb2a5af40 = java.util.Collections.unmodifiableList(list2);
        this.f1754x3b12ad06 = java.util.Collections.unmodifiableList(list3);
        this.f1756xfc70d6e2 = java.util.Collections.unmodifiableList(list4);
        this.f1749x761b7b6f = errorListener;
        this.f1753xb3e0a5ce = c0690x88f65a08;
        this.f1750x48d2099 = inputConfiguration;
        this.f1755xa8b65c43 = i17;
        this.f1752x7d28d795 = outputConfig;
    }

    /* renamed from: defaultEmptySessionConfig */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5587xcb957d4c() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958(new java.util.ArrayList(), new java.util.ArrayList(0), new java.util.ArrayList(0), new java.util.ArrayList(0), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder().m5350x59bc66e(), null, null, 0, null);
    }

    /* renamed from: getHigherPriorityTemplateType */
    public static int m5588x52ddc6fd(int i17, int i18) {
        java.util.List<java.lang.Integer> list = f1747xa7244e58;
        return list.indexOf(java.lang.Integer.valueOf(i17)) >= list.indexOf(java.lang.Integer.valueOf(i18)) ? i17 : i18;
    }

    /* renamed from: getDeviceStateCallbacks */
    public java.util.List<android.hardware.camera2.CameraDevice.StateCallback> m5589xf78bafa9() {
        return this.f1748xb2a5af40;
    }

    /* renamed from: getErrorListener */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener m5590xd86d2f26() {
        return this.f1749x761b7b6f;
    }

    /* renamed from: getExpectedFrameRateRange */
    public android.util.Range<java.lang.Integer> m5591xb632311e() {
        return this.f1753xb3e0a5ce.m5331xb632311e();
    }

    /* renamed from: getImplementationOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5592xca0018d6() {
        return this.f1753xb3e0a5ce.m5333xca0018d6();
    }

    /* renamed from: getInputConfiguration */
    public android.hardware.camera2.params.InputConfiguration m5593x189a2742() {
        return this.f1750x48d2099;
    }

    /* renamed from: getOutputConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig> m5594x755b2d7a() {
        return this.f1751x130979c3;
    }

    /* renamed from: getPostviewOutputConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig m5595xc20ed7fe() {
        return this.f1752x7d28d795;
    }

    /* renamed from: getRepeatingCameraCaptureCallbacks */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> m5596x26db407e() {
        return this.f1753xb3e0a5ce.m5329x78e2a463();
    }

    /* renamed from: getRepeatingCaptureConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5597x57482ff7() {
        return this.f1753xb3e0a5ce;
    }

    /* renamed from: getSessionStateCallbacks */
    public java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> m5598x92ecb9bd() {
        return this.f1754x3b12ad06;
    }

    /* renamed from: getSessionType */
    public int m5599xd87f91ba() {
        return this.f1755xa8b65c43;
    }

    /* renamed from: getSingleCameraCaptureCallbacks */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> m5600xcb685e4b() {
        return this.f1756xfc70d6e2;
    }

    /* renamed from: getSurfaces */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5601x1b8de6dc() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OutputConfig outputConfig : this.f1751x130979c3) {
            arrayList.add(outputConfig.mo5172xcf572877());
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = outputConfig.mo5171x71de51e1().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* renamed from: getTemplateType */
    public int m5602x26c6954a() {
        return this.f1753xb3e0a5ce.m5337x26c6954a();
    }
}
