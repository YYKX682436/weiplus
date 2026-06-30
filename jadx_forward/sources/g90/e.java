package g90;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351212e;

    public e(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f351211d = sVar;
        this.f351212e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351211d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351212e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("pic_video_is_ori", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 0)), new jz5.l("pic_video_with_original", 0), new jz5.l("has_origin_visual", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384366d).booleanValue() ? 1 : 0)), new jz5.l("chat_visual_send_ts", java.lang.Long.valueOf(f9Var.mo78012x3fdd41df())));
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("wx_chat_pic_video", "view_clk", i17, 32337);
    }
}
