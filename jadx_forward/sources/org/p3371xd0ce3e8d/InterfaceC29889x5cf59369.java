package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoDecoder */
/* loaded from: classes6.dex */
public interface InterfaceC29889x5cf59369 {

    /* renamed from: org.webrtc.VideoDecoder$Callback */
    /* loaded from: classes6.dex */
    public interface Callback {
        /* renamed from: onDecodedFrame */
        void mo156509x1873ca56(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, java.lang.Integer num, java.lang.Integer num2);
    }

    /* renamed from: org.webrtc.VideoDecoder$DecodeInfo */
    /* loaded from: classes6.dex */
    public static class DecodeInfo {

        /* renamed from: isMissingFrames */
        public final boolean f76066xffc24a2;

        /* renamed from: renderTimeMs */
        public final long f76067x2d4f0289;

        public DecodeInfo(boolean z17, long j17) {
            this.f76066xffc24a2 = z17;
            this.f76067x2d4f0289 = j17;
        }
    }

    /* renamed from: org.webrtc.VideoDecoder$Settings */
    /* loaded from: classes6.dex */
    public static class Settings {

        /* renamed from: height */
        public final int f76068xb7389127;

        /* renamed from: numberOfCores */
        public final int f76069xb03f7d94;

        /* renamed from: width */
        public final int f76070x6be2dc6;

        public Settings(int i17, int i18, int i19) {
            this.f76069xb03f7d94 = i17;
            this.f76070x6be2dc6 = i18;
            this.f76068xb7389127 = i19;
        }
    }

    /* renamed from: createNativeVideoDecoder */
    default long mo155657x89bf0f1c() {
        return 0L;
    }

    /* renamed from: decode */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155124xb06291ee(org.p3371xd0ce3e8d.C29774xf0e0810d c29774xf0e0810d, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.DecodeInfo decodeInfo);

    /* renamed from: getImplementationName */
    java.lang.String mo155126xb8d5d353();

    /* renamed from: initDecode */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155127xf4fcd71e(org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Settings settings, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback callback);

    /* renamed from: release */
    org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155129x41012807();
}
