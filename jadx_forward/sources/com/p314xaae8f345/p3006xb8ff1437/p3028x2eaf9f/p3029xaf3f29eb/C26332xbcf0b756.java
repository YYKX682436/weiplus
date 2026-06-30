package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPUnitendCodecUtils */
/* loaded from: classes13.dex */
public class C26332xbcf0b756 {

    /* renamed from: DolbyVisionProfileDvavPen */
    private static int f52397x269b40c9 = 1;

    /* renamed from: DolbyVisionProfileDvavPer */
    private static int f52398x269b40cd = 0;

    /* renamed from: DolbyVisionProfileDvavSe */
    private static int f52399x7d1dc8a2 = 9;

    /* renamed from: DolbyVisionProfileDvheDen */
    private static int f52400x26f5fdf5 = 3;

    /* renamed from: DolbyVisionProfileDvheDer */
    private static int f52401x26f5fdf9 = 2;

    /* renamed from: DolbyVisionProfileDvheDtb */
    private static int f52402x26f5ffba = 7;

    /* renamed from: DolbyVisionProfileDvheDth */
    private static int f52403x26f5ffc0 = 6;

    /* renamed from: DolbyVisionProfileDvheDtr */
    private static int f52404x26f5ffca = 4;

    /* renamed from: DolbyVisionProfileDvheSt */
    private static int f52405x7d20b779 = 8;

    /* renamed from: DolbyVisionProfileDvheStn */
    private static int f52406x26f63815 = 5;

    /* renamed from: mSecureDecoderNameMaps */
    private static java.util.HashMap<java.lang.String, java.lang.String> f52407x98f32942;

    /* renamed from: convertOmxProfileToDolbyVision */
    public static int m101998xcc060d03(int i17) {
        int i18 = i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? i17 != 16 ? i17 != 32 ? i17 != 64 ? i17 != 128 ? i17 != 256 ? i17 != 512 ? 0 : f52399x7d1dc8a2 : f52405x7d20b779 : f52402x26f5ffba : f52403x26f5ffc0 : f52406x26f63815 : f52404x26f5ffca : f52400x26f5fdf5 : f52401x26f5fdf9 : f52397x269b40c9 : f52398x269b40cd;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, "TPUnitendCodecUtils", "convertOmxProfileToDolbyVision omxProfile:" + i17 + " dolbyVisionProfile:" + i18);
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:" + r9);
     */
    /* renamed from: getDolbyVisionDecoderName */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String m101999xcce9f065(java.lang.String r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26332xbcf0b756.m101999xcce9f065(java.lang.String, int, int, boolean):java.lang.String");
    }

    /* renamed from: getSecureDecoderName */
    public static synchronized java.lang.String m102000x733cac42(java.lang.String str) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26332xbcf0b756.class) {
            java.lang.String str2 = null;
            if (!android.text.TextUtils.equals("video/avc", str) && !android.text.TextUtils.equals("video/hevc", str) && !android.text.TextUtils.equals("video/vvc", str) && !android.text.TextUtils.equals("video/dolby-vision", str)) {
                return null;
            }
            if (f52407x98f32942 == null) {
                f52407x98f32942 = new java.util.HashMap<>();
            }
            if (f52407x98f32942.containsKey(str)) {
                return f52407x98f32942.get(str);
            }
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            if (codecInfos == null) {
                return null;
            }
            int length = codecInfos.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                android.media.MediaCodecInfo mediaCodecInfo = codecInfos[i17];
                if (!mediaCodecInfo.isEncoder()) {
                    try {
                        codecCapabilities = mediaCodecInfo.getCapabilitiesForType(str);
                    } catch (java.lang.Exception unused) {
                        codecCapabilities = null;
                    }
                    if (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                }
                i17++;
            }
            f52407x98f32942.put(str, str2);
            return str2;
        }
    }
}
