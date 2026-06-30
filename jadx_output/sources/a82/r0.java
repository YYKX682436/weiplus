package a82;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a82.s0 f2151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f2152g;

    public r0(java.lang.String str, java.lang.String str2, a82.s0 s0Var, yz5.q qVar) {
        this.f2149d = str;
        this.f2150e = str2;
        this.f2151f = s0Var;
        this.f2152g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        java.lang.String str = this.f2149d;
        o72.r2 rc6 = oj6.rc(str);
        if (rc6 == null) {
            return;
        }
        r45.re reVar = new r45.re();
        reVar.f384756d = 1;
        r45.iq0 iq0Var = new r45.iq0();
        iq0Var.f377261d = str;
        iq0Var.f377262e = rc6.field_type;
        java.lang.String str2 = this.f2150e;
        iq0Var.f377263f = str2;
        reVar.f384757e.add(iq0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] do, sourceId = " + str + ", type = " + rc6.field_type + ", ctx = " + str2);
        com.tencent.mm.sdk.coroutines.LifecycleScope Bi = this.f2151f.f300267d.Bi();
        if (Bi != null) {
            v65.i.b(Bi, null, new a82.q0(reVar, this.f2152g, rc6, null), 1, null);
        }
    }
}
