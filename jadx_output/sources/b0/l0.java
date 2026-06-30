package b0;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16400d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yz5.l lVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16402f = lVar;
        this.f16403g = aVar;
        this.f16404h = aVar2;
        this.f16405i = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.l0 l0Var = new b0.l0(this.f16402f, this.f16403g, this.f16404h, this.f16405i, continuation);
        l0Var.f16401e = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.l0) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: CancellationException -> 0x0015, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0015, blocks: (B:7:0x0010, B:14:0x0024, B:15:0x0059, B:17:0x005e, B:22:0x004e), top: B:2:0x0008 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f16400d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L15
            goto L84
        L15:
            r12 = move-exception
            goto L87
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            java.lang.Object r1 = r11.f16401e
            p1.a0 r1 = (p1.a0) r1
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L15
            goto L59
        L28:
            java.lang.Object r1 = r11.f16401e
            p1.a0 r1 = (p1.a0) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L4c
        L30:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f16401e
            p1.a0 r12 = (p1.a0) r12
            b0.k0 r1 = new b0.k0
            r1.<init>(r2)
            r11.f16401e = r12
            r11.f16400d = r5
            p1.q0 r12 = (p1.q0) r12
            java.lang.Object r1 = r12.v(r1, r11)
            if (r1 != r0) goto L49
            return r0
        L49:
            r10 = r1
            r1 = r12
            r12 = r10
        L4c:
            p1.s r12 = (p1.s) r12
            r11.f16401e = r1     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f16400d = r4     // Catch: java.util.concurrent.CancellationException -> L15
            java.lang.Object r12 = b0.p0.a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L15
            if (r12 != r0) goto L59
            return r0
        L59:
            r5 = r12
            p1.s r5 = (p1.s) r5     // Catch: java.util.concurrent.CancellationException -> L15
            if (r5 == 0) goto L84
            yz5.l r12 = r11.f16402f     // Catch: java.util.concurrent.CancellationException -> L15
            long r6 = r5.f350881c     // Catch: java.util.concurrent.CancellationException -> L15
            d1.e r4 = new d1.e     // Catch: java.util.concurrent.CancellationException -> L15
            r4.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L15
            r12.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L15
            b0.j0 r12 = new b0.j0     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.a r6 = r11.f16404h     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.a r7 = r11.f16403g     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.p r8 = r11.f16405i     // Catch: java.util.concurrent.CancellationException -> L15
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f16401e = r2     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f16400d = r3     // Catch: java.util.concurrent.CancellationException -> L15
            p1.q0 r1 = (p1.q0) r1     // Catch: java.util.concurrent.CancellationException -> L15
            java.lang.Object r12 = r1.v(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L15
            if (r12 != r0) goto L84
            return r0
        L84:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        L87:
            yz5.a r0 = r11.f16403g
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
