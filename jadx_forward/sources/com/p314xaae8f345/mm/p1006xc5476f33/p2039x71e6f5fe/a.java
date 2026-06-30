package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a f240190a = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f240191b;

    public final java.lang.String a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQRCodeScanReport", "URLEncode fail, throw : %s", e17.getMessage());
            }
        }
        return str;
    }

    public final void b(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, int i18, java.lang.String str4, boolean z18, boolean z19, java.lang.String str5) {
        if (!z19) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - f240191b < 1000) {
                return;
            } else {
                f240191b = currentTimeMillis;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22688, str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(z17 ? 1 : 0), a(str3), a(str5), java.lang.Integer.valueOf(z19 ? 1 : 0), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(i18, str4) ? 1 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(i18, str4) ? 2 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(i18, str4) ? 3 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.j(i18, str4) ? 4 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(i18, str4) ? 5 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.i(i18, str4, true) ? 6 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(i18, str4) ? 7 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.g(i18, str4) ? 8 : 0), a(str4));
    }
}
