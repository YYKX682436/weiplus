package pq3;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f439208a = jz5.h.b(pq3.p.f439207d);

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f439209b = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public qq3.i f439210c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:18:0x005f, B:25:0x006b), top: B:17:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v10, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qq3.i r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pq3.k
            if (r0 == 0) goto L13
            r0 = r9
            pq3.k r0 = (pq3.k) r0
            int r1 = r0.f439184m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439184m = r1
            goto L18
        L13:
            pq3.k r0 = new pq3.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f439182h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f439184m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            boolean r8 = r0.f439181g
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lac
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f439180f
            kotlinx.coroutines.sync.d r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r8
            java.lang.Object r2 = r0.f439179e
            qq3.i r2 = (qq3.i) r2
            java.lang.Object r6 = r0.f439178d
            pq3.q r6 = (pq3.q) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r8
            r8 = r2
            goto L5f
        L48:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlinx.coroutines.sync.d r9 = r7.f439209b
            r0.f439178d = r7
            r0.f439179e = r8
            r0.f439180f = r9
            r0.f439184m = r4
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r6 = r7
        L5f:
            java.util.concurrent.ConcurrentLinkedDeque r2 = r6.c()     // Catch: java.lang.Throwable -> Lb1
            boolean r2 = r2.contains(r8)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L6b
            r4 = 0
            goto L72
        L6b:
            java.util.concurrent.ConcurrentLinkedDeque r2 = r6.c()     // Catch: java.lang.Throwable -> Lb1
            r2.push(r8)     // Catch: java.lang.Throwable -> Lb1
        L72:
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "c2c pre download now task add result:"
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r9 = ", list size: "
            r8.append(r9)
            java.util.concurrent.ConcurrentLinkedDeque r9 = r6.c()
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.PreloadTaskController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8)
            r0.f439178d = r5
            r0.f439179e = r5
            r0.f439180f = r5
            r0.f439181g = r4
            r0.f439184m = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto Lab
            return r1
        Lab:
            r8 = r4
        Lac:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        Lb1:
            r8 = move-exception
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.q.a(qq3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pq3.m
            if (r0 == 0) goto L13
            r0 = r8
            pq3.m r0 = (pq3.m) r0
            int r1 = r0.f439196i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439196i = r1
            goto L18
        L13:
            pq3.m r0 = new pq3.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f439194g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f439196i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L82
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.f439193f
            kotlinx.coroutines.sync.d r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r7
            java.lang.Object r2 = r0.f439192e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f439191d
            pq3.q r4 = (pq3.q) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            r7 = r2
            goto L5c
        L45:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.sync.d r8 = r6.f439209b
            r0.f439191d = r6
            r0.f439192e = r7
            r0.f439193f = r8
            r0.f439196i = r4
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            java.lang.Object r2 = r8.b(r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
        L5c:
            qq3.i r2 = r4.f439210c     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L6e
            sq3.a r2 = r2.f447493e     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.A0()     // Catch: java.lang.Throwable -> L85
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r7)     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L6e
            r4.f439210c = r5     // Catch: java.lang.Throwable -> L85
        L6e:
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            r8.d(r5)
            r0.f439191d = r5
            r0.f439192e = r5
            r0.f439193f = r5
            r0.f439196i = r3
            java.lang.Object r7 = r4.e(r0)
            if (r7 != r1) goto L82
            return r1
        L82:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        L85:
            r7 = move-exception
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            r8.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.q.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.concurrent.ConcurrentLinkedDeque c() {
        return (java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) this.f439208a).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pq3.n
            if (r0 == 0) goto L13
            r0 = r6
            pq3.n r0 = (pq3.n) r0
            int r1 = r0.f439201h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439201h = r1
            goto L18
        L13:
            pq3.n r0 = new pq3.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f439199f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f439201h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r1 = r0.f439198e
            kotlinx.coroutines.sync.d r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r1
            java.lang.Object r0 = r0.f439197d
            pq3.q r0 = (pq3.q) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.sync.d r6 = r5.f439209b
            r0.f439197d = r5
            r0.f439198e = r6
            r0.f439201h = r4
            kotlinx.coroutines.sync.k r6 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r6
            java.lang.Object r0 = r6.b(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            qq3.i r6 = r0.f439210c     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L53
            goto L54
        L53:
            r4 = 0
        L54:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            return r6
        L5e:
            r6 = move-exception
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.q.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof pq3.o
            if (r0 == 0) goto L13
            r0 = r7
            pq3.o r0 = (pq3.o) r0
            int r1 = r0.f439206h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439206h = r1
            goto L18
        L13:
            pq3.o r0 = new pq3.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f439204f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f439206h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r1 = r0.f439203e
            kotlinx.coroutines.sync.d r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r1
            java.lang.Object r0 = r0.f439202d
            pq3.q r0 = (pq3.q) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L78
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            java.lang.Object r2 = r0.f439202d
            pq3.q r2 = (pq3.q) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L5d
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.util.concurrent.ConcurrentLinkedDeque r7 = r6.c()
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto La1
            r0.f439202d = r6
            r0.f439206h = r5
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb1
            kotlinx.coroutines.sync.d r7 = r2.f439209b
            r0.f439202d = r2
            r0.f439203e = r7
            r0.f439206h = r4
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            java.lang.Object r0 = r7.b(r3, r0)
            if (r0 != r1) goto L76
            return r1
        L76:
            r1 = r7
            r0 = r2
        L78:
            java.util.concurrent.ConcurrentLinkedDeque r7 = r0.c()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r7.getLast()     // Catch: java.lang.Throwable -> L9a
            qq3.i r7 = (qq3.i) r7     // Catch: java.lang.Throwable -> L9a
            r0.f439210c = r7     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.ConcurrentLinkedDeque r7 = r0.c()     // Catch: java.lang.Throwable -> L9a
            qq3.i r2 = r0.f439210c     // Catch: java.lang.Throwable -> L9a
            r7.remove(r2)     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            qq3.i r7 = r0.f439210c
            if (r7 == 0) goto Lb1
            r7.c()
            goto Lb1
        L9a:
            r7 = move-exception
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            throw r7
        La1:
            java.lang.Class<fq3.n> r7 = fq3.n.class
            i95.m r7 = i95.n0.c(r7)
            fq3.n r7 = (fq3.n) r7
            r7.m134976x2690a4ac()
            pq3.j r7 = r7.B
            r7.g()
        Lb1:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.q.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
