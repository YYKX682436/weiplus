package b0;

/* loaded from: classes14.dex */
public final class n implements b0.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final z.d0 f16438a;

    public n(z.d0 flingDecay) {
        kotlin.jvm.internal.o.g(flingDecay, "flingDecay");
        this.f16438a = flingDecay;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // b0.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b0.p2 r18, float r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof b0.l
            if (r2 == 0) goto L17
            r2 = r1
            b0.l r2 = (b0.l) r2
            int r3 = r2.f16399g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f16399g = r3
            goto L1c
        L17:
            b0.l r2 = new b0.l
            r2.<init>(r0, r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.f16397e
            pz5.a r2 = pz5.a.f359186d
            int r3 = r7.f16399g
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r2 = r7.f16396d
            kotlin.jvm.internal.e0 r2 = (kotlin.jvm.internal.e0) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L80
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L83
            kotlin.jvm.internal.e0 r1 = new kotlin.jvm.internal.e0
            r1.<init>()
            r3 = r19
            r1.f310115d = r3
            kotlin.jvm.internal.e0 r5 = new kotlin.jvm.internal.e0
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            z.r r3 = z.s.a(r8, r9, r10, r12, r14, r15, r16)
            z.d0 r6 = r0.f16438a
            r8 = 0
            b0.m r9 = new b0.m
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f16396d = r1
            r7.f16399g = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = z.z1.b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L7f
            return r2
        L7f:
            r2 = r1
        L80:
            float r1 = r2.f310115d
            goto L86
        L83:
            r3 = r19
            r1 = r3
        L86:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.n.a(b0.p2, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
