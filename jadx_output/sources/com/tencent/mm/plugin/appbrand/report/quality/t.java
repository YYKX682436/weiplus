package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f88301a;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.Map f88305e;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime f88308h;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f88310j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.performance.t f88311k;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.s f88302b = new com.tencent.mm.plugin.appbrand.report.quality.s(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.r f88303c = new com.tencent.mm.plugin.appbrand.report.quality.r(this, null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.q f88304d = new com.tencent.mm.plugin.appbrand.report.quality.q(this, null);

    /* renamed from: f, reason: collision with root package name */
    public volatile int f88306f = 0;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f88307g = "";

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f88309i = true;

    public static com.tencent.mm.plugin.appbrand.report.quality.t1 b(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, com.tencent.mm.plugin.appbrand.report.quality.p pVar) {
        int i17;
        com.tencent.magicbrush.MagicBrush magicBrush;
        yg.a aVar;
        float nativeGetCurrentFpsVariance;
        if (qualitySessionRuntime == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = qualitySessionRuntime.f88144p;
        com.tencent.mm.plugin.appbrand.report.quality.s1 s1Var = new com.tencent.mm.plugin.appbrand.report.quality.s1();
        if (pVar == com.tencent.mm.plugin.appbrand.report.quality.p.Full) {
            yd.b0 h17 = yd.c0.INST.h();
            int i18 = h17.f460918a;
            s1Var.f88287i = i18;
            s1Var.f88288j = i18 - qualitySessionRuntime.f88152x;
            s1Var.f88285g = h17.f460919b;
            s1Var.f88286h = h17.f460920c;
            s1Var.f88291m = (int) java.lang.Math.round(com.tencent.mm.plugin.appbrand.report.quality.z.INST.f88391d.b());
            s1Var.f88294p = h17.f460921d;
        } else {
            s1Var.f88287i = -1;
            s1Var.f88288j = -1;
            s1Var.f88285g = -1;
            s1Var.f88286h = -1;
            s1Var.f88291m = -1;
            s1Var.f88294p = -1;
        }
        try {
            i17 = o6Var.f74796e.getStackSize();
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        s1Var.f88290l = i17;
        s1Var.f88289k = (int) (java.lang.System.currentTimeMillis() - qualitySessionRuntime.f88146r);
        if (!qualitySessionRuntime.A) {
            com.tencent.mm.plugin.appbrand.performance.t tVar = qualitySessionRuntime.f88154z.f88311k;
            s1Var.f88279a = tVar != null ? (int) (tVar.f87385m + 0.5d) : 0;
        } else if (o6Var.f86182n2) {
            java.lang.Object obj = ix5.h.f295631b.d().get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS);
            java.lang.Float valueOf = obj instanceof java.lang.Number ? java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()) : null;
            s1Var.f88279a = java.lang.Math.round(valueOf != null ? valueOf.floatValue() : 0.0f);
        } else {
            com.tencent.mm.plugin.appbrand.o6 o6Var2 = qualitySessionRuntime.f88144p;
            try {
                magicBrush = ((ae.a) ((ae.q) o6Var2.C0().z1(ae.q.class))).w();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandRuntimeEventReporter", e17, "get QualityEvent of WAGame but fail. [%s]", o6Var2);
                magicBrush = null;
            }
            if (magicBrush == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeEventReporter", "buildWAGameQualityEvent find renderer.fps == null");
            } else {
                yg.h hVar = magicBrush.f48585i;
                synchronized (hVar.f462064a) {
                    aVar = hVar.f462066c;
                }
                s1Var.f88279a = java.lang.Math.round(aVar.f462018a);
                s1Var.f88293o = java.lang.Math.round(aVar.f462019b);
                yg.h hVar2 = magicBrush.f48585i;
                synchronized (hVar2.f462064a) {
                    if (hVar2.f462064a.f48577a == 0) {
                        nativeGetCurrentFpsVariance = -1.0f;
                    } else {
                        com.tencent.magicbrush.MBRuntime mBRuntime = hVar2.f462064a;
                        nativeGetCurrentFpsVariance = mBRuntime.nativeGetCurrentFpsVariance(mBRuntime.f48577a);
                    }
                }
                s1Var.f88280b = nativeGetCurrentFpsVariance;
                s1Var.f88283e = magicBrush.f48585i.b();
                s1Var.f88284f = magicBrush.f48585i.e();
                s1Var.f88282d = magicBrush.f48585i.d();
                s1Var.f88281c = qualitySessionRuntime.C.f88269a;
                s1Var.f88292n = 1;
                s1Var.f88295q = 1;
                yg.f a17 = magicBrush.f48585i.a();
                s1Var.f88296r = a17.f462048a;
                s1Var.f88297s = a17.f462049b;
                s1Var.f88298t = a17.f462050c;
                s1Var.f88299u = a17.f462051d;
                s1Var.f88300v = java.lang.Math.round(a17.f462052e * 10000.0f);
            }
        }
        return new com.tencent.mm.plugin.appbrand.report.quality.t1(s1Var, null);
    }

    public final void a(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, com.tencent.mm.plugin.appbrand.report.quality.t1 t1Var) {
        if (qualitySessionRuntime == null || t1Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(qualitySessionRuntime == null);
            objArr[1] = java.lang.Boolean.valueOf(t1Var == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "addNewReportData:session null [%b], event null [%b]", objArr);
            return;
        }
        t1Var.f88349x = qualitySessionRuntime.f88134d;
        if (qualitySessionRuntime.f88144p.f86182n2) {
            t1Var.f88348w = 3;
        } else {
            t1Var.f88348w = 0;
        }
        t1Var.B = this.f88306f;
        t1Var.E = 0;
        t1Var.G = 0;
        t1Var.F = 0;
        t1Var.f88351z = this.f88307g;
        t1Var.A = qualitySessionRuntime.f88144p.f86174j2;
    }

    public void c(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, int i17, com.tencent.mm.plugin.appbrand.report.quality.p pVar, boolean z17) {
        this.f88308h = qualitySessionRuntime;
        if (this.f88301a == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.f88301a = handler;
            long j17 = i17 * 1000;
            com.tencent.mm.plugin.appbrand.report.quality.s sVar = this.f88302b;
            sVar.f88273d = j17;
            sVar.f88274e = pVar;
            sVar.f88275f = z17;
            handler.post(sVar);
        }
        com.tencent.mm.plugin.appbrand.performance.t tVar = new com.tencent.mm.plugin.appbrand.performance.t();
        this.f88311k = tVar;
        tVar.f87382g = 200L;
        tVar.f87384i = null;
        tVar.a();
    }
}
