package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.h1 f88162a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88163b;

    /* renamed from: c, reason: collision with root package name */
    public final float f88164c;

    /* renamed from: d, reason: collision with root package name */
    public final long f88165d;

    /* renamed from: e, reason: collision with root package name */
    public final long f88166e;

    /* renamed from: f, reason: collision with root package name */
    public final long f88167f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f88168g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f88169h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f88170i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f88171j;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (wo.w0.q() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (wo.w0.q() != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0052 -> B:9:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1(com.tencent.mm.plugin.appbrand.report.quality.h1 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "contextReporter"
            kotlin.jvm.internal.o.g(r8, r0)
            r7.<init>()
            r7.f88162a = r8
            r0 = 2000(0x7d0, double:9.88E-321)
            r7.f88165d = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r7.f88166e = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.f88167f = r0
            com.tencent.mm.plugin.appbrand.report.quality.a1 r0 = com.tencent.mm.plugin.appbrand.report.quality.a1.f88156d
            jz5.g r0 = jz5.h.b(r0)
            r7.f88168g = r0
            com.tencent.mm.plugin.appbrand.report.quality.c1 r0 = com.tencent.mm.plugin.appbrand.report.quality.c1.f88158d
            jz5.g r0 = jz5.h.b(r0)
            r7.f88169h = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b()
            double r0 = r0.f77212l1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = r8.f88199a
            boolean r8 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(r8)
            java.lang.Class<e42.e0> r2 = e42.e0.class
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L54
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.z.f193105a     // Catch: java.lang.Exception -> L52
            i95.m r8 = i95.n0.c(r2)     // Catch: java.lang.Exception -> L52
            e42.e0 r8 = (e42.e0) r8     // Catch: java.lang.Exception -> L52
            e42.c0 r2 = e42.c0.clicfg_android_appbrand_white_screen_detect_switch_game     // Catch: java.lang.Exception -> L52
            h62.d r8 = (h62.d) r8     // Catch: java.lang.Exception -> L52
            int r8 = r8.Ni(r2, r4)     // Catch: java.lang.Exception -> L52
            if (r8 != r3) goto L52
            boolean r8 = wo.w0.q()     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto L52
        L50:
            r8 = r3
            goto L6d
        L52:
            r8 = r4
            goto L6d
        L54:
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.z.f193105a     // Catch: java.lang.Exception -> L52
            i95.m r8 = i95.n0.c(r2)     // Catch: java.lang.Exception -> L52
            e42.e0 r8 = (e42.e0) r8     // Catch: java.lang.Exception -> L52
            e42.c0 r2 = e42.c0.clicfg_android_appbrand_white_screen_detect_switch_app     // Catch: java.lang.Exception -> L52
            h62.d r8 = (h62.d) r8     // Catch: java.lang.Exception -> L52
            int r8 = r8.Ni(r2, r4)     // Catch: java.lang.Exception -> L52
            if (r8 != r3) goto L52
            boolean r8 = wo.w0.q()     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto L52
            goto L50
        L6d:
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L7c
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L7c
            if (r8 == 0) goto L7c
            goto L7d
        L7c:
            r3 = r4
        L7d:
            r7.f88163b = r3
            if (r3 == 0) goto L83
            float r8 = (float) r0
            goto L84
        L83:
            r8 = 0
        L84:
            r7.f88164c = r8
            kotlinx.coroutines.y0 r8 = kotlinx.coroutines.z0.b()
            r7.f88170i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.quality.d1.<init>(com.tencent.mm.plugin.appbrand.report.quality.h1):void");
    }

    public static final void a(com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0 scene, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var) {
        com.tencent.mm.plugin.appbrand.report.quality.k0 k0Var;
        d1Var.getClass();
        com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails = new com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails();
        try {
            if (!com.tencent.mm.plugin.appbrand.utils.f1.a(bitmap, d1Var.f88164c, checkBitmapIsBlankResultDetails)) {
                if (com.tencent.mm.plugin.appbrand.report.quality.j0.f88212g == scene) {
                    com.tencent.mm.plugin.appbrand.report.quality.h1.d(d1Var.f88162a, n7Var, scene, false, l0Var, null, 16, null);
                    return;
                }
                return;
            }
            l0Var.getClass();
            com.tencent.mm.plugin.appbrand.report.quality.h1 contextReporter = d1Var.f88162a;
            kotlin.jvm.internal.o.g(contextReporter, "contextReporter");
            kotlin.jvm.internal.o.g(scene, "scene");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportWhiteScreenError, appId:");
            com.tencent.mm.plugin.appbrand.page.n7 n7Var2 = l0Var.f88217a;
            sb6.append(n7Var2.getAppId());
            sb6.append(", page:");
            sb6.append(n7Var2.X1());
            sb6.append(", scene:");
            sb6.append(scene);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PageWhiteScreenDetectSession", sb6.toString());
            boolean z17 = false;
            try {
                int ordinal = scene.ordinal();
                if (ordinal == 0) {
                    l0Var.f88218b = true;
                } else if (ordinal == 1) {
                    l0Var.f88219c = true;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    l0Var.f88221e = java.lang.System.currentTimeMillis();
                    z17 = true;
                } else if (ordinal == 2) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    l0Var.f88221e = java.lang.System.currentTimeMillis();
                    if (l0Var.f88220d) {
                        return;
                    }
                    k0Var = new com.tencent.mm.plugin.appbrand.report.quality.k0(l0Var);
                    com.tencent.mm.sdk.platformtools.u3.h(k0Var);
                }
                com.tencent.mm.plugin.appbrand.report.quality.h1.d(contextReporter, l0Var.f88217a, scene, false, l0Var, checkBitmapIsBlankResultDetails, 4, null);
                if (!z17 || l0Var.f88220d) {
                    return;
                }
                k0Var = new com.tencent.mm.plugin.appbrand.report.quality.k0(l0Var);
                com.tencent.mm.sdk.platformtools.u3.h(k0Var);
            } catch (java.lang.Throwable th6) {
                if (0 != 0 && !l0Var.f88220d) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.report.quality.k0(l0Var));
                }
                throw th6;
            }
        } finally {
            try {
                bitmap.recycle();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var, long j17) {
        n7Var.getAppId();
        n7Var.X1();
        java.util.Objects.toString(j0Var);
        android.graphics.Bitmap bitmap = null;
        if (com.tencent.mm.plugin.appbrand.report.quality.j0.f88212g != j0Var) {
            if (com.tencent.mm.plugin.appbrand.report.quality.j0.f88211f != j0Var) {
                kotlinx.coroutines.r2 r2Var = this.f88171j;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f88171j = null;
            }
            kotlinx.coroutines.r2 r2Var2 = this.f88171j;
            kotlinx.coroutines.y0 y0Var = this.f88170i;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            this.f88171j = kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.report.quality.y0(r2Var2, this, n7Var, j17, j0Var, null), 2, null);
            return;
        }
        kotlinx.coroutines.r2 r2Var3 = this.f88171j;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        com.tencent.mm.plugin.appbrand.report.quality.l0 T3 = n7Var.T3();
        T3.a();
        com.tencent.mm.plugin.appbrand.page.fe R3 = n7Var.R3();
        com.tencent.mm.plugin.appbrand.report.quality.v0 v0Var = new com.tencent.mm.plugin.appbrand.report.quality.v0(n7Var, this, j0Var, T3);
        R3.getClass();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = R3.f86623a;
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(v5Var)) {
            R3.c(v5Var, "WhiteScreenDetector", v0Var);
            return;
        }
        try {
            bitmap = v5Var.R1();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PageSnapshotStore", "takeSnapshotSync(WhiteScreenDetector) failed " + e17);
        }
        v0Var.invoke(bitmap);
    }

    public final boolean c(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        com.tencent.mm.plugin.appbrand.o6 runtime;
        return (n7Var instanceof com.tencent.mm.plugin.appbrand.headless.n) || (runtime = n7Var.getRuntime()) == null || runtime.a2();
    }
}
