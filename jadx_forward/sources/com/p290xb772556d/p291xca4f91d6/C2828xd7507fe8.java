package com.p290xb772556d.p291xca4f91d6;

/* renamed from: com.hilive.mediasdk.SdkInfo */
/* loaded from: classes6.dex */
public class C2828xd7507fe8 {

    /* renamed from: kRatioBase */
    public static final int f9494xa6ab3551 = 10000;

    /* renamed from: kTimeBase */
    public static final int f9495x809a68c9 = 1000000;

    /* renamed from: com.hilive.mediasdk.SdkInfo$EncodeMode */
    /* loaded from: classes6.dex */
    public static class EncodeMode {

        /* renamed from: kEncodeModeCBR */
        public static final int f9496x128e2daf = 2;

        /* renamed from: kEncodeModeCQ */
        public static final int f9497x7c783312 = 0;

        /* renamed from: kEncodeModeVBR */
        public static final int f9498x128e7502 = 1;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$ErrCode */
    /* loaded from: classes6.dex */
    public static class ErrCode {

        /* renamed from: kErrCodeEnd */
        public static final int f9499xf77d3554 = 699;

        /* renamed from: kErrCodeFailed */
        public static final int f9500x94a26924 = 601;

        /* renamed from: kErrCodeFormatUnSupport */
        public static final int f9501x82ef07b8 = 609;

        /* renamed from: kErrCodeInterrupt */
        public static final int f9502xfdd7dc1c = 606;

        /* renamed from: kErrCodeIoError */
        public static final int f9503xb448e47b = 617;

        /* renamed from: kErrCodeNoTrack */
        public static final int f9504xbd9b2c03 = 615;

        /* renamed from: kErrCodeNotFound */
        public static final int f9505x29ffff96 = 608;

        /* renamed from: kErrCodeNotSupport */
        public static final int f9506x63a732e3 = 616;

        /* renamed from: kErrCodeParmasInvalid */
        public static final int f9507x66ca3032 = 607;

        /* renamed from: kErrCodeRequestUnSupport */
        public static final int f9508x183cd94e = 603;

        /* renamed from: kErrCodeSdkNotReady */
        public static final int f9509x4837463 = 602;

        /* renamed from: kErrCodeSuccess */
        public static final int f9510xd12407fc = 0;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$FrameInfo */
    /* loaded from: classes6.dex */
    public static class FrameInfo {

        /* renamed from: mediaType */
        public int f9514x7f94e13e = -1;

        /* renamed from: mediaFormat */
        public int f9513xd571d8fb = -1;
        public int idx = 0;

        /* renamed from: width */
        public int f9518x6be2dc6 = 0;

        /* renamed from: height */
        public int f9512xb7389127 = 0;

        /* renamed from: channel */
        public int f9511x2c0b7d03 = 0;

        /* renamed from: samplerate */
        public int f9517x895dd8a = 0;
        public long pts = 0;

        /* renamed from: pk_pts */
        public long f9516xc52f7aab = 0;
        public long dts = 0;

        /* renamed from: pk_dts */
        public long f9515xc52f4d9f = 0;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$MediaConfigKey */
    /* loaded from: classes6.dex */
    public static class MediaConfigKey {

        /* renamed from: kConfigAutoRotate */
        public static final int f9519x39ba2b57 = 103;

        /* renamed from: kConfigAvSyncDiscard */
        public static final int f9520xa42ab381 = 53;

        /* renamed from: kConfigCache */
        public static final int f9521x9a21bbf5 = 50;

        /* renamed from: kConfigEncodeMode */
        public static final int f9522x3525b446 = 104;

        /* renamed from: kConfigHwDecoder */
        public static final int f9523x6010d328 = 51;

        /* renamed from: kConfigHwEncoder */
        public static final int f9524xa452ac00 = 52;

        /* renamed from: kConfigLogLvl */
        public static final int f9525xba38142b = 7;

        /* renamed from: kConfigSwitchCode */
        public static final int f9526x3dc8e2ae = 102;

        /* renamed from: kConfigTraceAll */
        public static final int f9527xe13e88c9 = 1;

        /* renamed from: kConfigTraceDecoder */
        public static final int f9528x2c40e76c = 3;

        /* renamed from: kConfigTraceFfmpeg */
        public static final int f9529xf465aa1d = 6;

        /* renamed from: kConfigTraceFormatter */
        public static final int f9530x6ce9c1f2 = 4;

        /* renamed from: kConfigTraceFrames */
        public static final int f9531xf509447e = 5;

        /* renamed from: kConfigTraceParser */
        public static final int f9532x531fbf7 = 2;

        /* renamed from: kConfigTransitionCode */
        public static final int f9533xa37521cf = 101;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$MediaFormat */
    /* loaded from: classes6.dex */
    public static class MediaFormat {

        /* renamed from: MFMT_AUDIO_DBL */
        public static final int f9534xaba6db06 = 104;

        /* renamed from: MFMT_AUDIO_DBLP */
        public static final int f9535xc934860a = 108;

        /* renamed from: MFMT_AUDIO_FLT */
        public static final int f9536xaba6e3c6 = 103;

        /* renamed from: MFMT_AUDIO_FLTP */
        public static final int f9537xc935954a = 107;

        /* renamed from: MFMT_AUDIO_S16 */
        public static final int f9538xaba71130 = 101;

        /* renamed from: MFMT_AUDIO_S16P */
        public static final int f9539xc93b1520 = 105;

        /* renamed from: MFMT_AUDIO_S32 */
        public static final int f9540xaba7116a = 102;

        /* renamed from: MFMT_AUDIO_S32P */
        public static final int f9541xc93b1c26 = 106;

        /* renamed from: MFMT_NONE */
        public static final int f9542x7e1def17 = -1;

        /* renamed from: MFMT_VIDEO_ABGR32 */
        public static final int f9543x9ed2dd6e = 55;

        /* renamed from: MFMT_VIDEO_ARGB32 */
        public static final int f9544x9fb4196e = 54;

        /* renamed from: MFMT_VIDEO_BGR24 */
        public static final int f9545x810f0e0c = 51;

        /* renamed from: MFMT_VIDEO_BGRA32 */
        public static final int f9546xa0d2ebd6 = 53;

        /* renamed from: MFMT_VIDEO_NV12 */
        public static final int f9547xc717fec = 2;

        /* renamed from: MFMT_VIDEO_NV21 */
        public static final int f9548xc71800a = 3;

        /* renamed from: MFMT_VIDEO_RGB24 */
        public static final int f9549x81f04a0c = 50;

        /* renamed from: MFMT_VIDEO_RGBA32 */
        public static final int f9550xbc192fd6 = 52;

        /* renamed from: MFMT_VIDEO_YUV420P */
        public static final int f9551x52502bf5 = 1;

        /* renamed from: MFMT_VIDEO_YUVJ420P */
        public static final int f9552xf8ec4471 = 4;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$MediaInfo */
    /* loaded from: classes10.dex */
    public static class MediaInfo {

        /* renamed from: fileSize */
        public long f9568xd4282b9d = 0;

        /* renamed from: fileBitrate */
        public int f9566x6b143a51 = 0;

        /* renamed from: fileDuration */
        public int f9567x3daf6b30 = 0;

        /* renamed from: audioEnable */
        public boolean f9558x21cf4f9 = false;

        /* renamed from: audioCodecName */
        public java.lang.String f9556xca61788b = "";

        /* renamed from: audioCodecId */
        public int f9555xd9958b1b = 0;

        /* renamed from: audioFormat */
        public int f9559x3e7c76d = -1;

        /* renamed from: audioDuration */
        public int f9557x1616178a = 0;

        /* renamed from: audioBitrate */
        public int f9553x9b599ab7 = 0;

        /* renamed from: audioChannel */
        public int f9554xcd7d9c4d = 0;

        /* renamed from: audioSamplerate */
        public int f9565xa81d0200 = 0;

        /* renamed from: audioFrameSize */
        public int f9562x2de4f3d8 = 0;

        /* renamed from: audioFrameBytes */
        public int f9560x8dd12774 = 0;

        /* renamed from: audioFrameDuration */
        public int f9561x5f079deb = 0;

        /* renamed from: audioSampleBytes */
        public int f9563x58e9bf2b = 0;

        /* renamed from: audioSampleDuration */
        public int f9564xe1e6d6d4 = 0;

        /* renamed from: videoEnable */
        public boolean f9573x25e99dde = false;

        /* renamed from: videoCodecName */
        public java.lang.String f9571xcfdbe986 = "";

        /* renamed from: videoCodecId */
        public int f9570x2f5dfed6 = 0;

        /* renamed from: videoFormat */
        public int f9574x27b47052 = -1;

        /* renamed from: videoDuration */
        public int f9572x795c1b2f = 0;

        /* renamed from: videoBitrate */
        public int f9569xf1220e72 = 0;

        /* renamed from: videoWidth */
        public int f9581x9f1bbe0b = 0;

        /* renamed from: videoHeight */
        public int f9580x2a8d0982 = 0;

        /* renamed from: videoGop */
        public int f9579x44a06e0d = 0;

        /* renamed from: videoFps */
        public int f9575x44a06a6e = 0;

        /* renamed from: videoFrameSize */
        public int f9578x335f64d3 = 0;

        /* renamed from: videoFrameBytes */
        public int f9576x37a4d5d9 = 0;

        /* renamed from: videoFrameDuration */
        public int f9577x4f9b1966 = 0;

        /* renamed from: toString */
        public java.lang.String m21054x9616526c() {
            java.lang.String str = "{ file: { size: " + this.f9568xd4282b9d + ", bitrate:" + this.f9566x6b143a51 + ", duration: " + this.f9567x3daf6b30 + " }";
            if (this.f9558x21cf4f9) {
                str = str + ", audio: { codecName: " + this.f9556xca61788b + ", codecId: " + this.f9555xd9958b1b + ", format: " + this.f9559x3e7c76d + ", duration: " + this.f9557x1616178a + ", bitrate: " + this.f9553x9b599ab7 + ", channel: " + this.f9554xcd7d9c4d + ", samplerate: " + this.f9565xa81d0200 + ", frameSize: " + this.f9562x2de4f3d8 + ", frameBytes: " + this.f9560x8dd12774 + ", frameDuration: " + this.f9561x5f079deb + ", sampleBytes: " + this.f9563x58e9bf2b + ", sampleDuration: " + this.f9564xe1e6d6d4 + " }";
            }
            if (this.f9573x25e99dde) {
                str = str + ", video: { codecName: " + this.f9571xcfdbe986 + ", codecId: " + this.f9570x2f5dfed6 + ", format: " + this.f9574x27b47052 + ", duration: " + this.f9572x795c1b2f + ", bitrate: " + this.f9569xf1220e72 + ", width: " + this.f9581x9f1bbe0b + ", height: " + this.f9580x2a8d0982 + ", gop: " + this.f9579x44a06e0d + ", fps: " + this.f9575x44a06a6e + ", frameSize: " + this.f9578x335f64d3 + ", frameBytes: " + this.f9576x37a4d5d9 + ", frameDuration: " + this.f9577x4f9b1966 + " }";
            }
            return str + " }";
        }
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$MediaLogLvl */
    /* loaded from: classes6.dex */
    public static class MediaLogLvl {

        /* renamed from: kMediaLogDebug */
        public static final int f9582x31f392c8 = 4;

        /* renamed from: kMediaLogError */
        public static final int f9583x3207ce7d = 1;

        /* renamed from: kMediaLogInfo */
        public static final int f9584xd0128599 = 3;

        /* renamed from: kMediaLogTrace */
        public static final int f9585x32daedba = 5;

        /* renamed from: kMediaLogWarn */
        public static final int f9586xd018b371 = 2;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$MediaType */
    /* loaded from: classes6.dex */
    public static class MediaType {

        /* renamed from: MT_AUDIO */
        public static final int f9587x401df71e = 0;

        /* renamed from: MT_UNKNOW */
        public static final int f9588xe562763c = -1;

        /* renamed from: MT_VIDEO */
        public static final int f9589x41406fc3 = 1;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$NotifyEventType */
    /* loaded from: classes6.dex */
    public static class NotifyEventType {

        /* renamed from: kNotifyEventLoaderProcess */
        public static final int f9590xfec5e916 = 400;

        /* renamed from: kNotifyEventPlayerBuffSize */
        public static final int f9591xadd089fb = 301;

        /* renamed from: kNotifyEventPlayerPlayEnd */
        public static final int f9592xa0ca8520 = 302;

        /* renamed from: kNotifyEventPlayerStats */
        public static final int f9593x92332f8 = 300;

        /* renamed from: kNotifyEventRecorderStats */
        public static final int f9594x206200bb = 200;

        /* renamed from: kNotifyEventRecorderTimeUpdate */
        public static final int f9595x39895f5a = 201;

        /* renamed from: kNotifyEventTypeLogTrace */
        public static final int f9596xe1512441 = 100;

        /* renamed from: kNotifyEventTypeUnknow */
        public static final int f9597x6b733c84 = 0;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$RequestEventType */
    /* loaded from: classes6.dex */
    public static class RequestEventType {

        /* renamed from: kRequestEventEditorAddTrack */
        public static final int f9598x625928ad = 202;

        /* renamed from: kRequestEventEditorCreate */
        public static final int f9599x343d093f = 200;

        /* renamed from: kRequestEventEditorDelTrack */
        public static final int f9600xdc89af83 = 204;

        /* renamed from: kRequestEventEditorExport */
        public static final int f9601x38007bf7 = 205;

        /* renamed from: kRequestEventEditorGetTrack */
        public static final int f9602x21d3fb18 = 201;

        /* renamed from: kRequestEventEditorRemove */
        public static final int f9603x4d2260c7 = 206;

        /* renamed from: kRequestEventEditorUpdateTrack */
        public static final int f9604xb114279f = 203;

        /* renamed from: kRequestEventLoaderCreate */
        public static final int f9605xda8e0365 = 500;

        /* renamed from: kRequestEventLoaderRemove */
        public static final int f9606xf3735aed = 503;

        /* renamed from: kRequestEventLoaderStart */
        public static final int f9607x6b07f0d9 = 501;

        /* renamed from: kRequestEventLoaderStop */
        public static final int f9608xbb5f0ab = 502;

        /* renamed from: kRequestEventReaderCreate */
        public static final int f9609x37c8e815 = 400;

        /* renamed from: kRequestEventReaderRemove */
        public static final int f9610x50ae3f9d = 405;

        /* renamed from: kRequestEventReaderSeek */
        public static final int f9611xfac207d1 = 402;

        /* renamed from: kRequestEventReaderStart */
        public static final int f9612x5d85b629 = 401;

        /* renamed from: kRequestEventReaderStop */
        public static final int f9613xfac2415b = 404;

        /* renamed from: kRequestEventReaderWait */
        public static final int f9614xfac3cace = 403;

        /* renamed from: kRequestEventTypeAnalysis */
        public static final int f9615x913f2cac = 101;

        /* renamed from: kRequestEventTypeRemux */
        public static final int f9616x3f0de0ed = 102;

        /* renamed from: kRequestEventTypeTest */
        public static final int f9617x862aa662 = 100;

        /* renamed from: kRequestEventTypeUnknow */
        public static final int f9618xa84a9674 = 0;

        /* renamed from: kRequestEventWriterCreate */
        public static final int f9619xd470afc5 = 300;

        /* renamed from: kRequestEventWriterRemove */
        public static final int f9620xed56074d = 304;

        /* renamed from: kRequestEventWriterStart */
        public static final int f9621xcdee3879 = 301;

        /* renamed from: kRequestEventWriterStop */
        public static final int f9622xd518350b = 303;

        /* renamed from: kRequestEventWriterUpdate */
        public static final int f9623xf30b4792 = 302;
    }

    /* renamed from: com.hilive.mediasdk.SdkInfo$ResponseEventType */
    /* loaded from: classes6.dex */
    public static class ResponseEventType {

        /* renamed from: kResponseEventEditorAddTrack */
        public static final int f9624x3d9ed585 = 202;

        /* renamed from: kResponseEventEditorCreate */
        public static final int f9625xa2380c17 = 200;

        /* renamed from: kResponseEventEditorDelTrack */
        public static final int f9626xb7cf5c5b = 204;

        /* renamed from: kResponseEventEditorExport */
        public static final int f9627xa5fb7ecf = 205;

        /* renamed from: kResponseEventEditorGetTrack */
        public static final int f9628xfd19a7f0 = 201;

        /* renamed from: kResponseEventEditorRemove */
        public static final int f9629xbb1d639f = 206;

        /* renamed from: kResponseEventEditorUpdateTrack */
        public static final int f9630xa2412bc7 = 203;

        /* renamed from: kResponseEventLoaderCreate */
        public static final int f9631x4889063d = 500;

        /* renamed from: kResponseEventLoaderRemove */
        public static final int f9632x616e5dc5 = 503;

        /* renamed from: kResponseEventLoaderStart */
        public static final int f9633xf2b53301 = 501;

        /* renamed from: kResponseEventLoaderStop */
        public static final int f9634xc5c3c983 = 502;

        /* renamed from: kResponseEventReaderCreate */
        public static final int f9635xa5c3eaed = 400;

        /* renamed from: kResponseEventReaderRemove */
        public static final int f9636xbea94275 = 404;

        /* renamed from: kResponseEventReaderSeek */
        public static final int f9637xb4cfe0a9 = 402;

        /* renamed from: kResponseEventReaderStart */
        public static final int f9638xe532f851 = 401;

        /* renamed from: kResponseEventReaderStop */
        public static final int f9639xb4d01a33 = 403;

        /* renamed from: kResponseEventTypeAnalysis */
        public static final int f9640xff3a2f84 = 101;

        /* renamed from: kResponseEventTypeRemux */
        public static final int f9641xe1f58d15 = 102;

        /* renamed from: kResponseEventTypeTest */
        public static final int f9642xff08d53a = 100;

        /* renamed from: kResponseEventTypeUnknow */
        public static final int f9643x62586f4c = 0;

        /* renamed from: kResponseEventWriterCreate */
        public static final int f9644x426bb29d = 300;

        /* renamed from: kResponseEventWriterRemove */
        public static final int f9645x5b510a25 = 304;

        /* renamed from: kResponseEventWriterStart */
        public static final int f9646x559b7aa1 = 301;

        /* renamed from: kResponseEventWriterStop */
        public static final int f9647x8f260de3 = 303;

        /* renamed from: kResponseEventWriterUpdate */
        public static final int f9648x61064a6a = 302;
    }
}
