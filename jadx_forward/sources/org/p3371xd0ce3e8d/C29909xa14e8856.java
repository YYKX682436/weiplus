package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoSource */
/* loaded from: classes16.dex */
public class C29909xa14e8856 extends org.p3371xd0ce3e8d.C29813x4f0bf0ff {

    /* renamed from: capturerObserver */
    private final org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 f76138x7e102ce2;

    /* renamed from: isCapturerRunning */
    private boolean f76139xafa23ba9;

    /* renamed from: nativeAndroidVideoTrackSource */
    private final org.p3371xd0ce3e8d.C29820xea86f423 f76140x14838443;

    /* renamed from: videoProcessor */
    private org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77 f76141xd1a13257;

    /* renamed from: videoProcessorLock */
    private final java.lang.Object f76142xdea66822;

    /* renamed from: org.webrtc.VideoSource$AspectRatio */
    /* loaded from: classes16.dex */
    public static class AspectRatio {

        /* renamed from: UNDEFINED */
        public static final org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio f76144x68377130 = new org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio(0, 0);

        /* renamed from: height */
        public final int f76145xb7389127;

        /* renamed from: width */
        public final int f76146x6be2dc6;

        public AspectRatio(int i17, int i18) {
            this.f76146x6be2dc6 = i17;
            this.f76145xb7389127 = i18;
        }
    }

    public C29909xa14e8856(long j17) {
        super(j17);
        this.f76142xdea66822 = new java.lang.Object();
        this.f76138x7e102ce2 = new org.p3371xd0ce3e8d.InterfaceC29751x4bd47102() { // from class: org.webrtc.VideoSource.1
            @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
            /* renamed from: onCapturerStarted */
            public void mo155342x5e404516(boolean z17) {
                org.p3371xd0ce3e8d.C29909xa14e8856.this.f76140x14838443.m155797x53b6854f(z17);
                synchronized (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76142xdea66822) {
                    org.p3371xd0ce3e8d.C29909xa14e8856.this.f76139xafa23ba9 = z17;
                    if (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257 != null) {
                        org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257.mo155342x5e404516(z17);
                    }
                }
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
            /* renamed from: onCapturerStopped */
            public void mo155343x5f049662() {
                org.p3371xd0ce3e8d.C29909xa14e8856.this.f76140x14838443.m155797x53b6854f(false);
                synchronized (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76142xdea66822) {
                    org.p3371xd0ce3e8d.C29909xa14e8856.this.f76139xafa23ba9 = false;
                    if (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257 != null) {
                        org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257.mo155343x5f049662();
                    }
                }
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
            /* renamed from: onFrameCaptured */
            public void mo155344x962f56cc(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
                org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters m155793xc59d076b = org.p3371xd0ce3e8d.C29909xa14e8856.this.f76140x14838443.m155793xc59d076b(c29904x150215d2);
                synchronized (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76142xdea66822) {
                    if (org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257 != null) {
                        org.p3371xd0ce3e8d.C29909xa14e8856.this.f76141xd1a13257.m156569x962f56cc(c29904x150215d2, m155793xc59d076b);
                        return;
                    }
                    org.p3371xd0ce3e8d.C29904x150215d2 m156568xb4e6049c = org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.m156568xb4e6049c(c29904x150215d2, m155793xc59d076b);
                    if (m156568xb4e6049c != null) {
                        org.p3371xd0ce3e8d.C29909xa14e8856.this.f76140x14838443.m155795x962f56cc(m156568xb4e6049c);
                        m156568xb4e6049c.mo155513x41012807();
                    }
                }
            }
        };
        this.f76140x14838443 = new org.p3371xd0ce3e8d.C29820xea86f423(j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setVideoProcessor$0 */
    public /* synthetic */ void m156575xb089c948(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        this.f76140x14838443.m155795x962f56cc(c29904x150215d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setVideoProcessor$1 */
    public /* synthetic */ void m156576xb089c949(final org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        m155732xbdb15c5a(new java.lang.Runnable() { // from class: org.webrtc.VideoSource$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29909xa14e8856.this.m156575xb089c948(c29904x150215d2);
            }
        });
    }

    /* renamed from: adaptOutputFormat */
    public void m156577x8973009a(int i17, int i18, int i19) {
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        m156578x8973009a(max, min, min, max, i19);
    }

    @Override // org.p3371xd0ce3e8d.C29813x4f0bf0ff
    /* renamed from: dispose */
    public void mo155730x63a5261f() {
        m156583x882f6759(null);
        super.mo155730x63a5261f();
    }

    /* renamed from: getCapturerObserver */
    public org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 m156580x25e89458() {
        return this.f76138x7e102ce2;
    }

    /* renamed from: getNativeVideoTrackSource */
    public long m156581xb5ff66f8() {
        return m155731x186203d2();
    }

    /* renamed from: setIsScreencast */
    public void m156582xffccaff7(boolean z17) {
        this.f76140x14838443.m155796xffccaff7(z17);
    }

    /* renamed from: setVideoProcessor */
    public void m156583x882f6759(org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77 interfaceC29907x95e7fe77) {
        synchronized (this.f76142xdea66822) {
            org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77 interfaceC29907x95e7fe772 = this.f76141xd1a13257;
            if (interfaceC29907x95e7fe772 != null) {
                interfaceC29907x95e7fe772.m156570x76500e15(null);
                if (this.f76139xafa23ba9) {
                    this.f76141xd1a13257.mo155343x5f049662();
                }
            }
            this.f76141xd1a13257 = interfaceC29907x95e7fe77;
            if (interfaceC29907x95e7fe77 != null) {
                interfaceC29907x95e7fe77.m156570x76500e15(new org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e() { // from class: org.webrtc.VideoSource$$b
                    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
                    /* renamed from: onFrame */
                    public final void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
                        org.p3371xd0ce3e8d.C29909xa14e8856.this.m156576xb089c949(c29904x150215d2);
                    }
                });
                if (this.f76139xafa23ba9) {
                    interfaceC29907x95e7fe77.mo155342x5e404516(true);
                }
            }
        }
    }

    /* renamed from: adaptOutputFormat */
    public void m156578x8973009a(int i17, int i18, int i19, int i27, int i28) {
        m156579x8973009a(new org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio(i17, i18), java.lang.Integer.valueOf(i17 * i18), new org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio(i19, i27), java.lang.Integer.valueOf(i19 * i27), java.lang.Integer.valueOf(i28));
    }

    /* renamed from: adaptOutputFormat */
    public void m156579x8973009a(org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio aspectRatio, java.lang.Integer num, org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio aspectRatio2, java.lang.Integer num2, java.lang.Integer num3) {
        this.f76140x14838443.m155794x8973009a(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
