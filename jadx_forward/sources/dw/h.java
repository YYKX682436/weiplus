package dw;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final dw.h f325610a = new dw.h();

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.util.Map map = null;
        ot0.q qVar = null;
        str = "";
        if (msgInfo.mo78013xfb85f7b0() == 436207665) {
            try {
                qVar = ot0.q.v(msgInfo.j());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandEcsMsgDigestLogic", e17, "BrandEcsMsgDigestLogic parseDigestForTypePayC2CNoticeMsg failed", new java.lang.Object[0]);
            }
            if (qVar == null) {
                return "";
            }
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String Q0 = msgInfo.Q0();
            ((sg3.a) v0Var).getClass();
            java.lang.String b17 = c01.a2.b(Q0);
            java.lang.String str4 = "[" + qVar.f430225o1 + "] " + qVar.f430209k1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(b17);
            sb6.append(':');
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(str4 != null ? str4 : "");
            return sb6.toString();
        }
        if (msgInfo.mo78013xfb85f7b0() == -1879048173) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msgInfo.j(), "msg", null);
            if (d17 == null) {
                return "";
            }
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String Q02 = msgInfo.Q0();
            ((sg3.a) v0Var2).getClass();
            java.lang.String b18 = c01.a2.b(Q02);
            try {
                java.lang.String str5 = (java.lang.String) d17.get(".msg.brandecsmsg.version");
                java.lang.String str6 = (java.lang.String) d17.get(".msg.brandecsmsg.digest");
                if (str5 != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "1") && str6 != null) {
                        try {
                            byte[] decode = android.util.Base64.decode(str6, 2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                            str6 = new java.lang.String(decode, r26.c.f450398a);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                if (str6 != null) {
                    str = str6;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandEcsMsgDigestLogic", e18, "BrandEcsMsgDigestLogic getFinalDigest failed", new java.lang.Object[0]);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(b18);
            sb7.append(':');
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(str);
            return sb7.toString();
        }
        if (msgInfo.a3() || msgInfo.b3() || msgInfo.J2()) {
            dw.g gVar = new dw.g(msgInfo);
            if (msgInfo.b3() || msgInfo.J2()) {
                map = uw.f.f513023a.a(uw.e.f513020e, msgInfo);
                str2 = ".msgsource.notify_msg.";
            } else if (msgInfo.mo78013xfb85f7b0() == 318767153) {
                map = uw.f.f513023a.a(uw.e.f513019d, msgInfo);
                str2 = ".msg.appmsg.mmreader.notify_msg.";
            } else {
                str2 = "";
            }
            if (map == null || (str3 = (java.lang.String) map.get(str2.concat("box_digest"))) == null) {
                str3 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && msgInfo.a3()) {
                str3 = (java.lang.String) gVar.mo152xb9724478();
            }
        } else {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = b(msgInfo);
        }
        tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String Q03 = msgInfo.Q0();
        ((sg3.a) v0Var3).getClass();
        java.lang.String b19 = c01.a2.b(Q03);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(b19);
        sb8.append(':');
        sb8.append(str3 != null ? str3 : "");
        return sb8.toString();
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if ((Di != null ? Di.w() : null) == null) {
            return "";
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        msgInfo.d1(msgInfo.Q0() + ':' + msgInfo.j());
        qm.a0.d(msgInfo, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true);
        java.lang.String str = c19772x1c2cd081.f38869x6ac9171;
        if (str == null || str.length() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String substring = str.substring(r26.n0.L(str, ":", 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }
}
