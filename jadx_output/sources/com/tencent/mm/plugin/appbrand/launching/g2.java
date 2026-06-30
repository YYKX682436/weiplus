package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.j2 f84617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.appbrand.launching.j2 j2Var) {
        super(1);
        this.f84617d = j2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.a cb6 = (yz5.a) obj;
        kotlin.jvm.internal.o.g(cb6, "cb");
        final com.tencent.mm.plugin.appbrand.o6 o6Var = this.f84617d.f84687a;
        final java.lang.Runnable runnable = new java.lang.Runnable(cb6) { // from class: com.tencent.mm.plugin.appbrand.launching.k2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f84711d;

            {
                kotlin.jvm.internal.o.g(cb6, "function");
                this.f84711d = cb6;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f84711d.invoke();
            }
        };
        sj1.l.i(o6Var.f74803n, "internal:prepare", "AppBrandRuntimeWC#startPrepareOrientation");
        o6Var.K("startPrepareOrientation", new java.lang.Object[0]);
        new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$n
            /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r7 = this;
                    com.tencent.mm.plugin.appbrand.o6 r0 = com.tencent.mm.plugin.appbrand.o6.this
                    java.lang.Runnable r1 = r2
                    boolean r2 = com.tencent.mm.plugin.appbrand.o6.f86162n3
                    boolean r2 = r0.L0()
                    java.lang.String r3 = "MicroMsg.AppBrandRuntimeWC"
                    if (r2 == 0) goto L1c
                    java.lang.String r0 = r0.f74803n
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}
                    java.lang.String r1 = "startPrepareOrientation, finished appId[%s]"
                    com.tencent.mars.xlog.Log.i(r3, r1, r0)
                    goto Lde
                L1c:
                    r2 = 0
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    java.lang.String r5 = "mayRequestOrientation"
                    r0.K(r5, r4)
                    com.tencent.mm.plugin.appbrand.o6$$p r4 = new com.tencent.mm.plugin.appbrand.o6$$p
                    r4.<init>()
                    com.tencent.mm.plugin.appbrand.v7 r1 = new com.tencent.mm.plugin.appbrand.v7
                    r1.<init>(r0)
                    boolean r5 = r0.L0()
                    r6 = 0
                    if (r5 == 0) goto L3b
                    java.lang.String r5 = "destroyed"
                    r1.invoke(r5)
                    goto L71
                L3b:
                    boolean r5 = r0.J0()
                    if (r5 != 0) goto L5a
                    k91.r r5 = r0.m0()
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "NULL appConfig"
                    r1.invoke(r5)
                    goto L71
                L4d:
                    java.lang.String r1 = r0.t0()
                    java.lang.String r1 = nf.z.a(r1)
                    k91.f r1 = r5.c(r1)
                    goto L77
                L5a:
                    com.tencent.mm.plugin.appbrand.page.d5 r5 = r0.x0()
                    if (r5 != 0) goto L66
                    java.lang.String r5 = "NULL pageContainer"
                    r1.invoke(r5)
                    goto L71
                L66:
                    com.tencent.mm.plugin.appbrand.page.w2 r5 = r5.getCurrentPage()
                    if (r5 != 0) goto L73
                    java.lang.String r5 = "NULL currentPage"
                    r1.invoke(r5)
                L71:
                    r1 = r6
                    goto L77
                L73:
                    k91.f r1 = r5.getPageConfig()
                L77:
                    boolean r5 = r0.L0()
                    if (r5 == 0) goto L89
                    java.lang.String r0 = r0.f74803n
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}
                    java.lang.String r1 = "mayRequestOrientation mFinished is true return,mAppId:%s"
                    com.tencent.mars.xlog.Log.i(r3, r1, r0)
                    goto Lde
                L89:
                    boolean r3 = r0.q2()
                    xi1.o r5 = xi1.o.PORTRAIT
                    if (r3 == 0) goto L9e
                    k91.r r1 = r0.m0()
                    k91.c r1 = r1.f305748r
                    java.lang.String r1 = r1.f305550a
                    xi1.o r6 = xi1.o.d(r1)
                    goto Lcf
                L9e:
                    if (r1 != 0) goto Lad
                    boolean r1 = r0.I1
                    if (r1 != 0) goto La5
                    goto Lcf
                La5:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "page config should not be NULL!!"
                    r0.<init>(r1)
                    throw r0
                Lad:
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r0.u0()
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.L1
                    java.lang.String r6 = "halfScreenConfig"
                    kotlin.jvm.internal.o.f(r3, r6)
                    boolean r6 = r3.c()
                    if (r6 == 0) goto Lc5
                    k91.x2 r6 = k91.x2.f305817e
                    k91.x2 r3 = r3.D
                    if (r3 != r6) goto Lc5
                    r2 = 1
                Lc5:
                    if (r2 == 0) goto Lc9
                    r6 = r5
                    goto Lcf
                Lc9:
                    java.lang.String r1 = r1.f305724m
                    xi1.o r6 = xi1.o.d(r1)
                Lcf:
                    xi1.g r0 = r0.getWindowAndroid()
                    xi1.p r0 = r0.getOrientationHandler()
                    if (r6 != 0) goto Lda
                    goto Ldb
                Lda:
                    r5 = r6
                Ldb:
                    r0.b(r5, r4)
                Lde:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o6$$n.run():void");
            }
        }.run();
        return jz5.f0.f302826a;
    }
}
