package ap1;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12665d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.h1 f12667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ap1.h1 h1Var, ap1.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12667f = h1Var;
        this.f12668g = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ap1.g1 g1Var = new ap1.g1(this.f12667f, this.f12668g, continuation);
        g1Var.f12666e = obj;
        return g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f12665d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r7.f12666e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L36
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f12666e
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            r1 = r8
            r8 = r7
        L23:
            boolean r3 = kotlinx.coroutines.z0.h(r1)
            if (r3 == 0) goto L57
            r8.f12666e = r1
            r8.f12665d = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r3 = kotlinx.coroutines.k1.b(r3, r8)
            if (r3 != r0) goto L36
            return r0
        L36:
            ap1.h1 r3 = r8.f12667f
            java.lang.String r4 = r3.f12674e
            java.lang.String r5 = r3.f12673d
            boolean r5 = kotlin.jvm.internal.o.b(r5, r4)
            if (r5 != 0) goto L23
            boolean r5 = kotlinx.coroutines.z0.h(r1)
            if (r5 == 0) goto L57
            r3.f12673d = r4
            ap1.p1 r3 = r8.f12668g
            ap1.i1 r3 = r3.f12722d
            if (r3 == 0) goto L23
            int[] r5 = ap1.p1.f12721h
            r6 = 0
            r3.s(r4, r5, r6)
            goto L23
        L57:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ap1.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
