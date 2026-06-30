package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public abstract class h7 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a {
    public static void c(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.util.LinkedList linkedList) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = mVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = c11286x34a5504;
        java.lang.String str3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            java.lang.String str5 = mVar2.f67370x28d45f97;
            java.lang.String str6 = mVar2.f67372x453d1e07;
            boolean k17 = mVar.k();
            int m48467xfb85f7b0 = c11286x34a5504.m48467xfb85f7b0();
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str4);
            try {
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a.b(c11286x34a5504);
                if (b17 == null) {
                    b17 = "";
                }
                java.lang.String b18 = fp.s0.b(b17, str3);
                java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a.a(c11286x34a5504);
                if (a17 == null) {
                    a17 = "";
                }
                java.lang.String b19 = fp.s0.b(a17, str3);
                java.lang.String str7 = c11286x34a55042.f33130x6942258;
                if (str7 == null) {
                    str7 = "";
                }
                java.lang.String b27 = fp.s0.b(str7, str3);
                java.lang.String str8 = c11286x34a55042.f33121x993583fc;
                if (str8 == null) {
                    str8 = "";
                }
                java.lang.String b28 = fp.s0.b(str8, str3);
                str = str3;
                if (c11286x34a5504.m48467xfb85f7b0() == 1) {
                    try {
                        str2 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) c11286x34a55042.f33122xe4128443).f33229x36452d;
                    } catch (java.io.UnsupportedEncodingException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                        mVar2 = mVar;
                        c11286x34a55042 = c11286x34a5504;
                        str3 = str;
                    }
                } else {
                    str2 = b28;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareReport", i17 + "," + str5 + "," + str6 + "," + (k17 ? 1 : 0) + "," + m48467xfb85f7b0 + "," + (R4 ? 1 : 0) + ",1," + str4 + "," + b27 + "," + str2 + "," + b18 + ",,,," + b19);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16492, java.lang.Integer.valueOf(i17), str5, str6, java.lang.Integer.valueOf(k17 ? 1 : 0), java.lang.Integer.valueOf(m48467xfb85f7b0), java.lang.Integer.valueOf(R4 ? 1 : 0), 1, str4, b27, str2, b18, "", "", "", b19);
            } catch (java.io.UnsupportedEncodingException unused2) {
                str = str3;
            }
            mVar2 = mVar;
            c11286x34a55042 = c11286x34a5504;
            str3 = str;
        }
    }
}
