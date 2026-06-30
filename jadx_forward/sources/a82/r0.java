package a82;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a82.s0 f83684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f83685g;

    public r0(java.lang.String str, java.lang.String str2, a82.s0 s0Var, yz5.q qVar) {
        this.f83682d = str;
        this.f83683e = str2;
        this.f83684f = s0Var;
        this.f83685g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o72.k4 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        java.lang.String str = this.f83682d;
        o72.r2 rc6 = oj6.rc(str);
        if (rc6 == null) {
            return;
        }
        r45.re reVar = new r45.re();
        reVar.f466289d = 1;
        r45.iq0 iq0Var = new r45.iq0();
        iq0Var.f458794d = str;
        iq0Var.f458795e = rc6.f67657x2262335f;
        java.lang.String str2 = this.f83683e;
        iq0Var.f458796f = str2;
        reVar.f466290e.add(iq0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] do, sourceId = " + str + ", type = " + rc6.f67657x2262335f + ", ctx = " + str2);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a Bi = this.f83684f.f381800d.Bi();
        if (Bi != null) {
            v65.i.b(Bi, null, new a82.q0(reVar, this.f83685g, rc6, null), 1, null);
        }
    }
}
