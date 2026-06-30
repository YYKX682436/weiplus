package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository */
/* loaded from: classes14.dex */
public class C0222xaa5cc7fa {

    /* renamed from: mExecutor */
    final java.util.concurrent.Executor f397x9ec3a060;

    /* renamed from: mLock */
    final java.lang.Object f398x6243b38 = new java.lang.Object();

    /* renamed from: mCaptureSessions */
    final java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> f394xa63785d6 = new java.util.LinkedHashSet();

    /* renamed from: mClosingCaptureSession */
    final java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> f395xc2bdc618 = new java.util.LinkedHashSet();

    /* renamed from: mCreatingCaptureSessions */
    final java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> f396x32b0e2dd = new java.util.LinkedHashSet();

    /* renamed from: mCameraStateCallback */
    private final android.hardware.camera2.CameraDevice.StateCallback f393x43e4a724 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.AnonymousClass1();

    /* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends android.hardware.camera2.CameraDevice.StateCallback {
        public AnonymousClass1() {
        }

        /* renamed from: cameraClosed */
        private void m3371xac9ce0f1() {
            java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3365x2b3b1796;
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f398x6243b38) {
                m3365x2b3b1796 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.m3365x2b3b1796();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f396x32b0e2dd.clear();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f394xa63785d6.clear();
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f395xc2bdc618.clear();
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it = m3365x2b3b1796.iterator();
            while (it.hasNext()) {
                it.next().mo3592x4ec94525();
            }
        }

        /* renamed from: dispatchOnError */
        private void m3372xf8e4dd8f(final int i17) {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f398x6243b38) {
                linkedHashSet.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f396x32b0e2dd);
                linkedHashSet.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f394xa63785d6);
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f397x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSessionRepository$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.AnonymousClass1.m3374xe76016bf(linkedHashSet, i17);
                }
            });
        }

        /* renamed from: forceOnClosedCaptureSessions */
        private void m3373xe818ceed() {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            synchronized (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f398x6243b38) {
                linkedHashSet.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f396x32b0e2dd);
                linkedHashSet.addAll(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f394xa63785d6);
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.this.f397x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSessionRepository$1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa.m3360xe55e8c36(linkedHashSet);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$dispatchOnError$1 */
        public static /* synthetic */ void m3374xe76016bf(java.util.LinkedHashSet linkedHashSet, int i17) {
            java.util.Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4) it.next()).mo3597xbde300ce(i17);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            m3373xe818ceed();
            m3371xac9ce0f1();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            m3373xe818ceed();
            m3371xac9ce0f1();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            m3373xe818ceed();
            m3372xf8e4dd8f(i17);
            m3371xac9ce0f1();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        }
    }

    public C0222xaa5cc7fa(java.util.concurrent.Executor executor) {
        this.f397x9ec3a060 = executor;
    }

    /* renamed from: forceFinishCloseStaleSessions */
    private void m3359x11ecdc3c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 next;
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it = m3365x2b3b1796().iterator();
        while (it.hasNext() && (next = it.next()) != interfaceC0264x1b7732c4) {
            next.mo3592x4ec94525();
        }
    }

    /* renamed from: forceOnClosed */
    public static void m3360xe55e8c36(java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> set) {
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4 : set) {
            interfaceC0264x1b7732c4.mo3596xf33fe440().mo3612x3e0ab82b(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: getCameraStateCallback */
    public android.hardware.camera2.CameraDevice.StateCallback m3361xb178759b() {
        return this.f393x43e4a724;
    }

    /* renamed from: getCaptureSessions */
    public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3362xbaeb27cd() {
        java.util.ArrayList arrayList;
        synchronized (this.f398x6243b38) {
            arrayList = new java.util.ArrayList(this.f394xa63785d6);
        }
        return arrayList;
    }

    /* renamed from: getClosingCaptureSession */
    public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3363x1a97d2cf() {
        java.util.ArrayList arrayList;
        synchronized (this.f398x6243b38) {
            arrayList = new java.util.ArrayList(this.f395xc2bdc618);
        }
        return arrayList;
    }

    /* renamed from: getCreatingCaptureSessions */
    public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3364xfc3a9dd4() {
        java.util.ArrayList arrayList;
        synchronized (this.f398x6243b38) {
            arrayList = new java.util.ArrayList(this.f396x32b0e2dd);
        }
        return arrayList;
    }

    /* renamed from: getSessionsInOrder */
    public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> m3365x2b3b1796() {
        java.util.ArrayList arrayList;
        synchronized (this.f398x6243b38) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(m3362xbaeb27cd());
            arrayList.addAll(m3364xfc3a9dd4());
        }
        return arrayList;
    }

    /* renamed from: onCaptureSessionClosed */
    public void m3366x1ab30e7b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        synchronized (this.f398x6243b38) {
            this.f394xa63785d6.remove(interfaceC0264x1b7732c4);
            this.f395xc2bdc618.remove(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: onCaptureSessionClosing */
    public void m3367x3baed186(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        synchronized (this.f398x6243b38) {
            this.f395xc2bdc618.add(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: onCaptureSessionConfigureFail */
    public void m3368xd82e9f35(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        m3359x11ecdc3c(interfaceC0264x1b7732c4);
        synchronized (this.f398x6243b38) {
            this.f396x32b0e2dd.remove(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: onCaptureSessionCreated */
    public void m3369x4556f3b9(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        synchronized (this.f398x6243b38) {
            this.f394xa63785d6.add(interfaceC0264x1b7732c4);
            this.f396x32b0e2dd.remove(interfaceC0264x1b7732c4);
        }
        m3359x11ecdc3c(interfaceC0264x1b7732c4);
    }

    /* renamed from: onCreateCaptureSession */
    public void m3370x8df9590b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        synchronized (this.f398x6243b38) {
            this.f396x32b0e2dd.add(interfaceC0264x1b7732c4);
        }
    }
}
