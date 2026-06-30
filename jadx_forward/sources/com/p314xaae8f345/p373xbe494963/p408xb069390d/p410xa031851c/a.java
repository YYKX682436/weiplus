package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    boolean f128663a = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f128664b = true;

    /* renamed from: c, reason: collision with root package name */
    private final android.media.MediaCodec f128665c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f128666d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 f128667e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.Boolean f128668f;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.a$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128669a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f128670b;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile.m31497xcee59d22().length];
            f128670b = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile.PROFILE_MAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128670b[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile.PROFILE_HIGH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128670b[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.EncoderProfile.PROFILE_BASELINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.m31484xcee59d22().length];
            f128669a = iArr2;
            try {
                iArr2[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.CBR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f128669a[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.VBR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f128669a[com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.BitrateMode.CQ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public a(android.media.MediaCodec mediaCodec, java.lang.String str, com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337, java.lang.Boolean bool) {
        this.f128665c = mediaCodec;
        this.f128666d = str;
        this.f128667e = c3846xefe8337;
        this.f128668f = bool;
    }

    private boolean a(int i17, android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        java.lang.Boolean bool;
        if (i17 == 2 && (bool = this.f128668f) != null) {
            return bool.booleanValue();
        }
        return encoderCapabilities.isBitrateModeSupported(i17);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> a(android.media.MediaFormat mediaFormat) {
        int i17;
        int i18 = 0;
        try {
            i17 = mediaFormat.getInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("MediaFormatBuilder", "get profile fail.", th6);
            i17 = 0;
        }
        try {
            i18 = mediaFormat.getInteger(ya.b.f77487x44fa364);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("MediaFormatBuilder", "get level fail.", th7);
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    private android.media.MediaCodecInfo.VideoCapabilities a(int i17, int i18) {
        android.media.MediaCodecInfo.CodecCapabilities createFromProfileLevel;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 && (createFromProfileLevel = android.media.MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f128666d, i17, i18)) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.a.a():android.media.MediaFormat");
    }
}
