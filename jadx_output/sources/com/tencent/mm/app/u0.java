package com.tencent.mm.app;

/* loaded from: classes4.dex */
public abstract class u0 {
    public static void a(com.tencent.mm.app.t0 t0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(t0Var.f53778a);
        sb6.append(',');
        java.lang.String str = t0Var.f53779b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        java.lang.String str2 = t0Var.f53780c;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(t0Var.f53781d);
        sb6.append(',');
        sb6.append(t0Var.f53782e);
        sb6.append(',');
        java.lang.String str3 = t0Var.f53783f;
        if (str3 != null && !str3.isEmpty()) {
            try {
                str3 = java.net.URLEncoder.encode(str3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(',');
        sb6.append(t0Var.f53784g);
        sb6.append(',');
        sb6.append(t0Var.f53785h);
        sb6.append(',');
        java.lang.String str4 = t0Var.f53786i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                str4 = java.net.URLEncoder.encode(str4, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused2) {
            }
        }
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(',');
        sb6.append(t0Var.f53787j);
        sb6.append(',');
        java.lang.String str5 = t0Var.f53788k;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(',');
        java.lang.String str6 = t0Var.f53789l;
        if (str6 == null) {
            str6 = "";
        }
        sb6.append(str6);
        sb6.append(',');
        java.lang.String str7 = t0Var.f53790m;
        if (str7 == null) {
            str7 = "";
        }
        sb6.append(str7);
        sb6.append(',');
        java.lang.String str8 = t0Var.f53791n;
        if (str8 != null && !str8.isEmpty()) {
            try {
                str8 = java.net.URLEncoder.encode(str8, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused3) {
            }
        }
        sb6.append(str8 != null ? str8 : "");
        sb6.append(',');
        sb6.append(t0Var.f53792o);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExportMediaReporter", "[+] Report content: %s", sb7);
        jx3.f.INSTANCE.f(20966, sb7, true, true);
    }
}
