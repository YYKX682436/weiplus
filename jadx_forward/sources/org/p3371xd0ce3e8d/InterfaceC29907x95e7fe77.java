package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoProcessor */
/* loaded from: classes16.dex */
public interface InterfaceC29907x95e7fe77 extends org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 {

    /* renamed from: org.webrtc.VideoProcessor$FrameAdaptationParameters */
    /* loaded from: classes16.dex */
    public static class FrameAdaptationParameters {

        /* renamed from: cropHeight */
        public final int f76130x2eda0bd7;

        /* renamed from: cropWidth */
        public final int f76131x4caa9d16;

        /* renamed from: cropX */
        public final int f76132x5a897c8;

        /* renamed from: cropY */
        public final int f76133x5a897c9;

        /* renamed from: drop */
        public final boolean f76134x2f2eef;

        /* renamed from: scaleHeight */
        public final int f76135xbb82e711;

        /* renamed from: scaleWidth */
        public final int f76136x723c729c;

        /* renamed from: timestampNs */
        public final long f76137x55a3457b;

        public FrameAdaptationParameters(int i17, int i18, int i19, int i27, int i28, int i29, long j17, boolean z17) {
            this.f76132x5a897c8 = i17;
            this.f76133x5a897c9 = i18;
            this.f76131x4caa9d16 = i19;
            this.f76130x2eda0bd7 = i27;
            this.f76136x723c729c = i28;
            this.f76135xbb82e711 = i29;
            this.f76137x55a3457b = j17;
            this.f76134x2f2eef = z17;
        }
    }

    /* renamed from: applyFrameAdaptationParameters */
    static org.p3371xd0ce3e8d.C29904x150215d2 m156568xb4e6049c(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.f76134x2f2eef) {
            return null;
        }
        return new org.p3371xd0ce3e8d.C29904x150215d2(c29904x150215d2.m156544x12f2b736().mo155637xdbd1bc63(frameAdaptationParameters.f76132x5a897c8, frameAdaptationParameters.f76133x5a897c9, frameAdaptationParameters.f76131x4caa9d16, frameAdaptationParameters.f76130x2eda0bd7, frameAdaptationParameters.f76136x723c729c, frameAdaptationParameters.f76135xbb82e711), c29904x150215d2.m156547x79734cf4(), frameAdaptationParameters.f76137x55a3457b);
    }

    /* renamed from: onFrameCaptured */
    default void m156569x962f56cc(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters frameAdaptationParameters) {
        org.p3371xd0ce3e8d.C29904x150215d2 m156568xb4e6049c = m156568xb4e6049c(c29904x150215d2, frameAdaptationParameters);
        if (m156568xb4e6049c != null) {
            mo155344x962f56cc(m156568xb4e6049c);
            m156568xb4e6049c.mo155513x41012807();
        }
    }

    /* renamed from: setSink */
    void m156570x76500e15(org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e);
}
