package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes */
/* loaded from: classes15.dex */
public class C26315x77280f9a {

    /* renamed from: TP_NATIVE_CONTENT_MOVIE */
    public static final int f52228x1c225b65 = 3;

    /* renamed from: TP_NATIVE_CONTENT_MUSIC */
    public static final int f52229x1c250a5a = 2;

    /* renamed from: TP_NATIVE_CONTENT_SONIFICATION */
    public static final int f52230xdfde5717 = 4;

    /* renamed from: TP_NATIVE_CONTENT_SPEECH */
    public static final int f52231x726c732d = 1;

    /* renamed from: TP_NATIVE_CONTENT_UNKNOWN */
    public static final int f52232x41dd8b3f = 0;

    /* renamed from: TP_NATIVE_FLAG_AUDIBILITY_ENFORCED */
    public static final int f52233x4130e1f1 = 1;

    /* renamed from: TP_NATIVE_FLAG_HW_AV_SYNC */
    public static final int f52234x383ee4e3 = 16;

    /* renamed from: TP_NATIVE_FLAG_LOW_LATENCY */
    public static final int f52235xc6fa10e5 = 256;

    /* renamed from: TP_NATIVE_FLAG_PUBLIC */
    private static final int f52236xbea9c517 = 273;

    /* renamed from: TP_NATIVE_FLAG_UNKNOWN */
    public static final int f52237x139bef3c = 0;

    /* renamed from: TP_NATIVE_STREAM_ALARM */
    public static final int f52238x77fdcd97 = 4;

    /* renamed from: TP_NATIVE_STREAM_DTMF */
    public static final int f52239xc1cfde03 = 8;

    /* renamed from: TP_NATIVE_STREAM_MUSIC */
    public static final int f52240x78ab416b = 3;

    /* renamed from: TP_NATIVE_STREAM_NOTIFICATION */
    public static final int f52241x5a70a6c5 = 5;

    /* renamed from: TP_NATIVE_STREAM_RING */
    public static final int f52242xc1d6120a = 2;

    /* renamed from: TP_NATIVE_STREAM_SYSTEM */
    public static final int f52243xa7328789 = 1;

    /* renamed from: TP_NATIVE_STREAM_UNKNOWN */
    public static final int f52244x95b24210 = -1;

    /* renamed from: TP_NATIVE_STREAM_VOICE_CALL */
    public static final int f52245xb55901c5 = 0;

    /* renamed from: TP_NATIVE_USAGE_ALARM */
    public static final int f52246xdf33906e = 4;

    /* renamed from: TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY */
    public static final int f52247x3795c30a = 11;

    /* renamed from: TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE */
    public static final int f52248x372ec1ff = 12;

    /* renamed from: TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION */
    public static final int f52249xc3fa6fb0 = 13;

    /* renamed from: TP_NATIVE_USAGE_ASSISTANT */
    public static final int f52250x81722a7b = 16;

    /* renamed from: TP_NATIVE_USAGE_GAME */
    public static final int f52251x1ffbfa15 = 14;

    /* renamed from: TP_NATIVE_USAGE_MEDIA */
    public static final int f52252xdfd98601 = 1;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION */
    public static final int f52253x3fb9540e = 5;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED */
    public static final int f52254x30356c48 = 9;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT */
    public static final int f52255x487b20c7 = 8;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST */
    public static final int f52256x151bed75 = 7;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION_EVENT */
    public static final int f52257xe7126f09 = 10;

    /* renamed from: TP_NATIVE_USAGE_NOTIFICATION_RINGTONE */
    public static final int f52258xbfdfb8b3 = 6;

    /* renamed from: TP_NATIVE_USAGE_UNKNOWN */
    public static final int f52259x682ab27 = 0;

    /* renamed from: TP_NATIVE_USAGE_VOICE_COMMUNICATION */
    public static final int f52260xcaed3ac6 = 2;

    /* renamed from: TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING */
    public static final int f52261x5ed939b7 = 3;

    /* renamed from: mMapContentTypeToString */
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> f52262x8bba00b0;

    /* renamed from: mMapUsageToString */
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> f52263x81d1edbe;

    /* renamed from: mContentType */
    private int f52264x92db64a6;

    /* renamed from: mFlags */
    private int f52265xbe0d3a1a;

    /* renamed from: mUsage */
    private int f52266xbee3c934;

    /* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {

        /* renamed from: mMapStreamTypeToContentType */
        private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> f52267x5598da6f;

        /* renamed from: mMapStreamTypeToUsage */
        private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> f52268x633b89bd;

        /* renamed from: mUsage */
        private int f52271xbee3c934 = 0;

        /* renamed from: mContentType */
        private int f52269x92db64a6 = 0;

        /* renamed from: mFlags */
        private int f52270xbe0d3a1a = 0;

        static {
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = new java.util.HashMap<>();
            f52267x5598da6f = hashMap;
            hashMap.put(-1, 0);
            hashMap.put(0, 1);
            hashMap.put(1, 4);
            hashMap.put(2, 4);
            hashMap.put(3, 2);
            hashMap.put(4, 4);
            hashMap.put(5, 4);
            hashMap.put(8, 4);
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap2 = new java.util.HashMap<>();
            f52268x633b89bd = hashMap2;
            hashMap2.put(-1, 0);
            hashMap2.put(0, 2);
            hashMap2.put(1, 13);
            hashMap2.put(2, 6);
            hashMap2.put(3, 1);
            hashMap2.put(4, 4);
            hashMap2.put(5, 5);
            hashMap2.put(8, 3);
        }

        /* renamed from: addFlags */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder m101867xb4f2c266(int i17) {
            this.f52270xbe0d3a1a = (i17 & 273) | this.f52270xbe0d3a1a;
            return this;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a m101868x59bc66e() {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a c26315x77280f9a = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a();
            c26315x77280f9a.f52264x92db64a6 = this.f52269x92db64a6;
            c26315x77280f9a.f52266xbee3c934 = this.f52271xbee3c934;
            c26315x77280f9a.f52265xbe0d3a1a = this.f52270xbe0d3a1a;
            return c26315x77280f9a;
        }

        /* renamed from: setContentType */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder m101869x590a0d91(@com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeContentType int i17) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.f52262x8bba00b0.containsKey(java.lang.Integer.valueOf(i17))) {
                this.f52269x92db64a6 = i17;
            } else {
                this.f52269x92db64a6 = 0;
            }
            return this;
        }

        /* renamed from: setFlags */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder m101870x52fbaf45(int i17) {
            this.f52270xbe0d3a1a = i17 & 273;
            return this;
        }

        /* renamed from: setLegacyStreamType */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder m101871xb237f805(@com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeStreamType int i17) {
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = f52267x5598da6f;
            if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                this.f52269x92db64a6 = hashMap.get(java.lang.Integer.valueOf(i17)).intValue();
            } else {
                this.f52269x92db64a6 = 0;
            }
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap2 = f52268x633b89bd;
            if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
                this.f52271xbee3c934 = hashMap2.get(java.lang.Integer.valueOf(i17)).intValue();
            } else {
                this.f52271xbee3c934 = 0;
            }
            return this;
        }

        /* renamed from: setUsage */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder m101872x53d23e5f(@com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeUsage int i17) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.f52263x81d1edbe.containsKey(java.lang.Integer.valueOf(i17))) {
                this.f52271xbee3c934 = i17;
            } else {
                this.f52271xbee3c934 = 0;
            }
            return this;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes$TPNativeAudioAttributeContentType */
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeContentType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes$TPNativeAudioAttributeFlag */
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeFlag {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes$TPNativeAudioAttributeStreamType */
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeStreamType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.core.common.TPNativeAudioAttributes$TPNativeAudioAttributeUsage */
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeUsage {
    }

    static {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        f52262x8bba00b0 = hashMap;
        hashMap.put(0, "TP_NATIVE_CONTENT_UNKNOWN");
        hashMap.put(1, "TP_NATIVE_CONTENT_SPEECH");
        hashMap.put(2, "TP_NATIVE_CONTENT_MUSIC");
        hashMap.put(3, "TP_NATIVE_CONTENT_MOVIE");
        hashMap.put(4, "TP_NATIVE_CONTENT_SONIFICATION");
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap2 = new java.util.HashMap<>();
        f52263x81d1edbe = hashMap2;
        hashMap2.put(0, "TP_NATIVE_USAGE_UNKNOWN");
        hashMap2.put(1, "TP_NATIVE_USAGE_MEDIA");
        hashMap2.put(2, "TP_NATIVE_USAGE_VOICE_COMMUNICATION");
        hashMap2.put(3, "TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING");
        hashMap2.put(4, "TP_NATIVE_USAGE_ALARM");
        hashMap2.put(5, "TP_NATIVE_USAGE_NOTIFICATION");
        hashMap2.put(6, "TP_NATIVE_USAGE_NOTIFICATION_RINGTONE");
        hashMap2.put(7, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
        hashMap2.put(8, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
        hashMap2.put(9, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
        hashMap2.put(10, "TP_NATIVE_USAGE_NOTIFICATION_EVENT");
        hashMap2.put(11, "TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY");
        hashMap2.put(12, "TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
        hashMap2.put(13, "TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION");
        hashMap2.put(14, "TP_NATIVE_USAGE_GAME");
        hashMap2.put(16, "TP_NATIVE_USAGE_ASSISTANT");
    }

    /* renamed from: contentTypeToString */
    public static java.lang.String m101860x16ec06df(@com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeContentType int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = f52262x8bba00b0;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown content type" + i17;
    }

    /* renamed from: usageToString */
    public static java.lang.String m101861x43d4032d(@com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeUsage int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = f52263x81d1edbe;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown usage " + i17;
    }

    @com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeContentType
    /* renamed from: getContentType */
    public int m101862xc2a49a1d() {
        return this.f52264x92db64a6;
    }

    /* renamed from: getFlags */
    public int m101863x746d94d1() {
        return this.f52265xbe0d3a1a & 273;
    }

    @com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.TPNativeAudioAttributeUsage
    /* renamed from: getUsage */
    public int m101864x754423eb() {
        return this.f52266xbee3c934;
    }

    /* renamed from: toString */
    public java.lang.String m101865x9616526c() {
        return "AudioAttributes: usage=" + m101861x43d4032d(this.f52266xbee3c934) + " content=" + m101860x16ec06df(this.f52264x92db64a6) + " flags=0x" + java.lang.Integer.toHexString(this.f52265xbe0d3a1a).toUpperCase();
    }

    private C26315x77280f9a() {
        this.f52266xbee3c934 = 0;
        this.f52264x92db64a6 = 0;
        this.f52265xbe0d3a1a = 0;
    }
}
