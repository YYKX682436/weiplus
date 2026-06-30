package io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4;

/* renamed from: io.clipworks.androidplus.media.MediaCodecUtil */
/* loaded from: classes10.dex */
public class C28520xe0dc95d4 {

    /* renamed from: SDK_INT */
    private static final int f70368x9efbee2a;
    private static final java.lang.String TAG = "MediaCodecUtil";

    static {
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        f70368x9efbee2a = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a.equals(str) ? 31 : "R".equals(str) ? 30 : android.os.Build.VERSION.SDK_INT;
    }

    private C28520xe0dc95d4() {
    }

    /* renamed from: getCodecInfos */
    private static synchronized java.util.List<android.media.MediaCodecInfo> m136839xd0468705(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.util.ArrayList arrayList;
        synchronized (io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28520xe0dc95d4.class) {
            android.media.MediaCodecList mediaCodecList = new android.media.MediaCodecList(1);
            arrayList = new java.util.ArrayList();
            for (android.media.MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo.isEncoder() == z17) {
                    try {
                        mediaCodecInfo.getCapabilitiesForType(str);
                        if (m136843xca6d2895(mediaCodecInfo) == z18 && m136845xfecef355(mediaCodecInfo) == z19) {
                            arrayList.add(mediaCodecInfo);
                            mediaCodecInfo.getName();
                        }
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: getDecoderInfo */
    public static android.media.MediaCodecInfo m136840x21f109dc(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> m136841x1c303217 = m136841x1c303217(str, z17, z18);
        if (m136841x1c303217.isEmpty()) {
            return null;
        }
        return m136841x1c303217.get(0);
    }

    /* renamed from: getDecoderInfos */
    public static synchronized java.util.List<android.media.MediaCodecInfo> m136841x1c303217(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> m136839xd0468705;
        synchronized (io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28520xe0dc95d4.class) {
            m136839xd0468705 = m136839xd0468705(str, false, z17, z18);
        }
        return m136839xd0468705;
    }

    /* renamed from: getEncoderInfos */
    public static synchronized java.util.List<android.media.MediaCodecInfo> m136842x5fec203f(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> m136839xd0468705;
        synchronized (io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28520xe0dc95d4.class) {
            m136839xd0468705 = m136839xd0468705(str, true, z17, z18);
        }
        return m136839xd0468705;
    }

    /* renamed from: isHardwareAccelerated */
    private static boolean m136843xca6d2895(android.media.MediaCodecInfo mediaCodecInfo) {
        return f70368x9efbee2a >= 29 ? m136844x94e6dc68(mediaCodecInfo) : !m136846x7800bc3d(mediaCodecInfo);
    }

    /* renamed from: isHardwareAcceleratedV29 */
    private static boolean m136844x94e6dc68(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: isSecureCodec */
    private static boolean m136845xfecef355(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.getName().endsWith(".secure");
    }

    /* renamed from: isSoftwareOnly */
    private static boolean m136846x7800bc3d(android.media.MediaCodecInfo mediaCodecInfo) {
        if (f70368x9efbee2a >= 29) {
            return m136847xdd92c7c0(mediaCodecInfo);
        }
        java.lang.String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    /* renamed from: isSoftwareOnlyV29 */
    private static boolean m136847xdd92c7c0(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: isVendor */
    private static boolean m136848xf74b9712(android.media.MediaCodecInfo mediaCodecInfo) {
        if (f70368x9efbee2a >= 29) {
            return m136849x58280cb(mediaCodecInfo);
        }
        java.lang.String lowerCase = mediaCodecInfo.getName().toLowerCase();
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: isVendorV29 */
    private static boolean m136849x58280cb(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* renamed from: selectProfileAndLevel */
    public static void m136850x539b601a(android.media.MediaFormat mediaFormat, boolean z17) {
        android.media.MediaCodecInfo mediaCodecInfo;
        int i17;
        int i18;
        int i19 = 0;
        java.util.List<android.media.MediaCodecInfo> m136842x5fec203f = m136842x5fec203f("video/avc", true, false);
        if (m136842x5fec203f.isEmpty() || (mediaCodecInfo = m136842x5fec203f.get(0)) == null) {
            return;
        }
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        int i27 = -1;
        if (capabilitiesForType.profileLevels != null) {
            i17 = -1;
            while (true) {
                android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                if (i19 >= codecProfileLevelArr.length) {
                    break;
                }
                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i19];
                int i28 = codecProfileLevel.profile;
                if (i28 <= 8) {
                    if (i28 > i27) {
                        i17 = codecProfileLevel.level;
                        i27 = i28;
                    } else if (i28 == i27 && (i18 = codecProfileLevel.level) > i17) {
                        i17 = i18;
                    }
                }
                i19++;
            }
        } else {
            i17 = -1;
        }
        if (i27 == 8) {
            if (z17 && i17 >= 65536) {
                i17 = 65536;
            }
            mediaFormat.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i27);
            mediaFormat.setInteger(ya.b.f77487x44fa364, i17);
            java.lang.String.format("selectProfileAndLevel: 0x%x, 0x%x", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17));
        }
    }
}
