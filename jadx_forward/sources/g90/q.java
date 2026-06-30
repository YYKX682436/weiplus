package g90;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f351280h;

    public q(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, int i19) {
        this.f351276d = sVar;
        this.f351277e = f9Var;
        this.f351278f = i17;
        this.f351279g = i18;
        this.f351280h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351276d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351277e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f351278f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f351279g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351280h));
        lVarArr[4] = new jz5.l("origin_type", java.lang.Integer.valueOf(g90.s.Ai(sVar, f9Var)));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("view_origin_btn", "view_clk", i17, 32337);
    }
}
