package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd;

/* renamed from: androidx.camera.camera2.interop.Camera2Interop */
/* loaded from: classes6.dex */
public final class C0447x9a1aa170 {

    /* renamed from: androidx.camera.camera2.interop.Camera2Interop$Extender */
    /* loaded from: classes14.dex */
    public static final class Extender<T> {

        /* renamed from: mBaseBuilder */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567<T> f783x40fe74dd;

        public Extender(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567<T> interfaceC0501xb43e0567) {
            this.f783x40fe74dd = interfaceC0501xb43e0567;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: setCaptureRequestOption */
        public <ValueT> p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4155xea2ad5c0(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5520x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.m2879xd8b8695a(key), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        /* renamed from: setCaptureRequestTemplate */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4156xc0bcf305(int i17) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f113x187870d5, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setDeviceStateCallback */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4157x7f8b517e(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f108xa4f5f0b8, stateCallback);
            return this;
        }

        /* renamed from: setPhysicalCameraId */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4158x376a1199(java.lang.String str) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f110x1d046d5e, str);
            return this;
        }

        /* renamed from: setSessionCaptureCallback */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4159x36fdaf37(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f109x23e1afcd, captureCallback);
            return this;
        }

        /* renamed from: setSessionStateCallback */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4160xd1a52482(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f111x836214d8, stateCallback);
            return this;
        }

        /* renamed from: setStreamUseCase */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0447x9a1aa170.Extender<T> m4161x638e9475(long j17) {
            this.f783x40fe74dd.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.f112xb3c16ecd, java.lang.Long.valueOf(j17));
            return this;
        }
    }

    private C0447x9a1aa170() {
    }
}
