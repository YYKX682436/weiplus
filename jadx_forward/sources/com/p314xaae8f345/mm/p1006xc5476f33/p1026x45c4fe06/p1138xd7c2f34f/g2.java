package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j2 f166150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j2 j2Var) {
        super(1);
        this.f166150d = j2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        final yz5.a cb6 = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f166150d.f166220a;
        final java.lang.Runnable runnable = new java.lang.Runnable(cb6) { // from class: com.tencent.mm.plugin.appbrand.launching.k2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f166244d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "function");
                this.f166244d = cb6;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f166244d.mo152xb9724478();
            }
        };
        sj1.l.i(o6Var.f156336n, "internal:prepare", "AppBrandRuntimeWC#startPrepareOrientation");
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
                    com.tencent.mm.plugin.appbrand.o6 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this
                    java.lang.Runnable r1 = r2
                    boolean r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3
                    boolean r2 = r0.L0()
                    java.lang.String r3 = "MicroMsg.AppBrandRuntimeWC"
                    if (r2 == 0) goto L1c
                    java.lang.String r0 = r0.f156336n
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}
                    java.lang.String r1 = "startPrepareOrientation, finished appId[%s]"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1, r0)
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
                    r1.mo146xb9724478(r5)
                    goto L71
                L3b:
                    boolean r5 = r0.J0()
                    if (r5 != 0) goto L5a
                    k91.r r5 = r0.m0()
                    if (r5 != 0) goto L4d
                    java.lang.String r5 = "NULL appConfig"
                    r1.mo146xb9724478(r5)
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
                    r1.mo146xb9724478(r5)
                    goto L71
                L66:
                    com.tencent.mm.plugin.appbrand.page.w2 r5 = r5.m52169xfdaa7672()
                    if (r5 != 0) goto L73
                    java.lang.String r5 = "NULL currentPage"
                    r1.mo146xb9724478(r5)
                L71:
                    r1 = r6
                    goto L77
                L73:
                    k91.f r1 = r5.m52227x1f6322a7()
                L77:
                    boolean r5 = r0.L0()
                    if (r5 == 0) goto L89
                    java.lang.String r0 = r0.f156336n
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}
                    java.lang.String r1 = "mayRequestOrientation mFinished is true return,mAppId:%s"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1, r0)
                    goto Lde
                L89:
                    boolean r3 = r0.q2()
                    xi1.o r5 = xi1.o.PORTRAIT
                    if (r3 == 0) goto L9e
                    k91.r r1 = r0.m0()
                    k91.c r1 = r1.f387281r
                    java.lang.String r1 = r1.f387083a
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
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r6)
                    boolean r6 = r3.c()
                    if (r6 == 0) goto Lc5
                    k91.x2 r6 = k91.x2.f387350e
                    k91.x2 r3 = r3.D
                    if (r3 != r6) goto Lc5
                    r2 = 1
                Lc5:
                    if (r2 == 0) goto Lc9
                    r6 = r5
                    goto Lcf
                Lc9:
                    java.lang.String r1 = r1.f387257m
                    xi1.o r6 = xi1.o.d(r1)
                Lcf:
                    xi1.g r0 = r0.mo48803xee5260a9()
                    xi1.p r0 = r0.mo51612x60543150()
                    if (r6 != 0) goto Lda
                    goto Ldb
                Lda:
                    r5 = r6
                Ldb:
                    r0.b(r5, r4)
                Lde:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.RunnableC12459x63548e7.run():void");
            }
        }.run();
        return jz5.f0.f384359a;
    }
}
