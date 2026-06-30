package a0;

/* loaded from: classes14.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282d;

    /* renamed from: e, reason: collision with root package name */
    public int f283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(n0.v2 v2Var, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284f = v2Var;
        this.f285g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.s0(this.f284f, this.f285g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f283e
            c0.o r2 = r6.f285g
            r3 = 2
            r4 = 1
            n0.v2 r5 = r6.f284f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r6.f282d
            c0.d r0 = (c0.d) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L62
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r1 = r6.f282d
            n0.v2 r1 = (n0.v2) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L28:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r5.getValue()
            c0.d r7 = (c0.d) r7
            if (r7 == 0) goto L4d
            c0.e r1 = new c0.e
            r1.<init>(r7)
            if (r2 == 0) goto L48
            r6.f282d = r5
            r6.f283e = r4
            r7 = r2
            c0.p r7 = (c0.p) r7
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            r1 = r5
        L49:
            r7 = 0
            r1.setValue(r7)
        L4d:
            c0.d r7 = new c0.d
            r7.<init>()
            if (r2 == 0) goto L63
            r6.f282d = r7
            r6.f283e = r3
            c0.p r2 = (c0.p) r2
            java.lang.Object r1 = r2.a(r7, r6)
            if (r1 != r0) goto L61
            return r0
        L61:
            r0 = r7
        L62:
            r7 = r0
        L63:
            r5.setValue(r7)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
