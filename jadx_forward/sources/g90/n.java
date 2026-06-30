package g90;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f351259h;

    public n(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17, int i18) {
        this.f351255d = sVar;
        this.f351256e = f9Var;
        this.f351257f = str;
        this.f351258g = i17;
        this.f351259h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351255d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351256e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[1] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351258g));
        lVarArr[2] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        lVarArr[3] = new jz5.l("clk_play_status", java.lang.Integer.valueOf(this.f351259h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj(this.f351257f, "view_clk", i17, 32337);
    }
}
