package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f128325a;

    /* renamed from: b, reason: collision with root package name */
    public int f128326b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f128327c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f128328d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaCodecInfo.CodecCapabilities f128329e;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.videobase.utils.b.a f128330f;

    /* renamed from: g, reason: collision with root package name */
    private android.media.MediaFormat f128331g;

    /* renamed from: h, reason: collision with root package name */
    private org.json.JSONArray f128332h;

    /* renamed from: com.tencent.liteav.videobase.utils.b$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128333a;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.utils.b.a.m31207xcee59d22().length];
            f128333a = iArr;
            try {
                iArr[com.tencent.liteav.videobase.utils.b.a.kQcom.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128333a[com.tencent.liteav.videobase.utils.b.a.kHisi.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128333a[com.tencent.liteav.videobase.utils.b.a.kExynos.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128333a[com.tencent.liteav.videobase.utils.b.a.kAmlogic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public enum a {
        kUnKnown,
        kQcom,
        kHisi,
        kExynos,
        kAmlogic
    }

    public b() {
        com.tencent.liteav.videobase.utils.b.a aVar = com.tencent.liteav.videobase.utils.b.a.kUnKnown;
        this.f128330f = aVar;
        com.tencent.liteav.videobase.utils.b.a b17 = b();
        if (b17 == aVar) {
            java.lang.String lowerCase = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29454x82d2235e().toLowerCase();
            if (lowerCase.contains("qcom")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kQcom;
            } else if (lowerCase.contains("kirin")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kHisi;
            } else if (lowerCase.contains("exynos")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kExynos;
            }
            b17 = aVar;
        }
        this.f128330f = b17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("HardwareDecoderMediaFormatBuilder", "hardware name:" + com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29454x82d2235e().toLowerCase() + " chip brand:" + this.f128330f);
    }

    private static com.tencent.liteav.videobase.utils.b.a b() {
        int i17;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 21) {
            return com.tencent.liteav.videobase.utils.b.a.kUnKnown;
        }
        try {
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            while (i17 < length) {
                java.lang.String lowerCase = codecInfos[i17].getName().toLowerCase();
                if (lowerCase.contains("hisi")) {
                    return com.tencent.liteav.videobase.utils.b.a.kHisi;
                }
                if (lowerCase.contains("amlogic")) {
                    return com.tencent.liteav.videobase.utils.b.a.kAmlogic;
                }
                i17 = (lowerCase.contains("qcom") || lowerCase.contains("qti")) ? 0 : i17 + 1;
                return com.tencent.liteav.videobase.utils.b.a.kQcom;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("HardwareDecoderMediaFormatBuilder", "get mediacode info error:" + th6.getMessage());
        }
        return com.tencent.liteav.videobase.utils.b.a.kUnKnown;
    }

    public final android.media.MediaFormat a() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        android.media.MediaFormat mediaFormat = this.f128331g;
        if (mediaFormat == null) {
            mediaFormat = android.media.MediaFormat.createVideoFormat(this.f128327c, this.f128325a, this.f128326b);
        }
        if (this.f128328d) {
            int m29463x2c3e92a0 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0();
            if (m29463x2c3e92a0 >= 30 && this.f128330f != com.tencent.liteav.videobase.utils.b.a.kHisi && (codecCapabilities = this.f128329e) != null && codecCapabilities.isFeatureSupported("low-latency")) {
                mediaFormat.setInteger("low-latency", 1);
            }
            if (m29463x2c3e92a0 > 23 || !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29455xeb90b647().toLowerCase().contains("xiaomi")) {
                mediaFormat.setInteger("vdec-lowlatency", 1);
            }
            if (m29463x2c3e92a0 >= 26) {
                int i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.b.AnonymousClass1.f128333a[this.f128330f.ordinal()];
                if (i17 == 1) {
                    mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
                    mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                } else if (i17 == 2) {
                    mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                    mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
                } else if (i17 == 3) {
                    mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
                } else if (i17 == 4) {
                    mediaFormat.setInteger("vendor.low-latency.enable", 1);
                }
            }
        }
        org.json.JSONArray jSONArray = this.f128332h;
        if (jSONArray != null) {
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("HardwareDecoderMediaFormatBuilder", "set MediaCodec device related params failed.", e17);
                }
            }
        }
        return mediaFormat;
    }
}
