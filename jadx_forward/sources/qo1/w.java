package qo1;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f447092e;

    public w(qo1.f0 f0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var) {
        this.f447091d = f0Var;
        this.f447092e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        long j18;
        long j19;
        qo1.f0 f0Var = this.f447091d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = f0Var.f447008a.f297365g;
        int i17 = uVar != null ? uVar.f297521d : 0;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447092e;
        if (n0Var.f297461d > 2) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c17 = a2Var.c();
            j17 = c17.f297480e;
            j19 = c17.f297481f;
            j18 = (1000 * j17) / (1 + j19);
        } else {
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report31328 ROAM_REPORT_KV, type = ");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var2 = f0Var.f447012e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var2);
        sb6.append(a2Var2.a().f297444p.f297470d);
        sb6.append(", state = ");
        sb6.append(n0Var);
        sb6.append(", deviceType = ");
        sb6.append(i17);
        sb6.append(", avgSpeed = ");
        sb6.append(j18);
        sb6.append(", transferredSize = ");
        sb6.append(j17);
        sb6.append(", elapsedTime = ");
        sb6.append(j19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        jx3.f fVar = jx3.f.INSTANCE;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var3 = f0Var.f447012e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var3);
        fVar.d(31328, 1, java.lang.Integer.valueOf(a2Var3.a().f297444p.f297470d), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(n0Var.f297461d));
    }
}
