package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReporterFactory */
/* loaded from: classes16.dex */
public class C26545x6bfcbacd {
    private static final java.lang.String TAG = "TPReporterFactory";

    /* renamed from: createReporterWithType */
    public static com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086 m103850xdf76263d(int i17) {
        if (i17 == 0) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26549x704f8eb0();
        }
        if (i17 == 1) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289();
        }
        if (i17 == 2) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26538xbf0684aa();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Type is not match ReporterType, return null");
        return null;
    }
}
