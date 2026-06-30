package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f f257122a = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f();

    public final android.util.Size a(android.util.Size size, int i17) {
        int width = size.getWidth();
        if (width % i17 != 0) {
            while (width % i17 != 0) {
                width++;
            }
        }
        int height = size.getHeight();
        if (height % i17 != 0) {
            while (height % i17 != 0) {
                height++;
            }
        }
        return new android.util.Size(width, height);
    }

    public final android.util.Size b(android.util.Size size, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "alignByCodeC param: outputHevc: " + z17 + " targetSize: " + size);
        java.lang.String str = z17 ? "video/hevc" : "video/avc";
        android.util.Size a17 = a(size, 16);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "align Codec set default align 16: " + a17);
        jz5.l c17 = c(str, true);
        int intValue = ((java.lang.Number) c17.f384366d).intValue();
        int intValue2 = ((java.lang.Number) c17.f384367e).intValue();
        if (intValue2 != -1 && intValue != -1) {
            int width = size.getWidth();
            if (width % intValue != 0) {
                while (width % intValue != 0) {
                    width++;
                }
            }
            int height = size.getHeight();
            if (height % intValue2 != 0) {
                while (height % intValue2 != 0) {
                    height++;
                }
            }
            a17 = new android.util.Size(width, height);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "align Codec pick size: " + a17 + " widthAlignment:" + intValue + ", heightAlignment:" + intValue2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "alignByCodeC result:" + a17 + " cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return a17;
    }

    public final jz5.l c(java.lang.String mimeType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(codecInfos);
        int i17 = -1;
        int i18 = -1;
        for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedTypes, "getSupportedTypes(...)");
                for (java.lang.String str : supportedTypes) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mimeType)) {
                        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "align Codec: " + mediaCodecInfo.getName() + ", mimeType:" + mimeType + ", widthAlignment:" + widthAlignment + ", heightAlignment:" + heightAlignment);
                        }
                        i17 = java.lang.Math.max(i17, widthAlignment);
                        i18 = java.lang.Math.max(i18, heightAlignment);
                    }
                }
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final java.lang.String d(java.lang.String mimeType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        jz5.l c17 = c(mimeType, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((java.lang.Number) c17.f384366d).intValue());
        sb6.append('x');
        sb6.append(((java.lang.Number) c17.f384367e).intValue());
        return sb6.toString();
    }
}
