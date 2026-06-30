package b00;

/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.e0 f16662a = new b00.e0();

    public final bw5.g9 a(java.lang.String prefix, java.util.Map values) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(values, "values");
        bw5.g9 g9Var = new bw5.g9();
        boolean[] zArr = g9Var.R;
        try {
            java.lang.String concat = prefix.concat(".finderShopWindowShare");
            if (!values.isEmpty()) {
                java.lang.String str = (java.lang.String) values.get(concat + ".finderUsername");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                g9Var.f27742d = str;
                zArr[1] = true;
                java.lang.String str3 = (java.lang.String) values.get(concat + ".avatar");
                if (str3 == null) {
                    str3 = "";
                }
                g9Var.f27743e = str3;
                zArr[2] = true;
                java.lang.String str4 = (java.lang.String) values.get(concat + ".nickname");
                if (str4 == null) {
                    str4 = "";
                }
                g9Var.f27744f = str4;
                zArr[3] = true;
                java.lang.String str5 = (java.lang.String) values.get(concat + ".commodityInStockCount");
                if (str5 == null) {
                    str5 = "";
                }
                g9Var.f27745g = str5;
                zArr[4] = true;
                java.lang.String str6 = (java.lang.String) values.get(concat + ".appId");
                if (str6 == null) {
                    str6 = "";
                }
                g9Var.f27746h = str6;
                zArr[5] = true;
                java.lang.String str7 = (java.lang.String) values.get(concat + ".path");
                if (str7 == null) {
                    str7 = "";
                }
                g9Var.f27747i = str7;
                zArr[6] = true;
                java.lang.String str8 = (java.lang.String) values.get(concat + ".appUsername");
                if (str8 == null) {
                    str8 = "";
                }
                g9Var.f27748m = str8;
                zArr[7] = true;
                g9Var.f27749n = com.tencent.mm.sdk.platformtools.t8.T1((java.lang.String) values.get(concat + ".query"));
                zArr[8] = true;
                java.lang.String str9 = (java.lang.String) values.get(concat + ".liteAppId");
                if (str9 == null) {
                    str9 = "";
                }
                g9Var.f27750o = str9;
                zArr[9] = true;
                java.lang.String str10 = (java.lang.String) values.get(concat + ".liteAppPath");
                if (str10 == null) {
                    str10 = "";
                }
                g9Var.f27751p = str10;
                zArr[10] = true;
                g9Var.f27752q = com.tencent.mm.sdk.platformtools.t8.T1((java.lang.String) values.get(concat + ".liteAppQuery"));
                zArr[11] = true;
                java.lang.String str11 = (java.lang.String) values.get(concat + ".platformTagURL");
                if (str11 == null) {
                    str11 = "";
                }
                g9Var.f27753r = str11;
                zArr[12] = true;
                java.lang.String str12 = (java.lang.String) values.get(concat + ".saleWording");
                if (str12 == null) {
                    str12 = "";
                }
                g9Var.f27754s = str12;
                zArr[14] = true;
                java.lang.String str13 = (java.lang.String) values.get(concat + ".lastGMsgID");
                if (str13 == null) {
                    str13 = "";
                }
                g9Var.l(str13);
                java.lang.String str14 = (java.lang.String) values.get(concat + ".profileTypeWording");
                if (str14 == null) {
                    str14 = "";
                }
                g9Var.f27757v = str14;
                zArr[17] = true;
                java.lang.String str15 = (java.lang.String) values.get(concat + ".saleWordingExtra");
                if (str15 == null) {
                    str15 = "";
                }
                g9Var.f27758w = str15;
                zArr[18] = true;
                java.lang.String str16 = (java.lang.String) values.get(concat + ".isWxShop");
                if (str16 == null) {
                    str16 = "";
                }
                g9Var.f27759x = str16;
                zArr[19] = true;
                java.lang.String str17 = (java.lang.String) values.get(concat + ".platformIconUrl");
                if (str17 == null) {
                    str17 = "";
                }
                g9Var.f27760y = str17;
                zArr[20] = true;
                java.lang.String str18 = (java.lang.String) values.get(concat + ".brandIconUrl");
                if (str18 == null) {
                    str18 = "";
                }
                g9Var.f27761z = str18;
                zArr[21] = true;
                java.lang.String str19 = (java.lang.String) values.get(concat + ".description");
                if (str19 == null) {
                    str19 = "";
                }
                g9Var.B = str19;
                zArr[23] = true;
                java.lang.String str20 = (java.lang.String) values.get(concat + ".backgroundUrl");
                if (str20 == null) {
                    str20 = "";
                }
                g9Var.A = str20;
                zArr[22] = true;
                java.lang.String str21 = (java.lang.String) values.get(concat + ".darkModePlatformIconUrl");
                if (str21 == null) {
                    str21 = "";
                }
                g9Var.C = str21;
                zArr[24] = true;
                java.lang.String str22 = (java.lang.String) values.get(concat + ".rIconUrl");
                if (str22 == null) {
                    str22 = "";
                }
                g9Var.D = str22;
                zArr[25] = true;
                java.lang.String str23 = (java.lang.String) values.get(concat + ".rIconUrlDarkMode");
                if (str23 == null) {
                    str23 = "";
                }
                g9Var.E = str23;
                zArr[26] = true;
                java.lang.String str24 = (java.lang.String) values.get(concat + ".rWords");
                if (str24 == null) {
                    str24 = "";
                }
                g9Var.F = str24;
                zArr[27] = true;
                java.lang.String str25 = (java.lang.String) values.get(concat + ".topShopIconUrl");
                if (str25 == null) {
                    str25 = "";
                }
                g9Var.G = str25;
                zArr[28] = true;
                java.lang.String str26 = (java.lang.String) values.get(concat + ".topShopIconUrlDarkMode");
                if (str26 == null) {
                    str26 = "";
                }
                g9Var.H = str26;
                zArr[29] = true;
                java.lang.String str27 = (java.lang.String) values.get(concat + ".simplifyTopShopIconUrl");
                if (str27 == null) {
                    str27 = "";
                }
                g9Var.I = str27;
                zArr[30] = true;
                java.lang.String str28 = (java.lang.String) values.get(concat + ".simplifyTopShopIconUrlDarkmode");
                if (str28 == null) {
                    str28 = "";
                }
                g9Var.f27741J = str28;
                zArr[31] = true;
                g9Var.K = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".topShopIconWidth"), 0);
                zArr[32] = true;
                g9Var.L = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".topShopIconHeight"), 0);
                zArr[33] = true;
                g9Var.M = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".simplifyTopShopIconWidth"), 0);
                zArr[34] = true;
                g9Var.N = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".simplifyTopShopIconHeight"), 0);
                zArr[35] = true;
                java.lang.String str29 = (java.lang.String) values.get(concat + ".profileMainWording");
                if (str29 == null) {
                    str29 = "";
                }
                g9Var.P = str29;
                zArr[36] = true;
                java.lang.String str30 = (java.lang.String) values.get(concat + ".profileSubWording");
                if (str30 != null) {
                    str2 = str30;
                }
                g9Var.Q = str2;
                zArr[37] = true;
                for (int i17 = 0; i17 < 4; i17++) {
                    java.lang.String str31 = concat + ".productImageURLList.productImageURL";
                    if (i17 > 0) {
                        str31 = str31 + i17;
                    }
                    if (!values.containsKey(str31)) {
                        break;
                    }
                    g9Var.f27755t.add((java.lang.String) values.get(str31));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EcsMsgContentUtil", "parse error! %s", e17.getMessage());
        }
        return g9Var;
    }
}
