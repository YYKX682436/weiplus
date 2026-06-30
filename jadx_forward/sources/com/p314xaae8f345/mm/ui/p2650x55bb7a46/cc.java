package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class cc {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f280057e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f280058f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f280059g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f280060a;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f280062c;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f280061b = null;

    /* renamed from: d, reason: collision with root package name */
    public float f280063d = 1.0f;

    static {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<img id=\"%s\" src=\"%s\" height=\"100\" onclick=\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("weixin://img_onclick/") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("this.id + '@@' + this.src")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", "weixin://img_onclick/", "this.id + '@@' + this.src");
            str = null;
        } else {
            str = "document.getElementById('_edw_iframe_').src = 'weixin://img_onclick/' + this.id + '@@' + this.src";
        }
        sb6.append(str);
        sb6.append("\"></img>");
        f280057e = sb6.toString();
        f280058f = new char[]{'<', '>', '\"', '\'', '&', '\n'};
        f280059g = new java.lang.String[]{"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />"};
    }

    public cc(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f280062c = null;
        this.f280060a = context;
        this.f280062c = z3Var;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            char[] cArr = f280058f;
            boolean z17 = true;
            int length2 = cArr.length - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                if (cArr[length2] == charAt) {
                    stringBuffer.append(f280059g[length2]);
                    z17 = false;
                    break;
                }
                length2--;
            }
            if (z17) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280062c.d1())) {
            java.lang.String j17 = f9Var.j();
            int t17 = c01.w9.t(j17);
            if (t17 != -1) {
                java.lang.String trim = j17.substring(0, t17).trim();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str = c01.a2.e(trim);
            } else {
                str = null;
            }
        } else {
            java.lang.String Q0 = f9Var.Q0();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            str = c01.a2.e(Q0);
        }
        if (f9Var.A0() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQMailHistoryExporter", "isSend");
            str = c01.z1.l();
        }
        return "" + str + "  " + new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(f9Var.mo78012x3fdd41df()));
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String format;
        int t17;
        boolean g37 = f9Var.g3();
        android.content.Context context = this.f280060a;
        if (g37) {
            format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buf));
        } else if (f9Var.k3()) {
            format = f9Var.A0() == 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bud) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buc);
        } else if (f9Var.L2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
            am.ej ejVar = c5689x3d19c202.f136014g;
            ejVar.f88092a = 1;
            ejVar.f88094c = f9Var;
            c5689x3d19c202.e();
            format = java.lang.String.format("[%s]", c5689x3d19c202.f136015h.f88213a);
        } else if (f9Var.k2()) {
            java.lang.String j17 = f9Var.j();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280062c.d1()) && (t17 = c01.w9.t(f9Var.j())) != -1) {
                j17 = f9Var.j().substring(t17 + 1).trim();
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QQMailHistoryExporter", "appmsg content is null");
                format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu6));
            } else {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = v17.f430179d;
                ((kt.c) i0Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
                java.lang.String Vi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(context, h17, (h17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67372x453d1e07)) ? v17.H : h17.f67372x453d1e07);
                if (f9Var.q2()) {
                    format = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi) ? b(v17.f430187f) : java.lang.String.format("[%s: %s]", Vi, b(v17.f430187f));
                } else {
                    boolean o27 = f9Var.o2();
                    java.lang.String str2 = f280057e;
                    if (o27) {
                        java.lang.String a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.eb.a(f9Var, v17);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                            java.lang.String str3 = "file://" + a17;
                            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(a17);
                            java.lang.String str4 = a18.f294812f;
                            if (str4 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                                if (!str4.equals(l17)) {
                                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                                }
                            }
                            java.lang.String str5 = a18.f294812f;
                            int lastIndexOf = str5.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                str5 = str5.substring(lastIndexOf + 1);
                            }
                            format = java.lang.String.format(str2, str5, str3, a17);
                        }
                        format = "";
                    } else {
                        int i17 = v17.f430199i;
                        if (i17 != 8) {
                            if (i17 != 130) {
                                switch (i17) {
                                    case 1:
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi)) {
                                            format = java.lang.String.format("[%s: %s]", Vi, b(v17.f430187f));
                                            break;
                                        } else {
                                            format = b(v17.f430187f);
                                            break;
                                        }
                                    case 2:
                                        java.lang.String a19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.eb.a(f9Var, v17);
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a19)) {
                                            java.lang.String str6 = "file://" + a19;
                                            com.p314xaae8f345.mm.vfs.z7 a27 = com.p314xaae8f345.mm.vfs.z7.a(a19);
                                            java.lang.String str7 = a27.f294812f;
                                            if (str7 != null) {
                                                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
                                                if (!str7.equals(l18)) {
                                                    a27 = new com.p314xaae8f345.mm.vfs.z7(a27.f294810d, a27.f294811e, l18, a27.f294813g, a27.f294814h);
                                                }
                                            }
                                            java.lang.String str8 = a27.f294812f;
                                            int lastIndexOf2 = str8.lastIndexOf("/");
                                            if (lastIndexOf2 >= 0) {
                                                str8 = str8.substring(lastIndexOf2 + 1);
                                            }
                                            format = java.lang.String.format(str2, str8, str6, a19);
                                            break;
                                        }
                                        format = "";
                                        break;
                                    case 3:
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430191g)) {
                                            format = java.lang.String.format("[%s: %s-%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bub), b(v17.f430187f), b(v17.f430191g));
                                            break;
                                        } else {
                                            format = java.lang.String.format("[%s: %s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bub), b(v17.f430187f));
                                            break;
                                        }
                                    case 4:
                                    case 5:
                                        format = java.lang.String.format("[%s: %s]", b(v17.f430187f), b(v17.f430207k));
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu6));
                                        break;
                                }
                            }
                            format = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430191g) ? java.lang.String.format("[%s: %s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu_), b(v17.n())) : java.lang.String.format("[%s: %s-%s(%s)]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu_), b(v17.n()), b(v17.f430191g), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu7));
                        } else {
                            format = java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu9));
                        }
                    }
                }
            }
        } else if (f9Var.E2()) {
            format = java.lang.String.format("[%s: %s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu8), ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j()).f277892b);
        } else if (f9Var.m78014x7b98c171()) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bue);
            com.p314xaae8f345.mm.vfs.z7 a28 = com.p314xaae8f345.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false));
            java.lang.String str9 = a28.f294812f;
            if (str9 != null) {
                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str9, false, false);
                if (!str9.equals(l19)) {
                    a28 = new com.p314xaae8f345.mm.vfs.z7(a28.f294810d, a28.f294811e, l19, a28.f294813g, a28.f294814h);
                }
            }
            java.lang.String str10 = a28.f294812f;
            int lastIndexOf3 = str10.lastIndexOf("/");
            if (lastIndexOf3 >= 0) {
                str10 = str10.substring(lastIndexOf3 + 1);
            }
            format = java.lang.String.format("[%s: %s(%s)]", string, str10, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu7));
        } else {
            format = (f9Var.C2() || f9Var.m2()) ? java.lang.String.format("[%s]", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bu9)) : null;
        }
        return java.lang.String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", java.lang.Float.valueOf(this.f280063d), a(f9Var), java.lang.Float.valueOf(this.f280063d), format);
    }
}
