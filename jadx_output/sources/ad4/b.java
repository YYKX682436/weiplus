package ad4;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad4.d f3173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ad4.d dVar) {
        super(0);
        this.f3173d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        ad4.d dVar = this.f3173d;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            kotlin.jvm.internal.o.d(Zi);
            if (r26.n0.B(Zi, lowerCase, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "model %s is hit, expt:%s", lowerCase, Zi);
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.zm b17 = dVar.b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int i17 = b17.f171701b;
            boolean z18 = i17 == 2 || i17 == 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "2G/3G autoplay false");
            } else {
                com.tencent.mm.plugin.sns.ui.zm b18 = dVar.b();
                b18.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                r9 = b18.f171701b == 5;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (r9) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "wifi autoplay true");
                    r9 = true;
                } else {
                    java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
                    kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
                    r9 = ((java.lang.Boolean) m18).booleanValue();
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "autoPlay DynamicConfig false");
            r9 = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "autoPlay:%s", java.lang.Boolean.valueOf(r9));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(r9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
        return valueOf;
    }
}
