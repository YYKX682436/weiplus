package az0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15951d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f15955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f15956i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f15957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15958n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yz5.l lVar, az0.a0 a0Var, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15953f = lVar;
        this.f15954g = a0Var;
        this.f15955h = mJTime;
        this.f15956i = mJTimeRange;
        this.f15957m = z17;
        this.f15958n = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.v vVar = new az0.v(this.f15953f, this.f15954g, this.f15955h, this.f15956i, this.f15957m, this.f15958n, continuation);
        vVar.f15952e = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15951d
            r3 = 0
            az0.a0 r4 = r0.f15954g
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L29
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L17
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L7b
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.Object r2 = r0.f15952e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            kotlin.ResultKt.throwOnFailure(r18)
            r6 = r18
            goto L4b
        L29:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f15952e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            r8 = 0
            r9 = 0
            az0.u r10 = new az0.u
            r10.<init>(r4, r3)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r7 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            r0.f15952e = r2
            r0.f15951d = r6
            kotlinx.coroutines.g1 r7 = (kotlinx.coroutines.g1) r7
            java.lang.Object r6 = r7.k(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r7 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r2 = r6.booleanValue()
            if (r2 == 0) goto L82
            r8 = 0
            r9 = 0
            az0.t r2 = new az0.t
            az0.a0 r11 = r0.f15954g
            com.tencent.maas.model.time.MJTime r12 = r0.f15955h
            com.tencent.maas.model.time.MJTimeRange r13 = r0.f15956i
            boolean r14 = r0.f15957m
            int r15 = r0.f15958n
            r16 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.f1 r2 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            r0.f15952e = r3
            r0.f15951d = r5
            kotlinx.coroutines.g1 r2 = (kotlinx.coroutines.g1) r2
            java.lang.Object r2 = r2.k(r0)
            if (r2 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            goto L83
        L82:
            r1 = 0
        L83:
            yz5.l r2 = r0.f15953f
            if (r2 == 0) goto L8e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.invoke(r1)
        L8e:
            java.lang.String r1 = r4.f15311c
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
