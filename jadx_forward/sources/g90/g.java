package g90;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351221g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f351222h;

    public g(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, java.util.Map map) {
        this.f351218d = sVar;
        this.f351219e = f9Var;
        this.f351220f = i17;
        this.f351221g = i18;
        this.f351222h = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351218d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351219e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351220f));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f351221g));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        bm5.j0.a(i17, this.f351222h);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("ChatPicVideoItemPage", "view_exp", i17, 32337);
    }
}
