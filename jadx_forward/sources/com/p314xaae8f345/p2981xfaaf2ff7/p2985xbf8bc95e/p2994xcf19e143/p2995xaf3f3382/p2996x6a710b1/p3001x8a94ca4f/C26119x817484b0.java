package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p3001x8a94ca4f;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.projection.CameraPositionUtil */
/* loaded from: classes13.dex */
public class C26119x817484b0 {
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr, double d17, double d18) {
        int i17;
        double d19 = Double.MAX_VALUE;
        double d27 = Double.MIN_VALUE;
        double d28 = Double.MIN_VALUE;
        double d29 = Double.MAX_VALUE;
        for (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26 : c4406x873d1d26Arr) {
            if (c4406x873d1d26.m37195x2605e9e2() < d19) {
                d19 = c4406x873d1d26.m37195x2605e9e2();
            }
            if (c4406x873d1d26.m37196x79d7af9() < d29) {
                d29 = c4406x873d1d26.m37196x79d7af9();
            }
            if (c4406x873d1d26.m37195x2605e9e2() > d27) {
                d27 = c4406x873d1d26.m37195x2605e9e2();
            }
            if (c4406x873d1d26.m37196x79d7af9() > d28) {
                d28 = c4406x873d1d26.m37196x79d7af9();
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i iVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a17 = iVar.a(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d19, d29));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a18 = iVar.a(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d27, d28));
        double d37 = 2.0d;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h((a17.f296930a + a18.f296930a) / 2.0d, (a17.f296931b + a18.f296931b) / 2.0d);
        int i18 = 20;
        while (true) {
            if (i18 < 0) {
                i17 = 0;
                break;
            }
            double pow = 156543.0339d / java.lang.Math.pow(d37, i18);
            double d38 = (a18.f296930a - a17.f296930a) / pow;
            double d39 = ((-a18.f296931b) + a17.f296931b) / pow;
            if (d38 <= d17 && d39 <= d18) {
                i17 = i18;
                break;
            }
            i18--;
            d37 = 2.0d;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a19 = iVar.a(hVar);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder builder = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder();
        builder.m37110xcb7e7191(a19).m37111x3923d3(i17);
        return builder.m37108x59bc66e();
    }

    /* renamed from: getCameraPosition */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e m100210xd2ef9864(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr, double d17, double d18) {
        return a(c4406x873d1d26Arr, d17, d18);
    }
}
