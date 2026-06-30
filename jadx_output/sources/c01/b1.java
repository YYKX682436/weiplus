package c01;

/* loaded from: classes11.dex */
public final class b1 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.b1 f37068d = new c01.b1();

    @Override // uh4.i0
    public final void onDataChanged() {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        boolean z17 = (isTeenMode == c01.d1.f37100g && h47 == c01.d1.f37101h) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTeenModeService", "onTeenModeDataChanged isTeenMode: %b, bizAcctOption: %d, isChanged: %b", java.lang.Boolean.valueOf(isTeenMode), java.lang.Integer.valueOf(h47), java.lang.Boolean.valueOf(z17));
        if (z17) {
            c01.d1.f37100g = isTeenMode;
            c01.d1.f37101h = h47;
            c01.d1 d1Var = c01.d1.f37097d;
            com.tencent.mm.sdk.platformtools.o4 o4Var = c01.d1.f37099f;
            if (o4Var != null) {
                o4Var.putBoolean("is_teen_mode", c01.d1.f37100g);
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = c01.d1.f37099f;
            if (o4Var2 != null) {
                o4Var2.putInt("biz_teen_mode_acct_option", c01.d1.f37101h);
            }
            if (((zq1.a0) gm0.j1.s(zq1.a0.class)) != null) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i.getClass();
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.a();
            }
        }
    }
}
