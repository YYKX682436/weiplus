package x65;

/* loaded from: classes12.dex */
public abstract class l implements x65.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f533907d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f533908e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f533909f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f533910g;

    public l(p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f533907d = lifecycleOwner;
        this.f533908e = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
        this.f533909f = jz5.h.b(x65.k.f533906d);
        this.f533910g = jz5.h.b(x65.j.f533905d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:14:0x004c, B:17:0x016e, B:20:0x0193, B:27:0x0186, B:28:0x018b, B:32:0x0067, B:34:0x0148, B:55:0x00c1, B:57:0x00d1, B:16:0x0163), top: B:7:0x0030, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(x65.l r17, int r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.l.c(x65.l, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0054, B:13:0x005e, B:14:0x0061, B:16:0x0072, B:17:0x0075), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0054, B:13:0x005e, B:14:0x0061, B:16:0x0072, B:17:0x0075), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(x65.l r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof x65.b
            if (r0 == 0) goto L13
            r0 = r7
            x65.b r0 = (x65.b) r0
            int r1 = r0.f533873i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f533873i = r1
            goto L18
        L13:
            x65.b r0 = new x65.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f533871g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f533873i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r5 = r0.f533870f
            kotlinx.coroutines.sync.d r5 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r5
            java.lang.Object r6 = r0.f533869e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f533868d
            x65.l r0 = (x65.l) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r5
            r5 = r0
            goto L54
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            kotlinx.coroutines.sync.d r7 = r5.f533908e
            r0.f533868d = r5
            r0.f533869e = r6
            r0.f533870f = r7
            r0.f533873i = r4
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            java.lang.Object r0 = r7.b(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            y65.c r0 = r5.f()     // Catch: java.lang.Throwable -> L84
            w65.m r0 = r0.b(r6)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L61
            r0.x()     // Catch: java.lang.Throwable -> L84
        L61:
            y65.c r0 = r5.f()     // Catch: java.lang.Throwable -> L84
            r0.c(r6)     // Catch: java.lang.Throwable -> L84
            y65.c r0 = r5.g()     // Catch: java.lang.Throwable -> L84
            w65.m r0 = r0.b(r6)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L75
            r0.x()     // Catch: java.lang.Throwable -> L84
        L75:
            y65.c r5 = r5.g()     // Catch: java.lang.Throwable -> L84
            r5.c(r6)     // Catch: java.lang.Throwable -> L84
            jz5.f0 r5 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            r7.d(r3)
            return r5
        L84:
            r5 = move-exception
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            r7.d(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.l.d(x65.l, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(x65.l r5, w65.m r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof x65.g
            if (r0 == 0) goto L13
            r0 = r7
            x65.g r0 = (x65.g) r0
            int r1 = r0.f533894h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f533894h = r1
            goto L18
        L13:
            x65.g r0 = new x65.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f533892f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f533894h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f533891e
            kotlin.jvm.internal.h0 r5 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r5
            java.lang.Object r6 = r0.f533890d
            x65.l r6 = (x65.l) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r5
            r5 = r6
            goto L54
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            kotlin.jvm.internal.h0 r7 = new kotlin.jvm.internal.h0
            r7.<init>()
            x65.h r2 = new x65.h
            r2.<init>(r5, r6, r7, r4)
            r0.f533890d = r5
            r0.f533891e = r7
            r0.f533894h = r3
            java.lang.Object r6 = r2.mo146xb9724478(r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            com.tencent.mm.sdk.coroutines.LifecycleScope r6 = r5.j()
            x65.i r0 = new x65.i
            r0.<init>(r5, r4)
            v65.i.b(r6, r4, r0, r3, r4)
            java.lang.Object r5 = r7.f391656d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.l.i(x65.l, w65.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // x65.a
    public java.lang.Object a(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return d(this, str, interfaceC29045xdcb5ca57);
    }

    @Override // x65.a
    public java.lang.Object b(w65.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return i(this, mVar, interfaceC29045xdcb5ca57);
    }

    public abstract java.lang.String e();

    public final y65.c f() {
        return (y65.c) ((jz5.n) this.f533910g).mo141623x754a37bb();
    }

    public final y65.c g() {
        return (y65.c) ((jz5.n) this.f533909f).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(w65.m r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x65.e
            if (r0 == 0) goto L13
            r0 = r6
            x65.e r0 = (x65.e) r0
            int r1 = r0.f533887g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f533887g = r1
            goto L18
        L13:
            x65.e r0 = new x65.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f533885e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f533887g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f533884d
            w65.m r5 = (w65.m) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            x65.f r6 = new x65.f
            r2 = 0
            r6.<init>(r5, r2)
            r0.f533884d = r5
            r0.f533887g = r3
            java.lang.Object r6 = r6.mo146xb9724478(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            w65.g r5 = (w65.g) r5
            r5.l()
            r5.f1()
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.l.h(w65.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a j();

    public abstract p3325xe03a0797.p3326xc267989b.p3332x361a9b.m k();
}
