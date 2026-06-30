package ch2;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ch2.o2 o2Var, r45.yx1 yx1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41290e = o2Var;
        this.f41291f = yx1Var;
        this.f41292g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.b0(this.f41290e, this.f41291f, this.f41292g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f41289d
            ch2.o2 r2 = r5.f41290e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L31
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Class<sf2.d3> r6 = sf2.d3.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r6 = r2.controller(r6)
            sf2.d3 r6 = (sf2.d3) r6
            if (r6 == 0) goto L34
            r5.f41289d = r3
            r1 = 0
            r3 = 7
            r45.yx1 r4 = r5.f41291f
            java.lang.Object r6 = r6.o7(r3, r4, r1, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            r45.mx1 r6 = (r45.mx1) r6
            goto L35
        L34:
            r6 = 0
        L35:
            yz5.l r0 = r5.f41292g
            if (r6 == 0) goto L46
            if (r0 == 0) goto L40
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.invoke(r6)
        L40:
            java.lang.String r6 = "finishSing"
            r2.c7(r6)
            goto L4d
        L46:
            if (r0 == 0) goto L4d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.invoke(r6)
        L4d:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
