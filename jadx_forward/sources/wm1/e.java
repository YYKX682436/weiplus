package wm1;

/* loaded from: classes11.dex */
public final class e implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f528752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f528753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wm1.h f528754c;

    public e(bw5.lp0 lp0Var, android.app.Activity activity, wm1.h hVar) {
        this.f528752a = lp0Var;
        this.f528753b = activity;
        this.f528754c = hVar;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        bw5.z90 j17;
        bw5.lp0 lp0Var = this.f528752a;
        java.lang.String d17 = rk4.j5.d(lp0Var);
        r45.xs4 c17 = this.f528754c.c(lp0Var);
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(36);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(rk4.j5.a(lp0Var));
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.I0(rk4.j5.k(lp0Var));
        gp0Var.J0(rk4.j5.k(lp0Var));
        gp0Var.K0(rk4.j5.l(lp0Var));
        gp0Var.o0(d17);
        gp0Var.x0(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favMusic listenId: ");
        bw5.v70 d18 = lp0Var.d();
        java.lang.String str2 = null;
        sb6.append(d18 != null ? d18.m13170xcc16feb8() : null);
        sb6.append(", title:");
        bw5.v70 d19 = lp0Var.d();
        sb6.append(d19 != null ? d19.m13171x7531c8a2() : null);
        sb6.append(", coverThumbPath: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", sb6.toString());
        if (str == null || str.length() == 0) {
            gp0Var.z0(true);
        } else {
            gp0Var.B0(str);
        }
        gp0Var.O0(rk4.j5.j(lp0Var));
        gp0Var.m0(rk4.j5.c(lp0Var));
        gp0Var.h0(32);
        gp0Var.D0(d17);
        bw5.v70 d27 = lp0Var.d();
        if (d27 != null && (j17 = d27.j()) != null) {
            str2 = j17.g();
        }
        gp0Var.E0(str2);
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.C = c17;
        gp0Var.J1 = hp0Var;
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.lang.String j18 = rk4.j5.j(lp0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = j18;
        c4Var.f87852e = rk4.j5.c(lp0Var);
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 32;
        c4Var.f87856i = this.f528753b;
        c4Var.f87860m = 3;
        pm0.v.X(new wm1.f(c5303xc75d2f73));
    }
}
