package bg2;

/* loaded from: classes2.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.r4 f20603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(bg2.r4 r4Var, bg2.a5 a5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20603e = r4Var;
        this.f20604f = a5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.w4(this.f20603e, this.f20604f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.w4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f20602d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3d
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L32
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            bg2.r4 r9 = r8.f20603e
            long r4 = r9.f20460d
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L3d
            r8.f20602d = r3
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r4, r8)
            if (r9 != r0) goto L32
            return r0
        L32:
            r8.f20602d = r2
            bg2.a5 r9 = r8.f20604f
            java.lang.Object r9 = bg2.a5.Y6(r9, r3, r8)
            if (r9 != r0) goto L3d
            return r0
        L3d:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.w4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
