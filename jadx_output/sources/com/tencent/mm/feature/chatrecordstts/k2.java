package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final v65.i f65487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65488b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65489c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f65490d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f65491e;

    /* renamed from: f, reason: collision with root package name */
    public final kz5.q f65492f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f65493g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f65494h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.a2 f65495i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f65496j;

    public k2(v65.i scope, int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 3 : i17;
        j17 = (i18 & 4) != 0 ? 100L : j17;
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f65487a = scope;
        this.f65488b = i17;
        this.f65489c = j17;
        this.f65490d = kotlinx.coroutines.flow.i3.a(com.tencent.mm.feature.chatrecordstts.b2.f65364d);
        this.f65491e = kotlinx.coroutines.flow.i3.a(0);
        this.f65492f = new kz5.q();
        this.f65493g = kotlinx.coroutines.sync.l.a(false, 1, null);
        this.f65496j = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01a8 -> B:15:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0310 -> B:12:0x0313). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.feature.chatrecordstts.k2 r9, yz5.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.a(com.tencent.mm.feature.chatrecordstts.k2, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0084, LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0055, B:12:0x0059, B:14:0x005f), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.tencent.mm.feature.chatrecordstts.d2
            if (r0 == 0) goto L13
            r0 = r9
            com.tencent.mm.feature.chatrecordstts.d2 r0 = (com.tencent.mm.feature.chatrecordstts.d2) r0
            int r1 = r0.f65393i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65393i = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.d2 r0 = new com.tencent.mm.feature.chatrecordstts.d2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f65391g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f65393i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r8 = r0.f65390f
            kotlinx.coroutines.sync.d r8 = (kotlinx.coroutines.sync.d) r8
            java.lang.Object r1 = r0.f65389e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f65388d
            com.tencent.mm.feature.chatrecordstts.k2 r0 = (com.tencent.mm.feature.chatrecordstts.k2) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r1
            goto L55
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.d r9 = r7.f65493g
            r0.f65388d = r7
            r0.f65389e = r8
            r0.f65390f = r9
            r0.f65393i = r4
            kotlinx.coroutines.sync.k r9 = (kotlinx.coroutines.sync.k) r9
            java.lang.Object r0 = r9.b(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L84
        L59:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L84
            com.tencent.mm.feature.chatrecordstts.c2 r1 = (com.tencent.mm.feature.chatrecordstts.c2) r1     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f65496j     // Catch: java.lang.Throwable -> L84
            int r2 = r2.incrementAndGet()     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f65496j     // Catch: java.lang.Throwable -> L84
            int r4 = r4.incrementAndGet()     // Catch: java.lang.Throwable -> L84
            kz5.q r5 = r0.f65492f     // Catch: java.lang.Throwable -> L84
            com.tencent.mm.feature.chatrecordstts.a2 r6 = new com.tencent.mm.feature.chatrecordstts.a2     // Catch: java.lang.Throwable -> L84
            r6.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L84
            r5.addLast(r6)     // Catch: java.lang.Throwable -> L84
            goto L59
        L7c:
            kotlinx.coroutines.sync.k r9 = (kotlinx.coroutines.sync.k) r9
            r9.d(r3)
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        L84:
            r8 = move-exception
            kotlinx.coroutines.sync.k r9 = (kotlinx.coroutines.sync.k) r9
            r9.d(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.b(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:16|17))(1:18))(2:34|(1:36)(1:37))|19|20|(2:22|23)(4:24|25|(3:27|(1:29)|12)|13)))|39|6|7|(0)(0)|19|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.SequentialTaskRunner", "start executionJob cancellation");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:20:0x005f, B:24:0x0071), top: B:19:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(yz5.a r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.tencent.mm.feature.chatrecordstts.g2
            if (r0 == 0) goto L13
            r0 = r11
            com.tencent.mm.feature.chatrecordstts.g2 r0 = (com.tencent.mm.feature.chatrecordstts.g2) r0
            int r1 = r0.f65439i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65439i = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.g2 r0 = new com.tencent.mm.feature.chatrecordstts.g2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f65437g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f65439i
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto La3
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f65436f
            kotlinx.coroutines.sync.d r10 = (kotlinx.coroutines.sync.d) r10
            java.lang.Object r2 = r0.f65435e
            yz5.a r2 = (yz5.a) r2
            java.lang.Object r7 = r0.f65434d
            com.tencent.mm.feature.chatrecordstts.k2 r7 = (com.tencent.mm.feature.chatrecordstts.k2) r7
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5f
        L46:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.sync.d r11 = r9.f65493g
            r0.f65434d = r9
            r0.f65435e = r10
            r0.f65436f = r11
            r0.f65439i = r5
            kotlinx.coroutines.sync.k r11 = (kotlinx.coroutines.sync.k) r11
            java.lang.Object r2 = r11.b(r6, r0)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r7 = r9
            r2 = r10
            r10 = r11
        L5f:
            kotlinx.coroutines.flow.j2 r11 = r7.f65490d     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.flow.h3 r11 = (kotlinx.coroutines.flow.h3) r11     // Catch: java.lang.Throwable -> La4
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> La4
            com.tencent.mm.feature.chatrecordstts.b2 r8 = com.tencent.mm.feature.chatrecordstts.b2.f65365e     // Catch: java.lang.Throwable -> La4
            if (r11 != r8) goto L71
            kotlinx.coroutines.sync.k r10 = (kotlinx.coroutines.sync.k) r10
            r10.d(r6)
            return r3
        L71:
            kotlinx.coroutines.flow.j2 r11 = r7.f65490d     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.flow.h3 r11 = (kotlinx.coroutines.flow.h3) r11     // Catch: java.lang.Throwable -> La4
            r11.k(r8)     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.sync.k r10 = (kotlinx.coroutines.sync.k) r10
            r10.d(r6)
            com.tencent.mm.feature.chatrecordstts.h2 r10 = new com.tencent.mm.feature.chatrecordstts.h2
            r10.<init>(r7, r2, r6)
            v65.i r11 = r7.f65487a
            kotlinx.coroutines.r2 r10 = v65.i.b(r11, r6, r10, r5, r6)
            r7.f65494h = r10
            if (r10 == 0) goto La3
            r0.f65434d = r6     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.f65435e = r6     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.f65436f = r6     // Catch: java.util.concurrent.CancellationException -> L9b
            r0.f65439i = r4     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r10 = r10.C(r0)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r10 != r1) goto La3
            return r1
        L9b:
            java.lang.String r10 = "MicroMsg.SequentialTaskRunner"
            java.lang.String r11 = "start executionJob cancellation"
            com.tencent.mars.xlog.Log.i(r10, r11)
        La3:
            return r3
        La4:
            r11 = move-exception
            kotlinx.coroutines.sync.k r10 = (kotlinx.coroutines.sync.k) r10
            r10.d(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.d(yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d5, blocks: (B:21:0x007d, B:25:0x008f), top: B:20:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b8 -> B:13:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00cd -> B:12:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d5, blocks: (B:21:0x007d, B:25:0x008f), top: B:20:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b8 -> B:13:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00cd -> B:12:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.k2.f(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
