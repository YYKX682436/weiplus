package a0;

/* loaded from: classes14.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276d;

    /* renamed from: e, reason: collision with root package name */
    public int f277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.f f278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(g0.f fVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278f = fVar;
        this.f279g = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.r0(this.f278f, this.f279g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f277e
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.f276d
            androidx.compose.foundation.lazy.layout.c0 r0 = (androidx.compose.foundation.lazy.layout.c0) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L11
            goto L50
        L11:
            r7 = move-exception
            goto L5f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            n0.v2 r1 = r6.f279g     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L5b
            androidx.compose.foundation.lazy.layout.d0 r1 = (androidx.compose.foundation.lazy.layout.d0) r1     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L3f
            e0.n0 r1 = (e0.n0) r1     // Catch: java.lang.Throwable -> L5b
            e0.j r3 = r1.f245654e     // Catch: java.lang.Throwable -> L5b
            o0.i r4 = r3.f245614a     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L38
            e0.l0 r1 = e0.n0.f245652f     // Catch: java.lang.Throwable -> L5b
            goto L40
        L38:
            e0.m0 r4 = new e0.m0     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5b
            r1 = r4
            goto L40
        L3f:
            r1 = r7
        L40:
            g0.f r3 = r6.f278f     // Catch: java.lang.Throwable -> L58
            r6.f276d = r1     // Catch: java.lang.Throwable -> L58
            r6.f277e = r2     // Catch: java.lang.Throwable -> L58
            g0.h r3 = (g0.h) r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = r3.a(r7, r6)     // Catch: java.lang.Throwable -> L58
            if (r7 != r0) goto L4f
            return r0
        L4f:
            r0 = r1
        L50:
            if (r0 == 0) goto L55
            r0.a()
        L55:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L58:
            r7 = move-exception
            r0 = r1
            goto L5f
        L5b:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            if (r0 == 0) goto L64
            r0.a()
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
