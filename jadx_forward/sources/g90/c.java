package g90;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f351201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f351202i;

    public c(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, int i19, int i27) {
        this.f351197d = sVar;
        this.f351198e = f9Var;
        this.f351199f = i17;
        this.f351200g = i18;
        this.f351201h = i19;
        this.f351202i = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351197d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351198e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f351199f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f351200g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351201h));
        lVarArr[4] = new jz5.l("pic_video_menu_btn", java.lang.Integer.valueOf(this.f351202i));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("chat_pic_video_menu_btn", "view_clk", i17, 32337);
    }
}
