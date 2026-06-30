package ch2;

/* loaded from: classes10.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ch2.o2 o2Var, r45.yx1 yx1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41405e = o2Var;
        this.f41406f = yx1Var;
        this.f41407g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.m1(this.f41405e, this.f41406f, this.f41407g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f41404d
            ch2.o2 r2 = r5.f41405e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L30
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
            if (r6 == 0) goto L33
            r5.f41404d = r3
            r1 = 5
            r45.yx1 r4 = r5.f41406f
            java.lang.Object r6 = r6.o7(r1, r4, r3, r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            r45.mx1 r6 = (r45.mx1) r6
            goto L34
        L33:
            r6 = 0
        L34:
            yz5.l r0 = r5.f41407g
            if (r0 == 0) goto L44
            if (r6 == 0) goto L3c
            r6 = r3
            goto L3d
        L3c:
            r6 = 0
        L3d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.invoke(r6)
        L44:
            om2.g r6 = r2.q7()
            om2.i r6 = r6.f346307n
            if (r6 == 0) goto L4f
            r6.e()
        L4f:
            ah2.b r6 = r2.k7()
            if (r6 == 0) goto L5a
            dh2.x r6 = (dh2.x) r6
            r6.j()
        L5a:
            om2.g r6 = r2.q7()
            om2.a r0 = new om2.a
            r0.<init>(r3)
            r6.O6(r0)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
