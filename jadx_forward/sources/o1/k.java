package o1;

/* loaded from: classes14.dex */
public final class k implements t1.b, t1.d, o1.a {

    /* renamed from: d, reason: collision with root package name */
    public final o1.e f423571d;

    /* renamed from: e, reason: collision with root package name */
    public final o1.a f423572e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f423573f;

    public k(o1.e dispatcher, o1.a connection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        this.f423571d = dispatcher;
        this.f423572e = connection;
        dispatcher.f423554a = new o1.h(this);
        this.f423573f = n0.s4.c(null, null, 2, null);
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        ((n0.q4) this.f423573f).mo148714x53d8522f((o1.k) scope.a(o1.m.f423575a));
        this.f423571d.f423556c = f();
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r16, long r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof o1.i
            if (r2 == 0) goto L16
            r2 = r1
            o1.i r2 = (o1.i) r2
            int r3 = r2.f423565i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f423565i = r3
            goto L1b
        L16:
            o1.i r2 = new o1.i
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f423563g
            pz5.a r9 = pz5.a.f440719d
            int r3 = r2.f423565i
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L45
            if (r3 == r4) goto L37
            if (r3 != r10) goto L2f
            long r2 = r2.f423561e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto L88
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            long r3 = r2.f423562f
            long r5 = r2.f423561e
            java.lang.Object r7 = r2.f423560d
            o1.k r7 = (o1.k) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            r13 = r3
            r11 = r5
            goto L63
        L45:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            o1.a r3 = r0.f423572e
            r2.f423560d = r0
            r11 = r16
            r2.f423561e = r11
            r13 = r18
            r2.f423562f = r13
            r2.f423565i = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.a(r4, r6, r8)
            if (r1 != r9) goto L62
            return r9
        L62:
            r7 = r0
        L63:
            p2.w r1 = (p2.w) r1
            long r4 = r1.f432939a
            o1.k r3 = r7.f()
            if (r3 == 0) goto L8e
            long r6 = p2.w.e(r11, r4)
            long r11 = p2.w.d(r13, r4)
            r1 = 0
            r2.f423560d = r1
            r2.f423561e = r4
            r2.f423565i = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.a(r4, r6, r8)
            if (r1 != r9) goto L87
            return r9
        L87:
            r2 = r13
        L88:
            p2.w r1 = (p2.w) r1
            long r4 = r1.f432939a
            r13 = r2
            goto L93
        L8e:
            r13 = r4
            int r1 = p2.w.f432938c
            long r4 = p2.w.f432937b
        L93:
            long r1 = p2.w.e(r13, r4)
            p2.w r3 = new p2.w
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o1.a
    public long b(long j17, long j18, int i17) {
        long j19;
        long b17 = this.f423572e.b(j17, j18, i17);
        o1.k f17 = f();
        if (f17 != null) {
            j19 = f17.b(d1.e.f(j17, b17), d1.e.e(j18, b17), i17);
        } else {
            int i18 = d1.e.f307159e;
            j19 = d1.e.f307156b;
        }
        return d1.e.f(b17, j19);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o1.j
            if (r0 == 0) goto L13
            r0 = r11
            o1.j r0 = (o1.j) r0
            int r1 = r0.f423570h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423570h = r1
            goto L18
        L13:
            o1.j r0 = new o1.j
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f423568f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f423570h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.f423567e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L76
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            long r9 = r0.f423567e
            java.lang.Object r2 = r0.f423566d
            o1.k r2 = (o1.k) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L55
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            o1.k r11 = r8.f()
            if (r11 == 0) goto L5a
            r0.f423566d = r8
            r0.f423567e = r9
            r0.f423570h = r4
            java.lang.Object r11 = r11.c(r9, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r2 = r8
        L55:
            p2.w r11 = (p2.w) r11
            long r4 = r11.f432939a
            goto L5f
        L5a:
            int r11 = p2.w.f432938c
            long r4 = p2.w.f432937b
            r2 = r8
        L5f:
            r6 = r9
            r9 = r4
            r4 = r6
            o1.a r11 = r2.f423572e
            long r4 = p2.w.d(r4, r9)
            r2 = 0
            r0.f423566d = r2
            r0.f423567e = r9
            r0.f423570h = r3
            java.lang.Object r11 = r11.c(r4, r0)
            if (r11 != r1) goto L76
            return r1
        L76:
            p2.w r11 = (p2.w) r11
            long r0 = r11.f432939a
            long r9 = p2.w.e(r9, r0)
            p2.w r11 = new p2.w
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o1.a
    public long d(long j17, int i17) {
        long j18;
        o1.k f17 = f();
        if (f17 != null) {
            j18 = f17.d(j17, i17);
        } else {
            int i18 = d1.e.f307159e;
            j18 = d1.e.f307156b;
        }
        return d1.e.f(j18, this.f423572e.d(d1.e.e(j17, j18), i17));
    }

    public final p3325xe03a0797.p3326xc267989b.y0 e() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        o1.k f17 = f();
        if ((f17 == null || (y0Var = f17.e()) == null) && (y0Var = this.f423571d.f423555b) == null) {
            throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return y0Var;
    }

    public final o1.k f() {
        return (o1.k) this.f423573f.mo128745x754a37bb();
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return o1.m.f423575a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
