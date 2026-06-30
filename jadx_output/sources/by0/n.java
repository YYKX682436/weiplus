package by0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final by0.k f36343a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f36344b;

    public n(by0.k iSnapshotImage) {
        kotlin.jvm.internal.o.g(iSnapshotImage, "iSnapshotImage");
        this.f36343a = iSnapshotImage;
        this.f36344b = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof by0.l
            if (r0 == 0) goto L13
            r0 = r9
            by0.l r0 = (by0.l) r0
            int r1 = r0.f36338g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36338g = r1
            goto L18
        L13:
            by0.l r0 = new by0.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f36336e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f36338g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f36335d
            com.tencent.maas.model.time.MJTime r0 = (com.tencent.maas.model.time.MJTime) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L68
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            by0.k r9 = r8.f36343a
            gx0.bf r9 = (gx0.bf) r9
            com.tencent.maas.model.time.MJTime r9 = r9.h7()
            double r5 = r9.toMilliseconds()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r5 = r8.f36344b
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L51
            return r3
        L51:
            java.lang.System.currentTimeMillis()
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310570c
            by0.m r6 = new by0.m
            r7 = 0
            r6.<init>(r8, r9, r2, r7)
            r0.f36335d = r9
            r0.f36338g = r4
            java.lang.Object r0 = kotlinx.coroutines.l.g(r5, r6, r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r0 = r9
        L68:
            r0.toMilliseconds()
            java.lang.System.currentTimeMillis()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: by0.n.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
