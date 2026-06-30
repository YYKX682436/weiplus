package az0;

/* loaded from: classes5.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.i5 f15557a = new az0.i5();

    /* renamed from: b, reason: collision with root package name */
    public static final float f15558b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f15559c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile az0.x2 f15560d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile kotlinx.coroutines.r2 f15561e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f15562f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f15563g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f15564h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f15565i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f15566j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f15567k;

    /* renamed from: l, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f15568l;

    /* renamed from: m, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f15569m;

    /* renamed from: n, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f15570n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f15571o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.maas.MJMaasCore.TemplateServiceProvider f15572p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile com.tencent.maas.MJMaasCore.TemplateServiceProvider f15573q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile com.tencent.maas.instamovie.MJResourcePreloader f15574r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile pp0.p0 f15575s;

    /* renamed from: t, reason: collision with root package name */
    public static volatile int f15576t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f15577u;

    /* renamed from: v, reason: collision with root package name */
    public static com.tencent.maas.camstudio.MJCDNBridgeService f15578v;

    /* renamed from: w, reason: collision with root package name */
    public static defpackage.t f15579w;

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f15580x;

    static {
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        p05.v2 v2Var = (p05.v2) ((rh0.x) i95.n0.c(rh0.x.class));
        com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        f15558b = Bi.l("cpu_score");
        f15559c = v2Var.Bi().l("gpu_score");
        f15560d = az0.x2.f16037d;
        f15562f = jz5.h.b(az0.f5.f15470d);
        java.lang.String e17 = lp0.b.e();
        f15564h = e17;
        f15565i = java.lang.String.valueOf(com.tencent.mm.vfs.w6.i(e17 + "Maas/Cache", true));
        f15566j = com.tencent.mm.vfs.q7.c("MaasClipBundle");
        f15567k = jz5.h.b(az0.q4.f15832d);
        f15568l = kotlinx.coroutines.z0.b();
        f15572p = az0.g5.f15498a;
        f15577u = jz5.h.b(az0.k4.f15626d);
        f15580x = jz5.h.b(az0.l4.f15662d);
    }

    public static final java.util.ArrayList a(az0.i5 i5Var) {
        i5Var.getClass();
        java.util.List<java.lang.String> k17 = kz5.c0.k("MODEL_FACE_DETECT", "MODEL_FACE_ALIGNMENT", "MODEL_PORTRAITSEGMENT", "MODEL_FACE3D_XBIN", "MODEL_FACE_OCCULASIONSEG", "MODEL_HAND", "MODEL_FACE_PARSING", "MODEL_PORTRAITSEGMENT_MINI", "MODEL_FACEATTR", "MODEL_SKINSEGMENT", "MODEL_HAIRSEGMENT", "MODEL_SODSEGMENT", "MODEL_HEADSEGMENT", "MODEL_FACE3D_BFM_XBIN", "MODEL_FACE_RECONSTRUCTION", "MODEL_PET_ALIGNMENT", "MODEL_BODY_POSE", "MODEL_DIRT_DET", "MODEL_VGPT_DET", "MODEL_VGPT_SEG", "MODEL_VGPT_SOT", "MODEL_GAN_BEAUTY", "MODEL_SKINSEGMENT_LARGE");
        if (((h62.d) f15557a.p()).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigShootComposingUseMediumSegmentModel()) == 1) {
            k17.add("MODEL_PORTRAITSEGMENT_MEDIUM");
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "Use medium segment model for cam.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : k17) {
            p05.a3 a3Var = p05.a3.f350439a;
            java.lang.String g17 = a3Var.g(str);
            if (g17 != null) {
                arrayList.add(new com.tencent.maas.model.MJModelInfo(str, g17, a3Var.h(str)));
            }
        }
        return arrayList;
    }

    public static final void b(az0.i5 i5Var, boolean z17, boolean z18) {
        i5Var.getClass();
        if (!(f15560d == az0.x2.f16039f)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (z17) {
            i5Var.w();
        }
        if (!i5Var.m() || f15576t <= 0) {
            i5Var.z(az0.x2.f16040g);
            f15561e = kotlinx.coroutines.l.d(f15568l, null, null, new az0.j4(z18, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "doRelease: maasCoreUsageCount=" + f15576t + ", skip release");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: j -> 0x0039, TryCatch #1 {j -> 0x0039, blocks: (B:11:0x0035, B:12:0x0073, B:14:0x007f, B:15:0x0085, B:17:0x0091, B:18:0x0097), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: j -> 0x0039, TryCatch #1 {j -> 0x0039, blocks: (B:11:0x0035, B:12:0x0073, B:14:0x007f, B:15:0x0085, B:17:0x0091, B:18:0x0097), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc A[Catch: j -> 0x00d8, TryCatch #2 {j -> 0x00d8, blocks: (B:21:0x00b3, B:23:0x00bc, B:26:0x00c6, B:28:0x00ca, B:31:0x00d3), top: B:20:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[Catch: j -> 0x00d8, TryCatch #2 {j -> 0x00d8, blocks: (B:21:0x00b3, B:23:0x00bc, B:26:0x00c6, B:28:0x00ca, B:31:0x00d3), top: B:20:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(az0.i5 r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.c(az0.i5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d(az0.i5 i5Var) {
        i5Var.getClass();
        kotlinx.coroutines.l.f(null, new az0.d5(new az0.h5(null), null), 1, null);
    }

    public static void s(az0.i5 i5Var, boolean z17, yz5.a aVar, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        kotlinx.coroutines.l.d(i5Var.r(), null, null, new az0.p4(z18, z17, aVar, null), 3, null);
    }

    public static void x(az0.i5 i5Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        i5Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "release - start release");
        kotlinx.coroutines.l.d(i5Var.r(), null, null, new az0.r4(z17, z18, null), 3, null);
    }

    public final void A(java.util.List templateList, java.util.List musicList) {
        kotlin.jvm.internal.o.g(templateList, "templateList");
        kotlin.jvm.internal.o.g(musicList, "musicList");
        com.tencent.maas.instamovie.MJResourcePreloader mJResourcePreloader = f15574r;
        if (mJResourcePreloader != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(templateList, 10));
            java.util.Iterator it = templateList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.tencent.maas.instamovie.MJResourceItem((java.lang.String) it.next(), ""));
            }
            arrayList.addAll(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(musicList, 10));
            java.util.Iterator it6 = musicList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(new com.tencent.maas.instamovie.MJResourceItem("", (java.lang.String) it6.next()));
            }
            arrayList.addAll(arrayList3);
            mJResourcePreloader.d(new com.tencent.maas.instamovie.MJResourceUsageDesc(arrayList));
        }
    }

    public final java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "awaitInit");
        java.lang.Object g17 = kotlinx.coroutines.l.g(r().getF11582e(), new az0.y2(null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final java.lang.Object f(kotlin.coroutines.Continuation continuation) {
        boolean z17 = gm0.j1.b().f273254q;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        boolean n17 = gm0.j1.b().n();
        boolean r17 = gm0.m.r();
        if (!n17 || r17) {
            throw new c01.c();
        }
        final oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent>(a0Var) { // from class: com.tencent.mm.mj_template.maas.MaasManager$awaitInitForAccount$2$1
            {
                this.__eventId = 19430116;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent) {
                com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent event = coreAccountInitializationNotifiedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
                return false;
            }
        }.alive();
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : f0Var;
    }

    public final java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "awaitRelease");
        java.lang.Object g17 = kotlinx.coroutines.l.g(r().getF11582e(), new az0.a3(null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074 A[PHI: r9
  0x0074: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:17:0x0071, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof az0.b3
            if (r0 == 0) goto L13
            r0 = r9
            az0.b3 r0 = (az0.b3) r0
            int r1 = r0.f15354h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15354h = r1
            goto L18
        L13:
            az0.b3 r0 = new az0.b3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f15352f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15354h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f15350d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            long r7 = r0.f15351e
            java.lang.Object r6 = r0.f15350d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L50
        L40:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f15350d = r6
            r0.f15351e = r7
            r0.f15354h = r4
            java.lang.Object r9 = r5.e(r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r0.f15350d = r6
            r0.f15351e = r7
            r0.f15354h = r3
            oz5.n r9 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r9.<init>(r0)
            az0.i5 r0 = az0.i5.f15557a
            com.tencent.maas.MJMaasCore r0 = r0.q()
            az0.c3 r2 = new az0.c3
            r2.<init>(r6, r7, r9)
            r0.r(r6, r7, r2)
            java.lang.Object r9 = r9.a()
            if (r9 != r1) goto L74
            return r1
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.h(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof az0.g3
            if (r0 == 0) goto L13
            r0 = r8
            az0.g3 r0 = (az0.g3) r0
            int r1 = r0.f15497g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15497g = r1
            goto L18
        L13:
            az0.g3 r0 = new az0.g3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f15495e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15497g
            r3 = 2
            java.lang.String r4 = "MicroMsg.MaasManager"
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f15494d
            az0.i5 r0 = (az0.i5) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L84
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.f15494d
            az0.i5 r2 = (az0.i5) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f15494d = r7
            r0.f15497g = r5
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r2 = r7
        L4f:
            boolean r8 = r2.t()
            if (r8 != 0) goto L5c
            java.lang.String r8 = "createMJMoviePlayer failed, not initialized"
            com.tencent.mars.xlog.Log.e(r4, r8)
            r8 = 0
            return r8
        L5c:
            kotlinx.coroutines.r2 r8 = az0.i5.f15570n
            r6 = 0
            if (r8 == 0) goto L6a
            kotlinx.coroutines.a r8 = (kotlinx.coroutines.a) r8
            boolean r8 = r8.a()
            if (r8 != r5) goto L6a
            goto L6b
        L6a:
            r5 = r6
        L6b:
            if (r5 == 0) goto L85
            java.lang.String r8 = "createMJMoviePlayer: await last player release"
            com.tencent.mars.xlog.Log.i(r4, r8)
            kotlinx.coroutines.r2 r8 = az0.i5.f15570n
            if (r8 == 0) goto L85
            r0.f15494d = r2
            r0.f15497g = r3
            kotlinx.coroutines.c3 r8 = (kotlinx.coroutines.c3) r8
            java.lang.Object r8 = r8.C(r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            r0 = r2
        L84:
            r2 = r0
        L85:
            java.lang.String r8 = "createMJMoviePlayer: start"
            com.tencent.mars.xlog.Log.i(r4, r8)
            com.tencent.maas.MJMaasCore r8 = r2.q()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.tencent.maas.instamovie.MJMoviePlayer r8 = r8.m(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlinx.coroutines.y0 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof az0.h3
            if (r0 == 0) goto L13
            r0 = r6
            az0.h3 r0 = (az0.h3) r0
            int r1 = r0.f15526h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15526h = r1
            goto L18
        L13:
            az0.h3 r0 = new az0.h3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f15524f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15526h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f15523e
            kotlinx.coroutines.y0 r5 = (kotlinx.coroutines.y0) r5
            java.lang.Object r0 = r0.f15522d
            az0.i5 r0 = (az0.i5) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f15522d = r4
            r0.f15523e = r5
            r0.f15526h = r3
            java.lang.Object r6 = r4.i(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.tencent.maas.instamovie.MJMoviePlayer r6 = (com.tencent.maas.instamovie.MJMoviePlayer) r6
            java.lang.String r0 = "MicroMsg.MaasManager"
            if (r6 != 0) goto L54
            java.lang.String r5 = "create movie player null"
            com.tencent.mars.xlog.Log.e(r0, r5)
            r5 = 0
            return r5
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "createMJMoviePlayerController#["
            r1.<init>(r2)
            int r2 = r6.hashCode()
            r1.append(r2)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            az0.a0 r0 = new az0.a0
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.j(kotlinx.coroutines.y0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dz0.h r6, java.util.Map r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof az0.m3
            if (r0 == 0) goto L13
            r0 = r8
            az0.m3 r0 = (az0.m3) r0
            int r1 = r0.f15693h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15693h = r1
            goto L18
        L13:
            az0.m3 r0 = new az0.m3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15691f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15693h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r6 = r0.f15690e
            dz0.h r6 = (dz0.h) r6
            java.lang.Object r7 = r0.f15689d
            az0.i5 r7 = (az0.i5) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f15689d = r5
            r0.f15690e = r6
            r0.f15693h = r4
            az0.l3 r8 = new az0.l3
            r8.<init>(r7, r3)
            java.lang.String r7 = "createMovieSession"
            java.lang.Object r8 = r5.y(r7, r8, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            com.tencent.maas.instamovie.MJMovieSession r8 = (com.tencent.maas.instamovie.MJMovieSession) r8
            if (r8 != 0) goto L5b
            java.lang.String r6 = "MicroMsg.MaasManager"
            java.lang.String r7 = "create movie session null"
            com.tencent.mars.xlog.Log.e(r6, r7)
            return r3
        L5b:
            az0.i5.f15571o = r4
            az0.n7 r7 = new az0.n7
            r7.<init>(r8, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.k(dz0.h, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(boolean z17, yz5.a aVar, boolean z18) {
        if (!(f15560d == az0.x2.f16037d)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        z(az0.x2.f16038e);
        f15563g = z17;
        if (z17) {
            oz0.c.f350202h.b();
        } else {
            oz0.c.f350201g.b();
        }
        if (z18) {
            v();
        }
        f15561e = kotlinx.coroutines.l.d(f15568l, null, null, new az0.f4(aVar, null), 3, null);
    }

    public final boolean m() {
        return ((java.lang.Boolean) ((jz5.n) f15577u).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0084 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof az0.m4
            if (r0 == 0) goto L13
            r0 = r13
            az0.m4 r0 = (az0.m4) r0
            int r1 = r0.f15701n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15701n = r1
            goto L18
        L13:
            az0.m4 r0 = new az0.m4
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f15699i
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15701n
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r12 = r0.f15698h
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            java.lang.Object r2 = r0.f15697g
            java.lang.Object r4 = r0.f15696f
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f15695e
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.f15694d
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            kotlin.ResultKt.throwOnFailure(r13)
            goto L87
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L41:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r4 = r12
            r12 = r13
            r6 = r12
            r5 = r2
        L56:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L93
            java.lang.Object r2 = r4.next()
            r13 = r2
            r45.rz6 r13 = (r45.rz6) r13
            az0.i5 r7 = az0.i5.f15557a
            java.lang.String r8 = r13.f385320d
            if (r8 != 0) goto L6b
            java.lang.String r8 = ""
        L6b:
            r45.b70 r13 = r13.f385323g
            if (r13 == 0) goto L72
            int r13 = r13.f370588m
            goto L73
        L72:
            r13 = 0
        L73:
            long r9 = (long) r13
            r0.f15694d = r6
            r0.f15695e = r5
            r0.f15696f = r4
            r0.f15697g = r2
            r0.f15698h = r12
            r0.f15701n = r3
            java.lang.Object r13 = r7.h(r8, r9, r0)
            if (r13 != r1) goto L87
            return r1
        L87:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L56
            r5.add(r2)
            goto L56
        L93:
            java.util.List r5 = (java.util.List) r5
            r12.addAll(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.n(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:9)(2:21|22))(4:23|(3:25|(1:27)(1:31)|(2:29|30))|32|(1:34)(1:35))|10|11|12|(1:14)|15|16))|36|6|(0)(0)|10|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MaasManager", r8, "getExportServiceManager failed", new java.lang.Object[0]);
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof az0.n4
            if (r0 == 0) goto L13
            r0 = r8
            az0.n4 r0 = (az0.n4) r0
            int r1 = r0.f15739g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15739g = r1
            goto L18
        L13:
            az0.n4 r0 = new az0.n4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f15737e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15739g
            java.lang.String r3 = "MicroMsg.MaasManager"
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            java.lang.Object r0 = r0.f15736d
            az0.i5 r0 = (az0.i5) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7.t()
            if (r8 != 0) goto L61
            az0.x2 r8 = az0.i5.f15560d
            az0.x2 r2 = az0.x2.f16038e
            if (r8 != r2) goto L48
            r8 = r6
            goto L49
        L48:
            r8 = r5
        L49:
            if (r8 != 0) goto L61
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "getExportServiceManager error state="
            r8.<init>(r0)
            az0.x2 r0 = az0.i5.f15560d
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.sdk.platformtools.Log.c(r3, r8, r0)
            return r4
        L61:
            r0.f15736d = r7
            r0.f15739g = r6
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r0 = r7
        L6d:
            com.tencent.maas.MJMaasCore r8 = r0.q()     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "exporting"
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Exception -> L7a
            com.tencent.maas.export.MJExportManager r8 = (com.tencent.maas.export.MJExportManager) r8     // Catch: java.lang.Exception -> L7a
            goto L83
        L7a:
            r8 = move-exception
            java.lang.String r0 = "getExportServiceManager failed"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r8, r0, r1)
            r8 = r4
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getExportServiceManager: "
            r0.<init>(r1)
            if (r8 == 0) goto L95
            int r1 = r8.hashCode()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
        L95:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.i5.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e42.e0 p() {
        return (e42.e0) ((jz5.n) f15580x).getValue();
    }

    public final com.tencent.maas.MJMaasCore q() {
        return (com.tencent.maas.MJMaasCore) ((jz5.n) f15567k).getValue();
    }

    public final kotlinx.coroutines.y0 r() {
        return (kotlinx.coroutines.y0) f15562f.getValue();
    }

    public final boolean t() {
        return f15560d == az0.x2.f16039f;
    }

    public final void u(com.tencent.maas.export.MJExportManager mJExportManager) {
        if (mJExportManager == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "markExportAsyncTaskEnd: allScheduledTask " + ((java.util.HashMap) mJExportManager.b()).size());
        w();
        x(this, false, false, 2, null);
    }

    public final void v() {
        if (m()) {
            f15576t++;
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "markRetainMaasCore: now " + f15576t + ", " + new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public final void w() {
        if (m()) {
            if (f15576t <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "markUnRetainMaasCore: failed, inited=" + t() + ", " + f15576t);
                return;
            }
            f15576t--;
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "markUnRetainMaasCore: now " + f15576t + ", " + new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public final java.lang.Object y(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(r().getF11582e(), new az0.c5(str, pVar, null), continuation);
    }

    public final void z(az0.x2 x2Var) {
        if (f15560d == x2Var) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "state: " + f15560d + " -> " + x2Var);
        f15560d = x2Var;
        f15561e = null;
    }
}
