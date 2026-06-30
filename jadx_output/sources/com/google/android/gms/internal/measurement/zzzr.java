package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzzr {
    public static final byte[] zzbsq;
    private static final java.nio.ByteBuffer zzbsr;
    private static final com.google.android.gms.internal.measurement.zzze zzbss;
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
    private static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);

    static {
        byte[] bArr = new byte[0];
        zzbsq = bArr;
        zzbsr = java.nio.ByteBuffer.wrap(bArr);
        zzbss = com.google.android.gms.internal.measurement.zzze.zza(bArr, 0, bArr.length, false);
    }

    public static <T> T checkNotNull(T t17) {
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
