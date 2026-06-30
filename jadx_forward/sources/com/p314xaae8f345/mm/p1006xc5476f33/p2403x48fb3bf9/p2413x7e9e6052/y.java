package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f264897a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f264898b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g f264899c;

    public static void a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        int i17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f264897a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, f264897a)) ? 0 : 1;
        java.lang.String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        try {
            str4 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            if (str == null) {
                str = "";
            }
            try {
                str3 = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e17) {
                e = e17;
                str3 = "";
            }
            try {
                java.lang.String str6 = f264897a;
                if (str6 == null) {
                    str6 = "";
                }
                str5 = java.net.URLEncoder.encode(str6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SmartPickWordHelper", e, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13742, 2, str4, str5, str3, java.lang.Integer.valueOf(i17), f264898b);
            }
        } catch (java.io.UnsupportedEncodingException e19) {
            e = e19;
            str3 = "";
            str4 = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13742, 2, str4, str5, str3, java.lang.Integer.valueOf(i17), f264898b);
    }
}
