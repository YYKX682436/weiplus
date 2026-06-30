package cl4;

/* loaded from: classes11.dex */
public final class r implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f42963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl4.v f42965c;

    public r(bw5.lp0 lp0Var, android.app.Activity activity, cl4.v vVar) {
        this.f42963a = lp0Var;
        this.f42964b = activity;
        this.f42965c = vVar;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        java.lang.String str2;
        bw5.z90 j17;
        bw5.lp0 lp0Var = this.f42963a;
        java.lang.String d17 = rk4.j5.d(lp0Var);
        r45.xs4 f17 = this.f42965c.f(lp0Var);
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(36);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(rk4.j5.a(lp0Var));
        bw5.v70 d18 = lp0Var.d();
        if (d18 == null || (str2 = d18.getListenId()) == null) {
            str2 = "";
        }
        jq0Var.i(str2);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.I0(rk4.j5.k(lp0Var));
        gp0Var.J0(rk4.j5.k(lp0Var));
        gp0Var.K0(rk4.j5.l(lp0Var));
        gp0Var.o0(d17);
        gp0Var.x0(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favMusic listenId: ");
        bw5.v70 d19 = lp0Var.d();
        java.lang.String str3 = null;
        sb6.append(d19 != null ? d19.getListenId() : null);
        sb6.append(", title:");
        bw5.v70 d27 = lp0Var.d();
        sb6.append(d27 != null ? d27.getTitle() : null);
        sb6.append(", coverThumbPath: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", sb6.toString());
        if (str == null || str.length() == 0) {
            gp0Var.z0(true);
        } else {
            gp0Var.B0(str);
        }
        gp0Var.O0(rk4.j5.j(lp0Var));
        gp0Var.m0(rk4.j5.c(lp0Var));
        gp0Var.h0(32);
        gp0Var.D0(d17);
        bw5.v70 d28 = lp0Var.d();
        if (d28 != null && (j17 = d28.j()) != null) {
            str3 = j17.g();
        }
        gp0Var.E0(str3);
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.C = f17;
        gp0Var.J1 = hp0Var;
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String j18 = rk4.j5.j(lp0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = j18;
        c4Var.f6319e = rk4.j5.c(lp0Var);
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 32;
        c4Var.f6323i = this.f42964b;
        c4Var.f6327m = 3;
        pm0.v.X(new cl4.s(doFavoriteEvent));
    }
}
