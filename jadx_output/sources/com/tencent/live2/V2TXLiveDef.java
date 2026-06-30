package com.tencent.live2;

/* loaded from: classes16.dex */
public class V2TXLiveDef {

    /* loaded from: classes16.dex */
    public static final class V2TXLiveAudioFrameObserverFormat {
        public int sampleRate = 0;
        public int channel = 0;
        public int samplesPerCall = 0;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameOperationMode mode = com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameOperationMode.V2TXLiveAudioFrameOperationModeReadOnly;
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveAudioFrameOperationMode {
        V2TXLiveAudioFrameOperationModeReadWrite,
        V2TXLiveAudioFrameOperationModeReadOnly
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveAudioQuality {
        V2TXLiveAudioQualitySpeech,
        V2TXLiveAudioQualityDefault,
        V2TXLiveAudioQualityMusic
    }

    /* loaded from: classes16.dex */
    public enum V2TXLiveBufferType {
        V2TXLiveBufferTypeUnknown,
        V2TXLiveBufferTypeByteBuffer,
        V2TXLiveBufferTypeByteArray,
        V2TXLiveBufferTypeTexture
    }

    /* loaded from: classes16.dex */
    public enum V2TXLiveFillMode {
        V2TXLiveFillModeFill,
        V2TXLiveFillModeFit,
        V2TXLiveFillModeScaleFill
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveLocalRecordingParams {
        public java.lang.String filePath;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveRecordMode recordMode = com.tencent.live2.V2TXLiveDef.V2TXLiveRecordMode.V2TXLiveRecordModeBoth;
        public int interval = -1;
    }

    /* loaded from: classes10.dex */
    public static final class V2TXLiveLogConfig {
        public java.lang.String logPath;
        public int logLevel = 0;
        public boolean enableObserver = false;
        public boolean enableConsole = false;
        public boolean enableLogFile = true;
    }

    /* loaded from: classes6.dex */
    public static final class V2TXLiveLogLevel {
        public static final int V2TXLiveLogLevelAll = 0;
        public static final int V2TXLiveLogLevelDebug = 1;
        public static final int V2TXLiveLogLevelError = 4;
        public static final int V2TXLiveLogLevelFatal = 5;
        public static final int V2TXLiveLogLevelInfo = 2;
        public static final int V2TXLiveLogLevelNULL = 6;
        public static final int V2TXLiveLogLevelWarning = 3;
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveMirrorType {
        V2TXLiveMirrorTypeAuto,
        V2TXLiveMirrorTypeEnable,
        V2TXLiveMirrorTypeDisable
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveMixInputType {
        V2TXLiveMixInputTypeAudioVideo,
        V2TXLiveMixInputTypePureVideo,
        V2TXLiveMixInputTypePureAudio
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveMode {
        TXLiveMode_RTMP,
        TXLiveMode_RTC
    }

    /* loaded from: classes16.dex */
    public enum V2TXLivePixelFormat {
        V2TXLivePixelFormatUnknown,
        V2TXLivePixelFormatI420,
        V2TXLivePixelFormatTexture2D
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLivePlayerStatistics {
        public int appCpu;
        public int audioBitrate;
        public int audioBlockRate;
        public int audioPacketLoss;
        public int audioTotalBlockTime;
        public int fps;
        public int height;
        public int jitterBufferDelay;
        public int netSpeed;
        public int rtt;
        public int systemCpu;
        public int videoBitrate;
        public int videoBlockRate;
        public int videoPacketLoss;
        public int videoTotalBlockTime;
        public int width;
    }

    /* loaded from: classes6.dex */
    public enum V2TXLivePushStatus {
        V2TXLivePushStatusDisconnected,
        V2TXLivePushStatusConnecting,
        V2TXLivePushStatusConnectSuccess,
        V2TXLivePushStatusReconnecting
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLivePusherStatistics {
        public int appCpu;
        public int audioBitrate;
        public int fps;
        public int height;
        public int netSpeed;
        public int rtt;
        public int systemCpu;
        public int videoBitrate;
        public int width;
    }

    /* loaded from: classes6.dex */
    public enum V2TXLiveRecordMode {
        V2TXLiveRecordModeBoth
    }

    /* loaded from: classes16.dex */
    public enum V2TXLiveRotation {
        V2TXLiveRotation0,
        V2TXLiveRotation90,
        V2TXLiveRotation180,
        V2TXLiveRotation270
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveSocks5ProxyConfig {
        public boolean supportHttps = true;
        public boolean supportTcp = true;
        public boolean supportUdp = true;
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveStreamInfo {
        public int bitrate;
        public float framerate;
        public int height;
        public java.lang.String url;
        public int width;

        public V2TXLiveStreamInfo(int i17, int i18, int i19, float f17, java.lang.String str) {
            this.width = i17;
            this.height = i18;
            this.bitrate = i19;
            this.framerate = f17;
            this.url = str;
        }
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveTexture {
        public javax.microedition.khronos.egl.EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveVideoEncoderParam {
        public int minVideoBitrate;
        public int videoBitrate;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution videoResolution;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode videoResolutionMode = com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModePortrait;
        public int videoFps = 15;

        public V2TXLiveVideoEncoderParam(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution) {
            this.videoResolution = v2TXLiveVideoResolution;
            com.tencent.live2.impl.V2TXLiveUtils.a bitrateByResolution = com.tencent.live2.impl.V2TXLiveUtils.getBitrateByResolution(v2TXLiveVideoResolution);
            this.videoBitrate = bitrateByResolution.f47193b;
            this.minVideoBitrate = bitrateByResolution.f47192a;
        }

        public final java.lang.String toString() {
            return "V2TXLiveVideoEncoderParam{videoResolution=" + this.videoResolution + ", videoResolutionMode=" + this.videoResolutionMode + ", videoFps=" + this.videoFps + ", videoBitrate=" + this.videoBitrate + ", minVideoBitrate=" + this.minVideoBitrate + '}';
        }
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveVideoFrame {
        public java.nio.ByteBuffer buffer;
        public byte[] data;
        public int height;
        public int rotation;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveTexture texture;
        public int width;
        public com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
    }

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

    /* loaded from: classes6.dex */
    public enum V2TXLiveVideoResolutionMode {
        V2TXLiveVideoResolutionModeLandscape,
        V2TXLiveVideoResolutionModePortrait
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveAudioFrame {
        public int channel;
        public byte[] data;
        public int sampleRate;
        public long timestamp;

        public V2TXLiveAudioFrame() {
            this.data = null;
            this.sampleRate = 48000;
            this.channel = 1;
            this.timestamp = 0L;
        }

        public final java.lang.String toString() {
            return "[data='" + this.data + "'][sampleRate='" + this.sampleRate + "'][channel=" + this.channel + "][timestamp=" + this.timestamp + "]";
        }

        public V2TXLiveAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
            this.data = v2TXLiveAudioFrame.data;
            this.sampleRate = v2TXLiveAudioFrame.sampleRate;
            this.channel = v2TXLiveAudioFrame.channel;
            this.timestamp = v2TXLiveAudioFrame.timestamp;
        }
    }

    /* loaded from: classes16.dex */
    public static class V2TXLiveMixStream {
        public int height;
        public com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType inputType;
        public java.lang.String streamId;
        public java.lang.String userId;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f47188x;

        /* renamed from: y, reason: collision with root package name */
        public int f47189y;
        public int zOrder;

        public V2TXLiveMixStream() {
            this.userId = "";
            this.f47188x = 0;
            this.f47189y = 0;
            this.width = 0;
            this.height = 0;
            this.zOrder = 0;
            this.inputType = com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        public java.lang.String toString() {
            return "[userId='" + this.userId + "'][streamId='" + this.streamId + "'][x=" + this.f47188x + "][y=" + this.f47189y + "][width=" + this.width + "][height=" + this.height + "][zOrder=" + this.zOrder + "][inputType=" + this.inputType + ']';
        }

        public V2TXLiveMixStream(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
            this.userId = str;
            this.f47188x = i17;
            this.f47189y = i18;
            this.width = i19;
            this.height = i27;
            this.zOrder = i28;
            this.inputType = com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        public V2TXLiveMixStream(com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream v2TXLiveMixStream) {
            this.userId = v2TXLiveMixStream.userId;
            this.streamId = v2TXLiveMixStream.streamId;
            this.f47188x = v2TXLiveMixStream.f47188x;
            this.f47189y = v2TXLiveMixStream.f47189y;
            this.width = v2TXLiveMixStream.width;
            this.height = v2TXLiveMixStream.height;
            this.zOrder = v2TXLiveMixStream.zOrder;
            this.inputType = v2TXLiveMixStream.inputType;
        }
    }

    /* loaded from: classes16.dex */
    public static final class V2TXLiveTranscodingConfig {
        public int audioBitrate;
        public int audioChannels;
        public int audioSampleRate;
        public int backgroundColor;
        public java.lang.String backgroundImage;
        public java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream> mixStreams;
        public java.lang.String outputStreamId;
        public int videoBitrate;
        public int videoFramerate;
        public int videoGOP;
        public int videoHeight;
        public int videoWidth;

        public V2TXLiveTranscodingConfig() {
            this.videoWidth = 0;
            this.videoHeight = 0;
            this.videoBitrate = 0;
            this.videoFramerate = 15;
            this.videoGOP = 2;
            this.backgroundColor = 0;
            this.audioSampleRate = 48000;
            this.audioChannels = 1;
            this.outputStreamId = null;
        }

        public final java.lang.String toString() {
            return "[videoWidth=" + this.videoWidth + "][videoHeight=" + this.videoHeight + "][videoBitrate=" + this.videoBitrate + "][videoFramerate=" + this.videoFramerate + "][videoGOP=" + this.videoGOP + "][backgroundColor=" + this.backgroundColor + "][backgroundImage='" + this.backgroundImage + "'][audioSampleRate=" + this.audioSampleRate + "][audioBitrate=" + this.audioBitrate + "][audioChannels=" + this.audioChannels + "][mixStreams=" + this.mixStreams + "][outputStreamId='" + this.outputStreamId + "']";
        }

        public V2TXLiveTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
            this.videoWidth = v2TXLiveTranscodingConfig.videoWidth;
            this.videoHeight = v2TXLiveTranscodingConfig.videoHeight;
            this.videoBitrate = v2TXLiveTranscodingConfig.videoBitrate;
            this.videoFramerate = v2TXLiveTranscodingConfig.videoFramerate;
            this.videoGOP = v2TXLiveTranscodingConfig.videoGOP;
            this.backgroundColor = v2TXLiveTranscodingConfig.backgroundColor;
            this.backgroundImage = v2TXLiveTranscodingConfig.backgroundImage;
            this.audioSampleRate = v2TXLiveTranscodingConfig.audioSampleRate;
            this.audioBitrate = v2TXLiveTranscodingConfig.audioBitrate;
            this.audioChannels = v2TXLiveTranscodingConfig.audioChannels;
            this.outputStreamId = v2TXLiveTranscodingConfig.outputStreamId;
            this.mixStreams = new java.util.ArrayList<>(v2TXLiveTranscodingConfig.mixStreams);
        }
    }
}
