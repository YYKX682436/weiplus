package dh0;

/* loaded from: classes5.dex */
public final class k implements vg3.q4 {
    public final java.lang.String b(q15.e eVar, boolean z17) {
        long n17 = eVar.n();
        java.lang.String k17 = eVar.k();
        java.lang.String m159402x6c03c64c = eVar.m159402x6c03c64c();
        java.lang.String l17 = eVar.l();
        if (n17 != 0) {
            if (!(k17 == null || k17.length() == 0)) {
                if (!(m159402x6c03c64c == null || m159402x6c03c64c.length() == 0)) {
                    java.lang.String Di = ((eh0.o) ((dh0.j) i95.n0.c(dh0.j.class))).Di(m159402x6c03c64c, n17, k17, z17);
                    if (Di == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "startStream createDownStream failed");
                        return null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.NewXml", "startStream success, stream started: %s", Di);
                    if (l17 == null || l17.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.NewXml", "insert bootstrap text: bootstrapContent is empty");
                        return Di;
                    }
                    byte[] a17 = n51.d.a(l17, 0);
                    java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                    java.lang.String str = new java.lang.String(a17, forName);
                    if (r26.n0.N(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "startStream bootstrapContent is empty");
                        return null;
                    }
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 l18 = e0Var.l(m159402x6c03c64c, n17);
                    if (l18 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.NewXml", "insert bootstrap text: msgInfo not found, msgSvrId:%s", java.lang.Long.valueOf(n17));
                        l18 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        l18.o1(n17);
                        l18.u1(m159402x6c03c64c);
                        l18.m124850x7650bebc(16777265);
                        l18.j1(0);
                        l18.r1(3);
                        l18.e1(c01.w9.o(m159402x6c03c64c));
                    }
                    v05.b bVar = new v05.b();
                    if (!z17) {
                        bVar.set(bVar.f449898d + 2, str);
                    }
                    l18.d1(bVar.m126747x696739c());
                    l18.f1(l18.w0() | 8388608);
                    try {
                        if (l18.m124847x74d37ac6() > 0) {
                            e0Var.s(l18.Q0(), l18.m124847x74d37ac6(), l18);
                        } else {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(l18);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.NewXml", e17, "updateMsgInfoContent failed", new java.lang.Object[0]);
                    }
                    return Di;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "startStream invalid params: msgSvrId=%s, streamTicket=%s, username=%s", java.lang.Long.valueOf(n17), k17, m159402x6c03c64c);
        return null;
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "onRecieveMsg acc not ready");
            return null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2521xeb7fcef.C20088x55a1de1()), "1")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "onRecieveMsg Expt not enable");
            return null;
        }
        r45.j4 j4Var = p0Var != null ? p0Var.f152259a : null;
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "empty addMsg");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "empty msg content");
            return null;
        }
        q15.e eVar = new q15.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        eVar.m126728xdc93280d(g17);
        java.lang.String j17 = eVar.j();
        int o17 = eVar.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.NewXml", "onRecieveMsg action:%s, streamType:%d, msgSvrId:%s, username:%s", j17, java.lang.Integer.valueOf(o17), java.lang.Long.valueOf(eVar.n()), eVar.m159402x6c03c64c());
        if (j17 == null || j17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.NewXml", "unknown action, ignore");
            return null;
        }
        if (o17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.NewXml", "unsupported stream_type:%d, ignore", java.lang.Integer.valueOf(o17));
            return null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, "thinking")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.NewXml", "handleThinking msgSvrId:%s", java.lang.Long.valueOf(eVar.n()));
            b(eVar, true);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, "result")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.NewXml", "handleResult msgSvrId:%s", java.lang.Long.valueOf(eVar.n()));
            b(eVar, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.NewXml", "unknown action:%s, ignore", j17);
        }
        return null;
    }
}
