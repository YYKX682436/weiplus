package p1;

/* loaded from: classes14.dex */
public final class o0 implements p1.c, p2.f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f432392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f432393e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f432394f;

    /* renamed from: g, reason: collision with root package name */
    public p1.n f432395g;

    /* renamed from: h, reason: collision with root package name */
    public final oz5.l f432396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f432397i;

    public o0(p1.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        this.f432397i = q0Var;
        this.f432392d = completion;
        this.f432393e = q0Var;
        this.f432395g = p1.n.Main;
        this.f432396h = oz5.m.f431862d;
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f432393e.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f432393e.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f432393e.R(f17);
    }

    public java.lang.Object b(p1.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        this.f432395g = nVar;
        this.f432394f = rVar;
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public long c() {
        p1.q0 q0Var = this.f432397i;
        long t17 = q0Var.t(q0Var.f432399f.e());
        s1.z zVar = q0Var.f432458d;
        long j17 = zVar != null ? ((u1.c1) zVar).f483585f : 0L;
        return d1.l.a(java.lang.Math.max(0.0f, d1.k.d(t17) - ((int) (j17 >> 32))) / 2.0f, java.lang.Math.max(0.0f, d1.k.b(t17) - p2.q.b(j17)) / 2.0f);
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f432393e.e(j17);
    }

    public final void g(p1.l event, p1.n pass) {
        p3325xe03a0797.p3326xc267989b.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pass, "pass");
        if (pass != this.f432395g || (qVar = this.f432394f) == null) {
            return;
        }
        this.f432394f = null;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(event));
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return this.f432396h;
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f432393e.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f432393e.mo7006xa2f3d785();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [yz5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r12, yz5.p r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof p1.l0
            if (r0 == 0) goto L13
            r0 = r15
            p1.l0 r0 = (p1.l0) r0
            int r1 = r0.f432381g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432381g = r1
            goto L18
        L13:
            p1.l0 r0 = new p1.l0
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f432379e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f432381g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r12 = r0.f432378d
            kotlinx.coroutines.r2 r12 = (p3325xe03a0797.p3326xc267989b.r2) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L2c:
            r13 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r5 = 0
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 > 0) goto L55
            kotlinx.coroutines.q r15 = r11.f432394f
            if (r15 == 0) goto L55
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            p1.o r2 = new p1.o
            r2.<init>(r12)
            java.lang.Object r2 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r2)
            java.lang.Object r2 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r2)
            r15.mo48700xdecd0e93(r2)
        L55:
            p1.q0 r15 = r11.f432397i
            kotlinx.coroutines.y0 r5 = r15.f432406p
            r6 = 0
            r7 = 0
            p1.m0 r8 = new p1.m0
            r8.<init>(r12, r11, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r12 = p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
            r0.f432378d = r12     // Catch: java.lang.Throwable -> L2c
            r0.f432381g = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r15 = r14.mo149xb9724478(r11, r0)     // Catch: java.lang.Throwable -> L2c
            if (r15 != r1) goto L71
            return r1
        L71:
            p3325xe03a0797.p3326xc267989b.p2.a(r12, r4, r3, r4)
            return r15
        L75:
            p3325xe03a0797.p3326xc267989b.p2.a(r12, r4, r3, r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.i(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(long r5, yz5.p r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p1.n0
            if (r0 == 0) goto L13
            r0 = r8
            p1.n0 r0 = (p1.n0) r0
            int r1 = r0.f432391f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432391f = r1
            goto L18
        L13:
            p1.n0 r0 = new p1.n0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f432389d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f432391f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: p1.o -> L3b
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r0.f432391f = r3     // Catch: p1.o -> L3b
            java.lang.Object r8 = r4.i(r5, r7, r0)     // Catch: p1.o -> L3b
            if (r8 != r1) goto L3c
            return r1
        L3b:
            r8 = 0
        L3c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.j(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f432393e.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f432393e.o(f17);
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        p1.q0 q0Var = this.f432397i;
        synchronized (q0Var.f432402i) {
            q0Var.f432402i.k(this);
        }
        this.f432392d.mo48700xdecd0e93(obj);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f432393e.t(j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f432393e.z(f17);
    }
}
