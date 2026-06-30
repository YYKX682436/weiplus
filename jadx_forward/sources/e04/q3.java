package e04;

/* loaded from: classes15.dex */
public abstract class q3 {
    public static java.lang.String a(e04.n3 n3Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.f69639x5bec8545)) {
            java.lang.String str = n3Var.f69646x4b6e9352;
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Scanner.ScanXmlHelper", "product.field_xml == null in getProductInfoXml()");
                return "";
            }
            if (str.startsWith("<productInfo")) {
                return n3Var.f69646x4b6e9352;
            }
            sb6.append("<productInfo>");
            sb6.append(n3Var.f69646x4b6e9352);
            sb6.append("<functionType>" + n3Var.f69632xff957a57 + "</functionType>");
            sb6.append("</productInfo>");
        } else {
            sb6.append("<productInfo><product type=\"" + n3Var.f69645x2262335f + "\">");
            sb6.append("<id>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69639x5bec8545) + "</id>");
            sb6.append("<title>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69644x29dd02d3) + "</title>");
            sb6.append("<subtitle>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69642xa2f255bd) + "</subtitle>");
            sb6.append("<thumburl>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69643x7b28c57e) + "</thumburl>");
            sb6.append("<source>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69641x10639700) + "</source>");
            sb6.append("<shareurl>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69640xf16e7ed5) + "</shareurl>");
            sb6.append("<playurl>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69638x5727ab76) + "</playurl>");
            sb6.append("<extinfo>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69630x26c1a40a) + "</extinfo>");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<getaction>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69633xe17fe007 + ""));
            sb7.append("</getaction>");
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<certification>");
            sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69626x52df8a35 + ""));
            sb8.append("</certification>");
            sb6.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("<headerbackgroundurl>");
            sb9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69634x4e41914f + ""));
            sb9.append("</headerbackgroundurl>");
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("<headermask>");
            sb10.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69635x2f110f5e + ""));
            sb10.append("</headermask>");
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("<detailurl>");
            sb11.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69628x2503aa79 + ""));
            sb11.append("</detailurl>");
            sb6.append(sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("<certificationurl>");
            sb12.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n3Var.f69627xb96131a + ""));
            sb12.append("</certificationurl>");
            sb6.append(sb12.toString());
            sb6.append("</product>");
            sb6.append("<functionType>" + n3Var.f69632xff957a57 + "</functionType>");
            sb6.append("</productInfo>");
        }
        return sb6.toString();
    }

    public static java.lang.String b(android.content.Context context, int i17) {
        if (context == null || i17 < 0) {
            return "";
        }
        if (i17 == 0) {
            context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iam);
        } else if (i17 == 1) {
            context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaf);
        } else if (i17 == 2) {
            context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ial);
        } else if (i17 == 3) {
            context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iag);
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iam);
    }

    public static e04.j3 c(java.lang.String str) {
        java.util.Map d17;
        if (str == null || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, ya.a.f77450x918d59a8, null)) == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".search.query");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) d17.get(".search.extInfo");
        return new e04.j3(str2, str3 != null ? str3 : "");
    }

    public static int d(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("<user")) {
            return 1;
        }
        if (trim.startsWith("<url")) {
            return 2;
        }
        if (trim.startsWith("<product")) {
            return 3;
        }
        return trim.startsWith("<search") ? 4 : 0;
    }
}
