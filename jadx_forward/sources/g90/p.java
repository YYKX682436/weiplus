package g90;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f351271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f351272h;

    public p(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, float f17, float f18) {
        this.f351268d = sVar;
        this.f351269e = f9Var;
        this.f351270f = i17;
        this.f351271g = f17;
        this.f351272h = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351268d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351269e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[1] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351270f));
        lVarArr[2] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        lVarArr[3] = new jz5.l("is_origin_expired", java.lang.Integer.valueOf(g90.s.Bi(sVar, f9Var) ? 1 : 0));
        lVarArr[4] = new jz5.l("before_speed_select", java.lang.Float.valueOf(this.f351271g));
        lVarArr[5] = new jz5.l("speed_select", java.lang.Float.valueOf(this.f351272h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("video_speed", "view_clk", i17, 32337);
    }
}
