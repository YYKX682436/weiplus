package ih1;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f373055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f373056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ih1.u uVar, long j17, android.app.Activity activity) {
        super(0);
        this.f373054d = uVar;
        this.f373055e = j17;
        this.f373056f = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f373054d;
        sb6.append(uVar.f373063a);
        sb6.append("], prepare");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        uVar.f373065c = ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ai(new ih1.p(uVar), uVar.f373063a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "prepare on thread " + java.lang.Thread.currentThread().getName() + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        iq0.c cVar = uVar.f373065c;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).wi(cVar, this.f373056f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "active on thread " + java.lang.Thread.currentThread().getName() + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + " ms");
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("appId[");
        sb7.append(uVar.f373063a);
        sb7.append("], start done, cost:%s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb7.toString(), java.lang.String.valueOf(currentTimeMillis3 - this.f373055e));
        return jz5.f0.f384359a;
    }
}
