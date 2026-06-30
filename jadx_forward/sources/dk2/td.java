package dk2;

/* loaded from: classes3.dex */
public final class td extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f315663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        super(0);
        this.f315663d = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17 = this.f315663d.f391654d;
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keepAliveGuard it.isLiveStarted():");
            sb6.append(((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).a8());
            sb6.append(" heartbeatGuardEnable:");
            sb6.append(dk2.x7.f315867a > 0);
            sb6.append(" liveId:");
            r45.nw1 nw1Var = e1Var.f410521r;
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
            sb6.append(" HEART_BEAT_GUARD_INTERVAL:");
            sb6.append(dk2.x7.f315867a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuard", sb6.toString());
            if (dk2.x7.f315869c) {
                if (((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).a8()) {
                    dk2.zc zcVar = new dk2.zc(e1Var.f410521r.m75942xfb822ef2(0));
                    wu5.c cVar = dk2.x7.f315870d;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                    t0Var.getClass();
                    dk2.x7.f315870d = t0Var.z(zcVar, j17 + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, false);
                } else {
                    wu5.c cVar2 = dk2.x7.f315870d;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
