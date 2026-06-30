package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.d0 f84945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.appbrand.launching.precondition.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84945e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launching.precondition.c0(this.f84945e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launching.precondition.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f84944d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            com.tencent.mm.plugin.appbrand.launching.precondition.d0 r4 = r13.f84945e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L2d
        L11:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L19:
            kotlin.ResultKt.throwOnFailure(r14)
            boolean r14 = r4.f84953i
            if (r14 == 0) goto L41
            com.tencent.mm.plugin.appbrand.n1 r14 = com.tencent.mm.plugin.appbrand.n1.f86018a
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r1 = r4.f84949e
            r13.f84944d = r3
            java.lang.Object r14 = r14.b(r1, r13)
            if (r14 != r0) goto L2d
            return r0
        L2d:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L41
            l81.v0 r14 = r4.f84952h
            if (r14 == 0) goto L40
            r0 = -10
            r1 = 2
            r3 = 0
            l81.v0.b(r14, r0, r3, r1, r3)
        L40:
            return r2
        L41:
            com.tencent.mm.plugin.appbrand.launching.w0 r14 = new com.tencent.mm.plugin.appbrand.launching.w0
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r6 = r4.f84949e
            java.lang.String r7 = r4.f84950f
            r8 = 0
            com.tencent.mm.plugin.appbrand.launching.precondition.a0 r9 = new com.tencent.mm.plugin.appbrand.launching.precondition.a0
            r9.<init>(r4)
            com.tencent.mm.plugin.appbrand.launching.precondition.b0 r10 = new com.tencent.mm.plugin.appbrand.launching.precondition.b0
            r10.<init>(r4)
            r11 = 4
            r12 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.luggage.sdk.launching.p r0 = r4.f84954m
            if (r0 != 0) goto L5e
            com.tencent.luggage.sdk.launching.p r0 = com.tencent.luggage.sdk.launching.p.LEGACY
        L5e:
            r14.f85313m = r0
            r14.run()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.precondition.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
