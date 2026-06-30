package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class d extends p3325xe03a0797.p3326xc267989b.p3328x30012e.f {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f391758h;

    public d(yz5.p pVar, oz5.l lVar, int i17, u26.u uVar) {
        super(pVar, lVar, i17, uVar);
        this.f391758h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [u26.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [u26.r0] */
    @Override // v26.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(u26.r0 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.c
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.c r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.c) r0
            int r1 = r0.f391748g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391748g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.c r0 = new kotlinx.coroutines.flow.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f391746e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391748g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f391745d
            u26.r0 r6 = (u26.r0) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r0.f391745d = r6
            r0.f391748g = r4
            yz5.p r7 = r5.f391778g
            java.lang.Object r7 = r7.mo149xb9724478(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            u26.x r6 = (u26.x) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto L52
            return r3
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.d.f(u26.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.d(this.f391758h, lVar, i17, uVar);
    }
}
