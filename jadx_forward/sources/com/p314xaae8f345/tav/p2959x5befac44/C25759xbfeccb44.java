package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.CodecHelper */
/* loaded from: classes10.dex */
public class C25759xbfeccb44 {

    /* renamed from: HARD_CODE_PARALLEL_COUNT */
    public static int f48006x77ad2bf5 = -1;

    /* renamed from: MAX_BIT_RATE */
    public static final int f48007x8f90bd8d = 8000000;
    private static final java.lang.String TAG = "CodecHelper";

    /* renamed from: checkAudioOutSupported */
    public static boolean m97435x87bd87ce(int i17, int i18, int i19, java.lang.String str) {
        boolean z17;
        java.util.List<android.media.MediaCodecInfo> m97441x1b268828 = m97441x1b268828(str);
        if (m97441x1b268828.size() > 0) {
            java.util.Iterator<android.media.MediaCodecInfo> it = m97441x1b268828.iterator();
            while (it.hasNext()) {
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = it.next().getCapabilitiesForType(str).getAudioCapabilities();
                boolean contains = audioCapabilities.getBitrateRange().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i17));
                boolean z18 = audioCapabilities.getMaxInputChannelCount() >= i18;
                android.util.Range<java.lang.Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
                int length = supportedSampleRateRanges.length;
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        z17 = false;
                        break;
                    }
                    if (supportedSampleRateRanges[i27].contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i19))) {
                        z17 = true;
                        break;
                    }
                    i27++;
                }
                if (contains && z18 && z17) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: checkVideoOutSupported */
    public static boolean m97436xb5f30f3(int i17, int i18, int i19, int i27, java.lang.String str) {
        java.util.List<android.media.MediaCodecInfo> m97441x1b268828 = m97441x1b268828(str);
        if (m97441x1b268828.size() <= 0) {
            return false;
        }
        java.util.Iterator<android.media.MediaCodecInfo> it = m97441x1b268828.iterator();
        while (it.hasNext()) {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = it.next().getCapabilitiesForType(str).getVideoCapabilities();
            boolean contains = videoCapabilities.getBitrateRange().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i27));
            boolean contains2 = videoCapabilities.getSupportedFrameRates().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i19));
            boolean isSizeSupported = videoCapabilities.isSizeSupported(i17, i18);
            if (contains && contains2 && isSizeSupported) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: clampHeight */
    public static int m97437xb1926dc2(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        return mediaCodecInfo == null ? i17 : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeights().clamp(java.lang.Integer.valueOf(i17)).intValue();
    }

    /* renamed from: clampWidth */
    public static int m97438xabb8d1cb(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        return mediaCodecInfo == null ? i17 : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedWidths().clamp(java.lang.Integer.valueOf(i17)).intValue();
    }

    /* renamed from: correctSupportSize */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97439x3f77cda6(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, java.lang.String str) {
        int i17 = (int) c25732x76648a85.f47833x6be2dc6;
        int i18 = (int) c25732x76648a85.f47832xb7389127;
        int codecCount = android.media.MediaCodecList.getCodecCount();
        android.media.MediaCodecInfo mediaCodecInfo = null;
        for (int i19 = 0; i19 < codecCount && mediaCodecInfo == null; i19++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i19);
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                boolean z17 = false;
                for (int i27 = 0; i27 < supportedTypes.length && !z17; i27++) {
                    if (supportedTypes[i27].equals(str)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    mediaCodecInfo = codecInfoAt;
                }
            }
        }
        int m97445x581b7fb3 = m97445x581b7fb3(mediaCodecInfo, str);
        int m97442x7d3e5e46 = m97442x7d3e5e46(mediaCodecInfo, str);
        float f17 = i17;
        int ceil = (int) (java.lang.Math.ceil((f17 * 1.0f) / m97445x581b7fb3) * m97445x581b7fb3);
        float f18 = i18;
        int ceil2 = (int) (java.lang.Math.ceil((f18 * 1.0f) / m97442x7d3e5e46) * m97442x7d3e5e46);
        java.lang.String str2 = TAG;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "correctSupportSize 1: target = [" + ceil + ", " + ceil2 + "]");
        int m97438xabb8d1cb = m97438xabb8d1cb(mediaCodecInfo, str, i17);
        if (ceil != m97438xabb8d1cb) {
            ceil2 = (int) (ceil2 * ((m97438xabb8d1cb * 1.0f) / ceil));
            ceil = m97438xabb8d1cb;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "correctSupportSize 2: target = [" + ceil + ", " + ceil2 + "]");
        int m97437xb1926dc2 = m97437xb1926dc2(mediaCodecInfo, str, i18);
        if (ceil2 != m97437xb1926dc2) {
            ceil = (int) (ceil * ((m97437xb1926dc2 * 1.0f) / ceil2));
            ceil2 = m97437xb1926dc2;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "correctSupportSize 3: target = [" + ceil + ", " + ceil2 + "]");
        if (!m97446x450f16a4(mediaCodecInfo, str, ceil, ceil2)) {
            ceil = (int) (java.lang.Math.ceil(f17 / 16.0f) * 16.0d);
            ceil2 = (int) (java.lang.Math.ceil(f18 / 16.0f) * 16.0d);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "correctSupportSize return: target = [" + ceil + ", " + ceil2 + "]");
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(ceil, ceil2);
    }

    /* renamed from: decoderCodecInfo */
    private static java.util.List<android.media.MediaCodecInfo> m97440x10ddee00(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (!codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (supportedTypes[i18].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    }
                    i18++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: encoderCodecInfo */
    public static java.util.List<android.media.MediaCodecInfo> m97441x1b268828(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (supportedTypes[i18].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    }
                    i18++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: getHeightAlignment */
    private static int m97442x7d3e5e46(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getHeightAlignment();
        }
        return 16;
    }

    /* renamed from: getSupportMaxParallelCount */
    public static int m97444xccb8f9fd(java.lang.String str) {
        int i17 = f48006x77ad2bf5;
        if (i17 >= 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "hardcode parallel count %d", java.lang.Integer.valueOf(i17));
            return f48006x77ad2bf5;
        }
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        c25820xcadb1d34.m97977x683d6267(str);
        int m97464x334942e1 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(c25820xcadb1d34, "video/");
        if (m97464x334942e1 < 0) {
            return 0;
        }
        c25820xcadb1d34.m97975xc3b89af(m97464x334942e1);
        android.media.MediaFormat m97969xe2db7ec = c25820xcadb1d34.m97969xe2db7ec(m97464x334942e1);
        int integer = m97969xe2db7ec.containsKey("width") ? m97969xe2db7ec.getInteger("width") : 0;
        int integer2 = m97969xe2db7ec.containsKey("height") ? m97969xe2db7ec.getInteger("height") : 0;
        int integer3 = m97969xe2db7ec.containsKey("frame-rate") ? m97969xe2db7ec.getInteger("frame-rate") : 30;
        long integer4 = m97969xe2db7ec.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? m97969xe2db7ec.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) : 0L;
        java.lang.String string = m97969xe2db7ec.getString("mime");
        c25820xcadb1d34.m97958x63a5261f();
        return m97443xccb8f9fd(integer, integer2, integer3, integer4, string);
    }

    /* renamed from: getWidthAlignment */
    private static int m97445x581b7fb3(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getWidthAlignment();
        }
        return 16;
    }

    /* renamed from: isSupported */
    private static boolean m97446x450f16a4(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17, int i18) {
        return mediaCodecInfo != null && mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i17, i18);
    }

    /* renamed from: selectCodec */
    public static android.media.MediaCodecInfo m97447xb4aa87a(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: selectProfileAndLevel */
    public static void m97448x539b601a(android.media.MediaFormat mediaFormat) {
        m97449x539b601a(mediaFormat, false);
    }

    /* renamed from: selectProfileAndLevel */
    public static void m97449x539b601a(android.media.MediaFormat mediaFormat, boolean z17) {
        int i17;
        int i18;
        android.media.MediaCodecInfo m97447xb4aa87a = m97447xb4aa87a("video/avc");
        if (m97447xb4aa87a != null) {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = m97447xb4aa87a.getCapabilitiesForType("video/avc");
            int i19 = -1;
            if (capabilitiesForType.profileLevels != null) {
                int i27 = 0;
                i17 = -1;
                while (true) {
                    android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    if (i27 >= codecProfileLevelArr.length) {
                        break;
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i27];
                    int i28 = codecProfileLevel.profile;
                    if (i28 <= 8) {
                        if (i28 > i19) {
                            i17 = codecProfileLevel.level;
                            i19 = i28;
                        } else if (i28 == i19 && (i18 = codecProfileLevel.level) > i17) {
                            i17 = i18;
                        }
                    }
                    i27++;
                }
            } else {
                i17 = -1;
            }
            if (i19 == 8) {
                if (z17 && i17 >= 65536) {
                    i17 = 65536;
                }
                mediaFormat.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i19);
                mediaFormat.setInteger(ya.b.f77487x44fa364, i17);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, java.lang.String.format("selectProfileAndLevel: 0x%x, 0x%x", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17)));
            }
        }
    }

    /* renamed from: getSupportMaxParallelCount */
    public static int m97443xccb8f9fd(int i17, int i18, int i19, long j17, java.lang.String str) {
        java.lang.String str2 = TAG;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "getSupportMaxParallelCount print width:%d height:%d frameRate:%d bitRate:%d bitRate:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), str);
        int i27 = f48006x77ad2bf5;
        if (i27 >= 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "hardcode parallel count %d", java.lang.Integer.valueOf(i27));
            return f48006x77ad2bf5;
        }
        android.media.MediaCodecInfo m97447xb4aa87a = m97447xb4aa87a(str);
        if (m97447xb4aa87a == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "CodecHelper.selectCodec null");
            return 0;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = m97447xb4aa87a.getCapabilitiesForType(str).getVideoCapabilities();
        android.util.Range<java.lang.Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        android.util.Range<java.lang.Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths != null && supportedHeights != null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "getSupportMaxParallelCount widthRange:%s heightRange:%s", supportedWidths, supportedHeights);
            if (!videoCapabilities.isSizeSupported(i17, i18)) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "isSizeSupported false1");
                i17 += (videoCapabilities.getWidthAlignment() + i17) % videoCapabilities.getWidthAlignment();
                i18 += (videoCapabilities.getHeightAlignment() + i18) % videoCapabilities.getHeightAlignment();
            }
            if (!videoCapabilities.isSizeSupported(i17, i18)) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "isSizeSupported false2");
                return -1;
            }
            android.util.Range<java.lang.Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(i17, i18);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "getSupportMaxParallelCount frameRange:%s", supportedFrameRatesFor);
            int doubleValue = i19 > 0 ? (int) (supportedFrameRatesFor.getUpper().doubleValue() / i19) : 0;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "getSupportMaxParallelCount BitrateRange:%s", videoCapabilities.getBitrateRange());
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str2, "getSupportMaxParallelCount frameMaxCount:%d bitrateMaxCount:%d", java.lang.Integer.valueOf(doubleValue), java.lang.Integer.valueOf(j17 <= 0 ? doubleValue : (int) (r6.getUpper().intValue() / j17)));
            return doubleValue / 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(supportedWidths == null);
        objArr[1] = java.lang.Boolean.valueOf(supportedHeights == null);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "getSupportMaxParallelCount size range error.width null[%b] height null[%b]", objArr);
        return 1;
    }
}
