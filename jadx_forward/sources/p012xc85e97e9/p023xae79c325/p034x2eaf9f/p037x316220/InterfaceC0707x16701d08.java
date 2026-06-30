package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.EncoderProfilesProxy */
/* loaded from: classes14.dex */
public interface InterfaceC0707x16701d08 {

    /* renamed from: CODEC_PROFILE_NONE */
    public static final int f1654xedf9c9d7 = -1;

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy */
    /* loaded from: classes16.dex */
    public static abstract class AudioProfileProxy {

        /* renamed from: MEDIA_TYPE_NONE */
        public static final java.lang.String f1655xb05bda62 = "audio/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy$AudioEncoder */
        /* loaded from: classes6.dex */
        public @interface AudioEncoder {
        }

        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy m5432xaf65a0fc(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0648x3a9b33a1(i17, str, i18, i19, i27, i28);
        }

        /* renamed from: getBitrate */
        public abstract int mo5122x37b4b737();

        /* renamed from: getChannels */
        public abstract int mo5123xd13e6146();

        /* renamed from: getCodec */
        public abstract int mo5124x7444b660();

        /* renamed from: getMediaType */
        public abstract java.lang.String mo5125x7f025288();

        /* renamed from: getProfile */
        public abstract int mo5126x2b5bc573();

        /* renamed from: getSampleRate */
        public abstract int mo5127xf6c809a0();
    }

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy */
    /* loaded from: classes14.dex */
    public static abstract class ImmutableEncoderProfilesProxy implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08 {
        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.ImmutableEncoderProfilesProxy m5433xaf65a0fc(int i17, int i18, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> list2) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0649xba245af0(i17, i18, java.util.Collections.unmodifiableList(new java.util.ArrayList(list)), java.util.Collections.unmodifiableList(new java.util.ArrayList(list2)));
        }
    }

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy */
    /* loaded from: classes16.dex */
    public static abstract class VideoProfileProxy {

        /* renamed from: BIT_DEPTH_10 */
        public static final int f1656x5a55c4d = 10;

        /* renamed from: BIT_DEPTH_8 */
        public static final int f1657xc6602c4a = 8;

        /* renamed from: MEDIA_TYPE_NONE */
        public static final java.lang.String f1658xb05bda62 = "video/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy$VideoEncoder */
        /* loaded from: classes6.dex */
        public @interface VideoEncoder {
        }

        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy m5434xaf65a0fc(int i17, java.lang.String str, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0650xbe3cdcc6(i17, str, i18, i19, i27, i28, i29, i37, i38, i39);
        }

        /* renamed from: getBitDepth */
        public abstract int mo5138xbc5bbb2c();

        /* renamed from: getBitrate */
        public abstract int mo5139x37b4b737();

        /* renamed from: getChromaSubsampling */
        public abstract int mo5140xb6caa51b();

        /* renamed from: getCodec */
        public abstract int mo5141x7444b660();

        /* renamed from: getFrameRate */
        public abstract int mo5142x1fea5d37();

        /* renamed from: getHdrFormat */
        public abstract int mo5143xdb7b57d7();

        /* renamed from: getHeight */
        public abstract int mo5144x1c4fb41d();

        /* renamed from: getMediaType */
        public abstract java.lang.String mo5145x7f025288();

        /* renamed from: getProfile */
        public abstract int mo5146x2b5bc573();

        /* renamed from: getWidth */
        public abstract int mo5147x755bd410();
    }

    /* renamed from: getAudioCodecMimeType */
    static java.lang.String m5429xa7614d84(int i17) {
        switch (i17) {
            case 1:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54248xb24ba796;
            case 2:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54249xb24ba8ad;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54266xd63d2e3c;
            case 7:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54262x7b041728;
            default:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy.f1655xb05bda62;
        }
    }

    /* renamed from: getRequiredAudioProfile */
    static int m5430x3216ea8(int i17) {
        if (i17 == 3) {
            return 2;
        }
        if (i17 != 4) {
            return i17 != 5 ? -1 : 39;
        }
        return 5;
    }

    /* renamed from: getVideoCodecMimeType */
    static java.lang.String m5431x97f4c8ff(int i17) {
        switch (i17) {
            case 1:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54277xbe389a8b;
            case 2:
                return "video/avc";
            case 3:
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54281xbe3b50e9;
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy.f1658xb05bda62;
        }
    }

    /* renamed from: getAudioProfiles */
    java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.AudioProfileProxy> mo5131xe74322a();

    /* renamed from: getDefaultDurationSeconds */
    int mo5132xe2fed4c0();

    /* renamed from: getRecommendedFileFormat */
    int mo5133xdc6e6398();

    /* renamed from: getVideoProfiles */
    java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0707x16701d08.VideoProfileProxy> mo5134x71ba35cf();
}
