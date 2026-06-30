package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum MediaFormat implements com.tencent.mm.protobuf.h {
    MEDIA_FORMAT_UNDEFINED_VIDEO(-1),
    MEDIA_FORMAT_ORIGINAL_VIDEO(0),
    MEDIA_FORMAT_X264_VIDEO(1),
    MEDIA_FORMAT_X265_VIDEO(2),
    MEDIA_FORMAT_FAV_H264_VIDEO(101),
    MEDIA_FORMAT_FAV_H265_VIDEO(102),
    MEDIA_FORMAT_FAV_JPEG_IMG(103),
    MEDIA_FORMAT_FAV_HEVC_IMG(104),
    MEDIA_FORMAT_UNDEFINED_IMG(0),
    MEDIA_FORMAT_JPEG_PNG_IMG(1),
    MEDIA_FORMAT_HEVC_IMG(2),
    MEDIA_FORMAT_WXAM_IMG(2),
    MEDIA_FORMAT_HEIC_IMG(4),
    MEDIA_FORMAT_AUDIO_SILK(1),
    MEDIA_FORMAT_AUDIO_OPUS(2);

    public static final int MEDIA_FORMAT_AUDIO_OPUS_VALUE = 2;
    public static final int MEDIA_FORMAT_AUDIO_SILK_VALUE = 1;
    public static final int MEDIA_FORMAT_FAV_H264_VIDEO_VALUE = 101;
    public static final int MEDIA_FORMAT_FAV_H265_VIDEO_VALUE = 102;
    public static final int MEDIA_FORMAT_FAV_HEVC_IMG_VALUE = 104;
    public static final int MEDIA_FORMAT_FAV_JPEG_IMG_VALUE = 103;
    public static final int MEDIA_FORMAT_HEIC_IMG_VALUE = 4;
    public static final int MEDIA_FORMAT_HEVC_IMG_VALUE = 2;
    public static final int MEDIA_FORMAT_JPEG_PNG_IMG_VALUE = 1;
    public static final int MEDIA_FORMAT_ORIGINAL_VIDEO_VALUE = 0;
    public static final int MEDIA_FORMAT_UNDEFINED_IMG_VALUE = 0;
    public static final int MEDIA_FORMAT_UNDEFINED_VIDEO_VALUE = -1;
    public static final int MEDIA_FORMAT_WXAM_IMG_VALUE = 2;
    public static final int MEDIA_FORMAT_X264_VIDEO_VALUE = 1;
    public static final int MEDIA_FORMAT_X265_VIDEO_VALUE = 2;
    public final int value;

    MediaFormat(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.MediaFormat forNumber(int i17) {
        if (i17 == -1) {
            return MEDIA_FORMAT_UNDEFINED_VIDEO;
        }
        if (i17 == 0) {
            return MEDIA_FORMAT_ORIGINAL_VIDEO;
        }
        if (i17 == 1) {
            return MEDIA_FORMAT_X264_VIDEO;
        }
        if (i17 == 2) {
            return MEDIA_FORMAT_X265_VIDEO;
        }
        if (i17 == 4) {
            return MEDIA_FORMAT_HEIC_IMG;
        }
        switch (i17) {
            case 101:
                return MEDIA_FORMAT_FAV_H264_VIDEO;
            case 102:
                return MEDIA_FORMAT_FAV_H265_VIDEO;
            case 103:
                return MEDIA_FORMAT_FAV_JPEG_IMG;
            case 104:
                return MEDIA_FORMAT_FAV_HEVC_IMG;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.MediaFormat valueOf(int i17) {
        return forNumber(i17);
    }
}
