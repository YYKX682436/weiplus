package com.tencent.live.utils;

/* loaded from: classes16.dex */
public class EnumUtils {
    public static com.tencent.liteav.device.TXDeviceManager.TXAudioRoute getTXAudioRoute(int i17) {
        if (i17 != 0 && i17 == 1) {
            return com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
        }
        return com.tencent.liteav.device.TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
    }

    public static com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType getTXSystemVolumeType(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto : com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP : com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia : com.tencent.liteav.device.TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    }

    public static com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType getTXVoiceChangerType(int i17) {
        switch (i17) {
            case 0:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
            case 1:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1;
            case 2:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2;
            case 3:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3;
            case 4:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4;
            case 5:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5;
            case 6:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6;
            case 7:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7;
            case 8:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8;
            case 9:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9;
            case 10:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10;
            case 11:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11;
            default:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
        }
    }

    public static com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType getTXVoiceReverbType(int i17) {
        switch (i17) {
            case 0:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
            case 1:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1;
            case 2:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2;
            case 3:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3;
            case 4:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4;
            case 5:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5;
            case 6:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6;
            case 7:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7;
            case 8:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8;
            case 9:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9;
            case 10:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10;
            default:
                return com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
        }
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality getV2TXLiveAudioQuality(int i17) {
        if (i17 == 0) {
            return com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualitySpeech;
        }
        if (i17 != 1 && i17 == 2) {
            return com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityMusic;
        }
        return com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType getV2TXLiveBufferType(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode getV2TXLiveFillMode(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill : com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill : com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit : com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType getV2TXLiveMirrorType(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto : com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeDisable : com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeEnable : com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType getV2TXLiveMixInputType(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo : com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypePureAudio : com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypePureVideo : com.tencent.live2.V2TXLiveDef.V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat getV2TXLivePixelFormat(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420 : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveRotation getV2TXLiveRotation(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0 : com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270 : com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180 : com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90 : com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution getV2TXLiveVideoResolution(int i17) {
        switch (i17) {
            case 0:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution160x160;
            case 1:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution270x270;
            case 2:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x480;
            case 3:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x240;
            case 4:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x360;
            case 5:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x480;
            case 6:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x180;
            case 7:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x270;
            case 8:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x360;
            case 9:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540;
            case 10:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1280x720;
            case 11:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1920x1080;
            default:
                return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540;
        }
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode getV2TXLiveVideoResolutionMode(int i17) {
        if (i17 != 0 && i17 == 1) {
            return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModePortrait;
        }
        return com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModeLandscape;
    }
}
