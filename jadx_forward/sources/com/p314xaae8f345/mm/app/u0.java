package com.p314xaae8f345.mm.app;

/* loaded from: classes4.dex */
public abstract class u0 {
    public static void a(com.p314xaae8f345.mm.app.t0 t0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(t0Var.f135311a);
        sb6.append(',');
        java.lang.String str = t0Var.f135312b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        java.lang.String str2 = t0Var.f135313c;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(t0Var.f135314d);
        sb6.append(',');
        sb6.append(t0Var.f135315e);
        sb6.append(',');
        java.lang.String str3 = t0Var.f135316f;
        if (str3 != null && !str3.isEmpty()) {
            try {
                str3 = java.net.URLEncoder.encode(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(',');
        sb6.append(t0Var.f135317g);
        sb6.append(',');
        sb6.append(t0Var.f135318h);
        sb6.append(',');
        java.lang.String str4 = t0Var.f135319i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                str4 = java.net.URLEncoder.encode(str4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException unused2) {
            }
        }
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(',');
        sb6.append(t0Var.f135320j);
        sb6.append(',');
        java.lang.String str5 = t0Var.f135321k;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(',');
        java.lang.String str6 = t0Var.f135322l;
        if (str6 == null) {
            str6 = "";
        }
        sb6.append(str6);
        sb6.append(',');
        java.lang.String str7 = t0Var.f135323m;
        if (str7 == null) {
            str7 = "";
        }
        sb6.append(str7);
        sb6.append(',');
        java.lang.String str8 = t0Var.f135324n;
        if (str8 != null && !str8.isEmpty()) {
            try {
                str8 = java.net.URLEncoder.encode(str8, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException unused3) {
            }
        }
        sb6.append(str8 != null ? str8 : "");
        sb6.append(',');
        sb6.append(t0Var.f135325o);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportMediaReporter", "[+] Report content: %s", sb7);
        jx3.f.INSTANCE.f(20966, sb7, true, true);
    }
}
