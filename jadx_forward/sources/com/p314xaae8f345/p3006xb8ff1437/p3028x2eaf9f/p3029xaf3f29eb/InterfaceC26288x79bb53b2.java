package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPCodecCapability */
/* loaded from: classes14.dex */
public interface InterfaceC26288x79bb53b2 {

    /* renamed from: DEFAULT_FRAMERATE */
    public static final int f51624xe7ec6f0f = 30;

    /* renamed from: DEFAULT_INVALID_PARAMETER */
    public static final int f51625x6eb18083 = -1;

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecCapability$TPACodecPropertyRange */
    /* loaded from: classes14.dex */
    public static class TPACodecPropertyRange implements java.io.Serializable {

        /* renamed from: level */
        public int f51626x6219b84;

        /* renamed from: lowerboundBitRate */
        public int f51627xbaeaf5b0;

        /* renamed from: lowerboundChannels */
        public int f51628xb692e20d;

        /* renamed from: lowerboundSampleRate */
        public int f51629xd8ff74a7;

        /* renamed from: profile */
        public int f51630xed8e89a9;

        /* renamed from: upperboundBitRate */
        public int f51631xfd75b9d1;

        /* renamed from: upperboundChannels */
        public int f51632xc560a20c;

        /* renamed from: upperboundSampleRate */
        public int f51633x6b5d30e6;

        public void set(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            this.f51633x6b5d30e6 = i17;
            this.f51632xc560a20c = i18;
            this.f51631xfd75b9d1 = i19;
            this.f51629xd8ff74a7 = i27;
            this.f51628xb692e20d = i28;
            this.f51627xbaeaf5b0 = i29;
            this.f51630xed8e89a9 = i37;
            this.f51626x6219b84 = i38;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecCapability$TPVCodecPropertyRange */
    /* loaded from: classes14.dex */
    public static class TPVCodecPropertyRange implements java.io.Serializable {

        /* renamed from: level */
        public int f51647x6219b84;

        /* renamed from: lowerboundHeight */
        public int f51648x208bbaa4;

        /* renamed from: lowerboundWidth */
        public int f51649xbfd160a9;

        /* renamed from: profile */
        public int f51650xed8e89a9;

        /* renamed from: upperboundHeight */
        public int f51651x3b776e63;

        /* renamed from: upperboundWidth */
        public int f51652x44d0b90a;

        public void set(int i17, int i18, int i19, int i27, int i28, int i29) {
            this.f51652x44d0b90a = i17;
            this.f51651x3b776e63 = i18;
            this.f51649xbfd160a9 = i19;
            this.f51648x208bbaa4 = i27;
            this.f51650xed8e89a9 = i28;
            this.f51647x6219b84 = i29;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecCapability$TPHdrSupportVersionRange */
    /* loaded from: classes14.dex */
    public static class TPHdrSupportVersionRange implements java.io.Serializable {

        /* renamed from: lowerboundAndroidAPILevel */
        public int f51641x35d4e43c;

        /* renamed from: lowerboundPatchVersion */
        public int f51642xec18b2d;

        /* renamed from: lowerboundSystemVersion */
        public int f51643x5a53df8c;

        /* renamed from: upperboundAndroidAPILevel */
        public int f51644xd02df75d;

        /* renamed from: upperboundPatchVersion */
        public int f51645x80a133ac;

        /* renamed from: upperboundSystemVersion */
        public int f51646x246946ed;

        public TPHdrSupportVersionRange(int i17, int i18, int i19, int i27) {
            this.f51646x246946ed = i17;
            this.f51643x5a53df8c = i18;
            this.f51645x80a133ac = i19;
            this.f51642xec18b2d = i27;
        }

        public TPHdrSupportVersionRange(int i17, int i18) {
            this.f51644xd02df75d = i17;
            this.f51641x35d4e43c = i18;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability */
    /* loaded from: classes14.dex */
    public static class TPCodecMaxCapability implements java.io.Serializable {

        /* renamed from: maxBitRate */
        public int f51634x3fd1c989;

        /* renamed from: maxChannels */
        public int f51635xce868954;

        /* renamed from: maxFramerateFormaxLumaSamples */
        public int f51636x88dcf5a8;

        /* renamed from: maxLevel */
        public int f51637x1740c480;

        /* renamed from: maxLumaSamples */
        public int f51638x4fa4b468;

        /* renamed from: maxProfile */
        public int f51639x338763a5;

        /* renamed from: maxSampleRate */
        public int f51640xc2a6662e;

        @java.lang.Deprecated
        public TPCodecMaxCapability(int i17, int i18, int i19) {
            this.f51638x4fa4b468 = i17;
            this.f51639x338763a5 = i18;
            this.f51637x1740c480 = i19;
            this.f51636x88dcf5a8 = 30;
            this.f51634x3fd1c989 = -1;
            this.f51640xc2a6662e = -1;
            this.f51635xce868954 = -1;
        }

        public TPCodecMaxCapability(int i17, int i18, int i19, int i27) {
            this.f51638x4fa4b468 = i17;
            this.f51639x338763a5 = i18;
            this.f51637x1740c480 = i19;
            this.f51636x88dcf5a8 = i27;
            this.f51634x3fd1c989 = -1;
            this.f51640xc2a6662e = -1;
            this.f51635xce868954 = -1;
        }

        public TPCodecMaxCapability(int i17, int i18, int i19, int i27, int i28) {
            this.f51639x338763a5 = i17;
            this.f51637x1740c480 = i18;
            this.f51634x3fd1c989 = i27;
            this.f51640xc2a6662e = i19;
            this.f51635xce868954 = i28;
            this.f51638x4fa4b468 = -1;
            this.f51636x88dcf5a8 = -1;
        }
    }
}
