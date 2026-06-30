package b0;

/* loaded from: classes14.dex */
public final class s3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f98049e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f98051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f98052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f98053i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(yz5.q qVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, b0.h2 h2Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98051g = qVar;
        this.f98052h = y0Var;
        this.f98053i = h2Var;
        this.f98054m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.s3 s3Var = new b0.s3(this.f98051g, this.f98052h, this.f98053i, this.f98054m, interfaceC29045xdcb5ca57);
        s3Var.f98050f = obj;
        return s3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.s3) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f98049e
            r2 = 2
            b0.h2 r3 = r14.f98053i
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1b
            if (r1 != r2) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L5b
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            java.lang.Object r1 = r14.f98050f
            p1.c r1 = (p1.c) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L37
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Object r15 = r14.f98050f
            r1 = r15
            p1.c r1 = (p1.c) r1
            r14.f98050f = r1
            r14.f98049e = r5
            r15 = 0
            java.lang.Object r15 = b0.d4.b(r1, r15, r14, r5, r4)
            if (r15 != r0) goto L37
            return r0
        L37:
            p1.s r15 = (p1.s) r15
            r15.a()
            yz5.q r6 = b0.d4.f97797a
            yz5.q r7 = r14.f98051g
            if (r7 == r6) goto L50
            kotlinx.coroutines.y0 r8 = r14.f98052h
            r9 = 0
            r10 = 0
            b0.r3 r11 = new b0.r3
            r11.<init>(r7, r3, r15, r4)
            r12 = 3
            r13 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r8, r9, r10, r11, r12, r13)
        L50:
            r14.f98050f = r4
            r14.f98049e = r2
            java.lang.Object r15 = b0.d4.f(r1, r14)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            p1.s r15 = (p1.s) r15
            if (r15 != 0) goto L67
            r3.f97863f = r5
            kotlinx.coroutines.sync.d r15 = r3.f97864g
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(r15, r4, r5, r4)
            goto L7f
        L67:
            r15.a()
            r3.f97862e = r5
            kotlinx.coroutines.sync.d r0 = r3.f97864g
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(r0, r4, r5, r4)
            yz5.l r0 = r14.f98054m
            if (r0 == 0) goto L7f
            d1.e r1 = new d1.e
            long r2 = r15.f432414c
            r1.<init>(r2)
            r0.mo146xb9724478(r1)
        L7f:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
