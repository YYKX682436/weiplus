package ai4;

/* loaded from: classes11.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f5202d;

    public w(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ai4.w(continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return new ai4.w((kotlin.coroutines.Continuation) obj).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f5202d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lc6
        Le:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L16:
            kotlin.ResultKt.throwOnFailure(r12)
            ai4.b0 r12 = ai4.b0.f5123a
            r11.f5202d = r2
            qi4.p r12 = qi4.p.f363776a
            jz5.g r12 = qi4.p.f363781f
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.getValue()
            ri4.d r12 = (ri4.d) r12
            java.util.List r12 = r12.x()
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r2 = r12.iterator()     // Catch: java.lang.Throwable -> L63
            r3 = r1
        L35:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L61
            mj4.e r4 = (mj4.e) r4     // Catch: java.lang.Throwable -> L61
            ai4.f r5 = ai4.f.f5139a     // Catch: java.lang.Throwable -> L61
            bw5.pl0 r4 = r5.f(r4)     // Catch: java.lang.Throwable -> L61
            com.tencent.wechat.aff.status.StatusLogicCommentManager r5 = com.tencent.wechat.aff.status.StatusLogicCommentManager.getInstance()     // Catch: java.lang.Throwable -> L61
            bw5.sl0 r4 = r5.insertOrReplaceLikeData(r4)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L54
            boolean r4 = r4.f33040d     // Catch: java.lang.Throwable -> L61
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L35
            int r3 = r3 + 1
            goto L35
        L5a:
            jz5.f0 r1 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)     // Catch: java.lang.Throwable -> L61
            goto L70
        L61:
            r1 = move-exception
            goto L66
        L63:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L66:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "transferCommentDataToAffDB: oldCount="
            r2.<init>(r4)
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            int r4 = r12.size()
            r2.append(r4)
            java.lang.String r4 = ", successCount="
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = ", result="
            r2.append(r4)
            boolean r4 = kotlin.Result.m528isSuccessimpl(r1)
            r2.append(r4)
            java.lang.String r4 = ", err="
            r2.append(r4)
            java.lang.Throwable r4 = kotlin.Result.m524exceptionOrNullimpl(r1)
            if (r4 == 0) goto La5
            java.lang.String r4 = jz5.a.b(r4)
            goto La6
        La5:
            r4 = 0
        La6:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.StatusAffDBTransfer"
            com.tencent.mars.xlog.Log.i(r4, r2)
            ai4.j0 r2 = new ai4.j0
            boolean r6 = kotlin.Result.m528isSuccessimpl(r1)
            int r12 = r12.size()
            long r7 = (long) r12
            long r9 = (long) r3
            r5 = r2
            r5.<init>(r6, r7, r9)
            if (r2 != r0) goto Lc5
            return r0
        Lc5:
            r12 = r2
        Lc6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
