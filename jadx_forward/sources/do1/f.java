package do1;

/* loaded from: classes12.dex */
public final class f implements do1.b {
    @Override // do1.b
    public boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 mediaInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return false;
    }

    @Override // do1.b
    public boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.String str = msgItem.f115205e;
        java.lang.String str2 = msgItem.f115206f;
        java.lang.Object l17 = tn1.f.f().e().b().l(2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) l17, str)) {
            str = str2;
        }
        java.lang.String content = msgItem.f115207g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
        java.util.Map<java.lang.String, java.lang.String> d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(content, "msg", null);
        com.p314xaae8f345.mm.p2621x8fb0427b.g5 O = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).O(content, str);
        if (O == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackupItemEmoji", "EmojiMsgInfo is null");
            fo1.m mVar = fo1.m.f346415a;
            java.lang.String Q0 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            mVar.g("Restore", 0L, Q0, fo1.e.f346402q, mVar.e(msg));
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(O.f275487d);
        if (N == null) {
            N = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            n22.m.b(O, N);
            N.f68653x95b20dd4 = 65;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            cVar.f125285a = N;
        }
        if (d17.get(".msg.emoji.$androidmd5") == null) {
            java.lang.String a17 = kn1.j.a(O.f275487d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                O.f275487d = a17;
            }
        }
        java.lang.String str3 = O.f275485b;
        if (tn1.e.h(msg.Q0()) && tn1.e.h(str3)) {
            java.lang.String content2 = msgItem.f115207g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content2, "content");
            int L = r26.n0.L(content2, ":", 0, false, 6, null);
            if (L != -1) {
                java.lang.String content3 = msgItem.f115207g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content3, "content");
                java.lang.String substring = content3.substring(0, L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                str3 = r26.n0.u0(substring).toString();
            }
        }
        java.lang.String str4 = str3;
        msg.m124850x7650bebc(47);
        if (!pt0.f0.f439742b1.e()) {
            msg.i1(O.f275487d);
        }
        r15.b bVar = new r15.b();
        try {
            bVar.m126733x88c2ee0f(d17, "msg");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackupItemEmoji", th6, "recover parse extCommonInfo err", new java.lang.Object[0]);
        }
        msg.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(str4, 0L, (N.k() || N.B1()) ? false : true, O.f275487d, false, bVar.n() != null ? bVar.m126747x696739c() : ""));
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, do1.a backupExtraInfo) {
        java.lang.String y07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupExtraInfo, "backupExtraInfo");
        bw5.u0 u0Var = new bw5.u0();
        u0Var.f115204d = msg.mo78013xfb85f7b0();
        u0Var.f115205e = msg.y0();
        u0Var.f115206f = msg.T0();
        java.lang.String j18 = msg.j();
        if (j18 == null) {
            j18 = "";
        }
        u0Var.f115207g = j18;
        u0Var.f115208h = msg.mo78012x3fdd41df();
        java.lang.String str = msg.G;
        u0Var.f115209i = str != null ? str : "";
        u0Var.f115210m = msg.I0();
        u0Var.f115211n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f114735d = msg.I0();
        java.lang.String str2 = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(msg.j()).f277890e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getOriginalContent(...)");
        int length = str2.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str2.charAt(!z17 ? i17 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                }
                length--;
            } else if (z18) {
                i17++;
            } else {
                z17 = true;
            }
        }
        java.lang.String obj = str2.subSequence(i17, length + 1).toString();
        if (!kn1.k.g(obj)) {
            obj = com.p314xaae8f345.mm.p2621x8fb0427b.y4.c(msg.j());
            if (kn1.k.g(obj)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(obj);
            } else {
                if (tn1.e.h(msg.Q0())) {
                    java.lang.String j19 = msg.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j19, "getContent(...)");
                    int K = r26.n0.K(j19, ':', 0, false, 6, null);
                    if (msg.A0() == 1 || K == -1) {
                        y07 = msg.y0();
                    } else {
                        java.lang.String j27 = msg.j();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j27, "getContent(...)");
                        java.lang.String substring = j27.substring(0, K);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        y07 = r26.n0.u0(substring).toString();
                    }
                } else {
                    y07 = msg.y0();
                }
                java.lang.String y08 = tn1.e.h(msg.Q0()) ? msg.A0() != 1 ? msg.y0() : msg.T0() : msg.T0();
                r45.ed edVar = new r45.ed();
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = msg.y0();
                du5Var.f454290e = true;
                edVar.f454814f = du5Var;
                r45.du5 du5Var2 = new r45.du5();
                du5Var2.f454289d = msg.T0();
                du5Var2.f454290e = true;
                edVar.f454815g = du5Var2;
                java.lang.String b17 = kn1.j.b(msg, y07, y08, edVar);
                if (msg.A0() == 1 || !tn1.e.h(msg.Q0())) {
                    obj = b17;
                } else {
                    obj = r26.b0.b(y07 + " :\n                                    " + b17);
                }
            }
        }
        if (obj != null && kn1.k.f(obj)) {
            u0Var.f115207g = obj;
            return new co1.h(u0Var, t0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackupItemEmoji", "emoji error:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(obj));
        fo1.m mVar = fo1.m.f346415a;
        java.lang.String Q0 = msg.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        mVar.g("Backup", j17, Q0, fo1.e.f346393e, mVar.e(msg));
        return null;
    }

    @Override // do1.b
    public long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String mediaId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        return 0L;
    }
}
