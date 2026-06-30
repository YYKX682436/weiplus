package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public abstract class j0 {
    public static com.p314xaae8f345.mm.p944x882e457a.o a(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            r45.r83 r83Var = (r45.r83) oVar.f152243a.f152217a;
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(46, null);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
            r83Var.f466144e = cu5Var;
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(72, null);
            java.lang.String str3 = str2 != null ? str2 : "";
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str3));
            r83Var.f466154r = cu5Var2;
        }
        return oVar;
    }

    public static com.p314xaae8f345.mm.p944x882e457a.o b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var;
        if (i17 == 5) {
            i0Var = com.p314xaae8f345.mm.p957x53236a1b.i0.MinorGetA8Key;
        } else {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var2 = com.p314xaae8f345.mm.p957x53236a1b.i0.GetA8Key;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl reqUrl is null, getA8Key");
            } else {
                try {
                    android.net.Uri parse = android.net.Uri.parse(str);
                    com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var3 = com.p314xaae8f345.mm.p957x53236a1b.i0.ThridGetA8Key;
                    if (parse != null) {
                        org.json.JSONObject H = com.p314xaae8f345.mm.p957x53236a1b.k0.H();
                        if (H != null) {
                            int optInt = H.optInt("version");
                            if (com.p314xaae8f345.mm.p957x53236a1b.k0.f152887m) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "try reportPayConfig version:%d", java.lang.Integer.valueOf(optInt));
                                if (optInt > 0) {
                                    com.p314xaae8f345.mm.p957x53236a1b.k0.f152887m = false;
                                    jx3.f.INSTANCE.d(31531, java.lang.Integer.valueOf(optInt), 0);
                                }
                            }
                        }
                        java.lang.String host = parse.getHost();
                        java.lang.String str2 = "";
                        if (host == null) {
                            host = "";
                        }
                        java.lang.String lowerCase = host.toLowerCase();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(parse.getFragment())) {
                            str2 = "#" + parse.getFragment();
                        }
                        if (!lowerCase.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fya)) && !lowerCase.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9)) && !lowerCase.equals("mp.weixinbridge.com")) {
                            boolean contains = str2.contains("wechat_pay");
                            com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var4 = com.p314xaae8f345.mm.p957x53236a1b.i0.PayGetA8Key;
                            if (contains || (H != null && com.p314xaae8f345.mm.p957x53236a1b.k0.I(parse, H.optJSONArray("pay-geta8key")))) {
                                i0Var = i0Var4;
                            } else if (H != null && com.p314xaae8f345.mm.p957x53236a1b.k0.I(parse, H.optJSONArray("pay3rd-geta8key"))) {
                                i0Var = com.p314xaae8f345.mm.p957x53236a1b.i0.Pay3rdGetA8Key;
                            } else if (!lowerCase.contains(".qq.com")) {
                                if (!lowerCase.equals("qq.com")) {
                                    if (!lowerCase.contains(".wechat.com")) {
                                        if (!lowerCase.equals("wechat.com")) {
                                            if (!lowerCase.contains(".tenpay.com")) {
                                                if (!lowerCase.equals("tenpay.com")) {
                                                    if (!lowerCase.contains(".url.cn")) {
                                                        if (!lowerCase.equals("url.com")) {
                                                            if (!lowerCase.contains(".wechatpay.cn")) {
                                                                if (!lowerCase.equals("wechatpay.cn")) {
                                                                    if (!str.startsWith("http://") && !str.startsWith("https://")) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i0Var = com.p314xaae8f345.mm.p957x53236a1b.i0.MpGetA8Key;
                    }
                    i0Var = i0Var3;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl parse uri fail %s", e17.getMessage());
                }
            }
            i0Var = i0Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "getCommReqRespFromReqUrl reqUrl=%s, type=%s, reason=%d", str, i0Var, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.o c17 = c(i0Var);
        a(c17);
        return c17;
    }

    public static com.p314xaae8f345.mm.p944x882e457a.o c(com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.r83();
        lVar.f152198b = new r45.s83();
        switch (i0Var.ordinal()) {
            case 1:
                lVar.f152199c = "/cgi-bin/micromsg-bin/geta8key";
                lVar.f152200d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
                lVar.f152201e = 155;
                lVar.f152202f = 1000000155;
                break;
            case 2:
                lVar.f152199c = "/cgi-bin/micromsg-bin/mp-geta8key";
                lVar.f152200d = 238;
                lVar.f152201e = 345;
                lVar.f152202f = 1000000345;
                break;
            case 3:
                lVar.f152199c = "/cgi-bin/micromsg-bin/pay-geta8key";
                lVar.f152200d = 835;
                lVar.f152201e = yc1.q.f77527x366c91de;
                lVar.f152202f = 1000000346;
                lVar.f152211o = 2;
                break;
            case 4:
                lVar.f152199c = "/cgi-bin/micromsg-bin/minor-geta8key";
                lVar.f152200d = gd1.l.f69803x366c91de;
                lVar.f152201e = 387;
                lVar.f152202f = 1000000387;
                break;
            case 5:
                lVar.f152199c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de;
                lVar.f152201e = nd1.u0.f72979x366c91de;
                lVar.f152202f = 1000000388;
                break;
            case 6:
                lVar.f152199c = "/cgi-bin/mmpay-bin/pay3rd-geta8key";
                lVar.f152200d = 14531;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                lVar.f152211o = 2;
                break;
            default:
                lVar.f152199c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de;
                lVar.f152201e = nd1.u0.f72979x366c91de;
                lVar.f152202f = 1000000388;
                break;
        }
        return lVar.a();
    }
}
