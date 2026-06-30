package hy2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f f367595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f) {
        super(0);
        this.f367595d = c15485xead19c2f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = this.f367595d;
        if (c15485xead19c2f.Q6()) {
            long c17 = (c01.id.c() - c15485xead19c2f.f218269m) + c15485xead19c2f.f218268i;
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "getInstance(...)");
            calendar.setTimeInMillis(c01.id.c());
            calendar.set(11, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CLEAR_TIME_LONG_SYNC;
            if (timeInMillis >= c18.t(u3Var, 0L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "ClearEnjoyFinderTime on 0 time");
                long c19 = c01.id.c();
                c15485xead19c2f.f218269m = c19;
                c15485xead19c2f.f218268i = 0L;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(c15485xead19c2f.f218268i));
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c19));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, java.lang.Long.valueOf(c15485xead19c2f.f218268i));
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
            boolean o17 = c27.o(u3Var2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "checkTeemModeLimit: currentEnjoyFinderMs=" + c17 + " , hasCurFewClose=" + o17);
            if (c15485xead19c2f.R6()) {
                long c28 = c01.id.c();
                long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, c28);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeLimitVM", "checkTeemModeLimit: isInLimitTimeRange, currentTime=" + c28 + ", lastTime=" + t17);
                if (!o17 || c28 - t17 >= 57600000) {
                    c15485xead19c2f.S6(true);
                }
            } else if (o17) {
                gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
            }
            if (c17 >= hy2.g.f367591a.c() * 1000) {
                c15485xead19c2f.S6(false);
            }
        } else {
            c15485xead19c2f.V6();
        }
        return jz5.f0.f384359a;
    }
}
