package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks */
/* loaded from: classes14.dex */
final class C0275x3060af21 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback {

    /* renamed from: mCallbacks */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> f557x3c7f32e1;

    public C0275x3060af21(java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f557x3c7f32e1 = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: createComboCallback */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback m3629x20225057(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback... stateCallbackArr) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0275x3060af21(java.util.Arrays.asList(stateCallbackArr));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onActive */
    public void mo3610x3a2455c5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3610x3a2455c5(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onCaptureQueueEmpty */
    public void mo3611xf5ec0e83(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3611xf5ec0e83(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onClosed */
    public void mo3612x3e0ab82b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3612x3e0ab82b(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onConfigureFailed */
    public void mo3355xa3b7eee4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3355xa3b7eee4(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onConfigured */
    public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3356xf8bc597d(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onReady */
    public void mo3357xb03baf04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3357xb03baf04(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onSessionFinished */
    public void mo3358x4d620149(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3358x4d620149(interfaceC0264x1b7732c4);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
    /* renamed from: onSurfacePrepared */
    public void mo3613xa39a382b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4, android.view.Surface surface) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback> it = this.f557x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo3613xa39a382b(interfaceC0264x1b7732c4, surface);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks$Adapter */
    /* loaded from: classes14.dex */
    public static class Adapter extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback {

        /* renamed from: mCameraCaptureSessionStateCallback */
        private final android.hardware.camera2.CameraCaptureSession.StateCallback f558x978c2c14;

        public Adapter(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.f558x978c2c14 = stateCallback;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onActive */
        public void mo3610x3a2455c5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            this.f558x978c2c14.onActive(interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onCaptureQueueEmpty */
        public void mo3611xf5ec0e83(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api26Impl.m3693xf5ec0e83(this.f558x978c2c14, interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onClosed */
        public void mo3612x3e0ab82b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            this.f558x978c2c14.onClosed(interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onConfigureFailed */
        public void mo3355xa3b7eee4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            this.f558x978c2c14.onConfigureFailed(interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onConfigured */
        public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            this.f558x978c2c14.onConfigured(interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onReady */
        public void mo3357xb03baf04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
            this.f558x978c2c14.onReady(interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onSessionFinished */
        public void mo3358x4d620149(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback
        /* renamed from: onSurfacePrepared */
        public void mo3613xa39a382b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4, android.view.Surface surface) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api23Impl.m3690xa39a382b(this.f558x978c2c14, interfaceC0264x1b7732c4.mo3603x27efedb2().m3708xcf839a10(), surface);
        }

        public Adapter(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            this(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0206x8fafb1b2.m3302x20225057(list));
        }
    }
}
