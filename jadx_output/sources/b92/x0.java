package b92;

/* loaded from: classes.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f18556d;

    /* renamed from: e, reason: collision with root package name */
    public int f18557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f18559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18558f = context;
        this.f18559g = j17;
        this.f18560h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.x0(this.f18558f, this.f18559g, this.f18560h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f18557e
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r2) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r13.f18556d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto La6
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f18556d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L8a
        L29:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L69
        L2d:
            kotlin.ResultKt.throwOnFailure(r14)
            r45.qs1 r14 = new r45.qs1
            r14.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r6 = 30026(0x754a, float:4.2075E-41)
            r45.kv0 r1 = r1.a(r6)
            r14.set(r5, r1)
            long r6 = r13.f18559g
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r14.set(r3, r1)
            r1 = 5
            java.lang.String r6 = r13.f18560h
            r14.set(r1, r6)
            com.tencent.mm.modelbase.i r14 = r14.d()
            az2.j r14 = (az2.j) r14
            android.content.Context r7 = r13.f18558f
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            az2.j.u(r6, r7, r8, r9, r11, r12)
            r13.f18557e = r5
            java.lang.Object r14 = xg2.g.d(r14, r4, r13, r5, r4)
            if (r14 != r0) goto L69
            return r0
        L69:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto L8a
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto L78
            oz5.l r14 = r13.getContext()
        L78:
            b92.w0 r5 = new b92.w0
            android.content.Context r6 = r13.f18558f
            r5.<init>(r1, r4, r6)
            r13.f18556d = r1
            r13.f18557e = r2
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r5, r13)
            if (r14 != r0) goto L8a
            return r0
        L8a:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto La6
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto L96
            oz5.l r14 = r13.getContext()
        L96:
            b92.v0 r2 = new b92.v0
            r2.<init>(r1, r4)
            r13.f18556d = r1
            r13.f18557e = r3
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r2, r13)
            if (r14 != r0) goto La6
            return r0
        La6:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
