package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes7.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65396d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.f1 f65398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.feature.chatrecordstts.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65398f = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.feature.chatrecordstts.e1 e1Var = new com.tencent.mm.feature.chatrecordstts.e1(this.f65398f, continuation);
        e1Var.f65397e = obj;
        return e1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0043 -> B:12:0x0046). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f65396d
            r2 = 2
            r3 = 1
            java.lang.String r4 = "MicroMsg.ConditionWatchdog"
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r10)
            goto L89
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            java.lang.Object r1 = r9.f65397e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L46
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f65397e
            kotlinx.coroutines.y0 r10 = (kotlinx.coroutines.y0) r10
            r1 = r10
            r10 = r9
        L2d:
            boolean r5 = kotlinx.coroutines.z0.h(r1)
            if (r5 == 0) goto L89
            com.tencent.mm.feature.chatrecordstts.f1 r5 = r10.f65398f
            boolean r6 = r5.f65421e
            if (r6 == 0) goto L89
            long r5 = r5.f65417a
            r10.f65397e = r1
            r10.f65396d = r3
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r10)
            if (r5 != r0) goto L46
            return r0
        L46:
            boolean r5 = kotlinx.coroutines.z0.h(r1)
            if (r5 == 0) goto L83
            com.tencent.mm.feature.chatrecordstts.f1 r5 = r10.f65398f
            boolean r6 = r5.f65421e
            if (r6 != 0) goto L53
            goto L83
        L53:
            r6 = 0
            yz5.a r7 = r5.f65418b     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Exception -> L61
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L61
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L61
            goto L6c
        L61:
            r7 = move-exception
            java.lang.String r8 = "conditionCheck error"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.e(r4, r8, r7)
            r7 = r6
        L6c:
            if (r7 != 0) goto L2d
            java.lang.String r1 = "condition failed, triggering action"
            com.tencent.mars.xlog.Log.w(r4, r1)
            r5.f65421e = r6
            yz5.l r1 = r5.f65419c
            r3 = 0
            r10.f65397e = r3
            r10.f65396d = r2
            java.lang.Object r10 = r1.invoke(r10)
            if (r10 != r0) goto L89
            return r0
        L83:
            java.lang.String r10 = "watchdog stopped during delay"
            com.tencent.mars.xlog.Log.i(r4, r10)
        L89:
            java.lang.String r10 = "watchdog loop ended"
            com.tencent.mars.xlog.Log.i(r4, r10)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
