package az0;

/* loaded from: classes5.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.EnvironmentParams f96964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.EnvironmentParams environmentParams) {
        super(1);
        this.f96964d = environmentParams;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceParams templateServiceParams;
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete it = (com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        az0.i5 i5Var = az0.i5.f97090a;
        i5Var.q().s(az0.b4.f96888a);
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams iLinkContextParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams(new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged());
        az0.w2 w2Var = az0.w2.f97524d;
        android.opengl.EGLContext eGLContext = null;
        if (w2Var.d()) {
            w2Var.b(true);
            java.util.concurrent.CountDownLatch countDownLatch = az0.w2.f97541x;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getEglContext ");
            rs0.h hVar = az0.w2.f97527g;
            sb6.append(hVar != null ? hVar.f480827c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMJCaptureSessionPreload", sb6.toString());
            rs0.h hVar2 = az0.w2.f97527g;
            if (hVar2 != null) {
                eGLContext = hVar2.f480827c;
            }
        }
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.RenderingParams renderingParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.RenderingParams(false, ((h62.d) i5Var.p()).Ni(e42.c0.clicfg_finder_maas_core_preload_img_seq_enable, 0) == 1, "", eGLContext);
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 q17 = i5Var.q();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkParams iLinkParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkParams(iLinkContextParams, "wechat", "", "", az0.d4.f96937a);
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.EnvironmentParams environmentParams = this.f96964d;
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingParams loggingParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingParams(com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.a(), com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.INFO);
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.WarmupParams warmupParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.WarmupParams(com.p314xaae8f345.mm.vfs.w6.i(oz0.c.f431734g.d(), false), com.p314xaae8f345.mm.vfs.w6.i(oz0.c.f431735h.d(), false), false);
        int Ni = ((h62.d) i5Var.p()).Ni(e42.c0.clicfg_finder_miaojian_finder_camo_use_cdn_download, 0);
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider = az0.i5.f97105p;
        nz0.j jVar = nz0.j.f423049a;
        if (Ni == 1) {
            p000.t tVar = new p000.t();
            az0.i5.f97112w = tVar;
            az0.i5.f97111v = new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c(new android.os.Handler(android.os.Looper.getMainLooper()), tVar);
            tVar.f495787d = new java.lang.ref.WeakReference(az0.i5.f97111v);
            nz0.o oVar = nz0.o.f423063a;
            templateServiceParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceParams(jVar, templateServiceProvider, az0.i5.f97111v);
        } else {
            nz0.o oVar2 = nz0.o.f423063a;
            templateServiceParams = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceParams(jVar, templateServiceProvider);
        }
        return q17.u(context, iLinkParams, environmentParams, loggingParams, warmupParams, templateServiceParams, renderingParams, it);
    }
}
