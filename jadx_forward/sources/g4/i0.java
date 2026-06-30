package g4;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.j0 f349897a = new g4.j0();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f349898b = kz5.p0.f395529d;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f349899c = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:12:0x0039, B:15:0x0080, B:17:0x0086, B:19:0x008e, B:26:0x00b4, B:27:0x00b7, B:35:0x006c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof g4.g0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r13
            g4.g0 r0 = (g4.g0) r0
            int r2 = r0.f349831e
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.f349831e = r2
            goto L18
        L13:
            g4.g0 r0 = new g4.g0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f349830d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r0.f349831e
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L56
            if (r3 == r5) goto L49
            if (r3 != r4) goto L41
            int r3 = r0.f349837n
            java.lang.Object r5 = r0.f349836m
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r0.f349835i
            g4.w4 r7 = (g4.w4) r7
            java.lang.Object r8 = r0.f349834h
            g4.w4 r8 = (g4.w4) r8
            java.lang.Object r9 = r0.f349833g
            kotlinx.coroutines.sync.d r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)     // Catch: java.lang.Throwable -> L3e
            r13 = r3
            goto L80
        L3e:
            r13 = move-exception
            goto Lbe
        L41:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L49:
            java.lang.Object r3 = r0.f349834h
            kotlinx.coroutines.sync.d r3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r3
            java.lang.Object r5 = r0.f349833g
            g4.i0 r5 = (g4.i0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r9 = r3
            goto L6c
        L56:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            kotlinx.coroutines.sync.d r13 = r12.f349899c
            r0.f349833g = r12
            r0.f349834h = r13
            r0.f349831e = r5
            kotlinx.coroutines.sync.k r13 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r13
            java.lang.Object r3 = r13.b(r6, r0)
            if (r3 != r2) goto L6a
            return r2
        L6a:
            r5 = r12
            r9 = r13
        L6c:
            g4.w4 r13 = new g4.w4     // Catch: java.lang.Throwable -> L3e
            r13.<init>()     // Catch: java.lang.Throwable -> L3e
            g4.j0 r3 = r5.f349897a     // Catch: java.lang.Throwable -> L3e
            java.util.List r3 = r3.b()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            r7 = r13
            r8 = r7
            r13 = r5
            r5 = r3
        L80:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L3e
            int r10 = r13 + 1
            if (r13 < 0) goto Lb4
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L3e
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L3e
            g4.l1 r3 = (g4.l1) r3     // Catch: java.lang.Throwable -> L3e
            int r13 = r11.intValue()     // Catch: java.lang.Throwable -> L3e
            kz5.u0 r11 = new kz5.u0     // Catch: java.lang.Throwable -> L3e
            int r13 = r13 + r1
            r11.<init>(r13, r3)     // Catch: java.lang.Throwable -> L3e
            r0.f349833g = r9     // Catch: java.lang.Throwable -> L3e
            r0.f349834h = r8     // Catch: java.lang.Throwable -> L3e
            r0.f349835i = r7     // Catch: java.lang.Throwable -> L3e
            r0.f349836m = r5     // Catch: java.lang.Throwable -> L3e
            r0.f349837n = r10     // Catch: java.lang.Throwable -> L3e
            r0.f349831e = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r13 = r7.a(r11, r0)     // Catch: java.lang.Throwable -> L3e
            if (r13 != r2) goto Lb2
            return r2
        Lb2:
            r13 = r10
            goto L80
        Lb4:
            kz5.c0.p()     // Catch: java.lang.Throwable -> L3e
            throw r6     // Catch: java.lang.Throwable -> L3e
        Lb8:
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r6)
            return r8
        Lbe:
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00b1, B:15:0x008f, B:17:0x0095, B:21:0x00c5, B:25:0x00c1, B:29:0x0077), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00b1, B:15:0x008f, B:17:0x0095, B:21:0x00c5, B:25:0x00c1, B:29:0x0077), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00b1, B:15:0x008f, B:17:0x0095, B:21:0x00c5, B:25:0x00c1, B:29:0x0077), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ae -> B:13:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kz5.u0 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i0.b(kz5.u0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
