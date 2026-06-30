package a0;

/* loaded from: classes14.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81815d;

    /* renamed from: e, reason: collision with root package name */
    public int f81816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f81818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(n0.v2 v2Var, c0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81817f = v2Var;
        this.f81818g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a0.s0(this.f81817f, this.f81818g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f81816e
            c0.o r2 = r6.f81818g
            r3 = 2
            r4 = 1
            n0.v2 r5 = r6.f81817f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r6.f81815d
            c0.d r0 = (c0.d) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L62
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r1 = r6.f81815d
            n0.v2 r1 = (n0.v2) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L49
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.Object r7 = r5.mo128745x754a37bb()
            c0.d r7 = (c0.d) r7
            if (r7 == 0) goto L4d
            c0.e r1 = new c0.e
            r1.<init>(r7)
            if (r2 == 0) goto L48
            r6.f81815d = r5
            r6.f81816e = r4
            r7 = r2
            c0.p r7 = (c0.p) r7
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            r1 = r5
        L49:
            r7 = 0
            r1.mo148714x53d8522f(r7)
        L4d:
            c0.d r7 = new c0.d
            r7.<init>()
            if (r2 == 0) goto L63
            r6.f81815d = r7
            r6.f81816e = r3
            c0.p r2 = (c0.p) r2
            java.lang.Object r1 = r2.a(r7, r6)
            if (r1 != r0) goto L61
            return r0
        L61:
            r0 = r7
        L62:
            r7 = r0
        L63:
            r5.mo148714x53d8522f(r7)
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
