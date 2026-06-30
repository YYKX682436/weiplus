package pt0;

/* loaded from: classes12.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pt0.e0 f439726a = new pt0.e0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f439727b = jz5.h.b(pt0.d0.f439725d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f439728c = jz5.h.b(pt0.r.f439753d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f439729d = jz5.h.b(pt0.q.f439752d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f439730e = jz5.h.b(pt0.s.f439754d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f439731f = jz5.h.b(pt0.x.f439759d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f439732g = jz5.h.b(pt0.y.f439760d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f439733h = jz5.h.b(pt0.w.f439758d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f439734i = jz5.h.b(pt0.b0.f439721d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f439735j = jz5.h.b(pt0.c0.f439722d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f439736k = jz5.h.b(pt0.a0.f439719d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f439737l = jz5.h.b(pt0.u.f439756d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f439738m = jz5.h.b(pt0.v.f439757d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f439739n = jz5.h.b(pt0.t.f439755d);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f439740o = jz5.h.b(pt0.z.f439761d);

    public final boolean a(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        ez.k1 k1Var = (ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class));
        k1Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y5 = pt0.f0.Y5(k1Var, talker, j17, null, 4, null);
        if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Y5.Q0(), talker) && Y5.m124847x74d37ac6() == j17)) {
            Y5 = null;
        }
        return Y5 != null;
    }

    public final int b(java.lang.String str, long j17) {
        int mo70514xb06685ab;
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        boolean d17 = pt0.f0.f439742b1.d();
        cj6.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        java.lang.String Q0 = Li.Q0();
        if (d17 && !android.text.TextUtils.equals(str, Q0)) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "found different talker[%s -> %s], stack: %s", Q0, str, c17);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 3011L;
            c6423x452b9f7c.r(c17);
            c6423x452b9f7c.k();
        }
        cj6.f275523s.a((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() / 86400), Li.I0(), Li.mo78012x3fdd41df() / 1000, true);
        if (cj6.Pb(cj6.X8(str))) {
            l75.k0 db6 = cj6.f275522r;
            java.lang.String tableName = cj6.P8(j17, str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218 = ot0.d3.a(db6).m106824x752de218(tableName, up5.i.f511503b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m106824x752de218, "getTable(...)");
                m106824x752de218.m107088x90df30e9(up5.i.f511504c.eq(j17));
                mo70514xb06685ab = 1;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MessageDBProvider", "deleteByMsgId failed: " + th7.getMessage());
                mo70514xb06685ab = 0;
            }
        } else {
            mo70514xb06685ab = cj6.f275522r.mo70514xb06685ab(cj6.P8(j17, str), "msgId=?", new java.lang.String[]{"" + j17});
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3 r3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) ((c01.j8) i95.n0.c(c01.j8.class));
        r3Var.getClass();
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
            if (oVar != null) {
                oVar.g(j17);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d.b(65536, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.p3(r3Var, j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteSingleMsg post task to fts task daemon %d", java.lang.Long.valueOf(j17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSDeleteMsgLogic", e17, "syncDeleteSingleMsg", new java.lang.Object[0]);
        }
        if (mo70514xb06685ab != 0) {
            cj6.mo145247xf35bbb4("delete_id " + j17);
            xg3.l0 l0Var = new xg3.l0(Q0, "delete", Li, 0, 1);
            l0Var.f535949g = j17;
            l0Var.f535950h = Li.t0();
            cj6.m0(l0Var);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 245L, 1L, false);
        }
        return mo70514xb06685ab;
    }

    public final boolean c(bm5.v businessType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        return businessType == bm5.v.f104279i && ((java.lang.Boolean) ((jz5.n) f439739n).mo141623x754a37bb()).booleanValue();
    }

    public final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f439730e).mo141623x754a37bb()).booleanValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) ((jz5.n) f439737l).mo141623x754a37bb()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) ((jz5.n) f439733h).mo141623x754a37bb()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) ((jz5.n) f439731f).mo141623x754a37bb()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) ((jz5.n) f439732g).mo141623x754a37bb()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) f439734i).mo141623x754a37bb()).booleanValue();
    }

    public final boolean j() {
        return ((java.lang.Boolean) ((jz5.n) f439735j).mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 k(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(pt0.f0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Y5 = pt0.f0.Y5((pt0.f0) c17, str, j17, null, 4, null);
        if (Y5 != null) {
            if (Y5.m124847x74d37ac6() == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Y5.Q0(), str) && Y5.m124847x74d37ac6() != 0) {
                return Y5;
            }
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 l(java.lang.String str, long j17) {
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j17);
        if (o27 != null) {
            if (o27.I0() == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o27.Q0(), str) && o27.m124847x74d37ac6() != 0) {
                return o27;
            }
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 m(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        i95.m c17 = i95.n0.c(pt0.f0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return pt0.f0.Y5((pt0.f0) c17, msgIdTalker.a(), msgIdTalker.f231013d, null, 4, null);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 n(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(pt0.f0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return pt0.f0.Y5((pt0.f0) c17, str, j17, null, 4, null);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 o(java.lang.String str, long j17, boolean z17) {
        return ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).wi(str, j17, java.lang.Boolean.valueOf(z17));
    }

    public final java.lang.String p(java.lang.Throwable throwable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        return r26.p0.E0(jz5.a.b(throwable), 1000);
    }

    public final long q(java.lang.String str, long j17) {
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        android.database.Cursor D = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f275522r.D(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str), new java.lang.String[]{"msgSvrId"}, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        long j18 = D.moveToFirst() ? D.getLong(0) : 0L;
        D.close();
        return j18;
    }

    public final long r(oi3.g simpleMsgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        int i17 = simpleMsgInfo.f427150d;
        f9Var.m124849x5361953a(simpleMsgInfo.m75942xfb822ef2(i17 + 0));
        f9Var.o1(simpleMsgInfo.m75942xfb822ef2(i17 + 1));
        f9Var.u1(simpleMsgInfo.m75945x2fec8307(i17 + 3));
        f9Var.e1(simpleMsgInfo.m75942xfb822ef2(i17 + 2));
        f9Var.j1(simpleMsgInfo.m75939xb282bd08(i17 + 9));
        f9Var.u3(simpleMsgInfo.m75945x2fec8307(i17 + 12));
        f9Var.m124850x7650bebc(simpleMsgInfo.m75939xb282bd08(i17 + 4));
        f9Var.r1(simpleMsgInfo.m75939xb282bd08(i17 + 7));
        f9Var.f1(simpleMsgInfo.m75939xb282bd08(i17 + 10));
        int i18 = i17 + 11;
        if (r26.n0.N(simpleMsgInfo.m75945x2fec8307(i18))) {
            str = simpleMsgInfo.m75945x2fec8307(i17 + 13);
        } else {
            str = simpleMsgInfo.m75945x2fec8307(i18) + ":\n" + simpleMsgInfo.m75945x2fec8307(i17 + 13);
        }
        f9Var.d1(str);
        if (simpleMsgInfo instanceof oi3.i) {
            f9Var.i1(((oi3.i) simpleMsgInfo).j());
        }
        if (simpleMsgInfo instanceof oi3.h) {
            f9Var.i1(((oi3.h) simpleMsgInfo).j());
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public final int s(java.lang.String str, long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, msgInfo, true);
    }
}
