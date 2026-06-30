package bg2;

/* loaded from: classes2.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.t4 f20499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(bg2.t4 t4Var, bg2.a5 a5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20499e = t4Var;
        this.f20500f = a5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.s4(this.f20499e, this.f20500f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.s4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f20498d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3f
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L34
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            bg2.t4 r9 = r8.f20499e
            bg2.r4 r9 = r9.f20521a
            long r4 = r9.f20460d
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L3f
            r8.f20498d = r3
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r4, r8)
            if (r9 != r0) goto L34
            return r0
        L34:
            r8.f20498d = r2
            bg2.a5 r9 = r8.f20500f
            java.lang.Object r9 = bg2.a5.Y6(r9, r3, r8)
            if (r9 != r0) goto L3f
            return r0
        L3f:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
