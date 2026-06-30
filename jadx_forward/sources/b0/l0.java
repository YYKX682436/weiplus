package b0;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97933d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97938i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yz5.l lVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97935f = lVar;
        this.f97936g = aVar;
        this.f97937h = aVar2;
        this.f97938i = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.l0 l0Var = new b0.l0(this.f97935f, this.f97936g, this.f97937h, this.f97938i, interfaceC29045xdcb5ca57);
        l0Var.f97934e = obj;
        return l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.l0) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: CancellationException -> 0x0015, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0015, blocks: (B:7:0x0010, B:14:0x0024, B:15:0x0059, B:17:0x005e, B:22:0x004e), top: B:2:0x0008 }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f97933d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: java.util.concurrent.CancellationException -> L15
            goto L84
        L15:
            r12 = move-exception
            goto L87
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            java.lang.Object r1 = r11.f97934e
            p1.a0 r1 = (p1.a0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: java.util.concurrent.CancellationException -> L15
            goto L59
        L28:
            java.lang.Object r1 = r11.f97934e
            p1.a0 r1 = (p1.a0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L4c
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.Object r12 = r11.f97934e
            p1.a0 r12 = (p1.a0) r12
            b0.k0 r1 = new b0.k0
            r1.<init>(r2)
            r11.f97934e = r12
            r11.f97933d = r5
            p1.q0 r12 = (p1.q0) r12
            java.lang.Object r1 = r12.v(r1, r11)
            if (r1 != r0) goto L49
            return r0
        L49:
            r10 = r1
            r1 = r12
            r12 = r10
        L4c:
            p1.s r12 = (p1.s) r12
            r11.f97934e = r1     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f97933d = r4     // Catch: java.util.concurrent.CancellationException -> L15
            java.lang.Object r12 = b0.p0.a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L15
            if (r12 != r0) goto L59
            return r0
        L59:
            r5 = r12
            p1.s r5 = (p1.s) r5     // Catch: java.util.concurrent.CancellationException -> L15
            if (r5 == 0) goto L84
            yz5.l r12 = r11.f97935f     // Catch: java.util.concurrent.CancellationException -> L15
            long r6 = r5.f432414c     // Catch: java.util.concurrent.CancellationException -> L15
            d1.e r4 = new d1.e     // Catch: java.util.concurrent.CancellationException -> L15
            r4.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L15
            r12.mo146xb9724478(r4)     // Catch: java.util.concurrent.CancellationException -> L15
            b0.j0 r12 = new b0.j0     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.a r6 = r11.f97937h     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.a r7 = r11.f97936g     // Catch: java.util.concurrent.CancellationException -> L15
            yz5.p r8 = r11.f97938i     // Catch: java.util.concurrent.CancellationException -> L15
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f97934e = r2     // Catch: java.util.concurrent.CancellationException -> L15
            r11.f97933d = r3     // Catch: java.util.concurrent.CancellationException -> L15
            p1.q0 r1 = (p1.q0) r1     // Catch: java.util.concurrent.CancellationException -> L15
            java.lang.Object r12 = r1.v(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L15
            if (r12 != r0) goto L84
            return r0
        L84:
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        L87:
            yz5.a r0 = r11.f97936g
            r0.mo152xb9724478()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
