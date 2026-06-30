package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class VocalEnhancementProcessor {
    public static float[] a(java.util.List list) {
        return nativeCalcVocalAdjustmentGains(list);
    }

    public static com.tencent.maas.moviecomposing.VocalAdjustmentParams b(java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.VocalEnhancementParams vocalEnhancementParams) {
        return nativeProcess(str, str2, vocalEnhancementParams);
    }

    private static native float[] nativeCalcVocalAdjustmentGains(java.util.List<com.tencent.maas.moviecomposing.VocalAdjustmentParams> list);

    private static native com.tencent.maas.moviecomposing.VocalAdjustmentParams nativeProcess(java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.VocalEnhancementParams vocalEnhancementParams);
}
