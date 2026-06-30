package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaCompositionHelper */
/* loaded from: classes16.dex */
class C26271x57102410 {

    /* renamed from: EMPTY_CLIP_FLAG */
    static final java.lang.String f51462xea215a69 = "1";

    /* renamed from: END_OF_FILE */
    public static final int f51463x4e9cf360 = -1;

    /* renamed from: NORMAL_CLIP_FLAG */
    static final java.lang.String f51464xa3249da3 = "0";

    /* renamed from: XML_TAG_ASSERT */
    static final java.lang.String f51465x9d41d4f3 = "assets";

    /* renamed from: XML_TAG_AUDIO_TRACK */
    static final java.lang.String f51466x3659f5d5 = "audio_track";

    /* renamed from: XML_TAG_AUDIO_TRACKS */
    static final java.lang.String f51467x94e4c51e = "audio_tracks";

    /* renamed from: XML_TAG_AV_TRACK */
    static final java.lang.String f51468x8205f0e = "av_track";

    /* renamed from: XML_TAG_AV_TRACKS */
    static final java.lang.String f51469xfbeb8305 = "av_tracks";

    /* renamed from: XML_TAG_CLIP_DURATION */
    static final java.lang.String f51470xba69d356 = "clip_durationMs";

    /* renamed from: XML_TAG_CLIP_END_TIME */
    static final java.lang.String f51471x99c24993 = "clip_endTimeMs";

    /* renamed from: XML_TAG_CLIP_ID */
    static final java.lang.String f51472x684b985d = "clip_id";

    /* renamed from: XML_TAG_CLIP_PATH */
    static final java.lang.String f51473x83ca22e7 = "clip_path";

    /* renamed from: XML_TAG_CLIP_PLACE_HOLDER */
    static final java.lang.String f51474x79cd40c6 = "clip_placeHolder";

    /* renamed from: XML_TAG_CLIP_PLAY_TIME */
    static final java.lang.String f51475x85658376 = "clip_playTimeMs";

    /* renamed from: XML_TAG_CLIP_START_TIME */
    static final java.lang.String f51476x21d9bdec = "clip_startTimeMs";

    /* renamed from: XML_TAG_DRM_APPVER */
    static final java.lang.String f51477xe935e7cf = "clip_drmAppVersion";

    /* renamed from: XML_TAG_DRM_COMMON_KEY */
    static final java.lang.String f51478x5ae6a958 = "clip_drmCommonKey";

    /* renamed from: XML_TAG_DRM_COOKIE */
    static final java.lang.String f51479xec90e451 = "clip_drmCookie";

    /* renamed from: XML_TAG_DRM_GUID */
    static final java.lang.String f51480x4e0a0bb6 = "clip_drmGuid";

    /* renamed from: XML_TAG_DRM_LICENSE */
    static final java.lang.String f51481x76bae7d4 = "clip_drmLicenseUrl";

    /* renamed from: XML_TAG_DRM_LICENSE_HTTP_HEADERS */
    static final java.lang.String f51482xdffe753a = "clip_drmLicenseHttpHeaders";

    /* renamed from: XML_TAG_DRM_LICENSE_STANDARDIZATION */
    static final java.lang.String f51483xe3fb87c = "clip_drmLicenseStandardization";

    /* renamed from: XML_TAG_DRM_PLATFORM */
    static final java.lang.String f51484x9c3f7720 = "clip_drmPlatform";

    /* renamed from: XML_TAG_DRM_PROVISION */
    static final java.lang.String f51485x43235fa8 = "clip_drmProvisionUrl";

    /* renamed from: XML_TAG_DRM_SAVE_PATH */
    static final java.lang.String f51486x707a789a = "clip_drmSavePath";

    /* renamed from: XML_TAG_DRM_TYPE */
    static final java.lang.String f51487x4e100467 = "clip_drmType";

    /* renamed from: XML_TAG_DRM_USEL1 */
    static final java.lang.String f51488x73fbbd7f = "clip_drmUseL1";

    /* renamed from: XML_TAG_PREFERRED_PROPERTY */
    static final java.lang.String f51489x2e39220 = "clip_preferredProperty";

    /* renamed from: XML_TAG_RTC_SDP_EXCHANGE_TYPE */
    static final java.lang.String f51490x70c6beb = "clip_rtcSdpExchangeType";

    /* renamed from: XML_TAG_RTC_SERVER_URL */
    static final java.lang.String f51491x91ae07be = "clip_rtcServerUrl";

    /* renamed from: XML_TAG_TRACK_CLIP */
    static final java.lang.String f51492x97ee2d11 = "track_clip";

    /* renamed from: XML_TAG_TRACK_ID */
    static final java.lang.String f51493xb61a171c = "track_id";

    /* renamed from: XML_TAG_UTF8 */
    static final java.lang.String f51494xfbefdc7e = "UTF-8";

    /* renamed from: XML_TAG_VIDEO_TRACK */
    static final java.lang.String f51495x5a269eba = "video_track";

    /* renamed from: XML_TAG_VIDEO_TRACKS */
    static final java.lang.String f51496xeaad38d9 = "video_tracks";

    /* renamed from: audioClidId */
    private static int f51497xfe9abaf5 = 0;

    /* renamed from: avClidId */
    private static int f51498x36e92814 = 0;

    /* renamed from: composition_duration_strategy */
    public static java.lang.String f51499xd3a32a69 = "base_video";

    /* renamed from: videoClidId */
    private static int f51500x226763da;

    /* renamed from: generateTrackClipId */
    public static int m101607x3c4d9901(int i17) {
        if (i17 == 1) {
            int i18 = f51498x36e92814;
            f51498x36e92814 = i18 + 1;
            return i18;
        }
        if (i17 == 2) {
            int i19 = f51500x226763da;
            f51500x226763da = i19 + 1;
            return i19;
        }
        if (i17 != 3) {
            return -1;
        }
        int i27 = f51497xfe9abaf5;
        f51497xfe9abaf5 = i27 + 1;
        return i27;
    }
}
