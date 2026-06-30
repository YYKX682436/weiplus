package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1;

/* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback */
/* loaded from: classes16.dex */
public interface InterfaceC26399x617a50af {

    /* renamed from: ASYNC_CALL_DESELECT_TRACK */
    public static final int f53134xe3b62cc7 = 5;

    /* renamed from: ASYNC_CALL_PREPARE */
    public static final int f53135x7c688909 = 1;

    /* renamed from: ASYNC_CALL_SEEK */
    public static final int f53136x57e89996 = 2;

    /* renamed from: ASYNC_CALL_SELECT_PROGRAM */
    public static final int f53137x75d4c3bf = 6;

    /* renamed from: ASYNC_CALL_SELECT_TRACK */
    public static final int f53138x1d1cad46 = 4;

    /* renamed from: ASYNC_CALL_SWITCH_DEFINITION */
    public static final int f53139x929a30e0 = 3;

    /* renamed from: ERROR_DECODER_AUDIO_NOT_SUPPORT */
    public static final int f53140xcf452028 = 1210;

    /* renamed from: ERROR_DECODER_AUDIO_STREAM */
    public static final int f53141x54e7b25b = 1211;

    /* renamed from: ERROR_DECODER_OTHERS */
    public static final int f53142x4eddf315 = 1200;

    /* renamed from: ERROR_DECODER_SUBTITLE_NOT_SUPPORT */
    public static final int f53143x51cf0ae = 1230;

    /* renamed from: ERROR_DECODER_SUBTITLE_STREAM */
    public static final int f53144xefe52615 = 1231;

    /* renamed from: ERROR_DECODER_VIDEO_NOT_SUPPORT */
    public static final int f53145x52e6c94d = 1220;

    /* renamed from: ERROR_DECODER_VIDEO_STREAM */
    public static final int f53146xaab02616 = 1221;

    /* renamed from: ERROR_DEMUXER_BUFFERING_TIMEOUT */
    public static final int f53147x3df094ea = 1103;

    /* renamed from: ERROR_DEMUXER_NETWORK */
    public static final int f53148x6038d8f4 = 1101;

    /* renamed from: ERROR_DEMUXER_OTHERS */
    public static final int f53149x2ee76fbd = 1100;

    /* renamed from: ERROR_DEMUXER_PREPARE_TIMEOUT */
    public static final int f53150x7e79eecf = 1104;

    /* renamed from: ERROR_DEMUXER_STREAM */
    public static final int f53151x35bf5bda = 1102;

    /* renamed from: ERROR_GENERAL */
    public static final int f53152x4a2ad71 = 1001;

    /* renamed from: ERROR_OK */
    public static final int f53153x81dd6b93 = 1000;

    /* renamed from: ERROR_PROCESS_AUDIO_OTHERS */
    public static final int f53154xb79c71f3 = 1500;

    /* renamed from: ERROR_PROCESS_VIDEO_OTHERS */
    public static final int f53155xd64e5ae = 1600;

    /* renamed from: ERROR_RENDERER_OTHERS */
    public static final int f53156xd71bb208 = 1300;

    /* renamed from: INFO_LONG0_AUDIO_HW_DECODING_SLOW */
    public static final int f53157x20ba822a = 206;

    /* renamed from: INFO_LONG0_AUDIO_PASSTHROUGH_START */
    public static final int f53158xce03ab92 = 210;

    /* renamed from: INFO_LONG0_AUDIO_PASSTHROUGH_STOP */
    public static final int f53159xdd5af6b2 = 211;

    /* renamed from: INFO_LONG0_AUDIO_SW_DECODING_SLOW */
    public static final int f53160xd1ff0abf = 205;

    /* renamed from: INFO_LONG0_BUFFERING_END */
    public static final int f53161x76cd5a2 = 201;

    /* renamed from: INFO_LONG0_BUFFERING_START */
    public static final int f53162xe055f769 = 200;

    /* renamed from: INFO_LONG0_CURRENT_LOOP_END */
    public static final int f53163x86a8e322 = 151;

    /* renamed from: INFO_LONG0_CURRENT_LOOP_START */
    public static final int f53164x80c4a4e9 = 150;

    /* renamed from: INFO_LONG0_EOS */
    public static final int f53165x757e690d = 154;

    /* renamed from: INFO_LONG0_FIRST_AUDIO_DECODER_START */
    public static final int f53166xd102e493 = 103;

    /* renamed from: INFO_LONG0_FIRST_AUDIO_FRAME_RENDERED */
    public static final int f53167x9102b4bb = 105;

    /* renamed from: INFO_LONG0_FIRST_CLIP_OPENED */
    public static final int f53168xfe3df22d = 101;

    /* renamed from: INFO_LONG0_FIRST_PACKET_READ */
    public static final int f53169x37b20ce2 = 107;

    /* renamed from: INFO_LONG0_FIRST_VIDEO_DECODER_START */
    public static final int f53170xf2ded878 = 104;

    /* renamed from: INFO_LONG0_FIRST_VIDEO_FRAME_RENDERED */
    public static final int f53171xaaa53d76 = 106;

    /* renamed from: INFO_LONG0_FIRST_VIDEO_FRAME_RENDERED_AFTER_SURFACE_CHANGE */
    public static final int f53172xd3c7f7ae = 108;

    /* renamed from: INFO_LONG0_KEY_PACKET_READ */
    public static final int f53173x5f0e3f11 = 102;

    /* renamed from: INFO_LONG0_VIDEO_HW_DECODING_SLOW */
    public static final int f53174x5bddc825 = 208;

    /* renamed from: INFO_LONG0_VIDEO_SW_DECODING_SLOW */
    public static final int f53175xd2250ba = 207;

    /* renamed from: INFO_LONG1_ADAPTIVE_SWITCH_DEF_END */
    public static final int f53176x11d70364 = 252;

    /* renamed from: INFO_LONG1_ADAPTIVE_SWITCH_DEF_START */
    public static final int f53177xf8ebbcab = 251;

    /* renamed from: INFO_LONG1_AUDIO_DECODER_TYPE */
    public static final int f53178x6eeaa19 = 203;

    /* renamed from: INFO_LONG1_AUDIO_SESSION_ID_CHANGED */
    public static final int f53179xcd3cf57d = 212;

    /* renamed from: INFO_LONG1_CLIP_EOS */
    public static final int f53180x5a1baf5 = 153;

    /* renamed from: INFO_LONG1_CLIP_START */
    public static final int f53181x24e6274e = 152;

    /* renamed from: INFO_LONG1_DRM_FATAL_ERROR */
    public static final int f53182x14a8432 = 253;

    /* renamed from: INFO_LONG1_MEDIACODEC_CLOSE_STUCK_TIMES */
    public static final int f53183xd3ed766a = 261;

    /* renamed from: INFO_LONG1_MEDIACODEC_OPEN_STUCK_TIMES */
    public static final int f53184x3dd8eec0 = 260;

    /* renamed from: INFO_LONG1_VIDEO_DECODER_TYPE */
    public static final int f53185xf7822594 = 204;

    /* renamed from: INFO_LONG2_SUBTITLE_ERROR */
    public static final int f53186x2b8d281b = 254;

    /* renamed from: INFO_LONG2_VIDEO_DROP_FRAME_EVENT */
    public static final int f53187xae53c636 = 209;

    /* renamed from: INFO_LONG2_VIDEO_RESOLUTION_CHANGE */
    public static final int f53188xed9d87e5 = 250;

    /* renamed from: INFO_OBJECT_BUFFER_DURATION_INFO */
    public static final int f53189x29357a9 = 507;

    /* renamed from: INFO_OBJECT_MEDIA_CODEC_INFO */
    public static final int f53190x267dab21 = 504;

    /* renamed from: INFO_OBJECT_MEDIA_DRM_INFO */
    public static final int f53191xe112b1b8 = 505;

    /* renamed from: INFO_OBJECT_PRIVATE_HLS_TAG */
    public static final int f53192x6e2fddf = 501;

    /* renamed from: INFO_OBJECT_SUBTITLE_NOTE */
    public static final int f53193x558759aa = 506;

    /* renamed from: INFO_OBJECT_SUBTITLE_TEXT */
    public static final int f53194x5589eee5 = 502;

    /* renamed from: INFO_OBJECT_VIDEO_CROP */
    public static final int f53195xca9997a3 = 500;

    /* renamed from: INFO_OBJECT_VIDEO_SEI_INFO */
    public static final int f53196xf4098349 = 503;

    /* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$BufferDurationInfo */
    /* loaded from: classes16.dex */
    public static class BufferDurationInfo {

        /* renamed from: afterConfigAudioMaxBufferDurationUs */
        public long f53197x44b9efde;

        /* renamed from: afterConfigAudioMaxLimitDurationUs */
        public long f53198xdaef7bc1;

        /* renamed from: afterConfigAudioMinLimitDurationUs */
        public long f53199x908bc113;

        /* renamed from: afterConfigVideoMaxBufferDurationUs */
        public long f53200x4423a319;

        /* renamed from: afterConfigVideoMaxLimitDurationUs */
        public long f53201x434f526;

        /* renamed from: afterConfigVideoMinLimitDurationUs */
        public long f53202xb9d13a78;

        /* renamed from: autoChange */
        public int f53203xcd329e3f;

        /* renamed from: beforeConfigAudioMaxBufferDurationUs */
        public long f53204xc5baea41;

        /* renamed from: beforeConfigAudioMaxLimitDurationUs */
        public long f53205x8c8428fe;

        /* renamed from: beforeConfigAudioMinLimitDurationUs */
        public long f53206x42206e50;

        /* renamed from: beforeConfigVideoMaxBufferDurationUs */
        public long f53207xc5249d7c;

        /* renamed from: beforeConfigVideoMaxLimitDurationUs */
        public long f53208xb5c9a263;

        /* renamed from: beforeConfigVideoMinLimitDurationUs */
        public long f53209x6b65e7b5;

        /* renamed from: configIndex */
        public int f53210xffd26eb0;

        /* renamed from: maxBufferDurationUs */
        public long f53211x330f0536;

        /* renamed from: maxLimitDurationUs */
        public long f53212x3d765b69;

        /* renamed from: minLimitDurationUs */
        public long f53213xf312a0bb;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$MediaCodecInfo */
    /* loaded from: classes16.dex */
    public static class MediaCodecInfo {

        /* renamed from: INFO_MEDIA_CODEC_EXCEPTION */
        public static final int f53214xe1db83da = 1;

        /* renamed from: INFO_MEDIA_CODEC_READY */
        public static final int f53215xee3a12ae = 0;

        /* renamed from: INFO_UNKNOWN */
        public static final int f53216xc2eaad99 = -1;

        /* renamed from: infoType */
        public int f53217xa9b6108;

        /* renamed from: mediaType */
        public int f53218x7f94e13e;
        public java.lang.String msg;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$MediaDrmInfo */
    /* loaded from: classes16.dex */
    public static class MediaDrmInfo {

        /* renamed from: componentName */
        public java.lang.String f53219x65b34528;

        /* renamed from: supportSecureDecoder */
        public boolean f53221xda357d3e = false;

        /* renamed from: supportSecureDecrypt */
        public boolean f53222xda372a87 = false;

        /* renamed from: drmType */
        public int f53220x729fa179 = -1;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$VideoCropInfo */
    /* loaded from: classes16.dex */
    public static class VideoCropInfo {

        /* renamed from: cropBottom */
        public int f53223x252f14db;

        /* renamed from: cropLeft */
        public int f53224x7e5306b7;

        /* renamed from: cropRight */
        public int f53225x4c64316c;

        /* renamed from: cropTop */
        public int f53226x3de1c4a5;

        /* renamed from: height */
        public int f53227xb7389127;

        /* renamed from: width */
        public int f53228x6be2dc6;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$VideoSeiInfo */
    /* loaded from: classes16.dex */
    public static class VideoSeiInfo {

        /* renamed from: data */
        public byte[] f53229x2eefaa;

        /* renamed from: dataSize */
        public int f53230x6aa25ecb;

        /* renamed from: isSpecialType */
        public boolean f53231x77f4dc09;

        /* renamed from: videoCodecType */
        public int f53232xcfdefe35;

        /* renamed from: videoSeiType */
        public int f53233x6cf04f36;
    }

    /* renamed from: onASyncCallResult */
    void mo100760x63a07ff8(int i17, long j17, int i18, int i19);

    /* renamed from: onDetailInfo */
    void mo100761x8953bfde(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26297x46ca5c3b c26297x46ca5c3b);

    /* renamed from: onError */
    void mo100762xaf8aa769(int i17, int i18);

    /* renamed from: onInfoLong */
    void mo100763xafb1bb49(int i17, long j17, long j18);

    /* renamed from: onInfoObject */
    void mo100764x8e9598cc(int i17, java.lang.Object obj);
}
