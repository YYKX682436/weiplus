package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoEncoderFactory */
/* loaded from: classes16.dex */
public interface InterfaceC29895x64274189 {

    /* renamed from: org.webrtc.VideoEncoderFactory$VideoEncoderSelector */
    /* loaded from: classes15.dex */
    public interface VideoEncoderSelector {
        /* renamed from: onAvailableBitrate */
        org.p3371xd0ce3e8d.C29886x94209fc9 m156525x11be3863(int i17);

        /* renamed from: onCurrentEncoder */
        void m156526x703b9d22(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9);

        /* renamed from: onEncoderBroken */
        org.p3371xd0ce3e8d.C29886x94209fc9 m156527x7918872();
    }

    /* renamed from: createEncoder */
    org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a880(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9);

    /* renamed from: getEncoderSelector */
    default org.p3371xd0ce3e8d.InterfaceC29895x64274189.VideoEncoderSelector m156523xd39ad2e5() {
        return null;
    }

    /* renamed from: getImplementations */
    default org.p3371xd0ce3e8d.C29886x94209fc9[] m156524xac19ccb() {
        return mo155393xd8a0cb35();
    }

    /* renamed from: getSupportedCodecs */
    org.p3371xd0ce3e8d.C29886x94209fc9[] mo155393xd8a0cb35();
}
