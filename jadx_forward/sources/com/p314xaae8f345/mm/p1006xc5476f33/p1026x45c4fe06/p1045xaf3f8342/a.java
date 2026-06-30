package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f159051a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj);

    public static java.lang.String a(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.HttpSetting httpSetting;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a c11807xf443363a = c3899xf952a052.Y;
        java.lang.String str = (c11807xf443363a == null || (httpSetting = c11807xf443363a.f158754s) == null) ? "" : httpSetting.f158791n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = f159051a;
        }
        return "https://" + str + "/" + c3899xf952a052.f387375e + "/" + c3899xf952a052.f387385r.f33456x1c82a56c + "/page-frame.html";
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h b(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6 = c3897xbc286aa1.R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h();
        long j17 = b17.f158742g;
        hVar.f162598e = j17;
        if (j17 <= 0) {
            hVar.f162598e = 300L;
        }
        long j18 = c11825xb74ac8c6.f158954s;
        hVar.f162597d = j18;
        if (j18 <= 0) {
            hVar.f162597d = 10L;
        }
        long j19 = c11825xb74ac8c6.f158955t;
        hVar.f162599f = j19;
        if (j19 <= 0) {
            hVar.f162599f = 300L;
        }
        long j27 = c11825xb74ac8c6.f158956u;
        hVar.f162600g = j27;
        if (j27 <= 0) {
            hVar.f162600g = 100L;
        }
        long j28 = b17.P;
        hVar.f162601h = j28;
        if (j28 <= 0) {
            hVar.f162601h = 30L;
        }
        long j29 = c11825xb74ac8c6.N;
        hVar.f162602i = j29;
        if (j29 <= 0) {
            hVar.f162602i = 200L;
        }
        return hVar;
    }

    public static boolean c(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052) {
        boolean z17 = c3899xf952a052.f387385r.f156932d == 1 || c3899xf952a052.f387385r.f156932d == 2;
        return c3899xf952a052.f128833z ? (z17 && c3899xf952a052.f128832y) ? false : true : (z17 && c3899xf952a052.f128829w) ? false : true;
    }
}
