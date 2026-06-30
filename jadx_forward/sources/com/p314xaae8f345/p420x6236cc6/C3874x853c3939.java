package com.p314xaae8f345.p420x6236cc6;

/* renamed from: com.tencent.live2.V2TXLiveDef */
/* loaded from: classes16.dex */
public class C3874x853c3939 {

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveAudioFrameObserverFormat */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveAudioFrameObserverFormat {

        /* renamed from: sampleRate */
        public int f15301x88751aa = 0;

        /* renamed from: channel */
        public int f15299x2c0b7d03 = 0;

        /* renamed from: samplesPerCall */
        public int f15302xb3cdb4d2 = 0;

        /* renamed from: mode */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameOperationMode f15300x3339a3 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameOperationMode.V2TXLiveAudioFrameOperationModeReadOnly;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveAudioFrameOperationMode */
    /* loaded from: classes6.dex */
    public enum V2TXLiveAudioFrameOperationMode {
        V2TXLiveAudioFrameOperationModeReadWrite,
        V2TXLiveAudioFrameOperationModeReadOnly
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveAudioQuality */
    /* loaded from: classes6.dex */
    public enum V2TXLiveAudioQuality {
        V2TXLiveAudioQualitySpeech,
        V2TXLiveAudioQualityDefault,
        V2TXLiveAudioQualityMusic
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveBufferType */
    /* loaded from: classes16.dex */
    public enum V2TXLiveBufferType {
        V2TXLiveBufferTypeUnknown,
        V2TXLiveBufferTypeByteBuffer,
        V2TXLiveBufferTypeByteArray,
        V2TXLiveBufferTypeTexture
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveFillMode */
    /* loaded from: classes16.dex */
    public enum V2TXLiveFillMode {
        V2TXLiveFillModeFill,
        V2TXLiveFillModeFit,
        V2TXLiveFillModeScaleFill
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveLocalRecordingParams */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveLocalRecordingParams {

        /* renamed from: filePath */
        public java.lang.String f15319xd426afc1;

        /* renamed from: recordMode */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRecordMode f15321x2bca8994 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRecordMode.V2TXLiveRecordModeBoth;

        /* renamed from: interval */
        public int f15320x21ffe4c5 = -1;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveLogConfig */
    /* loaded from: classes10.dex */
    public static final class V2TXLiveLogConfig {

        /* renamed from: logPath */
        public java.lang.String f15326x145c3989;

        /* renamed from: logLevel */
        public int f15325x76f472a0 = 0;

        /* renamed from: enableObserver */
        public boolean f15324x2946a979 = false;

        /* renamed from: enableConsole */
        public boolean f15322x7b70ae54 = false;

        /* renamed from: enableLogFile */
        public boolean f15323x571193dd = true;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveLogLevel */
    /* loaded from: classes6.dex */
    public static final class V2TXLiveLogLevel {

        /* renamed from: V2TXLiveLogLevelAll */
        public static final int f15327x14444c15 = 0;

        /* renamed from: V2TXLiveLogLevelDebug */
        public static final int f15328x14889bc7 = 1;

        /* renamed from: V2TXLiveLogLevelError */
        public static final int f15329x149cd77c = 4;

        /* renamed from: V2TXLiveLogLevelFatal */
        public static final int f15330x14a33a78 = 5;

        /* renamed from: V2TXLiveLogLevelInfo */
        public static final int f15331x7448e0ba = 2;

        /* renamed from: V2TXLiveLogLevelNULL */
        public static final int f15332x744ac573 = 6;

        /* renamed from: V2TXLiveLogLevelWarning */
        public static final int f15333xfbf22810 = 3;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveMirrorType */
    /* loaded from: classes6.dex */
    public enum V2TXLiveMirrorType {
        V2TXLiveMirrorTypeAuto,
        V2TXLiveMirrorTypeEnable,
        V2TXLiveMirrorTypeDisable
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveMixInputType */
    /* loaded from: classes6.dex */
    public enum V2TXLiveMixInputType {
        V2TXLiveMixInputTypeAudioVideo,
        V2TXLiveMixInputTypePureVideo,
        V2TXLiveMixInputTypePureAudio
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveMode */
    /* loaded from: classes6.dex */
    public enum V2TXLiveMode {
        TXLiveMode_RTMP,
        TXLiveMode_RTC
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLivePixelFormat */
    /* loaded from: classes16.dex */
    public enum V2TXLivePixelFormat {
        V2TXLivePixelFormatUnknown,
        V2TXLivePixelFormatI420,
        V2TXLivePixelFormatTexture2D
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLivePlayerStatistics */
    /* loaded from: classes16.dex */
    public static final class V2TXLivePlayerStatistics {

        /* renamed from: appCpu */
        public int f15355xabe44fc7;

        /* renamed from: audioBitrate */
        public int f15356x9b599ab7;

        /* renamed from: audioBlockRate */
        public int f15357x4166ebd7;

        /* renamed from: audioPacketLoss */
        public int f15358xa8c62841;

        /* renamed from: audioTotalBlockTime */
        public int f15359xeab8278c;
        public int fps;

        /* renamed from: height */
        public int f15360xb7389127;

        /* renamed from: jitterBufferDelay */
        public int f15361xa6b12897;

        /* renamed from: netSpeed */
        public int f15362x4c4ee0aa;
        public int rtt;

        /* renamed from: systemCpu */
        public int f15363x434cb4f9;

        /* renamed from: videoBitrate */
        public int f15364xf1220e72;

        /* renamed from: videoBlockRate */
        public int f15365x46e15cd2;

        /* renamed from: videoPacketLoss */
        public int f15366x5299d6a6;

        /* renamed from: videoTotalBlockTime */
        public int f15367xc941b71;

        /* renamed from: width */
        public int f15368x6be2dc6;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLivePushStatus */
    /* loaded from: classes6.dex */
    public enum V2TXLivePushStatus {
        V2TXLivePushStatusDisconnected,
        V2TXLivePushStatusConnecting,
        V2TXLivePushStatusConnectSuccess,
        V2TXLivePushStatusReconnecting
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLivePusherStatistics */
    /* loaded from: classes16.dex */
    public static final class V2TXLivePusherStatistics {

        /* renamed from: appCpu */
        public int f15374xabe44fc7;

        /* renamed from: audioBitrate */
        public int f15375x9b599ab7;
        public int fps;

        /* renamed from: height */
        public int f15376xb7389127;

        /* renamed from: netSpeed */
        public int f15377x4c4ee0aa;
        public int rtt;

        /* renamed from: systemCpu */
        public int f15378x434cb4f9;

        /* renamed from: videoBitrate */
        public int f15379xf1220e72;

        /* renamed from: width */
        public int f15380x6be2dc6;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveRecordMode */
    /* loaded from: classes6.dex */
    public enum V2TXLiveRecordMode {
        V2TXLiveRecordModeBoth
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveRotation */
    /* loaded from: classes16.dex */
    public enum V2TXLiveRotation {
        V2TXLiveRotation0,
        V2TXLiveRotation90,
        V2TXLiveRotation180,
        V2TXLiveRotation270
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveSocks5ProxyConfig */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveSocks5ProxyConfig {

        /* renamed from: supportHttps */
        public boolean f15388xa2ad225c = true;

        /* renamed from: supportTcp */
        public boolean f15389xdb688192 = true;

        /* renamed from: supportUdp */
        public boolean f15390xdb688572 = true;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveStreamInfo */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveStreamInfo {

        /* renamed from: bitrate */
        public int f15391xf9e77b6d;

        /* renamed from: framerate */
        public float f15392x208b77cd;

        /* renamed from: height */
        public int f15393xb7389127;
        public java.lang.String url;

        /* renamed from: width */
        public int f15394x6be2dc6;

        public V2TXLiveStreamInfo(int i17, int i18, int i19, float f17, java.lang.String str) {
            this.f15394x6be2dc6 = i17;
            this.f15393xb7389127 = i18;
            this.f15391xf9e77b6d = i19;
            this.f15392x208b77cd = f17;
            this.url = str;
        }
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveTexture */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveTexture {

        /* renamed from: eglContext10 */
        public javax.microedition.khronos.egl.EGLContext f15395x5f488f24;

        /* renamed from: eglContext14 */
        public android.opengl.EGLContext f15396x5f488f28;

        /* renamed from: textureId */
        public int f15397xc35d0396;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveVideoEncoderParam */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveVideoEncoderParam {

        /* renamed from: minVideoBitrate */
        public int f15410x5d9e1de4;

        /* renamed from: videoBitrate */
        public int f15411xf1220e72;

        /* renamed from: videoResolution */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolution f15413xe9fc4b87;

        /* renamed from: videoResolutionMode */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolutionMode f15414xb471ddca = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModePortrait;

        /* renamed from: videoFps */
        public int f15412x44a06a6e = 15;

        public V2TXLiveVideoEncoderParam(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoResolution v2TXLiveVideoResolution) {
            this.f15413xe9fc4b87 = v2TXLiveVideoResolution;
            com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.a m31921xa4d9113a = com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.m31921xa4d9113a(v2TXLiveVideoResolution);
            this.f15411xf1220e72 = m31921xa4d9113a.f128726b;
            this.f15410x5d9e1de4 = m31921xa4d9113a.f128725a;
        }

        /* renamed from: toString */
        public final java.lang.String m31886x9616526c() {
            return "V2TXLiveVideoEncoderParam{videoResolution=" + this.f15413xe9fc4b87 + ", videoResolutionMode=" + this.f15414xb471ddca + ", videoFps=" + this.f15412x44a06a6e + ", videoBitrate=" + this.f15411xf1220e72 + ", minVideoBitrate=" + this.f15410x5d9e1de4 + '}';
        }
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveVideoFrame */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveVideoFrame {

        /* renamed from: buffer */
        public java.nio.ByteBuffer f15415xaddb9440;

        /* renamed from: data */
        public byte[] f15417x2eefaa;

        /* renamed from: height */
        public int f15418xb7389127;

        /* renamed from: rotation */
        public int f15420xfd990f7e;

        /* renamed from: texture */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture f15421xab7dd51b;

        /* renamed from: width */
        public int f15422x6be2dc6;

        /* renamed from: pixelFormat */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;

        /* renamed from: bufferType */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveVideoResolution */
    /* loaded from: classes16.dex */
    public enum V2TXLiveVideoResolution {
        V2TXLiveVideoResolution160x160,
        V2TXLiveVideoResolution270x270,
        V2TXLiveVideoResolution480x480,
        V2TXLiveVideoResolution320x240,
        V2TXLiveVideoResolution480x360,
        V2TXLiveVideoResolution640x480,
        V2TXLiveVideoResolution320x180,
        V2TXLiveVideoResolution480x270,
        V2TXLiveVideoResolution640x360,
        V2TXLiveVideoResolution960x540,
        V2TXLiveVideoResolution1280x720,
        V2TXLiveVideoResolution1920x1080
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveVideoResolutionMode */
    /* loaded from: classes6.dex */
    public enum V2TXLiveVideoResolutionMode {
        V2TXLiveVideoResolutionModeLandscape,
        V2TXLiveVideoResolutionModePortrait
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveAudioFrame */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveAudioFrame {

        /* renamed from: channel */
        public int f15295x2c0b7d03;

        /* renamed from: data */
        public byte[] f15296x2eefaa;

        /* renamed from: sampleRate */
        public int f15297x88751aa;

        /* renamed from: timestamp */
        public long f15298x3492916;

        public V2TXLiveAudioFrame() {
            this.f15296x2eefaa = null;
            this.f15297x88751aa = 48000;
            this.f15295x2c0b7d03 = 1;
            this.f15298x3492916 = 0L;
        }

        /* renamed from: toString */
        public final java.lang.String m31850x9616526c() {
            return "[data='" + this.f15296x2eefaa + "'][sampleRate='" + this.f15297x88751aa + "'][channel=" + this.f15295x2c0b7d03 + "][timestamp=" + this.f15298x3492916 + "]";
        }

        public V2TXLiveAudioFrame(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
            this.f15296x2eefaa = v2TXLiveAudioFrame.f15296x2eefaa;
            this.f15297x88751aa = v2TXLiveAudioFrame.f15297x88751aa;
            this.f15295x2c0b7d03 = v2TXLiveAudioFrame.f15295x2c0b7d03;
            this.f15298x3492916 = v2TXLiveAudioFrame.f15298x3492916;
        }
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveMixStream */
    /* loaded from: classes16.dex */
    public static class V2TXLiveMixStream {

        /* renamed from: height */
        public int f15342xb7389127;

        /* renamed from: inputType */
        public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixInputType f15343x65be6624;

        /* renamed from: streamId */
        public java.lang.String f15344x6abf78bb;

        /* renamed from: userId */
        public java.lang.String f15345xce2b2e46;

        /* renamed from: width */
        public int f15346x6be2dc6;

        /* renamed from: x, reason: collision with root package name */
        public int f128721x;

        /* renamed from: y, reason: collision with root package name */
        public int f128722y;

        /* renamed from: zOrder */
        public int f15347xd4bdd2f4;

        public V2TXLiveMixStream() {
            this.f15345xce2b2e46 = "";
            this.f128721x = 0;
            this.f128722y = 0;
            this.f15346x6be2dc6 = 0;
            this.f15342xb7389127 = 0;
            this.f15347xd4bdd2f4 = 0;
            this.f15343x65be6624 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        /* renamed from: toString */
        public java.lang.String m31869x9616526c() {
            return "[userId='" + this.f15345xce2b2e46 + "'][streamId='" + this.f15344x6abf78bb + "'][x=" + this.f128721x + "][y=" + this.f128722y + "][width=" + this.f15346x6be2dc6 + "][height=" + this.f15342xb7389127 + "][zOrder=" + this.f15347xd4bdd2f4 + "][inputType=" + this.f15343x65be6624 + ']';
        }

        public V2TXLiveMixStream(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
            this.f15345xce2b2e46 = str;
            this.f128721x = i17;
            this.f128722y = i18;
            this.f15346x6be2dc6 = i19;
            this.f15342xb7389127 = i27;
            this.f15347xd4bdd2f4 = i28;
            this.f15343x65be6624 = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        public V2TXLiveMixStream(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream v2TXLiveMixStream) {
            this.f15345xce2b2e46 = v2TXLiveMixStream.f15345xce2b2e46;
            this.f15344x6abf78bb = v2TXLiveMixStream.f15344x6abf78bb;
            this.f128721x = v2TXLiveMixStream.f128721x;
            this.f128722y = v2TXLiveMixStream.f128722y;
            this.f15346x6be2dc6 = v2TXLiveMixStream.f15346x6be2dc6;
            this.f15342xb7389127 = v2TXLiveMixStream.f15342xb7389127;
            this.f15347xd4bdd2f4 = v2TXLiveMixStream.f15347xd4bdd2f4;
            this.f15343x65be6624 = v2TXLiveMixStream.f15343x65be6624;
        }
    }

    /* renamed from: com.tencent.live2.V2TXLiveDef$V2TXLiveTranscodingConfig */
    /* loaded from: classes16.dex */
    public static final class V2TXLiveTranscodingConfig {

        /* renamed from: audioBitrate */
        public int f15398x9b599ab7;

        /* renamed from: audioChannels */
        public int f15399xe235edc6;

        /* renamed from: audioSampleRate */
        public int f15400xa80e7620;

        /* renamed from: backgroundColor */
        public int f15401x4cb7f6d5;

        /* renamed from: backgroundImage */
        public java.lang.String f15402x4d0b70cd;

        /* renamed from: mixStreams */
        public java.util.ArrayList<com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMixStream> f15403x77f0f2f7;

        /* renamed from: outputStreamId */
        public java.lang.String f15404xd4c664dc;

        /* renamed from: videoBitrate */
        public int f15405xf1220e72;

        /* renamed from: videoFramerate */
        public int f15406x336d5d92;

        /* renamed from: videoGOP */
        public int f15407x44a06a0d;

        /* renamed from: videoHeight */
        public int f15408x2a8d0982;

        /* renamed from: videoWidth */
        public int f15409x9f1bbe0b;

        public V2TXLiveTranscodingConfig() {
            this.f15409x9f1bbe0b = 0;
            this.f15408x2a8d0982 = 0;
            this.f15405xf1220e72 = 0;
            this.f15406x336d5d92 = 15;
            this.f15407x44a06a0d = 2;
            this.f15401x4cb7f6d5 = 0;
            this.f15400xa80e7620 = 48000;
            this.f15399xe235edc6 = 1;
            this.f15404xd4c664dc = null;
        }

        /* renamed from: toString */
        public final java.lang.String m31885x9616526c() {
            return "[videoWidth=" + this.f15409x9f1bbe0b + "][videoHeight=" + this.f15408x2a8d0982 + "][videoBitrate=" + this.f15405xf1220e72 + "][videoFramerate=" + this.f15406x336d5d92 + "][videoGOP=" + this.f15407x44a06a0d + "][backgroundColor=" + this.f15401x4cb7f6d5 + "][backgroundImage='" + this.f15402x4d0b70cd + "'][audioSampleRate=" + this.f15400xa80e7620 + "][audioBitrate=" + this.f15398x9b599ab7 + "][audioChannels=" + this.f15399xe235edc6 + "][mixStreams=" + this.f15403x77f0f2f7 + "][outputStreamId='" + this.f15404xd4c664dc + "']";
        }

        public V2TXLiveTranscodingConfig(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
            this.f15409x9f1bbe0b = v2TXLiveTranscodingConfig.f15409x9f1bbe0b;
            this.f15408x2a8d0982 = v2TXLiveTranscodingConfig.f15408x2a8d0982;
            this.f15405xf1220e72 = v2TXLiveTranscodingConfig.f15405xf1220e72;
            this.f15406x336d5d92 = v2TXLiveTranscodingConfig.f15406x336d5d92;
            this.f15407x44a06a0d = v2TXLiveTranscodingConfig.f15407x44a06a0d;
            this.f15401x4cb7f6d5 = v2TXLiveTranscodingConfig.f15401x4cb7f6d5;
            this.f15402x4d0b70cd = v2TXLiveTranscodingConfig.f15402x4d0b70cd;
            this.f15400xa80e7620 = v2TXLiveTranscodingConfig.f15400xa80e7620;
            this.f15398x9b599ab7 = v2TXLiveTranscodingConfig.f15398x9b599ab7;
            this.f15399xe235edc6 = v2TXLiveTranscodingConfig.f15399xe235edc6;
            this.f15404xd4c664dc = v2TXLiveTranscodingConfig.f15404xd4c664dc;
            this.f15403x77f0f2f7 = new java.util.ArrayList<>(v2TXLiveTranscodingConfig.f15403x77f0f2f7);
        }
    }
}
