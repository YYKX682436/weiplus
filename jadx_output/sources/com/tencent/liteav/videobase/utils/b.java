package com.tencent.liteav.videobase.utils;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f46792a;

    /* renamed from: b, reason: collision with root package name */
    public int f46793b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f46794c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46795d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaCodecInfo.CodecCapabilities f46796e;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.videobase.utils.b.a f46797f;

    /* renamed from: g, reason: collision with root package name */
    private android.media.MediaFormat f46798g;

    /* renamed from: h, reason: collision with root package name */
    private org.json.JSONArray f46799h;

    /* renamed from: com.tencent.liteav.videobase.utils.b$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46800a;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.utils.b.a.values().length];
            f46800a = iArr;
            try {
                iArr[com.tencent.liteav.videobase.utils.b.a.kQcom.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46800a[com.tencent.liteav.videobase.utils.b.a.kHisi.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46800a[com.tencent.liteav.videobase.utils.b.a.kExynos.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46800a[com.tencent.liteav.videobase.utils.b.a.kAmlogic.ordinal()] = 4;
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
        this.f46797f = aVar;
        com.tencent.liteav.videobase.utils.b.a b17 = b();
        if (b17 == aVar) {
            java.lang.String lowerCase = com.tencent.liteav.base.system.LiteavSystemInfo.getHardware().toLowerCase();
            if (lowerCase.contains("qcom")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kQcom;
            } else if (lowerCase.contains("kirin")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kHisi;
            } else if (lowerCase.contains("exynos")) {
                aVar = com.tencent.liteav.videobase.utils.b.a.kExynos;
            }
            b17 = aVar;
        }
        this.f46797f = b17;
        com.tencent.liteav.base.util.LiteavLog.i("HardwareDecoderMediaFormatBuilder", "hardware name:" + com.tencent.liteav.base.system.LiteavSystemInfo.getHardware().toLowerCase() + " chip brand:" + this.f46797f);
    }

    private static com.tencent.liteav.videobase.utils.b.a b() {
        int i17;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 21) {
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
            com.tencent.liteav.base.util.LiteavLog.e("HardwareDecoderMediaFormatBuilder", "get mediacode info error:" + th6.getMessage());
        }
        return com.tencent.liteav.videobase.utils.b.a.kUnKnown;
    }

    public final android.media.MediaFormat a() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        android.media.MediaFormat mediaFormat = this.f46798g;
        if (mediaFormat == null) {
            mediaFormat = android.media.MediaFormat.createVideoFormat(this.f46794c, this.f46792a, this.f46793b);
        }
        if (this.f46795d) {
            int systemOSVersionInt = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt();
            if (systemOSVersionInt >= 30 && this.f46797f != com.tencent.liteav.videobase.utils.b.a.kHisi && (codecCapabilities = this.f46796e) != null && codecCapabilities.isFeatureSupported("low-latency")) {
                mediaFormat.setInteger("low-latency", 1);
            }
            if (systemOSVersionInt > 23 || !com.tencent.liteav.base.system.LiteavSystemInfo.getManufacturer().toLowerCase().contains("xiaomi")) {
                mediaFormat.setInteger("vdec-lowlatency", 1);
            }
            if (systemOSVersionInt >= 26) {
                int i17 = com.tencent.liteav.videobase.utils.b.AnonymousClass1.f46800a[this.f46797f.ordinal()];
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
        org.json.JSONArray jSONArray = this.f46799h;
        if (jSONArray != null) {
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                } catch (org.json.JSONException e17) {
                    com.tencent.liteav.base.util.LiteavLog.e("HardwareDecoderMediaFormatBuilder", "set MediaCodec device related params failed.", e17);
                }
            }
        }
        return mediaFormat;
    }
}
