package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.TimeUtil */
/* loaded from: classes13.dex */
public class C25746x8808ec8f {

    /* renamed from: DEVIATION */
    private static final long f47895xa7838461 = 10000;

    /* renamed from: SECOND_TO_US */
    public static final long f47896xab388357 = 1000000;

    /* renamed from: YYYY2MM2DD_HH1MM1SS */
    public static final java.lang.String f47897xee1ddd9f = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: equals */
    public static boolean m97294xb2c87fbf(long j17, long j18) {
        return java.lang.Math.abs(j17 - j18) < 10000;
    }

    /* renamed from: getAudioDuration */
    public static long m97295xd375d3d4(long j17, int i17, int i18) {
        return (j17 * 1000000) / ((i17 * 2) * i18);
    }

    /* renamed from: long2str */
    public static java.lang.String m97296x844ba13b(long j17, java.lang.String str) {
        if (str == null) {
            str = "yyyy-M-d  HH:mm";
        }
        return new java.text.SimpleDateFormat(str, java.util.Locale.getDefault()).format(new java.util.Date(j17));
    }

    /* renamed from: milli2Second */
    public static float m97297x77fe72d9(long j17) {
        return (((float) j17) * 1.0f) / 1000.0f;
    }

    /* renamed from: milli2Us */
    public static long m97298xabbc3783(long j17) {
        return j17 * 1000;
    }

    /* renamed from: milliToSecond */
    public static java.lang.String m97299xfe45ddbc(long j17) {
        return java.lang.String.format(java.util.Locale.CHINA, "%1$.1f", java.lang.Float.valueOf(java.lang.Math.round(m97297x77fe72d9(j17) * 10.0f) / 10.0f));
    }

    /* renamed from: second2Ms */
    public static long m97300xcf43bc84(float f17) {
        return f17 * 1000.0f;
    }

    /* renamed from: second2String */
    public static java.lang.String m97301xe0ca6fef(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = i17 / 60;
        if (i18 > 0) {
            sb6.append(i18 + "'");
        }
        int i19 = i17 % 60;
        if (i19 >= 10) {
            sb6.append(i19 + "\"");
        } else if (i19 >= 0) {
            sb6.append("0" + i19 + "\"");
        }
        return sb6.toString();
    }

    /* renamed from: second2Us */
    public static long m97302xcf43bd7c(float f17) {
        return f17 * 1000000.0f;
    }

    /* renamed from: us2CMTime */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97303x391f00ab(long j17) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(m97305x55c5a6e8(j17) * 600.0f);
    }

    /* renamed from: us2Milli */
    public static long m97304x9716ded9(long j17) {
        return j17 / 1000;
    }

    /* renamed from: us2Second */
    public static float m97305x55c5a6e8(long j17) {
        return (((float) j17) * 1.0f) / 1000000.0f;
    }

    /* renamed from: usToSecond */
    public static java.lang.String m97306xd9652b8d(long j17) {
        return java.lang.String.format(java.util.Locale.CHINA, "%1$.1f", java.lang.Float.valueOf(java.lang.Math.round(m97305x55c5a6e8(j17) * 10.0f) / 10.0f));
    }
}
