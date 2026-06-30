package ak5;

/* loaded from: classes9.dex */
public final class q {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        ((com.p314xaae8f345.mm.app.u7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w()).getClass();
        qm.a0.d(msg, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, false);
        java.lang.String str2 = c19772x1c2cd081.f38869x6ac9171;
        if (msg.A0() == 0 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0())) {
            try {
                int t17 = c01.w9.t(str2);
                if (t17 != -1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.lang.String substring = str2.substring(t17 + 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    str2 = r26.n0.u0(substring).toString();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("TopMsg.NetSceneChatRoomTopMsg", th6, "getDigest err", new java.lang.Object[0]);
                str2 = qm.a0.l(msg.A0(), msg.y0(), msg.j(), msg.mo78013xfb85f7b0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
        if (msg.mo78013xfb85f7b0() == 48) {
            java.lang.String str3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).H6(msg.j()).f275313f;
            if (str3 == null) {
                str3 = "";
            }
            if (!r26.n0.N(str3)) {
                str2 = str2 + ' ' + str3;
            }
        } else if (msg.mo78013xfb85f7b0() == 47 || msg.mo78013xfb85f7b0() == 1048625) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            java.lang.String substring2 = str2.substring(r26.n0.L(str2, ":", 0, false, 6, null) + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            java.lang.String c17 = gg5.b.f353321a.c(substring2);
            if (c17 == null || r26.n0.N(c17)) {
                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
            } else {
                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf) + ' ' + c17;
            }
        }
        if (msg.mo78013xfb85f7b0() == 42 || msg.mo78013xfb85f7b0() == 66) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(msg.j());
            java.lang.String str4 = D3.f277891a;
            java.lang.String str5 = D3.f277892b;
            int i17 = D3.f277907q;
            java.util.Set set = c01.e2.f118650a;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                str5 = e17;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.J7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str4, msg.j()));
            stringBuffer.append(str5);
            str2 = stringBuffer.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        } else if (msg.mo78013xfb85f7b0() == 939524145) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            java.lang.String j17 = msg.j();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c53.a aVar = (c53.a) ot0.q.v(j17).y(c53.a.class);
            if (aVar != null) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571982vd) + aVar.f120178c;
                str2 = str;
            }
        } else if (msg.mo78013xfb85f7b0() == 771751985) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            java.lang.String j18 = msg.j();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            zy2.h hVar = (zy2.h) ot0.q.v(j18).y(zy2.h.class);
            if (hVar != null) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571971v1) + hVar.f558927e;
                str2 = str;
            }
        }
        return str2 == null ? "" : str2;
    }
}
