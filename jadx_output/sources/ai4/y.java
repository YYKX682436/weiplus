package ai4;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f5204d;

    public y(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ai4.y(continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return new ai4.y((kotlin.coroutines.Continuation) obj).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f5204d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lc4
        Le:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L16:
            kotlin.ResultKt.throwOnFailure(r13)
            ai4.b0 r13 = ai4.b0.f5123a
            r12.f5204d = r2
            qi4.p r13 = qi4.p.f363776a
            jz5.g r13 = qi4.p.f363780e
            jz5.n r13 = (jz5.n) r13
            java.lang.Object r13 = r13.getValue()
            ti4.d r13 = (ti4.d) r13
            java.util.List r13 = r13.y()
            r1 = 0
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L63
            com.tencent.wechat.aff.status.StatusLogicCommentManager r3 = com.tencent.wechat.aff.status.StatusLogicCommentManager.getInstance()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r4 = r13.iterator()     // Catch: java.lang.Throwable -> L63
            r5 = r1
        L39:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L61
            mj4.l r6 = (mj4.l) r6     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r6.field_TextStatusId     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto L4b
            java.lang.String r6 = ""
        L4b:
            bw5.sl0 r6 = r3.performSelfDoLike(r6, r2)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L54
            boolean r6 = r6.f33040d     // Catch: java.lang.Throwable -> L61
            goto L55
        L54:
            r6 = r1
        L55:
            if (r6 == 0) goto L39
            int r5 = r5 + 1
            goto L39
        L5a:
            jz5.f0 r1 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)     // Catch: java.lang.Throwable -> L61
            goto L70
        L61:
            r1 = move-exception
            goto L66
        L63:
            r2 = move-exception
            r5 = r1
            r1 = r2
        L66:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "transferSelfLikeDataToAffDB: oldCount="
            r2.<init>(r3)
            int r3 = r13.size()
            r2.append(r3)
            java.lang.String r3 = ", successCount="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", result="
            r2.append(r3)
            boolean r3 = kotlin.Result.m528isSuccessimpl(r1)
            r2.append(r3)
            java.lang.String r3 = ", err="
            r2.append(r3)
            java.lang.Throwable r3 = kotlin.Result.m524exceptionOrNullimpl(r1)
            if (r3 == 0) goto La3
            java.lang.String r3 = jz5.a.b(r3)
            goto La4
        La3:
            r3 = 0
        La4:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.StatusAffDBTransfer"
            com.tencent.mars.xlog.Log.i(r3, r2)
            ai4.j0 r2 = new ai4.j0
            boolean r7 = kotlin.Result.m528isSuccessimpl(r1)
            int r13 = r13.size()
            long r8 = (long) r13
            long r10 = (long) r5
            r6 = r2
            r6.<init>(r7, r8, r10)
            if (r2 != r0) goto Lc3
            return r0
        Lc3:
            r13 = r2
        Lc4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
