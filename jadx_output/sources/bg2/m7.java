package bg2;

/* loaded from: classes2.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20313d;

    /* renamed from: e, reason: collision with root package name */
    public int f20314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f20316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(bg2.l8 l8Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20315f = l8Var;
        this.f20316g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.m7(this.f20315f, this.f20316g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.m7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f20314e
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            bg2.l8 r7 = r8.f20315f
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.throwOnFailure(r9)
            goto L82
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4c
        L24:
            java.lang.Object r1 = r8.f20313d
            bg2.l8 r1 = (bg2.l8) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3b
        L2c:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f20313d = r7
            r8.f20314e = r6
            java.lang.Object r9 = bg2.l8.a7(r7, r8)
            if (r9 != r0) goto L3a
            return r0
        L3a:
            r1 = r7
        L3b:
            r45.vw0 r9 = (r45.vw0) r9
            r1.f20277h = r9
            r8.f20313d = r3
            r8.f20314e = r5
            long r5 = r8.f20316g
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r5, r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            java.lang.Class<bg2.q6> r9 = bg2.q6.class
            tc2.c r9 = r7.N6(r9)
            bg2.q6 r9 = (bg2.q6) r9
            if (r9 == 0) goto L59
            boolean r9 = r9.f20418m
            goto L5a
        L59:
            r9 = 0
        L5a:
            java.lang.String r1 = r7.f20274e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[checkAndShowSatisfaction] isNotInterestedToastShown:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r1, r5)
            if (r9 == 0) goto L70
            return r2
        L70:
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r9 = kotlinx.coroutines.internal.b0.f310484a
            bg2.l7 r1 = new bg2.l7
            r1.<init>(r7, r3)
            r8.f20314e = r4
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r1, r8)
            if (r9 != r0) goto L82
            return r0
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
