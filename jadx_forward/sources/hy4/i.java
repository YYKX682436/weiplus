package hy4;

/* loaded from: classes7.dex */
public abstract class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String a(java.lang.String str, r45.zb5 session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        if (!r26.n0.B(str, "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "", false)) {
            return str;
        }
        boolean z17 = session.f473423o;
        boolean z18 = z17;
        if (session.f473424p) {
            z18 = (z17 ? 1 : 0) | 2;
        }
        boolean z19 = z18;
        if (session.f473425q) {
            z19 = (z18 ? 1 : 0) | 4;
        }
        boolean z27 = z19;
        if (session.f473426r) {
            z27 = (z19 ? 1 : 0) | '\b';
        }
        boolean z28 = z27;
        if (session.f473427s) {
            z28 = (z27 ? 1 : 0) | 16;
        }
        int i17 = z28;
        if (session.f473429u) {
            i17 = (z28 ? 1 : 0) | 32;
        }
        java.lang.String b17 = b(b(b(b(b(str, "sessionid", java.lang.String.valueOf(session.f473415d)), "subscene", java.lang.String.valueOf(session.f473420i)), com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(session.f473419h)), "ascene", java.lang.String.valueOf(session.f473421m)), "fasttmpl_type", java.lang.String.valueOf(session.f473418g));
        java.lang.String uid = session.f473422n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uid, "uid");
        return b(b(b(b17, "fasttmpl_fullversion", uid), "fasttmpl_flag", java.lang.String.valueOf(i17)), "realreporttime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static final java.lang.String b(java.lang.String str, java.lang.String param, java.lang.String value) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
        java.lang.String str2 = (java.lang.String) f07.get(0);
        if (!r26.n0.D(str2, "?", false, 2, null)) {
            str2 = str2.concat("?");
        }
        if (r26.n0.D(str2, param.concat("="), false, 2, null)) {
            sb6 = g(param).f450450d.matcher(str2).replaceFirst(value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "replaceFirst(...)");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str2);
            sb7.append(r26.i0.n(str2, "?", false) ? "" : "&");
            sb7.append(param);
            sb7.append('=');
            sb7.append(value);
            sb6 = sb7.toString();
        }
        if (f07.size() <= 1) {
            return sb6;
        }
        return sb6 + '#' + ((java.lang.String) f07.get(1));
    }

    public static final java.lang.String c(java.lang.String rawUrl, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawUrl, "rawUrl");
        java.lang.String str = "";
        if (z17) {
            java.lang.String m07 = r26.n0.m0(rawUrl, "#", "");
            if (m07.length() > 0) {
                str = "#".concat(m07);
            }
        }
        return r26.n0.v0(e(rawUrl, "sessionid", "subscene", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "ascene", "enterid", "clicktime", "fasttmpl_type", "fasttmpl_fullversion", "fasttmpl_flag", "realreporttime", "reporttime", "from"), '?', '&') + str;
    }

    public static java.lang.String d(java.lang.String input, java.lang.String param, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        if (!z17) {
            input = (java.lang.String) r26.n0.f0(input, new java.lang.String[]{"#"}, false, 0, 6, null).get(0);
        }
        java.lang.String pattern = "(?<=[?|&])" + param + "=.+?(?:&|$)";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.String replaceFirst = compile.matcher(input).replaceFirst("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceFirst, "replaceFirst(...)");
        return (!r26.i0.n(replaceFirst, "&", false) || r26.i0.o(input, "&", false, 2, null)) ? replaceFirst : r26.n0.v0(replaceFirst, '&');
    }

    public static final java.lang.String e(java.lang.String str, java.lang.String... param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryParameterNames, "getQueryParameterNames(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : queryParameterNames) {
                if (!kz5.z.G(param, (java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.List<java.lang.String> D0 = kz5.n0.D0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(D0, 10));
            for (java.lang.String str2 : D0) {
                arrayList2.add(str2 + '=' + parse.getQueryParameter(str2));
            }
            str = parse.getScheme() + "://" + parse.getHost() + parse.getPath() + '?' + kz5.n0.g0(arrayList2, "&", null, null, 0, null, null, 62, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("String", "clearUrlParams:" + e17.getMessage() + ", " + param + ", " + str);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public static final java.lang.String f(java.lang.String str, java.lang.String param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        r26.m b17 = g(param).b(str, 0);
        if (b17 != null) {
            return ((r26.q) b17).c();
        }
        return null;
    }

    public static final r26.t g(java.lang.String str) {
        jz5.g gVar = hy4.y.f367738a;
        if (((java.lang.Boolean) ((jz5.n) hy4.y.f367738a).mo141623x754a37bb()).booleanValue()) {
            return new r26.t("(?<=" + str + "=).+?(?=&)");
        }
        return new r26.t("(?<=(^|&|\\?)" + str + "=)[^&]*(?=&|$)");
    }

    public static final java.lang.String h(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return !r26.i0.y(str, "http", false) ? r26.n0.B(str, "view.inews.qq.com", false) ? "https://".concat(str) : "http://".concat(str) : str;
    }

    public static final boolean i(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + '/', false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + '/', false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/appmsgalbum?", false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/appmsgalbum?", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/appmsg/show?", false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/appmsg/show?", false)) {
                if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/showappmsg? ", false)) {
                    if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/showappmsg?", false)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean l(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s?", false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s?", false)) {
                if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s/", false)) {
                    if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s/", false)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean m(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (l(str)) {
            return true;
        }
        java.lang.String[] strArr = {"/showappmsg", "/mp/appmsg/show", "/mp/recommendtag?", "/mp/tagunderline?", "/mp/underline?", "/mp/newunderline?", "/mp/getlikelist?", "/mp/rewardandpay?", "/mp/getinteraction?", "/mp/interactionsetting?", "/mp/getappmsgoptype?", "/mp/recunderline?", "/mp/appmsgtopic?", "/mp/appmsgalbum?", "/mp/creatorweekly?", "/mp/creatorannual?", "/mp/infringement?", "/publicpoc/mpinfringement?", "/publicpoc/secitptpagepub?", "/publicpoc/article_extra_msg?", "/publicpoc/wxmmbizsecrecommendedu", "/publicpoc/secitptpage", "/publicpoc/commappeal", "/mp/homepage", "/mp/giftpayarticle", "/mp/profile_ext?", "/mp/listenplayer"};
        java.lang.String[] strArr2 = {com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9), "bc.weixin.qq.com"};
        for (int i17 = 0; i17 < 27; i17++) {
            java.lang.String str2 = strArr[i17];
            for (int i18 = 0; i18 < 2; i18++) {
                java.lang.String str3 = strArr2[i18];
                java.lang.String str4 = "http://" + str3 + str2;
                java.lang.String str5 = "https://" + str3 + str2;
                if (r26.i0.y(str, str4, false) || r26.i0.y(str, str5, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean n(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/recweb/clientjump?", false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/recweb/clientjump?", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/tp/", false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/tp/", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean p(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (!r26.i0.y(str, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + '/', false)) {
            if (!r26.i0.y(str, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + '/', false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean q(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return r26.i0.y(str, "https://yuanbao.tencent.com/embed/contact/", false) || r26.i0.y(str, "http://yuanbao.tencent.com/embed/contact/", false) || r26.i0.y(str, "https://yb.tencent.com/wx/", false) || r26.i0.y(str, "http://yb.tencent.com/wx/", false) || r26.i0.y(str, "https://yuanbao.test.hunyuan.woa.com/wx/", false) || r26.i0.y(str, "http://yuanbao.test.hunyuan.woa.com/wx/", false) || r26.i0.y(str, "https://yuanbao.pre.hunyuan.woa.com/wx/", false) || r26.i0.y(str, "http://yuanbao.pre.hunyuan.woa.com/wx/", false) || r26.i0.y(str, "https://yuanbao.test.hunyuan.woa.com/embed/contact/", false) || r26.i0.y(str, "http://yuanbao.test.hunyuan.woa.com/embed/contact/", false);
    }
}
