package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NativeCapturerObserver */
/* loaded from: classes16.dex */
class C29821xcd025f39 implements org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 {

    /* renamed from: nativeAndroidVideoTrackSource */
    private final org.p3371xd0ce3e8d.C29820xea86f423 f75586x14838443;

    public C29821xcd025f39(long j17) {
        this.f75586x14838443 = new org.p3371xd0ce3e8d.C29820xea86f423(j17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
    /* renamed from: onCapturerStarted */
    public void mo155342x5e404516(boolean z17) {
        this.f75586x14838443.m155797x53b6854f(z17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
    /* renamed from: onCapturerStopped */
    public void mo155343x5f049662() {
        this.f75586x14838443.m155797x53b6854f(false);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29751x4bd47102
    /* renamed from: onFrameCaptured */
    public void mo155344x962f56cc(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters m155793xc59d076b = this.f75586x14838443.m155793xc59d076b(c29904x150215d2);
        if (m155793xc59d076b == null) {
            return;
        }
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63 = c29904x150215d2.m156544x12f2b736().mo155637xdbd1bc63(m155793xc59d076b.f76132x5a897c8, m155793xc59d076b.f76133x5a897c9, m155793xc59d076b.f76131x4caa9d16, m155793xc59d076b.f76130x2eda0bd7, m155793xc59d076b.f76136x723c729c, m155793xc59d076b.f76135xbb82e711);
        this.f75586x14838443.m155795x962f56cc(new org.p3371xd0ce3e8d.C29904x150215d2(mo155637xdbd1bc63, c29904x150215d2.m156547x79734cf4(), m155793xc59d076b.f76137x55a3457b));
        mo155637xdbd1bc63.mo155513x41012807();
    }
}
