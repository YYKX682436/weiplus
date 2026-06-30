package com.tencent.liteav.videoproducer.encoder;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    boolean f47130a = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f47131b = true;

    /* renamed from: c, reason: collision with root package name */
    private final android.media.MediaCodec f47132c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f47133d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.encoder.VideoEncodeParams f47134e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.Boolean f47135f;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.a$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47136a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f47137b;

        static {
            int[] iArr = new int[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.values().length];
            f47137b = iArr;
            try {
                iArr[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_MAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f47137b[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_HIGH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f47137b[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_BASELINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.values().length];
            f47136a = iArr2;
            try {
                iArr2[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CBR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f47136a[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.VBR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f47136a[com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.BitrateMode.CQ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public a(android.media.MediaCodec mediaCodec, java.lang.String str, com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams, java.lang.Boolean bool) {
        this.f47132c = mediaCodec;
        this.f47133d = str;
        this.f47134e = videoEncodeParams;
        this.f47135f = bool;
    }

    private boolean a(int i17, android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        java.lang.Boolean bool;
        if (i17 == 2 && (bool = this.f47135f) != null) {
            return bool.booleanValue();
        }
        return encoderCapabilities.isBitrateModeSupported(i17);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> a(android.media.MediaFormat mediaFormat) {
        int i17;
        int i18 = 0;
        try {
            i17 = mediaFormat.getInteger(com.google.android.gms.common.Scopes.PROFILE);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.i("MediaFormatBuilder", "get profile fail.", th6);
            i17 = 0;
        }
        try {
            i18 = mediaFormat.getInteger(ya.b.LEVEL);
        } catch (java.lang.Throwable th7) {
            com.tencent.liteav.base.util.LiteavLog.i("MediaFormatBuilder", "get level fail.", th7);
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    private android.media.MediaCodecInfo.VideoCapabilities a(int i17, int i18) {
        android.media.MediaCodecInfo.CodecCapabilities createFromProfileLevel;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (createFromProfileLevel = android.media.MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f47133d, i17, i18)) != null) {
            return createFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.MediaFormat a() {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.a.a():android.media.MediaFormat");
    }
}
