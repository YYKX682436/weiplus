package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.VideoEncoderWrapper */
/* loaded from: classes6.dex */
public class C29897x4559512 {
    /* renamed from: createEncoderCallback */
    public static org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback m156529x92beace5(final long j17) {
        return new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback() { // from class: org.webrtc.VideoEncoderWrapper$$a
            @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback
            /* renamed from: onEncodedFrame */
            public final void mo156516x5c2fb87e(org.p3371xd0ce3e8d.C29774xf0e0810d c29774xf0e0810d, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo codecSpecificInfo) {
                org.p3371xd0ce3e8d.C29897x4559512.m156534x2a236075(j17, c29774xf0e0810d);
            }
        };
    }

    /* renamed from: getScalingSettingsHigh */
    public static java.lang.Integer m156530x82ad5e56(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings scalingSettings) {
        return scalingSettings.f76082x30dda2;
    }

    /* renamed from: getScalingSettingsLow */
    public static java.lang.Integer m156531x88583c20(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    /* renamed from: getScalingSettingsOn */
    public static boolean m156532xa14d2b93(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings scalingSettings) {
        return scalingSettings.f429483on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnEncodedFrame */
    public static native void m156534x2a236075(long j17, org.p3371xd0ce3e8d.C29774xf0e0810d c29774xf0e0810d);
}
