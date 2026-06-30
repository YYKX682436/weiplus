package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f276822a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f276823b;

    /* renamed from: c, reason: collision with root package name */
    public static long f276824c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Map f276825d;

    /* renamed from: e, reason: collision with root package name */
    public static long f276826e;

    /* renamed from: f, reason: collision with root package name */
    public static java.util.Map f276827f;

    public static final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info, int i17) {
        java.util.Map l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (!info.w0() || (l17 = l(info)) == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".act"))) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "checkNewDyeingTemplate false, serviceType:" + i17);
        return false;
    }

    public static final boolean b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 J0;
        java.util.Map l17;
        long p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").p("BizLastMsgId");
        return p17 >= 0 || (J0 = r01.q3.oj().J0(p17, "msgId")) == null || !J0.w0() || (l17 = l(J0)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.is_show_msg_count"), 1) == 1;
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.f67292x297eb4f7 == f276822a && (str = f276823b) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            return str;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(info.f67281xad49e234, "avatar_url", null);
        if (d17 == null) {
            return "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".avatar_url");
        java.lang.String str3 = str2 != null ? str2 : "";
        f276823b = str3;
        f276822a = info.f67292x297eb4f7;
        return str3;
    }

    public static final java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info) {
        java.util.Map d17;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p2621x8fb0427b.n2 n2Var = new com.p314xaae8f345.mm.p2621x8fb0427b.n2(info);
        java.lang.String str3 = "";
        java.util.Map map = null;
        if (info.D0() || info.y0()) {
            long j17 = info.f67292x297eb4f7;
            if (j17 != f276826e || (d17 = f276827f) == null) {
                f276826e = j17;
                d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(info.M, "msgsource", null);
                f276827f = d17;
            }
            map = d17;
            str = ".msgsource.notify_msg.";
        } else if (info.w0()) {
            map = l(info);
            str = ".msg.appmsg.mmreader.notify_msg.";
        } else {
            str = "";
        }
        if (map != null && (str2 = (java.lang.String) map.get(str.concat("box_digest"))) != null) {
            str3 = str2;
        }
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && info.w0()) ? (java.lang.String) n2Var.mo152xb9724478() : str3;
    }

    public static final java.lang.String e(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(info.f67281xad49e234, "msg", null);
        if (d17 == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.mmreader." + g(i17) + ".notifymsg_key");
        return str == null ? "" : str;
    }

    public static final int f(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map l17 = l(info);
        if (l17 == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".scene"), 0);
    }

    public static final java.lang.String g(int i17) {
        return i17 == 5 ? "photo_notify_msg" : "notify_msg";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int h(com.p314xaae8f345.mm.p2621x8fb0427b.s1 r6, int r7) {
        /*
            java.lang.String r0 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = r6.f67281xad49e234
            java.lang.String r1 = "msg"
            r2 = 0
            java.util.Map r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r0, r1, r2)
            r3 = 0
            if (r0 != 0) goto L12
            return r3
        L12:
            java.lang.String r6 = r6.f67281xad49e234
            java.util.Map r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r6, r1, r2)
            java.lang.String r1 = ".msg.appmsg.mmreader."
            r2 = 1
            if (r6 != 0) goto L1e
            goto L41
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = g(r7)
            r4.append(r5)
            java.lang.String r5 = ".hide_redcount"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6, r3)
            if (r6 != r2) goto L41
            r6 = r2
            goto L42
        L41:
            r6 = r3
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r7 = g(r7)
            r4.append(r7)
            java.lang.String r7 = ".notifymsg_shield"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r7, r3)
            if (r7 != r2) goto L64
            r3 = r2
        L64:
            if (r3 == 0) goto L68
            r6 = r6 | 2
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.s2.h(com.tencent.mm.storage.s1, int):int");
    }

    public static final int i() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di != null ? Di.p("officialaccounts") : null;
        if (p17 != null && p17.d2(128)) {
            return p17.d2(256) ? 2 : 3;
        }
        return 0;
    }

    public static final int j() {
        return r01.q3.oj().f();
    }

    public static final java.lang.String k(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map l17 = l(info);
        if (l17 == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".publisher_username");
        return str == null ? "" : str;
    }

    public static final java.util.Map l(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        java.util.Map map;
        long j17 = s1Var.f67292x297eb4f7;
        if (j17 == f276824c && (map = f276825d) != null) {
            return map;
        }
        f276824c = j17;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(s1Var.f67281xad49e234, "msg", null);
        f276825d = d17;
        return d17;
    }

    public static final int m() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di != null ? Di.p("officialaccounts") : null;
        if (p17 == null) {
            return 0;
        }
        if (p17.d1() <= 0) {
            if ((!p17.d2(8388608) && !p17.d2(2097152)) || p17.f1() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#2 return 0. unreadCount:" + p17.d1());
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#1 return 1. conv.unReadMuteCount:" + p17.f1() + ", conv.unReadCount:" + p17.d1());
            return 1;
        }
        if (!p17.d2(16) && !p17.d2(64)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#3 return 0. unreadCount:" + p17.d1());
            return 0;
        }
        if (p17.d2(64) && p17.d2(2048)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#4 return 0. unreadCount:" + p17.d1());
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#5 return 1. unreadCount:" + p17.d1());
        return 1;
    }

    public static final boolean n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        if (!(f9Var.a3())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto isTemplateMsg false");
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.g4(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto isMsgClusterNotifyMessage = false");
            return false;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto canCreateBizPhoto = false");
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto false");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.photo_notify_msg.act");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto notifyMsg = %s", java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)));
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
    }

    public static final boolean o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        if (!(f9Var.a3())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isTemplateMsg false");
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.g4(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isMsgClusterNotifyMessage = false");
            return false;
        }
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (!(e0Var != null && ((h62.d) e0Var).Ni(e42.d0.clicfg_open_dyeing_template_to_timeline, 1) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline open = false");
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline false");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.notify_msg.act");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline notifyMsg = %s", java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)));
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
    }

    public static final boolean p(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, int i17) {
        int O;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s1Var);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(s1Var.f67281xad49e234, "msg", null);
        if (d17 == null) {
            O = 0;
        } else {
            java.lang.Object obj = (java.lang.String) d17.get(".msg.appmsg.mmreader." + g(i17) + ".publisher_info.head_type");
            if (obj == null) {
                obj = 0;
            }
            O = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O(obj, 0);
        }
        if (c01.e2.G(str)) {
            if (O != 0 && O != 1) {
                return false;
            }
        } else if (O != 1) {
            return false;
        }
        return true;
    }
}
