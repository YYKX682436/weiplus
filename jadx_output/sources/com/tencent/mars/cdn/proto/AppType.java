package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum AppType implements com.tencent.mm.protobuf.h {
    APPTYPE_NORMAL_HTTP(-2),
    APPTYPE_UNKNOWN(-1),
    APPTYPE_UNSPECIFIED(0),
    APPTYPE_C2C(1),
    APPTYPE_C2C_GROUP_CHAT(2),
    APPTYPE_WECHAT_2_WECOM(3),
    APPTYPE_WECOM_2_WECHAT(4),
    APPTYPE_CUSTOM_SERVICE(5),
    APPTYPE_OFFICIAL_ACCOUNT(6),
    APPTYPE_MINI_PROGRAM(7),
    APPTYPE_FILE_PREVIEW(8),
    APPTYPE_BACKUP(9),
    APPTYPE_FAVORITE(10),
    APPTYPE_FULLSIZE_VIDEO(11),
    APPTYPE_CIRCLE_SEARCH(12),
    APPTYPE_MIGRATE(13),
    APPTYPE_SERVICE_VOIP_VIDEO(14),
    APPTYPE_CHATBOT_FILE(18),
    APPTYPE_SINGLE_JPEG(100),
    APPTYPE_MULTI_JPEG(101),
    APPTYPE_VIDEO(102),
    APPTYPE_SINGLE_WEBP(103),
    APPTYPE_MULTI_WEBP(104),
    APPTYPE_SINGLE_VCODEC(107),
    APPTYPE_MULTI_VCODEC(108),
    APPTYPE_AD_IMAGE(109),
    APPTYPE_AD_VIDEO(105),
    APPTYPE_VIDEO_THUMB(150),
    APPTYPE_EMOJI(110),
    APPTYPE_SELFIE_EMOJI(111),
    APPTYPE_SINGLE_WXAM(113),
    APPTYPE_MULTI_WXAM(114),
    APPTYPE_HD_SINGLE_WXAM(116),
    APPTYPE_HD_MULTI_WXAM(117),
    APPTYPE_SHOP(200),
    APPTYPE_NEAR_EVENT(201),
    APPTYPE_YUN_STORAGE(202),
    APPTYPE_HD_VIDEO(205),
    APPTYPE_HB(206),
    APPTYPE_SNS_STORAGE(213),
    APPTYPE_SNS_GAME_VIDEO(214),
    APPTYPE_SNS_GAME_IMAGE(215),
    APPTYPE_GROUP_PAY(218),
    APPTYPE_HEAD_IMAGE(220),
    APPTYPE_FINDER(251),
    APPTYPE_P2021(255),
    APPTYPE_USER_STATUS(256),
    APPTYPE_FESTIVAL_IMAGE(257),
    APPTYPE_FESTIVAL_VIDEO(258),
    APPTYPE_259(APPTYPE_259_VALUE),
    APPTYPE_260(260),
    APPTYPE_261(261),
    APPTYPE_263(263),
    APPTYPE_GROUP_NOTICE_CDN(264),
    APPTYPE_SHARE_MSG_TO_DEVICE(272),
    APPTYPE_CONTACT_REMARK_LOGIC(274),
    APPTYPE_TING(276),
    APPTYPE_NEW_LIFE(280),
    APPTYPE_BUSINESS_PROXY(302);

    public static final int APPTYPE_259_VALUE = 259;
    public static final int APPTYPE_260_VALUE = 260;
    public static final int APPTYPE_261_VALUE = 261;
    public static final int APPTYPE_263_VALUE = 263;
    public static final int APPTYPE_AD_IMAGE_VALUE = 109;
    public static final int APPTYPE_AD_VIDEO_VALUE = 105;
    public static final int APPTYPE_BACKUP_VALUE = 9;
    public static final int APPTYPE_BUSINESS_PROXY_VALUE = 302;
    public static final int APPTYPE_C2C_GROUP_CHAT_VALUE = 2;
    public static final int APPTYPE_C2C_VALUE = 1;
    public static final int APPTYPE_CHATBOT_FILE_VALUE = 18;
    public static final int APPTYPE_CIRCLE_SEARCH_VALUE = 12;
    public static final int APPTYPE_CONTACT_REMARK_LOGIC_VALUE = 274;
    public static final int APPTYPE_CUSTOM_SERVICE_VALUE = 5;
    public static final int APPTYPE_EMOJI_VALUE = 110;
    public static final int APPTYPE_FAVORITE_VALUE = 10;
    public static final int APPTYPE_FESTIVAL_IMAGE_VALUE = 257;
    public static final int APPTYPE_FESTIVAL_VIDEO_VALUE = 258;
    public static final int APPTYPE_FILE_PREVIEW_VALUE = 8;
    public static final int APPTYPE_FINDER_VALUE = 251;
    public static final int APPTYPE_FULLSIZE_VIDEO_VALUE = 11;
    public static final int APPTYPE_GROUP_NOTICE_CDN_VALUE = 264;
    public static final int APPTYPE_GROUP_PAY_VALUE = 218;
    public static final int APPTYPE_HB_VALUE = 206;
    public static final int APPTYPE_HD_MULTI_WXAM_VALUE = 117;
    public static final int APPTYPE_HD_SINGLE_WXAM_VALUE = 116;
    public static final int APPTYPE_HD_VIDEO_VALUE = 205;
    public static final int APPTYPE_HEAD_IMAGE_VALUE = 220;
    public static final int APPTYPE_MIGRATE_VALUE = 13;
    public static final int APPTYPE_MINI_PROGRAM_VALUE = 7;
    public static final int APPTYPE_MULTI_JPEG_VALUE = 101;
    public static final int APPTYPE_MULTI_VCODEC_VALUE = 108;
    public static final int APPTYPE_MULTI_WEBP_VALUE = 104;
    public static final int APPTYPE_MULTI_WXAM_VALUE = 114;
    public static final int APPTYPE_NEAR_EVENT_VALUE = 201;
    public static final int APPTYPE_NEW_LIFE_VALUE = 280;
    public static final int APPTYPE_NORMAL_HTTP_VALUE = -2;
    public static final int APPTYPE_OFFICIAL_ACCOUNT_VALUE = 6;
    public static final int APPTYPE_P2021_VALUE = 255;
    public static final int APPTYPE_SELFIE_EMOJI_VALUE = 111;
    public static final int APPTYPE_SERVICE_VOIP_VIDEO_VALUE = 14;
    public static final int APPTYPE_SHARE_MSG_TO_DEVICE_VALUE = 272;
    public static final int APPTYPE_SHOP_VALUE = 200;
    public static final int APPTYPE_SINGLE_JPEG_VALUE = 100;
    public static final int APPTYPE_SINGLE_VCODEC_VALUE = 107;
    public static final int APPTYPE_SINGLE_WEBP_VALUE = 103;
    public static final int APPTYPE_SINGLE_WXAM_VALUE = 113;
    public static final int APPTYPE_SNS_GAME_IMAGE_VALUE = 215;
    public static final int APPTYPE_SNS_GAME_VIDEO_VALUE = 214;
    public static final int APPTYPE_SNS_STORAGE_VALUE = 213;
    public static final int APPTYPE_TING_VALUE = 276;
    public static final int APPTYPE_UNKNOWN_VALUE = -1;
    public static final int APPTYPE_UNSPECIFIED_VALUE = 0;
    public static final int APPTYPE_USER_STATUS_VALUE = 256;
    public static final int APPTYPE_VIDEO_THUMB_VALUE = 150;
    public static final int APPTYPE_VIDEO_VALUE = 102;
    public static final int APPTYPE_WECHAT_2_WECOM_VALUE = 3;
    public static final int APPTYPE_WECOM_2_WECHAT_VALUE = 4;
    public static final int APPTYPE_YUN_STORAGE_VALUE = 202;
    public final int value;

    AppType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.AppType forNumber(int i17) {
        if (i17 == 0) {
            return APPTYPE_UNSPECIFIED;
        }
        if (i17 == 1) {
            return APPTYPE_C2C;
        }
        if (i17 == -1) {
            return APPTYPE_UNKNOWN;
        }
        if (i17 == 2) {
            return APPTYPE_C2C_GROUP_CHAT;
        }
        if (i17 == -2) {
            return APPTYPE_NORMAL_HTTP;
        }
        if (i17 == 3) {
            return APPTYPE_WECHAT_2_WECOM;
        }
        if (i17 == 4) {
            return APPTYPE_WECOM_2_WECHAT;
        }
        if (i17 == 5) {
            return APPTYPE_CUSTOM_SERVICE;
        }
        if (i17 == 6) {
            return APPTYPE_OFFICIAL_ACCOUNT;
        }
        if (i17 != 7) {
            if (i17 == 113) {
                return APPTYPE_SINGLE_WXAM;
            }
            if (i17 == 114) {
                return APPTYPE_MULTI_WXAM;
            }
            if (i17 == 116) {
                return APPTYPE_HD_SINGLE_WXAM;
            }
            if (i17 == 117) {
                return APPTYPE_HD_MULTI_WXAM;
            }
            if (i17 == 205) {
                return APPTYPE_HD_VIDEO;
            }
            if (i17 == 206) {
                return APPTYPE_HB;
            }
            if (i17 == 263) {
                return APPTYPE_263;
            }
            if (i17 == 264) {
                return APPTYPE_GROUP_NOTICE_CDN;
            }
            switch (i17) {
                case 7:
                    break;
                case 8:
                    return APPTYPE_FILE_PREVIEW;
                case 9:
                    return APPTYPE_BACKUP;
                case 10:
                    return APPTYPE_FAVORITE;
                case 11:
                    return APPTYPE_FULLSIZE_VIDEO;
                case 12:
                    return APPTYPE_CIRCLE_SEARCH;
                case 13:
                    return APPTYPE_MIGRATE;
                case 14:
                    return APPTYPE_SERVICE_VOIP_VIDEO;
                case 18:
                    return APPTYPE_CHATBOT_FILE;
                case 150:
                    return APPTYPE_VIDEO_THUMB;
                case 218:
                    return APPTYPE_GROUP_PAY;
                case 220:
                    return APPTYPE_HEAD_IMAGE;
                case 251:
                    return APPTYPE_FINDER;
                case 272:
                    return APPTYPE_SHARE_MSG_TO_DEVICE;
                case 274:
                    return APPTYPE_CONTACT_REMARK_LOGIC;
                case 276:
                    return APPTYPE_TING;
                case 280:
                    return APPTYPE_NEW_LIFE;
                case 302:
                    return APPTYPE_BUSINESS_PROXY;
                default:
                    switch (i17) {
                        case 100:
                            return APPTYPE_SINGLE_JPEG;
                        case 101:
                            return APPTYPE_MULTI_JPEG;
                        case 102:
                            return APPTYPE_VIDEO;
                        case 103:
                            return APPTYPE_SINGLE_WEBP;
                        case 104:
                            return APPTYPE_MULTI_WEBP;
                        case 105:
                            return APPTYPE_AD_VIDEO;
                        default:
                            switch (i17) {
                                case 107:
                                    return APPTYPE_SINGLE_VCODEC;
                                case 108:
                                    return APPTYPE_MULTI_VCODEC;
                                case 109:
                                    return APPTYPE_AD_IMAGE;
                                case 110:
                                    return APPTYPE_EMOJI;
                                case 111:
                                    return APPTYPE_SELFIE_EMOJI;
                                default:
                                    switch (i17) {
                                        case 200:
                                            return APPTYPE_SHOP;
                                        case 201:
                                            return APPTYPE_NEAR_EVENT;
                                        case 202:
                                            return APPTYPE_YUN_STORAGE;
                                        default:
                                            switch (i17) {
                                                case 213:
                                                    return APPTYPE_SNS_STORAGE;
                                                case 214:
                                                    return APPTYPE_SNS_GAME_VIDEO;
                                                case 215:
                                                    return APPTYPE_SNS_GAME_IMAGE;
                                                default:
                                                    switch (i17) {
                                                        case 255:
                                                            return APPTYPE_P2021;
                                                        case 256:
                                                            return APPTYPE_USER_STATUS;
                                                        case 257:
                                                            return APPTYPE_FESTIVAL_IMAGE;
                                                        case 258:
                                                            return APPTYPE_FESTIVAL_VIDEO;
                                                        case APPTYPE_259_VALUE:
                                                            return APPTYPE_259;
                                                        case 260:
                                                            return APPTYPE_260;
                                                        case 261:
                                                            return APPTYPE_261;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return APPTYPE_MINI_PROGRAM;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.AppType valueOf(int i17) {
        return forNumber(i17);
    }
}
