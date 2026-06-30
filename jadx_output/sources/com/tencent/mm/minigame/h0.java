package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69074d;

    /* renamed from: e, reason: collision with root package name */
    public int f69075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.g0 f69076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f69077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.minigame.g0 g0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69076f = g0Var;
        this.f69077g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.minigame.h0(this.f69076f, this.f69077g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.minigame.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f69075e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r8)
            goto L68
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L56
        L20:
            java.lang.Object r1 = r7.f69074d
            java.util.Map r1 = (java.util.Map) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L47
        L28:
            kotlin.ResultKt.throwOnFailure(r8)
            com.tencent.mm.minigame.g0 r8 = r7.f69076f
            com.tencent.mm.minigame.y r8 = (com.tencent.mm.minigame.y) r8
            com.tencent.mm.plugin.appbrand.service.c0 r1 = r7.f69077g
            r8.H(r1)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            com.tencent.mm.minigame.p0 r6 = com.tencent.mm.minigame.p0.f69132a
            r7.f69074d = r8
            r7.f69075e = r5
            java.lang.Object r1 = r6.a(r1, r8, r7)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r8
        L47:
            ix5.h r8 = ix5.h.f295631b
            r7.f69074d = r2
            r7.f69075e = r4
            java.lang.String r4 = "bootFramework"
            java.lang.Object r8 = r8.g(r4, r1, r7)
            if (r8 != r0) goto L56
            return r0
        L56:
            ix5.h r8 = ix5.h.f295631b
            r7.f69075e = r3
            ix5.k r8 = new ix5.k
            r8.<init>(r2)
            ix5.u r1 = ix5.h.f295639j
            java.lang.Object r8 = kotlinx.coroutines.l.g(r1, r8, r7)
            if (r8 != r0) goto L68
            return r0
        L68:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
