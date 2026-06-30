package az0;

/* loaded from: classes5.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.MJMaasCore.EnvironmentParams f15431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.maas.MJMaasCore.EnvironmentParams environmentParams) {
        super(1);
        this.f15431d = environmentParams;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.MJMaasCore.TemplateServiceParams templateServiceParams;
        com.tencent.maas.MJMaasCore.OnComplete it = (com.tencent.maas.MJMaasCore.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        az0.i5 i5Var = az0.i5.f15557a;
        i5Var.q().s(az0.b4.f15355a);
        com.tencent.maas.MJMaasCore.ILinkContextParams iLinkContextParams = new com.tencent.maas.MJMaasCore.ILinkContextParams(new com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged());
        az0.w2 w2Var = az0.w2.f15991d;
        android.opengl.EGLContext eGLContext = null;
        if (w2Var.d()) {
            w2Var.b(true);
            java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f16008x;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getEglContext ");
            rs0.h hVar = az0.w2.f15994g;
            sb6.append(hVar != null ? hVar.f399294c : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMJCaptureSessionPreload", sb6.toString());
            rs0.h hVar2 = az0.w2.f15994g;
            if (hVar2 != null) {
                eGLContext = hVar2.f399294c;
            }
        }
        com.tencent.maas.MJMaasCore.RenderingParams renderingParams = new com.tencent.maas.MJMaasCore.RenderingParams(false, ((h62.d) i5Var.p()).Ni(e42.c0.clicfg_finder_maas_core_preload_img_seq_enable, 0) == 1, "", eGLContext);
        com.tencent.maas.MJMaasCore q17 = i5Var.q();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.maas.MJMaasCore.ILinkParams iLinkParams = new com.tencent.maas.MJMaasCore.ILinkParams(iLinkContextParams, "wechat", "", "", az0.d4.f15404a);
        com.tencent.maas.MJMaasCore.EnvironmentParams environmentParams = this.f15431d;
        com.tencent.maas.MJMaasCore.LoggingParams loggingParams = new com.tencent.maas.MJMaasCore.LoggingParams(com.tencent.mm.xeffect.XEffectLog.a(), com.tencent.maas.MJMaasCore.LogLevel.INFO);
        com.tencent.maas.MJMaasCore.WarmupParams warmupParams = new com.tencent.maas.MJMaasCore.WarmupParams(com.tencent.mm.vfs.w6.i(oz0.c.f350201g.d(), false), com.tencent.mm.vfs.w6.i(oz0.c.f350202h.d(), false), false);
        int Ni = ((h62.d) i5Var.p()).Ni(e42.c0.clicfg_finder_miaojian_finder_camo_use_cdn_download, 0);
        com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider = az0.i5.f15572p;
        nz0.j jVar = nz0.j.f341516a;
        if (Ni == 1) {
            defpackage.t tVar = new defpackage.t();
            az0.i5.f15579w = tVar;
            az0.i5.f15578v = new com.tencent.maas.camstudio.MJCDNBridgeService(new android.os.Handler(android.os.Looper.getMainLooper()), tVar);
            tVar.f414254d = new java.lang.ref.WeakReference(az0.i5.f15578v);
            nz0.o oVar = nz0.o.f341530a;
            templateServiceParams = new com.tencent.maas.MJMaasCore.TemplateServiceParams(jVar, templateServiceProvider, az0.i5.f15578v);
        } else {
            nz0.o oVar2 = nz0.o.f341530a;
            templateServiceParams = new com.tencent.maas.MJMaasCore.TemplateServiceParams(jVar, templateServiceProvider);
        }
        return q17.u(context, iLinkParams, environmentParams, loggingParams, warmupParams, templateServiceParams, renderingParams, it);
    }
}
