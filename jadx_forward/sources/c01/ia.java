package c01;

/* loaded from: classes12.dex */
public abstract class ia {

    /* renamed from: a, reason: collision with root package name */
    public static int f118787a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f118788b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f118789c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static float f118790d = 0.4f;

    /* renamed from: e, reason: collision with root package name */
    public static float f118791e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f118792f;

    public static boolean A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (h(f9Var) == 2) {
            return true;
        }
        if (f9Var != null) {
            if ((f9Var.F & 1048576) != 0) {
                return true;
            }
        }
        return B(f9Var);
    }

    public static boolean B(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        return (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msgsource.sec_msg_node.sfn"), 0) != 1) ? false : true;
    }

    public static boolean C(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return q(f9Var) == 1;
    }

    public static boolean D(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        return (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.url-click-type"), 0) == 0) ? false : true;
    }

    public static java.lang.String E(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(".msgsource.alnode.fr", java.lang.String.valueOf(i17));
        return "<alnode><fr>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(".msgsource.alnode.fr"), 0) + "</fr></alnode>";
    }

    public static java.lang.String F(java.util.Map map) {
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.alnode.cf"), 0);
        java.lang.String str = (java.lang.String) map.get(".msgsource.alnode.inlenlist");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<alnode><cf>");
        sb6.append(D1);
        sb6.append("</cf>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            sb6.append("<inlenlist>");
            sb6.append(str);
            sb6.append("</inlenlist>");
        }
        sb6.append("</alnode>");
        return sb6.toString();
    }

    public static java.lang.String G(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return null;
        }
        return "<" + str + "><" + str2 + ">" + str3 + "</" + str2 + "></" + str + ">";
    }

    public static java.lang.String H(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return "<sec_msg_node><uuid>" + str + "</uuid></sec_msg_node>";
    }

    public static java.lang.String I(java.util.Map map) {
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.sfn"), 0);
        java.lang.String str = (java.lang.String) map.get(".msgsource.sec_msg_node.show-h5");
        if (str == null) {
            str = "";
        }
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.clip-len"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".msgsource.sec_msg_node.share-tip-url");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msgsource.sec_msg_node.sec-ctrl-flag");
        return "<sec_msg_node><sfn>" + D1 + "</sfn><show-h5><![CDATA[" + str + "]]></show-h5><clip-len>" + D12 + "</clip-len><share-tip-url><![CDATA[" + str2 + "]]></share-tip-url><sec-ctrl-flag><![CDATA[" + (str3 != null ? str3 : "") + "]]></sec-ctrl-flag><fold-reduce>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.fold-reduce"), 0) + "</fold-reduce><media-to-emoji>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.media-to-emoji"), 0) + "</media-to-emoji><block-range>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.block-range"), 0) + "</block-range><bubble-type>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.bubble-type"), 0) + "</bubble-type><preview-type>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.preview-type"), 0) + "</preview-type><url-click-type>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msgsource.sec_msg_node.url-click-type"), 0) + "</url-click-type></sec_msg_node>";
    }

    public static void J(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSourceHelper", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", str, "");
    }

    public static void K(java.lang.String str, int i17, boolean z17) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSourceHelper", "flag is 0.");
        } else if ("bizflag".equals(str)) {
            if (z17) {
                f118787a |= i17;
            } else {
                f118787a &= ~i17;
            }
        }
    }

    public static boolean L(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int l17 = l(f9Var);
        return l17 == 2 || l17 == 4;
    }

    public static boolean M(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return l(f9Var) > 0;
    }

    public static void N(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        if (f9Var != null) {
            java.lang.String str2 = f9Var.G;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            f9Var.u3(str2.replaceAll("(?s)<alnode[^>]*>.*?</alnode>", "").replace("</msgsource>", str + "</msgsource>"));
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(f9Var.I0(), f9Var);
            }
        }
    }

    public static void O(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        if (f9Var != null) {
            java.lang.String str2 = f9Var.G;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            p15.e eVar = new p15.e();
            eVar.m126728xdc93280d(str2);
            p15.s sVar = new p15.s();
            sVar.m126728xdc93280d(str);
            p15.s sVar2 = new p15.s();
            if (eVar.q() != null) {
                sVar2 = eVar.q();
            }
            sVar2.R(sVar.m157696xfb865c31());
            sVar2.L(sVar.u());
            sVar2.E(sVar.n());
            sVar2.O(sVar.x());
            sVar2.K(sVar.t());
            sVar2.C(sVar.l());
            sVar2.N(sVar.w());
            sVar2.F(sVar.o());
            sVar2.A(sVar.j());
            sVar2.B(sVar.k());
            sVar2.G(sVar.p());
            sVar2.Q(sVar.z());
            f9Var.u3(str2.replaceAll("(?s)<sec_msg_node[^>]*>.*?</sec_msg_node>", "").replace("</msgsource>", sVar2.m126747x696739c() + "</msgsource>"));
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(f9Var.I0(), f9Var);
            }
        }
    }

    public static void P(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        if (f9Var != null) {
            java.lang.String str2 = f9Var.G;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            try {
                java.lang.String v17 = v(str);
                java.lang.String substring = str2.indexOf("<sec_msg_node") >= 0 ? str2.substring(str2.indexOf("<sec_msg_node"), str2.indexOf("</sec_msg_node") + 12 + 3) : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring)) {
                    java.lang.String v18 = v(str2);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v18)) {
                        return;
                    }
                    O(f9Var, H(v17), z17);
                    return;
                }
                f9Var.u3(str2.replace(substring, substring.replace(substring.substring(substring.indexOf("<uuid"), substring.indexOf("</uuid") + 4 + 3), "<uuid>" + v17 + "</uuid>")));
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(f9Var.I0(), f9Var);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgSourceHelper", e17, "updateSecMsgUUIDNode msg exception", new java.lang.Object[0]);
            }
        }
    }

    public static java.lang.String Q(java.lang.String str, long j17, long j18, long j19) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.trim().startsWith("<msgsource>")) {
            str = "<msgsource></msgsource>";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<share_msg><createtime>");
        sb6.append(j17 / 1000);
        sb6.append("</createtime><svrid>");
        sb6.append(j18);
        sb6.append("</svrid><newsvrid>");
        sb6.append(j19);
        sb6.append("</newsvrid></share_msg>");
        return str.replaceAll("(?s)<share_msg[^>]*>.*?</share_msg>", "").replace("</msgsource>", ((java.lang.Object) sb6) + "</msgsource>");
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        java.util.Map d17;
        java.util.Map d18;
        java.util.Map d19;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return n();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String p17 = p();
        if (p17 == null) {
            p17 = "";
        }
        sb6.append(p17);
        java.lang.String str3 = null;
        if (sb6.length() > 0) {
            sb6.insert(0, "<msgsource>");
            sb6.append("</msgsource>");
            str2 = sb6.toString();
        } else {
            str2 = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.u3(str2);
        java.lang.String v17 = v(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17)) {
            c(f9Var, "sec_msg_node", "uuid", v17, false);
        }
        java.lang.String str4 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) ? null : (java.lang.String) d17.get(".msgsource.alnode.fr");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            c(f9Var, "alnode", "fr", str4, false);
        }
        java.lang.String str5 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) ? null : (java.lang.String) d18.get(".msgsource.weappsourceUsername");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            try {
                java.lang.String str6 = f9Var.G;
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    stringBuffer.append("<msgsource>");
                }
                stringBuffer.append("<weappsourceUsername>");
                stringBuffer.append(str5);
                stringBuffer.append("</weappsourceUsername>");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    stringBuffer.append("</msgsource>");
                    f9Var.u3(stringBuffer.toString());
                } else {
                    f9Var.u3(str6.replace("<msgsource>", "<msgsource>" + stringBuffer.toString()));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgSourceHelper", e17, "assembleMsgSourceForWeAppSourceUsername msg exception", new java.lang.Object[0]);
            }
        }
        p15.e eVar = new p15.e();
        p15.e eVar2 = new p15.e();
        java.lang.String str7 = f9Var.G;
        if (str7 != null) {
            eVar.m126728xdc93280d(str7);
        }
        eVar2.m126728xdc93280d(str);
        if (eVar2.r() != null) {
            java.lang.String j17 = eVar2.r().j();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                if (eVar.r() == null) {
                    eVar.E(new p15.v());
                }
                eVar.r().k(j17);
            }
        }
        if (eVar2.p() != null) {
            java.lang.String j18 = eVar2.p().j();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
                if (eVar.p() == null) {
                    eVar.A(new p15.q());
                }
                eVar.p().k(j18);
            }
            f9Var.u3(eVar.m126747x696739c());
        }
        java.lang.Integer l17 = eVar2.l();
        if (l17 != null && l17.intValue() != 0) {
            eVar.x(l17);
        }
        java.lang.Long n17 = eVar2.n();
        if (n17 != null && n17.longValue() != 0) {
            eVar.y(n17);
        }
        f9Var.u3(eVar.m126747x696739c());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) != null) {
            str3 = (java.lang.String) d19.get(".msgsource.atuserlist");
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str : f9Var.G;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.trim().startsWith("<msgsource>")) {
            str = "<msgsource></msgsource>";
        }
        return str.replaceAll("(?s)<" + str2 + "[^>]*>.*?</" + str2 + ">", "").replace("</msgsource>", str3 + "</msgsource>");
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        java.lang.String str4;
        if (f9Var != null) {
            java.lang.String str5 = f9Var.G;
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || !str5.trim().startsWith("<msgsource>")) {
                    str5 = "<msgsource></msgsource>";
                }
                if (str5.indexOf("<" + str) >= 0) {
                    str4 = str5.substring(str5.indexOf("<" + str), str5.indexOf("</" + str) + str.length() + 3);
                } else {
                    str4 = null;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    java.lang.String replaceAll = str5.replaceAll("(?s)<" + str + "[^>]*>.*?</" + str + ">", "");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(G(str, str2, str3));
                    sb6.append("</msgsource>");
                    f9Var.u3(replaceAll.replace("</msgsource>", sb6.toString()));
                    if (z17) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(f9Var.I0(), f9Var);
                        return;
                    }
                    return;
                }
                f9Var.u3(str5.replace(str4, str4.replace(str4.substring(str4.indexOf("<" + str2), str4.indexOf("</" + str2) + str2.length() + 3), "<" + str2 + ">" + str3 + "</" + str2 + ">")));
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(f9Var.I0(), f9Var);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgSourceHelper", e17, "assembleMsgSourceNode msg exception", new java.lang.Object[0]);
            }
        }
    }

    public static boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        return f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.pua"), 0) == 0;
    }

    public static boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return q(f9Var) == 2;
    }

    public static java.lang.String f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(70, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            gm0.j1.u().c().w(70, "");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<msgsource>");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        if (f118787a != 0) {
            sb6.append("<bizflag>");
            sb6.append(f118787a);
            sb6.append("</bizflag>");
        }
        if (f9Var != null) {
            java.lang.String v17 = v(f9Var.G);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17)) {
                sb6.append(H(v17));
            }
            if (f9Var.mo78013xfb85f7b0() == 1) {
                sb6.append("<pua>1</pua>");
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f118792f) && !sb6.toString().contains("<mppageidentity>")) {
            sb6.append(f118792f);
        }
        sb6.append(k());
        sb6.append("</msgsource>");
        java.lang.String sb7 = sb6.toString();
        return "<msgsource></msgsource>".equals(sb7) ? "" : sb7;
    }

    public static int g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return 0;
        }
        java.lang.String str = (java.lang.String) d17.get(".msgsource.bizflag");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
    }

    public static int h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.bubble-type"), 0);
    }

    public static int i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msgsource.sec_msg_node.clip-len"), 0);
    }

    public static int j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return 0;
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msgsource.sec_msg_node.fold-reduce"), 0);
        if (D1 <= 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.bubble-type"), 0) == 0) {
            return D1;
        }
        return 1;
    }

    public static java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC;
        java.lang.String v17 = c17.v(u3Var, "");
        if (!v17.isEmpty()) {
            sb6.append("<enc_username>");
            sb6.append(v17);
            sb6.append("</enc_username>");
            gm0.j1.u().c().x(u3Var, null);
        }
        return sb6.toString();
    }

    public static int l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null ? m(f9Var.G) : m("");
    }

    public static int m(java.lang.String str) {
        java.util.Map d17;
        if (f118789c == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) {
            return 0;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.media-to-emoji"), 0);
        if (P <= 1) {
            return P;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.bubble-type"), 0) == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.preview-type"), 0) == 0) {
            return P;
        }
        return 1;
    }

    public static java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String p17 = p();
        if (p17 == null) {
            p17 = "";
        }
        sb6.append(p17);
        sb6.append(k());
        if (sb6.length() <= 0) {
            return null;
        }
        sb6.insert(0, "<msgsource>");
        sb6.append("</msgsource>");
        return sb6.toString();
    }

    public static java.lang.String o(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return "<msgsource>" + H(str) + "</msgsource>";
    }

    public static java.lang.String p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (f118787a != 0) {
            sb6.append("<bizflag>");
            sb6.append(f118787a);
            sb6.append("</bizflag>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f118792f) && !sb6.toString().contains("<mppageidentity>")) {
            sb6.append(f118792f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSourceHelper", "getMsgSourceSubTagsStr: " + ((java.lang.Object) sb6));
        return sb6.toString();
    }

    public static int q(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.sec_msg_node.preview-type"), 0);
    }

    public static long r(java.lang.String str) {
        java.util.Map d17;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) {
            return -1L;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".msgsource.share_msg.svrid"));
    }

    public static java.lang.String s(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) d17.get(".msgsource.sec_msg_node.share-tip-url");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : "";
    }

    public static java.lang.String t(java.lang.String str) {
        java.util.Map d17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) {
            return null;
        }
        return (java.lang.String) d17.get(".msgsource.strid");
    }

    public static java.lang.String u(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) d17.get(".msgsource.sec_msg_node.show-h5");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : "";
    }

    public static java.lang.String v(java.lang.String str) {
        java.util.Map d17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) == null) {
            return null;
        }
        return (java.lang.String) d17.get(".msgsource.sec_msg_node.uuid");
    }

    public static boolean w(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        return (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msgsource.sec_msg_node.block-range"), 0) == 0) ? false : true;
    }

    public static boolean x(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return h(f9Var) == 1;
    }

    public static boolean y(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        int j17 = j(f9Var);
        if (!f9Var.b3() || j17 < 3) {
            return f9Var.J2() && j17 >= 2;
        }
        return true;
    }

    public static boolean z(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        int j17 = j(f9Var);
        if (!f9Var.b3() || j17 <= 3) {
            return f9Var.J2() && j17 > 2;
        }
        return true;
    }
}
