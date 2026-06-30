package ch2;

/* loaded from: classes10.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41395e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.k1(this.f41395e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f41394d
            ch2.o2 r2 = r12.f41395e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lac
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L3c
        L1f:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Class<sf2.d3> r13 = sf2.d3.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r13 = r2.controller(r13)
            r5 = r13
            sf2.d3 r5 = (sf2.d3) r5
            if (r5 == 0) goto Lac
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 1
            r11 = 0
            r12.f41394d = r4
            r9 = r12
            java.lang.Object r13 = sf2.d3.l7(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L3c
            return r0
        L3c:
            r45.gx1 r13 = (r45.gx1) r13
            if (r13 == 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "updateLocalSingInfo success, version: "
            r1.<init>(r4)
            int r4 = r13.f375594e
            r1.append(r4)
            java.lang.String r4 = " listInfo: "
            r1.append(r4)
            r45.zx1 r4 = r13.f375593d
            r5 = 0
            if (r4 == 0) goto L65
            java.util.LinkedList r4 = r4.f392452d
            if (r4 == 0) goto L65
            int r4 = r4.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            goto L66
        L65:
            r6 = r5
        L66:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "FinderLiveKTVSingController"
            com.tencent.mars.xlog.Log.i(r4, r1)
            r45.zx1 r1 = r13.f375593d
            if (r1 == 0) goto L7f
            java.util.LinkedList r1 = r1.f392452d
            if (r1 == 0) goto L7f
            int r1 = r1.size()
            goto L80
        L7f:
            r1 = 0
        L80:
            if (r1 <= 0) goto Lac
            r45.zx1 r13 = r13.f375593d
            java.util.LinkedList r13 = r13.f392452d
            om2.g r1 = r2.q7()
            kotlin.jvm.internal.o.d(r13)
            java.lang.Object r4 = kz5.n0.Z(r13)
            r45.yx1 r4 = (r45.yx1) r4
            boolean r1 = r1.T6(r4)
            if (r1 == 0) goto L9a
            goto Lac
        L9a:
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            ch2.j1 r4 = new ch2.j1
            r4.<init>(r2, r13, r5)
            r12.f41394d = r3
            java.lang.Object r13 = kotlinx.coroutines.l.g(r1, r4, r12)
            if (r13 != r0) goto Lac
            return r0
        Lac:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
