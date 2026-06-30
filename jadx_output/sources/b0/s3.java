package b0;

/* loaded from: classes14.dex */
public final class s3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16516e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f16519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16520i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(yz5.q qVar, kotlinx.coroutines.y0 y0Var, b0.h2 h2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16518g = qVar;
        this.f16519h = y0Var;
        this.f16520i = h2Var;
        this.f16521m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.s3 s3Var = new b0.s3(this.f16518g, this.f16519h, this.f16520i, this.f16521m, continuation);
        s3Var.f16517f = obj;
        return s3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.s3) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f16516e
            r2 = 2
            b0.h2 r3 = r14.f16520i
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5b
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            java.lang.Object r1 = r14.f16517f
            p1.c r1 = (p1.c) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L37
        L23:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f16517f
            r1 = r15
            p1.c r1 = (p1.c) r1
            r14.f16517f = r1
            r14.f16516e = r5
            r15 = 0
            java.lang.Object r15 = b0.d4.b(r1, r15, r14, r5, r4)
            if (r15 != r0) goto L37
            return r0
        L37:
            p1.s r15 = (p1.s) r15
            r15.a()
            yz5.q r6 = b0.d4.f16264a
            yz5.q r7 = r14.f16518g
            if (r7 == r6) goto L50
            kotlinx.coroutines.y0 r8 = r14.f16519h
            r9 = 0
            r10 = 0
            b0.r3 r11 = new b0.r3
            r11.<init>(r7, r3, r15, r4)
            r12 = 3
            r13 = 0
            kotlinx.coroutines.l.d(r8, r9, r10, r11, r12, r13)
        L50:
            r14.f16517f = r4
            r14.f16516e = r2
            java.lang.Object r15 = b0.d4.f(r1, r14)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            p1.s r15 = (p1.s) r15
            if (r15 != 0) goto L67
            r3.f16330f = r5
            kotlinx.coroutines.sync.d r15 = r3.f16331g
            kotlinx.coroutines.sync.c.c(r15, r4, r5, r4)
            goto L7f
        L67:
            r15.a()
            r3.f16329e = r5
            kotlinx.coroutines.sync.d r0 = r3.f16331g
            kotlinx.coroutines.sync.c.c(r0, r4, r5, r4)
            yz5.l r0 = r14.f16521m
            if (r0 == 0) goto L7f
            d1.e r1 = new d1.e
            long r2 = r15.f350881c
            r1.<init>(r2)
            r0.invoke(r1)
        L7f:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
