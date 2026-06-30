package j0;

/* loaded from: classes14.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377921d;

    /* renamed from: e, reason: collision with root package name */
    public int f377922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f377924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f377925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(n0.v2 v2Var, long j17, c0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377923f = v2Var;
        this.f377924g = j17;
        this.f377925h = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j0.j4(this.f377923f, this.f377924g, this.f377925h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.j4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f377922e
            r2 = 0
            c0.o r3 = r9.f377925h
            r4 = 2
            r5 = 1
            n0.v2 r6 = r9.f377923f
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            java.lang.Object r0 = r9.f377921d
            c0.r r0 = (c0.r) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L64
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f377921d
            n0.v2 r1 = (n0.v2) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L4a
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r6.mo128745x754a37bb()
            c0.r r10 = (c0.r) r10
            if (r10 == 0) goto L4d
            c0.q r1 = new c0.q
            r1.<init>(r10)
            if (r3 == 0) goto L49
            r9.f377921d = r6
            r9.f377922e = r5
            r10 = r3
            c0.p r10 = (c0.p) r10
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L49
            return r0
        L49:
            r1 = r6
        L4a:
            r1.mo148714x53d8522f(r2)
        L4d:
            c0.r r10 = new c0.r
            long r7 = r9.f377924g
            r10.<init>(r7, r2)
            if (r3 == 0) goto L65
            r9.f377921d = r10
            r9.f377922e = r4
            c0.p r3 = (c0.p) r3
            java.lang.Object r1 = r3.a(r10, r9)
            if (r1 != r0) goto L63
            return r0
        L63:
            r0 = r10
        L64:
            r10 = r0
        L65:
            r6.mo148714x53d8522f(r10)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
