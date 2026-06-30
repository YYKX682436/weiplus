package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    /* loaded from: classes16.dex */
    public static abstract class AudioProfileProxy {
        public static final java.lang.String MEDIA_TYPE_NONE = "audio/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface AudioEncoder {
        }

        public static androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy create(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy(i17, str, i18, i19, i27, i28);
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    /* loaded from: classes14.dex */
    public static abstract class ImmutableEncoderProfilesProxy implements androidx.camera.core.impl.EncoderProfilesProxy {
        public static androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy create(int i17, int i18, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> list, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> list2) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i17, i18, java.util.Collections.unmodifiableList(new java.util.ArrayList(list)), java.util.Collections.unmodifiableList(new java.util.ArrayList(list2)));
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final java.lang.String MEDIA_TYPE_NONE = "video/none";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface VideoEncoder {
        }

        public static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create(int i17, java.lang.String str, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
            return new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy(i17, str, i18, i19, i27, i28, i29, i37, i38, i39);
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();
    }

    static java.lang.String getAudioCodecMimeType(int i17) {
        switch (i17) {
            case 1:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AMR_NB;
            case 2:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_VORBIS;
            case 7:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_OPUS;
            default:
                return androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    static int getRequiredAudioProfile(int i17) {
        if (i17 == 3) {
            return 2;
        }
        if (i17 != 4) {
            return i17 != 5 ? -1 : 39;
        }
        return 5;
    }

    static java.lang.String getVideoCodecMimeType(int i17) {
        switch (i17) {
            case 1:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_H263;
            case 2:
                return "video/avc";
            case 3:
                return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4V;
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
                return androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles();
}
