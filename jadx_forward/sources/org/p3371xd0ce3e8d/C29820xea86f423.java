package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.NativeAndroidVideoTrackSource */
/* loaded from: classes16.dex */
public class C29820xea86f423 {

    /* renamed from: nativeAndroidVideoTrackSource */
    private final long f75585x14838443;

    public C29820xea86f423(long j17) {
        this.f75585x14838443 = j17;
    }

    /* renamed from: createFrameAdaptationParameters */
    public static org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters m155787x9942a2ce(int i17, int i18, int i19, int i27, int i28, int i29, long j17, boolean z17) {
        return new org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters(i17, i18, i19, i27, i28, i29, j17, z17);
    }

    /* renamed from: nativeAdaptFrame */
    private static native org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters m155788xab9942e2(long j17, int i17, int i18, int i19, long j18);

    /* renamed from: nativeAdaptOutputFormat */
    private static native void m155789x5efa4143(long j17, int i17, int i18, java.lang.Integer num, int i19, int i27, java.lang.Integer num2, java.lang.Integer num3);

    /* renamed from: nativeOnFrameCaptured */
    private static native void m155790x86b0adb5(long j17, int i17, long j18, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer);

    /* renamed from: nativeSetIsScreencast */
    private static native void m155791xf04e06e0(long j17, boolean z17);

    /* renamed from: nativeSetState */
    private static native void m155792x6ba93286(long j17, boolean z17);

    /* renamed from: adaptFrame */
    public org.p3371xd0ce3e8d.InterfaceC29907x95e7fe77.FrameAdaptationParameters m155793xc59d076b(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        return m155788xab9942e2(this.f75585x14838443, c29904x150215d2.m156544x12f2b736().mo155645x755bd410(), c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d(), c29904x150215d2.m156547x79734cf4(), c29904x150215d2.m156548x2f798c45());
    }

    /* renamed from: adaptOutputFormat */
    public void m155794x8973009a(org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio aspectRatio, java.lang.Integer num, org.p3371xd0ce3e8d.C29909xa14e8856.AspectRatio aspectRatio2, java.lang.Integer num2, java.lang.Integer num3) {
        m155789x5efa4143(this.f75585x14838443, aspectRatio.f76146x6be2dc6, aspectRatio.f76145xb7389127, num, aspectRatio2.f76146x6be2dc6, aspectRatio2.f76145xb7389127, num2, num3);
    }

    /* renamed from: onFrameCaptured */
    public void m155795x962f56cc(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        m155790x86b0adb5(this.f75585x14838443, c29904x150215d2.m156547x79734cf4(), c29904x150215d2.m156548x2f798c45(), c29904x150215d2.m156544x12f2b736());
    }

    /* renamed from: setIsScreencast */
    public void m155796xffccaff7(boolean z17) {
        m155791xf04e06e0(this.f75585x14838443, z17);
    }

    /* renamed from: setState */
    public void m155797x53b6854f(boolean z17) {
        m155792x6ba93286(this.f75585x14838443, z17);
    }
}
