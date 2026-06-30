package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.metrics.RecordHistogram */
/* loaded from: classes16.dex */
public class C29410x1048b7f3 {
    /* renamed from: clampToInt */
    private static int m152921xab90df79(long j17) {
        if (j17 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j17 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j17;
    }

    /* renamed from: getHistogramSamplesForTesting */
    public static java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e> m152922xfa151ce2(java.lang.String str) {
        return org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152890xfa151ce2(str);
    }

    @java.lang.Deprecated
    /* renamed from: getHistogramTotalCountForTesting */
    public static int m152923x4ed4f60(java.lang.String str) {
        return org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152891x4ed4f60(str);
    }

    @java.lang.Deprecated
    /* renamed from: getHistogramValueCountForTesting */
    public static int m152924x9298d993(java.lang.String str, int i17) {
        return org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152892x9298d993(str, i17);
    }

    /* renamed from: recordBooleanHistogram */
    public static void m152925xa16fd08d(java.lang.String str, boolean z17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152893xa16fd08d(str, z17);
    }

    /* renamed from: recordCount100000Histogram */
    public static void m152926x3c9e1687(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1, 100000, 50);
    }

    /* renamed from: recordCount1000Histogram */
    public static void m152927x9e835147(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1, 1000, 50);
    }

    /* renamed from: recordCount100Histogram */
    public static void m152928xf69c94b1(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1, 100, 50);
    }

    /* renamed from: recordCount1MHistogram */
    public static void m152929xb64a0c8a(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1, 1000000, 50);
    }

    /* renamed from: recordCustomCountHistogram */
    public static void m152930x8c82dcd7(java.lang.String str, int i17, int i18, int i19, int i27) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, i18, i19, i27);
    }

    /* renamed from: recordCustomTimesHistogram */
    public static void m152931x874a3480(java.lang.String str, long j17, long j18, long j19, int i17) {
        m152932xd5fec2b2(str, j17, j18, j19, i17);
    }

    /* renamed from: recordCustomTimesHistogramMilliseconds */
    private static void m152932xd5fec2b2(java.lang.String str, long j17, long j18, long j19, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, m152921xab90df79(j17), m152921xab90df79(j18), m152921xab90df79(j19), i17);
    }

    /* renamed from: recordEnumeratedHistogram */
    public static void m152933x22a24ab3(java.lang.String str, int i17, int i18) {
        m152934xeeb48b1(str, i17, i18);
    }

    /* renamed from: recordExactLinearHistogram */
    public static void m152934xeeb48b1(java.lang.String str, int i17, int i18) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152895xb3dbcb2e(str, i17, 1, i18, i18 + 1);
    }

    /* renamed from: recordLinearCountHistogram */
    public static void m152935xe7b8558b(java.lang.String str, int i17, int i18, int i19, int i27) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152895xb3dbcb2e(str, i17, i18, i19, i27);
    }

    /* renamed from: recordLongTimesHistogram */
    public static void m152936x707d888b(java.lang.String str, long j17) {
        m152932xd5fec2b2(str, j17, 1L, 3600000L, 50);
    }

    /* renamed from: recordLongTimesHistogram100 */
    public static void m152937xa0756586(java.lang.String str, long j17) {
        m152932xd5fec2b2(str, j17, 1L, 3600000L, 100);
    }

    /* renamed from: recordMediumTimesHistogram */
    public static void m152938x688e184(java.lang.String str, long j17) {
        m152932xd5fec2b2(str, j17, 10L, 180000L, 50);
    }

    /* renamed from: recordMemoryKBHistogram */
    public static void m152939x8ec851db(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1000, 500000, 50);
    }

    /* renamed from: recordMemoryMediumMBHistogram */
    public static void m152940x4661da28(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152894x3de52390(str, i17, 1, 4000, 100);
    }

    /* renamed from: recordPercentageHistogram */
    public static void m152941x6492bd9(java.lang.String str, int i17) {
        m152934xeeb48b1(str, i17, 101);
    }

    /* renamed from: recordSparseHistogram */
    public static void m152942xada41a93(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29417x9a369913.get().mo152896xada41a93(str, i17);
    }

    /* renamed from: recordTimesHistogram */
    public static void m152943x65abbf6f(java.lang.String str, long j17) {
        m152932xd5fec2b2(str, j17, 1L, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, 50);
    }
}
