package bw1;

@j95.b
/* loaded from: classes12.dex */
public class u extends i95.w {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f106377i = mm.k.f410051y.h();

    /* renamed from: d, reason: collision with root package name */
    public ob0.d f106378d = null;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f106379e = new long[5];

    /* renamed from: f, reason: collision with root package name */
    public final bw1.n f106380f = new bw1.o(this);

    /* renamed from: g, reason: collision with root package name */
    public final bw1.n f106381g = new bw1.q(this);

    /* renamed from: h, reason: collision with root package name */
    public final bw1.n f106382h = new bw1.r(this);

    public static synchronized bw1.u wi() {
        bw1.u uVar;
        synchronized (bw1.u.class) {
            uVar = (bw1.u) i95.n0.c(bw1.u.class);
        }
        return uVar;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "summerclean onAccountPostReset updated");
        q25.b.b(new bw1.a(), "//clean");
        mt1.b0 b0Var = mt1.b0.f412724a;
        aw1.p0 p0Var = aw1.p0.f96163a;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        mt1.b0.f412728e = new mt1.e();
        if (!mt1.e0.f412747b) {
            mt1.e eVar = mt1.b0.f412728e;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "rescueConvertWxamError error, msg = " + th6.getMessage());
        }
        try {
            p0Var.k();
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "rescueConvertH265Error error, msg = " + th7.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSExpireCallbackManager", "reportExpireOriginC2CMedia");
        com.p314xaae8f345.mm.vfs.e7 e7Var = com.p314xaae8f345.mm.vfs.e7.f294444a;
        e7Var.b("c2c_origin_image", new aw1.h1());
        e7Var.b("c2c_origin_video", new aw1.i1());
        try {
            aw1.l0.f96101a.m();
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "tryToResumeCompressMediaTaskAsync error, msg = " + th8.getMessage());
        }
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("LinkifyError", false)) {
            mt1.q0.f412791a.i();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("DownloadMigrationError", false)) {
            mt1.q0.f412791a.h();
        }
        mt1.b0.f412737n.m43071x58998cd();
        if (aw1.m.f96122a.l()) {
            if (z65.c.a()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            if (z17 || c06.e.f119249d.d(1000) != 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J(aw1.m.f96137p, gm0.j1.b().h(), 1);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J(aw1.m.f96138q, gm0.j1.b().h(), 1);
                java.lang.String h17 = gm0.j1.u().h();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "onFileOpen, start, accountPath = " + h17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
                java.lang.String p07 = r26.n0.p0(h17, "com.tencent.mm", h17);
                com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4712x4e8b658c c4712x4e8b658c = new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4712x4e8b658c();
                com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4712x4e8b658c.f134536f = p07;
                com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4712x4e8b658c.f134537g = new java.lang.String[]{"libbbcr11.so", "libbvv5yde.so", "libkxqpplatform.so", "libe7inxj6bn2lm.so", "libglr1cs.so", "libq4uey6gtlcih5.so"};
                com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4712x4e8b658c.f134535e = new aw1.g(J2, J3);
                c4712x4e8b658c.d();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "checkNewWildFileFromMMKV not this time");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "hookFile, expt false return");
        }
        if (f106377i) {
            this.f106378d = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29.C13105xe74cc6d5();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(this.f106378d);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
        this.f106380f.a(true);
        this.f106381g.a(true);
        this.f106382h.a(true);
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.e eVar = mt1.b0.f412728e;
        if (eVar != null) {
            if (!mt1.e0.f412747b) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(eVar);
            }
            eVar.a();
        }
        if (this.f106378d != null) {
            ob0.f fVar = (ob0.f) i95.n0.c(ob0.f.class);
            ob0.d callback = this.f106378d;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0 s0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) fVar;
            s0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            java.util.Iterator it = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) obj).b(callback)) {
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x1Var);
            x1Var.i(callback);
            if (x1Var.j() == 0) {
                x1Var.h();
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1.f149040f.a().remove(x1Var);
            }
            s0Var.Ai();
            this.f106378d = null;
        }
        q25.b.c("//clean");
    }
}
