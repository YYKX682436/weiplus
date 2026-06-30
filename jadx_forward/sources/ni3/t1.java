package ni3;

/* loaded from: classes12.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f419271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u3 f419272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f419273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f419274g;

    public t1(ni3.g2 g2Var, long j17, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, long j18) {
        this.f419274g = g2Var;
        this.f419271d = j17;
        this.f419272e = u3Var;
        this.f419273f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            long j17 = this.f419271d;
            z65.c.f551993f = j17;
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_FLAG_LONG, java.lang.Long.valueOf(j17));
            long j18 = this.f419273f;
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = this.f419272e;
            if (u3Var != null) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f419274g.f419132x), u3Var, java.lang.Long.valueOf(j18));
        }
    }
}
