package b0;

/* loaded from: classes14.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.y1 f16432a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16433b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.e5 f16434c;

    /* renamed from: d, reason: collision with root package name */
    public final b0.f3 f16435d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.q1 f16436e;

    /* renamed from: f, reason: collision with root package name */
    public final b0.c2 f16437f;

    public m3(b0.y1 orientation, boolean z17, n0.e5 nestedScrollDispatcher, b0.f3 scrollableState, b0.q1 flingBehavior, b0.c2 c2Var) {
        kotlin.jvm.internal.o.g(orientation, "orientation");
        kotlin.jvm.internal.o.g(nestedScrollDispatcher, "nestedScrollDispatcher");
        kotlin.jvm.internal.o.g(scrollableState, "scrollableState");
        kotlin.jvm.internal.o.g(flingBehavior, "flingBehavior");
        this.f16432a = orientation;
        this.f16433b = z17;
        this.f16434c = nestedScrollDispatcher;
        this.f16435d = scrollableState;
        this.f16436e = flingBehavior;
        this.f16437f = c2Var;
    }

    public final long a(b0.p2 dispatchScroll, long j17, d1.e eVar, int i17) {
        kotlin.jvm.internal.o.g(dispatchScroll, "$this$dispatchScroll");
        b0.c2 c2Var = this.f16437f;
        long e17 = d1.e.e(j17, c2Var != null ? c2Var.d(j17, eVar, i17) : d1.e.f225623b);
        o1.e eVar2 = (o1.e) this.f16434c.getValue();
        o1.a aVar = eVar2.f342023c;
        long e18 = d1.e.e(e17, aVar != null ? aVar.d(e17, i17) : d1.e.f225623b);
        boolean z17 = this.f16433b;
        long e19 = e(dispatchScroll.a(d(z17 ? d1.e.g(e18, -1.0f) : e18)));
        long g17 = z17 ? d1.e.g(e19, -1.0f) : e19;
        long e27 = d1.e.e(e18, g17);
        long b17 = eVar2.b(g17, e27, i17);
        if (c2Var != null) {
            c2Var.c(e18, d1.e.e(e27, b17), eVar, i17);
        }
        return e27;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof b0.h3
            if (r0 == 0) goto L13
            r0 = r15
            b0.h3 r0 = (b0.h3) r0
            int r1 = r0.f16335g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16335g = r1
            goto L18
        L13:
            b0.h3 r0 = new b0.h3
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f16333e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f16335g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r13 = r4.f16332d
            kotlin.jvm.internal.g0 r13 = (kotlin.jvm.internal.g0) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5b
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.jvm.internal.g0 r15 = new kotlin.jvm.internal.g0
            r15.<init>()
            r15.f310121d = r13
            b0.f3 r1 = r12.f16435d
            r3 = 0
            b0.k3 r11 = new b0.k3
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f16332d = r15
            r4.f16335g = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = b0.e3.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            r13 = r15
        L5b:
            long r13 = r13.f310121d
            p2.w r15 = new p2.w
            r15.<init>(r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m3.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(float r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m3.c(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float d(long j17) {
        return this.f16432a == b0.y1.Horizontal ? d1.e.c(j17) : d1.e.d(j17);
    }

    public final long e(float f17) {
        if (!(f17 == 0.0f)) {
            return this.f16432a == b0.y1.Horizontal ? d1.f.a(f17, 0.0f) : d1.f.a(0.0f, f17);
        }
        int i17 = d1.e.f225626e;
        return d1.e.f225623b;
    }

    public final long f(float f17) {
        return this.f16432a == b0.y1.Horizontal ? p2.x.a(f17, 0.0f) : p2.x.a(0.0f, f17);
    }
}
