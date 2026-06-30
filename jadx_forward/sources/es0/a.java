package es0;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f337842a;

    public a() {
        this.f337842a = new java.lang.String[]{"OMX.oppo.h264.encoder"};
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_supported_hardcode_encoder, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0]);
        this.f337842a = strArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "supportedHardcodeEncoderList : " + Zi + "  supportedHardcodeEncoder size:" + strArr.length);
        if (strArr.length == 0) {
            es0.b.f337843a = false;
        }
    }

    public final android.media.MediaCodecInfo a(java.lang.String mimeType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        int codecCount = android.media.MediaCodecList.getCodecCount();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "numCodec:" + codecCount);
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("config to use supportedHardcodeEncoder:");
                java.lang.String[] strArr = this.f337842a;
                sb6.append(java.util.Arrays.toString(strArr));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", sb6.toString());
                for (java.lang.String str : strArr) {
                    if (r26.i0.p(codecInfoAt.getName(), str, true)) {
                        java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                        int length = supportedTypes.length;
                        for (int i18 = 0; i18 < length; i18++) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "hardcodeEncoder: " + codecInfoAt.getName() + "  type:" + supportedTypes[i18]);
                            if (r26.i0.p(supportedTypes[i18], mimeType, true)) {
                                es0.b.f337843a = true;
                                return codecInfoAt;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "selectCodec from hardcodeEncoder " + strArr + ": " + codecInfoAt.getName());
                    }
                }
            }
        }
        for (int i19 = 0; i19 < codecCount; i19++) {
            android.media.MediaCodecInfo codecInfoAt2 = android.media.MediaCodecList.getCodecInfoAt(i19);
            if (codecInfoAt2.isEncoder()) {
                java.lang.String[] supportedTypes2 = codecInfoAt2.getSupportedTypes();
                int length2 = supportedTypes2.length;
                for (int i27 = 0; i27 < length2; i27++) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "selectCodec:  " + codecCount + "  type: " + supportedTypes2[i27]);
                    if (r26.i0.p(supportedTypes2[i27], mimeType, true)) {
                        return codecInfoAt2;
                    }
                }
            }
        }
        return null;
    }
}
