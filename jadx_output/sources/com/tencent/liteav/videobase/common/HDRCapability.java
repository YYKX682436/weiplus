package com.tencent.liteav.videobase.common;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class HDRCapability {
    private static final java.lang.String TAG = "HDRCapability";
    private static java.lang.Boolean sIsHDR10Supported;
    private static final com.tencent.liteav.base.util.l sSequenceTaskRunner = new com.tencent.liteav.base.util.l();

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIsHDR10Supported() {
        synchronized (com.tencent.liteav.videobase.common.HDRCapability.class) {
            if (sIsHDR10Supported != null) {
                return;
            }
            try {
                boolean isDisplaySupportHDR10 = isDisplaySupportHDR10();
                boolean isDecoderSupportHDR10 = isDecoderSupportHDR10();
                synchronized (com.tencent.liteav.videobase.common.HDRCapability.class) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isDisplaySupportHDR10 && isDecoderSupportHDR10);
                    sIsHDR10Supported = valueOf;
                    com.tencent.liteav.base.util.LiteavLog.i(TAG, "the device supports hdr10 %b", valueOf);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "check hdr capability error ", th6);
            }
        }
    }

    private static boolean hasHDR10ProfileLevel(android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 4096) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDecoderSupportHDR10() {
        for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
            for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc") && hasHDR10ProfileLevel(mediaCodecInfo.getCapabilitiesForType("video/hevc").profileLevels)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isDisplaySupportHDR10() {
        android.view.WindowManager windowManager;
        android.view.Display.HdrCapabilities hdrCapabilities;
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (android.view.WindowManager) applicationContext.getSystemService("window")) == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return false;
        }
        for (int i17 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i17 == 2) {
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean isHDRSupported(int i17) {
        synchronized (com.tencent.liteav.videobase.common.HDRCapability.class) {
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 24) {
                return false;
            }
            if (i17 != com.tencent.liteav.videobase.common.b.HDR10.mValue) {
                return false;
            }
            java.lang.Boolean bool = sIsHDR10Supported;
            if (bool != null) {
                return bool.booleanValue();
            }
            sSequenceTaskRunner.a(com.tencent.liteav.videobase.common.a.a());
            return false;
        }
    }
}
