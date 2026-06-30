package af1;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final af1.f f4468d = new af1.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean z18 = false;
        if (((af1.e) i95.n0.c(af1.e.class)) != null) {
            if (z65.c.a()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var != null) {
                z17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_wxa_video_interrupt_cache, z17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "cancelCacheWhenPlay, expt is " + z17);
            }
            java.lang.Boolean valueOf = com.tencent.mm.sdk.platformtools.o4.M("xweb_abtest_command").contains("video_cancel_cache_when_play_command_value") ? java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("xweb_abtest_command").getBoolean("video_cancel_cache_when_play_command_value", false)) : null;
            if (valueOf != null) {
                z17 = valueOf.booleanValue();
            }
            z18 = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "cancelCacheWhenPlay: " + z18);
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
