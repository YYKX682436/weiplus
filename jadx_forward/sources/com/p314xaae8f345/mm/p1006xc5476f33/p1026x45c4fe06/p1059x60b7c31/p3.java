package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public abstract class p3 {
    public static final int a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xf.b(str);
        if (b17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, durationS: " + b17);
            return Integer.MIN_VALUE;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xf.a(str, str2);
        if (a17 == null || a17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, thumbPath is empty");
            return Integer.MIN_VALUE;
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.h(c5303xc75d2f73, 6, str, a17, b17, "", "", true);
        c5303xc75d2f73.e();
        int i17 = c5303xc75d2f73.f135624h.f87966a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, ret: " + i17);
        return i17;
    }
}
