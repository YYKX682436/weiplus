package gc0;

/* loaded from: classes5.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.f3 f351705a = new gc0.f3();

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Throwable, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 a(final java.lang.String str) {
        ?? r37;
        android.database.Cursor H0;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        gc0.q2 q2Var = gc0.q2.f351790a;
        final long b17 = q2Var.b(str);
        final long a17 = b17 + q2Var.a();
        final int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20633xe8c24a2f()) * 2;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        cj6.getClass();
        android.database.Cursor cursor = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getLimitNonSys fail, argument is invalid");
            r37 = 0;
        } else {
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                H0 = ot0.c3.l().c("getLimitSysMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n1
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.String str2 = X8;
                        java.lang.String str3 = str;
                        int i17 = c17;
                        long j17 = a17;
                        long j18 = b17;
                        ot0.z2 z2Var = ot0.z2.f430355a;
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        return z2Var.H0(g9Var.f275522r, str2, str3, i17, j17, j18, java.util.Arrays.asList(g9Var.D8()));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p1
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        return g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND createTime <= " + a17 + " AND createTime > " + b17 + " order by createTime ASC limit " + c17, null, 2);
                    }
                });
            } else if (cj6.Pb(X8)) {
                H0 = ot0.z2.f430355a.H0(cj6.f275522r, X8, str, c17, a17, b17, java.util.Arrays.asList(cj6.D8()));
            } else {
                r37 = 0;
                cursor = cj6.f275522r.f("select * from " + X8 + " where" + cj6.Z8(str) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND createTime <= " + a17 + " AND createTime > " + b17 + " order by createTime ASC limit " + c17, null, 2);
            }
            cursor = H0;
            r37 = 0;
        }
        do {
            try {
                if (!cursor.moveToNext()) {
                    vz5.b.a(cursor, r37);
                    return r37;
                }
                f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(cursor);
            } finally {
            }
        } while (!f9Var.U2());
        vz5.b.a(cursor, r37);
        return f9Var;
    }

    public final void b(java.lang.String talker, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if ((z17 || bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.p2563x2656b28b.C20642xb386d57f()) == 1) && (a17 = a(talker)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkSysTipHelper", "remove sys tip, talker: " + talker + ", msgId: " + a17.m124847x74d37ac6() + ", createdTime: " + a17.mo78012x3fdd41df());
            c01.w9.f(a17.m124847x74d37ac6(), talker);
        }
    }
}
