package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum FileType implements com.tencent.mm.protobuf.h {
    FILETYPE_UNSPECIFIED(0),
    FILETYPE_FULL_SIZE_IMAGE(1),
    FILETYPE_IMAGE(2),
    FILETYPE_THUMB_IMAGE(3),
    FILETYPE_VIDEO(4),
    FILETYPE_FILE(5),
    FILETYPE_TINY_VIDEO(6),
    FILETYPE_BIG_FILE(7),
    FILETYPE_BIG_FILE_1G(9),
    FILETYPE_ACTIVITY_FILE(10),
    FILETYPE_AUDIO_MSG(11),
    FILETYPE_VOICE(15),
    FILETYPE_WECOM_DOWNLOAD(19),
    FILETYPE_CHAT_MSG(21),
    FILETYPE_CHAT_AUDIO(22),
    FILETYPE_CHAT_LIST(23),
    FILETYPE_LIVE(24),
    FILETYPE_FULL_SIZE_LIVE(25),
    FILETYPE_SC_VIDEO(54),
    FILETYPE_HTTP_VIDEO(90),
    FILETYPE_FAVORITE_FILE(10001),
    FILETYPE_FAVORITE_VIDEO(10002),
    FILETYPE_FAVORITE_BIG_FILE(10007),
    FILETYPE_EXPOSE_IMAGE(11000),
    FILETYPE_BEATIFIC_FILE(10011),
    FILETYPE_BACKUP_FILE(20001),
    FILETYPE_FRIENDS(20201),
    FILETYPE_FRIENDS_VIDEO(20202),
    FILETYPE_FRIENDS_IMAGE_THUMB(20205),
    FILETYPE_FRIENDS_VIDEO_THUMB_IMAGE(20250),
    FILETYPE_NEAR_EVENT(20310),
    FILETYPE_SMART_HW_PAGE(20321),
    FILETYPE_AD_IMAGE(20204),
    FILETYPE_AD_VIDEO(20210),
    FILETYPE_WXAM_THUMB(20251),
    FILETYPE_APP_IMAGE(20301),
    FILETYPE_APP_VIDEO(20302),
    FILETYPE_APP_FILE(20303),
    FILETYPE_APP_IMAGE_STORAGE(20304),
    FILETYPE_HW_DEVICE(20322),
    FILETYPE_APP_VIDEO_THUMB(FILETYPE_APP_VIDEO_THUMB_VALUE),
    FILETYPE_EMOJI_NORMAL(20401),
    FILETYPE_EMOJI_GIF(20402),
    FILETYPE_EMOJI_WXAM(20403),
    FILETYPE_EMOJI_WXAM_WITH_USER_DATA(20404),
    FILETYPE_LITTLE_APP_PACKET(30001),
    FILETYPE_GAME_PACKET(30002),
    FILETYPE_TINKER_PATCH(30003),
    FILETYPE_X_WEB_RUNTIME(30004),
    FILETYPE_X_WEB_RUNTIME_PATCH(FILETYPE_X_WEB_RUNTIME_PATCH_VALUE),
    FILETYPE_X_WEB_CONFIG(FILETYPE_X_WEB_CONFIG_VALUE),
    FILETYPE_UDR(FILETYPE_UDR_VALUE),
    FILETYPE_GENERAL_RESOURCE(40001),
    FILETYPE_WA_GAME_VIDEO(50001);

    public static final int FILETYPE_ACTIVITY_FILE_VALUE = 10;
    public static final int FILETYPE_AD_IMAGE_VALUE = 20204;
    public static final int FILETYPE_AD_VIDEO_VALUE = 20210;
    public static final int FILETYPE_APP_FILE_VALUE = 20303;
    public static final int FILETYPE_APP_IMAGE_STORAGE_VALUE = 20304;
    public static final int FILETYPE_APP_IMAGE_VALUE = 20301;
    public static final int FILETYPE_APP_VIDEO_THUMB_VALUE = 20350;
    public static final int FILETYPE_APP_VIDEO_VALUE = 20302;
    public static final int FILETYPE_AUDIO_MSG_VALUE = 11;
    public static final int FILETYPE_BACKUP_FILE_VALUE = 20001;
    public static final int FILETYPE_BEATIFIC_FILE_VALUE = 10011;
    public static final int FILETYPE_BIG_FILE_1G_VALUE = 9;
    public static final int FILETYPE_BIG_FILE_VALUE = 7;
    public static final int FILETYPE_CHAT_AUDIO_VALUE = 22;
    public static final int FILETYPE_CHAT_LIST_VALUE = 23;
    public static final int FILETYPE_CHAT_MSG_VALUE = 21;
    public static final int FILETYPE_EMOJI_GIF_VALUE = 20402;
    public static final int FILETYPE_EMOJI_NORMAL_VALUE = 20401;
    public static final int FILETYPE_EMOJI_WXAM_VALUE = 20403;
    public static final int FILETYPE_EMOJI_WXAM_WITH_USER_DATA_VALUE = 20404;
    public static final int FILETYPE_EXPOSE_IMAGE_VALUE = 11000;
    public static final int FILETYPE_FAVORITE_BIG_FILE_VALUE = 10007;
    public static final int FILETYPE_FAVORITE_FILE_VALUE = 10001;
    public static final int FILETYPE_FAVORITE_VIDEO_VALUE = 10002;
    public static final int FILETYPE_FILE_VALUE = 5;
    public static final int FILETYPE_FRIENDS_IMAGE_THUMB_VALUE = 20205;
    public static final int FILETYPE_FRIENDS_VALUE = 20201;
    public static final int FILETYPE_FRIENDS_VIDEO_THUMB_IMAGE_VALUE = 20250;
    public static final int FILETYPE_FRIENDS_VIDEO_VALUE = 20202;
    public static final int FILETYPE_FULL_SIZE_IMAGE_VALUE = 1;
    public static final int FILETYPE_FULL_SIZE_LIVE_VALUE = 25;
    public static final int FILETYPE_GAME_PACKET_VALUE = 30002;
    public static final int FILETYPE_GENERAL_RESOURCE_VALUE = 40001;
    public static final int FILETYPE_HTTP_VIDEO_VALUE = 90;
    public static final int FILETYPE_HW_DEVICE_VALUE = 20322;
    public static final int FILETYPE_IMAGE_VALUE = 2;
    public static final int FILETYPE_LITTLE_APP_PACKET_VALUE = 30001;
    public static final int FILETYPE_LIVE_VALUE = 24;
    public static final int FILETYPE_NEAR_EVENT_VALUE = 20310;
    public static final int FILETYPE_SC_VIDEO_VALUE = 54;
    public static final int FILETYPE_SMART_HW_PAGE_VALUE = 20321;
    public static final int FILETYPE_THUMB_IMAGE_VALUE = 3;
    public static final int FILETYPE_TINKER_PATCH_VALUE = 30003;
    public static final int FILETYPE_TINY_VIDEO_VALUE = 6;
    public static final int FILETYPE_UDR_VALUE = 30007;
    public static final int FILETYPE_UNSPECIFIED_VALUE = 0;
    public static final int FILETYPE_VIDEO_VALUE = 4;
    public static final int FILETYPE_VOICE_VALUE = 15;
    public static final int FILETYPE_WA_GAME_VIDEO_VALUE = 50001;
    public static final int FILETYPE_WECOM_DOWNLOAD_VALUE = 19;
    public static final int FILETYPE_WXAM_THUMB_VALUE = 20251;
    public static final int FILETYPE_X_WEB_CONFIG_VALUE = 30006;
    public static final int FILETYPE_X_WEB_RUNTIME_PATCH_VALUE = 30005;
    public static final int FILETYPE_X_WEB_RUNTIME_VALUE = 30004;
    public final int value;

    FileType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.FileType forNumber(int i17) {
        if (i17 == 0) {
            return FILETYPE_UNSPECIFIED;
        }
        if (i17 == 1) {
            return FILETYPE_FULL_SIZE_IMAGE;
        }
        if (i17 == 2) {
            return FILETYPE_IMAGE;
        }
        if (i17 == 3) {
            return FILETYPE_THUMB_IMAGE;
        }
        if (i17 == 4) {
            return FILETYPE_VIDEO;
        }
        if (i17 == 5) {
            return FILETYPE_FILE;
        }
        if (i17 == 6) {
            return FILETYPE_TINY_VIDEO;
        }
        if (i17 != 7) {
            if (i17 == 10001) {
                return FILETYPE_FAVORITE_FILE;
            }
            if (i17 == 10002) {
                return FILETYPE_FAVORITE_VIDEO;
            }
            if (i17 == 20201) {
                return FILETYPE_FRIENDS;
            }
            if (i17 == 20202) {
                return FILETYPE_FRIENDS_VIDEO;
            }
            if (i17 == 20204) {
                return FILETYPE_AD_IMAGE;
            }
            if (i17 == 20205) {
                return FILETYPE_FRIENDS_IMAGE_THUMB;
            }
            if (i17 == 20250) {
                return FILETYPE_FRIENDS_VIDEO_THUMB_IMAGE;
            }
            if (i17 == 20251) {
                return FILETYPE_WXAM_THUMB;
            }
            if (i17 == 20321) {
                return FILETYPE_SMART_HW_PAGE;
            }
            if (i17 == 20322) {
                return FILETYPE_HW_DEVICE;
            }
            switch (i17) {
                case 7:
                    break;
                case 15:
                    return FILETYPE_VOICE;
                case 19:
                    return FILETYPE_WECOM_DOWNLOAD;
                case 54:
                    return FILETYPE_SC_VIDEO;
                case 90:
                    return FILETYPE_HTTP_VIDEO;
                case 10007:
                    return FILETYPE_FAVORITE_BIG_FILE;
                case 10011:
                    return FILETYPE_BEATIFIC_FILE;
                case 11000:
                    return FILETYPE_EXPOSE_IMAGE;
                case 20001:
                    return FILETYPE_BACKUP_FILE;
                case 20210:
                    return FILETYPE_AD_VIDEO;
                case 20310:
                    return FILETYPE_NEAR_EVENT;
                case FILETYPE_APP_VIDEO_THUMB_VALUE:
                    return FILETYPE_APP_VIDEO_THUMB;
                case 30001:
                    return FILETYPE_LITTLE_APP_PACKET;
                case 30002:
                    return FILETYPE_GAME_PACKET;
                case 30003:
                    return FILETYPE_TINKER_PATCH;
                case 30004:
                    return FILETYPE_X_WEB_RUNTIME;
                case FILETYPE_X_WEB_RUNTIME_PATCH_VALUE:
                    return FILETYPE_X_WEB_RUNTIME_PATCH;
                case FILETYPE_X_WEB_CONFIG_VALUE:
                    return FILETYPE_X_WEB_CONFIG;
                case FILETYPE_UDR_VALUE:
                    return FILETYPE_UDR;
                case 40001:
                    return FILETYPE_GENERAL_RESOURCE;
                case 50001:
                    return FILETYPE_WA_GAME_VIDEO;
                default:
                    switch (i17) {
                        case 9:
                            return FILETYPE_BIG_FILE_1G;
                        case 10:
                            return FILETYPE_ACTIVITY_FILE;
                        case 11:
                            return FILETYPE_AUDIO_MSG;
                        default:
                            switch (i17) {
                                case 21:
                                    return FILETYPE_CHAT_MSG;
                                case 22:
                                    return FILETYPE_CHAT_AUDIO;
                                case 23:
                                    return FILETYPE_CHAT_LIST;
                                case 24:
                                    return FILETYPE_LIVE;
                                case 25:
                                    return FILETYPE_FULL_SIZE_LIVE;
                                default:
                                    switch (i17) {
                                        case 20301:
                                            return FILETYPE_APP_IMAGE;
                                        case 20302:
                                            return FILETYPE_APP_VIDEO;
                                        case 20303:
                                            return FILETYPE_APP_FILE;
                                        case 20304:
                                            return FILETYPE_APP_IMAGE_STORAGE;
                                        default:
                                            switch (i17) {
                                                case 20401:
                                                    return FILETYPE_EMOJI_NORMAL;
                                                case 20402:
                                                    return FILETYPE_EMOJI_GIF;
                                                case 20403:
                                                    return FILETYPE_EMOJI_WXAM;
                                                case 20404:
                                                    return FILETYPE_EMOJI_WXAM_WITH_USER_DATA;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
        return FILETYPE_BIG_FILE;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.FileType valueOf(int i17) {
        return forNumber(i17);
    }
}
