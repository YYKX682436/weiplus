package ai4;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ai4.b0 f86656a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f86657b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f86658c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f86659d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f86660e;

    /* renamed from: f, reason: collision with root package name */
    public static int f86661f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f86662g;

    static {
        ai4.b0 b0Var = new ai4.b0();
        f86656a = b0Var;
        f86657b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        f86660e = jz5.h.b(ai4.r.f86724d);
        f86662g = jz5.h.b(ai4.n.f86708d);
        f86658c = true;
        boolean z17 = b0Var.g() && b0Var.f();
        f86659d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "init canTransferAff=true, canReadFromAff=" + z17 + ", thread=" + java.lang.Thread.currentThread().getName());
        int i17 = h.h.f359300a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p3325xe03a0797.p3326xc267989b.f1 a(ai4.b0 b0Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, ai4.a aVar, yz5.l lVar) {
        java.lang.String c17 = b0Var.c(aVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f86657b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "checkStartTransferJob: " + aVar.name() + ", isDone=" + o4Var.h(c17));
        if (o4Var.h(c17)) {
            return new p3325xe03a0797.p3326xc267989b.a0(null);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = aVar.ordinal() + 1;
        java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
        p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new ai4.p(ordinal, valueOf, lVar, null), 3, null);
        ((p3325xe03a0797.p3326xc267989b.c3) b17).p(new ai4.o(currentTimeMillis, b17, c17, aVar, ordinal, valueOf));
        return b17;
    }

    public final java.lang.String b(int i17) {
        return "V7_T2_P13_TimeCost_StatusAffDBTransfer_" + i17 + '_' + gm0.j1.b().h();
    }

    public final java.lang.String c(ai4.a type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return "V7_T2_P13_Is_Done_StatusAffDBTransfer_Job_" + gm0.j1.b().h() + '_' + type.name();
    }

    public final java.lang.String d() {
        return "V7_T2_P13_StatusAffDBTransfer_StartNum_" + gm0.j1.b().h();
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f86660e).mo141623x754a37bb()).intValue();
    }

    public final boolean f() {
        java.lang.String c17 = c(ai4.a.f86648f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f86657b;
        boolean z17 = o4Var.h(c17) && o4Var.h(c(ai4.a.f86649g)) && o4Var.h(c(ai4.a.f86650h));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "hasFinishTransferAffLikeCommentDB: " + z17);
        return z17;
    }

    public final boolean g() {
        java.lang.String c17 = c(ai4.a.f86646d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f86657b;
        boolean z17 = o4Var.h(c17) && o4Var.h(c(ai4.a.f86647e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "hasFinishTransferAffMainStatusDB: " + z17);
        return z17;
    }

    public final boolean h(mj4.l lVar) {
        java.lang.String str = lVar.f76607xcd7d4a17;
        bw5.sl0 m117398x6b618099 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117398x6b618099(ai4.f.f86672a.g(lVar, str == null || r26.n0.N(str) ? mj4.m.a(lVar) : ""));
        if (m117398x6b618099 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "insertAffLike: resp null");
            return false;
        }
        if (m117398x6b618099.f114573d) {
            return true;
        }
        int i17 = m117398x6b618099.f114574e;
        boolean[] zArr = m117398x6b618099.f114577h;
        if (i17 == -7) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertAffLike: db exist newer data, ");
            sb6.append(zArr[3] ? m117398x6b618099.f114575f : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
            return true;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insertAffLike: failed ");
        sb7.append(m117398x6b618099.f114574e);
        sb7.append(", ");
        sb7.append(zArr[3] ? m117398x6b618099.f114575f : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusAffDBTransfer", sb7.toString());
        return false;
    }

    public final void i() {
        java.lang.String str = "V7_T2_P13_StateDailyReportTime_StatusAffDBTransfer_" + gm0.j1.b().h();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f86657b;
        if (java.lang.System.currentTimeMillis() - o4Var.q(str, 0L) < 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", "reportTransferDBStateTimely: skip");
            return;
        }
        boolean z17 = f86658c;
        qj4.s.f445491a.r(z17 && g() && f() ? 48 : z17 ? o4Var.n(d()) >= e() ? 64 : 32 : 16, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
        o4Var.B(str, java.lang.System.currentTimeMillis());
    }
}
