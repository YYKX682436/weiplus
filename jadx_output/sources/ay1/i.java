package ay1;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay1.l f15220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ay1.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15220e = lVar;
        this.f15221f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay1.i(this.f15220e, this.f15221f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ay1.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f15219d
            r2 = 3
            r3 = 2
            r4 = 1
            ay1.l r5 = r8.f15220e
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L11
            if (r1 != r2) goto L16
        L11:
            kotlin.ResultKt.throwOnFailure(r9)
            goto Laa
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L58
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = r5.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "requestCache checkCache:"
            r1.<init>(r6)
            boolean r6 = r8.f15221f
            r1.append(r6)
            java.lang.String r7 = " key:"
            r1.append(r7)
            java.lang.Object r7 = r5.c()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r9, r1)
            if (r6 == 0) goto L9d
            by1.d r9 = r5.e()
            r8.f15219d = r4
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L58
            return r0
        L58:
            if (r9 == 0) goto L90
            r5.getClass()
            boolean r0 = r5 instanceof u92.e
            r0 = r0 ^ r4
            java.lang.String r1 = r5.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "requestCache with cache:"
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = " needRemove="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            if (r0 == 0) goto L88
            by1.d r0 = r5.e()
            r1 = 0
            r0.a(r1)
        L88:
            ay1.m r0 = r5.b()
            r0.c(r9)
            goto Laa
        L90:
            ay1.m r9 = r5.b()
            r8.f15219d = r3
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto Laa
            return r0
        L9d:
            ay1.m r9 = r5.b()
            r8.f15219d = r2
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto Laa
            return r0
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ay1.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
