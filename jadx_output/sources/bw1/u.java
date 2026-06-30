package bw1;

@j95.b
/* loaded from: classes12.dex */
public class u extends i95.w {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f24844i = mm.k.f328518y.h();

    /* renamed from: d, reason: collision with root package name */
    public ob0.d f24845d = null;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f24846e = new long[5];

    /* renamed from: f, reason: collision with root package name */
    public final bw1.n f24847f = new bw1.o(this);

    /* renamed from: g, reason: collision with root package name */
    public final bw1.n f24848g = new bw1.q(this);

    /* renamed from: h, reason: collision with root package name */
    public final bw1.n f24849h = new bw1.r(this);

    public static synchronized bw1.u wi() {
        bw1.u uVar;
        synchronized (bw1.u.class) {
            uVar = (bw1.u) i95.n0.c(bw1.u.class);
        }
        return uVar;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "summerclean onAccountPostReset updated");
        q25.b.b(new bw1.a(), "//clean");
        mt1.b0 b0Var = mt1.b0.f331191a;
        aw1.p0 p0Var = aw1.p0.f14630a;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        mt1.b0.f331195e = new mt1.e();
        if (!mt1.e0.f331214b) {
            mt1.e eVar = mt1.b0.f331195e;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context2.registerReceiver(eVar, intentFilter);
        }
        try {
            p0Var.l();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "rescueConvertWxamError error, msg = " + th6.getMessage());
        }
        try {
            p0Var.k();
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "rescueConvertH265Error error, msg = " + th7.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VFSExpireCallbackManager", "reportExpireOriginC2CMedia");
        com.tencent.mm.vfs.e7 e7Var = com.tencent.mm.vfs.e7.f212911a;
        e7Var.b("c2c_origin_image", new aw1.h1());
        e7Var.b("c2c_origin_video", new aw1.i1());
        try {
            aw1.l0.f14568a.m();
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "tryToResumeCompressMediaTaskAsync error, msg = " + th8.getMessage());
        }
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("LinkifyError", false)) {
            mt1.q0.f331258a.i();
        }
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("DownloadMigrationError", false)) {
            mt1.q0.f331258a.h();
        }
        mt1.b0.f331204n.alive();
        if (aw1.m.f14589a.l()) {
            if (z65.c.a()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            if (z17 || c06.e.f37716d.d(1000) != 0) {
                com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J(aw1.m.f14604p, gm0.j1.b().h(), 1);
                com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J(aw1.m.f14605q, gm0.j1.b().h(), 1);
                java.lang.String h17 = gm0.j1.u().h();
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "onFileOpen, start, accountPath = " + h17);
                kotlin.jvm.internal.o.d(h17);
                java.lang.String p07 = r26.n0.p0(h17, "com.tencent.mm", h17);
                com.tencent.matrix.trace.tracer.FileHookTracer fileHookTracer = new com.tencent.matrix.trace.tracer.FileHookTracer();
                com.tencent.matrix.trace.tracer.FileHookTracer.f53003f = p07;
                com.tencent.matrix.trace.tracer.FileHookTracer.f53004g = new java.lang.String[]{"libbbcr11.so", "libbvv5yde.so", "libkxqpplatform.so", "libe7inxj6bn2lm.so", "libglr1cs.so", "libq4uey6gtlcih5.so"};
                com.tencent.matrix.trace.tracer.FileHookTracer.f53002e = new aw1.g(J2, J3);
                fileHookTracer.d();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "checkNewWildFileFromMMKV not this time");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "hookFile, expt false return");
        }
        if (f24844i) {
            this.f24845d = new com.tencent.mm.plugin.clean.model.SubCoreClean$CalcWxCallback();
            ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(this.f24845d);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
        this.f24847f.a(true);
        this.f24848g.a(true);
        this.f24849h.a(true);
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.e eVar = mt1.b0.f331195e;
        if (eVar != null) {
            if (!mt1.e0.f331214b) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(eVar);
            }
            eVar.a();
        }
        if (this.f24845d != null) {
            ob0.f fVar = (ob0.f) i95.n0.c(ob0.f.class);
            ob0.d callback = this.f24845d;
            com.tencent.mm.feature.performance.adpf.s0 s0Var = (com.tencent.mm.feature.performance.adpf.s0) fVar;
            s0Var.getClass();
            kotlin.jvm.internal.o.g(callback, "callback");
            java.util.Iterator it = com.tencent.mm.feature.performance.adpf.x1.f67507f.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.tencent.mm.feature.performance.adpf.x1) obj).b(callback)) {
                        break;
                    }
                }
            }
            com.tencent.mm.feature.performance.adpf.x1 x1Var = (com.tencent.mm.feature.performance.adpf.x1) obj;
            kotlin.jvm.internal.o.d(x1Var);
            x1Var.i(callback);
            if (x1Var.j() == 0) {
                x1Var.h();
                com.tencent.mm.feature.performance.adpf.x1.f67507f.a().remove(x1Var);
            }
            s0Var.Ai();
            this.f24845d = null;
        }
        q25.b.c("//clean");
    }
}
