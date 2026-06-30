package ay1;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f15225a;

    /* renamed from: b, reason: collision with root package name */
    public ay1.m f15226b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f15227c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f15228d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f15229e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15230f;

    public l(yz5.a initLoader, kotlinx.coroutines.r2 r2Var, androidx.lifecycle.y yVar, kotlinx.coroutines.p0 coroutineDispatcher, int i17, kotlin.jvm.internal.i iVar) {
        r2Var = (i17 & 2) != 0 ? null : r2Var;
        yVar = (i17 & 4) != 0 ? null : yVar;
        coroutineDispatcher = (i17 & 8) != 0 ? kotlinx.coroutines.q1.f310570c : coroutineDispatcher;
        kotlin.jvm.internal.o.g(initLoader, "initLoader");
        kotlin.jvm.internal.o.g(coroutineDispatcher, "coroutineDispatcher");
        this.f15225a = "FutureTask";
        this.f15227c = jz5.h.b(new ay1.e(this));
        this.f15228d = jz5.h.b(new ay1.k(this));
        this.f15229e = jz5.h.b(new ay1.j(r2Var, coroutineDispatcher));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ay1.a(yVar, this, null), 3, null);
        this.f15230f = kotlinx.coroutines.l.d(d(), null, null, new ay1.c(this, initLoader, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(ay1.l r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof ay1.f
            if (r0 == 0) goto L13
            r0 = r11
            ay1.f r0 = (ay1.f) r0
            int r1 = r0.f15211g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15211g = r1
            goto L18
        L13:
            ay1.f r0 = new ay1.f
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f15209e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15211g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb5
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L8b
        L3a:
            java.lang.Object r10 = r0.f15208d
            ay1.l r10 = (ay1.l) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L50
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f15208d = r10
            r0.f15211g = r5
            java.lang.Object r11 = r10.l(r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            java.lang.String r11 = r10.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "preload key:"
            r2.<init>(r6)
            java.lang.Object r6 = r10.c()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r11, r2)
            by1.d r11 = r10.e()
            by1.f r11 = (by1.f) r11
            kotlinx.coroutines.f1 r11 = r11.f36363d
            r2 = 0
            if (r11 == 0) goto L7c
            boolean r6 = r11.a()
            if (r6 != r5) goto L7c
            goto L7d
        L7c:
            r5 = r2
        L7d:
            r2 = 0
            if (r5 == 0) goto L8c
            r0.f15208d = r2
            r0.f15211g = r4
            java.lang.Object r11 = r11.k(r0)
            if (r11 != r1) goto L8b
            return r1
        L8b:
            return r11
        L8c:
            kotlinx.coroutines.y0 r4 = r10.d()
            r5 = 0
            r6 = 0
            ay1.g r7 = new ay1.g
            r7.<init>(r10, r2)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.f1 r11 = kotlinx.coroutines.l.b(r4, r5, r6, r7, r8, r9)
            by1.d r10 = r10.e()
            by1.f r10 = (by1.f) r10
            r10.getClass()
            r10.f36363d = r11
            r0.f15208d = r2
            r0.f15211g = r3
            kotlinx.coroutines.g1 r11 = (kotlinx.coroutines.g1) r11
            java.lang.Object r11 = r11.k(r0)
            if (r11 != r1) goto Lb5
            return r1
        Lb5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ay1.l.h(ay1.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object j(ay1.l lVar, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return lVar.i(z17, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[PHI: r7
  0x0065: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0062, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(ay1.l r5, boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof ay1.h
            if (r0 == 0) goto L13
            r0 = r7
            ay1.h r0 = (ay1.h) r0
            int r1 = r0.f15218h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15218h = r1
            goto L18
        L13:
            ay1.h r0 = new ay1.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15216f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15218h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            boolean r6 = r0.f15215e
            java.lang.Object r5 = r0.f15214d
            ay1.l r5 = (ay1.l) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f15214d = r5
            r0.f15215e = r6
            r0.f15218h = r4
            java.lang.Object r7 = r5.l(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            kotlinx.coroutines.y0 r7 = r5.d()
            oz5.l r7 = r7.getF11582e()
            ay1.i r2 = new ay1.i
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f15214d = r4
            r0.f15218h = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r7, r2, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ay1.l.k(ay1.l, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public by1.d a() {
        return new by1.f(c());
    }

    public final ay1.m b() {
        ay1.m mVar = this.f15226b;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.o.o("future");
        throw null;
    }

    public java.lang.Object c() {
        return ((jz5.n) this.f15227c).getValue();
    }

    public final kotlinx.coroutines.y0 d() {
        return (kotlinx.coroutines.y0) this.f15229e.getValue();
    }

    public final by1.d e() {
        return (by1.d) ((jz5.n) this.f15228d).getValue();
    }

    public java.lang.String f() {
        return this.f15225a;
    }

    public void g(java.lang.Object cgiBack) {
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
    }

    public java.lang.Object i(boolean z17, kotlin.coroutines.Continuation continuation) {
        return k(this, z17, continuation);
    }

    public final java.lang.Object l(kotlin.coroutines.Continuation continuation) {
        java.lang.Object C;
        kotlinx.coroutines.r2 r2Var = this.f15230f;
        return (r2Var == null || (C = r2Var.C(continuation)) != pz5.a.f359186d) ? jz5.f0.f302826a : C;
    }
}
