package gt1;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final gt1.a f356903a = new gt1.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f356904b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f356905c = 2;

    public final java.lang.String a(long j17, java.lang.String str, java.lang.String str2) {
        return "msg_" + j17 + '|' + str + '|' + str2;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, oi3.g gVar, java.lang.String str, c01.h7 h7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTraceHelper", "tryInsertMessageTracebackInfo :" + h7Var);
        if (h7Var == null) {
            return str == null ? "" : str;
        }
        p15.e eVar = new p15.e();
        if (!(str == null || str.length() == 0)) {
            eVar.m126728xdc93280d(str);
        }
        p15.v r17 = eVar.r();
        if (r17 == null) {
            r17 = new p15.v();
            eVar.E(r17);
        }
        long j17 = h7Var.f118760b;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = null;
        if (j17 != 0) {
            try {
                f9Var2 = pt0.f0.f439742b1.n(h7Var.f118762d, j17);
            } catch (java.lang.AssertionError unused) {
            }
            if (f9Var2 != null && f9Var2.G != null) {
                r17.k(a(f9Var2.I0(), g95.e0.d(f9Var2), g95.e0.c(f9Var2)));
                p15.e eVar2 = new p15.e();
                java.lang.String str2 = f9Var2.G;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMsgSource(...)");
                eVar2.m126728xdc93280d(str2);
                eVar.A(eVar2.p());
            }
            if (f9Var != null && f9Var2 != null) {
                dh3.c.f314022a.d(f9Var, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var2.m124847x74d37ac6(), f9Var2.Q0()));
            } else if (gVar != null && f9Var2 != null) {
                dh3.c.f314022a.e(gVar, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var2.m124847x74d37ac6(), f9Var2.Q0()));
            }
        } else {
            java.lang.String str3 = h7Var.f118761c;
            if (!(str3 == null || str3.length() == 0)) {
                try {
                    f9Var2 = pt0.f0.f439742b1.l(h7Var.f118762d, com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(h7Var.f118761c));
                } catch (java.lang.AssertionError unused2) {
                }
                if (f9Var2 != null && f9Var2.G != null) {
                    r17.k(a(f9Var2.I0(), g95.e0.d(f9Var2), g95.e0.c(f9Var2)));
                    p15.e eVar3 = new p15.e();
                    java.lang.String str4 = f9Var2.G;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getMsgSource(...)");
                    eVar3.m126728xdc93280d(str4);
                    eVar.A(eVar3.p());
                }
                if (f9Var != null && f9Var2 != null) {
                    dh3.c.f314022a.d(f9Var, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var2.m124847x74d37ac6(), f9Var2.Q0()));
                } else if (gVar != null && f9Var2 != null) {
                    dh3.c.f314022a.e(gVar, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var2.m124847x74d37ac6(), f9Var2.Q0()));
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h7Var.f118763e)) {
                java.lang.String Bi = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).Bi(h7Var.f118763e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "getSnsAuthor(...)");
                java.lang.String Di = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).Di(h7Var.f118763e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getSnsPublishId(...)");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(Bi, Di)) {
                    r17.k(Di + '|' + Bi);
                }
            }
        }
        if (eVar.j() == null) {
            eVar.u(new p15.f());
        }
        if (f356905c != 2) {
            p15.f j18 = eVar.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j18);
            j18.j(f356905c);
        } else {
            p15.f j19 = eVar.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j19);
            j19.j(2);
        }
        if (!f356904b) {
            eVar.E(new p15.v());
        }
        java.lang.String m126747x696739c = eVar.m126747x696739c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTraceHelper", m126747x696739c);
        return m126747x696739c;
    }
}
