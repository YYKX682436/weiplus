package com.tencent.liteav.videobase.common;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class MediaCodecAbility {
    private static final java.lang.String TAG = "MediaCodecAbility";

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r1 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getMediaCodecDecoderSupportLowResolution() {
        /*
            java.lang.String r0 = "video/avc"
            int r1 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            r2 = 21
            r3 = 0
            if (r1 >= r2) goto Lc
            return r3
        Lc:
            r1 = 0
            android.media.MediaCodec r1 = android.media.MediaCodec.createDecoderByType(r0)     // Catch: java.lang.Throwable -> L56
            android.media.MediaCodecInfo r2 = r1.getCodecInfo()     // Catch: java.lang.Throwable -> L56
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.getCapabilitiesForType(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L1f
            r1.release()
            return r3
        L1f:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L29
            r1.release()
            return r3
        L29:
            android.util.Range r2 = r0.getSupportedWidths()     // Catch: java.lang.Throwable -> L56
            android.util.Range r0 = r0.getSupportedHeights()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L52
            if (r0 != 0) goto L36
            goto L52
        L36:
            java.lang.Comparable r2 = r2.getLower()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L56
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L56
            java.lang.Comparable r0 = r0.getLower()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L56
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L56
        L4e:
            r1.release()
            goto L69
        L52:
            r1.release()
            return r3
        L56:
            r0 = move-exception
            java.lang.String r2 = "MediaCodecAbility"
            java.lang.String r4 = "get low resolution error:"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r4.concat(r0)     // Catch: java.lang.Throwable -> L6a
            com.tencent.liteav.base.util.LiteavLog.e(r2, r0)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L69
            goto L4e
        L69:
            return r3
        L6a:
            r0 = move-exception
            if (r1 == 0) goto L70
            r1.release()
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.common.MediaCodecAbility.getMediaCodecDecoderSupportLowResolution():int");
    }

    public static boolean isDecoderSupportHevc() {
        boolean z17 = false;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            boolean z18 = false;
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
                try {
                    java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (!mediaCodecInfo.isEncoder()) {
                        int length = supportedTypes.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            if (supportedTypes[i17].contains("video/hevc")) {
                                z18 = true;
                                com.tencent.liteav.base.util.LiteavLog.i(TAG, "got hevc decoder:%s", mediaCodecInfo.getName());
                                break;
                            }
                            i17++;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    z17 = z18;
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "get hevc decode error:".concat(java.lang.String.valueOf(th)));
                    return z17;
                }
            }
            return z18;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static boolean isEncoderSupportHevc() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(1).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.contains("video/hevc")) {
                            com.tencent.liteav.base.util.LiteavLog.i(TAG, "get hevc encoder");
                            return true;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "failed to get hevc encoder:".concat(java.lang.String.valueOf(th6)));
        }
        com.tencent.liteav.base.util.LiteavLog.w(TAG, "not got hevc encoder");
        return false;
    }

    public static boolean isMediaCodecDecodeSupportSWHevc() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
                java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (!mediaCodecInfo.isEncoder()) {
                    for (java.lang.String str : supportedTypes) {
                        if (str.contains("video/hevc") && isSoftOnlyDecoder(mediaCodecInfo)) {
                            com.tencent.liteav.base.util.LiteavLog.i(TAG, "got soft only hevc decoder:%s", mediaCodecInfo.getName());
                            return true;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "get hevc decode error:".concat(java.lang.String.valueOf(th6)));
        }
        return false;
    }

    public static boolean isSoftOnlyDecoder(android.media.MediaCodecInfo mediaCodecInfo) {
        return com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() > 29 ? mediaCodecInfo.isSoftwareOnly() : mediaCodecInfo.getName().contains(com.eclipsesource.mmv8.Platform.ANDROID) || mediaCodecInfo.getName().contains("google");
    }
}
