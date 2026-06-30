package dk2;

/* loaded from: classes3.dex */
public final class rd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.rd f315569d = new dk2.rd();

    public rd() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heartBeatGuard it.isLiveStarted():");
            sb6.append(((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).a8());
            sb6.append(" heartbeatGuardEnable:");
            sb6.append(dk2.x7.f315867a > 0);
            sb6.append(" liveId:");
            r45.nw1 nw1Var = e1Var.f410521r;
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
            sb6.append(" HEART_BEAT_GUARD_INTERVAL:");
            sb6.append(dk2.x7.f315867a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuard", sb6.toString());
            if (dk2.x7.f315867a > 0) {
                if (((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).a8()) {
                    r45.nw1 nw1Var2 = e1Var.f410521r;
                    dk2.xc xcVar = new dk2.xc(nw1Var2 != null ? nw1Var2.m75942xfb822ef2(0) : 0L);
                    wu5.c cVar = dk2.x7.f315868b;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    long j17 = dk2.x7.f315867a;
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    dk2.x7.f315868b = t0Var.z(xcVar, j17, false);
                } else {
                    wu5.c cVar2 = dk2.x7.f315868b;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
