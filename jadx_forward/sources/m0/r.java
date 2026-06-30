package m0;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public d1.e f404028a;

    /* renamed from: b, reason: collision with root package name */
    public final float f404029b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f404030c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Float f404031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Float f404032e;

    /* renamed from: f, reason: collision with root package name */
    public d1.e f404033f;

    /* renamed from: g, reason: collision with root package name */
    public final z.e f404034g = z.f.a(0.0f, 0.0f, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public final z.e f404035h = z.f.a(0.0f, 0.0f, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public final z.e f404036i = z.f.a(0.0f, 0.0f, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.z f404037j = new p3325xe03a0797.p3326xc267989b.a0(null);

    /* renamed from: k, reason: collision with root package name */
    public final n0.v2 f404038k;

    /* renamed from: l, reason: collision with root package name */
    public final n0.v2 f404039l;

    public r(d1.e eVar, float f17, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f404028a = eVar;
        this.f404029b = f17;
        this.f404030c = z17;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f404038k = n0.s4.c(bool, null, 2, null);
        this.f404039l = n0.s4.c(bool, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof m0.k
            if (r0 == 0) goto L13
            r0 = r9
            m0.k r0 = (m0.k) r0
            int r1 = r0.f404015g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f404015g = r1
            goto L18
        L13:
            m0.k r0 = new m0.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f404013e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f404015g
            r3 = 3
            r4 = 2
            r5 = 1
            jz5.f0 r6 = jz5.f0.f384359a
            r7 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f404012d
            m0.r r2 = (m0.r) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L78
        L40:
            java.lang.Object r2 = r0.f404012d
            m0.r r2 = (m0.r) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L60
        L48:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r0.f404012d = r8
            r0.f404015g = r5
            m0.o r9 = new m0.o
            r9.<init>(r8, r7)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.z0.f(r9, r0)
            if (r9 != r1) goto L5b
            goto L5c
        L5b:
            r9 = r6
        L5c:
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r8
        L60:
            n0.v2 r9 = r2.f404038k
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            n0.q4 r9 = (n0.q4) r9
            r9.mo148714x53d8522f(r5)
            kotlinx.coroutines.z r9 = r2.f404037j
            r0.f404012d = r2
            r0.f404015g = r4
            kotlinx.coroutines.a0 r9 = (p3325xe03a0797.p3326xc267989b.a0) r9
            java.lang.Object r9 = r9.k(r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            r0.f404012d = r7
            r0.f404015g = r3
            r2.getClass()
            m0.q r9 = new m0.q
            r9.<init>(r2, r7)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.z0.f(r9, r0)
            if (r9 != r1) goto L8b
            goto L8c
        L8b:
            r9 = r6
        L8c:
            if (r9 != r1) goto L8f
            return r1
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
