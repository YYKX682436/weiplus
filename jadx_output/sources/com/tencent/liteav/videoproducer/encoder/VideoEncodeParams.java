package com.tencent.liteav.videoproducer.encoder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public final class VideoEncodeParams implements java.lang.Cloneable {
    public boolean annexb;
    public long baseFrameIndex;
    public long baseGopIndex;
    public int bitrate;
    public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode bitrateMode;
    public com.tencent.liteav.videobase.common.CodecType codecType;
    public boolean enableAutoQP;
    public boolean enableBFrame;
    public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene encodeScene;
    public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity encoderComplexity;
    public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
    public boolean isTranscodingMode;
    public org.json.JSONArray mediaCodecDeviceRelatedParams;
    public com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy referenceStrategy;
    public int width;

    public VideoEncodeParams() {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CBR;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.FIX_GOP;
        this.codecType = com.tencent.liteav.videobase.common.CodecType.H264;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene.kCameraRealTime;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
    }

    private int checkFieldDiffCounts(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = 0;
        for (java.lang.reflect.Field field : com.tencent.liteav.videoproducer.encoder.VideoEncodeParams.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!com.tencent.liteav.base.util.CommonUtil.equals(field.get(obj), field.get(obj2))) {
                    i17++;
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        return i17;
    }

    public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene createEncodeScene(int i17) {
        return com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene.a(i17);
    }

    public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode createEncoderBitrateMode(int i17) {
        return com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.a(i17);
    }

    public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity createEncoderComplexity(int i17) {
        return com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity.a(i17);
    }

    public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile createEncoderProfileType(int i17) {
        return com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.a(i17);
    }

    public static com.tencent.liteav.videobase.common.CodecType createEncoderVideoCodec(int i17) {
        return com.tencent.liteav.videobase.common.CodecType.a(i17);
    }

    public static com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy createReferenceStrategy(int i17) {
        return com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.a(i17);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.tencent.liteav.videoproducer.encoder.VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final long getBaseFrameIndex() {
        return this.baseFrameIndex;
    }

    public final long getBaseGopIndex() {
        return this.baseGopIndex;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getCodecType() {
        return this.codecType.mValue;
    }

    public final int getEncodeScene() {
        com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene encodeScene = this.encodeScene;
        return encodeScene == null ? com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene.kCameraRealTime.mValue : encodeScene.mValue;
    }

    public final int getEncoderComplexity() {
        com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity encoderComplexity = this.encoderComplexity;
        return encoderComplexity == null ? com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity.VERY_FAST.mValue : encoderComplexity.mValue;
    }

    public final int getEncoderProfile() {
        return this.encoderProfile.mValue;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy getReferenceStrategy() {
        return this.referenceStrategy;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnableAutoQP() {
        return this.enableAutoQP;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isEnablesRps() {
        return this.referenceStrategy == com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.RPS;
    }

    public final boolean isEnablesSvc() {
        return this.referenceStrategy == com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.SVC;
    }

    public final boolean isEnablesUnlimitedGop() {
        return this.referenceStrategy == com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.UNLIMITED_GOP;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final boolean isTranscodingMode() {
        return this.isTranscodingMode;
    }

    public final void setAnnexb(boolean z17) {
        this.annexb = z17;
    }

    public final void setAutoQPEnabeled(boolean z17) {
        this.enableAutoQP = z17;
    }

    public final void setBFrameEnabled(boolean z17) {
        this.enableBFrame = z17;
    }

    public final void setBaseFrameIndex(long j17) {
        this.baseFrameIndex = j17;
    }

    public final void setBaseGopIndex(long j17) {
        this.baseGopIndex = j17;
    }

    public final void setBitrate(int i17) {
        this.bitrate = i17;
    }

    public final void setBitrateMode(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode bitrateMode) {
        this.bitrateMode = bitrateMode;
    }

    public final void setCodecType(com.tencent.liteav.videobase.common.CodecType codecType) {
        this.codecType = codecType;
    }

    public final void setEncodeScene(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene encodeScene) {
        this.encodeScene = encodeScene;
    }

    public final void setEncoderComplexity(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderComplexity encoderComplexity) {
        this.encoderComplexity = encoderComplexity;
    }

    public final void setEncoderProfile(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile encoderProfile) {
        this.encoderProfile = encoderProfile;
    }

    public final void setFps(int i17) {
        this.fps = i17;
    }

    public final void setFullIFrame(boolean z17) {
        this.fullIFrame = z17;
    }

    public final void setGop(int i17) {
        this.gop = i17;
    }

    public final void setHeight(int i17) {
        this.height = i17;
    }

    public final void setReferenceStrategy(com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy referenceStrategy) {
        this.referenceStrategy = referenceStrategy;
    }

    public final void setTranscodingModeEnabled(boolean z17) {
        this.isTranscodingMode = z17;
    }

    public final void setWidth(int i17) {
        this.width = i17;
    }

    public final java.lang.String toString() {
        return "width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", annexb=" + this.annexb + ", encoderProfile=" + this.encoderProfile + ", bitrateMode=" + this.bitrateMode + ", baseFrameIndex=" + this.baseFrameIndex + ", baseGopIndex=" + this.baseGopIndex + ", fullIFrame=" + this.fullIFrame + ", enableBFrame=" + this.enableBFrame + ", referenceStrategy=" + this.referenceStrategy + ", codecType=" + this.codecType + ", isTransCodingMode=" + this.isTranscodingMode + ", mediaCodecDeviceRelatedParams=" + this.mediaCodecDeviceRelatedParams + ", encoderComplexity=" + this.encoderComplexity + ", encodeScene=" + this.encodeScene + ", enableAutoQP=" + this.enableAutoQP;
    }

    public VideoEncodeParams(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams) {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CBR;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.ReferenceStrategy.FIX_GOP;
        this.codecType = com.tencent.liteav.videobase.common.CodecType.H264;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncodeScene.kCameraRealTime;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
        if (videoEncodeParams == null) {
            return;
        }
        this.width = videoEncodeParams.width;
        this.height = videoEncodeParams.height;
        this.fps = videoEncodeParams.fps;
        this.gop = videoEncodeParams.gop;
        this.bitrate = videoEncodeParams.bitrate;
        this.annexb = videoEncodeParams.annexb;
        this.encoderProfile = videoEncodeParams.encoderProfile;
        this.bitrateMode = videoEncodeParams.bitrateMode;
        this.baseFrameIndex = videoEncodeParams.baseFrameIndex;
        this.baseGopIndex = videoEncodeParams.baseGopIndex;
        this.fullIFrame = videoEncodeParams.fullIFrame;
        this.enableBFrame = videoEncodeParams.enableBFrame;
        this.codecType = videoEncodeParams.codecType;
        this.referenceStrategy = videoEncodeParams.referenceStrategy;
        this.isTranscodingMode = videoEncodeParams.isTranscodingMode;
        this.encoderComplexity = videoEncodeParams.encoderComplexity;
        this.encodeScene = videoEncodeParams.encodeScene;
        this.enableAutoQP = videoEncodeParams.enableAutoQP;
        if (videoEncodeParams.mediaCodecDeviceRelatedParams != null) {
            try {
                this.mediaCodecDeviceRelatedParams = new org.json.JSONArray(videoEncodeParams.mediaCodecDeviceRelatedParams.toString());
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
