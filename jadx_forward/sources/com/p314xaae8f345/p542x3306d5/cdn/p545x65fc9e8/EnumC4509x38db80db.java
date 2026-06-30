package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.MediaFormat */
/* loaded from: classes.dex */
public enum EnumC4509x38db80db implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
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


    /* renamed from: MEDIA_FORMAT_AUDIO_OPUS_VALUE */
    public static final int f18900x15a98947 = 2;

    /* renamed from: MEDIA_FORMAT_AUDIO_SILK_VALUE */
    public static final int f18902x8ad3d6dd = 1;

    /* renamed from: MEDIA_FORMAT_FAV_H264_VIDEO_VALUE */
    public static final int f18904xb2a315e7 = 101;

    /* renamed from: MEDIA_FORMAT_FAV_H265_VIDEO_VALUE */
    public static final int f18906xa1261c68 = 102;

    /* renamed from: MEDIA_FORMAT_FAV_HEVC_IMG_VALUE */
    public static final int f18908x3c913671 = 104;

    /* renamed from: MEDIA_FORMAT_FAV_JPEG_IMG_VALUE */
    public static final int f18910x10b4e0ef = 103;

    /* renamed from: MEDIA_FORMAT_HEIC_IMG_VALUE */
    public static final int f18912xb69bf55a = 4;

    /* renamed from: MEDIA_FORMAT_HEVC_IMG_VALUE */
    public static final int f18914x1aa15b2d = 2;

    /* renamed from: MEDIA_FORMAT_JPEG_PNG_IMG_VALUE */
    public static final int f18916x421f13f5 = 1;

    /* renamed from: MEDIA_FORMAT_ORIGINAL_VIDEO_VALUE */
    public static final int f18918xbab0944c = 0;

    /* renamed from: MEDIA_FORMAT_UNDEFINED_IMG_VALUE */
    public static final int f18920xbb921e79 = 0;

    /* renamed from: MEDIA_FORMAT_UNDEFINED_VIDEO_VALUE */
    public static final int f18922x55b99431 = -1;

    /* renamed from: MEDIA_FORMAT_WXAM_IMG_VALUE */
    public static final int f18924x39b611d0 = 2;

    /* renamed from: MEDIA_FORMAT_X264_VIDEO_VALUE */
    public static final int f18926x665ad993 = 1;

    /* renamed from: MEDIA_FORMAT_X265_VIDEO_VALUE */
    public static final int f18928x54dde014 = 2;

    /* renamed from: value */
    public final int f18929x6ac9171;

    EnumC4509x38db80db(int i17) {
        this.f18929x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4509x38db80db m39229x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18929x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4509x38db80db m39230xdce0328(int i17) {
        return m39229x382ad972(i17);
    }
}
