package cl4;

/* loaded from: classes9.dex */
public final class o implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f124490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f124492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl4.v f124493d;

    public o(bw5.o50 o50Var, android.app.Activity activity, int i17, cl4.v vVar) {
        this.f124490a = o50Var;
        this.f124491b = activity;
        this.f124492c = i17;
        this.f124493d = vVar;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        bw5.o50 o50Var = this.f124490a;
        java.lang.String k17 = il4.d.k(o50Var);
        if (k17 == null) {
            k17 = "";
        }
        cl4.v vVar = this.f124493d;
        vVar.getClass();
        r45.km6 km6Var = new r45.km6();
        km6Var.f460371d = o50Var.f112497n;
        km6Var.f460372e = il4.d.e(o50Var);
        java.lang.String c17 = o50Var.c();
        km6Var.f460373f = c17 != null ? c17 : "";
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.O0(o50Var.m12637xfb82e301());
        gp0Var.m0(vVar.a(o50Var));
        gp0Var.h0(33);
        gp0Var.K0(o50Var.m12638xb5887639());
        gp0Var.o0(k17);
        gp0Var.x0(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", "favAlbum title: " + o50Var.m12637xfb82e301() + ", categoryId: " + o50Var.c() + ", coverThumbPath: " + str + ", desc: " + gp0Var.f456941f);
        if (str == null || str.length() == 0) {
            gp0Var.z0(true);
        } else {
            gp0Var.B0(str);
        }
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.G = km6Var;
        gp0Var.J1 = hp0Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.lang.String m12637xfb82e301 = o50Var.m12637xfb82e301();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = m12637xfb82e301;
        c4Var.f87852e = vVar.a(o50Var);
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(36);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.i(o50Var.c());
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 33;
        c4Var.f87856i = this.f124491b;
        c4Var.f87860m = this.f124492c;
        pm0.v.X(new cl4.p(c5303xc75d2f73));
    }
}
