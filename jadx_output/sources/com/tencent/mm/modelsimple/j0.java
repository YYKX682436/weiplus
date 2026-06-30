package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public abstract class j0 {
    public static com.tencent.mm.modelbase.o a(com.tencent.mm.modelbase.o oVar) {
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
            r45.r83 r83Var = (r45.r83) oVar.f70710a.f70684a;
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(46, null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(com.tencent.mm.sdk.platformtools.t8.h(str));
            r83Var.f384611e = cu5Var;
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(72, null);
            java.lang.String str3 = str2 != null ? str2 : "";
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(com.tencent.mm.sdk.platformtools.t8.h(str3));
            r83Var.f384621r = cu5Var2;
        }
        return oVar;
    }

    public static com.tencent.mm.modelbase.o b(java.lang.String str, int i17) {
        com.tencent.mm.modelsimple.i0 i0Var;
        if (i17 == 5) {
            i0Var = com.tencent.mm.modelsimple.i0.MinorGetA8Key;
        } else {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.modelsimple.i0 i0Var2 = com.tencent.mm.modelsimple.i0.GetA8Key;
            if (K0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl reqUrl is null, getA8Key");
            } else {
                try {
                    android.net.Uri parse = android.net.Uri.parse(str);
                    com.tencent.mm.modelsimple.i0 i0Var3 = com.tencent.mm.modelsimple.i0.ThridGetA8Key;
                    if (parse != null) {
                        org.json.JSONObject H = com.tencent.mm.modelsimple.k0.H();
                        if (H != null) {
                            int optInt = H.optInt("version");
                            if (com.tencent.mm.modelsimple.k0.f71354m) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "try reportPayConfig version:%d", java.lang.Integer.valueOf(optInt));
                                if (optInt > 0) {
                                    com.tencent.mm.modelsimple.k0.f71354m = false;
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
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(parse.getFragment())) {
                            str2 = "#" + parse.getFragment();
                        }
                        if (!lowerCase.equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fya)) && !lowerCase.equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9)) && !lowerCase.equals("mp.weixinbridge.com")) {
                            boolean contains = str2.contains("wechat_pay");
                            com.tencent.mm.modelsimple.i0 i0Var4 = com.tencent.mm.modelsimple.i0.PayGetA8Key;
                            if (contains || (H != null && com.tencent.mm.modelsimple.k0.I(parse, H.optJSONArray("pay-geta8key")))) {
                                i0Var = i0Var4;
                            } else if (H != null && com.tencent.mm.modelsimple.k0.I(parse, H.optJSONArray("pay3rd-geta8key"))) {
                                i0Var = com.tencent.mm.modelsimple.i0.Pay3rdGetA8Key;
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
                        i0Var = com.tencent.mm.modelsimple.i0.MpGetA8Key;
                    }
                    i0Var = i0Var3;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl parse uri fail %s", e17.getMessage());
                }
            }
            i0Var = i0Var2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "getCommReqRespFromReqUrl reqUrl=%s, type=%s, reason=%d", str, i0Var, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.o c17 = c(i0Var);
        a(c17);
        return c17;
    }

    public static com.tencent.mm.modelbase.o c(com.tencent.mm.modelsimple.i0 i0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.r83();
        lVar.f70665b = new r45.s83();
        switch (i0Var.ordinal()) {
            case 1:
                lVar.f70666c = "/cgi-bin/micromsg-bin/geta8key";
                lVar.f70667d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
                lVar.f70668e = 155;
                lVar.f70669f = 1000000155;
                break;
            case 2:
                lVar.f70666c = "/cgi-bin/micromsg-bin/mp-geta8key";
                lVar.f70667d = 238;
                lVar.f70668e = 345;
                lVar.f70669f = 1000000345;
                break;
            case 3:
                lVar.f70666c = "/cgi-bin/micromsg-bin/pay-geta8key";
                lVar.f70667d = 835;
                lVar.f70668e = yc1.q.CTRL_INDEX;
                lVar.f70669f = 1000000346;
                lVar.f70678o = 2;
                break;
            case 4:
                lVar.f70666c = "/cgi-bin/micromsg-bin/minor-geta8key";
                lVar.f70667d = gd1.l.CTRL_INDEX;
                lVar.f70668e = 387;
                lVar.f70669f = 1000000387;
                break;
            case 5:
                lVar.f70666c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX;
                lVar.f70668e = nd1.u0.CTRL_INDEX;
                lVar.f70669f = 1000000388;
                break;
            case 6:
                lVar.f70666c = "/cgi-bin/mmpay-bin/pay3rd-geta8key";
                lVar.f70667d = 14531;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                lVar.f70678o = 2;
                break;
            default:
                lVar.f70666c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX;
                lVar.f70668e = nd1.u0.CTRL_INDEX;
                lVar.f70669f = 1000000388;
                break;
        }
        return lVar.a();
    }
}
