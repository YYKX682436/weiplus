package g90;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f351285h;

    public r(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, int i19) {
        this.f351281d = sVar;
        this.f351282e = f9Var;
        this.f351283f = i17;
        this.f351284g = i18;
        this.f351285h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351281d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351282e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f351283f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f351284g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351285h));
        lVarArr[4] = new jz5.l("origin_type", java.lang.Integer.valueOf(f9Var.A0() == 1 ? 2 : 1));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("view_origin_btn", "view_exp", i17, 32337);
    }
}
