package ah3;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f4903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f4904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4904e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ah3.l(this.f4904e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f4903d
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.BatchGetContactHelper"
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.ResultKt.throwOnFailure(r8)
            goto La1
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L86
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3d
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            ah3.m.f4906b = r4
            java.lang.String r8 = "tryRequest begin"
            com.tencent.mars.xlog.Log.i(r5, r8)
            ah3.m r8 = ah3.m.f4905a
            r7.f4903d = r4
            r1 = 0
            java.lang.Object r8 = r8.d(r1, r1, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "tryRequest getAllInitContactUsernames:"
            r1.<init>(r4)
            int r4 = r8.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            ah3.m r1 = ah3.m.f4905a
            jz5.l r8 = r1.c(r8)
            java.lang.Object r8 = r8.f302833d
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "tryRequest filterNewContact:"
            r4.<init>(r6)
            int r6 = r8.size()
            r4.append(r6)
            java.lang.String r6 = " contactUserNames:"
            r4.append(r6)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r5, r4)
            r7.f4903d = r3
            java.lang.Object r8 = ah3.m.a(r1, r8, r7)
            if (r8 != r0) goto L86
            return r0
        L86:
            java.lang.String r8 = "tryRequest processBatch end"
            com.tencent.mars.xlog.Log.i(r5, r8)
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            ah3.k r1 = new ah3.k
            yz5.l r3 = r7.f4904e
            r4 = 0
            r1.<init>(r3, r4)
            r7.f4903d = r2
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r1, r7)
            if (r8 != r0) goto La1
            return r0
        La1:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
