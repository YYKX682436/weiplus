package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzr */
/* loaded from: classes13.dex */
public final class C2404x394e78 {

    /* renamed from: zzbsq */
    public static final byte[] f7261x6f02700;

    /* renamed from: zzbsr */
    private static final java.nio.ByteBuffer f7262x6f02701;

    /* renamed from: zzbss */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2391x394e6b f7263x6f02702;

    /* renamed from: UTF_8 */
    static final java.nio.charset.Charset f7260x4d50f80 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);

    /* renamed from: ISO_8859_1 */
    private static final java.nio.charset.Charset f7259xcdcb9570 = java.nio.charset.Charset.forName(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);

    static {
        byte[] bArr = new byte[0];
        f7261x6f02700 = bArr;
        f7262x6f02701 = java.nio.ByteBuffer.wrap(bArr);
        f7263x6f02702 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2391x394e6b.zza(bArr, 0, bArr.length, false);
    }

    /* renamed from: checkNotNull */
    public static <T> T m19411x7b41bcd2(T t17) {
        t17.getClass();
        return t17;
    }

    public static int zza(int i17, byte[] bArr, int i18, int i19) {
        for (int i27 = i18; i27 < i18 + i19; i27++) {
            i17 = (i17 * 31) + bArr[i27];
        }
        return i17;
    }

    public static <T> T zza(T t17, java.lang.String str) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException(str);
    }
}
